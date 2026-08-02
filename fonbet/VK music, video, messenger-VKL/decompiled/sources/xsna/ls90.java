package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.ecomm.orders.impl.common.model.OrderSnackbar;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: PaymentErrorToSnackbarMapper.kt */
/* loaded from: classes18.dex */
public final class ls90 {
    public static OrderSnackbar a(Throwable th) {
        int i;
        tlo0.a aVar = tlo0.Companion;
        if (th instanceof VKApiExecutionException) {
            VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
            if (vKApiExecutionException.s() == 1436 || vKApiExecutionException.J()) {
                i = R.string.ecomm_orders_payment_failure_access_denied;
                return new OrderSnackbar(tq.h(aVar, i), OrderSnackbar.Style.Error);
            }
        }
        i = sv1.u(th) ? R.string.ecomm_orders_payment_failure_internet : R.string.ecomm_orders_payment_failure_abstract;
        return new OrderSnackbar(tq.h(aVar, i), OrderSnackbar.Style.Error);
    }
}
