package com.yandex.go.taxi.summary.shared.expanded;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/shared/expanded/SummaryExpandedView$ScrollingState", "", "Lcom/yandex/go/taxi/summary/shared/expanded/SummaryExpandedView$ScrollingState;", "UNLOCKED", "LOCKED", "shared"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SummaryExpandedView$ScrollingState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryExpandedView$ScrollingState[] $VALUES;
    public static final SummaryExpandedView$ScrollingState LOCKED;
    public static final SummaryExpandedView$ScrollingState UNLOCKED;

    static {
        SummaryExpandedView$ScrollingState summaryExpandedView$ScrollingState = new SummaryExpandedView$ScrollingState("UNLOCKED", 0);
        UNLOCKED = summaryExpandedView$ScrollingState;
        SummaryExpandedView$ScrollingState summaryExpandedView$ScrollingState2 = new SummaryExpandedView$ScrollingState("LOCKED", 1);
        LOCKED = summaryExpandedView$ScrollingState2;
        SummaryExpandedView$ScrollingState[] summaryExpandedView$ScrollingStateArr = {summaryExpandedView$ScrollingState, summaryExpandedView$ScrollingState2};
        $VALUES = summaryExpandedView$ScrollingStateArr;
        $ENTRIES = a.a(summaryExpandedView$ScrollingStateArr);
    }

    public static SummaryExpandedView$ScrollingState valueOf(String str) {
        return (SummaryExpandedView$ScrollingState) Enum.valueOf(SummaryExpandedView$ScrollingState.class, str);
    }

    public static SummaryExpandedView$ScrollingState[] values() {
        return (SummaryExpandedView$ScrollingState[]) $VALUES.clone();
    }
}
