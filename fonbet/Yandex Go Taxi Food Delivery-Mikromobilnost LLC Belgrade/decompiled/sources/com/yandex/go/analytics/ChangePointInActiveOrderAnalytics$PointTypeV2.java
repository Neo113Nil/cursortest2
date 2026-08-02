package com.yandex.go.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/go/analytics/ChangePointInActiveOrderAnalytics$PointTypeV2", "", "Lcom/yandex/go/analytics/ChangePointInActiveOrderAnalytics$PointTypeV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Source", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChangePointInActiveOrderAnalytics$PointTypeV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChangePointInActiveOrderAnalytics$PointTypeV2[] $VALUES;
    public static final ChangePointInActiveOrderAnalytics$PointTypeV2 Source;
    private final String eventValue = "source";

    static {
        ChangePointInActiveOrderAnalytics$PointTypeV2 changePointInActiveOrderAnalytics$PointTypeV2 = new ChangePointInActiveOrderAnalytics$PointTypeV2();
        Source = changePointInActiveOrderAnalytics$PointTypeV2;
        ChangePointInActiveOrderAnalytics$PointTypeV2[] changePointInActiveOrderAnalytics$PointTypeV2Arr = {changePointInActiveOrderAnalytics$PointTypeV2};
        $VALUES = changePointInActiveOrderAnalytics$PointTypeV2Arr;
        $ENTRIES = kotlin.enums.a.a(changePointInActiveOrderAnalytics$PointTypeV2Arr);
    }

    public static ChangePointInActiveOrderAnalytics$PointTypeV2 valueOf(String str) {
        return (ChangePointInActiveOrderAnalytics$PointTypeV2) Enum.valueOf(ChangePointInActiveOrderAnalytics$PointTypeV2.class, str);
    }

    public static ChangePointInActiveOrderAnalytics$PointTypeV2[] values() {
        return (ChangePointInActiveOrderAnalytics$PointTypeV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
