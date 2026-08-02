package com.yandex.go.payments.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/ui/PaymentIconInfoType;", "", "CARD_BANK_NAME", "SBP_TOKEN_BANK_NAME", "ICON_TAG", "ICON_URL", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentIconInfoType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentIconInfoType[] $VALUES;
    public static final PaymentIconInfoType CARD_BANK_NAME;
    public static final PaymentIconInfoType ICON_TAG;
    public static final PaymentIconInfoType ICON_URL;
    public static final PaymentIconInfoType SBP_TOKEN_BANK_NAME;

    static {
        PaymentIconInfoType paymentIconInfoType = new PaymentIconInfoType("CARD_BANK_NAME", 0);
        CARD_BANK_NAME = paymentIconInfoType;
        PaymentIconInfoType paymentIconInfoType2 = new PaymentIconInfoType("SBP_TOKEN_BANK_NAME", 1);
        SBP_TOKEN_BANK_NAME = paymentIconInfoType2;
        PaymentIconInfoType paymentIconInfoType3 = new PaymentIconInfoType("ICON_TAG", 2);
        ICON_TAG = paymentIconInfoType3;
        PaymentIconInfoType paymentIconInfoType4 = new PaymentIconInfoType("ICON_URL", 3);
        ICON_URL = paymentIconInfoType4;
        PaymentIconInfoType[] paymentIconInfoTypeArr = {paymentIconInfoType, paymentIconInfoType2, paymentIconInfoType3, paymentIconInfoType4};
        $VALUES = paymentIconInfoTypeArr;
        $ENTRIES = a.a(paymentIconInfoTypeArr);
    }

    public static PaymentIconInfoType valueOf(String str) {
        return (PaymentIconInfoType) Enum.valueOf(PaymentIconInfoType.class, str);
    }

    public static PaymentIconInfoType[] values() {
        return (PaymentIconInfoType[]) $VALUES.clone();
    }
}
