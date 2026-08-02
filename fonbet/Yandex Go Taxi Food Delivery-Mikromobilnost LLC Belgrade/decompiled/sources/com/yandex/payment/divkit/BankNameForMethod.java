package com.yandex.payment.divkit;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/payment/divkit/BankNameForMethod;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "scheme", "a", "SBERBANK", "VTB", "GAZPROM", "UNKNOWN", "TINKOFF", "ALPHA_BANK", "OPEN_BANK", "PROMSVYAZ", "ROSBANK", "UNICREDIT_BANK", "RAIFFEISEN_BANK", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BankNameForMethod {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BankNameForMethod[] $VALUES;
    public static final BankNameForMethod ALPHA_BANK;
    public static final BankNameForMethod GAZPROM;
    public static final BankNameForMethod OPEN_BANK;
    public static final BankNameForMethod PROMSVYAZ;
    public static final BankNameForMethod RAIFFEISEN_BANK;
    public static final BankNameForMethod ROSBANK;
    public static final BankNameForMethod SBERBANK;
    public static final BankNameForMethod TINKOFF;
    public static final BankNameForMethod UNICREDIT_BANK;
    public static final BankNameForMethod UNKNOWN;
    public static final BankNameForMethod VTB;
    private final String scheme;
    private final String value;

    static {
        BankNameForMethod bankNameForMethod = new BankNameForMethod("SBERBANK", 0, "sberbank", "bank100000000111");
        SBERBANK = bankNameForMethod;
        BankNameForMethod bankNameForMethod2 = new BankNameForMethod("VTB", 1, "vtb", "bank110000000005");
        VTB = bankNameForMethod2;
        BankNameForMethod bankNameForMethod3 = new BankNameForMethod("GAZPROM", 2, "gazprom", "bank100000000001");
        GAZPROM = bankNameForMethod3;
        BankNameForMethod bankNameForMethod4 = new BankNameForMethod("UNKNOWN", 3, "unknown", "");
        UNKNOWN = bankNameForMethod4;
        BankNameForMethod bankNameForMethod5 = new BankNameForMethod("TINKOFF", 4, "tinkoff", "bank100000000004");
        TINKOFF = bankNameForMethod5;
        BankNameForMethod bankNameForMethod6 = new BankNameForMethod("ALPHA_BANK", 5, "alpha_bank", "bank100000000008");
        ALPHA_BANK = bankNameForMethod6;
        BankNameForMethod bankNameForMethod7 = new BankNameForMethod("OPEN_BANK", 6, "open_bank", "bank100000000015");
        OPEN_BANK = bankNameForMethod7;
        BankNameForMethod bankNameForMethod8 = new BankNameForMethod("PROMSVYAZ", 7, "promsvyaz", "bank100000000010");
        PROMSVYAZ = bankNameForMethod8;
        BankNameForMethod bankNameForMethod9 = new BankNameForMethod("ROSBANK", 8, "ros_bank", "bank100000000012");
        ROSBANK = bankNameForMethod9;
        BankNameForMethod bankNameForMethod10 = new BankNameForMethod("UNICREDIT_BANK", 9, "unicredit", "bank100000000030");
        UNICREDIT_BANK = bankNameForMethod10;
        BankNameForMethod bankNameForMethod11 = new BankNameForMethod("RAIFFEISEN_BANK", 10, "raiffeisen_bank", "bank100000000007");
        RAIFFEISEN_BANK = bankNameForMethod11;
        BankNameForMethod[] bankNameForMethodArr = {bankNameForMethod, bankNameForMethod2, bankNameForMethod3, bankNameForMethod4, bankNameForMethod5, bankNameForMethod6, bankNameForMethod7, bankNameForMethod8, bankNameForMethod9, bankNameForMethod10, bankNameForMethod11};
        $VALUES = bankNameForMethodArr;
        $ENTRIES = a.a(bankNameForMethodArr);
    }

    public BankNameForMethod(String str, int i, String str2, String str3) {
        this.value = str2;
        this.scheme = str3;
    }

    public static BankNameForMethod valueOf(String str) {
        return (BankNameForMethod) Enum.valueOf(BankNameForMethod.class, str);
    }

    public static BankNameForMethod[] values() {
        return (BankNameForMethod[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
