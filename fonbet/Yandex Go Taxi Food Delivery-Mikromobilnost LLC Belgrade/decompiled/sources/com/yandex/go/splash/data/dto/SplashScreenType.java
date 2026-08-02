package com.yandex.go.splash.data.dto;

import defpackage.fet0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.srt0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/splash/data/dto/SplashScreenType;", "", "Companion", "srt0", "DYNAMIC_PROMO", "INSTANTLY_HIDE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SplashScreenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SplashScreenType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final srt0 Companion;
    public static final SplashScreenType DYNAMIC_PROMO;
    public static final SplashScreenType INSTANTLY_HIDE;

    static {
        SplashScreenType splashScreenType = new SplashScreenType("DYNAMIC_PROMO", 0);
        DYNAMIC_PROMO = splashScreenType;
        SplashScreenType splashScreenType2 = new SplashScreenType("INSTANTLY_HIDE", 1);
        INSTANTLY_HIDE = splashScreenType2;
        SplashScreenType[] splashScreenTypeArr = {splashScreenType, splashScreenType2};
        $VALUES = splashScreenTypeArr;
        $ENTRIES = kotlin.enums.a.a(splashScreenTypeArr);
        Companion = new srt0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fet0(9));
    }

    public static SplashScreenType valueOf(String str) {
        return (SplashScreenType) Enum.valueOf(SplashScreenType.class, str);
    }

    public static SplashScreenType[] values() {
        return (SplashScreenType[]) $VALUES.clone();
    }
}
