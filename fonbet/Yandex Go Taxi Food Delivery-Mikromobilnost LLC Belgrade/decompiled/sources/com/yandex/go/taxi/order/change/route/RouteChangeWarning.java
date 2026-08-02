package com.yandex.go.taxi.order.change.route;

import defpackage.k4o;
import defpackage.kyh0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/taxi/order/change/route/RouteChangeWarning;", "", "", "title", CA20Status.STATUS_USER_I, "b", "()I", Constants.KEY_MESSAGE, "a", "CHANGE_DESTINATION", "ADD_ROUTE_POINT", "CHANGE_ROUTE_POINT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RouteChangeWarning {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RouteChangeWarning[] $VALUES;
    public static final RouteChangeWarning ADD_ROUTE_POINT;
    public static final RouteChangeWarning CHANGE_DESTINATION;
    public static final RouteChangeWarning CHANGE_ROUTE_POINT;
    private final int message;
    private final int title;

    static {
        int i = kyh0.change_cost_warning_title;
        int i2 = kyh0.change_destination_warning;
        RouteChangeWarning routeChangeWarning = new RouteChangeWarning("CHANGE_DESTINATION", 0, i, i2);
        CHANGE_DESTINATION = routeChangeWarning;
        RouteChangeWarning routeChangeWarning2 = new RouteChangeWarning("ADD_ROUTE_POINT", 1, i, kyh0.add_route_point_warning);
        ADD_ROUTE_POINT = routeChangeWarning2;
        RouteChangeWarning routeChangeWarning3 = new RouteChangeWarning("CHANGE_ROUTE_POINT", 2, i, i2);
        CHANGE_ROUTE_POINT = routeChangeWarning3;
        RouteChangeWarning[] routeChangeWarningArr = {routeChangeWarning, routeChangeWarning2, routeChangeWarning3};
        $VALUES = routeChangeWarningArr;
        $ENTRIES = a.a(routeChangeWarningArr);
    }

    public RouteChangeWarning(String str, int i, int i2, int i3) {
        this.title = i2;
        this.message = i3;
    }

    public static RouteChangeWarning valueOf(String str) {
        return (RouteChangeWarning) Enum.valueOf(RouteChangeWarning.class, str);
    }

    public static RouteChangeWarning[] values() {
        return (RouteChangeWarning[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getMessage() {
        return this.message;
    }

    /* renamed from: b, reason: from getter */
    public final int getTitle() {
        return this.title;
    }
}
