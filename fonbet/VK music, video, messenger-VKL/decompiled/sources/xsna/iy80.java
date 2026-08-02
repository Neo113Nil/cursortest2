package xsna;

import android.content.Context;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.orders.api.model.ReviewSuggestion;
import com.vk.ecomm.orders.impl.order.presentation.OrderArguments;
import com.vk.ecomm.orders.impl.order.presentation.OrderFragment;
import com.vk.ecomm.orders.impl.orderlist.presentation.OrderListFragment;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketOrdersItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: OrdersRouterImpl.kt */
/* loaded from: classes.dex */
public final class iy80 implements hy80 {
    @Override // xsna.hy80
    public final void a(Context context, UserId userId, int i, String str) {
        new OrderFragment.a(new OrderArguments(userId, i, str)).k(context);
    }

    @Override // xsna.hy80
    public final void c(Context context, ReviewSuggestion reviewSuggestion) {
        new OrderListFragment.a(reviewSuggestion).k(context);
    }

    @Override // xsna.hy80
    public final Class<? extends FragmentImpl> d() {
        return OrderListFragment.class;
    }

    @Override // xsna.hy80
    public final void e(Context context, UserId userId, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonMarketStat$TypeMarketOrdersItem.Source source) {
        mt00.j(userId != null ? Long.valueOf(fkq0.e(userId).b) : null, mobileOfficialAppsCoreNavStat$EventScreen, source);
        new OrderListFragment.a().k(context);
    }
}
