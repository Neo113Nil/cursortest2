package com.yandex.go.taxi.order.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/taxi/order/analytics/TaxiOrderAnalytics$RideCardOpenSource", "", "Lcom/yandex/go/taxi/order/analytics/TaxiOrderAnalytics$RideCardOpenSource;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "OrdersList", "Order", "go-client-android.features.taxi_order:shared"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderAnalytics$RideCardOpenSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiOrderAnalytics$RideCardOpenSource[] $VALUES;
    public static final TaxiOrderAnalytics$RideCardOpenSource Order;
    public static final TaxiOrderAnalytics$RideCardOpenSource OrdersList;
    private final String eventValue;

    static {
        TaxiOrderAnalytics$RideCardOpenSource taxiOrderAnalytics$RideCardOpenSource = new TaxiOrderAnalytics$RideCardOpenSource("OrdersList", 0, "orders_list");
        OrdersList = taxiOrderAnalytics$RideCardOpenSource;
        TaxiOrderAnalytics$RideCardOpenSource taxiOrderAnalytics$RideCardOpenSource2 = new TaxiOrderAnalytics$RideCardOpenSource("Order", 1, "order");
        Order = taxiOrderAnalytics$RideCardOpenSource2;
        TaxiOrderAnalytics$RideCardOpenSource[] taxiOrderAnalytics$RideCardOpenSourceArr = {taxiOrderAnalytics$RideCardOpenSource, taxiOrderAnalytics$RideCardOpenSource2};
        $VALUES = taxiOrderAnalytics$RideCardOpenSourceArr;
        $ENTRIES = kotlin.enums.a.a(taxiOrderAnalytics$RideCardOpenSourceArr);
    }

    public TaxiOrderAnalytics$RideCardOpenSource(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TaxiOrderAnalytics$RideCardOpenSource valueOf(String str) {
        return (TaxiOrderAnalytics$RideCardOpenSource) Enum.valueOf(TaxiOrderAnalytics$RideCardOpenSource.class, str);
    }

    public static TaxiOrderAnalytics$RideCardOpenSource[] values() {
        return (TaxiOrderAnalytics$RideCardOpenSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
