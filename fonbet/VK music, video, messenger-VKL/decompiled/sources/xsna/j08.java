package xsna;

import com.vk.dto.common.Good;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;

/* compiled from: BookmarksAnalyticsDelegate.kt */
/* loaded from: classes4.dex */
public final class j08 {
    public static void a(u1c0 u1c0Var) {
        NewsEntry newsEntry = u1c0Var.a;
        FaveEntry faveEntry = newsEntry instanceof FaveEntry ? (FaveEntry) newsEntry : null;
        if (faveEntry != null) {
            gmq gmqVar = faveEntry.i.f;
            int i = u1c0Var.k - 1;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.BOOKMARKS;
            FaveMarketItem faveMarketItem = gmqVar instanceof FaveMarketItem ? (FaveMarketItem) gmqVar : null;
            if (faveMarketItem != null) {
                Good good = faveMarketItem.b;
                mt00.d(Long.valueOf(good.b), Long.valueOf(good.c.b), Integer.valueOf(i), commonMarketStat$TypeRefSource, null, null, null, null, null, null, null, null, null, null, 32752);
            }
        }
    }
}
