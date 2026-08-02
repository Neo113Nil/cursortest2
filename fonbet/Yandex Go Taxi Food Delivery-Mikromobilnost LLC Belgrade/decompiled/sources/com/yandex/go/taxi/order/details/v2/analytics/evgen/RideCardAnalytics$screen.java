package com.yandex.go.taxi.order.details.v2.analytics.evgen;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/taxi/order/details/v2/analytics/evgen/RideCardAnalytics$screen", "", "Lcom/yandex/go/taxi/order/details/v2/analytics/evgen/RideCardAnalytics$screen;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "OrderDetails", "OrderDetailsCompact", "OrderList", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardAnalytics$screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RideCardAnalytics$screen[] $VALUES;
    public static final RideCardAnalytics$screen OrderDetails;
    public static final RideCardAnalytics$screen OrderDetailsCompact;
    public static final RideCardAnalytics$screen OrderList;
    private final String eventValue;

    static {
        RideCardAnalytics$screen rideCardAnalytics$screen = new RideCardAnalytics$screen("OrderDetails", 0, "order_details");
        OrderDetails = rideCardAnalytics$screen;
        RideCardAnalytics$screen rideCardAnalytics$screen2 = new RideCardAnalytics$screen("OrderDetailsCompact", 1, "order_details_compact");
        OrderDetailsCompact = rideCardAnalytics$screen2;
        RideCardAnalytics$screen rideCardAnalytics$screen3 = new RideCardAnalytics$screen("OrderList", 2, "order_list");
        OrderList = rideCardAnalytics$screen3;
        RideCardAnalytics$screen[] rideCardAnalytics$screenArr = {rideCardAnalytics$screen, rideCardAnalytics$screen2, rideCardAnalytics$screen3};
        $VALUES = rideCardAnalytics$screenArr;
        $ENTRIES = a.a(rideCardAnalytics$screenArr);
    }

    public RideCardAnalytics$screen(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static RideCardAnalytics$screen valueOf(String str) {
        return (RideCardAnalytics$screen) Enum.valueOf(RideCardAnalytics$screen.class, str);
    }

    public static RideCardAnalytics$screen[] values() {
        return (RideCardAnalytics$screen[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
