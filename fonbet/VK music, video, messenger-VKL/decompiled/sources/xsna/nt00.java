package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.fave.MarketFavable;
import com.vk.ecomm.market.api.analytics.MarketCtaButtonAnalyticsParams;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketAddItemsToVideoClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketChangeItemsToVideoClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketOpenItemsFromVideoClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketShowItemsFromVideoViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.hzp0;
import xsna.mt00;

/* compiled from: MarketAnalyticsImpl.kt */
/* loaded from: classes18.dex */
public final class nt00 implements lt00 {
    public nt00(nw00 nw00Var, yz00 yz00Var) {
    }

    @Override // xsna.lt00
    public final void a(zz00 zz00Var) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(zz00Var.a), Long.valueOf(zz00Var.b), null, null, null, 56, null);
        UiTrackingScreen b = UiTracker.j.b();
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, zz00Var.d, null, null, new CommonMarketStat$TypeMarketOpenItemsFromVideoClickItem(zz00Var.c), 57), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b2, uzp0Var.a).q();
    }

    @Override // xsna.lt00
    public final void b(zz00 zz00Var) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(zz00Var.a), Long.valueOf(zz00Var.b), null, null, null, 56, null);
        UiTrackingScreen b = UiTracker.j.b();
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, zz00Var.d, null, null, new CommonMarketStat$TypeMarketAddItemsToVideoClickItem(zz00Var.c), 57), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b2, uzp0Var.a).q();
    }

    @Override // xsna.lt00
    public final void c(String str, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
        mt00.e(str, null, commonMarketStat$TypeRefSource);
    }

    @Override // xsna.lt00
    public final void d(MarketFavable marketFavable, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, Integer num, String str) {
        mt00.h(new mt00.a((int) marketFavable.b, marketFavable.c, marketFavable.f, commonMarketStat$TypeRefSource, null, num, null, null, null, str, 7088));
    }

    @Override // xsna.lt00
    public final void e(zz00 zz00Var) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(zz00Var.a), Long.valueOf(zz00Var.b), null, null, null, 56, null);
        UiTrackingScreen b = UiTracker.j.b();
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, zz00Var.d, null, null, new CommonMarketStat$TypeMarketChangeItemsToVideoClickItem(zz00Var.c), 57), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b2, uzp0Var.a).q();
    }

    @Override // xsna.lt00
    public final void f(MarketCtaButtonAnalyticsParams marketCtaButtonAnalyticsParams) {
        nw00.a(marketCtaButtonAnalyticsParams);
    }

    @Override // xsna.lt00
    public final void g(zz00 zz00Var) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(zz00Var.a), Long.valueOf(zz00Var.b), null, null, null, 56, null);
        UiTrackingScreen b = UiTracker.j.b();
        new hzp0.g0(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketView.a.b(b != null ? b.a : null, zz00Var.d, null, new CommonMarketStat$TypeMarketShowItemsFromVideoViewItem(zz00Var.c), 26), null).a();
    }

    @Override // xsna.lt00
    public final void i(Long l, Long l2, Integer num, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str, Integer num2, Long l3, CommonMarketStat$TypeMarketContextContent.Type type) {
        mt00.d(l, l2, num, commonMarketStat$TypeRefSource, null, null, null, str, num2, l3, type, null, null, null, 28912);
    }
}
