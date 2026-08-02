package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.jsm;

/* compiled from: InfoBarInteractorImpl.kt */
/* loaded from: classes18.dex */
public final class ivw implements jsm.d {
    public final a1w a;

    public ivw(a1w a1wVar) {
        this.a = a1wVar;
    }

    @Override // xsna.jsm.d
    public final io.reactivex.rxjava3.internal.operators.completable.y a(String str, String str2) {
        return new io.reactivex.rxjava3.internal.operators.completable.p(this.a.C(this, new rsm(str, str2, true))).q(asu0.a.c());
    }

    @Override // xsna.jsm.d
    public final void b(String str) {
        this.a.D(this, new vsm(str, "action"));
    }

    @Override // xsna.jsm.d
    public final void c(String str) {
        iid0 iid0Var = new iid0();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem(str, MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.HIDE, null), 3);
        iid0Var.f = c;
        iid0Var.g = b;
        iid0Var.q();
        this.a.D(this, new vsm(str, CampaignEx.JSON_NATIVE_VIDEO_CLOSE));
        if (str.equals("max_ad")) {
            cew.b.getClass();
            qvw e = cew.e(str);
            if (e == null) {
                return;
            }
            cew.j(str, qvw.a(e, 0));
        }
    }
}
