package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.overdraft.ui.g;
import com.yandex.go.taxi.order.common.f;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.provider.a;
import com.yandex.go.taxi.order.search.ui.c;
import com.yandex.go.taxi.order.view.l;
import ru.yandex.taxi.linked_order.provider.h;
import ru.yandex.taxi.order.d;
import ru.yandex.taxi.order.i;

/* loaded from: classes6.dex */
public final class dx70 implements v7p {
    public final xvf0 A;
    public final xvf0 B;
    public final xvf0 C;
    public final xvf0 D;
    public final xvf0 E;
    public final xvf0 F;
    public final xvf0 G;
    public final xvf0 H;
    public final xvf0 I;
    public final xvf0 J;
    public final xvf0 K;
    public final xvf0 L;
    public final xvf0 M;
    public final xvf0 N;
    public final xvf0 O;
    public final xvf0 P;
    public final xvf0 Q;
    public final xvf0 R;
    public final xvf0 S;
    public final u6o0 T;
    public final xvf0 U;
    public final xvf0 V;
    public final xvf0 W;
    public final xvf0 X;
    public final xvf0 a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final xvf0 k;
    public final xvf0 l;
    public final xvf0 m;
    public final xvf0 n;
    public final xvf0 o;
    public final xvf0 p;
    public final xvf0 q;
    public final xvf0 r;
    public final xvf0 s;
    public final xvf0 t;
    public final xvf0 u;
    public final xvf0 v;
    public final xvf0 w;
    public final xvf0 x;
    public final xvf0 y;
    public final xvf0 z;

    public dx70(xvf0 xvf0Var, xvf0 xvf0Var2, eqh eqhVar, xvf0 xvf0Var3, xvf0 xvf0Var4, gwb0 gwb0Var, xvf0 xvf0Var5, t4v0 t4v0Var, xvf0 xvf0Var6, ia80 ia80Var, n3w n3wVar, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, eqh eqhVar2, xvf0 xvf0Var10, zi60 zi60Var, xvf0 xvf0Var11, wvq wvqVar, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, h0z h0zVar, d441 d441Var, xvf0 xvf0Var15, xvf0 xvf0Var16, xvf0 xvf0Var17, kxa0 kxa0Var, e3u e3uVar, xvf0 xvf0Var18, xvf0 xvf0Var19, wjr0 wjr0Var, xvf0 xvf0Var20, eqh eqhVar3, njp njpVar, qcb qcbVar, xvf0 xvf0Var21, fmn fmnVar, p4 p4Var, fwc fwcVar, qcz0 qcz0Var, xvf0 xvf0Var22, s3f0 s3f0Var, pab pabVar, mwq mwqVar, u6o0 u6o0Var, dld0 dld0Var, xvf0 xvf0Var23, abx0 abx0Var, n2y0 n2y0Var) {
        this.a = xvf0Var;
        this.b = xvf0Var2;
        this.c = eqhVar;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = gwb0Var;
        this.g = xvf0Var5;
        this.h = t4v0Var;
        this.i = xvf0Var6;
        this.j = ia80Var;
        this.k = n3wVar;
        this.l = xvf0Var7;
        this.m = xvf0Var8;
        this.n = xvf0Var9;
        this.o = eqhVar2;
        this.p = xvf0Var10;
        this.q = zi60Var;
        this.r = xvf0Var11;
        this.s = wvqVar;
        this.t = xvf0Var12;
        this.u = xvf0Var13;
        this.v = xvf0Var14;
        this.w = h0zVar;
        this.x = d441Var;
        this.y = xvf0Var15;
        this.z = xvf0Var16;
        this.A = xvf0Var17;
        this.B = kxa0Var;
        this.C = e3uVar;
        this.D = xvf0Var18;
        this.E = xvf0Var19;
        this.F = wjr0Var;
        this.G = xvf0Var20;
        this.H = eqhVar3;
        this.I = njpVar;
        this.J = qcbVar;
        this.K = xvf0Var21;
        this.L = fmnVar;
        this.M = p4Var;
        this.N = fwcVar;
        this.O = qcz0Var;
        this.P = xvf0Var22;
        this.Q = s3f0Var;
        this.R = pabVar;
        this.S = mwqVar;
        this.T = u6o0Var;
        this.U = dld0Var;
        this.V = xvf0Var23;
        this.W = abx0Var;
        this.X = n2y0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return new i((Lifecycle) this.a.get(), (ci70) this.b.get(), (a) this.c.get(), (d) this.d.get(), (l1t) this.e.get(), (v7j0) this.f.get(), (y980) this.g.get(), (ru.yandex.taxi.order.location.a) this.h.get(), (ru.yandex.taxi.superapp.address.i) this.i.get(), (ha80) this.j.get(), (x980) this.k.get(), (g) this.l.get(), (fm40) this.m.get(), (l) this.n.get(), (com.yandex.go.superapp.order.multi.old.provider.g) this.o.get(), (h760) this.p.get(), (vc80) this.q.get(), (ck31) this.r.get(), (ru.yandex.taxi.checkin.i) this.s.get(), (ru.yandex.taxi.preorder.source.domain.a) this.t.get(), (mnz) this.u.get(), (com.yandex.go.taxi.order.search.domain.interactor.a) this.v.get(), (c) this.w.get(), (xvr0) this.x.get(), (h) this.y.get(), (fv6) this.z.get(), (ps70) this.A.get(), (com.yandex.go.taxi.order.multi.feed.domain.a) this.B.get(), (wvy) this.C.get(), (f0) this.D.get(), (jc00) this.E.get(), (s8t0) this.F.get(), (k1l0) this.G.get(), (oep0) this.H.get(), (d1s) this.I.get(), (y0l0) this.J.get(), i5m.a(this.K), this.L, this.M, this.N, (koz0) this.O.get(), (mjg0) this.P.get(), i5m.a(this.Q), (f) this.R.get(), (com.yandex.go.taxi.tariffs.interactor.i) this.S.get(), i5m.a(this.T), (com.yandex.go.location.domain.a) this.U.get(), i5m.a(this.V), (com.yandex.go.taxi.order.perf.experiment.d) this.W.get(), (com.yandex.go.taxi.order.perf.a) this.X.get());
    }
}
