package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.MsgListEmptyViewState;
import com.vk.stickers.views.sticker.StickerAnimationState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.kq4;
import xsna.tha0;

/* compiled from: MsgViewContentComponent.kt */
/* loaded from: classes2.dex */
public final class j140 extends j8i {
    public final tha0 E;
    public k28 F;
    public final e38 G;
    public final q9 H;
    public final lq4 I;
    public final h1l J;
    public final e2l0 K;
    public final sxd0 L;
    public final v2n0 M;
    public final v2n0 N;
    public final tk30 O;
    public List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> P;
    public ctk0 Q;
    public vm30 R;
    public sfj S;
    public sxv T;
    public final vd7 U;
    public uxv V;
    public final k140 W;
    public final FragmentActivity i;
    public final DialogExt j;
    public final a1w k;
    public final lzv l;
    public final mxv m;
    public final zdw n;
    public final jbs o;
    public final js4 p;
    public final ir4 q;
    public final sxv r;
    public final uxv s;
    public final boolean t;
    public final kkm u;
    public final ql30 v;
    public final ya20 w;
    public final w530 x;
    public final ArrayList<Attach> y = new ArrayList<>(0);
    public final f9w z = e9w.a(j140.class);
    public final io.reactivex.rxjava3.disposables.b A = new io.reactivex.rxjava3.disposables.b();
    public final ss4 B = new ss4(this);
    public final lr4 C = new lr4(this);
    public final bpn0 D = new bpn0(new f5x(this, 14));

    /* compiled from: MsgViewContentComponent.kt */
    public final class a implements tha0.a {
        public a() {
        }

        @Override // xsna.tha0.a
        public final void a(List list, String str, MsgSendSource msgSendSource) {
            j140.Z0(j140.this, null, str, new ArrayList(list), ((MsgSendSource.a) msgSendSource).a, 1);
        }
    }

