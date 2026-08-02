package xsna;

import com.vk.ecomm.cart.impl.common.models.exception.MapServicesNotSuppoertedException;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: MapErrorsToErrorModelMapper.kt */
/* loaded from: classes18.dex */
public final class fl00 {
    public static mw9 a(Throwable th) {
        return th instanceof MapServicesNotSuppoertedException ? new mw9(tq.h(tlo0.Companion, R.string.ecomm_delivery_points_error), new tlo0.f(R.string.ecomm_delivery_points_error_map_services_not_supported), (tlo0.f) null, 8) : new mw9(false, tq.h(tlo0.Companion, R.string.ecomm_checkout_error_abstract_title), new tlo0.f(R.string.ecomm_checkout_error_try_again_subtitle), (tlo0) new tlo0.f(R.string.ecomm_checkout_retry));
    }
}
