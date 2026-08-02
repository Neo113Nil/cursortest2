package defpackage;

import com.yandex.plus.pay.api.exception.PlusPayPaymentGatewayErrorKind;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;

/* loaded from: classes2.dex */
public abstract class ddd0 {
    public static final PlusPayPaymentGatewayErrorKind a(PlusPayInvoice.Payment payment) {
        PlusPayInvoice.Payment.ErrorStatusCode errorStatusCode = payment != null ? payment.getErrorStatusCode() : null;
        switch (errorStatusCode == null ? -1 : cdd0.a[errorStatusCode.ordinal()]) {
            case 1:
                return PlusPayPaymentGatewayErrorKind.PAYMENT_TIMEOUT;
            case 2:
                return PlusPayPaymentGatewayErrorKind.BLACKLISTED;
            case 3:
                return PlusPayPaymentGatewayErrorKind.EXPIRED_CARD;
            case 4:
                return PlusPayPaymentGatewayErrorKind.USER_CANCELLED;
            case 5:
                return PlusPayPaymentGatewayErrorKind.RESTRICTED_CARD;
            case 6:
                return PlusPayPaymentGatewayErrorKind.FAIL_3DS;
            case 7:
                return PlusPayPaymentGatewayErrorKind.NOT_ENOUGH_FUNDS;
            case 8:
                return PlusPayPaymentGatewayErrorKind.INVALID_XRF_TOKEN;
            case 9:
                return PlusPayPaymentGatewayErrorKind.OPERATION_CANCELLED;
            case 10:
                return PlusPayPaymentGatewayErrorKind.AUTH_REJECT;
            case 11:
                return PlusPayPaymentGatewayErrorKind.TIMEOUT_NO_SUCCESS;
            case 12:
                return PlusPayPaymentGatewayErrorKind.TRANSACTION_NOT_PERMITTED;
            case 13:
                return PlusPayPaymentGatewayErrorKind.LIMIT_EXCEEDED;
            case 14:
                return PlusPayPaymentGatewayErrorKind.UNEXPECTED;
            default:
                return PlusPayPaymentGatewayErrorKind.UNKNOWN;
        }
    }
}
