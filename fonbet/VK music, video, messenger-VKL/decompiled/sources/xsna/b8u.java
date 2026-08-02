package xsna;

import com.vk.stat.scheme.CommonMarketStat$RatingType;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketItemRatingItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import xsna.hzp0;

/* compiled from: GoodReviewsAnalyticsFacadeImpl.kt */
/* loaded from: classes18.dex */
public final class b8u implements a8u {
    @Override // xsna.a8u
    public final void a(long j, long j2) {
        Float f = null;
        new hzp0.g0(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(j), Long.valueOf(j2), null, null, null, 56, null), MobileOfficialAppsMarketStat$TypeMarketView.a.b(null, null, null, new CommonMarketStat$TypeMarketItemRatingItem(CommonMarketStat$RatingType.OZON_ITEM, f, null, 6, null), 31), null).a();
    }
}
