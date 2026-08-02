package com.yandex.go.superapp.tracking.api.domain.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/superapp/tracking/api/domain/models/TrackingCardStatus$Image$Clipping", "", "Lcom/yandex/go/superapp/tracking/api/domain/models/TrackingCardStatus$Image$Clipping;", "RoundedSquare", "Circle", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TrackingCardStatus$Image$Clipping {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TrackingCardStatus$Image$Clipping[] $VALUES;
    public static final TrackingCardStatus$Image$Clipping Circle;
    public static final TrackingCardStatus$Image$Clipping RoundedSquare;

    static {
        TrackingCardStatus$Image$Clipping trackingCardStatus$Image$Clipping = new TrackingCardStatus$Image$Clipping("RoundedSquare", 0);
        RoundedSquare = trackingCardStatus$Image$Clipping;
        TrackingCardStatus$Image$Clipping trackingCardStatus$Image$Clipping2 = new TrackingCardStatus$Image$Clipping("Circle", 1);
        Circle = trackingCardStatus$Image$Clipping2;
        TrackingCardStatus$Image$Clipping[] trackingCardStatus$Image$ClippingArr = {trackingCardStatus$Image$Clipping, trackingCardStatus$Image$Clipping2};
        $VALUES = trackingCardStatus$Image$ClippingArr;
        $ENTRIES = a.a(trackingCardStatus$Image$ClippingArr);
    }

    public static TrackingCardStatus$Image$Clipping valueOf(String str) {
        return (TrackingCardStatus$Image$Clipping) Enum.valueOf(TrackingCardStatus$Image$Clipping.class, str);
    }

    public static TrackingCardStatus$Image$Clipping[] values() {
        return (TrackingCardStatus$Image$Clipping[]) $VALUES.clone();
    }
}
