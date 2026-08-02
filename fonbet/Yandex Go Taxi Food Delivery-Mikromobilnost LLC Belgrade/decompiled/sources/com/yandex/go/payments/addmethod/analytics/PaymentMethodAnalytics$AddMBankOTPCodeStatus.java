package com.yandex.go.payments.addmethod.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/payments/addmethod/analytics/PaymentMethodAnalytics$AddMBankOTPCodeStatus", "", "Lcom/yandex/go/payments/addmethod/analytics/PaymentMethodAnalytics$AddMBankOTPCodeStatus;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Success", "Falied", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentMethodAnalytics$AddMBankOTPCodeStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodAnalytics$AddMBankOTPCodeStatus[] $VALUES;
    public static final PaymentMethodAnalytics$AddMBankOTPCodeStatus Falied;
    public static final PaymentMethodAnalytics$AddMBankOTPCodeStatus Success;
    private final String eventValue;

    static {
        PaymentMethodAnalytics$AddMBankOTPCodeStatus paymentMethodAnalytics$AddMBankOTPCodeStatus = new PaymentMethodAnalytics$AddMBankOTPCodeStatus("Success", 0, "success");
        Success = paymentMethodAnalytics$AddMBankOTPCodeStatus;
        PaymentMethodAnalytics$AddMBankOTPCodeStatus paymentMethodAnalytics$AddMBankOTPCodeStatus2 = new PaymentMethodAnalytics$AddMBankOTPCodeStatus("Falied", 1, "falied");
        Falied = paymentMethodAnalytics$AddMBankOTPCodeStatus2;
        PaymentMethodAnalytics$AddMBankOTPCodeStatus[] paymentMethodAnalytics$AddMBankOTPCodeStatusArr = {paymentMethodAnalytics$AddMBankOTPCodeStatus, paymentMethodAnalytics$AddMBankOTPCodeStatus2};
        $VALUES = paymentMethodAnalytics$AddMBankOTPCodeStatusArr;
        $ENTRIES = a.a(paymentMethodAnalytics$AddMBankOTPCodeStatusArr);
    }

    public PaymentMethodAnalytics$AddMBankOTPCodeStatus(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PaymentMethodAnalytics$AddMBankOTPCodeStatus valueOf(String str) {
        return (PaymentMethodAnalytics$AddMBankOTPCodeStatus) Enum.valueOf(PaymentMethodAnalytics$AddMBankOTPCodeStatus.class, str);
    }

    public static PaymentMethodAnalytics$AddMBankOTPCodeStatus[] values() {
        return (PaymentMethodAnalytics$AddMBankOTPCodeStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
