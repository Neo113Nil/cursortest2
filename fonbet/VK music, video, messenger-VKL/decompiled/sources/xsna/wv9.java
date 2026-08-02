package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.gzp0;

/* compiled from: CartAnalyticsFacade.kt */
/* loaded from: classes18.dex */
public final class wv9 {
    public final bpn0 a = new bpn0(new de4(4));

    public final void a(CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        gzp0.a.c(MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen, null, new com.vk.stat.scheme.s(), 48));
    }

    public final void b(SchemeStat$TypeAction.b bVar) {
        iid0 iid0Var = (iid0) this.a.getValue();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        UiTrackingScreen b = UiTracker.j.b();
        SchemeStat$TypeAction b2 = SchemeStat$TypeAction.a.b(null, b != null ? b.a : null, bVar, 1);
        iid0Var.f = c;
        iid0Var.g = b2;
        iid0Var.q();
    }

    public final void c(boolean z, UserId userId, long j, String str, Integer num, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
        long j2 = userId.b;
        MobileOfficialAppsMarketStat$TypeMarketClick.b mobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem = z ? new MobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem(Integer.valueOf((int) j), Long.valueOf(j2), null, null, num, null, null, null, null, 492, null) : new MobileOfficialAppsMarketStat$TypeMarketRemoveItemFromBookmarkItem(Integer.valueOf((int) j), Long.valueOf(j2), null, null, num, null, null, null, null, 492, null);
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, str, null, 46, null);
        t1q0 t1q0Var = UiTracker.j;
        UiTrackingScreen b = t1q0Var.b();
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = b != null ? b.a : null;
        UiTrackingScreen uiTrackingScreen = t1q0Var.b;
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, uiTrackingScreen != null ? uiTrackingScreen.a : null, null, mobileOfficialAppsMarketStat$TypeMarketAddItemToBookmarksItem, 48), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b2, uzp0Var.a).q();
    }
}
