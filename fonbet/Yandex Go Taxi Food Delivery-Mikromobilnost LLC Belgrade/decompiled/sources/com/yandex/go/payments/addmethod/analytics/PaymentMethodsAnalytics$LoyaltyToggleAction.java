package com.yandex.go.payments.addmethod.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$LoyaltyToggleAction", "", "Lcom/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$LoyaltyToggleAction;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "On", "Off", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentMethodsAnalytics$LoyaltyToggleAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodsAnalytics$LoyaltyToggleAction[] $VALUES;
    public static final PaymentMethodsAnalytics$LoyaltyToggleAction Off;
    public static final PaymentMethodsAnalytics$LoyaltyToggleAction On;
    private final String eventValue;

    static {
        PaymentMethodsAnalytics$LoyaltyToggleAction paymentMethodsAnalytics$LoyaltyToggleAction = new PaymentMethodsAnalytics$LoyaltyToggleAction("On", 0, "on");
        On = paymentMethodsAnalytics$LoyaltyToggleAction;
        PaymentMethodsAnalytics$LoyaltyToggleAction paymentMethodsAnalytics$LoyaltyToggleAction2 = new PaymentMethodsAnalytics$LoyaltyToggleAction("Off", 1, "off");
        Off = paymentMethodsAnalytics$LoyaltyToggleAction2;
        PaymentMethodsAnalytics$LoyaltyToggleAction[] paymentMethodsAnalytics$LoyaltyToggleActionArr = {paymentMethodsAnalytics$LoyaltyToggleAction, paymentMethodsAnalytics$LoyaltyToggleAction2};
        $VALUES = paymentMethodsAnalytics$LoyaltyToggleActionArr;
        $ENTRIES = a.a(paymentMethodsAnalytics$LoyaltyToggleActionArr);
    }

    public PaymentMethodsAnalytics$LoyaltyToggleAction(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PaymentMethodsAnalytics$LoyaltyToggleAction valueOf(String str) {
        return (PaymentMethodsAnalytics$LoyaltyToggleAction) Enum.valueOf(PaymentMethodsAnalytics$LoyaltyToggleAction.class, str);
    }

    public static PaymentMethodsAnalytics$LoyaltyToggleAction[] values() {
        return (PaymentMethodsAnalytics$LoyaltyToggleAction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
