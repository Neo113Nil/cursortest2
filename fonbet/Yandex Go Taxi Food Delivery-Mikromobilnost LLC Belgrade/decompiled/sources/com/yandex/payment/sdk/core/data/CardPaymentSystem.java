package com.yandex.payment.sdk.core.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/payment/sdk/core/data/CardPaymentSystem;", "", "AmericanExpress", "DinersClub", "DiscoverCard", "JCB", "HUMO", "Maestro", "MasterCard", "MIR", "UnionPay", "Uzcard", "Visa", "VisaElectron", "Unknown", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static final CardPaymentSystem UnionPay;
    public static final CardPaymentSystem Unknown;
    public static final CardPaymentSystem Uzcard;
    public static final CardPaymentSystem Visa;
    public static final CardPaymentSystem VisaElectron;

    static {
        CardPaymentSystem cardPaymentSystem = new CardPaymentSystem("AmericanExpress", 0);
        AmericanExpress = cardPaymentSystem;
        CardPaymentSystem cardPaymentSystem2 = new CardPaymentSystem("DinersClub", 1);
        DinersClub = cardPaymentSystem2;
        CardPaymentSystem cardPaymentSystem3 = new CardPaymentSystem("DiscoverCard", 2);
        DiscoverCard = cardPaymentSystem3;
        CardPaymentSystem cardPaymentSystem4 = new CardPaymentSystem("JCB", 3);
        JCB = cardPaymentSystem4;
        CardPaymentSystem cardPaymentSystem5 = new CardPaymentSystem("HUMO", 4);
        HUMO = cardPaymentSystem5;
        CardPaymentSystem cardPaymentSystem6 = new CardPaymentSystem("Maestro", 5);
        Maestro = cardPaymentSystem6;
        CardPaymentSystem cardPaymentSystem7 = new CardPaymentSystem("MasterCard", 6);
        MasterCard = cardPaymentSystem7;
        CardPaymentSystem cardPaymentSystem8 = new CardPaymentSystem("MIR", 7);
        MIR = cardPaymentSystem8;
        CardPaymentSystem cardPaymentSystem9 = new CardPaymentSystem("UnionPay", 8);
        UnionPay = cardPaymentSystem9;
        CardPaymentSystem cardPaymentSystem10 = new CardPaymentSystem("Uzcard", 9);
        Uzcard = cardPaymentSystem10;
        CardPaymentSystem cardPaymentSystem11 = new CardPaymentSystem("Visa", 10);
        Visa = cardPaymentSystem11;
        CardPaymentSystem cardPaymentSystem12 = new CardPaymentSystem("VisaElectron", 11);
        VisaElectron = cardPaymentSystem12;
        CardPaymentSystem cardPaymentSystem13 = new CardPaymentSystem("Unknown", 12);
        Unknown = cardPaymentSystem13;
        CardPaymentSystem[] cardPaymentSystemArr = {cardPaymentSystem, cardPaymentSystem2, cardPaymentSystem3, cardPaymentSystem4, cardPaymentSystem5, cardPaymentSystem6, cardPaymentSystem7, cardPaymentSystem8, cardPaymentSystem9, cardPaymentSystem10, cardPaymentSystem11, cardPaymentSystem12, cardPaymentSystem13};
        $VALUES = cardPaymentSystemArr;
        $ENTRIES = kotlin.enums.a.a(cardPaymentSystemArr);
    }

    public static CardPaymentSystem valueOf(String str) {
        return (CardPaymentSystem) Enum.valueOf(CardPaymentSystem.class, str);
    }

    public static CardPaymentSystem[] values() {
        return (CardPaymentSystem[]) $VALUES.clone();
    }
}
