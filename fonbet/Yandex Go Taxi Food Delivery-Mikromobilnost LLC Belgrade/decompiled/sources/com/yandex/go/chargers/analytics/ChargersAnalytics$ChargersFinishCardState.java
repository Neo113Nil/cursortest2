package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersFinishCardState", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersFinishCardState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PreFinish", "FinishingInit", "FinishingInProgress", "FinishingSuccess", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersFinishCardState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersFinishCardState[] $VALUES;
    public static final ChargersAnalytics$ChargersFinishCardState FinishingInProgress;
    public static final ChargersAnalytics$ChargersFinishCardState FinishingInit;
    public static final ChargersAnalytics$ChargersFinishCardState FinishingSuccess;
    public static final ChargersAnalytics$ChargersFinishCardState PreFinish;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersFinishCardState chargersAnalytics$ChargersFinishCardState = new ChargersAnalytics$ChargersFinishCardState("PreFinish", 0, "pre_finish");
        PreFinish = chargersAnalytics$ChargersFinishCardState;
        ChargersAnalytics$ChargersFinishCardState chargersAnalytics$ChargersFinishCardState2 = new ChargersAnalytics$ChargersFinishCardState("FinishingInit", 1, "finishing_init");
        FinishingInit = chargersAnalytics$ChargersFinishCardState2;
        ChargersAnalytics$ChargersFinishCardState chargersAnalytics$ChargersFinishCardState3 = new ChargersAnalytics$ChargersFinishCardState("FinishingInProgress", 2, "finishing_in_progress");
        FinishingInProgress = chargersAnalytics$ChargersFinishCardState3;
        ChargersAnalytics$ChargersFinishCardState chargersAnalytics$ChargersFinishCardState4 = new ChargersAnalytics$ChargersFinishCardState("FinishingSuccess", 3, "finishing_success");
        FinishingSuccess = chargersAnalytics$ChargersFinishCardState4;
        ChargersAnalytics$ChargersFinishCardState[] chargersAnalytics$ChargersFinishCardStateArr = {chargersAnalytics$ChargersFinishCardState, chargersAnalytics$ChargersFinishCardState2, chargersAnalytics$ChargersFinishCardState3, chargersAnalytics$ChargersFinishCardState4};
        $VALUES = chargersAnalytics$ChargersFinishCardStateArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersFinishCardStateArr);
    }

    public ChargersAnalytics$ChargersFinishCardState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersFinishCardState valueOf(String str) {
        return (ChargersAnalytics$ChargersFinishCardState) Enum.valueOf(ChargersAnalytics$ChargersFinishCardState.class, str);
    }

    public static ChargersAnalytics$ChargersFinishCardState[] values() {
        return (ChargersAnalytics$ChargersFinishCardState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
