package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/xplat/payment/sdk/CardPaymentSystem;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "AmericanExpress", "DinersClub", "DiscoverCard", "JCB", "HUMO", "Maestro", "MasterCard", "MIR", "UnionPay", "Uzcard", "VISA", "VISA_ELECTRON", "UNKNOWN", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardPaymentSystem {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardPaymentSystem[] $VALUES;
    public static final CardPaymentSystem AmericanExpress;
    public static final CardPaymentSystem DinersClub;
    public static final CardPaymentSystem DiscoverCard;
    public static final CardPaymentSystem HUMO;
    public static final CardPaymentSystem JCB;
    public static final CardPaymentSystem MIR;
    public static final CardPaymentSystem Maestro;
    public static final CardPaymentSystem MasterCard;
    public static final CardPaymentSystem UNKNOWN;
    public static final CardPaymentSystem UnionPay;
    public static final CardPaymentSystem Uzcard;
    public static final CardPaymentSystem VISA;
    public static final CardPaymentSystem VISA_ELECTRON;
    private final String value;

    static {
        CardPaymentSystem cardPaymentSystem = new CardPaymentSystem("AmericanExpress", 0, "AmericanExpress");
        AmericanExpress = cardPaymentSystem;
        CardPaymentSystem cardPaymentSystem2 = new CardPaymentSystem("DinersClub", 1, "DinersClub");
        DinersClub = cardPaymentSystem2;
        CardPaymentSystem cardPaymentSystem3 = new CardPaymentSystem("DiscoverCard", 2, "DiscoverCard");
        DiscoverCard = cardPaymentSystem3;
        CardPaymentSystem cardPaymentSystem4 = new CardPaymentSystem("JCB", 3, "JCB");
        JCB = cardPaymentSystem4;
        CardPaymentSystem cardPaymentSystem5 = new CardPaymentSystem("HUMO", 4, "HUMO");
        HUMO = cardPaymentSystem5;
        CardPaymentSystem cardPaymentSystem6 = new CardPaymentSystem("Maestro", 5, "Maestro");
        Maestro = cardPaymentSystem6;
        CardPaymentSystem cardPaymentSystem7 = new CardPaymentSystem("MasterCard", 6, "MasterCard");
        MasterCard = cardPaymentSystem7;
        CardPaymentSystem cardPaymentSystem8 = new CardPaymentSystem("MIR", 7, "MIR");
        MIR = cardPaymentSystem8;
        CardPaymentSystem cardPaymentSystem9 = new CardPaymentSystem("UnionPay", 8, "UnionPay");
        UnionPay = cardPaymentSystem9;
        CardPaymentSystem cardPaymentSystem10 = new CardPaymentSystem("Uzcard", 9, "Uzcard");
        Uzcard = cardPaymentSystem10;
        CardPaymentSystem cardPaymentSystem11 = new CardPaymentSystem("VISA", 10, "VISA");
        VISA = cardPaymentSystem11;
        CardPaymentSystem cardPaymentSystem12 = new CardPaymentSystem("VISA_ELECTRON", 11, "VISA_ELECTRON");
        VISA_ELECTRON = cardPaymentSystem12;
        CardPaymentSystem cardPaymentSystem13 = new CardPaymentSystem("UNKNOWN", 12, "unknown");
        UNKNOWN = cardPaymentSystem13;
        CardPaymentSystem[] cardPaymentSystemArr = {cardPaymentSystem, cardPaymentSystem2, cardPaymentSystem3, cardPaymentSystem4, cardPaymentSystem5, cardPaymentSystem6, cardPaymentSystem7, cardPaymentSystem8, cardPaymentSystem9, cardPaymentSystem10, cardPaymentSystem11, cardPaymentSystem12, cardPaymentSystem13};
        $VALUES = cardPaymentSystemArr;
        $ENTRIES = a.a(cardPaymentSystemArr);
    }

    public CardPaymentSystem(String str, int i, String str2) {
        this.value = str2;
    }

    public static CardPaymentSystem valueOf(String str) {
        return (CardPaymentSystem) Enum.valueOf(CardPaymentSystem.class, str);
    }

    public static CardPaymentSystem[] values() {
        return (CardPaymentSystem[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
