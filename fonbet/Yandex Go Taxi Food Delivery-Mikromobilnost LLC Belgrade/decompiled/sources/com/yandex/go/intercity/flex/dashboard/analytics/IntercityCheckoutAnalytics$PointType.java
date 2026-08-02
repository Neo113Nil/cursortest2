package com.yandex.go.intercity.flex.dashboard.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/intercity/flex/dashboard/analytics/IntercityCheckoutAnalytics$PointType", "", "Lcom/yandex/go/intercity/flex/dashboard/analytics/IntercityCheckoutAnalytics$PointType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Source", "Destination", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IntercityCheckoutAnalytics$PointType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IntercityCheckoutAnalytics$PointType[] $VALUES;
    public static final IntercityCheckoutAnalytics$PointType Destination;
    public static final IntercityCheckoutAnalytics$PointType Source;
    private final String eventValue;

    static {
        IntercityCheckoutAnalytics$PointType intercityCheckoutAnalytics$PointType = new IntercityCheckoutAnalytics$PointType("Source", 0, "source");
        Source = intercityCheckoutAnalytics$PointType;
        IntercityCheckoutAnalytics$PointType intercityCheckoutAnalytics$PointType2 = new IntercityCheckoutAnalytics$PointType("Destination", 1, "destination");
        Destination = intercityCheckoutAnalytics$PointType2;
        IntercityCheckoutAnalytics$PointType[] intercityCheckoutAnalytics$PointTypeArr = {intercityCheckoutAnalytics$PointType, intercityCheckoutAnalytics$PointType2};
        $VALUES = intercityCheckoutAnalytics$PointTypeArr;
        $ENTRIES = a.a(intercityCheckoutAnalytics$PointTypeArr);
    }

    public IntercityCheckoutAnalytics$PointType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static IntercityCheckoutAnalytics$PointType valueOf(String str) {
        return (IntercityCheckoutAnalytics$PointType) Enum.valueOf(IntercityCheckoutAnalytics$PointType.class, str);
    }

    public static IntercityCheckoutAnalytics$PointType[] values() {
        return (IntercityCheckoutAnalytics$PointType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
