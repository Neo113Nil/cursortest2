package com.yandex.go.summary.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/summary/analytics/SummaryAnalytics$UnsupportedRequirementSource", "", "Lcom/yandex/go/summary/analytics/SummaryAnalytics$UnsupportedRequirementSource;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Carousel", "Header", "go-client-android.features.summary:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SummaryAnalytics$UnsupportedRequirementSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryAnalytics$UnsupportedRequirementSource[] $VALUES;
    public static final SummaryAnalytics$UnsupportedRequirementSource Carousel;
    public static final SummaryAnalytics$UnsupportedRequirementSource Header;
    private final String eventValue;

    static {
        SummaryAnalytics$UnsupportedRequirementSource summaryAnalytics$UnsupportedRequirementSource = new SummaryAnalytics$UnsupportedRequirementSource("Carousel", 0, "carousel");
        Carousel = summaryAnalytics$UnsupportedRequirementSource;
        SummaryAnalytics$UnsupportedRequirementSource summaryAnalytics$UnsupportedRequirementSource2 = new SummaryAnalytics$UnsupportedRequirementSource("Header", 1, "header");
        Header = summaryAnalytics$UnsupportedRequirementSource2;
        SummaryAnalytics$UnsupportedRequirementSource[] summaryAnalytics$UnsupportedRequirementSourceArr = {summaryAnalytics$UnsupportedRequirementSource, summaryAnalytics$UnsupportedRequirementSource2};
        $VALUES = summaryAnalytics$UnsupportedRequirementSourceArr;
        $ENTRIES = a.a(summaryAnalytics$UnsupportedRequirementSourceArr);
    }

    public SummaryAnalytics$UnsupportedRequirementSource(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SummaryAnalytics$UnsupportedRequirementSource valueOf(String str) {
        return (SummaryAnalytics$UnsupportedRequirementSource) Enum.valueOf(SummaryAnalytics$UnsupportedRequirementSource.class, str);
    }

    public static SummaryAnalytics$UnsupportedRequirementSource[] values() {
        return (SummaryAnalytics$UnsupportedRequirementSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
