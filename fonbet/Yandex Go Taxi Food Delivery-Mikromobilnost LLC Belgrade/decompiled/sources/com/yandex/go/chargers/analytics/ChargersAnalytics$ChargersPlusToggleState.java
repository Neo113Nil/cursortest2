package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersPlusToggleState", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersPlusToggleState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Spend", "Accumulate", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersPlusToggleState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersPlusToggleState[] $VALUES;
    public static final ChargersAnalytics$ChargersPlusToggleState Accumulate;
    public static final ChargersAnalytics$ChargersPlusToggleState Spend;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersPlusToggleState chargersAnalytics$ChargersPlusToggleState = new ChargersAnalytics$ChargersPlusToggleState("Spend", 0, "spend");
        Spend = chargersAnalytics$ChargersPlusToggleState;
        ChargersAnalytics$ChargersPlusToggleState chargersAnalytics$ChargersPlusToggleState2 = new ChargersAnalytics$ChargersPlusToggleState("Accumulate", 1, "accumulate");
        Accumulate = chargersAnalytics$ChargersPlusToggleState2;
        ChargersAnalytics$ChargersPlusToggleState[] chargersAnalytics$ChargersPlusToggleStateArr = {chargersAnalytics$ChargersPlusToggleState, chargersAnalytics$ChargersPlusToggleState2};
        $VALUES = chargersAnalytics$ChargersPlusToggleStateArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersPlusToggleStateArr);
    }

    public ChargersAnalytics$ChargersPlusToggleState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersPlusToggleState valueOf(String str) {
        return (ChargersAnalytics$ChargersPlusToggleState) Enum.valueOf(ChargersAnalytics$ChargersPlusToggleState.class, str);
    }

    public static ChargersAnalytics$ChargersPlusToggleState[] values() {
        return (ChargersAnalytics$ChargersPlusToggleState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
