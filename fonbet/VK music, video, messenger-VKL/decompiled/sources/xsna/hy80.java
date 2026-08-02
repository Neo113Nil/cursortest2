package xsna;

import android.content.Context;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.orders.api.model.ReviewSuggestion;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketOrdersItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: OrdersRouter.kt */
/* loaded from: classes.dex */
public interface hy80 {
    void a(Context context, UserId userId, int i, String str);

    void c(Context context, ReviewSuggestion reviewSuggestion);

    Class<? extends FragmentImpl> d();

    void e(Context context, UserId userId, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonMarketStat$TypeMarketOrdersItem.Source source);
}
