package com.yandex.plus.pay.api.exception;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/plus/pay/api/exception/PlusPayPaymentGatewayErrorKind;", "", "PAYMENT_TIMEOUT", "BLACKLISTED", "EXPIRED_CARD", "USER_CANCELLED", "RESTRICTED_CARD", "FAIL_3DS", "NOT_ENOUGH_FUNDS", "INVALID_XRF_TOKEN", "OPERATION_CANCELLED", "AUTH_REJECT", "TIMEOUT_NO_SUCCESS", "TRANSACTION_NOT_PERMITTED", "LIMIT_EXCEEDED", "UNEXPECTED", "UNKNOWN", "pay-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayPaymentGatewayErrorKind {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusPayPaymentGatewayErrorKind[] $VALUES;
    public static final PlusPayPaymentGatewayErrorKind AUTH_REJECT;
    public static final PlusPayPaymentGatewayErrorKind BLACKLISTED;
    public static final PlusPayPaymentGatewayErrorKind EXPIRED_CARD;
    public static final PlusPayPaymentGatewayErrorKind FAIL_3DS;
    public static final PlusPayPaymentGatewayErrorKind INVALID_XRF_TOKEN;
    public static final PlusPayPaymentGatewayErrorKind LIMIT_EXCEEDED;
    public static final PlusPayPaymentGatewayErrorKind NOT_ENOUGH_FUNDS;
    public static final PlusPayPaymentGatewayErrorKind OPERATION_CANCELLED;
    public static final PlusPayPaymentGatewayErrorKind PAYMENT_TIMEOUT;
    public static final PlusPayPaymentGatewayErrorKind RESTRICTED_CARD;
    public static final PlusPayPaymentGatewayErrorKind TIMEOUT_NO_SUCCESS;
    public static final PlusPayPaymentGatewayErrorKind TRANSACTION_NOT_PERMITTED;
    public static final PlusPayPaymentGatewayErrorKind UNEXPECTED;
    public static final PlusPayPaymentGatewayErrorKind UNKNOWN;
    public static final PlusPayPaymentGatewayErrorKind USER_CANCELLED;

    static {
        PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind = new PlusPayPaymentGatewayErrorKind("PAYMENT_TIMEOUT", 0);
        PAYMENT_TIMEOUT = plusPayPaymentGatewayErrorKind;
        PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind2 = new PlusPayPaymentGatewayErrorKind("BLACKLISTED", 1);
        BLACKLISTED = plusPayPaymentGatewayErrorKind2;
        PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind3 = new PlusPayPaymentGatewayErrorKind("EXPIRED_CARD", 2);
        EXPIRED_CARD = plusPayPaymentGatewayErrorKind3;
        PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind4 = new PlusPayPaymentGatewayErrorKind("USER_CANCELLED", 3);
        USER_CANCELLED = plusPayPaymentGatewayErrorKind4;
        PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind5 = new PlusPayPaymentGatewayErrorKind("RESTRICTED_CARD", 4);
        RESTRICTED_CARD = plusPayPaymentGatewayErrorKind5;
        PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind6 = new PlusPayPaymentGatewayErrorKind("FAIL_3DS", 5);
        FAIL_3DS = plusPayPaymentGatewayErrorKind6;
        PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind7 = new PlusPayPaymentGatewayErrorKind("NOT_ENOUGH_FUNDS", 6);
        NOT_ENOUGH_FUNDS = plusPayPaymentGatewayErrorKind7;
        PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind8 = new PlusPayPaymentGatewayErrorKind("INVALID_XRF_TOKEN", 7);
        INVALID_XRF_TOKEN = plusPayPaymentGatewayErrorKind8;
        PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind9 = new PlusPayPaymentGatewayErrorKind("OPERATION_CANCELLED", 8);
        OPERATION_CANCELLED = plusPayPaymentGatewayErrorKind9;
        PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind10 = new PlusPayPaymentGatewayErrorKind("AUTH_REJECT", 9);
        AUTH_REJECT = plusPayPaymentGatewayErrorKind10;
        PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind11 = new PlusPayPaymentGatewayErrorKind("TIMEOUT_NO_SUCCESS", 10);
        TIMEOUT_NO_SUCCESS = plusPayPaymentGatewayErrorKind11;
        PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind12 = new PlusPayPaymentGatewayErrorKind("TRANSACTION_NOT_PERMITTED", 11);
        TRANSACTION_NOT_PERMITTED = plusPayPaymentGatewayErrorKind12;
        PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind13 = new PlusPayPaymentGatewayErrorKind("LIMIT_EXCEEDED", 12);
        LIMIT_EXCEEDED = plusPayPaymentGatewayErrorKind13;
        PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind14 = new PlusPayPaymentGatewayErrorKind("UNEXPECTED", 13);
        UNEXPECTED = plusPayPaymentGatewayErrorKind14;
        PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind15 = new PlusPayPaymentGatewayErrorKind("UNKNOWN", 14);
        UNKNOWN = plusPayPaymentGatewayErrorKind15;
        PlusPayPaymentGatewayErrorKind[] plusPayPaymentGatewayErrorKindArr = {plusPayPaymentGatewayErrorKind, plusPayPaymentGatewayErrorKind2, plusPayPaymentGatewayErrorKind3, plusPayPaymentGatewayErrorKind4, plusPayPaymentGatewayErrorKind5, plusPayPaymentGatewayErrorKind6, plusPayPaymentGatewayErrorKind7, plusPayPaymentGatewayErrorKind8, plusPayPaymentGatewayErrorKind9, plusPayPaymentGatewayErrorKind10, plusPayPaymentGatewayErrorKind11, plusPayPaymentGatewayErrorKind12, plusPayPaymentGatewayErrorKind13, plusPayPaymentGatewayErrorKind14, plusPayPaymentGatewayErrorKind15};
        $VALUES = plusPayPaymentGatewayErrorKindArr;
        $ENTRIES = a.a(plusPayPaymentGatewayErrorKindArr);
    }

    public static PlusPayPaymentGatewayErrorKind valueOf(String str) {
        return (PlusPayPaymentGatewayErrorKind) Enum.valueOf(PlusPayPaymentGatewayErrorKind.class, str);
    }

    public static PlusPayPaymentGatewayErrorKind[] values() {
        return (PlusPayPaymentGatewayErrorKind[]) $VALUES.clone();
    }
}
