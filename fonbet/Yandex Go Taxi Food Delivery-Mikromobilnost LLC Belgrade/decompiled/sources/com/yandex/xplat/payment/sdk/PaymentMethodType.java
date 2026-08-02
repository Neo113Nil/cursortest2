package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/xplat/payment/sdk/PaymentMethodType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "SbpToken", "Card", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentMethodType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodType[] $VALUES;
    public static final PaymentMethodType Card;
    public static final PaymentMethodType SbpToken;
    private final String value;

    static {
        PaymentMethodType paymentMethodType = new PaymentMethodType("SbpToken", 0, "sbp_token");
        SbpToken = paymentMethodType;
        PaymentMethodType paymentMethodType2 = new PaymentMethodType("Card", 1, "card");
        Card = paymentMethodType2;
        PaymentMethodType[] paymentMethodTypeArr = {paymentMethodType, paymentMethodType2};
        $VALUES = paymentMethodTypeArr;
        $ENTRIES = a.a(paymentMethodTypeArr);
    }

    public PaymentMethodType(String str, int i, String str2) {
        this.value = str2;
    }

    public static PaymentMethodType valueOf(String str) {
        return (PaymentMethodType) Enum.valueOf(PaymentMethodType.class, str);
    }

    public static PaymentMethodType[] values() {
        return (PaymentMethodType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
