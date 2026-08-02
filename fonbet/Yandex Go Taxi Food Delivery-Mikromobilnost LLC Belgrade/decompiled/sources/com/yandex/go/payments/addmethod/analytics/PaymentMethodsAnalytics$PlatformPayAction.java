package com.yandex.go.payments.addmethod.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$PlatformPayAction", "", "Lcom/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$PlatformPayAction;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SupportedCheck", "OptionShown", "SelectSuccess", "SelectCancel", "SelectError", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentMethodsAnalytics$PlatformPayAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodsAnalytics$PlatformPayAction[] $VALUES;
    public static final PaymentMethodsAnalytics$PlatformPayAction OptionShown;
    public static final PaymentMethodsAnalytics$PlatformPayAction SelectCancel;
    public static final PaymentMethodsAnalytics$PlatformPayAction SelectError;
    public static final PaymentMethodsAnalytics$PlatformPayAction SelectSuccess;
    public static final PaymentMethodsAnalytics$PlatformPayAction SupportedCheck;
    private final String eventValue;

    static {
        PaymentMethodsAnalytics$PlatformPayAction paymentMethodsAnalytics$PlatformPayAction = new PaymentMethodsAnalytics$PlatformPayAction("SupportedCheck", 0, "supported_check");
        SupportedCheck = paymentMethodsAnalytics$PlatformPayAction;
        PaymentMethodsAnalytics$PlatformPayAction paymentMethodsAnalytics$PlatformPayAction2 = new PaymentMethodsAnalytics$PlatformPayAction("OptionShown", 1, "option_shown");
        OptionShown = paymentMethodsAnalytics$PlatformPayAction2;
        PaymentMethodsAnalytics$PlatformPayAction paymentMethodsAnalytics$PlatformPayAction3 = new PaymentMethodsAnalytics$PlatformPayAction("SelectSuccess", 2, "select_success");
        SelectSuccess = paymentMethodsAnalytics$PlatformPayAction3;
        PaymentMethodsAnalytics$PlatformPayAction paymentMethodsAnalytics$PlatformPayAction4 = new PaymentMethodsAnalytics$PlatformPayAction("SelectCancel", 3, "select_cancel");
        SelectCancel = paymentMethodsAnalytics$PlatformPayAction4;
        PaymentMethodsAnalytics$PlatformPayAction paymentMethodsAnalytics$PlatformPayAction5 = new PaymentMethodsAnalytics$PlatformPayAction("SelectError", 4, "select_error");
        SelectError = paymentMethodsAnalytics$PlatformPayAction5;
        PaymentMethodsAnalytics$PlatformPayAction[] paymentMethodsAnalytics$PlatformPayActionArr = {paymentMethodsAnalytics$PlatformPayAction, paymentMethodsAnalytics$PlatformPayAction2, paymentMethodsAnalytics$PlatformPayAction3, paymentMethodsAnalytics$PlatformPayAction4, paymentMethodsAnalytics$PlatformPayAction5};
        $VALUES = paymentMethodsAnalytics$PlatformPayActionArr;
        $ENTRIES = a.a(paymentMethodsAnalytics$PlatformPayActionArr);
    }

    public PaymentMethodsAnalytics$PlatformPayAction(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PaymentMethodsAnalytics$PlatformPayAction valueOf(String str) {
        return (PaymentMethodsAnalytics$PlatformPayAction) Enum.valueOf(PaymentMethodsAnalytics$PlatformPayAction.class, str);
    }

    public static PaymentMethodsAnalytics$PlatformPayAction[] values() {
        return (PaymentMethodsAnalytics$PlatformPayAction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
