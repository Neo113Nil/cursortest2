package xsna;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.facebook.soloader.MinElf;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.im.ui.max.MaxRedirectHandler;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.stereo.stub.common.di.VoipStereoRouterComponentStub;
import com.vk.voip.ui.asr.ui.list.PastAsrListFragment;
import com.vk.voip.ui.broadcast.list.ui.PastBroadcastsFragment;
import com.vk.voip.ui.change_name.VoipChangeNameConfig;
import com.vk.voip.ui.history.friends.ui.VoipHistoryFriendsFragment;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import com.vk.voip.ui.join.directly.withpreview.JoinCallConfig;
import com.vk.voip.ui.join.directly.withpreview.JoinCallFragment;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import xsna.c2x0;
import xsna.ngw0;
import xsna.o0r0;
import xsna.o1x0;
import xsna.phw0;
import xsna.whg;
import xsna.ylw0;

/* compiled from: CommonCallListRouter.kt */
/* loaded from: classes7.dex */
public final class yhg {
    public final Context a;
    public final vbs b;
    public final mxv c;
    public final phw0 d;
    public final k2x0 e;
    public final MaxRedirectHandler f;
    public final gvw0 g;

    public yhg(Context context, vbs vbsVar, mxv mxvVar, phw0 phw0Var, k2x0 k2x0Var, MaxRedirectHandler maxRedirectHandler) {
        this.a = context;
        this.b = vbsVar;
        this.c = mxvVar;
        this.d = phw0Var;
        this.e = k2x0Var;
        this.f = maxRedirectHandler;
        this.g = new gvw0(context, null);
    }

