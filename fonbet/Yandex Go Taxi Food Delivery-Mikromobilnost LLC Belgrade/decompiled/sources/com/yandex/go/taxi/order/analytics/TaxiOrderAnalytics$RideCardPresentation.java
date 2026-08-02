package com.yandex.go.taxi.order.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/taxi/order/analytics/TaxiOrderAnalytics$RideCardPresentation", "", "Lcom/yandex/go/taxi/order/analytics/TaxiOrderAnalytics$RideCardPresentation;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Compact", "Details", "Sharing", "go-client-android.features.taxi_order:shared"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderAnalytics$RideCardPresentation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiOrderAnalytics$RideCardPresentation[] $VALUES;
    public static final TaxiOrderAnalytics$RideCardPresentation Compact;
    public static final TaxiOrderAnalytics$RideCardPresentation Details;
    public static final TaxiOrderAnalytics$RideCardPresentation Sharing;
    private final String eventValue;

    static {
        TaxiOrderAnalytics$RideCardPresentation taxiOrderAnalytics$RideCardPresentation = new TaxiOrderAnalytics$RideCardPresentation("Compact", 0, "compact");
        Compact = taxiOrderAnalytics$RideCardPresentation;
        TaxiOrderAnalytics$RideCardPresentation taxiOrderAnalytics$RideCardPresentation2 = new TaxiOrderAnalytics$RideCardPresentation("Details", 1, "details");
        Details = taxiOrderAnalytics$RideCardPresentation2;
        TaxiOrderAnalytics$RideCardPresentation taxiOrderAnalytics$RideCardPresentation3 = new TaxiOrderAnalytics$RideCardPresentation("Sharing", 2, "sharing");
        Sharing = taxiOrderAnalytics$RideCardPresentation3;
        TaxiOrderAnalytics$RideCardPresentation[] taxiOrderAnalytics$RideCardPresentationArr = {taxiOrderAnalytics$RideCardPresentation, taxiOrderAnalytics$RideCardPresentation2, taxiOrderAnalytics$RideCardPresentation3};
        $VALUES = taxiOrderAnalytics$RideCardPresentationArr;
        $ENTRIES = kotlin.enums.a.a(taxiOrderAnalytics$RideCardPresentationArr);
    }

    public TaxiOrderAnalytics$RideCardPresentation(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TaxiOrderAnalytics$RideCardPresentation valueOf(String str) {
        return (TaxiOrderAnalytics$RideCardPresentation) Enum.valueOf(TaxiOrderAnalytics$RideCardPresentation.class, str);
    }

    public static TaxiOrderAnalytics$RideCardPresentation[] values() {
        return (TaxiOrderAnalytics$RideCardPresentation[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
