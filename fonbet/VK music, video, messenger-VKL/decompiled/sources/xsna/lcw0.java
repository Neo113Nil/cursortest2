package xsna;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuFragmentBase;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import xsna.mcw0;
import xsna.xcw0;
import xsna.ycw0;

/* compiled from: VoipActionsBindings.kt */
/* loaded from: classes7.dex */
public abstract class lcw0<T extends ycw0, S extends VoipActionsFeatureState, F extends mcw0<S>> implements pdw0 {
    public final VoipMainMenuFragmentBase a;
    public final gzs<gvw0> b;
    public final gzs<s3q0> c;
    public final gzs<s3q0> d;
    public final F e;
    public final eh8 f;
    public final ov3 g;
    public final io.reactivex.rxjava3.disposables.b h;
    public final gvt0 i;
    public final bpn0 j;
    public final bpn0 k;
    public final p490 l;
    public e41 m;
    public io.reactivex.rxjava3.disposables.c n;

    public lcw0(VoipMainMenuFragmentBase voipMainMenuFragmentBase, gzs gzsVar, gzs gzsVar2, gzs gzsVar3) {
        this.a = voipMainMenuFragmentBase;
        this.b = gzsVar;
        this.c = gzsVar2;
        this.d = gzsVar3;
        this.h = new io.reactivex.rxjava3.disposables.b();
        this.i = new gvt0();
        this.j = new bpn0(new vpn0(this, 16));
        this.k = new bpn0(new g8n0(this, 18));
        this.l = r99.a.a();
        this.n = EmptyDisposable.INSTANCE;
        this.e = e();
        if (ad0.e == null) {
            com.vk.voip.ui.c.b.getClass();
            ad0.e = new eh8(com.vk.voip.ui.c.r, ad0.d, new bpn0(new yv2(5)), com.vk.voip.ui.c.I());
        }
        this.f = ad0.e;
        com.vk.voip.ui.c.b.getClass();
        this.g = com.vk.voip.ui.c.G().j;
    }

    @Override // xsna.pdw0
    public final io.reactivex.rxjava3.core.q<? extends mdw0> a() {
        return this.e.h.a;
    }

