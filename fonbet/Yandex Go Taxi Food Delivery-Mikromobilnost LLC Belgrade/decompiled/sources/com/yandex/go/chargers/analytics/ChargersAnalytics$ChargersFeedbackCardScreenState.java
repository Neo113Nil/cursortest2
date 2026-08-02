package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersFeedbackCardScreenState", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersFeedbackCardScreenState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Default", "HoldoutStart", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersFeedbackCardScreenState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersFeedbackCardScreenState[] $VALUES;
    public static final ChargersAnalytics$ChargersFeedbackCardScreenState Default;
    public static final ChargersAnalytics$ChargersFeedbackCardScreenState HoldoutStart;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersFeedbackCardScreenState chargersAnalytics$ChargersFeedbackCardScreenState = new ChargersAnalytics$ChargersFeedbackCardScreenState("Default", 0, "default");
        Default = chargersAnalytics$ChargersFeedbackCardScreenState;
        ChargersAnalytics$ChargersFeedbackCardScreenState chargersAnalytics$ChargersFeedbackCardScreenState2 = new ChargersAnalytics$ChargersFeedbackCardScreenState("HoldoutStart", 1, "holdout_start");
        HoldoutStart = chargersAnalytics$ChargersFeedbackCardScreenState2;
        ChargersAnalytics$ChargersFeedbackCardScreenState[] chargersAnalytics$ChargersFeedbackCardScreenStateArr = {chargersAnalytics$ChargersFeedbackCardScreenState, chargersAnalytics$ChargersFeedbackCardScreenState2};
        $VALUES = chargersAnalytics$ChargersFeedbackCardScreenStateArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersFeedbackCardScreenStateArr);
    }

    public ChargersAnalytics$ChargersFeedbackCardScreenState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersFeedbackCardScreenState valueOf(String str) {
        return (ChargersAnalytics$ChargersFeedbackCardScreenState) Enum.valueOf(ChargersAnalytics$ChargersFeedbackCardScreenState.class, str);
    }

    public static ChargersAnalytics$ChargersFeedbackCardScreenState[] values() {
        return (ChargersAnalytics$ChargersFeedbackCardScreenState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
