package com.yandex.go.splash.preload;

import defpackage.cho;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/splash/preload/PreloadSplashAnalytics$MarkedEvents", "Lcho;", "", "Lcom/yandex/go/splash/preload/PreloadSplashAnalytics$MarkedEvents;", "Splash", "HttpRequest", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PreloadSplashAnalytics$MarkedEvents implements cho {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PreloadSplashAnalytics$MarkedEvents[] $VALUES;
    public static final PreloadSplashAnalytics$MarkedEvents HttpRequest;
    public static final PreloadSplashAnalytics$MarkedEvents Splash;

    static {
        PreloadSplashAnalytics$MarkedEvents preloadSplashAnalytics$MarkedEvents = new PreloadSplashAnalytics$MarkedEvents("Splash", 0);
        Splash = preloadSplashAnalytics$MarkedEvents;
        PreloadSplashAnalytics$MarkedEvents preloadSplashAnalytics$MarkedEvents2 = new PreloadSplashAnalytics$MarkedEvents("HttpRequest", 1);
        HttpRequest = preloadSplashAnalytics$MarkedEvents2;
        PreloadSplashAnalytics$MarkedEvents[] preloadSplashAnalytics$MarkedEventsArr = {preloadSplashAnalytics$MarkedEvents, preloadSplashAnalytics$MarkedEvents2};
        $VALUES = preloadSplashAnalytics$MarkedEventsArr;
        $ENTRIES = kotlin.enums.a.a(preloadSplashAnalytics$MarkedEventsArr);
    }

    public static PreloadSplashAnalytics$MarkedEvents valueOf(String str) {
        return (PreloadSplashAnalytics$MarkedEvents) Enum.valueOf(PreloadSplashAnalytics$MarkedEvents.class, str);
    }

    public static PreloadSplashAnalytics$MarkedEvents[] values() {
        return (PreloadSplashAnalytics$MarkedEvents[]) $VALUES.clone();
    }
}
