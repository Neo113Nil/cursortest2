package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersLocationCardScrollState", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersLocationCardScrollState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Collapsed", "Anchored", "Expanded", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersLocationCardScrollState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersLocationCardScrollState[] $VALUES;
    public static final ChargersAnalytics$ChargersLocationCardScrollState Anchored;
    public static final ChargersAnalytics$ChargersLocationCardScrollState Collapsed;
    public static final ChargersAnalytics$ChargersLocationCardScrollState Expanded;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersLocationCardScrollState chargersAnalytics$ChargersLocationCardScrollState = new ChargersAnalytics$ChargersLocationCardScrollState("Collapsed", 0, "collapsed");
        Collapsed = chargersAnalytics$ChargersLocationCardScrollState;
        ChargersAnalytics$ChargersLocationCardScrollState chargersAnalytics$ChargersLocationCardScrollState2 = new ChargersAnalytics$ChargersLocationCardScrollState("Anchored", 1, "anchored");
        Anchored = chargersAnalytics$ChargersLocationCardScrollState2;
        ChargersAnalytics$ChargersLocationCardScrollState chargersAnalytics$ChargersLocationCardScrollState3 = new ChargersAnalytics$ChargersLocationCardScrollState("Expanded", 2, "expanded");
        Expanded = chargersAnalytics$ChargersLocationCardScrollState3;
        ChargersAnalytics$ChargersLocationCardScrollState[] chargersAnalytics$ChargersLocationCardScrollStateArr = {chargersAnalytics$ChargersLocationCardScrollState, chargersAnalytics$ChargersLocationCardScrollState2, chargersAnalytics$ChargersLocationCardScrollState3};
        $VALUES = chargersAnalytics$ChargersLocationCardScrollStateArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersLocationCardScrollStateArr);
    }

    public ChargersAnalytics$ChargersLocationCardScrollState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersLocationCardScrollState valueOf(String str) {
        return (ChargersAnalytics$ChargersLocationCardScrollState) Enum.valueOf(ChargersAnalytics$ChargersLocationCardScrollState.class, str);
    }

    public static ChargersAnalytics$ChargersLocationCardScrollState[] values() {
        return (ChargersAnalytics$ChargersLocationCardScrollState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
