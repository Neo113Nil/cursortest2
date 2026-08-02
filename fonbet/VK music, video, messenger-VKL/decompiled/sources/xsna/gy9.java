package xsna;

import android.content.Context;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.api.router.models.CartCounterState;
import com.vk.ecomm.cart.impl.cart.CartFragment;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CartRouterImpl.kt */
/* loaded from: classes.dex */
public final class gy9 implements fy9 {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new vv8(1));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fy9
    public final void b(Context context, UserId userId, CartCounterState cartCounterState, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
        wv9 wv9Var = (wv9) this.a.getValue();
        UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
        wv9Var.a(commonMarketStat$TypeRefSource, uiTrackingScreen != null ? uiTrackingScreen.a : null);
        new CartFragment.a(userId, cartCounterState).k(context);
    }
}
