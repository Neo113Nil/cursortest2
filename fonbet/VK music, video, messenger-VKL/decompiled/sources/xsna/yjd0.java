package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.bf10;
import xsna.ejd0;

/* compiled from: ProductCardCommunityInfoAnalyticsMiddleware.kt */
/* loaded from: classes18.dex */
public final class yjd0 implements h7f0<nmd0, ejd0, on50, smd0, xld0, tkd0> {
    public final sl50<nmd0, ejd0, on50, smd0, xld0, tkd0> b;
    public final rkd0 c;

    public yjd0(sl50<nmd0, ejd0, on50, smd0, xld0, tkd0> sl50Var, rkd0 rkd0Var) {
        this.b = sl50Var;
        this.c = rkd0Var;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        ejd0 ejd0Var = (ejd0) lj50Var;
        boolean equals = ejd0Var.equals(ejd0.b.d.b);
        rkd0 rkd0Var = this.c;
        if (equals) {
            ekd0 ekd0Var = ((nmd0) getCurrentState()).j;
            boolean z = false;
            if (ekd0Var != null && ekd0Var.d) {
                z = true;
            }
            ((gwh0) rkd0Var.K.getValue()).a(z ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE_OUT : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_OUT);
            MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem.EventType eventType = z ? MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem.EventType.UNSUBSCRIBE : MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem.EventType.SUBSCRIBE;
            long j = ((nmd0) getCurrentState()).c;
            UserId userId = ((nmd0) getCurrentState()).b;
            GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = ((nmd0) getCurrentState()).e;
            String str = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = ((nmd0) getCurrentState()).f;
            UiTrackingScreen b = UiTracker.j.b();
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(userId.b), Long.valueOf(userId.b), null, str, null, 40, null), MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, commonMarketStat$TypeRefSource, null, null, new MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem(null, eventType, 1, null), 57), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b2, uzp0Var.a).q();
            return;
        }
        if (ejd0Var.equals(ejd0.b.a.b)) {
            ((gwh0) rkd0Var.K.getValue()).a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_MARKET_OUT);
            kkd0 kkd0Var = ((nmd0) getCurrentState()).k;
            if (kkd0Var == null || !kkd0Var.g) {
                bf10.a(a());
                return;
            }
            return;
        }
        if (ejd0Var.equals(ejd0.b.C2816b.b)) {
            ((gwh0) rkd0Var.K.getValue()).a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER_OUT);
            bf10.a a = a();
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.MARKET_ITEM;
            Long l = a.a;
            UserId userId2 = a.b;
            SchemeStat$TypeClick b3 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, l, userId2 != null ? Long.valueOf(userId2.b) : null, null, a.c, null, 40, null), MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, a.e, a.d, null, null, new MobileOfficialAppsMarketStat$TypeMarketTransitionToOwnerItem(a.f, a.g, a.h, null, 8, null), 56), 2);
            UiTracker uiTracker2 = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            uzp0 uzp0Var2 = UiTracker.h;
            uzp0Var2.getClass();
            new bjc(c2, b3, uzp0Var2.a).q();
            return;
        }
        if (ejd0Var.equals(ejd0.b.c.b)) {
            long j2 = ((nmd0) getCurrentState()).c;
            long j3 = ((nmd0) getCurrentState()).b.b;
            GoodFragmentAnalyticsParams goodFragmentAnalyticsParams2 = ((nmd0) getCurrentState()).e;
            String str2 = goodFragmentAnalyticsParams2 != null ? goodFragmentAnalyticsParams2.f : null;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource2 = ((nmd0) getCurrentState()).f;
            GoodFragmentAnalyticsParams goodFragmentAnalyticsParams3 = ((nmd0) getCurrentState()).e;
            String str3 = goodFragmentAnalyticsParams3 != null ? goodFragmentAnalyticsParams3.h : null;
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(j2), Long.valueOf(j3), null, str2, null, 40, null);
            UiTrackingScreen b4 = UiTracker.j.b();
            SchemeStat$TypeClick b5 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b4 != null ? b4.a : null, commonMarketStat$TypeRefSource2, null, str3, new com.vk.stat.scheme.p(), 41), 2);
            UiTracker uiTracker3 = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
            uzp0 uzp0Var3 = UiTracker.h;
            uzp0Var3.getClass();
            new bjc(c3, b5, uzp0Var3.a).q();
        }
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void T(pk50 pk50Var) {
    }

    public final bf10.a a() {
        Long valueOf = Long.valueOf(((nmd0) getCurrentState()).c);
        UserId userId = ((nmd0) getCurrentState()).b;
        GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = ((nmd0) getCurrentState()).e;
        String str = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = ((nmd0) getCurrentState()).f;
        UiTracker uiTracker = UiTracker.a;
        UiTrackingScreen b = UiTracker.j.b();
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = b != null ? b.a : null;
        GoodFragmentAnalyticsParams goodFragmentAnalyticsParams2 = ((nmd0) getCurrentState()).e;
        Integer num = goodFragmentAnalyticsParams2 != null ? goodFragmentAnalyticsParams2.c : null;
        GoodFragmentAnalyticsParams goodFragmentAnalyticsParams3 = ((nmd0) getCurrentState()).e;
        Long l = goodFragmentAnalyticsParams3 != null ? goodFragmentAnalyticsParams3.d : null;
        GoodFragmentAnalyticsParams goodFragmentAnalyticsParams4 = ((nmd0) getCurrentState()).e;
        return new bf10.a(valueOf, userId, str, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen, num, l, goodFragmentAnalyticsParams4 != null ? goodFragmentAnalyticsParams4.e : null);
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.b.getCurrentState();
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
