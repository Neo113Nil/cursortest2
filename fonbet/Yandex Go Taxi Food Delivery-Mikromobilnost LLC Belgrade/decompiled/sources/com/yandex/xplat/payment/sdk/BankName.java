package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/xplat/payment/sdk/BankName;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "AlfaBank", "SberBank", "Tinkoff", "Vtb", "GazpromBank", "BankOfMoscow", "OpenBank", "PromsvyazBank", "RosBank", "Qiwi", "CitiBank", "UnicreditBank", "RaiffeisenBank", "UnknownBank", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BankName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BankName[] $VALUES;
    public static final BankName AlfaBank;
    public static final BankName BankOfMoscow;
    public static final BankName CitiBank;
    public static final BankName GazpromBank;
    public static final BankName OpenBank;
    public static final BankName PromsvyazBank;
    public static final BankName Qiwi;
    public static final BankName RaiffeisenBank;
    public static final BankName RosBank;
    public static final BankName SberBank;
    public static final BankName Tinkoff;
    public static final BankName UnicreditBank;
    public static final BankName UnknownBank;
    public static final BankName Vtb;
    private final String value;

    static {
        BankName bankName = new BankName("AlfaBank", 0, "AlfaBank");
        AlfaBank = bankName;
        BankName bankName2 = new BankName("SberBank", 1, "SberBank");
        SberBank = bankName2;
        BankName bankName3 = new BankName("Tinkoff", 2, "Tinkoff");
        Tinkoff = bankName3;
        BankName bankName4 = new BankName("Vtb", 3, "Vtb");
        Vtb = bankName4;
        BankName bankName5 = new BankName("GazpromBank", 4, "GazpromBank");
        GazpromBank = bankName5;
        BankName bankName6 = new BankName("BankOfMoscow", 5, "BankOfMoscow");
        BankOfMoscow = bankName6;
        BankName bankName7 = new BankName("OpenBank", 6, "OpenBank");
        OpenBank = bankName7;
        BankName bankName8 = new BankName("PromsvyazBank", 7, "PromsvyazBank");
        PromsvyazBank = bankName8;
        BankName bankName9 = new BankName("RosBank", 8, "RosBank");
        RosBank = bankName9;
        BankName bankName10 = new BankName("Qiwi", 9, "Qiwi");
        Qiwi = bankName10;
        BankName bankName11 = new BankName("CitiBank", 10, "CitiBank");
        CitiBank = bankName11;
        BankName bankName12 = new BankName("UnicreditBank", 11, "UnicreditBank");
        UnicreditBank = bankName12;
        BankName bankName13 = new BankName("RaiffeisenBank", 12, "RaiffeisenBank");
        RaiffeisenBank = bankName13;
        BankName bankName14 = new BankName("UnknownBank", 13, "UnknownBank");
        UnknownBank = bankName14;
        BankName[] bankNameArr = {bankName, bankName2, bankName3, bankName4, bankName5, bankName6, bankName7, bankName8, bankName9, bankName10, bankName11, bankName12, bankName13, bankName14};
        $VALUES = bankNameArr;
        $ENTRIES = a.a(bankNameArr);
    }

    public BankName(String str, int i, String str2) {
        this.value = str2;
    }

    public static BankName valueOf(String str) {
        return (BankName) Enum.valueOf(BankName.class, str);
    }

    public static BankName[] values() {
        return (BankName[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
