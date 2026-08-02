package com.yandex.go.payments_widgets.section.payments;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/payments_widgets/section/payments/PaymentWidgetsAnalyticsInteractor$VisibilityState", "", "Lcom/yandex/go/payments_widgets/section/payments/PaymentWidgetsAnalyticsInteractor$VisibilityState;", "NO_SECTION", "HIDED", "UNDER_SCROLL", "VISIBLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentWidgetsAnalyticsInteractor$VisibilityState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentWidgetsAnalyticsInteractor$VisibilityState[] $VALUES;
    public static final PaymentWidgetsAnalyticsInteractor$VisibilityState HIDED;
    public static final PaymentWidgetsAnalyticsInteractor$VisibilityState NO_SECTION;
    public static final PaymentWidgetsAnalyticsInteractor$VisibilityState UNDER_SCROLL;
    public static final PaymentWidgetsAnalyticsInteractor$VisibilityState VISIBLE;

    static {
        PaymentWidgetsAnalyticsInteractor$VisibilityState paymentWidgetsAnalyticsInteractor$VisibilityState = new PaymentWidgetsAnalyticsInteractor$VisibilityState("NO_SECTION", 0);
        NO_SECTION = paymentWidgetsAnalyticsInteractor$VisibilityState;
        PaymentWidgetsAnalyticsInteractor$VisibilityState paymentWidgetsAnalyticsInteractor$VisibilityState2 = new PaymentWidgetsAnalyticsInteractor$VisibilityState("HIDED", 1);
        HIDED = paymentWidgetsAnalyticsInteractor$VisibilityState2;
        PaymentWidgetsAnalyticsInteractor$VisibilityState paymentWidgetsAnalyticsInteractor$VisibilityState3 = new PaymentWidgetsAnalyticsInteractor$VisibilityState("UNDER_SCROLL", 2);
        UNDER_SCROLL = paymentWidgetsAnalyticsInteractor$VisibilityState3;
        PaymentWidgetsAnalyticsInteractor$VisibilityState paymentWidgetsAnalyticsInteractor$VisibilityState4 = new PaymentWidgetsAnalyticsInteractor$VisibilityState("VISIBLE", 3);
        VISIBLE = paymentWidgetsAnalyticsInteractor$VisibilityState4;
        PaymentWidgetsAnalyticsInteractor$VisibilityState[] paymentWidgetsAnalyticsInteractor$VisibilityStateArr = {paymentWidgetsAnalyticsInteractor$VisibilityState, paymentWidgetsAnalyticsInteractor$VisibilityState2, paymentWidgetsAnalyticsInteractor$VisibilityState3, paymentWidgetsAnalyticsInteractor$VisibilityState4};
        $VALUES = paymentWidgetsAnalyticsInteractor$VisibilityStateArr;
        $ENTRIES = kotlin.enums.a.a(paymentWidgetsAnalyticsInteractor$VisibilityStateArr);
    }

    public static PaymentWidgetsAnalyticsInteractor$VisibilityState valueOf(String str) {
        return (PaymentWidgetsAnalyticsInteractor$VisibilityState) Enum.valueOf(PaymentWidgetsAnalyticsInteractor$VisibilityState.class, str);
    }

    public static PaymentWidgetsAnalyticsInteractor$VisibilityState[] values() {
        return (PaymentWidgetsAnalyticsInteractor$VisibilityState[]) $VALUES.clone();
    }
}
