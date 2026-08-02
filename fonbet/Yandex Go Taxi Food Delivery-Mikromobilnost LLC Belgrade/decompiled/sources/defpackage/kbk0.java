package defpackage;

import com.yandex.go.preorder.address.e;
import com.yandex.go.route.interactor.b;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.order.details.v2.analytics.g;
import com.yandex.go.taxi.order.details.v2.domain.feedback.a;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.order.d;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.domain.v;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes14.dex */
public final class kbk0 implements v7p {
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
    public final v7p N;
    public final xvf0 O;
    public final /* synthetic */ int a = 0;
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

    public kbk0(xvf0 xvf0Var, xvf0 xvf0Var2, xat xatVar, n3w n3wVar, fn5 fn5Var, zo0 zo0Var, eqh eqhVar, lok0 lok0Var, qxu0 qxu0Var, xvf0 xvf0Var3, xvf0 xvf0Var4, eqh eqhVar2, xvf0 xvf0Var5, xvf0 xvf0Var6, n3w n3wVar2, xvf0 xvf0Var7, xvf0 xvf0Var8, eqh eqhVar3, xyd0 xyd0Var, xvf0 xvf0Var9, ubq0 ubq0Var, sb1 sb1Var, xvf0 xvf0Var10, xvf0 xvf0Var11, eqh eqhVar4, xvf0 xvf0Var12, pmn0 pmn0Var, xvf0 xvf0Var13, xvf0 xvf0Var14, xvf0 xvf0Var15, xvf0 xvf0Var16, xvf0 xvf0Var17, xvf0 xvf0Var18, h0l0 h0l0Var, kdb kdbVar, cer cerVar, aj0 aj0Var, nzb nzbVar, eqh eqhVar5, xvf0 xvf0Var19) {
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xatVar;
        this.e = n3wVar;
        this.f = fn5Var;
        this.g = zo0Var;
        this.h = eqhVar;
        this.i = lok0Var;
        this.j = qxu0Var;
        this.k = xvf0Var3;
        this.l = xvf0Var4;
        this.m = eqhVar2;
        this.n = xvf0Var5;
        this.o = xvf0Var6;
        this.p = n3wVar2;
        this.q = xvf0Var7;
        this.r = xvf0Var8;
        this.s = eqhVar3;
        this.t = xyd0Var;
        this.u = xvf0Var9;
        this.v = ubq0Var;
        this.w = sb1Var;
        this.x = xvf0Var10;
        this.y = xvf0Var11;
        this.z = eqhVar4;
        this.A = xvf0Var12;
        this.B = pmn0Var;
        this.C = xvf0Var13;
        this.D = xvf0Var14;
        this.E = xvf0Var15;
        this.F = xvf0Var16;
        this.G = xvf0Var17;
        this.H = xvf0Var18;
        this.N = h0l0Var;
        this.I = kdbVar;
        this.J = cerVar;
        this.K = aj0Var;
        this.L = nzbVar;
        this.M = eqhVar5;
        this.O = xvf0Var19;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.w;
        xvf0 xvf0Var2 = this.v;
        xvf0 xvf0Var3 = this.u;
        xvf0 xvf0Var4 = this.t;
        xvf0 xvf0Var5 = this.s;
        xvf0 xvf0Var6 = this.r;
        xvf0 xvf0Var7 = this.q;
        xvf0 xvf0Var8 = this.p;
        xvf0 xvf0Var9 = this.o;
        xvf0 xvf0Var10 = this.n;
        xvf0 xvf0Var11 = this.m;
        xvf0 xvf0Var12 = this.l;
        xvf0 xvf0Var13 = this.k;
        xvf0 xvf0Var14 = this.j;
        xvf0 xvf0Var15 = this.i;
        xvf0 xvf0Var16 = this.h;
        xvf0 xvf0Var17 = this.g;
        xvf0 xvf0Var18 = this.f;
        xvf0 xvf0Var19 = this.e;
        xvf0 xvf0Var20 = this.d;
        xvf0 xvf0Var21 = this.c;
        xvf0 xvf0Var22 = this.b;
        switch (i) {
            case 0:
                return new jbk0((o2y0) xvf0Var22.get(), (je) xvf0Var21.get(), (g) xvf0Var20.get(), (x980) xvf0Var19.get(), (b5j) xvf0Var18.get(), i5m.a(xvf0Var17), (c2y0) xvf0Var16.get(), (j2y0) xvf0Var15.get(), (y1y0) xvf0Var14.get(), (w1y0) xvf0Var13.get(), (f2y0) xvf0Var12.get(), (a2y0) xvf0Var11.get(), (b2y0) xvf0Var10.get(), (a) xvf0Var9.get(), (alk0) xvf0Var8.get(), (u2y0) xvf0Var7.get(), (x980) xvf0Var6.get(), (i2y0) xvf0Var5.get(), (ddk0) xvf0Var4.get(), (h2y0) xvf0Var3.get(), (ss21) xvf0Var2.get(), (yk21) xvf0Var.get(), (k2y0) this.x.get(), (v1y0) this.y.get(), (v8k0) this.z.get(), (lg21) this.A.get(), (l1t) this.B.get(), (d) this.C.get(), i5m.a((so4) this.N), (pg7) this.D.get(), (k48) this.E.get(), (com.yandex.go.superapp.order.multi.old.view.g) this.F.get(), i5m.a(this.G), (ru.yandex.taxi.checkin.a) this.H.get(), (mok0) this.I.get(), (com.yandex.go.taxi.order.change.due.domain.a) this.J.get(), (com.yandex.go.taxi.order.change.price.domain.a) this.K.get(), (com.yandex.go.taxi.order.change.requirements.interactor.a) ((kj7) this.O).get(), (g6y0) this.L.get(), (opw) this.M.get());
            default:
                return new e((ru.yandex.taxi.preorder.source.pickup.a) xvf0Var22.get(), (dqe0) xvf0Var21.get(), (a7u) xvf0Var20.get(), (rft0) xvf0Var19.get(), (l56) xvf0Var18.get(), (yq40) xvf0Var17.get(), (ru.yandex.taxi.preorder.source.mode.interactor.e) xvf0Var16.get(), (kjt0) xvf0Var15.get(), (c) xvf0Var14.get(), (tit0) xvf0Var13.get(), (fu00) xvf0Var12.get(), (net0) xvf0Var11.get(), (nq40) xvf0Var10.get(), (b) xvf0Var9.get(), (AddressResolveRepository) xvf0Var8.get(), (ru.yandex.taxi.preorder.source.domain.a) xvf0Var7.get(), (kev0) xvf0Var6.get(), (wb1) xvf0Var5.get(), (pce0) xvf0Var4.get(), (tte0) xvf0Var3.get(), (v) xvf0Var2.get(), (evr) xvf0Var.get(), (urv0) this.x.get(), (dr40) this.y.get(), (r) this.z.get(), (i130) this.A.get(), (ket0) this.B.get(), (jev0) this.C.get(), (vvx0) this.D.get(), (kr0) this.E.get(), (i) this.F.get(), (so0) this.G.get(), (oi21) this.H.get(), (dht0) ((h0l0) this.N).get(), (com.yandex.go.preorder.address.a) this.I.get(), (ber) this.J.get(), (h56) this.K.get(), (mzb) this.L.get(), (c9l0) this.M.get(), (rqo) this.O.get());
        }
    }

