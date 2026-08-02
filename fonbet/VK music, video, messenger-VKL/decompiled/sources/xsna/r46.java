package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.bridges.ImageViewer;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.hints.HintId;
import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.reporters.api.analytics.click.ImCallClickAnalyticsItem;
import com.vk.im.reporters.api.analytics.click.ImChatManagementClickAnalyticsItem;
import com.vk.im.ui.components.chat_profile.ChatProfileActionItem$Notifications;
import com.vk.im.ui.components.chat_profile.ChatProfileListItem;
import com.vk.im.ui.components.common.DndPeriodAndSound;
import com.vk.network.kbh.state.NetworkState;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import xsna.iwv;
import xsna.jxb;
import xsna.lal0;
import xsna.u8m;
import xsna.uum;
import xsna.uxd0;
import xsna.xxd0;
import xsna.zxd0;

/* compiled from: BaseActionsProfileDelegate.kt */
/* loaded from: classes2.dex */
public abstract class r46 implements jxb {
    public final Context b;
    public volatile DialogExt c;
    public final a1w d;
    public final sj90 e;
    public final g3a0 f;
    public final mxv g;
    public final ImageViewer h;
    public final e8v i;
    public final jxb.a j;
    public final Object k = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.logic.processor.actions.h(this, 5));
    public final bpn0 l = new bpn0(new f4(2));
    public final bpn0 m = new bpn0(new s4(this, 9));
    public final bpn0 n;

    /* compiled from: BaseActionsProfileDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DndPeriodAndSound.values().length];
            try {
                iArr[DndPeriodAndSound.DISABLED_SOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DndPeriodAndSound.ENABLE_SOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DndPeriodAndSound.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: BaseActionsProfileDelegate.kt */
    public static final class b implements w8i {
    }

    /* compiled from: BaseActionsProfileDelegate.kt */
    public static final class c implements w8i {
    }

    public r46(Context context, DialogExt dialogExt, a1w a1wVar, sj90 sj90Var, g3a0 g3a0Var, mxv mxvVar, ImageViewer imageViewer, e8v e8vVar, jxb.a aVar) {
        this.b = context;
        this.c = dialogExt;
        this.d = a1wVar;
        this.e = sj90Var;
        this.f = g3a0Var;
        this.g = mxvVar;
        this.h = imageViewer;
        this.i = e8vVar;
        this.j = aVar;
        new bpn0(new wv0(2));
        this.n = new bpn0(new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(this, 5));
    }

    public void A() {
        qtd0 g = g();
        if (g == null) {
            return;
        }
        k(new uxd0.h0(g.Q2(UserNameCase.ACC), new defpackage.e(this, 8)));
    }

    public final void B() {
        L(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(this.d.F(this, new ivm(this.c.f, "ProfileInfoModel")), new bn3(new r7(this, 8), 2)), new l46(this, 0)), new tf1(this, 3), new um0(new jy(this, 10), 5));
    }

    public final void C() {
        Peer peer = this.c.f;
        peer.getClass();
        ams.a().g(this.b, peer.Ab(Peer.Type.USER) ? "msg_profile_direct" : "msg_profile_chat", Collections.singletonList(Long.valueOf(this.c.f.b)));
    }

    public final void D() {
        this.d.D(this, new com.vk.im.engine.commands.dialogs.b(this.c.f));
        this.d.r().O.x().a(new ImChatManagementClickAnalyticsItem.a(false, ImChatManagementClickAnalyticsItem.Source.CHAT_PROFILE));
    }

    public abstract void E(qxb qxbVar);

    public abstract void G(xub xubVar);

    public abstract void H(zxd0 zxd0Var);

    public final void I(UGCChatSettingsModel uGCChatSettingsModel) {
        int i;
        int i2;
        if (!uGCChatSettingsModel.g) {
            long j = uGCChatSettingsModel.b;
            boolean z = uGCChatSettingsModel.c;
            if (z) {
                i = R.attr.vk_ui_text_primary;
                i2 = R.string.vk_show_ugc_in_keyboard;
            } else {
                i = R.attr.vk_ui_text_negative;
                i2 = R.string.vk_hide_ugc_from_keyboard;
            }
            int i3 = i;
            int i4 = i2;
            abg0 abg0Var = dhr0.t;
            wx20.c(new s46(j, z, this, new e520(0, 0, i4, 0, false, 0, abg0Var.c(i3), false, null, 0, null, false, 8114)), this.b, "TAG_WIDGET_MENU", abg0Var.c(i3), 0, 20);
            return;
        }
        if (uGCChatSettingsModel.f) {
            lal0.a.a(this.b, R.string.stickers_ugc_edit_banned_hint_title, R.string.stickers_ugc_edit_banned_hint_subtitle, R.drawable.vk_icon_privacy_outline_56);
            return;
        }
        com.vk.dto.common.a.b(this.c.f);
        long j2 = this.c.e;
        StringBuilder sb = new StringBuilder("#peer_id=");
        sb.append(j2);
        String concat = "&ref=".concat("settings");
        if (concat == null) {
            concat = "";
        }
        sb.append(concat);
        g2v.d().a().F(this.b, sb.toString());
    }

    public final void J(gzs<s3q0> gzsVar) {
        e(asu0.a.d().d(new p46(0, gzsVar), 200L, TimeUnit.MILLISECONDS));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> io.reactivex.rxjava3.disposables.c L(io.reactivex.rxjava3.core.x<T> xVar, io.reactivex.rxjava3.functions.f<T> fVar, io.reactivex.rxjava3.functions.f<? super Throwable> fVar2) {
        io.reactivex.rxjava3.disposables.c subscribe = xVar.subscribe(fVar, fVar2);
        e(subscribe);
        return subscribe;
    }

    @Override // xsna.jxb
    public void a(sxp sxpVar) {
        if (sxpVar instanceof o480) {
            if (epx.f(((o480) sxpVar).c, this.c.f)) {
                k(uxd0.q0.d.a);
                return;
            }
            return;
        }
        if (sxpVar instanceof e480) {
            if (epx.f(((e480) sxpVar).c, this.c.f)) {
                k(new uxd0.q0.a(new yc(this, 8)));
                return;
            }
            return;
        }
        if (sxpVar instanceof k480) {
            if (epx.f(((k480) sxpVar).c, this.c.f)) {
                k(uxd0.q0.c.a);
                return;
            }
            return;
        }
        if (sxpVar instanceof q480) {
            if (epx.f(((q480) sxpVar).c, this.c.f)) {
                k(uxd0.q0.e.a);
            }
        } else if (sxpVar instanceof d480) {
            d480 d480Var = (d480) sxpVar;
            p(d480Var.c, d480Var.d);
        } else if (sxpVar instanceof j480) {
            j480 j480Var = (j480) sxpVar;
            p(j480Var.c, j480Var.d);
        } else if (sxpVar instanceof p480) {
            p480 p480Var = (p480) sxpVar;
            p(p480Var.c, p480Var.d);
        }
    }

    @Override // xsna.jxb
    public final void b(zxd0 zxd0Var) {
        ImStoryState imStoryState;
        PinnedMsg dc;
        int i = 4;
        char c2 = 1;
        char c3 = 1;
        if (zxd0Var instanceof zxd0.l) {
            xub xubVar = ((zxd0.l) zxd0Var).a;
            if (xubVar instanceof ChatProfileActionItem$Notifications) {
                Dialog Cb = this.c.Cb();
                if (Cb == null) {
                    return;
                }
                boolean z = Cb.notificationsIsUseSound;
                if (Cb.notificationsDisabledUntil != 0) {
                    J(new defpackage.g(this, 9));
                    return;
                } else {
                    k(new uxd0.e0(z));
                    return;
                }
            }
            if (xubVar instanceof cwb) {
                if (d6q0.t == NetworkState.UNSTABLE) {
                    cvk.t();
                    return;
                } else {
                    this.g.b().Q(this.b, this.c, this.d.q(), null);
                    s3q0 s3q0Var = s3q0.a;
                    return;
                }
            }
            if (xubVar instanceof fvb) {
                cvk.r(new eb(this, i));
                return;
            }
            if (xubVar instanceof tvb) {
                this.d.D(this, new vgm(this.c.f));
                this.d.r().O.x().a(new ImChatManagementClickAnalyticsItem.c(false, ImChatManagementClickAnalyticsItem.Source.CHAT_PROFILE));
                k(new uxd0.b(this.d.q(), true));
                return;
            }
            if (xubVar instanceof yvb) {
                tb tbVar = new tb(this, 13);
                a1w a1wVar = this.d;
                mim mimVar = new mim(Source.CACHE);
                ph3 ph3Var = new ph3(tbVar, i);
                int i2 = kwg0.a;
                e(a1wVar.E(this, mimVar).subscribe(ph3Var, new hwg0()));
                return;
            }
            if (xubVar instanceof hwb) {
                this.d.D(this, new dmm(this.c.f));
                this.d.r().O.x().a(new ImChatManagementClickAnalyticsItem.b(false, ImChatManagementClickAnalyticsItem.Source.CHAT_PROFILE));
                return;
            }
            if (xubVar instanceof dvb) {
                this.d.D(this, new com.vk.im.engine.commands.dialogs.a(this.c.f));
                this.d.r().O.x().a(new ImChatManagementClickAnalyticsItem.a(true, ImChatManagementClickAnalyticsItem.Source.CHAT_PROFILE));
                return;
            }
            if (xubVar instanceof fwb) {
                D();
                return;
            }
            if (xubVar instanceof ewb) {
                this.g.b().g(this.b, this.c);
                return;
            }
            if (xubVar instanceof yub) {
                m();
                return;
            }
            if (xubVar instanceof awb) {
                A();
                return;
            }
            if (xubVar instanceof lvb) {
                k(new uxd0.u(this.c, this.c.getTitle()));
                return;
            }
            if (xubVar instanceof zvb) {
                Dialog Cb2 = this.c.Cb();
                if (Cb2 == null || (dc = Cb2.dc()) == null) {
                    return;
                }
                this.g.b().z(this.b, dc, this.c, this.d.q());
                return;
            }
            if ((xubVar instanceof rvb) || (xubVar instanceof qvb)) {
                k(new uxd0.b0(this.c, new in0(this, 6)));
                return;
            }
            if (xubVar instanceof gvb) {
                this.g.b().E(this.b, this.c);
                return;
            } else if (!(xubVar instanceof jvb)) {
                G(xubVar);
                return;
            } else {
                this.c.getTitle();
                k(new uxd0.r());
                return;
            }
        }
        int i3 = 3;
        if (zxd0Var instanceof zxd0.n) {
            qxb qxbVar = ((zxd0.n) zxd0Var).a;
            if (qxbVar instanceof ChatProfileListItem.b) {
                this.g.b().E(this.b, this.c);
                return;
            }
            if (qxbVar instanceof ChatProfileListItem.c) {
                long j = this.c.e;
                t6g0 t6g0Var = t6g0.b;
                e(t6g0.d().k0().a(j).m(asu0.a.d()).subscribe(new ho1(new go1(this, 10), i3), new io1(new o46(this, j, 0), i)));
                pla.e().b().b(HintId.STICKERS_UGC_SETTINGS_UNSEEN.getId());
                return;
            }
            if (qxbVar instanceof ChatProfileListItem.k) {
                qtd0 g = g();
                if (g == null) {
                    return;
                }
                String c5 = g.c5();
                if (this.e.a(c5)) {
                    this.g.k().e(this.b, this.f.a(c5).toString());
                    this.d.r().O.x().a(ImCallClickAnalyticsItem.a.a);
                    return;
                }
                return;
            }
            if (qxbVar instanceof ChatProfileListItem.m) {
                B();
                return;
            }
            if (qxbVar instanceof ChatProfileListItem.n) {
                B();
                return;
            } else if (qxbVar instanceof ChatProfileListItem.o) {
                C();
                return;
            } else {
                E(qxbVar);
                return;
            }
        }
        if (zxd0Var instanceof zxd0.o) {
            F(((zxd0.o) zxd0Var).a);
            return;
        }
        if (zxd0Var instanceof zxd0.p) {
            w(((zxd0.p) zxd0Var).a);
            return;
        }
        if (zxd0Var instanceof zxd0.c) {
            n(((zxd0.c) zxd0Var).a, true);
            return;
        }
        if (zxd0Var instanceof zxd0.g) {
            o(((zxd0.g) zxd0Var).a, false);
            return;
        }
        if (zxd0Var instanceof zxd0.e) {
            io.reactivex.rxjava3.internal.operators.single.c C = this.d.C(this, new cmo(this.c.f, "ProfileInfoModel"));
            asu0 asu0Var = asu0.a;
            int i4 = 5;
            L(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(C.q(asu0Var.c()).m(asu0Var.d()), new om1(new on(this, i4), c3 == true ? 1 : 0)), new dx3(this, c2 == true ? 1 : 0)), new pm1(this, i4), new c60(new sf1(this, 8), i3));
            return;
        }
        if (zxd0Var instanceof zxd0.a) {
            View view = ((zxd0.a) zxd0Var).a;
            xxd0 c4 = this.j.c();
            xxd0.b bVar = c4 instanceof xxd0.b ? (xxd0.b) c4 : null;
            if (bVar == null || (imStoryState = bVar.r) == null) {
                imStoryState = ImStoryState.NONE;
            }
            List<Peer.Type> list = rdw.a;
            Peer peer = this.c.f;
            Dialog Cb3 = this.c.Cb();
            if (rdw.a(peer, Cb3 != null && Cb3.Jc()) && imStoryState.i()) {
                k(uxd0.h.a);
                return;
            } else {
                x(view);
                return;
            }
        }
        if (zxd0Var instanceof zxd0.b) {
            k(new uxd0.b(0));
            return;
        }
        if (zxd0Var instanceof zxd0.q) {
            x(((zxd0.q) zxd0Var).a);
            return;
        }
        if (zxd0Var instanceof zxd0.r) {
            y(((zxd0.r) zxd0Var).a);
            return;
        }
        if (zxd0Var instanceof zxd0.h) {
            EduAchievement eduAchievement = ((zxd0.h) zxd0Var).a;
            Peer peer2 = this.c.f;
            peer2.getClass();
            if (peer2.Ab(Peer.Type.USER)) {
                this.g.k();
                Peer peer3 = this.c.f;
                iwv.a aVar = iwv.a;
                return;
            }
            return;
        }
        if (zxd0Var instanceof zxd0.k) {
            ((zxd0.k) zxd0Var).getClass();
            Peer peer4 = this.c.f;
            peer4.getClass();
            if (peer4.Ab(Peer.Type.USER)) {
                ((com.vk.im.edu.organization.api.di.a) this.l.getValue()).getClass();
                return;
            }
            return;
        }
        if (zxd0Var instanceof zxd0.i) {
            Peer peer5 = this.c.f;
            peer5.getClass();
            if (peer5.Ab(Peer.Type.USER)) {
                com.vk.im.edu.organization.api.di.a aVar2 = (com.vk.im.edu.organization.api.di.a) this.l.getValue();
                long j2 = this.c.f.d;
                aVar2.getClass();
                return;
            }
            return;
        }
        if (!(zxd0Var instanceof zxd0.j)) {
            H(zxd0Var);
            return;
        }
        Peer peer6 = this.c.f;
        peer6.getClass();
        if (peer6.Ab(Peer.Type.USER)) {
            com.vk.im.edu.organization.api.di.a aVar3 = (com.vk.im.edu.organization.api.di.a) this.l.getValue();
            Peer peer7 = this.c.f;
            aVar3.getClass();
        }
    }

    @Override // xsna.jxb
    public final void d(DialogExt dialogExt) {
        this.c = new DialogExt(dialogExt.d, dialogExt.b, null, 4, null);
    }

    public final void e(io.reactivex.rxjava3.disposables.c cVar) {
        this.j.h(cVar);
    }

    public final AvatarBorderType f() {
        qtd0 g = g();
        return (g == null || !g.n9()) ? AvatarBorderType.CIRCLE : AvatarBorderType.HEXAGON;
    }

    public qtd0 g() {
        return this.c.b.Bb(this.c.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if ((r3 != null ? r3 : "").equals("api.vk.me") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String h() {
        qtd0 g = g();
        if (g == null) {
            return "";
        }
        String n6 = g.n6();
        if (!g.Va()) {
            cew.b.getClass();
            String string = cew.h().getString("cfg_api_domain", a0a.d.equals("vk.com") ? "api.vk.me" : "internal.api.".concat(a0a.d));
        }
        n6 = null;
        return n6 == null ? g.m2() : n6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public List<sxb> i() {
        return (List) this.k.getValue();
    }

    public final void k(uxd0 uxd0Var) {
        this.j.g(uxd0Var);
    }

    public void m() {
        qtd0 g = g();
        if (g == null) {
            return;
        }
        k(new uxd0.g(g.Q2(UserNameCase.ACC), new ji0(this, 5)));
    }

    public final void n(boolean z, boolean z2) {
        io.reactivex.rxjava3.core.x n;
        if (z2) {
            this.d.r().O.x().a(new ImCallClickAnalyticsItem.c(fyv.a(this.c.f.c), z));
        }
        VoipCallSource voipCallSource = new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.IM_HEADER, MobileOfficialAppsCoreNavStat$EventScreen.IM_CONVERSATION_DETAIL);
        Context context = this.b;
        DialogExt dialogExt = this.c;
        cau0 cau0Var = this.d.r().h;
        kyv j = this.g.j();
        if (dialogExt.Cb() != null) {
            n = io.reactivex.rxjava3.core.x.k(dialogExt);
        } else {
            a1w a1wVar = q1w.a;
            if (a1wVar == null) {
                a1wVar = null;
            }
            n = hg1.n(a1wVar.E("DialogBundle", new uqm(dialogExt.f, Source.ACTUAL)).l(new y7(new oce(dialogExt, 16), 17)), context, false, null, 62);
        }
        hg1.i(n, new ba9(context, voipCallSource, cau0Var, j, z));
    }

    public final void o(List<? extends u8m> list, final boolean z) {
        L(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(this.d.E(this, new kj30(this.c.f, !z && list.contains(u8m.o0.b), false, false, "ProfileInfoModel", 44)), new ff3(new m46(this, z), 2)), new uy3(this, 2)), new io.reactivex.rxjava3.functions.f() { // from class: xsna.n46
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                r46.this.k(z ? uxd0.q0.f.a : uxd0.q0.b.a);
            }
        }, new pv2(new hb(this, 10), 3));
    }

    @Override // xsna.jxb
    public final void onConfigurationChanged(Configuration configuration) {
        Iterator<T> it = i().iterator();
        while (it.hasNext()) {
            ((sxb) it.next()).a.K0(configuration);
        }
    }

    public final void p(Peer peer, Throwable th) {
        if (!epx.f(peer, this.c.f) || th == null) {
            return;
        }
        k(new uxd0.w(th));
    }

    @Override // xsna.jxb
    public final void t() {
        for (sxb sxbVar : i()) {
            txb txbVar = sxbVar.a;
            txbVar.H0();
            txbVar.G0();
            sxbVar.b = null;
        }
    }

    public final void w(DndPeriodAndSound dndPeriodAndSound) {
        this.j.i(new bi0(1, dndPeriodAndSound, this));
        int i = a.$EnumSwitchMapping$0[dndPeriodAndSound.ordinal()];
        k(i != 1 ? i != 2 ? i != 3 ? uxd0.q0.j.a : uxd0.q0.k.a : uxd0.q0.k.a : uxd0.q0.l.a);
        long h = dndPeriodAndSound.h();
        boolean z = h == 0;
        boolean z2 = dndPeriodAndSound != DndPeriodAndSound.DISABLED_SOUND;
        uum.a aVar = new uum.a();
        aVar.a = this.c.f;
        aVar.a(h, z);
        aVar.c = Boolean.valueOf(z2);
        this.d.D(this, new uum(aVar));
    }

    public void y(View view) {
        x(view);
    }

    public void F(qxb qxbVar) {
    }

    public void x(View view) {
    }

    @Override // xsna.jxb
    public void onActivityResult(int i, int i2, Intent intent) {
    }
}
