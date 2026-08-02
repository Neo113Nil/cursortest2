package com.yandex.go.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/go/analytics/PositionChoicesShowPickerAnalytics$PointTypeV2", "", "Lcom/yandex/go/analytics/PositionChoicesShowPickerAnalytics$PointTypeV2;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Starting", "go-client-android.features.routeselector:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PositionChoicesShowPickerAnalytics$PointTypeV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PositionChoicesShowPickerAnalytics$PointTypeV2[] $VALUES;
    public static final PositionChoicesShowPickerAnalytics$PointTypeV2 Starting;
    private final String eventValue = "starting";

    static {
        PositionChoicesShowPickerAnalytics$PointTypeV2 positionChoicesShowPickerAnalytics$PointTypeV2 = new PositionChoicesShowPickerAnalytics$PointTypeV2();
        Starting = positionChoicesShowPickerAnalytics$PointTypeV2;
        PositionChoicesShowPickerAnalytics$PointTypeV2[] positionChoicesShowPickerAnalytics$PointTypeV2Arr = {positionChoicesShowPickerAnalytics$PointTypeV2};
        $VALUES = positionChoicesShowPickerAnalytics$PointTypeV2Arr;
        $ENTRIES = kotlin.enums.a.a(positionChoicesShowPickerAnalytics$PointTypeV2Arr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static PositionChoicesShowPickerAnalytics$PointTypeV2 valueOf(String str) {
        return (PositionChoicesShowPickerAnalytics$PointTypeV2) Enum.valueOf(PositionChoicesShowPickerAnalytics$PointTypeV2.class, str);
    }

    public static PositionChoicesShowPickerAnalytics$PointTypeV2[] values() {
        return (PositionChoicesShowPickerAnalytics$PointTypeV2[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
