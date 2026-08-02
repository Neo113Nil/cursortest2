package com.yandex.go.summary.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/summary/analytics/SummaryAnalytics$RequirementBubbleAction", "", "Lcom/yandex/go/summary/analytics/SummaryAnalytics$RequirementBubbleAction;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Close", "Preorder", "Edit", "Remove", "CompoundOptions", "go-client-android.features.summary:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SummaryAnalytics$RequirementBubbleAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryAnalytics$RequirementBubbleAction[] $VALUES;
    public static final SummaryAnalytics$RequirementBubbleAction Close;
    public static final SummaryAnalytics$RequirementBubbleAction CompoundOptions;
    public static final SummaryAnalytics$RequirementBubbleAction Edit;
    public static final SummaryAnalytics$RequirementBubbleAction Preorder;
    public static final SummaryAnalytics$RequirementBubbleAction Remove;
    private final String eventValue;

    static {
        SummaryAnalytics$RequirementBubbleAction summaryAnalytics$RequirementBubbleAction = new SummaryAnalytics$RequirementBubbleAction("Close", 0, "close");
        Close = summaryAnalytics$RequirementBubbleAction;
        SummaryAnalytics$RequirementBubbleAction summaryAnalytics$RequirementBubbleAction2 = new SummaryAnalytics$RequirementBubbleAction("Preorder", 1, "preorder");
        Preorder = summaryAnalytics$RequirementBubbleAction2;
        SummaryAnalytics$RequirementBubbleAction summaryAnalytics$RequirementBubbleAction3 = new SummaryAnalytics$RequirementBubbleAction("Edit", 2, "edit");
        Edit = summaryAnalytics$RequirementBubbleAction3;
        SummaryAnalytics$RequirementBubbleAction summaryAnalytics$RequirementBubbleAction4 = new SummaryAnalytics$RequirementBubbleAction("Remove", 3, "remove");
        Remove = summaryAnalytics$RequirementBubbleAction4;
        SummaryAnalytics$RequirementBubbleAction summaryAnalytics$RequirementBubbleAction5 = new SummaryAnalytics$RequirementBubbleAction("CompoundOptions", 4, "compound_options");
        CompoundOptions = summaryAnalytics$RequirementBubbleAction5;
        SummaryAnalytics$RequirementBubbleAction[] summaryAnalytics$RequirementBubbleActionArr = {summaryAnalytics$RequirementBubbleAction, summaryAnalytics$RequirementBubbleAction2, summaryAnalytics$RequirementBubbleAction3, summaryAnalytics$RequirementBubbleAction4, summaryAnalytics$RequirementBubbleAction5};
        $VALUES = summaryAnalytics$RequirementBubbleActionArr;
        $ENTRIES = a.a(summaryAnalytics$RequirementBubbleActionArr);
    }

    public SummaryAnalytics$RequirementBubbleAction(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SummaryAnalytics$RequirementBubbleAction valueOf(String str) {
        return (SummaryAnalytics$RequirementBubbleAction) Enum.valueOf(SummaryAnalytics$RequirementBubbleAction.class, str);
    }

    public static SummaryAnalytics$RequirementBubbleAction[] values() {
        return (SummaryAnalytics$RequirementBubbleAction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
