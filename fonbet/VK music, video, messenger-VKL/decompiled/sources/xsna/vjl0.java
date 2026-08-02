package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketTransitionToBookmarks;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.sjl0;
import xsna.xjl0;

/* compiled from: StorefrontAlbumsAnalyticsMiddleware.kt */
/* loaded from: classes18.dex */
public final class vjl0 implements h7f0<ukl0, sjl0, on50, cll0, kkl0, xjl0> {
    public final UserId b;
    public final sl50<ukl0, sjl0, on50, cll0, kkl0, xjl0> c;

    public vjl0(UserId userId, sl50<ukl0, sjl0, on50, cll0, kkl0, xjl0> sl50Var) {
        this.b = userId;
        this.c = sl50Var;
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        sjl0 sjl0Var = (sjl0) lj50Var;
        if (!(sjl0Var instanceof sjl0.a.C3669a)) {
            if (sjl0Var instanceof tjl0) {
                throw null;
            }
            return;
        }
        sjl0.a.C3669a c3669a = (sjl0.a.C3669a) sjl0Var;
        int i = c3669a.b.b;
        qr00.a(Integer.valueOf(i), this.b.b, Integer.valueOf(c3669a.c), CommonMarketStat$TypeRefSource.COMMUNITY_GOODS, 48);
    }

    @Override // xsna.h7f0
    public final void T(pk50 pk50Var) {
        if (((xjl0) pk50Var) instanceof xjl0.b.c) {
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.COMMUNITY_GOODS;
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
            UiTrackingScreen b = UiTracker.j.b();
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, commonMarketStat$TypeRefSource, null, null, new CommonMarketStat$TypeMarketTransitionToBookmarks(null, null, 3, null), 57), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b2, uzp0Var.a).q();
        }
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.c.getCurrentState();
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void l(hn50 hn50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void o(yl50 yl50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void u(lm50 lm50Var) {
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.rl50
    public final void init() {
    }
}