    public final void a(whg whgVar) {
        boolean z = whgVar instanceof whg.s;
        mxv mxvVar = this.c;
        Context context = this.a;
        if (z) {
            com.vk.im.ui.calls.b.a(context, mxvVar.j(), ((whg.s) whgVar).a);
        } else if (whgVar instanceof whg.d) {
            mxvVar.j().g(context);
        } else if (whgVar instanceof whg.b0) {
            mxvVar.d().m(context, ((whg.b0) whgVar).a, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
        } else if (whgVar instanceof whg.v) {
            mxvVar.b().d(((whg.v) whgVar).a.b, context);
        } else if (whgVar instanceof whg.n) {
            mxvVar.b().d(((whg.n) whgVar).a, context);
        } else if (whgVar instanceof whg.x) {
            mxvVar.getClass();
            ((whg.x) whgVar).getClass();
            nr4.b().k(context, null);
        } else if (whgVar instanceof whg.f) {
            kyv j = mxvVar.j();
            ((whg.f) whgVar).getClass();
            j.h(context, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.HISTORY, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_LIST), context.getString(R.string.voip_history_ongoing_call_join_dialog_join_as), context.getString(R.string.voip_history_ongoing_call_join_dialog_button_video));
        } else if (whgVar instanceof whg.g) {
            ((whg.g) whgVar).getClass();
            new ylw0.a(context, new VoipChangeNameConfig(null, null, null, false, true, false, 0, null, 232, null)).H0(this.b.a, null);
        } else if (whgVar instanceof whg.u) {
            whg.u uVar = (whg.u) whgVar;
            b(uVar.b, new h4(5, this, uVar));
        } else {
            int i = 10;
            if (whgVar instanceof whg.k) {
                whg.k kVar = (whg.k) whgVar;
                b(kVar.b, new j4(i, this, kVar));
            } else if (whgVar instanceof whg.l) {
                whg.l lVar = (whg.l) whgVar;
                lVar.getClass();
                b(false, new s(8, this, lVar));
            } else {
                int i2 = 4;
                if (whgVar instanceof whg.m) {
                    whg.m mVar = (whg.m) whgVar;
                    b(mVar.a, new k4(i2, this, mVar));
                } else if (whgVar instanceof whg.j) {
                    whg.j jVar = (whg.j) whgVar;
                    b(jVar.a, new ks2(7, this, jVar));
                } else if (whgVar instanceof whg.p) {
                    whg.p pVar = (whg.p) whgVar;
                    b(pVar.b, new g4(i, this, pVar));
                } else if (whgVar instanceof whg.q) {
                    whg.q qVar = (whg.q) whgVar;
                    b(qVar.b, new q(qVar, 29));
                } else if (whgVar instanceof whg.o) {
                    whg.o oVar = (whg.o) whgVar;
                    if (((Pattern) c49.d.getValue()).matcher(oVar.a).matches()) {
                        VoipStereoRouterComponentStub.b.d c0 = this.e.c0();
                        xa4.L(context);
                        c0.getClass();
                    } else {
                        JoinCallConfig joinCallConfig = new JoinCallConfig(oVar.a, null, null, null, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.HISTORY, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_LIST), null, false, false, 238, null);
                        int i3 = JoinCallFragment.U;
                        JoinCallFragment.a.a(context, joinCallConfig);
                    }
                } else if (whgVar instanceof whg.y) {
                    tax.f(context, ((whg.y) whgVar).a);
                } else if (whgVar instanceof whg.z) {
                    new o1x0.a(((whg.z) whgVar).a, null, context, 10).I0("VoipShareLinkPagerModalDialog");
                } else if (whgVar instanceof whg.a0) {
                    new c2x0.a(((whg.a0) whgVar).a, context).I0("VoipShareQRCodeModalDialog");
                } else if (whgVar instanceof whg.t) {
                    o0w.x(mxvVar.b(), context, null, ((whg.t) whgVar).a, null, null, null, false, null, null, null, null, null, null, "voip", null, null, null, false, null, null, null, null, null, 1073733626);
                } else if (whgVar instanceof whg.w) {
                    WeakReference weakReference = new WeakReference(context);
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_LIST;
                    ((whg.w) whgVar).getClass();
                    this.d.b(new phw0.a(weakReference, mobileOfficialAppsCoreNavStat$EventScreen, null));
                } else if (whgVar instanceof whg.i) {
                    VoipHistoryFriendsFragment.a aVar = new VoipHistoryFriendsFragment.a(VoipHistoryFriendsFragment.class, null, null);
                    aVar.s(true);
                    aVar.k(context);
                } else if (whgVar instanceof whg.c) {
                    PastAsrListFragment.a aVar2 = new PastAsrListFragment.a(PastAsrListFragment.class, null, null);
                    aVar2.s(false);
                    aVar2.k(context);
                } else if (whgVar instanceof whg.a) {
                    VoipCreateScheduleCallFragment.a aVar3 = new VoipCreateScheduleCallFragment.a(VoipCreateScheduleCallFragment.class, null, null);
                    aVar3.s(true);
                    aVar3.k(context);
                } else if (whgVar instanceof whg.c0) {
                    PastBroadcastsFragment.b bVar = new PastBroadcastsFragment.b(PastBroadcastsFragment.class, null, null);
                    bVar.s(true);
                    bVar.k(context);
                } else if (whgVar instanceof whg.e) {
                    ngw0.a aVar4 = new ngw0.a(context, tzp0.a(null, 3));
                    aVar4.E(true);
                    aVar4.F0(true);
                    aVar4.J();
                    aVar4.c(new cpo(true, 0, 4));
                    aVar4.I0(null);
                } else if (whgVar instanceof whg.h) {
                    new VoipPastCallsFragment.a(VoipPastCallsFragment.class, null, null).k(context);
                } else if (whgVar instanceof whg.r) {
                    MaxRedirectHandler maxRedirectHandler = this.f;
                    maxRedirectHandler.a(maxRedirectHandler.b() ? MaxRedirectHandler.Entrypoint.Calls : MaxRedirectHandler.Entrypoint.Install);
                } else {
                    if (!(whgVar instanceof whg.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mxvVar.getClass();
                    UserId userId = ((whg.b) whgVar).a;
                    int i4 = ReportFragment.a0;
                    ReportFragment.a a = ReportFragment.b.a();
                    a.K(NotificationCompat.CATEGORY_CALL);
                    a.G(userId);
                    a.s(true);
                    a.k(context);
                }
            }
        }
        s3q0 s3q0Var = s3q0.a;
    }

    public final void b(boolean z, gzs<s3q0> gzsVar) {
        if (z) {
            this.g.g(gzsVar, gzsVar);
        } else {
            gzsVar.invoke();
        }
    }
}
