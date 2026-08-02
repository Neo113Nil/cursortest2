package defpackage;

import com.yandex.plus.pay.api.exception.PlusPayPaymentGatewayErrorKind;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class krd {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlusPayPaymentGatewayErrorKind.values().length];
        try {
            iArr[PlusPayPaymentGatewayErrorKind.PAYMENT_TIMEOUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.BLACKLISTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.EXPIRED_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.USER_CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.RESTRICTED_CARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.FAIL_3DS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.NOT_ENOUGH_FUNDS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.INVALID_XRF_TOKEN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.OPERATION_CANCELLED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.AUTH_REJECT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.TIMEOUT_NO_SUCCESS.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.TRANSACTION_NOT_PERMITTED.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.LIMIT_EXCEEDED.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.UNEXPECTED.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.UNKNOWN.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        a = iArr;
    }
}
