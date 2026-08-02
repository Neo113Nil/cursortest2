package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersErrorCardButtonName", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersErrorCardButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "Close", "Retry", "FindAnotherStation", "ReturnToPayment", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersErrorCardButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersErrorCardButtonName[] $VALUES;
    public static final ChargersAnalytics$ChargersErrorCardButtonName Back;
    public static final ChargersAnalytics$ChargersErrorCardButtonName Close;
    public static final ChargersAnalytics$ChargersErrorCardButtonName FindAnotherStation;
    public static final ChargersAnalytics$ChargersErrorCardButtonName Retry;
    public static final ChargersAnalytics$ChargersErrorCardButtonName ReturnToPayment;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersErrorCardButtonName chargersAnalytics$ChargersErrorCardButtonName = new ChargersAnalytics$ChargersErrorCardButtonName("Back", 0, "back");
        Back = chargersAnalytics$ChargersErrorCardButtonName;
        ChargersAnalytics$ChargersErrorCardButtonName chargersAnalytics$ChargersErrorCardButtonName2 = new ChargersAnalytics$ChargersErrorCardButtonName("Close", 1, "close");
        Close = chargersAnalytics$ChargersErrorCardButtonName2;
        ChargersAnalytics$ChargersErrorCardButtonName chargersAnalytics$ChargersErrorCardButtonName3 = new ChargersAnalytics$ChargersErrorCardButtonName("Retry", 2, "retry");
        Retry = chargersAnalytics$ChargersErrorCardButtonName3;
        ChargersAnalytics$ChargersErrorCardButtonName chargersAnalytics$ChargersErrorCardButtonName4 = new ChargersAnalytics$ChargersErrorCardButtonName("FindAnotherStation", 3, "find_another_station");
        FindAnotherStation = chargersAnalytics$ChargersErrorCardButtonName4;
        ChargersAnalytics$ChargersErrorCardButtonName chargersAnalytics$ChargersErrorCardButtonName5 = new ChargersAnalytics$ChargersErrorCardButtonName("ReturnToPayment", 4, "return_to_payment");
        ReturnToPayment = chargersAnalytics$ChargersErrorCardButtonName5;
        ChargersAnalytics$ChargersErrorCardButtonName[] chargersAnalytics$ChargersErrorCardButtonNameArr = {chargersAnalytics$ChargersErrorCardButtonName, chargersAnalytics$ChargersErrorCardButtonName2, chargersAnalytics$ChargersErrorCardButtonName3, chargersAnalytics$ChargersErrorCardButtonName4, chargersAnalytics$ChargersErrorCardButtonName5};
        $VALUES = chargersAnalytics$ChargersErrorCardButtonNameArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersErrorCardButtonNameArr);
    }

    public ChargersAnalytics$ChargersErrorCardButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersErrorCardButtonName valueOf(String str) {
        return (ChargersAnalytics$ChargersErrorCardButtonName) Enum.valueOf(ChargersAnalytics$ChargersErrorCardButtonName.class, str);
    }

    public static ChargersAnalytics$ChargersErrorCardButtonName[] values() {
        return (ChargersAnalytics$ChargersErrorCardButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
