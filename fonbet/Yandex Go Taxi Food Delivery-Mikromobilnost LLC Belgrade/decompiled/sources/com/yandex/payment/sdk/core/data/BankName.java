package com.yandex.payment.sdk.core.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/payment/sdk/core/data/BankName;", "", "AlfaBank", "SberBank", "Tinkoff", "Vtb", "GazpromBank", "BankOfMoscow", "OpenBank", "PromsvyazBank", "RosBank", "Qiwi", "CitiBank", "UnicreditBank", "RaiffeisenBank", "UnknownBank", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    static {
        BankName bankName = new BankName("AlfaBank", 0);
        AlfaBank = bankName;
        BankName bankName2 = new BankName("SberBank", 1);
        SberBank = bankName2;
        BankName bankName3 = new BankName("Tinkoff", 2);
        Tinkoff = bankName3;
        BankName bankName4 = new BankName("Vtb", 3);
        Vtb = bankName4;
        BankName bankName5 = new BankName("GazpromBank", 4);
        GazpromBank = bankName5;
        BankName bankName6 = new BankName("BankOfMoscow", 5);
        BankOfMoscow = bankName6;
        BankName bankName7 = new BankName("OpenBank", 6);
        OpenBank = bankName7;
        BankName bankName8 = new BankName("PromsvyazBank", 7);
        PromsvyazBank = bankName8;
        BankName bankName9 = new BankName("RosBank", 8);
        RosBank = bankName9;
        BankName bankName10 = new BankName("Qiwi", 9);
        Qiwi = bankName10;
        BankName bankName11 = new BankName("CitiBank", 10);
        CitiBank = bankName11;
        BankName bankName12 = new BankName("UnicreditBank", 11);
        UnicreditBank = bankName12;
        BankName bankName13 = new BankName("RaiffeisenBank", 12);
        RaiffeisenBank = bankName13;
        BankName bankName14 = new BankName("UnknownBank", 13);
        UnknownBank = bankName14;
        BankName[] bankNameArr = {bankName, bankName2, bankName3, bankName4, bankName5, bankName6, bankName7, bankName8, bankName9, bankName10, bankName11, bankName12, bankName13, bankName14};
        $VALUES = bankNameArr;
        $ENTRIES = kotlin.enums.a.a(bankNameArr);
    }

    public static BankName valueOf(String str) {
        return (BankName) Enum.valueOf(BankName.class, str);
    }

    public static BankName[] values() {
        return (BankName[]) $VALUES.clone();
    }
}
