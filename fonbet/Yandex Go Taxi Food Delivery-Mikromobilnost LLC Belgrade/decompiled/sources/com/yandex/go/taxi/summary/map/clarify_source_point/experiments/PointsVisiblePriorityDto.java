package com.yandex.go.taxi.summary.map.clarify_source_point.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.lwd0;
import defpackage.mlc0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/summary/map/clarify_source_point/experiments/PointsVisiblePriorityDto;", "", "Companion", "lwd0", "SOURCE", "DESTINATION", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PointsVisiblePriorityDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PointsVisiblePriorityDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final lwd0 Companion;
    public static final PointsVisiblePriorityDto DESTINATION;
    public static final PointsVisiblePriorityDto SOURCE;
    public static final PointsVisiblePriorityDto UNKNOWN;

    static {
        PointsVisiblePriorityDto pointsVisiblePriorityDto = new PointsVisiblePriorityDto("SOURCE", 0);
        SOURCE = pointsVisiblePriorityDto;
        PointsVisiblePriorityDto pointsVisiblePriorityDto2 = new PointsVisiblePriorityDto("DESTINATION", 1);
        DESTINATION = pointsVisiblePriorityDto2;
        PointsVisiblePriorityDto pointsVisiblePriorityDto3 = new PointsVisiblePriorityDto("UNKNOWN", 2);
        UNKNOWN = pointsVisiblePriorityDto3;
        PointsVisiblePriorityDto[] pointsVisiblePriorityDtoArr = {pointsVisiblePriorityDto, pointsVisiblePriorityDto2, pointsVisiblePriorityDto3};
        $VALUES = pointsVisiblePriorityDtoArr;
        $ENTRIES = kotlin.enums.a.a(pointsVisiblePriorityDtoArr);
        Companion = new lwd0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mlc0(19));
    }

    public static PointsVisiblePriorityDto valueOf(String str) {
        return (PointsVisiblePriorityDto) Enum.valueOf(PointsVisiblePriorityDto.class, str);
    }

    public static PointsVisiblePriorityDto[] values() {
        return (PointsVisiblePriorityDto[]) $VALUES.clone();
    }
}
