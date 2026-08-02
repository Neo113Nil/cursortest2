package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.vk.core.serialize.Serializer;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.reporters.api.analytics.click.ImCallClickAnalyticsItem;
import com.vk.im.reporters.api.analytics.click.ImCallTypeAnalyticsItem;
import com.vk.im.ui.components.common.DndPeriod;
import com.vk.im.ui.components.dialog_header.DialogHeaderController;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.max.MaxRedirectHandler;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeImChatItem;
import xsna.iyv;
import xsna.mwv;
import xsna.u8m;

/* compiled from: VcCallbackImpl.kt */
/* loaded from: classes2.dex */
public final class rkr0 implements efm {
    public final afm a;

    public rkr0(afm afmVar) {
        this.a = afmVar;
    }

    @Override // xsna.efm
    public final void A() {
        io.reactivex.rxjava3.disposables.c cVar = this.a.u;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.efm
    public final void B() {
        Peer Zb;
        DialogHeaderController.d dVar;
        afm afmVar = this.a;
        Dialog a = afmVar.D.a();
        if (a == null || (Zb = a.Zb()) == null || (dVar = afmVar.E) == null) {
            return;
        }
        ChatFragment chatFragment = ChatFragment.this;
        chatFragment.r0.b().O(chatFragment.u0, "dialog_actions", Zb, null);
    }

    @Override // xsna.efm
    public final void a(boolean z) {
        afm afmVar = this.a;
        zsk0 zsk0Var = afmVar.D;
        io.reactivex.rxjava3.disposables.c cVar = afmVar.u;
        if ((cVar == null || cVar.h()) && zsk0Var.c()) {
            dfm dfmVar = afmVar.z;
            if (dfmVar != null) {
                dfmVar.a();
            }
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            afmVar.u = afmVar.i.E(afmVar, new kj30(Peer.a.b(zsk0Var.c), z, false, false, afm.G, 44)).subscribe(new defpackage.i0(new kpd(afmVar, 4), 17), new p41(new lpd(afmVar, 5), 15));
        }
    }

    @Override // xsna.efm
    public final void b() {
        afm afmVar = this.a;
        zsk0 zsk0Var = afmVar.D;
        if (hg1.d(afmVar.w) || !zsk0Var.c()) {
            return;
        }
        Dialog a = zsk0Var.a();
        Boolean valueOf = a != null ? Boolean.valueOf(a.tc()) : null;
        if (valueOf == null) {
            return;
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        afmVar.w = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(afmVar.i.F(afmVar, new ivm(Peer.a.b(zsk0Var.c), afm.G)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new tz(new iz0(afmVar, valueOf), 13)), new q46(afmVar, 1)).subscribe(new knd(new com.vk.movika.sdk.base.observable.e0(18), 1), new defpackage.x(new ifg(afmVar, 8), 17));
    }

    @Override // xsna.efm
    public final void c() {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        ffm ffmVar = zdwVar.e.e;
        afm afmVar = this.a;
        long j = afmVar.D.c;
        ffmVar.getClass();
        ffm.a(j, SchemeStat$TypeImChatItem.Subtype.PIN_TO_CHAT_LIST);
        j9k j9kVar = new j9k(afmVar, 1);
        a1w a1wVar = afmVar.i;
        mim mimVar = new mim(Source.CACHE);
        cp0 cp0Var = new cp0(j9kVar, 20);
        int i = kwg0.a;
        afmVar.t.b(a1wVar.E(afmVar, mimVar).subscribe(cp0Var, new hwg0()));
    }

    @Override // xsna.efm
    public final void d() {
        afm afmVar = this.a;
        a1w a1wVar = afmVar.i;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        a1wVar.D(afmVar, new vgm(Peer.a.b(afmVar.D.c)));
    }

    @Override // xsna.efm
    public final void e() {
        afm afmVar = this.a;
        zsk0 zsk0Var = afmVar.D;
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        ffm ffmVar = zdwVar.e.e;
        long j = zsk0Var.c;
        ffmVar.getClass();
        ffm.a(j, SchemeStat$TypeImChatItem.Subtype.UNPIN_FROM_CHAT_LIST);
        a1w a1wVar = afmVar.i;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        a1wVar.D(afmVar, new dmm(Peer.a.b(zsk0Var.c)));
    }

    @Override // xsna.efm
    public final void f() {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        ffm ffmVar = zdwVar.e.e;
        long j = this.a.D.c;
        ffmVar.getClass();
        ffm.a(j, SchemeStat$TypeImChatItem.Subtype.CHAT_MENU_OPEN);
    }

    @Override // xsna.efm
    public final void g() {
        afm afmVar = this.a;
        zsk0 zsk0Var = afmVar.D;
        if (hg1.d(afmVar.v) || !zsk0Var.c()) {
            return;
        }
        Dialog a = zsk0Var.a();
        Boolean valueOf = a != null ? Boolean.valueOf(a.tc()) : null;
        if (valueOf == null) {
            return;
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        afmVar.v = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(afmVar.i.F(afmVar, new wrm(Peer.a.b(zsk0Var.c), false, afm.G)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new b00(new bhh(6, afmVar, valueOf), 19)), new h9b(afmVar, 1)).subscribe(new g68(new z13(12)), new pm1(new f1j(afmVar, 5), 15));
    }

    @Override // xsna.efm
    public final void h() {
        afm afmVar = this.a;
        DialogHeaderController.d dVar = afmVar.E;
        if (dVar != null) {
            DialogExt b = afmVar.D.b();
            DialogHeaderController dialogHeaderController = DialogHeaderController.this;
            DialogHeaderController.a aVar = dialogHeaderController.d;
            aVar.b.b().v(dialogHeaderController.e, b, false, aVar.a.q());
        }
    }

    @Override // xsna.efm
    public final void i() {
        ChatSettings Hb;
        afm afmVar = this.a;
        Dialog a = afmVar.D.a();
        if (a == null || (Hb = a.Hb()) == null || !Hb.h) {
            return;
        }
        afmVar.Z0();
    }

    @Override // xsna.efm
    public final void j(biu biuVar) {
        DialogHeaderController.d dVar = this.a.E;
        if (dVar != null) {
            ChatFragment chatFragment = ChatFragment.this;
            ImSearchItemLoggingInfo imSearchItemLoggingInfo = chatFragment.h0;
            if (imSearchItemLoggingInfo != null) {
                ImSearchAnalytics.d(ImSearchAnalytics.ClickAction.CALL_OUT, imSearchItemLoggingInfo);
            }
            VoipCallSource voipCallSource = new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.IM_JOIN_HEADER, MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT);
            umb umbVar = chatFragment.Y;
            if (umbVar == null) {
                umbVar = null;
            }
            umbVar.a(biuVar, voipCallSource);
        }
    }

    @Override // xsna.efm
    public final void k() {
        afm afmVar = this.a;
        zsk0 zsk0Var = afmVar.D;
        if (zsk0Var.c()) {
            DialogExt dialogExt = zsk0Var.a() != null ? new DialogExt(zsk0Var.a(), zsk0Var.e) : new DialogExt(zsk0Var.c, zsk0Var.e);
            DialogHeaderController.d dVar = afmVar.E;
            if (dVar != null) {
                DialogHeaderController dialogHeaderController = DialogHeaderController.this;
                dialogHeaderController.d.b.b().g(dialogHeaderController.e, dialogExt);
            }
        }
    }

    @Override // xsna.efm
    public final void l() {
        io.reactivex.rxjava3.disposables.c cVar = this.a.w;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.efm
    public final void m(boolean z) {
        afm afmVar = this.a;
        mxv mxvVar = afmVar.j;
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        ffm ffmVar = zdwVar.e.e;
        long j = afmVar.D.c;
        ffmVar.getClass();
        ffm.a(j, z ? SchemeStat$TypeImChatItem.Subtype.ENABLE_NOTIFICATIONS : SchemeStat$TypeImChatItem.Subtype.DISABLE_NOTIFICATIONS);
        if (z) {
            afmVar.X0(true, DndPeriod.NEVER);
            return;
        }
        if (!z) {
            mxvVar.getClass();
            afmVar.X0(false, DndPeriod.FOREVER);
        } else {
            if (z) {
                return;
            }
            mxvVar.getClass();
        }
    }

    @Override // xsna.efm
    public final void n() {
        io.reactivex.rxjava3.disposables.c cVar = this.a.v;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.efm
    public final void o(final boolean z) {
        cvk.r(new gzs() { // from class: xsna.pkr0
            @Override // xsna.gzs
            public final Object invoke() {
                ImCallTypeAnalyticsItem imCallTypeAnalyticsItem;
                io.reactivex.rxjava3.core.x n;
                Peer Zb;
                rkr0 rkr0Var = rkr0.this;
                boolean z2 = z;
                DialogExt b = rkr0Var.a.D.b();
                afm afmVar = rkr0Var.a;
                mwv<mwv.a> mwvVar = afmVar.q;
                Dialog a = afmVar.D.a();
                Peer.Type type = (a == null || (Zb = a.Zb()) == null) ? null : Zb.c;
                if (type == null || (imCallTypeAnalyticsItem = fyv.a(type)) == null) {
                    imCallTypeAnalyticsItem = ImCallTypeAnalyticsItem.USER;
                }
                mwvVar.a(new ImCallClickAnalyticsItem.d(z2 ? ImCallClickAnalyticsItem.ConversationType.VIDEO : ImCallClickAnalyticsItem.ConversationType.AUDIO, imCallTypeAnalyticsItem));
                DialogHeaderController.d dVar = afmVar.E;
                if (dVar != null) {
                    ImSearchItemLoggingInfo imSearchItemLoggingInfo = ChatFragment.this.h0;
                    if (imSearchItemLoggingInfo != null) {
                        ImSearchAnalytics.d(ImSearchAnalytics.ClickAction.CALL_OUT, imSearchItemLoggingInfo);
                    }
                    VoipCallSource voipCallSource = new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.IM_HEADER, MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT);
                    DialogHeaderController dialogHeaderController = DialogHeaderController.this;
                    Context context = dialogHeaderController.e;
                    cau0 cau0Var = dialogHeaderController.d.a.r().h;
                    kyv j = DialogHeaderController.this.d.b.j();
                    if (b.Cb() != null) {
                        n = io.reactivex.rxjava3.core.x.k(b);
                    } else {
                        a1w a1wVar = q1w.a;
                        if (a1wVar == null) {
                            a1wVar = null;
                        }
                        n = hg1.n(a1wVar.E("DialogBundle", new uqm(b.f, Source.ACTUAL)).l(new y7(new oce(b, 16), 17)), context, false, null, 62);
                    }
                    hg1.i(n, new ba9(context, voipCallSource, cau0Var, j, z2));
                }
                return s3q0.a;
            }
        });
    }

    @Override // xsna.efm
    public final void onClose() {
        DialogHeaderController.d dVar;
        ww50<?> Y;
        fcn z;
        afm afmVar = this.a;
        if (!afmVar.D.c() || (dVar = afmVar.E) == null) {
            return;
        }
        ChatFragment chatFragment = ChatFragment.this;
        Bundle arguments = chatFragment.getArguments();
        if (!(arguments != null ? arguments.getBoolean("is_pop_up", false) : false)) {
            if (chatFragment.uo()) {
                return;
            }
            chatFragment.kn().onNavigateUp();
            return;
        }
        LayoutInflater.Factory activity = chatFragment.getActivity();
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        if (ey50Var == null || (Y = ey50Var.Y()) == null || (z = Y.z()) == null) {
            chatFragment.kn().onNavigateUp();
        } else {
            z.dismiss();
        }
    }

    @Override // xsna.efm
    public final void p() {
        ImCallTypeAnalyticsItem imCallTypeAnalyticsItem;
        Peer Zb;
        afm afmVar = this.a;
        mwv<mwv.a> mwvVar = afmVar.q;
        Dialog a = afmVar.D.a();
        Peer.Type type = (a == null || (Zb = a.Zb()) == null) ? null : Zb.c;
        if (type == null || (imCallTypeAnalyticsItem = fyv.a(type)) == null) {
            imCallTypeAnalyticsItem = ImCallTypeAnalyticsItem.USER;
        }
        mwvVar.a(new ImCallClickAnalyticsItem.d(ImCallClickAnalyticsItem.ConversationType.MAX, imCallTypeAnalyticsItem));
        afmVar.r.a(MaxRedirectHandler.Entrypoint.Calls);
    }

    @Override // xsna.efm
    public final void q() {
        afm afmVar = this.a;
        zsk0 zsk0Var = afmVar.D;
        if (zsk0Var.c()) {
            DialogExt dialogExt = zsk0Var.a() != null ? new DialogExt(zsk0Var.a(), zsk0Var.e) : new DialogExt(zsk0Var.c, zsk0Var.e);
            DialogHeaderController.d dVar = afmVar.E;
            if (dVar != null) {
                DialogHeaderController dialogHeaderController = DialogHeaderController.this;
                dialogHeaderController.d.b.b().E(dialogHeaderController.e, dialogExt);
            }
        }
    }

    @Override // xsna.efm
    public final void r() {
        afm afmVar = this.a;
        DialogHeaderController.d dVar = afmVar.E;
        if (dVar != null) {
            DialogExt b = afmVar.D.b();
            ChatFragment chatFragment = ChatFragment.this;
            ImSearchItemLoggingInfo imSearchItemLoggingInfo = chatFragment.h0;
            if (imSearchItemLoggingInfo != null) {
                ImSearchAnalytics.d(ImSearchAnalytics.ClickAction.OPEN_MSG_SEARCH_OUT, imSearchItemLoggingInfo);
            }
            chatFragment.r0.b().Q(chatFragment.kn(), b, chatFragment.no(), null);
        }
    }

    @Override // xsna.efm
    public final void s(boolean z) {
        afm afmVar = this.a;
        zsk0 zsk0Var = afmVar.D;
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        ffm ffmVar = zdwVar.e.e;
        long j = zsk0Var.c;
        ffmVar.getClass();
        ffm.a(j, z ? SchemeStat$TypeImChatItem.Subtype.ALLOW_MESSAGES : SchemeStat$TypeImChatItem.Subtype.BLOCK_MESSAGES);
        Dialog a = zsk0Var.a();
        if (a != null) {
            Peer Zb = a.Zb();
            Zb.getClass();
            if (Zb.Ab(Peer.Type.GROUP)) {
                afmVar.i.D("DialogHeaderInfoComponent", new fpu(a.Zb(), z));
            }
        }
    }

    @Override // xsna.efm
    public final void t(u8m.r<?> rVar) {
        afm afmVar = this.a;
        if (afmVar.D.a() == null) {
            return;
        }
        afmVar.j.k();
        afmVar.k.B();
    }

    @Override // xsna.efm
    public final void u() {
        DialogHeaderController.d dVar;
        afm afmVar = this.a;
        zsk0 zsk0Var = afmVar.D;
        if (!zsk0Var.c() || (dVar = afmVar.E) == null) {
            return;
        }
        DialogExt b = zsk0Var.b();
        DialogHeaderController dialogHeaderController = DialogHeaderController.this;
        dialogHeaderController.d.b.b().A(dialogHeaderController.e, b);
    }

    @Override // xsna.efm
    public final void v() {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        ffm ffmVar = zdwVar.e.e;
        long j = this.a.D.c;
        ffmVar.getClass();
        ffm.a(j, SchemeStat$TypeImChatItem.Subtype.CLEAR_HISTORY);
    }

    @Override // xsna.efm
    public final void w() {
        ImCallTypeAnalyticsItem imCallTypeAnalyticsItem;
        Peer Zb;
        afm afmVar = this.a;
        mwv<mwv.a> mwvVar = afmVar.q;
        Dialog a = afmVar.D.a();
        Peer.Type type = (a == null || (Zb = a.Zb()) == null) ? null : Zb.c;
        if (type == null || (imCallTypeAnalyticsItem = fyv.a(type)) == null) {
            imCallTypeAnalyticsItem = ImCallTypeAnalyticsItem.USER;
        }
        mwvVar.a(new ImCallClickAnalyticsItem.i(imCallTypeAnalyticsItem));
    }

    @Override // xsna.efm
    public final void x() {
        ImCallTypeAnalyticsItem imCallTypeAnalyticsItem;
        Peer Zb;
        afm afmVar = this.a;
        mwv<mwv.a> mwvVar = afmVar.q;
        Dialog a = afmVar.D.a();
        Peer.Type type = (a == null || (Zb = a.Zb()) == null) ? null : Zb.c;
        if (type == null || (imCallTypeAnalyticsItem = fyv.a(type)) == null) {
            imCallTypeAnalyticsItem = ImCallTypeAnalyticsItem.USER;
        }
        mwvVar.a(new iyv.a(imCallTypeAnalyticsItem));
    }

    @Override // xsna.efm
    public final void y() {
        afm afmVar = this.a;
        DialogHeaderController.d dVar = afmVar.E;
        if (dVar != null) {
            DialogExt b = afmVar.D.b();
            ChatFragment chatFragment = ChatFragment.this;
            ImSearchItemLoggingInfo imSearchItemLoggingInfo = chatFragment.h0;
            if (imSearchItemLoggingInfo != null) {
                ImSearchAnalytics.d(ImSearchAnalytics.ClickAction.INVITE_OUT, imSearchItemLoggingInfo);
            }
            ktb ktbVar = chatFragment.b1;
            if (ktbVar == null) {
                ktbVar = null;
            }
            ktbVar.c(b.f);
        }
    }

    @Override // xsna.efm
    public final void z() {
        afm afmVar = this.a;
        Dialog a = afmVar.D.a();
        if (a == null) {
            return;
        }
        ChatSettings Hb = a.Hb();
        if (Hb == null || !Hb.J) {
            Peer Zb = a.Zb();
            Zb.getClass();
            if (Zb.Ab(Peer.Type.EMAIL) || Zb.Ab(Peer.Type.UNKNOWN) || afmVar.n == 2) {
                return;
            }
            g2v.c().getClass();
            g2v.c().getClass();
            afmVar.Z0();
        }
    }
}
