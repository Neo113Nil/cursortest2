package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersFinishCardCloseReason", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersFinishCardCloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "OrderFinished", "Error", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersFinishCardCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersFinishCardCloseReason[] $VALUES;
    public static final ChargersAnalytics$ChargersFinishCardCloseReason Back;
    public static final ChargersAnalytics$ChargersFinishCardCloseReason Error;
    public static final ChargersAnalytics$ChargersFinishCardCloseReason OrderFinished;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersFinishCardCloseReason chargersAnalytics$ChargersFinishCardCloseReason = new ChargersAnalytics$ChargersFinishCardCloseReason("Back", 0, "back");
        Back = chargersAnalytics$ChargersFinishCardCloseReason;
        ChargersAnalytics$ChargersFinishCardCloseReason chargersAnalytics$ChargersFinishCardCloseReason2 = new ChargersAnalytics$ChargersFinishCardCloseReason("OrderFinished", 1, "order_finished");
        OrderFinished = chargersAnalytics$ChargersFinishCardCloseReason2;
        ChargersAnalytics$ChargersFinishCardCloseReason chargersAnalytics$ChargersFinishCardCloseReason3 = new ChargersAnalytics$ChargersFinishCardCloseReason("Error", 2, "error");
        Error = chargersAnalytics$ChargersFinishCardCloseReason3;
        ChargersAnalytics$ChargersFinishCardCloseReason[] chargersAnalytics$ChargersFinishCardCloseReasonArr = {chargersAnalytics$ChargersFinishCardCloseReason, chargersAnalytics$ChargersFinishCardCloseReason2, chargersAnalytics$ChargersFinishCardCloseReason3};
        $VALUES = chargersAnalytics$ChargersFinishCardCloseReasonArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersFinishCardCloseReasonArr);
    }

    public ChargersAnalytics$ChargersFinishCardCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersFinishCardCloseReason valueOf(String str) {
        return (ChargersAnalytics$ChargersFinishCardCloseReason) Enum.valueOf(ChargersAnalytics$ChargersFinishCardCloseReason.class, str);
    }

    public static ChargersAnalytics$ChargersFinishCardCloseReason[] values() {
        return (ChargersAnalytics$ChargersFinishCardCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
