package defpackage;

import com.yandex.payment.sdk.core.data.PaymentKitError;

/* loaded from: classes2.dex */
public abstract class iu11 {
    public static final Integer a(PaymentKitError paymentKitError) {
        PaymentKitError.Kind6_6_0 kind6_6_0 = paymentKitError.getKind6_6_0();
        if ((kind6_6_0 == null ? -1 : hu11.a[kind6_6_0.ordinal()]) == 1) {
            return Integer.valueOf(ryh0.paymentsdk_error_sbp_token_binding_duplicate_hint);
        }
        return null;
    }

    public static final int b(PaymentKitError paymentKitError, int i) {
        if (paymentKitError.getKind6_6_0() == null) {
            switch (hu11.b[paymentKitError.getKind().ordinal()]) {
                case 1:
                    return ryh0.paymentsdk_error_too_many_cards;
                case 2:
                    return ryh0.paymentsdk_error_fail_3ds;
                case 3:
                    return ryh0.paymentsdk_error_expired_card;
                case 4:
                    return ryh0.paymentsdk_error_invalid_processing_request;
                case 5:
                    return ryh0.paymentsdk_error_limit_exceeded;
                case 6:
                    return ryh0.paymentsdk_error_not_enough_funds;
                case 7:
                    return ryh0.paymentsdk_error_payment_authorization_reject;
                case 8:
                    return ryh0.paymentsdk_error_payment_cancelled;
                case 9:
                    return ryh0.paymentsdk_error_technical_error;
                case 10:
                    return ryh0.paymentsdk_error_payment_timeout;
                case 11:
                    return ryh0.paymentsdk_error_promocode_already_used;
                case 12:
                    return ryh0.paymentsdk_error_restricted_card;
                case 13:
                    return ryh0.paymentsdk_error_transaction_not_permitted;
                case 14:
                    return ryh0.paymentsdk_error_user_cancelled;
                case 15:
                    xry0 xry0Var = yry0.a;
                    return yry0.a.p;
                case 16:
                    return ryh0.paymentsdk_sbp_banks_not_found;
                case 17:
                    return ryh0.paymentsdk_method_not_available;
                case 18:
                    return ryh0.paymentsdk_sbp_bank_app_failed_open;
                case 19:
                    return ryh0.paymentsdk_sbp_failed_load_bank_list;
            }
        }
        PaymentKitError.Kind6_6_0 kind6_6_0 = paymentKitError.getKind6_6_0();
        if ((kind6_6_0 == null ? -1 : hu11.a[kind6_6_0.ordinal()]) == 1) {
            return ryh0.paymentsdk_error_sbp_token_binding_duplicate;
        }
        return i;
    }
}
