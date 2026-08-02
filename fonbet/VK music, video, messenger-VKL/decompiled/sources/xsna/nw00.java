package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.ecomm.market.api.analytics.MarketCtaButtonAnalyticsParams;
import com.vk.stat.scheme.CommonMarketStat$TypeAdCampaign;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeOzonClick;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: MarketCtaButtonAnalytics.kt */
/* loaded from: classes18.dex */
public final class nw00 {
    public static void a(MarketCtaButtonAnalyticsParams marketCtaButtonAnalyticsParams) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(marketCtaButtonAnalyticsParams.c), Long.valueOf(marketCtaButtonAnalyticsParams.d.b), null, marketCtaButtonAnalyticsParams.e, null, 40, null);
        Integer num = marketCtaButtonAnalyticsParams.i;
        Integer b = num != null ? v11.b(1, num) : null;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = marketCtaButtonAnalyticsParams.g;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = marketCtaButtonAnalyticsParams.f;
        MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType = marketCtaButtonAnalyticsParams.b;
        Long l = marketCtaButtonAnalyticsParams.h;
        Integer b2 = num != null ? v11.b(1, num) : null;
        Integer num2 = marketCtaButtonAnalyticsParams.j;
        MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = marketCtaButtonAnalyticsParams.k;
        Long l2 = marketCtaButtonAnalyticsParams.l;
        String str = marketCtaButtonAnalyticsParams.m;
        Integer num3 = marketCtaButtonAnalyticsParams.o;
        CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent = new CommonMarketStat$TypeMarketContextContent(marketCtaButtonAnalyticsParams.r, marketCtaButtonAnalyticsParams.p, marketCtaButtonAnalyticsParams.q);
        CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign = new CommonMarketStat$TypeAdCampaign(null, marketCtaButtonAnalyticsParams.s, null, null, null, marketCtaButtonAnalyticsParams.t, 29, null);
        String str2 = marketCtaButtonAnalyticsParams.u;
        SchemeStat$TypeClick a = SchemeStat$TypeClick.a.a(schemeStat$EventItem, b, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, null, marketCtaButtonAnalyticsParams.n, new MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem(eventType, l, b2, num2, l2, mobileOfficialAppsMarketStat$ReferrerItemType, null, str, num3, commonMarketStat$TypeMarketContextContent, commonMarketStat$TypeAdCampaign, str2 != null ? new CommonMarketStat$TypeOzonClick(str2) : null, marketCtaButtonAnalyticsParams.v, 64, null), 41));
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, a, uzp0Var.a).q();
    }
}
