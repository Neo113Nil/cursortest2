package defpackage;

import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import com.yandex.plus.pay.repository.api.model.invoice.Invoice$Payment$ErrorStatusCode;

/* loaded from: classes2.dex */
public final class fdd0 {
    public fdd0(oed0 oed0Var) {
    }

    public final PlusPayInvoice a(kxw kxwVar) {
        PlusPayInvoice.Status status;
        PlusPayInvoice.Payment payment;
        PlusPayInvoice.Payment.ErrorStatusCode errorStatusCode;
        String str = kxwVar.a;
        switch (edd0.a[kxwVar.b.ordinal()]) {
            case 1:
                status = PlusPayInvoice.Status.CANCELLED;
                break;
            case 2:
                status = PlusPayInvoice.Status.CREATED;
                break;
            case 3:
                status = PlusPayInvoice.Status.CREATED_LEGACY;
                break;
            case 4:
                status = PlusPayInvoice.Status.FAILED;
                break;
            case 5:
                status = PlusPayInvoice.Status.PROVISION_SCHEDULED;
                break;
            case 6:
                status = PlusPayInvoice.Status.SCHEDULED;
                break;
            case 7:
                status = PlusPayInvoice.Status.STARTED;
                break;
            case 8:
                status = PlusPayInvoice.Status.SUCCESS;
                break;
            case 9:
                status = PlusPayInvoice.Status.WAIT_FOR_3DS;
                break;
            case 10:
                status = PlusPayInvoice.Status.WAIT_FOR_NOTIFICATION;
                break;
            case 11:
                status = PlusPayInvoice.Status.UNKNOWN;
                break;
            default:
                w511.b();
                return null;
        }
        String str2 = kxwVar.c;
        PlusPayPrice a = oed0.a(kxwVar.d);
        exw exwVar = kxwVar.e;
        if (exwVar != null) {
            String str3 = exwVar.a;
            Invoice$Payment$ErrorStatusCode invoice$Payment$ErrorStatusCode = exwVar.b;
            if (invoice$Payment$ErrorStatusCode != null) {
                switch (edd0.b[invoice$Payment$ErrorStatusCode.ordinal()]) {
                    case 1:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.PAYMENT_TIMEOUT;
                        break;
                    case 2:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.BLACKLISTED;
                        break;
                    case 3:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.EXPIRED_CARD;
                        break;
                    case 4:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.USER_CANCELLED;
                        break;
                    case 5:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.RESTRICTED_CARD;
                        break;
                    case 6:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.FAIL_3DS;
                        break;
                    case 7:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.NOT_ENOUGH_FUNDS;
                        break;
                    case 8:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.INVALID_XRF_TOKEN;
                        break;
                    case 9:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.OPERATION_CANCELLED;
                        break;
                    case 10:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.AUTH_REJECT;
                        break;
                    case 11:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.TIMEOUT_NO_SUCCESS;
                        break;
                    case 12:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.TRANSACTION_NOT_PERMITTED;
                        break;
                    case 13:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.LIMIT_EXCEEDED;
                        break;
                    case 14:
                        errorStatusCode = PlusPayInvoice.Payment.ErrorStatusCode.UNEXPECTED;
                        break;
                    default:
                        w511.b();
                        return null;
                }
            } else {
                errorStatusCode = null;
            }
            payment = new PlusPayInvoice.Payment(str3, errorStatusCode, exwVar.c, exwVar.d);
        } else {
            payment = null;
        }
        PlusPayPrice a2 = oed0.a(kxwVar.f);
        String str4 = kxwVar.g;
        gxw gxwVar = kxwVar.h;
        PlusPayInvoice.PollingConfiguration pollingConfiguration = new PlusPayInvoice.PollingConfiguration(gxwVar.a, gxwVar.b);
        ixw ixwVar = kxwVar.i;
        return new PlusPayInvoice(str, status, str2, a, payment, a2, str4, pollingConfiguration, ixwVar != null ? new PlusPayInvoice.WebWidgetQrCodeParams(ixwVar.a, ixwVar.b) : null);
    }
}
