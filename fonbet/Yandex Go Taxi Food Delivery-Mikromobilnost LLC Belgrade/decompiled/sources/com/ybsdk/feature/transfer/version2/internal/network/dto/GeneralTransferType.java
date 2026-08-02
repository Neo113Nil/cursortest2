package com.ybsdk.feature.transfer.version2.internal.network.dto;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/GeneralTransferType;", "", "<init>", "(Ljava/lang/String;I)V", "SELF", "SELF_TOPUP", "PHONE", "REQUISITES_PERSON", "REQUISITES_LEGAL", "ME2ME_TOPUP", "AFT_TOPUP", "MOBILE_PAYMENT", "INTERNET_PAYMENT", "SBP_C2G_BY_UIN", "REQUISITES_HCS", "FUND_DEBIT", "FUND_CREDIT", "INVOICE_HCS", "CROSS_BORDER_BY_PHONE", "SBP_B2C_CREDLIM", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GeneralTransferType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GeneralTransferType[] $VALUES;
    public static final GeneralTransferType SELF = new GeneralTransferType("SELF", 0);
    public static final GeneralTransferType SELF_TOPUP = new GeneralTransferType("SELF_TOPUP", 1);
    public static final GeneralTransferType PHONE = new GeneralTransferType("PHONE", 2);
    public static final GeneralTransferType REQUISITES_PERSON = new GeneralTransferType("REQUISITES_PERSON", 3);
    public static final GeneralTransferType REQUISITES_LEGAL = new GeneralTransferType("REQUISITES_LEGAL", 4);
    public static final GeneralTransferType ME2ME_TOPUP = new GeneralTransferType("ME2ME_TOPUP", 5);
    public static final GeneralTransferType AFT_TOPUP = new GeneralTransferType("AFT_TOPUP", 6);
    public static final GeneralTransferType MOBILE_PAYMENT = new GeneralTransferType("MOBILE_PAYMENT", 7);
    public static final GeneralTransferType INTERNET_PAYMENT = new GeneralTransferType("INTERNET_PAYMENT", 8);
    public static final GeneralTransferType SBP_C2G_BY_UIN = new GeneralTransferType("SBP_C2G_BY_UIN", 9);
    public static final GeneralTransferType REQUISITES_HCS = new GeneralTransferType("REQUISITES_HCS", 10);
    public static final GeneralTransferType FUND_DEBIT = new GeneralTransferType("FUND_DEBIT", 11);
    public static final GeneralTransferType FUND_CREDIT = new GeneralTransferType("FUND_CREDIT", 12);
    public static final GeneralTransferType INVOICE_HCS = new GeneralTransferType("INVOICE_HCS", 13);
    public static final GeneralTransferType CROSS_BORDER_BY_PHONE = new GeneralTransferType("CROSS_BORDER_BY_PHONE", 14);
    public static final GeneralTransferType SBP_B2C_CREDLIM = new GeneralTransferType("SBP_B2C_CREDLIM", 15);

    private static final /* synthetic */ GeneralTransferType[] $values() {
        return new GeneralTransferType[]{SELF, SELF_TOPUP, PHONE, REQUISITES_PERSON, REQUISITES_LEGAL, ME2ME_TOPUP, AFT_TOPUP, MOBILE_PAYMENT, INTERNET_PAYMENT, SBP_C2G_BY_UIN, REQUISITES_HCS, FUND_DEBIT, FUND_CREDIT, INVOICE_HCS, CROSS_BORDER_BY_PHONE, SBP_B2C_CREDLIM};
    }

    static {
        GeneralTransferType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private GeneralTransferType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static GeneralTransferType valueOf(String str) {
        return (GeneralTransferType) Enum.valueOf(GeneralTransferType.class, str);
    }

    public static GeneralTransferType[] values() {
        return (GeneralTransferType[]) $VALUES.clone();
    }
}
