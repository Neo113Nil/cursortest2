package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;

/* compiled from: VideoAdFreeStatsTrackerImpl.kt */
/* loaded from: classes.dex */
public final class uyr0 implements tyr0 {
    public static void l(uyr0 uyr0Var, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.EventType eventType, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.EventSource eventSource, int i) {
        if ((i & 4) != 0) {
            eventSource = null;
        }
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick(eventType, mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi, eventSource, null), 2)).q();
    }

    public static void m(uyr0 uyr0Var, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi) {
        UiTracker uiTracker = UiTracker.a;
        new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), "", "", null, new MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow(mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi, null), 8)).q();
    }

    @Override // xsna.tyr0
    public final void a() {
        l(this, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.EventType.CLOSE, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.POPUP, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.EventSource.CROSS, 8);
    }

    @Override // xsna.tyr0
    public final void b() {
        m(this, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.BANNER);
    }

    @Override // xsna.tyr0
    public final void c() {
        l(this, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.EventType.SUBSCRIBE, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.BANNER, null, 12);
    }

    @Override // xsna.tyr0
    public final void d() {
        l(this, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.EventType.CLOSE, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.BUTTON, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.EventSource.CROSS, 8);
    }

    @Override // xsna.tyr0
    public final void e() {
        m(this, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.BUTTON);
    }

    @Override // xsna.tyr0
    public final void f() {
        m(this, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.POPUP);
    }

    @Override // xsna.tyr0
    public final void g() {
        l(this, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.EventType.CONDITIONS, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.POPUP, null, 12);
    }

    @Override // xsna.tyr0
    public final void h() {
        l(this, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.EventType.SUBSCRIBE, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.BUTTON, null, 12);
    }

    @Override // xsna.tyr0
    public final void i() {
        l(this, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.EventType.SUBSCRIBE, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.POPUP, null, 12);
    }

    @Override // xsna.tyr0
    public final void j() {
        l(this, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.EventType.CLOSE, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.POPUP, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.EventSource.ANYWHERE, 8);
    }

    @Override // xsna.tyr0
    public final void k() {
        l(this, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.EventType.CLOSE, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.BANNER, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.EventSource.CROSS, 8);
    }
}
