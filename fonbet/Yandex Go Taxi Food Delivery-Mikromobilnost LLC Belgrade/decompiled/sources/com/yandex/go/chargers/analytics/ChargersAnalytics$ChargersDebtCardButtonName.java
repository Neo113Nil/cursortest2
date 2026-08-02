package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersDebtCardButtonName", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersDebtCardButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Pay", "SelectPaymentMethod", "ChangePaymentMethod", "Back", "ShowOrdersHistory", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersDebtCardButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersDebtCardButtonName[] $VALUES;
    public static final ChargersAnalytics$ChargersDebtCardButtonName Back;
    public static final ChargersAnalytics$ChargersDebtCardButtonName ChangePaymentMethod;
    public static final ChargersAnalytics$ChargersDebtCardButtonName Pay;
    public static final ChargersAnalytics$ChargersDebtCardButtonName SelectPaymentMethod;
    public static final ChargersAnalytics$ChargersDebtCardButtonName ShowOrdersHistory;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersDebtCardButtonName chargersAnalytics$ChargersDebtCardButtonName = new ChargersAnalytics$ChargersDebtCardButtonName("Pay", 0, "pay");
        Pay = chargersAnalytics$ChargersDebtCardButtonName;
        ChargersAnalytics$ChargersDebtCardButtonName chargersAnalytics$ChargersDebtCardButtonName2 = new ChargersAnalytics$ChargersDebtCardButtonName("SelectPaymentMethod", 1, "select_payment_method");
        SelectPaymentMethod = chargersAnalytics$ChargersDebtCardButtonName2;
        ChargersAnalytics$ChargersDebtCardButtonName chargersAnalytics$ChargersDebtCardButtonName3 = new ChargersAnalytics$ChargersDebtCardButtonName("ChangePaymentMethod", 2, "change_payment_method");
        ChangePaymentMethod = chargersAnalytics$ChargersDebtCardButtonName3;
        ChargersAnalytics$ChargersDebtCardButtonName chargersAnalytics$ChargersDebtCardButtonName4 = new ChargersAnalytics$ChargersDebtCardButtonName("Back", 3, "back");
        Back = chargersAnalytics$ChargersDebtCardButtonName4;
        ChargersAnalytics$ChargersDebtCardButtonName chargersAnalytics$ChargersDebtCardButtonName5 = new ChargersAnalytics$ChargersDebtCardButtonName("ShowOrdersHistory", 4, "show_orders_history");
        ShowOrdersHistory = chargersAnalytics$ChargersDebtCardButtonName5;
        ChargersAnalytics$ChargersDebtCardButtonName[] chargersAnalytics$ChargersDebtCardButtonNameArr = {chargersAnalytics$ChargersDebtCardButtonName, chargersAnalytics$ChargersDebtCardButtonName2, chargersAnalytics$ChargersDebtCardButtonName3, chargersAnalytics$ChargersDebtCardButtonName4, chargersAnalytics$ChargersDebtCardButtonName5};
        $VALUES = chargersAnalytics$ChargersDebtCardButtonNameArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersDebtCardButtonNameArr);
    }

    public ChargersAnalytics$ChargersDebtCardButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersDebtCardButtonName valueOf(String str) {
        return (ChargersAnalytics$ChargersDebtCardButtonName) Enum.valueOf(ChargersAnalytics$ChargersDebtCardButtonName.class, str);
    }

    public static ChargersAnalytics$ChargersDebtCardButtonName[] values() {
        return (ChargersAnalytics$ChargersDebtCardButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
