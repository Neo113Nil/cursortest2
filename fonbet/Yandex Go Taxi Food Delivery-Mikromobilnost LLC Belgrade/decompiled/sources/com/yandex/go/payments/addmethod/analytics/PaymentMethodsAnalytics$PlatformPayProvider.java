package com.yandex.go.payments.addmethod.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$PlatformPayProvider", "", "Lcom/yandex/go/payments/addmethod/analytics/PaymentMethodsAnalytics$PlatformPayProvider;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "GooglePay", "ApplePay", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentMethodsAnalytics$PlatformPayProvider {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodsAnalytics$PlatformPayProvider[] $VALUES;
    public static final PaymentMethodsAnalytics$PlatformPayProvider ApplePay;
    public static final PaymentMethodsAnalytics$PlatformPayProvider GooglePay;
    private final String eventValue;

    static {
        PaymentMethodsAnalytics$PlatformPayProvider paymentMethodsAnalytics$PlatformPayProvider = new PaymentMethodsAnalytics$PlatformPayProvider("GooglePay", 0, "google_pay");
        GooglePay = paymentMethodsAnalytics$PlatformPayProvider;
        PaymentMethodsAnalytics$PlatformPayProvider paymentMethodsAnalytics$PlatformPayProvider2 = new PaymentMethodsAnalytics$PlatformPayProvider("ApplePay", 1, "apple_pay");
        ApplePay = paymentMethodsAnalytics$PlatformPayProvider2;
        PaymentMethodsAnalytics$PlatformPayProvider[] paymentMethodsAnalytics$PlatformPayProviderArr = {paymentMethodsAnalytics$PlatformPayProvider, paymentMethodsAnalytics$PlatformPayProvider2};
        $VALUES = paymentMethodsAnalytics$PlatformPayProviderArr;
        $ENTRIES = a.a(paymentMethodsAnalytics$PlatformPayProviderArr);
    }

    public PaymentMethodsAnalytics$PlatformPayProvider(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static PaymentMethodsAnalytics$PlatformPayProvider valueOf(String str) {
        return (PaymentMethodsAnalytics$PlatformPayProvider) Enum.valueOf(PaymentMethodsAnalytics$PlatformPayProvider.class, str);
    }

    public static PaymentMethodsAnalytics$PlatformPayProvider[] values() {
        return (PaymentMethodsAnalytics$PlatformPayProvider[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
