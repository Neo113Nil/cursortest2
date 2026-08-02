package defpackage;

import com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState;
import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.api.feature.payment.PlusPaymentFlowErrorReason;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class dio {
    public static final PayUIEvgenAnalytics$PaymentOption a(PlusPayCompositeOffers.Offer offer) {
        int i = cio.a[tpd.b(offer).ordinal()];
        if (i == 1) {
            return PayUIEvgenAnalytics$PaymentOption.InApp;
        }
        if (i == 2) {
            return PayUIEvgenAnalytics$PaymentOption.Native;
        }
        if (i == 3) {
            return null;
        }
        w511.b();
        return null;
    }

    public static final xz4 b(PlusTarifficatorPurchase.Source source, PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams) {
        int i = cio.b[source.ordinal()];
        if (i == 1) {
            return plusPayPaymentAnalyticsParams != null ? new iad0(plusPayPaymentAnalyticsParams.getClientPlace(), plusPayPaymentAnalyticsParams.getClientPage()) : new iad0(null, null);
        }
        if (i == 2) {
            return jad0.c;
        }
        if (i == 3) {
            return gad0.c;
        }
        if (i == 4) {
            return had0.c;
        }
        if (i == 5) {
            return kad0.c;
        }
        w511.b();
        return null;
    }

    public static final String c(PlusPaymentFlowErrorReason plusPaymentFlowErrorReason) {
        if (plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.PaymentMethodSelection) {
            PlusSelectPaymentMethodState.Error errorState = ((PlusPaymentFlowErrorReason.PaymentMethodSelection) plusPaymentFlowErrorReason).getErrorState();
            return "card_selection_error: kind: " + errorState.getKind() + ", trigger: " + errorState.getTrigger() + ", code: " + errorState.getCode() + ", status: " + errorState.getStatus() + ", message: " + errorState.getMessage();
        }
        if (plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.Connection) {
            return "connection_error";
        }
        if (plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.Backend) {
            return "backend_error: ".concat(((PlusPaymentFlowErrorReason.Backend) plusPaymentFlowErrorReason).getKind().name().toLowerCase(Locale.ROOT));
        }
        if (plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.GooglePlay) {
            return "google_error: ".concat(((PlusPaymentFlowErrorReason.GooglePlay) plusPaymentFlowErrorReason).getKind().name().toLowerCase(Locale.ROOT));
        }
        if (plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.Unexpected) {
            return "unexpected_error";
        }
        if (plusPaymentFlowErrorReason instanceof PlusPaymentFlowErrorReason.Unauthorized) {
            return "unauthorized";
        }
        w511.b();
        return null;
    }

    public static final String d(UUID uuid) {
        return uuid.toString().toUpperCase(Locale.ROOT);
    }

    public static final PayUIEvgenAnalytics$SourceType e(PlusTarifficatorPurchase.Source source) {
        return cio.b[source.ordinal()] == 1 ? PayUIEvgenAnalytics$SourceType.External : PayUIEvgenAnalytics$SourceType.Internal;
    }
}
