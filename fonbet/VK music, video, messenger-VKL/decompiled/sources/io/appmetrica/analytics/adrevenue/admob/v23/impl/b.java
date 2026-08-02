package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdapterResponseInfo;
import com.google.android.gms.ads.ResponseInfo;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.hq;

/* loaded from: classes8.dex */
public final class b {
    public static ModuleAdRevenue a(AdValue adValue, ModuleAdType moduleAdType, String str, ResponseInfo responseInfo, String str2) {
        AdapterResponseInfo loadedAdapterResponseInfo;
        double finiteDoubleOrDefault = WrapUtils.getFiniteDoubleOrDefault(adValue.getValueMicros() / 1000000.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        String str3 = "PRECISE";
        if (responseInfo != null && (loadedAdapterResponseInfo = responseInfo.getLoadedAdapterResponseInfo()) != null) {
            BigDecimal valueOf = BigDecimal.valueOf(finiteDoubleOrDefault);
            Currency currency = Currency.getInstance(adValue.getCurrencyCode());
            String adapterClassName = loadedAdapterResponseInfo.getAdapterClassName();
            String adSourceInstanceId = loadedAdapterResponseInfo.getAdSourceInstanceId();
            String adSourceInstanceName = loadedAdapterResponseInfo.getAdSourceInstanceName();
            int precisionType = adValue.getPrecisionType();
            String str4 = precisionType == 0 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : precisionType == 1 ? "ESTIMATED" : precisionType == 2 ? "PUBLISHER_PROVIDED" : precisionType == 3 ? "PRECISE" : "";
            HashMap a = hq.a(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, str, AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-admob-v23");
            a.put("source", InneractiveMediationNameConsts.ADMOB);
            return new ModuleAdRevenue(valueOf, currency, moduleAdType, adapterClassName, str2, null, adSourceInstanceId, adSourceInstanceName, str4, a, false);
        }
        BigDecimal valueOf2 = BigDecimal.valueOf(finiteDoubleOrDefault);
        Currency currency2 = Currency.getInstance(adValue.getCurrencyCode());
        int precisionType2 = adValue.getPrecisionType();
        if (precisionType2 == 0) {
            str3 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        } else if (precisionType2 == 1) {
            str3 = "ESTIMATED";
        } else if (precisionType2 == 2) {
            str3 = "PUBLISHER_PROVIDED";
        } else if (precisionType2 != 3) {
            str3 = "";
        }
        HashMap a2 = hq.a(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, str, AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-admob-v23");
        a2.put("source", InneractiveMediationNameConsts.ADMOB);
        return new ModuleAdRevenue(valueOf2, currency2, moduleAdType, null, str2, null, null, null, str3, a2, false);
    }
}
