package defpackage;

import com.yandex.go.address.search.common.domain.interactor.a;
import com.yandex.go.layers.domain.g;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.address.experiment.d;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.logistics.experiments.k;
import ru.yandex.taxi.logistics.ndd_map.router.e;
import ru.yandex.taxi.preorder.suggested.i;
import ru.yandex.taxi.search.c;

/* loaded from: classes12.dex */
public final class cw8 implements v7p {
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
    public final /* synthetic */ int a = 2;
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

    public cw8(n3w n3wVar, n3w n3wVar2, n4g n4gVar, ys10 ys10Var, l4g l4gVar, n4g n4gVar2, xvf0 xvf0Var, n4g n4gVar3, y2s0 y2s0Var, ge50 ge50Var, q150 q150Var, n4g n4gVar4, lq40 lq40Var, xvf0 xvf0Var2, l4g l4gVar2, l4g l4gVar3, xvf0 xvf0Var3, ge50 ge50Var2, l4g l4gVar4, n4g n4gVar5, n4g n4gVar6, n4g n4gVar7, o4g o4gVar, o4g o4gVar2, o4g o4gVar3, xvf0 xvf0Var4, n4g n4gVar8, di20 di20Var, n3w n3wVar3, n4g n4gVar9, n4g n4gVar10, n4g n4gVar11, xvf0 xvf0Var5, n4g n4gVar12, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, o4g o4gVar4) {
        this.j = n3wVar;
        this.k = n3wVar2;
        this.l = n4gVar;
        this.m = ys10Var;
        this.n = l4gVar;
        this.o = n4gVar2;
        this.b = xvf0Var;
        this.p = n4gVar3;
        this.q = y2s0Var;
        this.r = ge50Var;
        this.s = q150Var;
        this.t = n4gVar4;
        this.u = lq40Var;
        this.c = xvf0Var2;
        this.v = l4gVar2;
        this.w = l4gVar3;
        this.d = xvf0Var3;
        this.x = ge50Var2;
        this.y = l4gVar4;
        this.z = n4gVar5;
        this.A = n4gVar6;
        this.B = n4gVar7;
        this.C = o4gVar;
        this.D = o4gVar2;
        this.E = o4gVar3;
        this.e = xvf0Var4;
        this.F = n4gVar8;
        this.G = di20Var;
        this.H = n3wVar3;
        this.I = n4gVar9;
        this.J = n4gVar10;
        this.K = n4gVar11;
        this.f = xvf0Var5;
        this.L = n4gVar12;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.M = o4gVar4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.l;
        xvf0 xvf0Var2 = this.k;
        xvf0 xvf0Var3 = this.j;
        xvf0 xvf0Var4 = this.i;
        xvf0 xvf0Var5 = this.h;
        xvf0 xvf0Var6 = this.g;
        xvf0 xvf0Var7 = this.f;
        xvf0 xvf0Var8 = this.e;
        xvf0 xvf0Var9 = this.d;
        xvf0 xvf0Var10 = this.c;
        xvf0 xvf0Var11 = this.K;
        xvf0 xvf0Var12 = this.J;
        xvf0 xvf0Var13 = this.b;
        xvf0 xvf0Var14 = this.I;
        xvf0 xvf0Var15 = this.H;
        xvf0 xvf0Var16 = this.G;
        xvf0 xvf0Var17 = this.F;
        xvf0 xvf0Var18 = this.E;
        xvf0 xvf0Var19 = this.C;
        xvf0 xvf0Var20 = this.B;
        xvf0 xvf0Var21 = this.A;
        xvf0 xvf0Var22 = this.z;
        switch (i) {
            case 0:
                return new bw8((String) xvf0Var13.get(), (b) xvf0Var10.get(), (i) xvf0Var9.get(), (v7b0) xvf0Var8.get(), (mbv0) xvf0Var7.get(), (wff) xvf0Var6.get(), (lcz) xvf0Var5.get(), (com.yandex.go.zone.interactors.b) xvf0Var4.get(), (a) xvf0Var3.get(), (fhf) xvf0Var2.get(), (rwp0) xvf0Var.get(), (s3o) this.m.get(), (f3o) this.n.get(), (com.yandex.go.taxi.tariffs.interactor.b) this.o.get(), (caq0) this.p.get(), (y9y0) this.q.get(), (v7j0) this.r.get(), (ru.yandex.taxi.address.interactor.b) this.s.get(), (nbv0) this.t.get(), (igf) this.u.get(), (dgf) this.v.get(), (c) this.w.get(), (oc60) this.x.get(), (y46) this.y.get(), (h51) xvf0Var22.get(), (prj0) xvf0Var21.get(), (msi) xvf0Var20.get(), (qoi) xvf0Var19.get(), this.D, (oep0) xvf0Var18.get(), (d6v0) xvf0Var17.get(), (wb1) xvf0Var16.get(), (h4v0) xvf0Var15.get(), (ru.yandex.taxi.search.suggest.i) xvf0Var14.get(), (kr0) xvf0Var12.get(), (tt2) xvf0Var11.get(), (gbv0) this.L.get(), (w6r) this.M.get());
            case 1:
                return new e(((Boolean) ((n3w) xvf0Var3).a).booleanValue(), (ji50) ((n3w) xvf0Var2).a, (g) ((n4g) xvf0Var).get(), (ai50) ((ys10) this.m).get(), (l56) ((l4g) this.n).get(), (fif) ((n4g) this.o).get(), (AddressResolveRepository) xvf0Var13.get(), (f5v0) ((n4g) this.p).get(), (ru.yandex.taxi.logistics.ndd_map.walkroute.b) ((y2s0) this.q).get(), (li50) ((ge50) this.r).get(), (ch50) ((q150) this.s).get(), (cdi) ((n4g) this.t).get(), (xl10) ((lq40) this.u).get(), (ej50) xvf0Var10.get(), (tt2) ((l4g) this.v).get(), (com.yandex.go.taxi.tariffs.interactor.b) ((l4g) this.w).get(), (woi) xvf0Var9.get(), (dt20) ((ge50) this.x).get(), (uq1) ((l4g) this.y).get(), (zuj0) ((n4g) xvf0Var22).get(), (k) ((n4g) xvf0Var21).get(), (svd0) ((n4g) xvf0Var20).get(), (ck31) ((o4g) xvf0Var19).get(), (pwy0) ((o4g) this.D).get(), (o) ((o4g) xvf0Var18).get(), (u9i) xvf0Var8.get(), (wnt) ((n4g) xvf0Var17).get(), (fi50) ((di20) xvf0Var16).get(), (tse) ((n3w) xvf0Var15).a, (ah00) ((n4g) xvf0Var14).get(), (x8z) ((n4g) xvf0Var12).get(), (ru.yandex.taxi.statebar.controller.a) ((n4g) xvf0Var11).get(), (di50) xvf0Var7.get(), (fl10) ((n4g) this.L).get(), (ci50) xvf0Var6.get(), (oh50) xvf0Var5.get(), (dj50) xvf0Var4.get(), (po21) ((o4g) this.M).get());
            default:
                return new pki0((b) ((kpp0) xvf0Var22).get(), (i) ((k51) xvf0Var21).get(), (v7b0) ((q150) xvf0Var20).get(), (mbv0) ((m580) xvf0Var19).get(), (wff) ((srb) this.D).get(), (lcz) ((b8w) xvf0Var18).get(), (com.yandex.go.zone.interactors.b) ((f6g) xvf0Var17).get(), (a) ((im21) xvf0Var16).get(), (fhf) ((zfa) xvf0Var15).get(), (rwp0) ((lk) xvf0Var14).get(), (s3o) xvf0Var13.get(), (f3o) ((oti) xvf0Var12).get(), (com.yandex.go.taxi.tariffs.interactor.b) ((f6g) xvf0Var11).get(), (caq0) xvf0Var10.get(), (w4l0) xvf0Var9.get(), (v7j0) xvf0Var8.get(), (ru.yandex.taxi.address.interactor.b) xvf0Var7.get(), (nbv0) xvf0Var6.get(), (igf) xvf0Var5.get(), (dgf) xvf0Var4.get(), (c) xvf0Var3.get(), (oc60) xvf0Var2.get(), (y46) xvf0Var.get(), (h51) this.m.get(), (prj0) this.n.get(), (msi) this.o.get(), (qoi) this.p.get(), this.q, (oep0) this.r.get(), (d6v0) this.s.get(), (wb1) this.t.get(), (h4v0) this.u.get(), (ru.yandex.taxi.search.suggest.i) this.v.get(), (kr0) this.w.get(), (d) this.x.get(), (tt2) ((n5g) this.L).get(), (gbv0) this.y.get(), (w6r) ((f6g) this.M).get());
        }
    }

