package com.yandex.go.taxi.order.details.v1.style;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/details/v1/style/OrderDetailsStyleState;", "", "DETAILS_STYLE_V1", "DETAILS_STYLE_V2", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderDetailsStyleState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderDetailsStyleState[] $VALUES;
    public static final OrderDetailsStyleState DETAILS_STYLE_V1;
    public static final OrderDetailsStyleState DETAILS_STYLE_V2;

    static {
        OrderDetailsStyleState orderDetailsStyleState = new OrderDetailsStyleState("DETAILS_STYLE_V1", 0);
        DETAILS_STYLE_V1 = orderDetailsStyleState;
        OrderDetailsStyleState orderDetailsStyleState2 = new OrderDetailsStyleState("DETAILS_STYLE_V2", 1);
        DETAILS_STYLE_V2 = orderDetailsStyleState2;
        OrderDetailsStyleState[] orderDetailsStyleStateArr = {orderDetailsStyleState, orderDetailsStyleState2};
        $VALUES = orderDetailsStyleStateArr;
        $ENTRIES = a.a(orderDetailsStyleStateArr);
    }

    public static OrderDetailsStyleState valueOf(String str) {
        return (OrderDetailsStyleState) Enum.valueOf(OrderDetailsStyleState.class, str);
    }

    public static OrderDetailsStyleState[] values() {
        return (OrderDetailsStyleState[]) $VALUES.clone();
    }
}
