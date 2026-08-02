package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.ui.UIBlockSearchQuickFilter;
import com.vk.catalog2.common.ui.holders.search.FiltersWithSearchResultVh;
import com.vk.dto.search.SearchQuickFilterItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stickers.details.AuthorSubscriptionRef;
import xsna.e0z0;
import xsna.w9m0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class pgr implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pgr(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                FiltersWithSearchResultVh filtersWithSearchResultVh = (FiltersWithSearchResultVh) obj2;
                UIBlockSearchQuickFilter uIBlockSearchQuickFilter = (UIBlockSearchQuickFilter) obj;
                com.vk.catalog2.common.ui.holders.search.b bVar = com.vk.catalog2.common.ui.holders.search.b.a;
                String str = uIBlockSearchQuickFilter.y;
                SearchQuickFilterItem searchQuickFilterItem = uIBlockSearchQuickFilter.A;
                com.vk.catalog2.common.ui.holders.search.b.c(searchQuickFilterItem.h ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.CLOSE_FILTER : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP, str);
                filtersWithSearchResultVh.a();
                filtersWithSearchResultVh.b.q7(searchQuickFilterItem.d, uIBlockSearchQuickFilter, filtersWithSearchResultVh.e);
                break;
            case 1:
                ((pl20) obj2).l.b(((ol20) obj).b);
                break;
            case 2:
                v690 v690Var = (v690) obj2;
                v690Var.l.m0(r0.b.b, MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE_OUT);
                kbj0.c(nr4.b(), v690Var.itemView.getContext(), ((u690) obj).b.D, false, null, null, false, 120);
                break;
            case 3:
                ((ybf0) obj2).l.N((StickerStockItem) obj, AuthorSubscriptionRef.PACK_RECOMMENDATIONS_AUTHOR_PACKS);
                break;
            case 4:
                ((v9m0) obj2).l.invoke(((w9m0.a) obj).g);
                break;
            default:
                b520 b520Var = (b520) obj;
                xw70 xw70Var = ((ajy0) obj2).c;
                if (xw70Var != null) {
                    ((kpy0) ((e0z0.a) xw70Var.c)).c(b520Var);
                    break;
                }
                break;
        }
    }
}
