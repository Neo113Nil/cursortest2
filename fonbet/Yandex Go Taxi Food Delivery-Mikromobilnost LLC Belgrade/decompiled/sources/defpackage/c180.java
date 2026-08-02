package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.taxi.order.change.source.interactor.a0;
import com.yandex.go.taxi.order.change.source.interactor.k;
import com.yandex.go.taxi.order.change.source.interactor.x;
import com.yandex.go.taxi.order.domain.interactors.h;
import com.yandex.go.taxi.order.map.n;
import com.yandex.go.taxi.order.map.overlay.c0;
import com.yandex.go.taxi.order.provider.l;
import com.yandex.go.taxi.order.provider.w;
import com.yandex.go.taxi.order.repositories.c;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.map.a;

/* loaded from: classes14.dex */
public final class c180 implements v7p {
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
    public final fy30 M;
    public final xvf0 N;
    public final tgb0 O;
    public final uc50 P;
    public final t4g Q;
    public final rbx0 R;
    public final mu7 S;
    public final y101 T;
    public final xvf0 U;
    public final zi60 V;
    public final xvf0 W;
    public final p4 X;
    public final v4g Y;
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

    public c180(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, xvf0 xvf0Var15, xvf0 xvf0Var16, xvf0 xvf0Var17, xvf0 xvf0Var18, xvf0 xvf0Var19, xvf0 xvf0Var20, xvf0 xvf0Var21, xvf0 xvf0Var22, xvf0 xvf0Var23, xvf0 xvf0Var24, xvf0 xvf0Var25, xvf0 xvf0Var26, xvf0 xvf0Var27, xvf0 xvf0Var28, xvf0 xvf0Var29, xvf0 xvf0Var30, xvf0 xvf0Var31, xvf0 xvf0Var32, xvf0 xvf0Var33, xvf0 xvf0Var34, xvf0 xvf0Var35, xvf0 xvf0Var36, xvf0 xvf0Var37, xvf0 xvf0Var38, fy30 fy30Var, xvf0 xvf0Var39, tgb0 tgb0Var, uc50 uc50Var, t4g t4gVar, rbx0 rbx0Var, mu7 mu7Var, y101 y101Var, xvf0 xvf0Var40, zi60 zi60Var, xvf0 xvf0Var41, p4 p4Var, v4g v4gVar) {
        this.a = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.e = xvf0Var5;
        this.f = xvf0Var6;
        this.g = xvf0Var7;
        this.h = xvf0Var8;
        this.i = xvf0Var9;
        this.j = xvf0Var10;
        this.k = xvf0Var11;
        this.l = xvf0Var12;
        this.m = xvf0Var13;
        this.n = xvf0Var14;
        this.o = xvf0Var15;
        this.p = xvf0Var16;
        this.q = xvf0Var17;
        this.r = xvf0Var18;
        this.s = xvf0Var19;
        this.t = xvf0Var20;
        this.u = xvf0Var21;
        this.v = xvf0Var22;
        this.w = xvf0Var23;
        this.x = xvf0Var24;
        this.y = xvf0Var25;
        this.z = xvf0Var26;
        this.A = xvf0Var27;
        this.B = xvf0Var28;
        this.C = xvf0Var29;
        this.D = xvf0Var30;
        this.E = xvf0Var31;
        this.F = xvf0Var32;
        this.G = xvf0Var33;
        this.H = xvf0Var34;
        this.I = xvf0Var35;
        this.J = xvf0Var36;
        this.K = xvf0Var37;
        this.L = xvf0Var38;
        this.M = fy30Var;
        this.N = xvf0Var39;
        this.O = tgb0Var;
        this.P = uc50Var;
        this.Q = t4gVar;
        this.R = rbx0Var;
        this.S = mu7Var;
        this.T = y101Var;
        this.U = xvf0Var40;
        this.V = zi60Var;
        this.W = xvf0Var41;
        this.X = p4Var;
        this.Y = v4gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return new c0((Lifecycle) this.a.get(), (o2y0) this.b.get(), (x980) this.c.get(), (yay0) this.d.get(), (jtq0) this.e.get(), (l) this.f.get(), (po21) this.g.get(), (qwc) this.h.get(), (zfm) this.i.get(), (c) this.j.get(), (y980) this.k.get(), (rqo) this.l.get(), (ah00) this.m.get(), (a) this.n.get(), (ci70) this.o.get(), i5m.a(this.p), (w) this.q.get(), (o) this.r.get(), (leh) this.s.get(), (ru.yandex.taxi.styling.c) this.t.get(), (tt2) this.u.get(), (c641) this.v.get(), (y541) this.w.get(), (ft00) this.x.get(), (cgi0) this.y.get(), (dgi0) this.z.get(), (l1t) this.A.get(), (vlp0) this.B.get(), (pwy0) this.C.get(), (ty1) this.D.get(), (s0c0) this.E.get(), i5m.a(this.F), (kl00) this.G.get(), (x) this.H.get(), (aet0) this.I.get(), (o380) this.J.get(), (a0) this.K.get(), (k) this.L.get(), (n) this.M.get(), (kf00) this.N.get(), (q6c0) this.O.get(), (h) this.P.get(), (mo5) this.Q.get(), (xwx0) this.R.get(), (c06) this.S.get(), (cjw0) this.T.get(), (noe) this.U.get(), (com.yandex.go.taxi.order.map.passenger_detection.a) this.V.get(), (y50) this.W.get(), (md6) this.X.get(), (zd80) this.Y.get());
    }
}
