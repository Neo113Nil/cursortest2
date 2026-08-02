package com.yandex.go.payments.addmethod.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$VerificationType", "", "Lcom/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$VerificationType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Standard23ds", "Cvv", "RandomAmount", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentMethodsAnalytics$VerificationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodsAnalytics$VerificationType[] $VALUES;
    public static final PaymentMethodsAnalytics$VerificationType Cvv;
    public static final PaymentMethodsAnalytics$VerificationType RandomAmount;
    public static final PaymentMethodsAnalytics$VerificationType Standard23ds;
    private final String eventValue;

    static {
        PaymentMethodsAnalytics$VerificationType paymentMethodsAnalytics$VerificationType = new PaymentMethodsAnalytics$VerificationType("Standard23ds", 0, "standard2_3ds");
        Standard23ds = paymentMethodsAnalytics$VerificationType;
        PaymentMethodsAnalytics$VerificationType paymentMethodsAnalytics$VerificationType2 = new PaymentMethodsAnalytics$VerificationType("Cvv", 1, "cvv");
        Cvv = paymentMethodsAnalytics$VerificationType2;
        PaymentMethodsAnalytics$VerificationType paymentMethodsAnalytics$VerificationType3 = new PaymentMethodsAnalytics$VerificationType("RandomAmount", 2, "random_amount");
        RandomAmount = paymentMethodsAnalytics$VerificationType3;
        PaymentMethodsAnalytics$VerificationType[] paymentMethodsAnalytics$VerificationTypeArr = {paymentMethodsAnalytics$VerificationType, paymentMethodsAnalytics$VerificationType2, paymentMethodsAnalytics$VerificationType3};
        $VALUES = paymentMethodsAnalytics$VerificationTypeArr;
        $ENTRIES = a.a(paymentMethodsAnalytics$VerificationTypeArr);
    }

    public PaymentMethodsAnalytics$VerificationType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PaymentMethodsAnalytics$VerificationType valueOf(String str) {
        return (PaymentMethodsAnalytics$VerificationType) Enum.valueOf(PaymentMethodsAnalytics$VerificationType.class, str);
    }

    public static PaymentMethodsAnalytics$VerificationType[] values() {
        return (PaymentMethodsAnalytics$VerificationType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