    public final void b(e41 e41Var) {
        eh8 eh8Var;
        io.reactivex.rxjava3.subjects.f fVar = (io.reactivex.rxjava3.subjects.f) e41Var.c;
        L l = L.a;
        io.reactivex.rxjava3.internal.operators.observable.b0 F = fVar.F(new hu50(new n8(l, 12), 29));
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = F.a0(asu0Var.d()).subscribe(new qeu0(new r0r0(this, 16), 3));
        io.reactivex.rxjava3.disposables.b bVar = this.h;
        bVar.b(subscribe);
        bVar.b(F.b0(xcw0.c.class).a0(asu0Var.d()).subscribe(new j5v0(new r6i0(this, 27), 2)));
        bVar.b(F.b0(xcw0.y.class).a0(asu0Var.d()).subscribe(new dbu0(new lzl0(this, 19), 1)));
        bVar.b(F.b0(xcw0.v.class).a0(asu0Var.d()).subscribe(new hdi0(new ehm0(this, 16), 9)));
        bVar.b(F.b0(xcw0.s.class).a0(asu0Var.d()).subscribe(new j7l0(new dgu0(this, 2), 12)));
        bVar.b(F.b0(xcw0.h.class).subscribe(new xj50(new tzq0(this, 6), 25)));
        bVar.b(F.b0(xcw0.n.class).subscribe(new x150(new qjg0(this, 23), 22)));
        bVar.b(F.b0(xcw0.j0.class).subscribe(new v4r0(new kyq0(this, 11), 4)));
        bVar.b(F.b0(xcw0.i.class).subscribe(new h4f0(new ixu0(this, 3), 19)));
        bVar.b(F.b0(xcw0.i0.class).subscribe(new u0o0(new z4t0(this, 8), 12)));
        bVar.b(F.b0(xcw0.k0.class).subscribe(new o060(new m2l0(this, 25), 25)));
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(F, new yzt(new j6l0(this, 28), 24)).a0(asu0Var.d()).subscribe(new j3z(new xvl0(this, 20), 28)));
        bVar.b(F.b0(xcw0.e.class).subscribe(new uwv0(new hfv0(this, 3), 1)));
        bVar.b(F.b0(xcw0.g.class).subscribe(new nzs0(new b8j0(this, 24), 4)));
        bVar.b(F.b0(xcw0.r.class).subscribe(new nvm0(new gyo0(this, 16), 12)));
        bVar.b(F.b0(xcw0.e0.class).subscribe(new a8v(new ykt0(this, 7), 29)));
        bVar.b(F.b0(xcw0.w.class).subscribe(new rt10(new mcl0(this), 25)));
        bVar.b(F.b0(xcw0.x.class).subscribe(new cl30(new qit0(this), 21)));
        m99 v = this.l.v();
        if (BuildInfo.s() || BuildInfo.t()) {
            bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, F.b0(xcw0.g0.class), null, null, new qjl0(v, 20)));
        } else {
            bVar.b(F.b0(xcw0.g0.class).subscribe(new yvq0(new csk0(6, this, v), 3)));
        }
        bVar.b(F.b0(xcw0.l.class).subscribe(new h8l0(new wgm0(this, 19), 12)));
        bVar.b(F.b0(xcw0.a0.class).subscribe(new hmq0(new e0w0(this, 1), 10)));
        bVar.b(F.b0(xcw0.f.class).subscribe(new tmz(new cus0(this, 7), 29)));
        bVar.b(F.b0(xcw0.n0.class).subscribe(new vyv0(new pst0(this, 4), 2)));
        bVar.b(F.b0(xcw0.m.class).subscribe(new pw40(new vhs0(this, 10), 24)));
        bVar.b(F.b0(xcw0.t.class).a0(asu0Var.d()).subscribe(new d8u0(new l9v0(this, 3), 4)));
        bVar.b(F.b0(xcw0.a.class).subscribe(new z2v0(new zzl0(11), 3)));
        wcw0 g = e41Var.g();
        zyl0 zyl0Var = new zyl0(e41Var, 23);
        F f = this.e;
        if (f != null && (eh8Var = this.f) != null) {
            io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(f.k(), eh8Var.c(), new wp9(g));
            m.getClass();
            bVar.b(io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.y(m, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).v0(150L, TimeUnit.MILLISECONDS).a0(asu0Var.d()), null, new s8(l, 18), new sxl0(zyl0Var, 16)));
        }
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(com.vk.voip.ui.c.I0(com.vk.voip.ui.c.b), new hhj0(new d220(29), 9)).subscribe(new t6m0(new ubt0(this, 3), 10)));
        this.m = e41Var;
    }

    public final void c() {
        this.l.w();
        this.e.g.dispose();
        ((bzb0) this.j.getValue()).a();
        ((bzb0) this.k.getValue()).a();
        this.n.dispose();
        this.h.dispose();
    }

    public final void d(izs<? super Boolean, s3q0> izsVar) {
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new gti0(1));
        asu0 asu0Var = asu0.a;
        this.h.b(io.reactivex.rxjava3.kotlin.c.e(vVar.q(asu0Var.c()).m(asu0Var.d()), new n1g0(14), izsVar));
    }

    public abstract F e();

    public final void g(boolean z) {
        int i = BroadcastConfigFragment.U;
        FragmentManager parentFragmentManager = this.a.getParentFragmentManager();
        BroadcastConfigFragment broadcastConfigFragment = new BroadcastConfigFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isCallRecordKey", z);
        broadcastConfigFragment.setArguments(bundle);
        broadcastConfigFragment.Td(parentFragmentManager, "BroadcastConfigFragment");
    }

    public void f() {
    }

    public /* synthetic */ lcw0(VoipMainMenuFragmentBase voipMainMenuFragmentBase, gzs gzsVar, gzs gzsVar2) {
        this(voipMainMenuFragmentBase, gzsVar, gzsVar2, new ipq0(voipMainMenuFragmentBase, 15));
    }
}
