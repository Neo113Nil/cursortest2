package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.dialogs.MsgReadAsLastData;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.reporters.DialogsFilterChangeSource;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;
import com.vk.im.ui.components.dialogs_list.c;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.cs;
import xsna.msm;

/* compiled from: OnViewControllerCallbackImpl.java */
/* loaded from: classes2.dex */
public final class rc80 implements xtm {

    @NonNull
    public final com.vk.im.ui.components.dialogs_list.c a;

    public rc80(@NonNull com.vk.im.ui.components.dialogs_list.c cVar) {
        this.a = cVar;
    }

    @Override // xsna.xtm
    public final void a(@NonNull InfoBar infoBar) {
        com.vk.im.ui.components.dialogs_list.c cVar = this.a;
        cVar.p(infoBar, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        cVar.l.r().a(infoBar);
    }

    @Override // xsna.xtm
    public final void b(DialogsFilter dialogsFilter, DialogsFilterChangeSource dialogsFilterChangeSource) {
        com.vk.im.ui.components.dialogs_list.a aVar = this.a.u;
        if (aVar != null) {
            aVar.b(dialogsFilter, dialogsFilterChangeSource);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.xtm
    public final void c(@NonNull DialogExt dialogExt) {
        com.vk.im.ui.components.dialogs_list.a aVar = this.a.u;
        if (aVar != null) {
            aVar.c(dialogExt);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.xtm
    public final void d(@NonNull InfoBar infoBar, @NonNull InfoBar.Button button) {
        int i;
        com.vk.im.ui.components.dialogs_list.c cVar = this.a;
        Context context = cVar.f;
        mxv mxvVar = cVar.j;
        boolean z = button.h;
        switch (c.a.$EnumSwitchMapping$1[button.d.ordinal()]) {
            case 1:
            case 2:
                mxvVar.k().b(context, button.f);
                if (z) {
                    cVar.p(infoBar, "action");
                    break;
                }
                break;
            case 3:
                io.reactivex.rxjava3.disposables.c cVar2 = cVar.n;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                cVar.n = null;
                cVar.n = io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(cVar.d.F(cVar, new rsm(infoBar.b, button.g, false)), new jv(new dwg(cVar, 10), 18)), new a2b(cVar, 2)), new omf(cVar, 11), new ftm(button, cVar, infoBar, 0));
                break;
            case 4:
                y9w.a(context, new sje(cVar, 19), BuildInfo.s());
                cVar.p(infoBar, "action");
                break;
            case 5:
                mxvVar.getClass();
                szv.a(k9u0.a, cVar.f, null, new cm(13, cVar, infoBar), null, null, 26);
                break;
            case 6:
                t5p t5pVar = (t5p) o25.a();
                atu0 atu0Var = r55.e;
                vx2.a.getClass();
                io.reactivex.rxjava3.core.x.B(atu0Var.a(vx2.b().a.b).l(new hi70(new t810(26), 13)).m(io.reactivex.rxjava3.android.schedulers.a.b()).h(new pm1(new io3(15), 18)).m(io.reactivex.rxjava3.schedulers.a.b()), o25.a().b() ? new io.reactivex.rxjava3.internal.operators.observable.o1(rsg0.T(yfb.x(cs.a.c(null))).U(new qs6(new xr0(27), 12)), new d22(new z13(17), 13)).J(UserId.d).m(io.reactivex.rxjava3.schedulers.a.b()) : io.reactivex.rxjava3.core.x.k(UserId.d), new u5(new oac(t5pVar, 3), 11)).m(io.reactivex.rxjava3.schedulers.a.b()).subscribe();
                if (z) {
                    cVar.p(infoBar, "action");
                    break;
                }
                break;
            case 7:
                InfoBar.PopUp popUp = button.i;
                com.vk.im.ui.components.dialogs_list.a aVar = cVar.u;
                if (popUp != null && aVar != null) {
                    int i2 = c.a.$EnumSwitchMapping$0[popUp.b.ordinal()];
                    if (i2 == 1) {
                        i = R.drawable.vk_icon_illustration_exceeding_limit_120h;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R.drawable.vk_icon_illustration_comments_120h;
                    }
                    aVar.g(new InfoModalBottomSheet.Params(i, popUp.c, popUp.d, popUp.e));
                    break;
                }
                break;
        }
        cVar.l.r().b(infoBar);
    }

    @Override // xsna.xtm
    public final void e() {
        com.vk.im.ui.components.dialogs_list.a aVar = this.a.u;
        if (aVar != null) {
            aVar.n();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.xtm
    public final void f(@NonNull DialogExt dialogExt) {
        int i;
        Integer num;
        long j = dialogExt.e;
        Dialog Cb = dialogExt.Cb();
        com.vk.im.ui.components.dialogs_list.c cVar = this.a;
        if (Cb != null && Cb.Gb()) {
            Msg msg = cVar.h.g.s().get(Long.valueOf(j));
            cew.b.getClass();
            MsgReadAsLastData f = cew.f(j);
            if (f != null) {
                MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
                if (msgFromUser != null && (((i = msgFromUser.d) == f.a || ((num = f.d) != null && i == num.intValue())) && f.b == 1 && msgFromUser.T == null)) {
                    cVar.l.w().k(j, f.e.i());
                }
            }
        }
        com.vk.im.ui.components.dialogs_list.a aVar = cVar.u;
        if (aVar != null) {
            aVar.f(dialogExt);
        }
    }

    @Override // xsna.xtm
    public final void g(@NonNull msm msmVar) {
        yrm yrmVar = this.a.w;
        mxv mxvVar = yrmVar.b;
        Context context = yrmVar.a;
        Activity h = e3m.h(context);
        FragmentActivity fragmentActivity = h instanceof FragmentActivity ? (FragmentActivity) h : null;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM;
        if (msmVar instanceof msm.c) {
            mxvVar.d().r(context);
            return;
        }
        if (msmVar.equals(msm.a.a)) {
            iwv.f(mxvVar.k(), context, 51464551, null, "", null, mobileOfficialAppsCoreNavStat$EventScreen.name(), 16);
            return;
        }
        if (msmVar instanceof msm.d) {
            if (fragmentActivity != null) {
                mxvVar.getClass();
                szv.a(k9u0.a, fragmentActivity, null, new defpackage.u(yrmVar, context, mobileOfficialAppsCoreNavStat$EventScreen), null, null, 26);
                return;
            }
            return;
        }
        if (!msmVar.equals(msm.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (fragmentActivity != null) {
            mxvVar.b().m(xa4.L(fragmentActivity), false, false);
        }
    }

    @Override // xsna.xtm
    public final void h(int i, Peer peer) {
        com.vk.im.ui.components.dialogs_list.c cVar = this.a;
        cVar.d.D(cVar, new lim(i, peer));
        cVar.h.getClass();
    }

    @Override // xsna.xtm
    public final void i() {
        com.vk.im.ui.components.dialogs_list.a aVar = this.a.u;
        if (aVar != null) {
            aVar.i();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.xtm
    public final void j(@NonNull Object obj) {
        gkx0 gkx0Var;
        com.vk.im.ui.components.dialogs_list.c cVar = this.a;
        com.vk.im.ui.components.dialogs_list.e eVar = cVar.h;
        boolean z = eVar.y;
        DialogsHistory dialogsHistory = eVar.g;
        if (z || eVar.A || !dialogsHistory.i()) {
            return;
        }
        boolean j = dialogsHistory.j();
        boolean z2 = (eVar.B || dialogsHistory.j()) ? false : true;
        if (j) {
            gkx0 nc = dialogsHistory.k().isEmpty() ? gkx0.d : dialogsHistory.k().get(dialogsHistory.k().size() - 1).nc();
            if (eVar.A) {
                return;
            }
            eVar.A = true;
            cVar.F(obj, new l6o0(cVar, nc));
            return;
        }
        if (z2) {
            int size = dialogsHistory.k().size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    Dialog dialog = dialogsHistory.k().get(size);
                    Msg msg = dialogsHistory.s().get(dialog.Sb());
                    if (msg != null && msg.Mb()) {
                        gkx0Var = dialog.nc();
                        break;
                    } else if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
                if (!eVar.y || eVar.B) {
                }
                eVar.A = true;
                eVar.B = true;
                cVar.t.g(obj, new n6o0(cVar, gkx0Var));
                return;
            }
            gkx0Var = gkx0.e;
            if (eVar.y) {
            }
        }
    }

    @Override // xsna.xtm
    public final void k() {
        com.vk.im.ui.components.dialogs_list.a aVar = this.a.u;
        if (aVar != null) {
            aVar.l();
        }
    }

    @Override // xsna.xtm
    public final void l(@NonNull View view, @NonNull qtd0 qtd0Var, boolean z) {
        this.a.j.g().a(view, qtd0Var, z, MobileOfficialAppsConStoriesStat$ViewEntryPoint.IM_DIALOGS, MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT, new l9(14));
    }

    @Override // xsna.xtm
    public final void m() {
        this.a.getClass();
    }

    @Override // xsna.xtm
    public final void n() {
        com.vk.im.ui.components.dialogs_list.a aVar = this.a.u;
        if (aVar != null) {
            aVar.j();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.xtm
    public final void o(@NonNull Set<? extends Peer> set) {
        this.a.x.d(set);
    }

    @Override // xsna.xtm
    public final void p() {
        com.vk.im.ui.components.dialogs_list.a aVar = this.a.u;
        if (aVar != null) {
            aVar.o();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.xtm
    public final void q(@NonNull String str) {
        this.a.z.b(str);
    }
}
