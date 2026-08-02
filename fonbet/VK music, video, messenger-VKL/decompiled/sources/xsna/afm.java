package xsna;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.reporters.syncstate.ImSyncStateStatReporter;
import com.vk.im.ui.components.common.DndPeriod;
import com.vk.im.ui.components.dialog_header.DialogHeaderController;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.components.viewcontrollers.dialog_header.info.RefreshInfo;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.max.MaxRedirectHandler;
import com.vk.toggle.features.ImFeatures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import xsna.g1e0;
import xsna.mwv;
import xsna.odw;
import xsna.u8m;
import xsna.uum;

/* compiled from: DialogHeaderInfoComponent.kt */
/* loaded from: classes2.dex */
public final class afm extends j8i {
    public static final f9w F = e9w.a(afm.class);
    public static final Object G = new Object();
    public final rkr0 A;
    public final odw B;
    public final com.vk.im.engine.reporters.syncstate.a C;
    public final zsk0 D;
    public DialogHeaderController.d E;
    public final a1w i;
    public final mxv j;
    public final u90 k;
    public final kkm l;
    public final boolean m;
    public final int n;
    public final com.vk.im.chat.onlines.api.a o;
    public final s2n0 p;
    public final mwv<mwv.a> q;
    public final MaxRedirectHandler r;
    public final boolean s;
    public io.reactivex.rxjava3.disposables.b t;
    public io.reactivex.rxjava3.disposables.c u;
    public io.reactivex.rxjava3.disposables.c v;
    public io.reactivex.rxjava3.disposables.c w;
    public yok0 x;
    public final bpn0 y;
    public dfm z;

    public afm(a1w a1wVar, mxv mxvVar, u90 u90Var, kkm kkmVar, boolean z, int i, com.vk.im.chat.onlines.api.a aVar, s2n0 s2n0Var, mwv<mwv.a> mwvVar, MaxRedirectHandler maxRedirectHandler) {
        odw qdwVar;
        this.i = a1wVar;
        this.j = mxvVar;
        this.k = u90Var;
        this.l = kkmVar;
        this.m = z;
        this.n = i;
        this.o = aVar;
        this.p = s2n0Var;
        this.q = mwvVar;
        this.r = maxRedirectHandler;
        ImFeatures imFeatures = ImFeatures.IM_CHAT_TOOLBAR_REDESIGN;
        imFeatures.getClass();
        this.s = com.vk.toggle.b.A.a(imFeatures);
        this.t = new io.reactivex.rxjava3.disposables.b();
        this.y = new bpn0(new ozf(this, 16));
        this.A = new rkr0(this);
        Peer q = a1wVar.q();
        q.getClass();
        if (q.Ab(Peer.Type.GROUP)) {
            odw.a.getClass();
            qdwVar = odw.a.b;
        } else {
            qdwVar = new qdw(a1wVar, mxvVar.g());
        }
        this.B = qdwVar;
        LongPollType longPollType = LongPollType.MESSAGES;
        ImSyncStateStatReporter.Target target = ImSyncStateStatReporter.Target.DIALOG;
        fr frVar = new fr(12);
        this.C = new com.vk.im.engine.reporters.syncstate.a(a1wVar, frVar, new com.vk.im.engine.reporters.syncstate.c(frVar), new j8(27), longPollType, target);
        zsk0 zsk0Var = new zsk0();
        zsk0Var.b = ImBgSyncState.DISCONNECTED;
        zsk0Var.d = new xpp<>();
        zsk0Var.e = new ProfilesInfo();
        zsk0Var.g = new ArrayList();
        zsk0Var.j = true;
        this.D = zsk0Var;
    }

    @Override // xsna.j8i
    public final void K0(Configuration configuration) {
        dfm dfmVar = this.z;
        if (dfmVar != null) {
            dfmVar.j();
        }
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        dfm bVar;
        if (this.s) {
            bVar = new cfm(layoutInflater, viewStub, this.l, this.m, this.p);
        } else {
            bVar = new com.vk.im.ui.components.viewcontrollers.dialog_header.info.b(layoutInflater, viewStub, this.l, this.m, this.p);
        }
        this.z = bVar;
        bVar.g(this.A);
        b1();
        return this.z.getView();
    }

    @Override // xsna.j8i
    public final void M0() {
        if (this.D.a) {
            g1();
        }
    }

    @Override // xsna.j8i
    public final void N0() {
        dfm dfmVar = this.z;
        if (dfmVar != null) {
            dfmVar.g(null);
        }
        dfm dfmVar2 = this.z;
        if (dfmVar2 != null) {
            dfmVar2.destroy();
        }
        this.z = null;
        ((com.vk.im.popup.a) this.y.getValue()).dismiss();
    }

