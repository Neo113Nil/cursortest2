package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.analytics.MarketCtaButtonAnalyticsParams;
import com.vk.stat.scheme.CommonMarketStat$RatingType;
import com.vk.stat.scheme.CommonMarketStat$TypeAdCampaign;
import com.vk.stat.scheme.CommonMarketStat$TypeItemReviewSendReviewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketItemRatingItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketItemReviewClick;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketItemReviewView;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketTransitionToOzonReviewsItem;
import com.vk.stat.scheme.CommonMarketStat$TypeOzonClick;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.gzp0;
import xsna.hzp0;

/* compiled from: MarketItemReviewsFacadeImpl.kt */
/* loaded from: classes18.dex */
public final class v310 implements u310 {
    public static void o(Long l, Long l2, CommonMarketStat$TypeMarketItemReviewView.b bVar, Integer num, q110 q110Var) {
        new hzp0.y(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, l, l2, null, null, null, 56, null), CommonMarketStat$TypeMarketItemReviewView.a.a(CommonMarketStat$RatingType.ITEM, null, null, l2, q110Var != null ? q110Var.a : null, q110Var != null ? q110Var.b : null, q110Var != null ? q110Var.c : null, num, bVar, 14)).a();
    }

    @Override // xsna.u310
    public final void a(long j, long j2) {
        new hzp0.g0(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(j), Long.valueOf(j2), null, null, null, 56, null), MobileOfficialAppsMarketStat$TypeMarketView.a.b(null, null, null, new CommonMarketStat$TypeMarketItemRatingItem(CommonMarketStat$RatingType.OZON_ITEM, null, null, 6, null), 31), MobileOfficialAppsCoreNavStat$EventScreen.OZON_REVIEWS_LIST).a();
    }

    @Override // xsna.u310
    public final void b(Integer num, q110 q110Var) {
        com.vk.stat.scheme.e eVar = new com.vk.stat.scheme.e();
        gzp0.a.c(CommonMarketStat$TypeMarketItemReviewClick.a.a(CommonMarketStat$RatingType.ITEM, q110Var != null ? q110Var.a : null, q110Var != null ? q110Var.b : null, q110Var != null ? q110Var.c : null, null, null, num, eVar, 198));
    }

    @Override // xsna.u310
    public final void c(Long l, long j, Integer num, q110 q110Var) {
        o(l, Long.valueOf(j), new com.vk.stat.scheme.l(), num, q110Var);
    }

    @Override // xsna.u310
    public final void d(q110 q110Var) {
        new hzp0.y(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, q110Var.e, q110Var.d, null, null, null, 56, null), CommonMarketStat$TypeMarketItemReviewView.a.a(CommonMarketStat$RatingType.ITEM, q110Var.f, q110Var.g, q110Var.d, null, null, null, null, new com.vk.stat.scheme.n(), 488)).a();
    }

    @Override // xsna.u310
    public final void e(int i) {
        o(null, null, new com.vk.stat.scheme.u(), Integer.valueOf(i), null);
    }

    @Override // xsna.u310
    public final void f(Float f, Integer num, q110 q110Var, Integer num2, Integer num3, Integer num4) {
        CommonMarketStat$TypeItemReviewSendReviewItem commonMarketStat$TypeItemReviewSendReviewItem = new CommonMarketStat$TypeItemReviewSendReviewItem(Integer.valueOf((int) f.floatValue()), null, num2, null, num3, null, num4, 42, null);
        gzp0.a.c(CommonMarketStat$TypeMarketItemReviewClick.a.a(CommonMarketStat$RatingType.ITEM, q110Var != null ? q110Var.a : null, q110Var != null ? q110Var.b : null, q110Var != null ? q110Var.c : null, null, null, num, commonMarketStat$TypeItemReviewSendReviewItem, 198));
    }

    @Override // xsna.u310
    public final void g(String str, MarketCtaButtonAnalyticsParams marketCtaButtonAnalyticsParams) {
        Integer num;
        UserId userId;
        String queryParameter = jeq0.g(str).getQueryParameter("click_id");
        String queryParameter2 = jeq0.g(str).getQueryParameter("advRef");
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.OZON_REVIEWS_LIST;
        SchemeStat$TypeClick a = SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, marketCtaButtonAnalyticsParams != null ? Long.valueOf(marketCtaButtonAnalyticsParams.c) : null, (marketCtaButtonAnalyticsParams == null || (userId = marketCtaButtonAnalyticsParams.d) == null) ? null : Long.valueOf(userId.b), null, marketCtaButtonAnalyticsParams != null ? marketCtaButtonAnalyticsParams.e : null, null, 40, null), (marketCtaButtonAnalyticsParams == null || (num = marketCtaButtonAnalyticsParams.i) == null) ? null : v11.b(1, num), MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, marketCtaButtonAnalyticsParams != null ? marketCtaButtonAnalyticsParams.g : null, marketCtaButtonAnalyticsParams != null ? marketCtaButtonAnalyticsParams.f : null, null, marketCtaButtonAnalyticsParams != null ? marketCtaButtonAnalyticsParams.n : null, new CommonMarketStat$TypeMarketTransitionToOzonReviewsItem(new CommonMarketStat$TypeAdCampaign(null, marketCtaButtonAnalyticsParams != null ? marketCtaButtonAnalyticsParams.s : null, null, null, null, queryParameter2, 29, null), new CommonMarketStat$TypeOzonClick(queryParameter)), 41));
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(mobileOfficialAppsCoreNavStat$EventScreen, a, uzp0Var.a).q();
    }

    @Override // xsna.u310
    public final void h(Long l, long j, Integer num, q110 q110Var) {
        o(l, Long.valueOf(j), new com.vk.stat.scheme.k(), num, q110Var);
    }

    @Override // xsna.u310
    public final void i(Long l, long j, Integer num, q110 q110Var) {
        o(l, Long.valueOf(j), new com.vk.stat.scheme.f(), num, q110Var);
    }

    @Override // xsna.u310
    public final void j(Integer num, Float f) {
        gzp0.a.c(CommonMarketStat$TypeMarketItemReviewClick.a.a(CommonMarketStat$RatingType.ITEM, null, null, null, f, num, null, new com.vk.stat.scheme.c(), 6));
    }

    @Override // xsna.u310
    public final void k(Integer num, q110 q110Var) {
        com.vk.stat.scheme.g gVar = new com.vk.stat.scheme.g();
        gzp0.a.c(CommonMarketStat$TypeMarketItemReviewClick.a.a(CommonMarketStat$RatingType.ITEM, q110Var != null ? q110Var.a : null, q110Var != null ? q110Var.b : null, q110Var != null ? q110Var.c : null, null, null, num, gVar, 198));
    }

    @Override // xsna.u310
    public final void l(Long l, long j, Integer num, q110 q110Var) {
        o(l, Long.valueOf(j), new com.vk.stat.scheme.h(), num, q110Var);
    }

    @Override // xsna.u310
    public final void m(Long l, long j, Integer num, q110 q110Var) {
        o(l, Long.valueOf(j), new com.vk.stat.scheme.i(), num, q110Var);
    }

    @Override // xsna.u310
    public final void n(Integer num, q110 q110Var) {
        com.vk.stat.scheme.d dVar = new com.vk.stat.scheme.d();
        gzp0.a.c(CommonMarketStat$TypeMarketItemReviewClick.a.a(CommonMarketStat$RatingType.ITEM, q110Var != null ? q110Var.a : null, q110Var != null ? q110Var.b : null, q110Var != null ? q110Var.c : null, null, null, num, dVar, 198));
    }
}
