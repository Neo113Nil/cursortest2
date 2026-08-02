package com.yandex.go.summary.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/summary/analytics/SummaryAnalytics$SummaryAction", "", "Lcom/yandex/go/summary/analytics/SummaryAnalytics$SummaryAction;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "AddressSuggest", "StopsList", "go-client-android.features.summary:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SummaryAnalytics$SummaryAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryAnalytics$SummaryAction[] $VALUES;
    public static final SummaryAnalytics$SummaryAction AddressSuggest;
    public static final SummaryAnalytics$SummaryAction StopsList;
    private final String eventValue;

    static {
        SummaryAnalytics$SummaryAction summaryAnalytics$SummaryAction = new SummaryAnalytics$SummaryAction("AddressSuggest", 0, "address_suggest");
        AddressSuggest = summaryAnalytics$SummaryAction;
        SummaryAnalytics$SummaryAction summaryAnalytics$SummaryAction2 = new SummaryAnalytics$SummaryAction("StopsList", 1, "stops_list");
        StopsList = summaryAnalytics$SummaryAction2;
        SummaryAnalytics$SummaryAction[] summaryAnalytics$SummaryActionArr = {summaryAnalytics$SummaryAction, summaryAnalytics$SummaryAction2};
        $VALUES = summaryAnalytics$SummaryActionArr;
        $ENTRIES = a.a(summaryAnalytics$SummaryActionArr);
    }

    public SummaryAnalytics$SummaryAction(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SummaryAnalytics$SummaryAction valueOf(String str) {
        return (SummaryAnalytics$SummaryAction) Enum.valueOf(SummaryAnalytics$SummaryAction.class, str);
    }

    public static SummaryAnalytics$SummaryAction[] values() {
        return (SummaryAnalytics$SummaryAction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
