package com.yandex.go.taxi.order.promotions.analytics;

import defpackage.h380;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/taxi/order/promotions/analytics/OrderPickupPointAnalytics$OrderStatus", "", "Lcom/yandex/go/taxi/order/promotions/analytics/OrderPickupPointAnalytics$OrderStatus;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "h380", "SEARCH", "DRIVING", "WAITING", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderPickupPointAnalytics$OrderStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderPickupPointAnalytics$OrderStatus[] $VALUES;
    public static final h380 Companion;
    public static final OrderPickupPointAnalytics$OrderStatus DRIVING;
    public static final OrderPickupPointAnalytics$OrderStatus SEARCH;
    public static final OrderPickupPointAnalytics$OrderStatus WAITING;
    private final String value;

    static {
        OrderPickupPointAnalytics$OrderStatus orderPickupPointAnalytics$OrderStatus = new OrderPickupPointAnalytics$OrderStatus("SEARCH", 0, "search");
        SEARCH = orderPickupPointAnalytics$OrderStatus;
        OrderPickupPointAnalytics$OrderStatus orderPickupPointAnalytics$OrderStatus2 = new OrderPickupPointAnalytics$OrderStatus("DRIVING", 1, "driving");
        DRIVING = orderPickupPointAnalytics$OrderStatus2;
        OrderPickupPointAnalytics$OrderStatus orderPickupPointAnalytics$OrderStatus3 = new OrderPickupPointAnalytics$OrderStatus("WAITING", 2, "waiting");
        WAITING = orderPickupPointAnalytics$OrderStatus3;
        OrderPickupPointAnalytics$OrderStatus[] orderPickupPointAnalytics$OrderStatusArr = {orderPickupPointAnalytics$OrderStatus, orderPickupPointAnalytics$OrderStatus2, orderPickupPointAnalytics$OrderStatus3};
        $VALUES = orderPickupPointAnalytics$OrderStatusArr;
        $ENTRIES = a.a(orderPickupPointAnalytics$OrderStatusArr);
        Companion = new h380();
    }

    public OrderPickupPointAnalytics$OrderStatus(String str, int i, String str2) {
        this.value = str2;
    }

    public static OrderPickupPointAnalytics$OrderStatus valueOf(String str) {
        return (OrderPickupPointAnalytics$OrderStatus) Enum.valueOf(OrderPickupPointAnalytics$OrderStatus.class, str);
    }

    public static OrderPickupPointAnalytics$OrderStatus[] values() {
        return (OrderPickupPointAnalytics$OrderStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
