package com.yandex.go.summary.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/go/summary/analytics/SummaryAnalytics$SummaryCollapseReasonV2", "", "Lcom/yandex/go/summary/analytics/SummaryAnalytics$SummaryCollapseReasonV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Pull", "ChevronDownTap", "Automatic", "SystemBack", "OutCardTap", "TopBackButtonTap", "go-client-android.features.summary:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SummaryAnalytics$SummaryCollapseReasonV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryAnalytics$SummaryCollapseReasonV2[] $VALUES;
    public static final SummaryAnalytics$SummaryCollapseReasonV2 Automatic;
    public static final SummaryAnalytics$SummaryCollapseReasonV2 ChevronDownTap;
    public static final SummaryAnalytics$SummaryCollapseReasonV2 OutCardTap;
    public static final SummaryAnalytics$SummaryCollapseReasonV2 Pull;
    public static final SummaryAnalytics$SummaryCollapseReasonV2 SystemBack;
    public static final SummaryAnalytics$SummaryCollapseReasonV2 TopBackButtonTap;
    private final String eventValue;

    static {
        SummaryAnalytics$SummaryCollapseReasonV2 summaryAnalytics$SummaryCollapseReasonV2 = new SummaryAnalytics$SummaryCollapseReasonV2("Pull", 0, "pull");
        Pull = summaryAnalytics$SummaryCollapseReasonV2;
        SummaryAnalytics$SummaryCollapseReasonV2 summaryAnalytics$SummaryCollapseReasonV22 = new SummaryAnalytics$SummaryCollapseReasonV2("ChevronDownTap", 1, "chevron_down_tap");
        ChevronDownTap = summaryAnalytics$SummaryCollapseReasonV22;
        SummaryAnalytics$SummaryCollapseReasonV2 summaryAnalytics$SummaryCollapseReasonV23 = new SummaryAnalytics$SummaryCollapseReasonV2("Automatic", 2, "automatic");
        Automatic = summaryAnalytics$SummaryCollapseReasonV23;
        SummaryAnalytics$SummaryCollapseReasonV2 summaryAnalytics$SummaryCollapseReasonV24 = new SummaryAnalytics$SummaryCollapseReasonV2("SystemBack", 3, "system_back");
        SystemBack = summaryAnalytics$SummaryCollapseReasonV24;
        SummaryAnalytics$SummaryCollapseReasonV2 summaryAnalytics$SummaryCollapseReasonV25 = new SummaryAnalytics$SummaryCollapseReasonV2("OutCardTap", 4, "out_card_tap");
        OutCardTap = summaryAnalytics$SummaryCollapseReasonV25;
        SummaryAnalytics$SummaryCollapseReasonV2 summaryAnalytics$SummaryCollapseReasonV26 = new SummaryAnalytics$SummaryCollapseReasonV2("TopBackButtonTap", 5, "top_back_button_tap");
        TopBackButtonTap = summaryAnalytics$SummaryCollapseReasonV26;
        SummaryAnalytics$SummaryCollapseReasonV2[] summaryAnalytics$SummaryCollapseReasonV2Arr = {summaryAnalytics$SummaryCollapseReasonV2, summaryAnalytics$SummaryCollapseReasonV22, summaryAnalytics$SummaryCollapseReasonV23, summaryAnalytics$SummaryCollapseReasonV24, summaryAnalytics$SummaryCollapseReasonV25, summaryAnalytics$SummaryCollapseReasonV26};
        $VALUES = summaryAnalytics$SummaryCollapseReasonV2Arr;
        $ENTRIES = a.a(summaryAnalytics$SummaryCollapseReasonV2Arr);
    }

    public SummaryAnalytics$SummaryCollapseReasonV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SummaryAnalytics$SummaryCollapseReasonV2 valueOf(String str) {
        return (SummaryAnalytics$SummaryCollapseReasonV2) Enum.valueOf(SummaryAnalytics$SummaryCollapseReasonV2.class, str);
    }

    public static SummaryAnalytics$SummaryCollapseReasonV2[] values() {
        return (SummaryAnalytics$SummaryCollapseReasonV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
