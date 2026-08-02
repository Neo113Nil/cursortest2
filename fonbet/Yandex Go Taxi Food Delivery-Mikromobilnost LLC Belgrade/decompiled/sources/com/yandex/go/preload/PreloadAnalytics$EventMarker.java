package com.yandex.go.preload;

import defpackage.cho;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/preload/PreloadAnalytics$EventMarker", "Lcho;", "", "Lcom/yandex/go/preload/PreloadAnalytics$EventMarker;", "WAITING", "WAITING_FOR_SPLASH_CAN_CLOSE", "WAITING_FOR_SPLASH_CLOSED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PreloadAnalytics$EventMarker implements cho {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PreloadAnalytics$EventMarker[] $VALUES;
    public static final PreloadAnalytics$EventMarker WAITING;
    public static final PreloadAnalytics$EventMarker WAITING_FOR_SPLASH_CAN_CLOSE;
    public static final PreloadAnalytics$EventMarker WAITING_FOR_SPLASH_CLOSED;

    static {
        PreloadAnalytics$EventMarker preloadAnalytics$EventMarker = new PreloadAnalytics$EventMarker("WAITING", 0);
        WAITING = preloadAnalytics$EventMarker;
        PreloadAnalytics$EventMarker preloadAnalytics$EventMarker2 = new PreloadAnalytics$EventMarker("WAITING_FOR_SPLASH_CAN_CLOSE", 1);
        WAITING_FOR_SPLASH_CAN_CLOSE = preloadAnalytics$EventMarker2;
        PreloadAnalytics$EventMarker preloadAnalytics$EventMarker3 = new PreloadAnalytics$EventMarker("WAITING_FOR_SPLASH_CLOSED", 2);
        WAITING_FOR_SPLASH_CLOSED = preloadAnalytics$EventMarker3;
        PreloadAnalytics$EventMarker[] preloadAnalytics$EventMarkerArr = {preloadAnalytics$EventMarker, preloadAnalytics$EventMarker2, preloadAnalytics$EventMarker3};
        $VALUES = preloadAnalytics$EventMarkerArr;
        $ENTRIES = kotlin.enums.a.a(preloadAnalytics$EventMarkerArr);
    }

    public static PreloadAnalytics$EventMarker valueOf(String str) {
        return (PreloadAnalytics$EventMarker) Enum.valueOf(PreloadAnalytics$EventMarker.class, str);
    }

    public static PreloadAnalytics$EventMarker[] values() {
        return (PreloadAnalytics$EventMarker[]) $VALUES.clone();
    }
}
