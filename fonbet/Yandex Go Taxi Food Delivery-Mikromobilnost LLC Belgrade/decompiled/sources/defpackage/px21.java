package defpackage;

import com.yandex.plus.pay.api.exception.PlusPayApiException;
import com.yandex.plus.pay.api.exception.PlusPayNetworkException;
import com.yandex.plus.pay.api.exception.PlusPayParseException;
import com.yandex.plus.pay.api.exception.PlusPaySslException;
import com.yandex.plus.pay.api.exception.PlusPayUnauthorizedException;
import com.yandex.plus.pay.ui.api.feature.payment.PlusPaymentFlowErrorReason;

/* loaded from: classes2.dex */
public abstract class px21 {
    public static final PlusPaymentFlowErrorReason a(Throwable th) {
        return ((th instanceof PlusPayApiException) || (th instanceof PlusPayParseException) || (th instanceof PlusPaySslException)) ? PlusPaymentFlowErrorReason.Unexpected.INSTANCE : th instanceof PlusPayUnauthorizedException ? PlusPaymentFlowErrorReason.Unauthorized.INSTANCE : th instanceof PlusPayNetworkException ? PlusPaymentFlowErrorReason.Connection.INSTANCE : PlusPaymentFlowErrorReason.Unexpected.INSTANCE;
    }
}
