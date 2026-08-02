package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.libvideo.design.view.actionlink.b;
import com.vk.stat.scheme.CommonVideoStat$TypeVsidItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeView;

/* compiled from: ActionLinkProductTracker.kt */
/* loaded from: classes2.dex */
public final class d20 {
    public b.C1229b.a.j a;
    public String b = "";

    public static void b(long j, String str, String str2, SchemeStat$EventItem schemeStat$EventItem, MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose.EventSubtype eventSubtype, long j2, long j3) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose = new MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose(MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose.EventType.OVERLAY_LIVE_PRODUCT_CARD_CLOSE, eventSubtype, new CommonVideoStat$TypeVsidItem(str), j, str2, 0, Long.valueOf(j2), Long.valueOf(j3));
        UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
        if (uiTrackingScreen == null || (mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a) == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
        }
        new iid0(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeAction.a.b(schemeStat$EventItem, null, mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose, 2)).q();
    }

    public final void a(MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression.EventSubtype eventSubtype) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        b.C1229b.a.j jVar = this.a;
        if (jVar == null) {
            return;
        }
        String str = jVar.h;
        if (str.equals(this.b)) {
            return;
        }
        this.b = str;
        MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression = new MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression(MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression.EventType.OVERLAY_LIVE_PRODUCT_CARD_IMPRESSION, eventSubtype, new CommonVideoStat$TypeVsidItem(str), jVar.c, jVar.i, 0, Long.valueOf(jVar.j), Long.valueOf(jVar.k));
        UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
        if (uiTrackingScreen == null || (mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a) == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
        }
        new bvt0(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeView.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.PRODUCT, null, null, null, null, null, 62, null), "", "", 0, mobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression)).q();
    }
}
