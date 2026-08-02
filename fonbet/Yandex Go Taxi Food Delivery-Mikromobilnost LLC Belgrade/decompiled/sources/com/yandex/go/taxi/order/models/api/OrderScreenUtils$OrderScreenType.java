package com.yandex.go.taxi.order.models.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/OrderScreenUtils$OrderScreenType", "", "Lcom/yandex/go/taxi/order/models/api/OrderScreenUtils$OrderScreenType;", "TAXI", "FEED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderScreenUtils$OrderScreenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderScreenUtils$OrderScreenType[] $VALUES;
    public static final OrderScreenUtils$OrderScreenType FEED;
    public static final OrderScreenUtils$OrderScreenType TAXI;

    static {
        OrderScreenUtils$OrderScreenType orderScreenUtils$OrderScreenType = new OrderScreenUtils$OrderScreenType("TAXI", 0);
        TAXI = orderScreenUtils$OrderScreenType;
        OrderScreenUtils$OrderScreenType orderScreenUtils$OrderScreenType2 = new OrderScreenUtils$OrderScreenType("FEED", 1);
        FEED = orderScreenUtils$OrderScreenType2;
        OrderScreenUtils$OrderScreenType[] orderScreenUtils$OrderScreenTypeArr = {orderScreenUtils$OrderScreenType, orderScreenUtils$OrderScreenType2};
        $VALUES = orderScreenUtils$OrderScreenTypeArr;
        $ENTRIES = kotlin.enums.a.a(orderScreenUtils$OrderScreenTypeArr);
    }

    public static OrderScreenUtils$OrderScreenType valueOf(String str) {
        return (OrderScreenUtils$OrderScreenType) Enum.valueOf(OrderScreenUtils$OrderScreenType.class, str);
    }

    public static OrderScreenUtils$OrderScreenType[] values() {
        return (OrderScreenUtils$OrderScreenType[]) $VALUES.clone();
    }
}
