package com.yandex.go.taxi.order.models.api.screen;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/screen/OrderScreen;", "", "ORDER_LIST", "ORDER_DETAILS", "ORDER_TRACKING", "LINKED_ORDER_DETAILS", "BUNDLED_ORDER_DETAILS", "DELEGATE_TO_NAV_COMMAND", "AMBULANCE_LINKED_ORDER", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderScreen[] $VALUES;
    public static final OrderScreen AMBULANCE_LINKED_ORDER;
    public static final OrderScreen BUNDLED_ORDER_DETAILS;
    public static final OrderScreen DELEGATE_TO_NAV_COMMAND;
    public static final OrderScreen LINKED_ORDER_DETAILS;
    public static final OrderScreen ORDER_DETAILS;
    public static final OrderScreen ORDER_LIST;
    public static final OrderScreen ORDER_TRACKING;

    static {
        OrderScreen orderScreen = new OrderScreen("ORDER_LIST", 0);
        ORDER_LIST = orderScreen;
        OrderScreen orderScreen2 = new OrderScreen("ORDER_DETAILS", 1);
        ORDER_DETAILS = orderScreen2;
        OrderScreen orderScreen3 = new OrderScreen("ORDER_TRACKING", 2);
        ORDER_TRACKING = orderScreen3;
        OrderScreen orderScreen4 = new OrderScreen("LINKED_ORDER_DETAILS", 3);
        LINKED_ORDER_DETAILS = orderScreen4;
        OrderScreen orderScreen5 = new OrderScreen("BUNDLED_ORDER_DETAILS", 4);
        BUNDLED_ORDER_DETAILS = orderScreen5;
        OrderScreen orderScreen6 = new OrderScreen("DELEGATE_TO_NAV_COMMAND", 5);
        DELEGATE_TO_NAV_COMMAND = orderScreen6;
        OrderScreen orderScreen7 = new OrderScreen("AMBULANCE_LINKED_ORDER", 6);
        AMBULANCE_LINKED_ORDER = orderScreen7;
        OrderScreen[] orderScreenArr = {orderScreen, orderScreen2, orderScreen3, orderScreen4, orderScreen5, orderScreen6, orderScreen7};
        $VALUES = orderScreenArr;
        $ENTRIES = a.a(orderScreenArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static OrderScreen valueOf(String str) {
        return (OrderScreen) Enum.valueOf(OrderScreen.class, str);
    }

    public static OrderScreen[] values() {
        return (OrderScreen[]) $VALUES.clone();
    }
}
