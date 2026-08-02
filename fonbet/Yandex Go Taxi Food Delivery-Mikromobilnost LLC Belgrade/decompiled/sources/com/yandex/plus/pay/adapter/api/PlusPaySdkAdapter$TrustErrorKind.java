package com.yandex.plus.pay.adapter.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"com/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$TrustErrorKind", "", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$TrustErrorKind;", "PAYMENT_TIMEOUT", "BLACKLISTED", "EXPIRED_CARD", "USER_CANCELLED", "RESTRICTED_CARD", "FAIL_3DS", "NOT_ENOUGH_FUNDS", "INVALID_XRF_TOKEN", "OPERATION_CANCELLED", "AUTH_REJECT", "TIMEOUT_NO_SUCCESS", "TRANSACTION_NOT_PERMITTED", "LIMIT_EXCEEDED", "FAIL_PAYMENT_PARSING", "UNEXPECTED", "UNKNOWN", "plus-home-pay-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPaySdkAdapter$TrustErrorKind {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPaySdkAdapter$TrustErrorKind[] $VALUES;
    public static final PlusPaySdkAdapter$TrustErrorKind AUTH_REJECT;
    public static final PlusPaySdkAdapter$TrustErrorKind BLACKLISTED;
    public static final PlusPaySdkAdapter$TrustErrorKind EXPIRED_CARD;
    public static final PlusPaySdkAdapter$TrustErrorKind FAIL_3DS;
    public static final PlusPaySdkAdapter$TrustErrorKind FAIL_PAYMENT_PARSING;
    public static final PlusPaySdkAdapter$TrustErrorKind INVALID_XRF_TOKEN;
    public static final PlusPaySdkAdapter$TrustErrorKind LIMIT_EXCEEDED;
    public static final PlusPaySdkAdapter$TrustErrorKind NOT_ENOUGH_FUNDS;
    public static final PlusPaySdkAdapter$TrustErrorKind OPERATION_CANCELLED;
    public static final PlusPaySdkAdapter$TrustErrorKind PAYMENT_TIMEOUT;
    public static final PlusPaySdkAdapter$TrustErrorKind RESTRICTED_CARD;
    public static final PlusPaySdkAdapter$TrustErrorKind TIMEOUT_NO_SUCCESS;
    public static final PlusPaySdkAdapter$TrustErrorKind TRANSACTION_NOT_PERMITTED;
    public static final PlusPaySdkAdapter$TrustErrorKind UNEXPECTED;
    public static final PlusPaySdkAdapter$TrustErrorKind UNKNOWN;
    public static final PlusPaySdkAdapter$TrustErrorKind USER_CANCELLED;

    static {
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind = new PlusPaySdkAdapter$TrustErrorKind("PAYMENT_TIMEOUT", 0);
        PAYMENT_TIMEOUT = plusPaySdkAdapter$TrustErrorKind;
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind2 = new PlusPaySdkAdapter$TrustErrorKind("BLACKLISTED", 1);
        BLACKLISTED = plusPaySdkAdapter$TrustErrorKind2;
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind3 = new PlusPaySdkAdapter$TrustErrorKind("EXPIRED_CARD", 2);
        EXPIRED_CARD = plusPaySdkAdapter$TrustErrorKind3;
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind4 = new PlusPaySdkAdapter$TrustErrorKind("USER_CANCELLED", 3);
        USER_CANCELLED = plusPaySdkAdapter$TrustErrorKind4;
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind5 = new PlusPaySdkAdapter$TrustErrorKind("RESTRICTED_CARD", 4);
        RESTRICTED_CARD = plusPaySdkAdapter$TrustErrorKind5;
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind6 = new PlusPaySdkAdapter$TrustErrorKind("FAIL_3DS", 5);
        FAIL_3DS = plusPaySdkAdapter$TrustErrorKind6;
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind7 = new PlusPaySdkAdapter$TrustErrorKind("NOT_ENOUGH_FUNDS", 6);
        NOT_ENOUGH_FUNDS = plusPaySdkAdapter$TrustErrorKind7;
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind8 = new PlusPaySdkAdapter$TrustErrorKind("INVALID_XRF_TOKEN", 7);
        INVALID_XRF_TOKEN = plusPaySdkAdapter$TrustErrorKind8;
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind9 = new PlusPaySdkAdapter$TrustErrorKind("OPERATION_CANCELLED", 8);
        OPERATION_CANCELLED = plusPaySdkAdapter$TrustErrorKind9;
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind10 = new PlusPaySdkAdapter$TrustErrorKind("AUTH_REJECT", 9);
        AUTH_REJECT = plusPaySdkAdapter$TrustErrorKind10;
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind11 = new PlusPaySdkAdapter$TrustErrorKind("TIMEOUT_NO_SUCCESS", 10);
        TIMEOUT_NO_SUCCESS = plusPaySdkAdapter$TrustErrorKind11;
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind12 = new PlusPaySdkAdapter$TrustErrorKind("TRANSACTION_NOT_PERMITTED", 11);
        TRANSACTION_NOT_PERMITTED = plusPaySdkAdapter$TrustErrorKind12;
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind13 = new PlusPaySdkAdapter$TrustErrorKind("LIMIT_EXCEEDED", 12);
        LIMIT_EXCEEDED = plusPaySdkAdapter$TrustErrorKind13;
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind14 = new PlusPaySdkAdapter$TrustErrorKind("FAIL_PAYMENT_PARSING", 13);
        FAIL_PAYMENT_PARSING = plusPaySdkAdapter$TrustErrorKind14;
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind15 = new PlusPaySdkAdapter$TrustErrorKind("UNEXPECTED", 14);
        UNEXPECTED = plusPaySdkAdapter$TrustErrorKind15;
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind16 = new PlusPaySdkAdapter$TrustErrorKind("UNKNOWN", 15);
        UNKNOWN = plusPaySdkAdapter$TrustErrorKind16;
        PlusPaySdkAdapter$TrustErrorKind[] plusPaySdkAdapter$TrustErrorKindArr = {plusPaySdkAdapter$TrustErrorKind, plusPaySdkAdapter$TrustErrorKind2, plusPaySdkAdapter$TrustErrorKind3, plusPaySdkAdapter$TrustErrorKind4, plusPaySdkAdapter$TrustErrorKind5, plusPaySdkAdapter$TrustErrorKind6, plusPaySdkAdapter$TrustErrorKind7, plusPaySdkAdapter$TrustErrorKind8, plusPaySdkAdapter$TrustErrorKind9, plusPaySdkAdapter$TrustErrorKind10, plusPaySdkAdapter$TrustErrorKind11, plusPaySdkAdapter$TrustErrorKind12, plusPaySdkAdapter$TrustErrorKind13, plusPaySdkAdapter$TrustErrorKind14, plusPaySdkAdapter$TrustErrorKind15, plusPaySdkAdapter$TrustErrorKind16};
        $VALUES = plusPaySdkAdapter$TrustErrorKindArr;
        $ENTRIES = kotlin.enums.a.a(plusPaySdkAdapter$TrustErrorKindArr);
    }

    public static PlusPaySdkAdapter$TrustErrorKind valueOf(String str) {
        return (PlusPaySdkAdapter$TrustErrorKind) Enum.valueOf(PlusPaySdkAdapter$TrustErrorKind.class, str);
    }

    public static PlusPaySdkAdapter$TrustErrorKind[] values() {
        return (PlusPaySdkAdapter$TrustErrorKind[]) $VALUES.clone();
    }
}
