package com.yandex.go.taxi.order.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/taxi/order/analytics/TaxiOrderAnalytics$RideCardLoadedReason", "", "Lcom/yandex/go/taxi/order/analytics/TaxiOrderAnalytics$RideCardLoadedReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Opened", "StatusChanged", "SourceChanged", "go-client-android.features.taxi_order:shared"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TaxiOrderAnalytics$RideCardLoadedReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiOrderAnalytics$RideCardLoadedReason[] $VALUES;
    public static final TaxiOrderAnalytics$RideCardLoadedReason Opened;
    public static final TaxiOrderAnalytics$RideCardLoadedReason SourceChanged;
    public static final TaxiOrderAnalytics$RideCardLoadedReason StatusChanged;
    private final String eventValue;

    static {
        TaxiOrderAnalytics$RideCardLoadedReason taxiOrderAnalytics$RideCardLoadedReason = new TaxiOrderAnalytics$RideCardLoadedReason("Opened", 0, "opened");
        Opened = taxiOrderAnalytics$RideCardLoadedReason;
        TaxiOrderAnalytics$RideCardLoadedReason taxiOrderAnalytics$RideCardLoadedReason2 = new TaxiOrderAnalytics$RideCardLoadedReason("StatusChanged", 1, "status_changed");
        StatusChanged = taxiOrderAnalytics$RideCardLoadedReason2;
        TaxiOrderAnalytics$RideCardLoadedReason taxiOrderAnalytics$RideCardLoadedReason3 = new TaxiOrderAnalytics$RideCardLoadedReason("SourceChanged", 2, "source_changed");
        SourceChanged = taxiOrderAnalytics$RideCardLoadedReason3;
        TaxiOrderAnalytics$RideCardLoadedReason[] taxiOrderAnalytics$RideCardLoadedReasonArr = {taxiOrderAnalytics$RideCardLoadedReason, taxiOrderAnalytics$RideCardLoadedReason2, taxiOrderAnalytics$RideCardLoadedReason3};
        $VALUES = taxiOrderAnalytics$RideCardLoadedReasonArr;
        $ENTRIES = kotlin.enums.a.a(taxiOrderAnalytics$RideCardLoadedReasonArr);
    }

    public TaxiOrderAnalytics$RideCardLoadedReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TaxiOrderAnalytics$RideCardLoadedReason valueOf(String str) {
        return (TaxiOrderAnalytics$RideCardLoadedReason) Enum.valueOf(TaxiOrderAnalytics$RideCardLoadedReason.class, str);
    }

    public static TaxiOrderAnalytics$RideCardLoadedReason[] values() {
        return (TaxiOrderAnalytics$RideCardLoadedReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
