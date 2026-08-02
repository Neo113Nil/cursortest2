package com.yandex.go.taxi.order.api.change.destination;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/api/change/destination/RouteChangeType;", "", "CHANGE_DESTINATION", "ADD_MID_POINT", "CHANGE_MID_POINT", "DELETE_MID_POINT", "CHANGE_DESTINATIONS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RouteChangeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RouteChangeType[] $VALUES;
    public static final RouteChangeType ADD_MID_POINT;
    public static final RouteChangeType CHANGE_DESTINATION;
    public static final RouteChangeType CHANGE_DESTINATIONS;
    public static final RouteChangeType CHANGE_MID_POINT;
    public static final RouteChangeType DELETE_MID_POINT;

    static {
        RouteChangeType routeChangeType = new RouteChangeType("CHANGE_DESTINATION", 0);
        CHANGE_DESTINATION = routeChangeType;
        RouteChangeType routeChangeType2 = new RouteChangeType("ADD_MID_POINT", 1);
        ADD_MID_POINT = routeChangeType2;
        RouteChangeType routeChangeType3 = new RouteChangeType("CHANGE_MID_POINT", 2);
        CHANGE_MID_POINT = routeChangeType3;
        RouteChangeType routeChangeType4 = new RouteChangeType("DELETE_MID_POINT", 3);
        DELETE_MID_POINT = routeChangeType4;
        RouteChangeType routeChangeType5 = new RouteChangeType("CHANGE_DESTINATIONS", 4);
        CHANGE_DESTINATIONS = routeChangeType5;
        RouteChangeType[] routeChangeTypeArr = {routeChangeType, routeChangeType2, routeChangeType3, routeChangeType4, routeChangeType5};
        $VALUES = routeChangeTypeArr;
        $ENTRIES = a.a(routeChangeTypeArr);
    }

    public static RouteChangeType valueOf(String str) {
        return (RouteChangeType) Enum.valueOf(RouteChangeType.class, str);
    }

    public static RouteChangeType[] values() {
        return (RouteChangeType[]) $VALUES.clone();
    }
}
