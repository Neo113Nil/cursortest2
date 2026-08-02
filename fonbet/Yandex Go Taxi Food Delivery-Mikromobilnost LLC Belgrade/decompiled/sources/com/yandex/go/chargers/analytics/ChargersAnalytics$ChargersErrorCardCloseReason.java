package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersErrorCardCloseReason", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersErrorCardCloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "Close", "Retry", "FindAnotherStation", "ReturnToPayment", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersErrorCardCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersErrorCardCloseReason[] $VALUES;
    public static final ChargersAnalytics$ChargersErrorCardCloseReason Back;
    public static final ChargersAnalytics$ChargersErrorCardCloseReason Close;
    public static final ChargersAnalytics$ChargersErrorCardCloseReason FindAnotherStation;
    public static final ChargersAnalytics$ChargersErrorCardCloseReason Retry;
    public static final ChargersAnalytics$ChargersErrorCardCloseReason ReturnToPayment;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersErrorCardCloseReason chargersAnalytics$ChargersErrorCardCloseReason = new ChargersAnalytics$ChargersErrorCardCloseReason("Back", 0, "back");
        Back = chargersAnalytics$ChargersErrorCardCloseReason;
        ChargersAnalytics$ChargersErrorCardCloseReason chargersAnalytics$ChargersErrorCardCloseReason2 = new ChargersAnalytics$ChargersErrorCardCloseReason("Close", 1, "close");
        Close = chargersAnalytics$ChargersErrorCardCloseReason2;
        ChargersAnalytics$ChargersErrorCardCloseReason chargersAnalytics$ChargersErrorCardCloseReason3 = new ChargersAnalytics$ChargersErrorCardCloseReason("Retry", 2, "retry");
        Retry = chargersAnalytics$ChargersErrorCardCloseReason3;
        ChargersAnalytics$ChargersErrorCardCloseReason chargersAnalytics$ChargersErrorCardCloseReason4 = new ChargersAnalytics$ChargersErrorCardCloseReason("FindAnotherStation", 3, "find_another_station");
        FindAnotherStation = chargersAnalytics$ChargersErrorCardCloseReason4;
        ChargersAnalytics$ChargersErrorCardCloseReason chargersAnalytics$ChargersErrorCardCloseReason5 = new ChargersAnalytics$ChargersErrorCardCloseReason("ReturnToPayment", 4, "return_to_payment");
        ReturnToPayment = chargersAnalytics$ChargersErrorCardCloseReason5;
        ChargersAnalytics$ChargersErrorCardCloseReason[] chargersAnalytics$ChargersErrorCardCloseReasonArr = {chargersAnalytics$ChargersErrorCardCloseReason, chargersAnalytics$ChargersErrorCardCloseReason2, chargersAnalytics$ChargersErrorCardCloseReason3, chargersAnalytics$ChargersErrorCardCloseReason4, chargersAnalytics$ChargersErrorCardCloseReason5};
        $VALUES = chargersAnalytics$ChargersErrorCardCloseReasonArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersErrorCardCloseReasonArr);
    }

    public ChargersAnalytics$ChargersErrorCardCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersErrorCardCloseReason valueOf(String str) {
        return (ChargersAnalytics$ChargersErrorCardCloseReason) Enum.valueOf(ChargersAnalytics$ChargersErrorCardCloseReason.class, str);
    }

    public static ChargersAnalytics$ChargersErrorCardCloseReason[] values() {
        return (ChargersAnalytics$ChargersErrorCardCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
