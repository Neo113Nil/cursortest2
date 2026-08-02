package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vkontakte.android.R;

/* compiled from: CheckoutCreateOrderErrorMapper.kt */
/* loaded from: classes18.dex */
public final class l4c {
    public static u8k0 a(Throwable th) {
        if (th instanceof VKApiExecutionException) {
            int s = ((VKApiExecutionException) th).s();
            Integer valueOf = s != 1427 ? s != 1428 ? s != 1437 ? s != 1439 ? null : Integer.valueOf(R.string.ecomm_checkout_error_product_out_of_stock) : Integer.valueOf(R.string.ecomm_checkout_error_required_field_is_empty) : Integer.valueOf(R.string.ecomm_checkout_error_less_than_min_sum) : Integer.valueOf(R.string.ecomm_checkout_error_empty_cart);
            if (valueOf != null) {
                return new u8k0(tq.h(tlo0.Companion, valueOf.intValue()), null);
            }
        }
        return null;
    }
}
