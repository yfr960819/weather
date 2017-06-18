package com.kang.weatherwebservice;

import java.util.List;

import org.ksoap2.serialization.SoapObject;

import android.test.AndroidTestCase;

import com.kang.net.WebServiceUtil;

public class WebServiceUtilTest extends AndroidTestCase
{

	public void testGetProvinceList()
	{

		List<String> list = WebServiceUtil.getProvinceList();

		System.out.println(list);

	}

	public void testGetCityListByProvince()
	{

		List<String> list = WebServiceUtil.getCityListByProvince("江苏");
		
		System.out.println(list);
	}
	
	public void testGetWeatherByCity(){
		
		SoapObject soapObject = WebServiceUtil.getWeatherByCity("无锡");
		
		System.out.println(soapObject);
		
		
		
	}

}
