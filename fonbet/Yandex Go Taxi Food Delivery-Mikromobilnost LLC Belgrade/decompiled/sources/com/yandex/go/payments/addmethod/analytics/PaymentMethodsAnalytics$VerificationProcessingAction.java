package com.yandex.go.payments.addmethod.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$VerificationProcessingAction", "", "Lcom/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$VerificationProcessingAction;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ScreenOpened", "Submitted", "LoadingFailed", "Cancelled", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PaymentMethodsAnalytics$VerificationProcessingAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodsAnalytics$VerificationProcessingAction[] $VALUES;
    public static final PaymentMethodsAnalytics$VerificationProcessingAction Cancelled;
    public static final PaymentMethodsAnalytics$VerificationProcessingAction LoadingFailed;
    public static final PaymentMethodsAnalytics$VerificationProcessingAction ScreenOpened;
    public static final PaymentMethodsAnalytics$VerificationProcessingAction Submitted;
    private final String eventValue;

    static {
        PaymentMethodsAnalytics$VerificationProcessingAction paymentMethodsAnalytics$VerificationProcessingAction = new PaymentMethodsAnalytics$VerificationProcessingAction("ScreenOpened", 0, "screen_opened");
        ScreenOpened = paymentMethodsAnalytics$VerificationProcessingAction;
        PaymentMethodsAnalytics$VerificationProcessingAction paymentMethodsAnalytics$VerificationProcessingAction2 = new PaymentMethodsAnalytics$VerificationProcessingAction("Submitted", 1, "submitted");
        Submitted = paymentMethodsAnalytics$VerificationProcessingAction2;
        PaymentMethodsAnalytics$VerificationProcessingAction paymentMethodsAnalytics$VerificationProcessingAction3 = new PaymentMethodsAnalytics$VerificationProcessingAction("LoadingFailed", 2, "loading_failed");
        LoadingFailed = paymentMethodsAnalytics$VerificationProcessingAction3;
        PaymentMethodsAnalytics$VerificationProcessingAction paymentMethodsAnalytics$VerificationProcessingAction4 = new PaymentMethodsAnalytics$VerificationProcessingAction("Cancelled", 3, "cancelled");
        Cancelled = paymentMethodsAnalytics$VerificationProcessingAction4;
        PaymentMethodsAnalytics$VerificationProcessingAction[] paymentMethodsAnalytics$VerificationProcessingActionArr = {paymentMethodsAnalytics$VerificationProcessingAction, paymentMethodsAnalytics$VerificationProcessingAction2, paymentMethodsAnalytics$VerificationProcessingAction3, paymentMethodsAnalytics$VerificationProcessingAction4};
        $VALUES = paymentMethodsAnalytics$VerificationProcessingActionArr;
        $ENTRIES = a.a(paymentMethodsAnalytics$VerificationProcessingActionArr);
    }

    public PaymentMethodsAnalytics$VerificationProcessingAction(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PaymentMethodsAnalytics$VerificationProcessingAction valueOf(String str) {
        return (PaymentMethodsAnalytics$VerificationProcessingAction) Enum.valueOf(PaymentMethodsAnalytics$VerificationProcessingAction.class, str);
    }

    public static PaymentMethodsAnalytics$VerificationProcessingAction[] values() {
        return (PaymentMethodsAnalytics$VerificationProcessingAction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
