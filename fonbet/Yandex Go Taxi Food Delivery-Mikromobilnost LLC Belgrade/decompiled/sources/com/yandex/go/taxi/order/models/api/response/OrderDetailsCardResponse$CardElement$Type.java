package com.yandex.go.taxi.order.models.api.response;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/yandex/go/taxi/order/models/api/response/OrderDetailsCardResponse$CardElement$Type", "", "Lcom/yandex/go/taxi/order/models/api/response/OrderDetailsCardResponse$CardElement$Type;", "UNKNOWN", "SOURCE", "ADD_ROUTE_POINT", "ROUTE_POINT", "ADD_DESTINATION", "DESTINATION", "PAYMENT_METHOD", "RIDE_SUPPORT", "DETAILS", "CANCEL", "SECTION_DETAIL", "USER_REQUIREMENT", "COMPLETE_BUTTON", "DRIVER_PHONE_NUMBER", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderDetailsCardResponse$CardElement$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderDetailsCardResponse$CardElement$Type[] $VALUES;
    public static final OrderDetailsCardResponse$CardElement$Type ADD_DESTINATION;
    public static final OrderDetailsCardResponse$CardElement$Type ADD_ROUTE_POINT;
    public static final OrderDetailsCardResponse$CardElement$Type CANCEL;
    public static final OrderDetailsCardResponse$CardElement$Type COMPLETE_BUTTON;
    public static final OrderDetailsCardResponse$CardElement$Type DESTINATION;
    public static final OrderDetailsCardResponse$CardElement$Type DETAILS;
    public static final OrderDetailsCardResponse$CardElement$Type DRIVER_PHONE_NUMBER;
    public static final OrderDetailsCardResponse$CardElement$Type PAYMENT_METHOD;
    public static final OrderDetailsCardResponse$CardElement$Type RIDE_SUPPORT;
    public static final OrderDetailsCardResponse$CardElement$Type ROUTE_POINT;
    public static final OrderDetailsCardResponse$CardElement$Type SECTION_DETAIL;
    public static final OrderDetailsCardResponse$CardElement$Type SOURCE;
    public static final OrderDetailsCardResponse$CardElement$Type UNKNOWN;
    public static final OrderDetailsCardResponse$CardElement$Type USER_REQUIREMENT;

    static {
        OrderDetailsCardResponse$CardElement$Type orderDetailsCardResponse$CardElement$Type = new OrderDetailsCardResponse$CardElement$Type("UNKNOWN", 0);
        UNKNOWN = orderDetailsCardResponse$CardElement$Type;
        OrderDetailsCardResponse$CardElement$Type orderDetailsCardResponse$CardElement$Type2 = new OrderDetailsCardResponse$CardElement$Type("SOURCE", 1);
        SOURCE = orderDetailsCardResponse$CardElement$Type2;
        OrderDetailsCardResponse$CardElement$Type orderDetailsCardResponse$CardElement$Type3 = new OrderDetailsCardResponse$CardElement$Type("ADD_ROUTE_POINT", 2);
        ADD_ROUTE_POINT = orderDetailsCardResponse$CardElement$Type3;
        OrderDetailsCardResponse$CardElement$Type orderDetailsCardResponse$CardElement$Type4 = new OrderDetailsCardResponse$CardElement$Type("ROUTE_POINT", 3);
        ROUTE_POINT = orderDetailsCardResponse$CardElement$Type4;
        OrderDetailsCardResponse$CardElement$Type orderDetailsCardResponse$CardElement$Type5 = new OrderDetailsCardResponse$CardElement$Type("ADD_DESTINATION", 4);
        ADD_DESTINATION = orderDetailsCardResponse$CardElement$Type5;
        OrderDetailsCardResponse$CardElement$Type orderDetailsCardResponse$CardElement$Type6 = new OrderDetailsCardResponse$CardElement$Type("DESTINATION", 5);
        DESTINATION = orderDetailsCardResponse$CardElement$Type6;
        OrderDetailsCardResponse$CardElement$Type orderDetailsCardResponse$CardElement$Type7 = new OrderDetailsCardResponse$CardElement$Type("PAYMENT_METHOD", 6);
        PAYMENT_METHOD = orderDetailsCardResponse$CardElement$Type7;
        OrderDetailsCardResponse$CardElement$Type orderDetailsCardResponse$CardElement$Type8 = new OrderDetailsCardResponse$CardElement$Type("RIDE_SUPPORT", 7);
        RIDE_SUPPORT = orderDetailsCardResponse$CardElement$Type8;
        OrderDetailsCardResponse$CardElement$Type orderDetailsCardResponse$CardElement$Type9 = new OrderDetailsCardResponse$CardElement$Type("DETAILS", 8);
        DETAILS = orderDetailsCardResponse$CardElement$Type9;
        OrderDetailsCardResponse$CardElement$Type orderDetailsCardResponse$CardElement$Type10 = new OrderDetailsCardResponse$CardElement$Type("CANCEL", 9);
        CANCEL = orderDetailsCardResponse$CardElement$Type10;
        OrderDetailsCardResponse$CardElement$Type orderDetailsCardResponse$CardElement$Type11 = new OrderDetailsCardResponse$CardElement$Type("SECTION_DETAIL", 10);
        SECTION_DETAIL = orderDetailsCardResponse$CardElement$Type11;
        OrderDetailsCardResponse$CardElement$Type orderDetailsCardResponse$CardElement$Type12 = new OrderDetailsCardResponse$CardElement$Type("USER_REQUIREMENT", 11);
        USER_REQUIREMENT = orderDetailsCardResponse$CardElement$Type12;
        OrderDetailsCardResponse$CardElement$Type orderDetailsCardResponse$CardElement$Type13 = new OrderDetailsCardResponse$CardElement$Type("COMPLETE_BUTTON", 12);
        COMPLETE_BUTTON = orderDetailsCardResponse$CardElement$Type13;
        OrderDetailsCardResponse$CardElement$Type orderDetailsCardResponse$CardElement$Type14 = new OrderDetailsCardResponse$CardElement$Type("DRIVER_PHONE_NUMBER", 13);
        DRIVER_PHONE_NUMBER = orderDetailsCardResponse$CardElement$Type14;
        OrderDetailsCardResponse$CardElement$Type[] orderDetailsCardResponse$CardElement$TypeArr = {orderDetailsCardResponse$CardElement$Type, orderDetailsCardResponse$CardElement$Type2, orderDetailsCardResponse$CardElement$Type3, orderDetailsCardResponse$CardElement$Type4, orderDetailsCardResponse$CardElement$Type5, orderDetailsCardResponse$CardElement$Type6, orderDetailsCardResponse$CardElement$Type7, orderDetailsCardResponse$CardElement$Type8, orderDetailsCardResponse$CardElement$Type9, orderDetailsCardResponse$CardElement$Type10, orderDetailsCardResponse$CardElement$Type11, orderDetailsCardResponse$CardElement$Type12, orderDetailsCardResponse$CardElement$Type13, orderDetailsCardResponse$CardElement$Type14};
        $VALUES = orderDetailsCardResponse$CardElement$TypeArr;
        $ENTRIES = kotlin.enums.a.a(orderDetailsCardResponse$CardElement$TypeArr);
    }

    public static OrderDetailsCardResponse$CardElement$Type valueOf(String str) {
        return (OrderDetailsCardResponse$CardElement$Type) Enum.valueOf(OrderDetailsCardResponse$CardElement$Type.class, str);
    }

    public static OrderDetailsCardResponse$CardElement$Type[] values() {
        return (OrderDetailsCardResponse$CardElement$Type[]) $VALUES.clone();
    }
}