    /* compiled from: MsgViewContentComponent.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<ProfilesInfo, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ProfilesInfo profilesInfo) {
            ProfilesInfo profilesInfo2 = profilesInfo;
            j140 j140Var = (j140) this.receiver;
            j140Var.Q.d = profilesInfo2;
            j140Var.L.d(profilesInfo2, null);
            j140Var.X0();
            j140Var.g1();
            return s3q0.a;
        }
    }

    /* compiled from: MsgViewContentComponent.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            j140 j140Var = (j140) this.receiver;
            j140Var.z.a(th2);
            vm30 vm30Var = j140Var.R;
            if (vm30Var != null) {
                vm30Var.H(th2);
            }
            return s3q0.a;
        }
    }

    public j140(FragmentActivity fragmentActivity, DialogExt dialogExt, a1w a1wVar, lzv lzvVar, mxv mxvVar, zdw zdwVar, jbs jbsVar, js4 js4Var, ir4 ir4Var, sxv sxvVar, uxv uxvVar, boolean z, kkm kkmVar, ql30 ql30Var, v1o v1oVar, ya20 ya20Var, w530 w530Var) {
        this.i = fragmentActivity;
        this.j = dialogExt;
        this.k = a1wVar;
        this.l = lzvVar;
        this.m = mxvVar;
        this.n = zdwVar;
        this.o = jbsVar;
        this.p = js4Var;
        this.q = ir4Var;
        this.r = sxvVar;
        this.s = uxvVar;
        this.t = z;
        this.u = kkmVar;
        this.v = ql30Var;
        this.w = ya20Var;
        this.x = w530Var;
        this.E = new tha0(e3m.h(fragmentActivity), mxvVar, jbsVar, kkmVar);
        pbw pbwVar = zdwVar.d;
        this.G = pbwVar.s();
        this.H = new q9(a1wVar, 16);
        new LinkedHashMap();
        lq4 lq4Var = new lq4();
        this.I = lq4Var;
        h1l h1lVar = new h1l();
        this.J = h1lVar;
        e2l0 e2l0Var = new e2l0();
        this.K = e2l0Var;
        sxd0 sxd0Var = new sxd0();
        this.L = sxd0Var;
        this.M = pbwVar.t().z();
        this.N = pbwVar.t().q();
        Context context = e43.a;
        tk30 tk30Var = new tk30(new com.vk.movika.sdk.android.defaultplayer.layout.a(context == null ? null : context), new lk30(false), new tz30(fragmentActivity.getApplicationContext()), new com.vk.im.ui.formatters.a(fragmentActivity.getApplicationContext()), null, v1oVar, null, 932);
        tk30Var.q(zdwVar.i);
        tk30Var.j(lq4Var);
        tk30Var.p(e2l0Var);
        tk30Var.k(h1lVar);
        tk30Var.o(sxd0Var);
        tk30Var.n(w530Var);
        this.O = tk30Var;
        this.Q = new ctk0();
        this.U = new vd7(this);
        this.W = new k140(this);
    }

    public static void Z0(j140 j140Var, String str, String str2, ArrayList arrayList, BotButton botButton, int i) {
        String str3 = (i & 1) != 0 ? "" : str;
        ArrayList arrayList2 = (i & 4) != 0 ? j140Var.y : arrayList;
        o0w b2 = j140Var.m.b();
        FragmentActivity fragmentActivity = j140Var.i;
        DialogExt dialogExt = j140Var.j;
        o0w.x(b2, fragmentActivity, null, dialogExt.e, dialogExt, null, null, false, arrayList2, null, null, null, null, str2, "bot_pinned_msg", null, botButton, str3, false, null, null, null, null, null, 1073368946);
    }

    @Override // xsna.j8i
    public final void K0(Configuration configuration) {
        vm30 vm30Var = this.R;
        if (vm30Var != null) {
            vm30Var.r();
        }
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        FragmentActivity kn = this.o.a.kn();
        bpn0 bpn0Var = enj.a;
        Activity h = e3m.h(kn);
        b9w b9wVar = (b9w) this.D.getValue();
        zdw zdwVar = this.n;
        j3f0 e = zdwVar.e();
        a1w a1wVar = this.k;
        hbw h2 = e != null ? e.h(a1wVar) : null;
        j3f0 e2 = zdwVar.e();
        v1f0 f = e2 != null ? e2.f(a1wVar) : null;
        j3f0 e3 = zdwVar.e();
        xyt e4 = e3 != null ? e3.e(a1wVar) : null;
        ql30 ql30Var = this.v;
        vm30 vm30Var = new vm30(h, layoutInflater, viewGroup, null, false, false, zdwVar, b9wVar, this.H, this.u, h2, f, e4, new wg30(ql30Var.a, ql30Var.b, zdwVar), null, null, null, null, this.U, this.W, null, false, this.J, false, o25.b(o25.a()), false, null, 112443400);
        vm30Var.t0 = new skr0(this);
        this.R = vm30Var;
        this.E.m = new a();
        View view = this.R.t;
        this.F = new k28(view, this.i, this.m.k());
        return view;
    }

    @Override // xsna.j8i
    public final void M0() {
        if (this.Q.a) {
            c1();
        }
        this.M.onDestroy();
        this.N.onDestroy();
        this.K.a.clear();
        this.I.a.clear();
        this.L.c.clear();
        this.J.d();
    }

    @Override // xsna.j8i
    public final void N0() {
        vm30 vm30Var = this.R;
        if (vm30Var != null) {
            vm30Var.b();
        }
        this.R = null;
        this.E.G0();
    }

    @Override // xsna.j8i
    public final void Q0() {
        vm30 vm30Var = this.R;
        if (vm30Var != null) {
            vm30Var.N();
        }
        this.E.V0();
    }

    @Override // xsna.j8i
    public final void R0() {
        vm30 vm30Var = this.R;
        if (vm30Var != null) {
            vm30Var.O();
        }
        this.E.W0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x005f, code lost:
    
        if (r0.g() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X0() {
        if (!this.Q.d.Gb()) {
            f1e0 a2 = lv30.a(this.Q.c);
            ProfilesSimpleInfo Ob = this.Q.d.Ob();
            a2.a.removeAll(Ob.b.keySet());
            a2.b.removeAll(Ob.c.keySet());
            a2.c.removeAll(Ob.d.keySet());
            a2.d.removeAll(Ob.e.keySet());
            a2.e.removeAll(Ob.f.keySet());
        }
        Y0(Source.ACTUAL);
        List singletonList = Collections.singletonList(this.Q.c);
        t6g0 t6g0Var = t6g0.b;
        io.reactivex.rxjava3.internal.operators.completable.y q = new io.reactivex.rxjava3.internal.operators.completable.p(this.k.C("MsgViewContentComponent", new wk70(null, singletonList, t6g0.d().k0().b(this.j.e), 1))).q(asu0.a.c());
        int i = kwg0.a;
        this.A.b(io.reactivex.rxjava3.kotlin.c.d(q, new iz3(12), new nu2("MsgViewContentComponent", 2)));
    }

    public final void Y0(Source source) {
        this.A.b(this.k.F(this, new opx(this.Q.c, source)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new jz(new b(1, this, j140.class, "onInvalidateMembersSuccess", "onInvalidateMembersSuccess(Lcom/vk/im/engine/models/ProfilesInfo;)V", 0), 27), new c120(new c(1, this, j140.class, "onInvalidateMembersError", "onInvalidateMembersError(Ljava/lang/Throwable;)V", 0), 5)));
    }

    public final void a1(MsgFromUser msgFromUser, ProfilesInfo profilesInfo) {
        if (this.Q.a) {
            c1();
        }
        CnvMsgId n = k9q0.n(msgFromUser);
        Boolean bool = Boolean.TRUE;
        this.M.d(on00.f(new Pair(n, bool)));
        this.N.d(on00.f(new Pair(k9q0.n(msgFromUser), bool)));
        b1(msgFromUser, profilesInfo);
    }

    public final void b1(Msg msg, ProfilesInfo profilesInfo) {
        a1w a1wVar = this.k;
        io.reactivex.rxjava3.internal.operators.observable.m1 a2 = a1wVar.l.a();
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = a2.a0(asu0Var.d()).subscribe(new nyp(this));
        io.reactivex.rxjava3.disposables.b bVar = this.A;
        bVar.b(subscribe);
        bVar.b(this.u.c.a0(asu0Var.d()).subscribe(new wnt(new cqv(this, 17), 5)));
        b9w b9wVar = (b9w) this.D.getValue();
        if (b9wVar != null) {
            b9wVar.d(String.valueOf(msg.c));
        }
        ss4 ss4Var = this.B;
        js4 js4Var = this.p;
        js4Var.e(ss4Var);
        this.q.v(this.C);
        ctk0 ctk0Var = new ctk0();
        this.Q = ctk0Var;
        ctk0Var.a = true;
        ctk0Var.b = a1wVar.q();
        ctk0 ctk0Var2 = this.Q;
        ctk0Var2.c = msg;
        ctk0Var2.d = profilesInfo;
        ctk0Var2.e = js4Var.b();
        ctk0 ctk0Var3 = this.Q;
        ctk0Var3.f = this.r;
        ctk0Var3.g = this.s;
        X0();
        f1();
        this.I.e(this.Q.e);
        d1();
        e1();
        g1();
    }

    public final void c1() {
        this.A.e();
        this.q.y(this.C);
        this.p.d(this.B);
        b9w b9wVar = (b9w) this.D.getValue();
        if (b9wVar != null) {
            b9wVar.d(null);
        }
        this.Q = new ctk0();
        f1();
    }

    public final void d1() {
        List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list = this.P;
        if (list == null) {
            return;
        }
        List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> I = this.O.I(list);
        this.P = I;
        vm30 vm30Var = this.R;
        if (vm30Var != null) {
            vm30.x(vm30Var, I, "updateHistoryState", 9);
        }
    }

    public final void e1() {
        ir4 ir4Var = this.q;
        ur4 b2 = ir4Var.b();
        hr4 hr4Var = new hr4(b2 != null ? b2.a : 0, ir4Var.o(), ir4Var.u(), ir4Var.isPlaying());
        lq4 lq4Var = this.I;
        lq4Var.getClass();
        bpn0 bpn0Var = i0q0.a;
        lq4Var.c = hr4Var;
        Iterator it = lq4Var.a.iterator();
        while (it.hasNext()) {
            ((kq4.a) it.next()).i(hr4Var);
        }
        d1();
    }

    public final void f1() {
        vm30 vm30Var = this.R;
        if (vm30Var != null) {
            vm30.x(vm30Var, null, "vcSetDefaults", 9);
        }
        vm30 vm30Var2 = this.R;
        if (vm30Var2 != null) {
            vm30Var2.I.L(false);
        }
        vm30 vm30Var3 = this.R;
        if (vm30Var3 != null) {
            vm30Var3.v(new MsgListEmptyViewState.b(null, this.i.getString(R.string.vkim_pinned_msg_not_found), null, null, 24));
        }
        vm30 vm30Var4 = this.R;
        if (vm30Var4 != null) {
            vm30Var4.z(false);
        }
        this.K.d(this.t ? StickerAnimationState.PLAY : StickerAnimationState.DISABLE);
        this.L.d(this.Q.d, null);
        d1();
        ctk0 ctk0Var = this.Q;
        this.T = ctk0Var.f;
        this.V = ctk0Var.g;
    }

    public final void g1() {
        vm30 vm30Var = this.R;
        DialogExt dialogExt = this.j;
        if (vm30Var != null) {
            vm30Var.h0 = f870.I(dialogExt.Cb());
            vm30Var.P(!r2.m);
            vm30Var.R();
        }
        Boolean bool = dialogExt.k;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        tk30 tk30Var = this.O;
        tk30Var.A(booleanValue);
        tk30Var.B(dialogExt.j);
        Dialog Cb = dialogExt.Cb();
        tk30Var.H(Cb != null ? Integer.valueOf(Cb.gc()) : null);
        tk30Var.F(this.Q.d);
        tk30Var.v(this.k.q());
        vm30 vm30Var2 = this.R;
        if (vm30Var2 != null) {
            vm30.x(vm30Var2, tk30Var.e(new gj30(Collections.singletonList(this.Q.c), EmptySet.b, false, false, false, false), -1), "vcShowMsgFromState", 9);
        }
    }
}
