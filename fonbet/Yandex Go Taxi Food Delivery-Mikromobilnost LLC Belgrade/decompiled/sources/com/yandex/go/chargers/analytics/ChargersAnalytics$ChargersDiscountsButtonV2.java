package com.yandex.go.chargers.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersDiscountsButtonV2", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersDiscountsButtonV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Tab", "DiscountToggle", "EnterPromocode", "DiscountDetails", "CumulativeDiscount", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersDiscountsButtonV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersDiscountsButtonV2[] $VALUES;
    public static final ChargersAnalytics$ChargersDiscountsButtonV2 CumulativeDiscount;
    public static final ChargersAnalytics$ChargersDiscountsButtonV2 DiscountDetails;
    public static final ChargersAnalytics$ChargersDiscountsButtonV2 DiscountToggle;
    public static final ChargersAnalytics$ChargersDiscountsButtonV2 EnterPromocode;
    public static final ChargersAnalytics$ChargersDiscountsButtonV2 Tab;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersDiscountsButtonV2 chargersAnalytics$ChargersDiscountsButtonV2 = new ChargersAnalytics$ChargersDiscountsButtonV2("Tab", 0, "tab");
        Tab = chargersAnalytics$ChargersDiscountsButtonV2;
        ChargersAnalytics$ChargersDiscountsButtonV2 chargersAnalytics$ChargersDiscountsButtonV22 = new ChargersAnalytics$ChargersDiscountsButtonV2("DiscountToggle", 1, "discount_toggle");
        DiscountToggle = chargersAnalytics$ChargersDiscountsButtonV22;
        ChargersAnalytics$ChargersDiscountsButtonV2 chargersAnalytics$ChargersDiscountsButtonV23 = new ChargersAnalytics$ChargersDiscountsButtonV2("EnterPromocode", 2, "enter_promocode");
        EnterPromocode = chargersAnalytics$ChargersDiscountsButtonV23;
        ChargersAnalytics$ChargersDiscountsButtonV2 chargersAnalytics$ChargersDiscountsButtonV24 = new ChargersAnalytics$ChargersDiscountsButtonV2("DiscountDetails", 3, "discount_details");
        DiscountDetails = chargersAnalytics$ChargersDiscountsButtonV24;
        ChargersAnalytics$ChargersDiscountsButtonV2 chargersAnalytics$ChargersDiscountsButtonV25 = new ChargersAnalytics$ChargersDiscountsButtonV2("CumulativeDiscount", 4, "cumulative_discount");
        CumulativeDiscount = chargersAnalytics$ChargersDiscountsButtonV25;
        ChargersAnalytics$ChargersDiscountsButtonV2[] chargersAnalytics$ChargersDiscountsButtonV2Arr = {chargersAnalytics$ChargersDiscountsButtonV2, chargersAnalytics$ChargersDiscountsButtonV22, chargersAnalytics$ChargersDiscountsButtonV23, chargersAnalytics$ChargersDiscountsButtonV24, chargersAnalytics$ChargersDiscountsButtonV25};
        $VALUES = chargersAnalytics$ChargersDiscountsButtonV2Arr;
        $ENTRIES = a.a(chargersAnalytics$ChargersDiscountsButtonV2Arr);
    }

    public ChargersAnalytics$ChargersDiscountsButtonV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersDiscountsButtonV2 valueOf(String str) {
        return (ChargersAnalytics$ChargersDiscountsButtonV2) Enum.valueOf(ChargersAnalytics$ChargersDiscountsButtonV2.class, str);
    }

    public static ChargersAnalytics$ChargersDiscountsButtonV2[] values() {
        return (ChargersAnalytics$ChargersDiscountsButtonV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
