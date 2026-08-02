package com.yandex.go.preorder.deeplinks.route;

import defpackage.k4o;
import defpackage.s1l0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/preorder/deeplinks/route/RouteData$Continuation", "", "Lcom/yandex/go/preorder/deeplinks/route/RouteData$Continuation;", "Companion", "s1l0", "SCHEDULE_RIDE", "SELECT_COPTER_CITY_TOUR", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RouteData$Continuation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RouteData$Continuation[] $VALUES;
    private static final String CONTINUATION_SCHEDULE_RIDE = "scheduleride";
    private static final String CONTINUATION_SELECT_COPTER_CITY_TOUR = "select_copter_city_tour";
    public static final s1l0 Companion;
    public static final RouteData$Continuation SCHEDULE_RIDE;
    public static final RouteData$Continuation SELECT_COPTER_CITY_TOUR;

    static {
        RouteData$Continuation routeData$Continuation = new RouteData$Continuation("SCHEDULE_RIDE", 0);
        SCHEDULE_RIDE = routeData$Continuation;
        RouteData$Continuation routeData$Continuation2 = new RouteData$Continuation("SELECT_COPTER_CITY_TOUR", 1);
        SELECT_COPTER_CITY_TOUR = routeData$Continuation2;
        RouteData$Continuation[] routeData$ContinuationArr = {routeData$Continuation, routeData$Continuation2};
        $VALUES = routeData$ContinuationArr;
        $ENTRIES = kotlin.enums.a.a(routeData$ContinuationArr);
        Companion = new s1l0();
    }

    public static RouteData$Continuation valueOf(String str) {
        return (RouteData$Continuation) Enum.valueOf(RouteData$Continuation.class, str);
    }

    public static RouteData$Continuation[] values() {
        return (RouteData$Continuation[]) $VALUES.clone();
    }
}
