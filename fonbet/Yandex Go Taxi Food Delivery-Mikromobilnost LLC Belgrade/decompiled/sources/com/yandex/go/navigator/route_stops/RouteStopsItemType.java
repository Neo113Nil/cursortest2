package com.yandex.go.navigator.route_stops;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/navigator/route_stops/RouteStopsItemType;", "", "", "id", CA20Status.STATUS_USER_I, "getId", "()I", IDialogId.INTENT_EXTRA_IN_HEADER, "ROUTE", "BUTTON", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RouteStopsItemType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RouteStopsItemType[] $VALUES;
    public static final RouteStopsItemType BUTTON;
    public static final RouteStopsItemType HEADER;
    public static final RouteStopsItemType ROUTE;
    private final int id;

    static {
        RouteStopsItemType routeStopsItemType = new RouteStopsItemType(IDialogId.INTENT_EXTRA_IN_HEADER, 0, 0);
        HEADER = routeStopsItemType;
        RouteStopsItemType routeStopsItemType2 = new RouteStopsItemType("ROUTE", 1, 1);
        ROUTE = routeStopsItemType2;
        RouteStopsItemType routeStopsItemType3 = new RouteStopsItemType("BUTTON", 2, 2);
        BUTTON = routeStopsItemType3;
        RouteStopsItemType[] routeStopsItemTypeArr = {routeStopsItemType, routeStopsItemType2, routeStopsItemType3};
        $VALUES = routeStopsItemTypeArr;
        $ENTRIES = kotlin.enums.a.a(routeStopsItemTypeArr);
    }

    public RouteStopsItemType(String str, int i, int i2) {
        this.id = i2;
    }

    public static RouteStopsItemType valueOf(String str) {
        return (RouteStopsItemType) Enum.valueOf(RouteStopsItemType.class, str);
    }

    public static RouteStopsItemType[] values() {
        return (RouteStopsItemType[]) $VALUES.clone();
    }
}
