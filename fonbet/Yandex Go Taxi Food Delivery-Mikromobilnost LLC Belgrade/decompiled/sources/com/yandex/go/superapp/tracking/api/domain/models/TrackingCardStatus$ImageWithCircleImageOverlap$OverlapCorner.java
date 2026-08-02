package com.yandex.go.superapp.tracking.api.domain.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/superapp/tracking/api/domain/models/TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner", "", "Lcom/yandex/go/superapp/tracking/api/domain/models/TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner;", "TopStart", "TopEnd", "BottomStart", "BottomEnd", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner[] $VALUES;
    public static final TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner BottomEnd;
    public static final TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner BottomStart;
    public static final TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner TopEnd;
    public static final TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner TopStart;

    static {
        TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner = new TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner("TopStart", 0);
        TopStart = trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner;
        TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner2 = new TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner("TopEnd", 1);
        TopEnd = trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner2;
        TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner3 = new TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner("BottomStart", 2);
        BottomStart = trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner3;
        TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner4 = new TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner("BottomEnd", 3);
        BottomEnd = trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner4;
        TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner[] trackingCardStatus$ImageWithCircleImageOverlap$OverlapCornerArr = {trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner, trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner2, trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner3, trackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner4};
        $VALUES = trackingCardStatus$ImageWithCircleImageOverlap$OverlapCornerArr;
        $ENTRIES = a.a(trackingCardStatus$ImageWithCircleImageOverlap$OverlapCornerArr);
    }

    public static TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner valueOf(String str) {
        return (TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner) Enum.valueOf(TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner.class, str);
    }

    public static TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner[] values() {
        return (TrackingCardStatus$ImageWithCircleImageOverlap$OverlapCorner[]) $VALUES.clone();
    }
}
