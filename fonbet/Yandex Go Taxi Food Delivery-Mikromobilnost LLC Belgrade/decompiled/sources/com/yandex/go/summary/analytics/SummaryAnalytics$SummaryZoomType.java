package com.yandex.go.summary.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/summary/analytics/SummaryAnalytics$SummaryZoomType", "", "Lcom/yandex/go/summary/analytics/SummaryAnalytics$SummaryZoomType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "StartingPoint", "DestinationPoint", "Route", "go-client-android.features.summary:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SummaryAnalytics$SummaryZoomType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryAnalytics$SummaryZoomType[] $VALUES;
    public static final SummaryAnalytics$SummaryZoomType DestinationPoint;
    public static final SummaryAnalytics$SummaryZoomType Route;
    public static final SummaryAnalytics$SummaryZoomType StartingPoint;
    private final String eventValue;

    static {
        SummaryAnalytics$SummaryZoomType summaryAnalytics$SummaryZoomType = new SummaryAnalytics$SummaryZoomType("StartingPoint", 0, "starting_point");
        StartingPoint = summaryAnalytics$SummaryZoomType;
        SummaryAnalytics$SummaryZoomType summaryAnalytics$SummaryZoomType2 = new SummaryAnalytics$SummaryZoomType("DestinationPoint", 1, "destination_point");
        DestinationPoint = summaryAnalytics$SummaryZoomType2;
        SummaryAnalytics$SummaryZoomType summaryAnalytics$SummaryZoomType3 = new SummaryAnalytics$SummaryZoomType("Route", 2, "route");
        Route = summaryAnalytics$SummaryZoomType3;
        SummaryAnalytics$SummaryZoomType[] summaryAnalytics$SummaryZoomTypeArr = {summaryAnalytics$SummaryZoomType, summaryAnalytics$SummaryZoomType2, summaryAnalytics$SummaryZoomType3};
        $VALUES = summaryAnalytics$SummaryZoomTypeArr;
        $ENTRIES = a.a(summaryAnalytics$SummaryZoomTypeArr);
    }

    public SummaryAnalytics$SummaryZoomType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SummaryAnalytics$SummaryZoomType valueOf(String str) {
        return (SummaryAnalytics$SummaryZoomType) Enum.valueOf(SummaryAnalytics$SummaryZoomType.class, str);
    }

    public static SummaryAnalytics$SummaryZoomType[] values() {
        return (SummaryAnalytics$SummaryZoomType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
