package com.yandex.mobile.ads.common;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class AdType {
    public static final AdType APP_OPEN_AD;
    public static final AdType BANNER;
    public static final AdType INTERSTITIAL;
    public static final AdType NATIVE;
    public static final AdType REWARDED;
    public static final AdType UNKNOWN;
    private static final /* synthetic */ AdType[] b;
    private static final /* synthetic */ zrp c;

    static {
        AdType adType = new AdType(0, GrsBaseInfo.CountryCodeSource.UNKNOWN);
        UNKNOWN = adType;
        AdType adType2 = new AdType(1, "BANNER");
        BANNER = adType2;
        AdType adType3 = new AdType(2, "INTERSTITIAL");
        INTERSTITIAL = adType3;
        AdType adType4 = new AdType(3, "REWARDED");
        REWARDED = adType4;
        AdType adType5 = new AdType(4, "NATIVE");
        NATIVE = adType5;
        AdType adType6 = new AdType(5, "APP_OPEN_AD");
        APP_OPEN_AD = adType6;
        AdType[] adTypeArr = {adType, adType2, adType3, adType4, adType5, adType6};
        b = adTypeArr;
        c = new asp(adTypeArr);
    }

    private AdType(int i, String str) {
    }

    public static AdType valueOf(String str) {
        return (AdType) Enum.valueOf(AdType.class, str);
    }

    public static AdType[] values() {
        return (AdType[]) b.clone();
    }
}
