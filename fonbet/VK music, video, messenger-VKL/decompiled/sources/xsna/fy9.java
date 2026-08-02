package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.api.router.models.CartCounterState;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;

/* compiled from: CartRouter.kt */
/* loaded from: classes.dex */
public interface fy9 {
    static /* synthetic */ void a(fy9 fy9Var, Context context, UserId userId, CartCounterState cartCounterState, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, int i) {
        if ((i & 2) != 0) {
            userId = null;
        }
        if ((i & 4) != 0) {
            cartCounterState = null;
        }
        if ((i & 8) != 0) {
            commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.MARKETPLACE;
        }
        fy9Var.b(context, userId, cartCounterState, commonMarketStat$TypeRefSource);
    }

    void b(Context context, UserId userId, CartCounterState cartCounterState, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource);
}
