package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketplaceBlock;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: MarketSubscribeButtonAnalytics.kt */
/* loaded from: classes16.dex */
public final class ze10 {

    /* compiled from: MarketSubscribeButtonAnalytics.kt */
    public static final class a {
        public final MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem.EventType a;
        public final UserId b;
        public final String c;
        public final String d;

        public a(MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem.EventType eventType, UserId userId, String str, String str2) {
            this.a = eventType;
            this.b = userId;
            this.c = str;
            this.d = str2;
        }
    }

    public static void a(a aVar) {
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.MARKET_ITEM;
        UserId userId = aVar.b;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(type, Long.valueOf(userId.b), Long.valueOf(userId.b), null, aVar.c, null, 40, null);
        UiTrackingScreen b = UiTracker.j.b();
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, CommonMarketStat$TypeRefSource.MARKETPLACE, null, null, new MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem(new MobileOfficialAppsMarketStat$TypeMarketplaceBlock(aVar.d), aVar.a), 57), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b2, uzp0Var.a).q();
    }
}