    public cw8(n3w n3wVar, kpp0 kpp0Var, k51 k51Var, q150 q150Var, m580 m580Var, srb srbVar, b8w b8wVar, ixf ixfVar, im21 im21Var, zfa zfaVar, lk lkVar, xvf0 xvf0Var, oti otiVar, ixf ixfVar2, xvf0 xvf0Var2, jxf jxfVar, jxf jxfVar2, jxf jxfVar3, l9t0 l9t0Var, bt2 bt2Var, bt2 bt2Var2, k220 k220Var, jxf jxfVar4, xvf0 xvf0Var3, ixf ixfVar3, zni0 zni0Var, jxf jxfVar5, ixf ixfVar4, jxf jxfVar6, jxf jxfVar7, jxf jxfVar8, ixf ixfVar5, pmn0 pmn0Var, ixf ixfVar6, ixf ixfVar7, ixf ixfVar8, xvf0 xvf0Var4, ixf ixfVar9) {
        this.b = n3wVar;
        this.c = kpp0Var;
        this.d = k51Var;
        this.e = q150Var;
        this.f = m580Var;
        this.g = srbVar;
        this.h = b8wVar;
        this.i = ixfVar;
        this.j = im21Var;
        this.k = zfaVar;
        this.l = lkVar;
        this.m = xvf0Var;
        this.n = otiVar;
        this.o = ixfVar2;
        this.p = xvf0Var2;
        this.q = jxfVar;
        this.r = jxfVar2;
        this.s = jxfVar3;
        this.t = l9t0Var;
        this.u = bt2Var;
        this.v = bt2Var2;
        this.w = k220Var;
        this.x = jxfVar4;
        this.y = xvf0Var3;
        this.z = ixfVar3;
        this.A = zni0Var;
        this.B = jxfVar5;
        this.C = ixfVar4;
        this.D = jxfVar6;
        this.E = jxfVar7;
        this.F = jxfVar8;
        this.G = ixfVar5;
        this.H = pmn0Var;
        this.I = ixfVar6;
        this.J = ixfVar7;
        this.K = ixfVar8;
        this.L = xvf0Var4;
        this.M = ixfVar9;
    }

