package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Good;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketTransitionToBookmarks;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$CtaClick;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$OpenScreenEvent;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.List;
import org.json.JSONObject;
import xsna.hjl0;
import xsna.hzp0;
import xsna.xll0;

/* compiled from: StorefrontAnalyticsMiddleware.kt */
/* loaded from: classes18.dex */
public final class ell0 implements h7f0<apl0, hjl0, on50, dpl0, oml0, xll0> {
    public final UserId b;
    public final sl50<apl0, hjl0, on50, dpl0, oml0, xll0> c;

    public ell0(UserId userId, sl50<apl0, hjl0, on50, dpl0, oml0, xll0> sl50Var) {
        this.b = userId;
        this.c = sl50Var;
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        pju pjuVar;
        String str;
        List<b5u> list;
        b5u b5uVar;
        List<GoodAlbum> list2;
        List<GoodAlbum> list3;
        hjl0 hjl0Var = (hjl0) lj50Var;
        UserId userId = this.b;
        long j = userId.b;
        if (hjl0Var instanceof hjl0.a.C3003a) {
            apl0 apl0Var = (apl0) getCurrentState();
            int i = ((hjl0.a.C3003a) hjl0Var).b;
            hr1 hr1Var = apl0Var.d;
            GoodAlbum goodAlbum = (hr1Var == null || (list3 = hr1Var.a) == null) ? null : (GoodAlbum) j5g.b0(i, list3);
            qr00.a(goodAlbum != null ? Integer.valueOf(goodAlbum.b) : null, userId.b, Integer.valueOf(i), CommonMarketStat$TypeRefSource.COMMUNITY_GOODS, 48);
            return;
        }
        if (hjl0Var instanceof njl0) {
            hr1 hr1Var2 = ((apl0) getCurrentState()).d;
            GoodAlbum goodAlbum2 = (hr1Var2 == null || (list2 = hr1Var2.a) == null) ? null : (GoodAlbum) j5g.b0(0, list2);
            Integer valueOf = goodAlbum2 != null ? Integer.valueOf(goodAlbum2.b) : null;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.COMMUNITY_GOODS;
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM_ALBUM, valueOf != null ? Long.valueOf(valueOf.intValue()) : null, Long.valueOf(j), null, null, null, 56, null);
            UiTrackingScreen b = UiTracker.j.b();
            new hzp0.h0(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketView.a.b(b != null ? b.a : null, commonMarketStat$TypeRefSource, null, new MobileOfficialAppsMarketStat$TypeMarketplaceBlockViewItem(null, 1, null), 24)).a();
            return;
        }
        if (hjl0Var instanceof ojl0) {
            t8u t8uVar = ((apl0) getCurrentState()).f;
            Good good = (t8uVar == null || (list = t8uVar.a) == null || (b5uVar = (b5u) j5g.b0(0, list)) == null) ? null : b5uVar.a;
            mt00.d(good != null ? Long.valueOf(good.b) : null, Long.valueOf(j), 0, null, null, null, null, null, null, null, null, null, null, null, 32752);
        } else {
            if (!(hjl0Var instanceof hjl0.a.s) || (pjuVar = ((apl0) getCurrentState()).b) == null || (str = pjuVar.m) == null) {
                return;
            }
            g2h g2hVar = new g2h(userId);
            UiTracker uiTracker = UiTracker.a;
            g2hVar.e = UiTracker.d();
            g2hVar.b = "site";
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("link", str);
            jSONObject.put("source", "community_goods");
            g2hVar.g = jSONObject;
            g2hVar.a();
        }
    }

    @Override // xsna.h7f0
    public final void T(pk50 pk50Var) {
        MobileOfficialAppsGroupsStat$CtaClick.CtaButtonType ctaButtonType;
        xll0 xll0Var = (xll0) pk50Var;
        boolean z = xll0Var instanceof xll0.a.b;
        UserId userId = this.b;
        if (!z) {
            if (!(xll0Var instanceof xll0.a.h)) {
                if (xll0Var instanceof xll0.a.p) {
                    mt00.g(Long.valueOf(userId.b), CommonMarketStat$TypeRefSource.COMMUNITY_GOODS, ((xll0.a.p) xll0Var).b);
                    return;
                }
                return;
            }
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.MARKETPLACE;
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
            UiTrackingScreen b = UiTracker.j.b();
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, commonMarketStat$TypeRefSource, null, null, new CommonMarketStat$TypeMarketTransitionToBookmarks(null, null, 3, null), 57), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b2, uzp0Var.a).q();
            return;
        }
        if (!(xll0Var instanceof xll0.a.b.C4017a)) {
            if (xll0Var instanceof xll0.a.b.c) {
                SchemeStat$TypeClick b3 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, null, null, null, null, 62, null), MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(userId.b, null, null, new MobileOfficialAppsGroupsStat$CtaClick(MobileOfficialAppsGroupsStat$CtaClick.CtaButtonType.CALL_VK, ((xll0.a.b.c) xll0Var).b), 30), 2);
                UiTracker uiTracker2 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                uzp0 uzp0Var2 = UiTracker.h;
                uzp0Var2.getClass();
                new bjc(c2, b3, uzp0Var2.a).q();
                return;
            }
            if (xll0Var instanceof xll0.a.b.C4018b) {
                SchemeStat$TypeClick b4 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, null, null, null, null, 62, null), MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(userId.b, null, null, new MobileOfficialAppsGroupsStat$OpenScreenEvent(MobileOfficialAppsGroupsStat$OpenScreenEvent.OpenScreenEventType.OPEN_MESSAGES, ((xll0.a.b.C4018b) xll0Var).a), 30), 2);
                UiTracker uiTracker3 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
                uzp0 uzp0Var3 = UiTracker.h;
                uzp0Var3.getClass();
                new bjc(c3, b4, uzp0Var3.a).q();
                return;
            }
            return;
        }
        SchemeStat$EventItem schemeStat$EventItem2 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, null, null, null, null, 62, null);
        long j = userId.b;
        xll0.a.b.C4017a c4017a = (xll0.a.b.C4017a) xll0Var;
        switch (c4017a.a.a) {
            case 0:
                ctaButtonType = MobileOfficialAppsGroupsStat$CtaClick.CtaButtonType.SEND_EMAIL;
                break;
            case 1:
                ctaButtonType = MobileOfficialAppsGroupsStat$CtaClick.CtaButtonType.CALL_PHONE;
                break;
            case 2:
                ctaButtonType = MobileOfficialAppsGroupsStat$CtaClick.CtaButtonType.CALL_VK;
                break;
            case 3:
            case 7:
                ctaButtonType = MobileOfficialAppsGroupsStat$CtaClick.CtaButtonType.OPEN_URL;
                break;
            case 4:
                ctaButtonType = MobileOfficialAppsGroupsStat$CtaClick.CtaButtonType.OPEN_URL;
                break;
            case 5:
                ctaButtonType = MobileOfficialAppsGroupsStat$CtaClick.CtaButtonType.OPEN_APP;
                break;
            case 6:
                ctaButtonType = MobileOfficialAppsGroupsStat$CtaClick.CtaButtonType.OPEN_GROUP_APP;
                break;
            default:
                ctaButtonType = MobileOfficialAppsGroupsStat$CtaClick.CtaButtonType.OPEN_GROUP_APP;
                break;
        }
        SchemeStat$TypeClick b5 = SchemeStat$TypeClick.a.b(schemeStat$EventItem2, MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(j, null, null, new MobileOfficialAppsGroupsStat$CtaClick(ctaButtonType, c4017a.b), 30), 2);
        UiTracker uiTracker4 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c4 = UiTracker.c();
        uzp0 uzp0Var4 = UiTracker.h;
        uzp0Var4.getClass();
        new bjc(c4, b5, uzp0Var4.a).q();
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