    public final void X0(boolean z, DndPeriod dndPeriod) {
        Dialog a = this.D.a();
        if (a != null) {
            uum.a aVar = new uum.a();
            aVar.a = a.Zb();
            aVar.a(dndPeriod.h(), z);
            aVar.c = Boolean.valueOf(a.notificationsIsUseSound);
            this.i.D(this, new uum(aVar));
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
    public final void Y0() {
        zsk0 zsk0Var = this.D;
        if (zsk0Var.h || zsk0Var.i) {
            return;
        }
        boolean d = zsk0Var.d.d();
        a1w a1wVar = this.i;
        Object obj = G;
        if ((d || zsk0Var.e.Gb()) && !zsk0Var.h && !zsk0Var.i) {
            zsk0Var.i = true;
            this.t.b(a1wVar.F(this, new loz(zsk0Var.c, obj)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new xn(new yem(1, this, afm.class, "onUpdateAllByActualSuccess", "onUpdateAllByActualSuccess(Lcom/vk/im/ui/components/dialog_header/info/tasks/LoadAllByActualCmd$Result;)V", 0), 14), new js1(new y89(1, this, afm.class, "onUpdateAllByActualError", "onUpdateAllByActualError(Ljava/lang/Throwable;)V", 0, 6), 24)));
        }
        ProfilesInfo profilesInfo = zsk0Var.e;
        ArrayList arrayList = zsk0Var.g;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((vh30) it.next()).a);
        }
        profilesInfo.getClass();
        f1e0 f1e0Var = new f1e0();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Peer peer = (Peer) it2.next();
            if (!((wpp) profilesInfo.g.get(peer.c)).b(Long.valueOf(peer.d))) {
                f1e0Var.c(peer);
            }
        }
        if (!f1e0Var.g() || zsk0Var.h || zsk0Var.i) {
            return;
        }
        zsk0Var.i = true;
        g1e0.a aVar = new g1e0.a();
        aVar.a.e(f1e0Var);
        aVar.b = Source.ACTUAL;
        aVar.c = true;
        aVar.d = obj;
        int i = 0;
        this.t.b(a1wVar.F(this, new d1e0(new g1e0(aVar))).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new wn(new pj1(1, this, afm.class, "onLoadMemberSuccess", "onLoadMemberSuccess(Lcom/vk/im/engine/models/ProfilesInfo;)V", i, 7), 19), new is1(new n9b(1, this, afm.class, "onLoadMemberError", "onLoadMemberError(Ljava/lang/Throwable;)V", i, 4), 21)));
    }

    public final void Z0() {
        zsk0 zsk0Var = this.D;
        if (zsk0Var.c()) {
            DialogExt dialogExt = zsk0Var.a() != null ? new DialogExt(zsk0Var.a(), zsk0Var.e) : new DialogExt(zsk0Var.c, zsk0Var.e);
            DialogHeaderController.d dVar = this.E;
            if (dVar != null) {
                ChatFragment chatFragment = ChatFragment.this;
                ImSearchItemLoggingInfo imSearchItemLoggingInfo = chatFragment.h0;
                if (imSearchItemLoggingInfo != null) {
                    ImSearchAnalytics.d(ImSearchAnalytics.ClickAction.OPEN_CHAT_PROFILE_OUT, imSearchItemLoggingInfo);
                }
                g2v.c().getClass();
                g2v.c().getClass();
                chatFragment.r0.b().o(chatFragment.requireContext(), dialogExt, chatFragment.no());
            }
        }
    }

    public final void a1() {
        zsk0 zsk0Var = this.D;
        boolean z = zsk0Var.n;
        Dialog a = zsk0Var.a();
        boolean a2 = him.a(this.i, a, zsk0Var.e);
        MaxRedirectHandler maxRedirectHandler = this.r;
        boolean z2 = false;
        boolean z3 = maxRedirectHandler.c() && maxRedirectHandler.b();
        dfm dfmVar = this.z;
        if (dfmVar != null) {
            dfmVar.w(z && a2);
        }
        dfm dfmVar2 = this.z;
        if (dfmVar2 != null) {
            dfmVar2.s(z3);
        }
        if (a != null) {
            if (zsk0Var.o && !a.uc()) {
                z2 = true;
            }
            if (zsk0Var.o == z2) {
                return;
            }
            zsk0Var.o = z2;
            dfm dfmVar3 = this.z;
            if (dfmVar3 != null) {
                dfmVar3.r(z2);
            }
        }
    }

    public final void b1() {
        dfm dfmVar;
        dfm dfmVar2;
        dfm dfmVar3;
        dfm dfmVar4 = this.z;
        zsk0 zsk0Var = this.D;
        if (dfmVar4 != null) {
            dfmVar4.i(zsk0Var.j);
        }
        this.j.getClass();
        Dialog a = zsk0Var.a();
        Peer q = this.i.q();
        boolean z = false;
        if (a != null) {
            boolean Ab = q.Ab(Peer.Type.GROUP);
            ChatSettings Hb = a.Hb();
            if (Hb != null && Hb.n && !a.sc() && !Ab) {
                z = true;
            }
        }
        dfm dfmVar5 = this.z;
        if (dfmVar5 != null) {
            dfmVar5.h(z);
        }
        a1();
        dfm dfmVar6 = this.z;
        if (dfmVar6 != null) {
            dfmVar6.r(zsk0Var.o);
        }
        c1();
        d1();
        e1();
        if (!zsk0Var.a || zsk0Var.d.c()) {
            dfm dfmVar7 = this.z;
            if (dfmVar7 != null) {
                dfmVar7.o();
            }
            dfm dfmVar8 = this.z;
            if (dfmVar8 != null) {
                dfmVar8.u(Collections.EMPTY_LIST);
            }
        } else {
            dfm dfmVar9 = this.z;
            if (dfmVar9 != null) {
                lfm lfmVar = new lfm();
                lfmVar.b = new ProfilesSimpleInfo();
                lfmVar.a = zsk0Var.a();
                lfmVar.b = zsk0Var.e.Ob();
                lfmVar.c = zsk0Var.f;
                dfmVar9.f(lfmVar);
            }
            dfm dfmVar10 = this.z;
            if (dfmVar10 != null) {
                dfmVar10.u(zsk0Var.g);
            }
        }
        zsk0Var.a();
        io.reactivex.rxjava3.disposables.c cVar = this.u;
        if (cVar != null && !cVar.h() && (dfmVar3 = this.z) != null) {
            dfmVar3.a();
        }
        if (hg1.d(this.v) && (dfmVar2 = this.z) != null) {
            dfmVar2.p();
        }
        if (!hg1.d(this.w) || (dfmVar = this.z) == null) {
            return;
        }
        dfmVar.n();
    }

    public final void c1() {
        ArrayList arrayList;
        dfm dfmVar = this.z;
        if (dfmVar != null) {
            zsk0 zsk0Var = this.D;
            Dialog a = zsk0Var.a();
            ProfilesSimpleInfo Ob = zsk0Var.e.Ob();
            boolean z = false;
            boolean z2 = a != null && a.sc();
            this.j.getClass();
            int i = w8m.a;
            this.i.r();
            u8m.a aVar = u8m.a.b;
            u8m.r0 r0Var = u8m.r0.b;
            if (a != null) {
                xuo0.a.getClass();
                long a2 = xuo0.a();
                ChatSettings Hb = a.Hb();
                boolean z3 = Hb != null ? Hb.h : false;
                boolean equals = a.Zb().equals(com.vk.dto.common.a.a);
                arrayList = new ArrayList();
                arrayList.add(r0Var);
                if (a.qc()) {
                    arrayList.add(a.tc() ? u8m.d.b : a.uc() ? u8m.e.b : u8m.f.b);
                }
                if (!z3 && !a.uc()) {
                    arrayList.add(u8m.m.b);
                }
                if (z3) {
                    arrayList.add(u8m.j.b);
                }
                if (a.bc() == Peer.Type.USER) {
                    p4g.a(u8m.j0.b, arrayList, a.Jc());
                    p4g.a(u8m.l0.b, arrayList, !a.Jc());
                    qtd0 Ab = Ob.Ab(a.Sb());
                    p4g.a(u8m.a0.b, arrayList, (Ab != null && Ab.r5()) && BuildInfo.s());
                    p4g.a(u8m.k0.b, arrayList, !a.Jc());
                }
                if (a.bc() == Peer.Type.GROUP) {
                    arrayList.add(u8m.i0.b);
                    Group group = (Group) Ob.e.get(Long.valueOf(a.ac()));
                    if (group != null) {
                        boolean z4 = group.i;
                        if (group.h) {
                            arrayList.add(u8m.v.b);
                        } else {
                            p4g.a(u8m.y.b, arrayList, z4);
                            p4g.a(u8m.x.b, arrayList, !z4);
                        }
                    }
                }
                if (a.uc()) {
                    ChatSettings Hb2 = a.Hb();
                    p4g.a(aVar, arrayList, Hb2 != null ? Hb2.n : false);
                }
                if (!a.sc()) {
                    boolean t1 = a.t1();
                    u8m.i iVar = u8m.i.b;
                    if (t1) {
                        p4g.a(iVar, arrayList, a.Gb() && !equals);
                    } else {
                        ChatSettings Hb3 = a.Hb();
                        p4g.a(iVar, arrayList, Hb3 != null ? Hb3.T : false);
                    }
                }
                p4g.a(u8m.g0.b, arrayList, (a.Jc() || a.Ac(a2)) ? false : true);
                if (!a.Jc() && a.Ac(a2)) {
                    z = true;
                }
                p4g.a(u8m.f0.b, arrayList, z);
            } else {
                arrayList = new ArrayList();
            }
            p4g.l(arrayList, r0Var, z2);
            p4g.l(arrayList, aVar, z2);
            dfmVar.b(arrayList);
        }
    }

    public final void d1() {
        dfm dfmVar = this.z;
        zsk0 zsk0Var = this.D;
        if (dfmVar != null) {
            dfmVar.t(zsk0Var.k);
        }
        dfm dfmVar2 = this.z;
        if (dfmVar2 != null) {
            dfmVar2.e(zsk0Var.l);
        }
    }

    public final void e1() {
        RefreshInfo refreshInfo;
        dfm dfmVar = this.z;
        if (dfmVar != null) {
            zsk0 zsk0Var = this.D;
            int i = tkr0.$EnumSwitchMapping$0[zsk0Var.b.ordinal()];
            if (i != 1) {
                refreshInfo = i != 2 ? (i == 3 || i == 4) ? zsk0Var.m ? RefreshInfo.REFRESHING : RefreshInfo.CONNECTED : RefreshInfo.DISCONNECTED : RefreshInfo.REFRESHING;
            } else {
                r6m.a.getClass();
                refreshInfo = r6m.j() ? RefreshInfo.CONNECTING : RefreshInfo.WAIT_FOR_NETWORK;
            }
            dfmVar.q(refreshInfo);
        }
    }

    public final void f1(long j, DialogExt dialogExt) {
        ProfilesInfo profilesInfo;
        a1w a1wVar = this.i;
        if (a1wVar.u()) {
            zsk0 zsk0Var = this.D;
            zsk0Var.a = true;
            zsk0Var.b = a1wVar.p().a(LongPollType.MESSAGES);
            zsk0Var.c = j;
            this.t.b(a1wVar.l.a().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new fyp(this)));
            if (!zsk0Var.h) {
                zsk0Var.d = new ypp(Long.valueOf(zsk0Var.c), dialogExt != null ? dialogExt.Cb() : null, false);
                if (dialogExt == null || (profilesInfo = dialogExt.b) == null) {
                    profilesInfo = new ProfilesInfo();
                }
                zsk0Var.e = profilesInfo;
                zsk0Var.g = new ArrayList();
                zsk0Var.h = true;
                zsk0Var.i = false;
                b1();
                this.t.b(a1wVar.F(this, new opz(zsk0Var.c, G, Source.CACHE)).w().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new bf2(new wem(1, this, afm.class, "onLoadInitSuccess", "onLoadInitSuccess(Lcom/vk/im/ui/components/dialog_header/info/tasks/LoadInitCmd$Result;)V", 0), 13), new f40(new lp1(1, this, afm.class, "onLoadInitError", "onLoadInitError(Ljava/lang/Throwable;)V", 0, 5), 16)));
            }
            yok0 yok0Var = this.x;
            if (yok0Var != null) {
                yok0Var.b(null);
            }
            this.x = myc0.h(this.h, null, null, new xem(this, j, null), 3);
        }
    }

    public final void g1() {
        this.t.dispose();
        this.t = new io.reactivex.rxjava3.disposables.b();
        this.C.shutdown();
        yok0 yok0Var = this.x;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        this.x = null;
        io.reactivex.rxjava3.disposables.c cVar = this.u;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.v;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar3 = this.w;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        zsk0 zsk0Var = this.D;
        zsk0Var.a = false;
        zsk0Var.b = ImBgSyncState.DISCONNECTED;
        zsk0Var.c = 0L;
        zsk0Var.d = new xpp<>();
        zsk0Var.e = new ProfilesInfo();
        zsk0Var.g = new ArrayList();
        zsk0Var.h = false;
        zsk0Var.i = false;
        b1();
    }
}
