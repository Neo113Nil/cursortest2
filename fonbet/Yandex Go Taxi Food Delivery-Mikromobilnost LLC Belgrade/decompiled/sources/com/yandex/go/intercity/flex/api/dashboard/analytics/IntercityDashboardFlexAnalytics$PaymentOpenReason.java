package com.yandex.go.intercity.flex.api.dashboard.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/intercity/flex/api/dashboard/analytics/IntercityDashboardFlexAnalytics$PaymentOpenReason", "", "Lcom/yandex/go/intercity/flex/api/dashboard/analytics/IntercityDashboardFlexAnalytics$PaymentOpenReason;", "CHANGE_PAYMENT", "FLEX_ACTION", "PAYMENT_UNAVAILABLE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IntercityDashboardFlexAnalytics$PaymentOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IntercityDashboardFlexAnalytics$PaymentOpenReason[] $VALUES;
    public static final IntercityDashboardFlexAnalytics$PaymentOpenReason CHANGE_PAYMENT;
    public static final IntercityDashboardFlexAnalytics$PaymentOpenReason FLEX_ACTION;
    public static final IntercityDashboardFlexAnalytics$PaymentOpenReason PAYMENT_UNAVAILABLE;

    static {
        IntercityDashboardFlexAnalytics$PaymentOpenReason intercityDashboardFlexAnalytics$PaymentOpenReason = new IntercityDashboardFlexAnalytics$PaymentOpenReason("CHANGE_PAYMENT", 0);
        CHANGE_PAYMENT = intercityDashboardFlexAnalytics$PaymentOpenReason;
        IntercityDashboardFlexAnalytics$PaymentOpenReason intercityDashboardFlexAnalytics$PaymentOpenReason2 = new IntercityDashboardFlexAnalytics$PaymentOpenReason("FLEX_ACTION", 1);
        FLEX_ACTION = intercityDashboardFlexAnalytics$PaymentOpenReason2;
        IntercityDashboardFlexAnalytics$PaymentOpenReason intercityDashboardFlexAnalytics$PaymentOpenReason3 = new IntercityDashboardFlexAnalytics$PaymentOpenReason("PAYMENT_UNAVAILABLE", 2);
        PAYMENT_UNAVAILABLE = intercityDashboardFlexAnalytics$PaymentOpenReason3;
        IntercityDashboardFlexAnalytics$PaymentOpenReason[] intercityDashboardFlexAnalytics$PaymentOpenReasonArr = {intercityDashboardFlexAnalytics$PaymentOpenReason, intercityDashboardFlexAnalytics$PaymentOpenReason2, intercityDashboardFlexAnalytics$PaymentOpenReason3};
        $VALUES = intercityDashboardFlexAnalytics$PaymentOpenReasonArr;
        $ENTRIES = a.a(intercityDashboardFlexAnalytics$PaymentOpenReasonArr);
    }

    public static IntercityDashboardFlexAnalytics$PaymentOpenReason valueOf(String str) {
        return (IntercityDashboardFlexAnalytics$PaymentOpenReason) Enum.valueOf(IntercityDashboardFlexAnalytics$PaymentOpenReason.class, str);
    }

    public static IntercityDashboardFlexAnalytics$PaymentOpenReason[] values() {
        return (IntercityDashboardFlexAnalytics$PaymentOpenReason[]) $VALUES.clone();
    }
}
