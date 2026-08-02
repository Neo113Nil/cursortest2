package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.api.analytics.MarketUtmData;
import com.vk.stat.scheme.CommonMarketStat$TypeAdCampaign;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketTransitionToCategoriesMenu;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: CatalogCategoryTabsAnalyticsFacade.kt */
/* loaded from: classes16.dex */
public final class i3a {
    public static void a(MarketAnalyticsParams marketAnalyticsParams, Integer num) {
        MarketUtmData marketUtmData;
        MarketUtmData marketUtmData2 = marketAnalyticsParams != null ? marketAnalyticsParams.b : null;
        CommonMarketStat$TypeMarketTransitionToCategoriesMenu commonMarketStat$TypeMarketTransitionToCategoriesMenu = new CommonMarketStat$TypeMarketTransitionToCategoriesMenu(new CommonMarketStat$TypeAdCampaign(marketUtmData2 != null ? marketUtmData2.b : null, marketUtmData2 != null ? marketUtmData2.c : null, marketUtmData2 != null ? marketUtmData2.d : null, marketUtmData2 != null ? marketUtmData2.f : null, marketUtmData2 != null ? marketUtmData2.g : null, marketUtmData2 != null ? marketUtmData2.e : null), num, (marketAnalyticsParams == null || (marketUtmData = marketAnalyticsParams.b) == null) ? null : marketUtmData.h);
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = marketAnalyticsParams != null ? marketAnalyticsParams.d : null;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        UiTrackingScreen b = UiTracker.j.b();
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, commonMarketStat$TypeRefSource, null, null, commonMarketStat$TypeMarketTransitionToCategoriesMenu, 57), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b2, uzp0Var.a).q();
    }
}
