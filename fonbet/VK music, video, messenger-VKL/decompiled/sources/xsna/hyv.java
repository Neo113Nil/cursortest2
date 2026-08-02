package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipMaxAppView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeView;
import kotlin.NoWhenBranchMatchedException;
import xsna.iyv;
import xsna.lwv;
import xsna.mwv;

/* compiled from: ImCallViewAnalytics.kt */
/* loaded from: classes5.dex */
public final class hyv extends dxv<iyv> implements lwv.b {
    public static final a c = new a();

    /* compiled from: ImCallViewAnalytics.kt */
    public static final class a implements lwv.a {
        @Override // xsna.lwv.a
        public final boolean a(mwv.a aVar) {
            return aVar instanceof iyv;
        }
    }

    @Override // xsna.lwv.b
    public final boolean b(mwv.a aVar) {
        if (!(aVar instanceof iyv)) {
            return false;
        }
        a((iyv) aVar);
        return true;
    }

    @Override // xsna.mwv
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(iyv iyvVar) {
        if (!(iyvVar instanceof iyv.a)) {
            throw new NoWhenBranchMatchedException();
        }
        MobileOfficialAppsCallsStat$TypeVoipMaxAppView mobileOfficialAppsCallsStat$TypeVoipMaxAppView = new MobileOfficialAppsCallsStat$TypeVoipMaxAppView(MobileOfficialAppsCallsStat$TypeVoipMaxAppView.EventType.MAX_SHOW, MobileOfficialAppsCallsStat$TypeVoipMaxAppView.Source.IM_HEADER, gyv.a(((iyv.a) iyvVar).a));
        String valueOf = String.valueOf(System.currentTimeMillis());
        String valueOf2 = String.valueOf(System.currentTimeMillis());
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        SchemeStat$TypeView a2 = SchemeStat$TypeView.a.a(this.b, valueOf, valueOf2, null, mobileOfficialAppsCallsStat$TypeVoipMaxAppView);
        vk6<SchemeStat$TypeView> vk6Var = this.a;
        vk6Var.f = c2;
        vk6Var.g = a2;
        vk6Var.q();
    }
}
