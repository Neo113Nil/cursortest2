package xsna;

import android.content.Context;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.ecomm.product_list.model.ProductListItem;
import com.vk.ecomm.product_list.model.ProductListParams;
import com.vk.ecomm.product_list.model.ProductListRefSource;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.ArrayList;

/* compiled from: MessageProductsNavigationHelper.kt */
/* loaded from: classes2.dex */
public final class ya20 {
    public final kqd0 a;
    public final sz00 b;

    public ya20(kqd0 kqd0Var, sz00 sz00Var) {
        this.a = kqd0Var;
        this.b = sz00Var;
    }

    public final void a(Context context, uh30 uh30Var) {
        long j = uh30Var.b.b;
        int i = uh30Var.a;
        ArrayList<th30> arrayList = uh30Var.d;
        if (arrayList.size() > 1) {
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            for (th30 th30Var : arrayList) {
                arrayList2.add(new ProductListItem(th30Var.e, th30Var.d, th30Var.c));
            }
            this.a.a(context, new ProductListParams(arrayList2, ProductListRefSource.IM_CHAT_CLIP, Integer.valueOf(i), Long.valueOf(j), uh30Var.c));
            return;
        }
        th30 th30Var2 = (th30) j5g.a0(arrayList);
        if (th30Var2 == null) {
            return;
        }
        MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.EntryPoint entryPoint = MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.EntryPoint.PRODUCT_SNIPPET;
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(th30Var2.a), Long.valueOf(th30Var2.b.b), null, null, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick(entryPoint, null, uh30Var.c), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
        this.b.d(context, new qz00(th30Var2.a, th30Var2.b, CommonMarketStat$TypeRefSource.IM_CHAT_CLIP, null, null, null, null, null, null, th30Var2.c, CommonMarketStat$TypeMarketContextContent.Type.CLIP, Integer.valueOf(i), Long.valueOf(j), 987128));
    }
}
