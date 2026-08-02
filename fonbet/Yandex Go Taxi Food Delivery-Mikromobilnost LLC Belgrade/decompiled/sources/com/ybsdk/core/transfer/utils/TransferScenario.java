package com.ybsdk.core.transfer.utils;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/core/transfer/utils/TransferScenario;", "", "<init>", "(Ljava/lang/String;I)V", "PHONE", "SELF", "REQUISITES", "MOBILE_PAYMENT", "INTERNET_PAYMENT", "C2G", "FUND", "SAVERS_TOPUP", "TIPS", "INVOICE_HCS", "CROSS_BORDER", "MKK_CASHOUT", "B2C_TRANSFER", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransferScenario {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferScenario[] $VALUES;
    public static final TransferScenario PHONE = new TransferScenario("PHONE", 0);
    public static final TransferScenario SELF = new TransferScenario("SELF", 1);
    public static final TransferScenario REQUISITES = new TransferScenario("REQUISITES", 2);
    public static final TransferScenario MOBILE_PAYMENT = new TransferScenario("MOBILE_PAYMENT", 3);
    public static final TransferScenario INTERNET_PAYMENT = new TransferScenario("INTERNET_PAYMENT", 4);
    public static final TransferScenario C2G = new TransferScenario("C2G", 5);
    public static final TransferScenario FUND = new TransferScenario("FUND", 6);
    public static final TransferScenario SAVERS_TOPUP = new TransferScenario("SAVERS_TOPUP", 7);
    public static final TransferScenario TIPS = new TransferScenario("TIPS", 8);
    public static final TransferScenario INVOICE_HCS = new TransferScenario("INVOICE_HCS", 9);
    public static final TransferScenario CROSS_BORDER = new TransferScenario("CROSS_BORDER", 10);
    public static final TransferScenario MKK_CASHOUT = new TransferScenario("MKK_CASHOUT", 11);
    public static final TransferScenario B2C_TRANSFER = new TransferScenario("B2C_TRANSFER", 12);

    private static final /* synthetic */ TransferScenario[] $values() {
        return new TransferScenario[]{PHONE, SELF, REQUISITES, MOBILE_PAYMENT, INTERNET_PAYMENT, C2G, FUND, SAVERS_TOPUP, TIPS, INVOICE_HCS, CROSS_BORDER, MKK_CASHOUT, B2C_TRANSFER};
    }

    static {
        TransferScenario[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransferScenario(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferScenario valueOf(String str) {
        return (TransferScenario) Enum.valueOf(TransferScenario.class, str);
    }

    public static TransferScenario[] values() {
        return (TransferScenario[]) $VALUES.clone();
    }
}
