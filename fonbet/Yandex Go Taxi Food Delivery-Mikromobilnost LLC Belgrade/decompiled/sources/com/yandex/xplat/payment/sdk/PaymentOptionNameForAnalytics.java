package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/xplat/payment/sdk/PaymentOptionNameForAnalytics;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "EXISTING_CARD", "NEW_CARD", "YB", "SBP", "NEW_SBP_TOKEN", "SBP_TOKEN", "CASH", "APPLE_PAY", "GOOGLE_PAY", "UNKNOWN", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentOptionNameForAnalytics {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentOptionNameForAnalytics[] $VALUES;
    public static final PaymentOptionNameForAnalytics APPLE_PAY;
    public static final PaymentOptionNameForAnalytics CASH;
    public static final PaymentOptionNameForAnalytics EXISTING_CARD;
    public static final PaymentOptionNameForAnalytics GOOGLE_PAY;
    public static final PaymentOptionNameForAnalytics NEW_CARD;
    public static final PaymentOptionNameForAnalytics NEW_SBP_TOKEN;
    public static final PaymentOptionNameForAnalytics SBP;
    public static final PaymentOptionNameForAnalytics SBP_TOKEN;
    public static final PaymentOptionNameForAnalytics UNKNOWN;
    public static final PaymentOptionNameForAnalytics YB;
    private final String value;

    static {
        PaymentOptionNameForAnalytics paymentOptionNameForAnalytics = new PaymentOptionNameForAnalytics("EXISTING_CARD", 0, "existing_card");
        EXISTING_CARD = paymentOptionNameForAnalytics;
        PaymentOptionNameForAnalytics paymentOptionNameForAnalytics2 = new PaymentOptionNameForAnalytics("NEW_CARD", 1, "new_card");
        NEW_CARD = paymentOptionNameForAnalytics2;
        PaymentOptionNameForAnalytics paymentOptionNameForAnalytics3 = new PaymentOptionNameForAnalytics("YB", 2, "yb");
        YB = paymentOptionNameForAnalytics3;
        PaymentOptionNameForAnalytics paymentOptionNameForAnalytics4 = new PaymentOptionNameForAnalytics("SBP", 3, "sbp");
        SBP = paymentOptionNameForAnalytics4;
        PaymentOptionNameForAnalytics paymentOptionNameForAnalytics5 = new PaymentOptionNameForAnalytics("NEW_SBP_TOKEN", 4, "new_sbp_token");
        NEW_SBP_TOKEN = paymentOptionNameForAnalytics5;
        PaymentOptionNameForAnalytics paymentOptionNameForAnalytics6 = new PaymentOptionNameForAnalytics("SBP_TOKEN", 5, "sbp_token");
        SBP_TOKEN = paymentOptionNameForAnalytics6;
        PaymentOptionNameForAnalytics paymentOptionNameForAnalytics7 = new PaymentOptionNameForAnalytics("CASH", 6, "cash");
        CASH = paymentOptionNameForAnalytics7;
        PaymentOptionNameForAnalytics paymentOptionNameForAnalytics8 = new PaymentOptionNameForAnalytics("APPLE_PAY", 7, "apple_pay");
        APPLE_PAY = paymentOptionNameForAnalytics8;
        PaymentOptionNameForAnalytics paymentOptionNameForAnalytics9 = new PaymentOptionNameForAnalytics("GOOGLE_PAY", 8, "google_pay");
        GOOGLE_PAY = paymentOptionNameForAnalytics9;
        PaymentOptionNameForAnalytics paymentOptionNameForAnalytics10 = new PaymentOptionNameForAnalytics("UNKNOWN", 9, "unknown");
        UNKNOWN = paymentOptionNameForAnalytics10;
        PaymentOptionNameForAnalytics[] paymentOptionNameForAnalyticsArr = {paymentOptionNameForAnalytics, paymentOptionNameForAnalytics2, paymentOptionNameForAnalytics3, paymentOptionNameForAnalytics4, paymentOptionNameForAnalytics5, paymentOptionNameForAnalytics6, paymentOptionNameForAnalytics7, paymentOptionNameForAnalytics8, paymentOptionNameForAnalytics9, paymentOptionNameForAnalytics10};
        $VALUES = paymentOptionNameForAnalyticsArr;
        $ENTRIES = a.a(paymentOptionNameForAnalyticsArr);
    }

    public PaymentOptionNameForAnalytics(String str, int i, String str2) {
        this.value = str2;
    }

    public static PaymentOptionNameForAnalytics valueOf(String str) {
        return (PaymentOptionNameForAnalytics) Enum.valueOf(PaymentOptionNameForAnalytics.class, str);
    }

    public static PaymentOptionNameForAnalytics[] values() {
        return (PaymentOptionNameForAnalytics[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
