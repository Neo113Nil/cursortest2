package com.yandex.go.superapp.order_tracking.api.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/superapp/order_tracking/api/data/OrderTrackingService$External$PreferredTrackingType", "", "Lcom/yandex/go/superapp/order_tracking/api/data/OrderTrackingService$External$PreferredTrackingType;", "FEED", "BLANK", "WEB", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OrderTrackingService$External$PreferredTrackingType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderTrackingService$External$PreferredTrackingType[] $VALUES;
    public static final OrderTrackingService$External$PreferredTrackingType BLANK;
    public static final OrderTrackingService$External$PreferredTrackingType FEED;
    public static final OrderTrackingService$External$PreferredTrackingType WEB;

    static {
        OrderTrackingService$External$PreferredTrackingType orderTrackingService$External$PreferredTrackingType = new OrderTrackingService$External$PreferredTrackingType("FEED", 0);
        FEED = orderTrackingService$External$PreferredTrackingType;
        OrderTrackingService$External$PreferredTrackingType orderTrackingService$External$PreferredTrackingType2 = new OrderTrackingService$External$PreferredTrackingType("BLANK", 1);
        BLANK = orderTrackingService$External$PreferredTrackingType2;
        OrderTrackingService$External$PreferredTrackingType orderTrackingService$External$PreferredTrackingType3 = new OrderTrackingService$External$PreferredTrackingType("WEB", 2);
        WEB = orderTrackingService$External$PreferredTrackingType3;
        OrderTrackingService$External$PreferredTrackingType[] orderTrackingService$External$PreferredTrackingTypeArr = {orderTrackingService$External$PreferredTrackingType, orderTrackingService$External$PreferredTrackingType2, orderTrackingService$External$PreferredTrackingType3};
        $VALUES = orderTrackingService$External$PreferredTrackingTypeArr;
        $ENTRIES = a.a(orderTrackingService$External$PreferredTrackingTypeArr);
    }

    public static OrderTrackingService$External$PreferredTrackingType valueOf(String str) {
        return (OrderTrackingService$External$PreferredTrackingType) Enum.valueOf(OrderTrackingService$External$PreferredTrackingType.class, str);
    }

    public static OrderTrackingService$External$PreferredTrackingType[] values() {
        return (OrderTrackingService$External$PreferredTrackingType[]) $VALUES.clone();
    }
}
