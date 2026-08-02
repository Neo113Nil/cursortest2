package com.yandex.go.taxi.order.multi.tracking;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/taxi/order/multi/tracking/TaxiOrderTrackingViewDelegate$Type", "", "Lcom/yandex/go/taxi/order/multi/tracking/TaxiOrderTrackingViewDelegate$Type;", "FEED", "TARIFF_SELECTION", "MULTIMODAL", "EMPTY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderTrackingViewDelegate$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiOrderTrackingViewDelegate$Type[] $VALUES;
    public static final TaxiOrderTrackingViewDelegate$Type EMPTY;
    public static final TaxiOrderTrackingViewDelegate$Type FEED;
    public static final TaxiOrderTrackingViewDelegate$Type MULTIMODAL;
    public static final TaxiOrderTrackingViewDelegate$Type TARIFF_SELECTION;

    static {
        TaxiOrderTrackingViewDelegate$Type taxiOrderTrackingViewDelegate$Type = new TaxiOrderTrackingViewDelegate$Type("FEED", 0);
        FEED = taxiOrderTrackingViewDelegate$Type;
        TaxiOrderTrackingViewDelegate$Type taxiOrderTrackingViewDelegate$Type2 = new TaxiOrderTrackingViewDelegate$Type("TARIFF_SELECTION", 1);
        TARIFF_SELECTION = taxiOrderTrackingViewDelegate$Type2;
        TaxiOrderTrackingViewDelegate$Type taxiOrderTrackingViewDelegate$Type3 = new TaxiOrderTrackingViewDelegate$Type("MULTIMODAL", 2);
        MULTIMODAL = taxiOrderTrackingViewDelegate$Type3;
        TaxiOrderTrackingViewDelegate$Type taxiOrderTrackingViewDelegate$Type4 = new TaxiOrderTrackingViewDelegate$Type("EMPTY", 3);
        EMPTY = taxiOrderTrackingViewDelegate$Type4;
        TaxiOrderTrackingViewDelegate$Type[] taxiOrderTrackingViewDelegate$TypeArr = {taxiOrderTrackingViewDelegate$Type, taxiOrderTrackingViewDelegate$Type2, taxiOrderTrackingViewDelegate$Type3, taxiOrderTrackingViewDelegate$Type4};
        $VALUES = taxiOrderTrackingViewDelegate$TypeArr;
        $ENTRIES = kotlin.enums.a.a(taxiOrderTrackingViewDelegate$TypeArr);
    }

    public static TaxiOrderTrackingViewDelegate$Type valueOf(String str) {
        return (TaxiOrderTrackingViewDelegate$Type) Enum.valueOf(TaxiOrderTrackingViewDelegate$Type.class, str);
    }

    public static TaxiOrderTrackingViewDelegate$Type[] values() {
        return (TaxiOrderTrackingViewDelegate$Type[]) $VALUES.clone();
    }
}