    public cw8(kpp0 kpp0Var, k51 k51Var, q150 q150Var, m580 m580Var, srb srbVar, b8w b8wVar, f6g f6gVar, im21 im21Var, zfa zfaVar, lk lkVar, xvf0 xvf0Var, oti otiVar, f6g f6gVar2, xvf0 xvf0Var2, n3w n3wVar, f6g f6gVar3, g6g g6gVar, l9t0 l9t0Var, f6g f6gVar4, f6g f6gVar5, k220 k220Var, f6g f6gVar6, xvf0 xvf0Var3, n5g n5gVar, zni0 zni0Var, g6g g6gVar2, f6g f6gVar7, g6g g6gVar3, f6g f6gVar8, g6g g6gVar4, n5g n5gVar2, pmn0 pmn0Var, n5g n5gVar3, n5g n5gVar4, alm almVar, n5g n5gVar5, xvf0 xvf0Var4, f6g f6gVar9) {
        this.z = kpp0Var;
        this.A = k51Var;
        this.B = q150Var;
        this.C = m580Var;
        this.D = srbVar;
        this.E = b8wVar;
        this.F = f6gVar;
        this.G = im21Var;
        this.H = zfaVar;
        this.I = lkVar;
        this.b = xvf0Var;
        this.J = otiVar;
        this.K = f6gVar2;
        this.c = xvf0Var2;
        this.d = n3wVar;
        this.e = f6gVar3;
        this.f = g6gVar;
        this.g = l9t0Var;
        this.h = f6gVar4;
        this.i = f6gVar5;
        this.j = k220Var;
        this.k = f6gVar6;
        this.l = xvf0Var3;
        this.m = n5gVar;
        this.n = zni0Var;
        this.o = g6gVar2;
        this.p = f6gVar7;
        this.q = g6gVar3;
        this.r = f6gVar8;
        this.s = g6gVar4;
        this.t = n5gVar2;
        this.u = pmn0Var;
        this.v = n5gVar3;
        this.w = n5gVar4;
        this.x = almVar;
        this.L = n5gVar5;
        this.y = xvf0Var4;
        this.M = f6gVar9;
    }
}
