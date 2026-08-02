package com.yandex.go.taxi.summary.api.map.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/api/map/model/PointsVisiblePriority;", "", "SOURCE", "DESTINATION", "BOTH", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PointsVisiblePriority {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PointsVisiblePriority[] $VALUES;
    public static final PointsVisiblePriority BOTH;
    public static final PointsVisiblePriority DESTINATION;
    public static final PointsVisiblePriority SOURCE;

    static {
        PointsVisiblePriority pointsVisiblePriority = new PointsVisiblePriority("SOURCE", 0);
        SOURCE = pointsVisiblePriority;
        PointsVisiblePriority pointsVisiblePriority2 = new PointsVisiblePriority("DESTINATION", 1);
        DESTINATION = pointsVisiblePriority2;
        PointsVisiblePriority pointsVisiblePriority3 = new PointsVisiblePriority("BOTH", 2);
        BOTH = pointsVisiblePriority3;
        PointsVisiblePriority[] pointsVisiblePriorityArr = {pointsVisiblePriority, pointsVisiblePriority2, pointsVisiblePriority3};
        $VALUES = pointsVisiblePriorityArr;
        $ENTRIES = a.a(pointsVisiblePriorityArr);
    }

    public static PointsVisiblePriority valueOf(String str) {
        return (PointsVisiblePriority) Enum.valueOf(PointsVisiblePriority.class, str);
    }

    public static PointsVisiblePriority[] values() {
        return (PointsVisiblePriority[]) $VALUES.clone();
    }
}
