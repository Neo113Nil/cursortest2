package com.yandex.go.superapp.orders.card.experiments;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/superapp/orders/card/experiments/TrackingCardElementHorizontalPlacement;", "", "Lead", "Trail", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TrackingCardElementHorizontalPlacement {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TrackingCardElementHorizontalPlacement[] $VALUES;
    public static final TrackingCardElementHorizontalPlacement Lead;
    public static final TrackingCardElementHorizontalPlacement Trail;

    static {
        TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement = new TrackingCardElementHorizontalPlacement("Lead", 0);
        Lead = trackingCardElementHorizontalPlacement;
        TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement2 = new TrackingCardElementHorizontalPlacement("Trail", 1);
        Trail = trackingCardElementHorizontalPlacement2;
        TrackingCardElementHorizontalPlacement[] trackingCardElementHorizontalPlacementArr = {trackingCardElementHorizontalPlacement, trackingCardElementHorizontalPlacement2};
        $VALUES = trackingCardElementHorizontalPlacementArr;
        $ENTRIES = kotlin.enums.a.a(trackingCardElementHorizontalPlacementArr);
    }

    public static TrackingCardElementHorizontalPlacement valueOf(String str) {
        return (TrackingCardElementHorizontalPlacement) Enum.valueOf(TrackingCardElementHorizontalPlacement.class, str);
    }

    public static TrackingCardElementHorizontalPlacement[] values() {
        return (TrackingCardElementHorizontalPlacement[]) $VALUES.clone();
    }
}
