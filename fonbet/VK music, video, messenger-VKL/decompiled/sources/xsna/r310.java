package xsna;

import android.content.Context;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.api.analytics.MarketAnalyticsAdCampaign;
import com.vk.ecomm.market.api.analytics.MarketCtaButtonAnalyticsParams;
import com.vk.ecomm.market.api.dto.OwnerResponseTime;
import com.vk.stat.scheme.CommonMarketStat$TypeAdCampaign;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketTransitionToOzonReviewsItem;
import com.vk.stat.scheme.CommonMarketStat$TypeOzonClick;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: MarketItemReviewsClickListener.kt */
/* loaded from: classes18.dex */
public final class r310 implements i780 {
    public final Context a;
    public final cxo b;
    public final CommonMarketStat$TypeRefSource c;
    public final maz d;

    public r310(Context context, cxo cxoVar, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, maz mazVar) {
        this.a = context;
        this.b = cxoVar;
        this.c = commonMarketStat$TypeRefSource;
        this.d = mazVar;
    }

    @Override // xsna.i780
    public final void a() {
        String str;
        cxo cxoVar = this.b;
        h8u h8uVar = cxoVar.J;
        if (h8uVar == null || (str = h8uVar.n) == null) {
            return;
        }
        maz.c(cxoVar.a.b(), this.a, str, LaunchContext.A, null, null, 24);
    }

    @Override // xsna.i780
    public final void b(String str) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        String queryParameter = jeq0.g(str).getQueryParameter("click_id");
        String queryParameter2 = jeq0.g(str).getQueryParameter("advRef");
        cxo cxoVar = this.b;
        cxoVar.a.e().getClass();
        GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = cxoVar.g;
        Good good = cxoVar.r;
        if (good != null && (mobileOfficialAppsCoreNavStat$EventScreen = cxoVar.h) != null) {
            MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType = MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CTA_LINK;
            long j = good.b;
            UserId userId = good.c;
            String str2 = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null;
            Long l = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.g : null;
            Integer num = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.b : null;
            Integer num2 = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.c : null;
            MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.e : null;
            Long l2 = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.d : null;
            String str3 = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.h : null;
            OwnerResponseTime ownerResponseTime = cxoVar.W;
            Integer valueOf = ownerResponseTime != null ? Integer.valueOf((int) ownerResponseTime.b) : null;
            String str4 = cxoVar.d0;
            MarketCtaButtonAnalyticsParams marketCtaButtonAnalyticsParams = new MarketCtaButtonAnalyticsParams(eventType, j, userId, str2, this.c, mobileOfficialAppsCoreNavStat$EventScreen, l, num, num2, mobileOfficialAppsMarketStat$ReferrerItemType, l2, null, str3, valueOf, null, null, null, (str4 == null || str4.length() == 0) ? null : MarketAnalyticsAdCampaign.AFFILIATE_PROGRAM.h(), queryParameter2, queryParameter, null, 1165312, null);
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(marketCtaButtonAnalyticsParams.c), Long.valueOf(marketCtaButtonAnalyticsParams.d.b), null, marketCtaButtonAnalyticsParams.e, null, 40, null);
            Integer num3 = marketCtaButtonAnalyticsParams.i;
            Integer b = num3 != null ? v11.b(1, num3) : null;
            CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign = new CommonMarketStat$TypeAdCampaign(null, marketCtaButtonAnalyticsParams.s, null, null, null, marketCtaButtonAnalyticsParams.t, 29, null);
            String str5 = marketCtaButtonAnalyticsParams.u;
            SchemeStat$TypeClick a = SchemeStat$TypeClick.a.a(schemeStat$EventItem, b, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, marketCtaButtonAnalyticsParams.g, marketCtaButtonAnalyticsParams.f, null, marketCtaButtonAnalyticsParams.n, new CommonMarketStat$TypeMarketTransitionToOzonReviewsItem(commonMarketStat$TypeAdCampaign, str5 != null ? new CommonMarketStat$TypeOzonClick(str5) : null), 41));
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, a, uzp0Var.a).q();
        }
        maz.c(this.d, this.a, str, LaunchContext.A, null, null, 24);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.i780
    public final void c() {
        cxo cxoVar = this.b;
        Good good = cxoVar.r;
        if (good != null) {
            cxoVar.j = true;
            ((ajg0) cxoVar.a.S.getValue()).p(this.a, good.b, good.c, null, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.i780
    public final void d() {
        cxo cxoVar = this.b;
        u310 u310Var = (u310) cxoVar.a.T.getValue();
        h8u h8uVar = cxoVar.J;
        u310Var.j(h8uVar != null ? Integer.valueOf(h8uVar.h) : null, h8uVar != null ? h8uVar.f : null);
        Good good = cxoVar.r;
        if (good != null) {
            cxoVar.j = true;
            ((ajg0) cxoVar.a.S.getValue()).l(this.a, good.b, good.c, null);
        }
    }
}
