package defpackage;

import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$PaymentFlowErrorReason;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$TrustErrorKind;
import com.yandex.plus.pay.ui.api.feature.payment.PlusPaymentFlowErrorReason;

/* loaded from: classes2.dex */
public abstract class lrd {
    public static final yed0 a(bpd0 bpd0Var) {
        PlusPaySdkAdapter$PaymentFlowErrorReason paymentMethodSelection;
        PlusPaySdkAdapter$TrustErrorKind plusPaySdkAdapter$TrustErrorKind;
        if (bpd0Var instanceof apd0) {
            return xed0.a;
        }
        if (bpd0Var instanceof yod0) {
            return ved0.a;
        }
        if (!(bpd0Var instanceof zod0)) {
            w511.b();
            return null;
        }
        PlusPaymentFlowErrorReason plusPaymentFlowErrorReason = ((zod0) bpd0Var).a;
        if (plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.Backend) {
            switch (krd.a[((PlusPaymentFlowErrorReason.Backend) plusPaymentFlowErrorReason).getKind().ordinal()]) {
                case 1:
                    plusPaySdkAdapter$TrustErrorKind = PlusPaySdkAdapter$TrustErrorKind.PAYMENT_TIMEOUT;
                    break;
                case 2:
                    plusPaySdkAdapter$TrustErrorKind = PlusPaySdkAdapter$TrustErrorKind.BLACKLISTED;
                    break;
                case 3:
                    plusPaySdkAdapter$TrustErrorKind = PlusPaySdkAdapter$TrustErrorKind.EXPIRED_CARD;
                    break;
                case 4:
                    plusPaySdkAdapter$TrustErrorKind = PlusPaySdkAdapter$TrustErrorKind.USER_CANCELLED;
                    break;
                case 5:
                    plusPaySdkAdapter$TrustErrorKind = PlusPaySdkAdapter$TrustErrorKind.RESTRICTED_CARD;
                    break;
                case 6:
                    plusPaySdkAdapter$TrustErrorKind = PlusPaySdkAdapter$TrustErrorKind.FAIL_3DS;
                    break;
                case 7:
                    plusPaySdkAdapter$TrustErrorKind = PlusPaySdkAdapter$TrustErrorKind.NOT_ENOUGH_FUNDS;
                    break;
                case 8:
                    plusPaySdkAdapter$TrustErrorKind = PlusPaySdkAdapter$TrustErrorKind.INVALID_XRF_TOKEN;
                    break;
                case 9:
                    plusPaySdkAdapter$TrustErrorKind = PlusPaySdkAdapter$TrustErrorKind.OPERATION_CANCELLED;
                    break;
                case 10:
                    plusPaySdkAdapter$TrustErrorKind = PlusPaySdkAdapter$TrustErrorKind.AUTH_REJECT;
                    break;
                case 11:
                    plusPaySdkAdapter$TrustErrorKind = PlusPaySdkAdapter$TrustErrorKind.TIMEOUT_NO_SUCCESS;
                    break;
                case 12:
                    plusPaySdkAdapter$TrustErrorKind = PlusPaySdkAdapter$TrustErrorKind.TRANSACTION_NOT_PERMITTED;
                    break;
                case 13:
                    plusPaySdkAdapter$TrustErrorKind = PlusPaySdkAdapter$TrustErrorKind.LIMIT_EXCEEDED;
                    break;
                case 14:
                    plusPaySdkAdapter$TrustErrorKind = PlusPaySdkAdapter$TrustErrorKind.UNEXPECTED;
                    break;
                case 15:
                    plusPaySdkAdapter$TrustErrorKind = PlusPaySdkAdapter$TrustErrorKind.UNKNOWN;
                    break;
                default:
                    w511.b();
                    return null;
            }
            paymentMethodSelection = new PlusPaySdkAdapter$PaymentFlowErrorReason.Backend(plusPaySdkAdapter$TrustErrorKind);
        } else if (plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.GooglePlay) {
            paymentMethodSelection = PlusPaySdkAdapter$PaymentFlowErrorReason.Unexpected.INSTANCE;
        } else if (plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.Unexpected) {
            paymentMethodSelection = PlusPaySdkAdapter$PaymentFlowErrorReason.Unexpected.INSTANCE;
        } else if (plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.Connection) {
            paymentMethodSelection = PlusPaySdkAdapter$PaymentFlowErrorReason.Connection.INSTANCE;
        } else if (plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.Unauthorized) {
            paymentMethodSelection = PlusPaySdkAdapter$PaymentFlowErrorReason.Unauthorized.INSTANCE;
        } else {
            if (!(plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.PaymentMethodSelection)) {
                w511.b();
                return null;
            }
            paymentMethodSelection = new PlusPaySdkAdapter$PaymentFlowErrorReason.PaymentMethodSelection(((PlusPaymentFlowErrorReason.PaymentMethodSelection) plusPaymentFlowErrorReason).getErrorState());
        }
        return new wed0(paymentMethodSelection);
    }
}
