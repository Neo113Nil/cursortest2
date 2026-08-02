package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: MarketAlbumAnalyticsFacade.kt */
/* loaded from: classes18.dex */
public final class qr00 {
    public static void a(Integer num, long j, Integer num2, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, int i) {
        Integer num3 = (i & 4) != 0 ? null : num2;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource2 = (i & 8) != 0 ? null : commonMarketStat$TypeRefSource;
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.MARKET_ITEM_ALBUM;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(type, num != null ? Long.valueOf(num.intValue()) : null, Long.valueOf(j), null, null, null, 56, null);
        com.vk.stat.scheme.o oVar = new com.vk.stat.scheme.o();
        t1q0 t1q0Var = UiTracker.j;
        UiTrackingScreen b = t1q0Var.b();
        SchemeStat$TypeClick a = SchemeStat$TypeClick.a.a(schemeStat$EventItem, num3, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, b != null ? b.a : null, commonMarketStat$TypeRefSource2, null, null, oVar, 8));
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, a, uzp0Var.a).q();
        SchemeStat$EventItem schemeStat$EventItem2 = new SchemeStat$EventItem(type, num != null ? Long.valueOf(num.intValue()) : null, Long.valueOf(j), null, null, null, 56, null);
        MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem = new MobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem(null, 1, null);
        UiTrackingScreen b2 = t1q0Var.b();
        SchemeStat$TypeClick a2 = SchemeStat$TypeClick.a.a(schemeStat$EventItem2, num3, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, b2 != null ? b2.a : null, commonMarketStat$TypeRefSource2, null, null, mobileOfficialAppsMarketStat$TypeMarketplaceTransitionToBlockItem, 8));
        UiTracker uiTracker2 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        uzp0 uzp0Var2 = UiTracker.h;
        uzp0Var2.getClass();
        new bjc(c2, a2, uzp0Var2.a).q();
    }
}
