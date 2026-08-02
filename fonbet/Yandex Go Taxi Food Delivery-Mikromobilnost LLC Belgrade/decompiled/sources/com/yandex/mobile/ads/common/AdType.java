package com.yandex.mobile.ads.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/mobile/ads/common/AdType;", "", "BANNER", "INTERSTITIAL", "REWARDED", "NATIVE", "APP_OPEN_AD", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdType {
    public static final AdType APP_OPEN_AD;
    public static final AdType BANNER;
    public static final AdType INTERSTITIAL;
    public static final AdType NATIVE;
    public static final AdType REWARDED;
    private static final /* synthetic */ AdType[] b;
    private static final /* synthetic */ k4o c;

    static {
        AdType adType = new AdType("BANNER", 0);
        BANNER = adType;
        AdType adType2 = new AdType("INTERSTITIAL", 1);
        INTERSTITIAL = adType2;
        AdType adType3 = new AdType("REWARDED", 2);
        REWARDED = adType3;
        AdType adType4 = new AdType("NATIVE", 3);
        NATIVE = adType4;
        AdType adType5 = new AdType("APP_OPEN_AD", 4);
        APP_OPEN_AD = adType5;
        AdType[] adTypeArr = {adType, adType2, adType3, adType4, adType5};
        b = adTypeArr;
        c = a.a(adTypeArr);
    }

    private AdType(String str, int i) {
    }

    public static AdType valueOf(String str) {
        return (AdType) Enum.valueOf(AdType.class, str);
    }

    public static AdType[] values() {
        return (AdType[]) b.clone();
    }
}
