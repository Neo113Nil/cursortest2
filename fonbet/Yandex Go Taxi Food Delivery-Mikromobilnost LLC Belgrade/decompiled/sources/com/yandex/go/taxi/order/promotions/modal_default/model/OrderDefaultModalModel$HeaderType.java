package com.yandex.go.taxi.order.promotions.modal_default.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/promotions/modal_default/model/OrderDefaultModalModel$HeaderType", "", "Lcom/yandex/go/taxi/order/promotions/modal_default/model/OrderDefaultModalModel$HeaderType;", "DEFAULT", "PROMINENT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderDefaultModalModel$HeaderType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderDefaultModalModel$HeaderType[] $VALUES;
    public static final OrderDefaultModalModel$HeaderType DEFAULT;
    public static final OrderDefaultModalModel$HeaderType PROMINENT;

    static {
        OrderDefaultModalModel$HeaderType orderDefaultModalModel$HeaderType = new OrderDefaultModalModel$HeaderType("DEFAULT", 0);
        DEFAULT = orderDefaultModalModel$HeaderType;
        OrderDefaultModalModel$HeaderType orderDefaultModalModel$HeaderType2 = new OrderDefaultModalModel$HeaderType("PROMINENT", 1);
        PROMINENT = orderDefaultModalModel$HeaderType2;
        OrderDefaultModalModel$HeaderType[] orderDefaultModalModel$HeaderTypeArr = {orderDefaultModalModel$HeaderType, orderDefaultModalModel$HeaderType2};
        $VALUES = orderDefaultModalModel$HeaderTypeArr;
        $ENTRIES = a.a(orderDefaultModalModel$HeaderTypeArr);
    }

    public static OrderDefaultModalModel$HeaderType valueOf(String str) {
        return (OrderDefaultModalModel$HeaderType) Enum.valueOf(OrderDefaultModalModel$HeaderType.class, str);
    }

    public static OrderDefaultModalModel$HeaderType[] values() {
        return (OrderDefaultModalModel$HeaderType[]) $VALUES.clone();
    }
}
