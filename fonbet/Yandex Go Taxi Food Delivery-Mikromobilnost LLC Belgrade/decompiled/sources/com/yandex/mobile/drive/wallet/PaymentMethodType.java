package com.yandex.mobile.drive.wallet;

import defpackage.jxi;
import defpackage.k4o;
import defpackage.v7a0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/mobile/drive/wallet/PaymentMethodType;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "v7a0", "CARD", "CREDIT_CARD", "SBP", "CORP_WALLET", "PLUS", "drive_wallet_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PaymentMethodType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodType[] $VALUES;
    public static final PaymentMethodType CARD;
    public static final PaymentMethodType CORP_WALLET;

    @jxi
    public static final PaymentMethodType CREDIT_CARD;
    public static final v7a0 Companion;
    public static final PaymentMethodType PLUS;
    public static final PaymentMethodType SBP;
    private final String value;

    static {
        PaymentMethodType paymentMethodType = new PaymentMethodType("CARD", 0, "card");
        CARD = paymentMethodType;
        PaymentMethodType paymentMethodType2 = new PaymentMethodType("CREDIT_CARD", 1, "credit_card");
        CREDIT_CARD = paymentMethodType2;
        PaymentMethodType paymentMethodType3 = new PaymentMethodType("SBP", 2, "sbp");
        SBP = paymentMethodType3;
        PaymentMethodType paymentMethodType4 = new PaymentMethodType("CORP_WALLET", 3, "wallet");
        CORP_WALLET = paymentMethodType4;
        PaymentMethodType paymentMethodType5 = new PaymentMethodType("PLUS", 4, "yandex_account");
        PLUS = paymentMethodType5;
        PaymentMethodType[] paymentMethodTypeArr = {paymentMethodType, paymentMethodType2, paymentMethodType3, paymentMethodType4, paymentMethodType5};
        $VALUES = paymentMethodTypeArr;
        $ENTRIES = a.a(paymentMethodTypeArr);
        Companion = new v7a0();
    }

    public PaymentMethodType(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static PaymentMethodType valueOf(String str) {
        return (PaymentMethodType) Enum.valueOf(PaymentMethodType.class, str);
    }

    public static PaymentMethodType[] values() {
        return (PaymentMethodType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