    public kbk0(n3w n3wVar, r6g r6gVar, wj0 wj0Var, r6g r6gVar2, rwh rwhVar, zo0 zo0Var, r6g r6gVar3, s6g s6gVar, r6g r6gVar4, r6g r6gVar5, s6g s6gVar2, r6g r6gVar6, r6g r6gVar7, bo2 bo2Var, n3w n3wVar2, u6g u6gVar, u6g u6gVar2, s6g s6gVar3, xvf0 xvf0Var, s6g s6gVar4, u6g u6gVar3, u6g u6gVar4, s6g s6gVar5, s6g s6gVar6, xvf0 xvf0Var2, u6g u6gVar5, s6g s6gVar7, s6g s6gVar8, so4 so4Var, r6g r6gVar8, r6g r6gVar9, t6g t6gVar, r6g r6gVar10, r6g r6gVar11, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, kj7 kj7Var, t6g t6gVar2, xvf0 xvf0Var6) {
        this.b = n3wVar;
        this.c = r6gVar;
        this.d = wj0Var;
        this.e = r6gVar2;
        this.f = rwhVar;
        this.g = zo0Var;
        this.h = r6gVar3;
        this.i = s6gVar;
        this.j = r6gVar4;
        this.k = r6gVar5;
        this.l = s6gVar2;
        this.m = r6gVar6;
        this.n = r6gVar7;
        this.o = bo2Var;
        this.p = n3wVar2;
        this.q = u6gVar;
        this.r = u6gVar2;
        this.s = s6gVar3;
        this.t = xvf0Var;
        this.u = s6gVar4;
        this.v = u6gVar3;
        this.w = u6gVar4;
        this.x = s6gVar5;
        this.y = s6gVar6;
        this.z = xvf0Var2;
        this.A = u6gVar5;
        this.B = s6gVar7;
        this.C = s6gVar8;
        this.N = so4Var;
        this.D = r6gVar8;
        this.E = r6gVar9;
        this.F = t6gVar;
        this.G = r6gVar10;
        this.H = r6gVar11;
        this.I = xvf0Var3;
        this.J = xvf0Var4;
        this.K = xvf0Var5;
        this.O = kj7Var;
        this.L = t6gVar2;
        this.M = xvf0Var6;
    }
}
