package xsna;

import android.content.Context;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.hmd0;
import xsna.jmd0;

/* compiled from: RejectClickListenerImpl.kt */
/* loaded from: classes18.dex */
public final class trf0 implements srf0 {
    public maz a;
    public cnh b;

    @Override // xsna.srf0
    public final void a(Context context) {
        new jmd0.a(context, new imd0()).I0(null);
    }

    @Override // xsna.srf0
    public final void b(Context context, String str) {
        maz.c(this.a, context, str, LaunchContext.A, null, null, 24);
    }

    @Override // xsna.srf0
    public final void c(hmd0.a aVar, Context context) {
        if (aVar instanceof hmd0.a.C3009a) {
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
            UiTrackingScreen b = UiTracker.j.b();
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, null, null, null, new MobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem(MobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem.EventType.EDIT_MODERATED_ITEM), 61), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b2, uzp0Var.a).q();
            b(context, ((hmd0.a.C3009a) aVar).a);
            return;
        }
        if (!(aVar instanceof hmd0.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        SchemeStat$EventItem schemeStat$EventItem2 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        UiTrackingScreen b3 = UiTracker.j.b();
        SchemeStat$TypeClick b4 = SchemeStat$TypeClick.a.b(schemeStat$EventItem2, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b3 != null ? b3.a : null, null, null, null, new MobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem(MobileOfficialAppsMarketStat$TypeMarketModerationButtonClickItem.EventType.DELETE_MODERATED_ITEM), 61), 2);
        UiTracker uiTracker2 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        uzp0 uzp0Var2 = UiTracker.h;
        uzp0Var2.getClass();
        new bjc(c2, b4, uzp0Var2.a).q();
        this.b.invoke();
    }
}
