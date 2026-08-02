package com.yandex.go.masstransit.sdk.ble.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/masstransit/sdk/ble/api/analytics/RouteOptionsButtonAction;", "", "Back", "GoToSettings", "QrPay", "Transport", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RouteOptionsButtonAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RouteOptionsButtonAction[] $VALUES;
    public static final RouteOptionsButtonAction Back;
    public static final RouteOptionsButtonAction GoToSettings;
    public static final RouteOptionsButtonAction QrPay;
    public static final RouteOptionsButtonAction Transport;

    static {
        RouteOptionsButtonAction routeOptionsButtonAction = new RouteOptionsButtonAction("Back", 0);
        Back = routeOptionsButtonAction;
        RouteOptionsButtonAction routeOptionsButtonAction2 = new RouteOptionsButtonAction("GoToSettings", 1);
        GoToSettings = routeOptionsButtonAction2;
        RouteOptionsButtonAction routeOptionsButtonAction3 = new RouteOptionsButtonAction("QrPay", 2);
        QrPay = routeOptionsButtonAction3;
        RouteOptionsButtonAction routeOptionsButtonAction4 = new RouteOptionsButtonAction("Transport", 3);
        Transport = routeOptionsButtonAction4;
        RouteOptionsButtonAction[] routeOptionsButtonActionArr = {routeOptionsButtonAction, routeOptionsButtonAction2, routeOptionsButtonAction3, routeOptionsButtonAction4};
        $VALUES = routeOptionsButtonActionArr;
        $ENTRIES = a.a(routeOptionsButtonActionArr);
    }

    public static RouteOptionsButtonAction valueOf(String str) {
        return (RouteOptionsButtonAction) Enum.valueOf(RouteOptionsButtonAction.class, str);
    }

    public static RouteOptionsButtonAction[] values() {
        return (RouteOptionsButtonAction[]) $VALUES.clone();
    }
}
