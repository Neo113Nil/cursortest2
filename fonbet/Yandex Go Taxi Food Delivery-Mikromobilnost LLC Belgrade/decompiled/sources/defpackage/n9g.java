package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.address.search.common.domain.interactor.a;
import ru.yandex.taxi.address.experiment.q;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.address.repository.f;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.experiments.mainscreen.MainScreenBehavior;
import ru.yandex.taxi.logistics.experiments.k;
import ru.yandex.taxi.preorder.suggested.i;
import ru.yandex.taxi.systemrequeirements.location.n;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class n9g implements sjt0 {
    public final l9g A;
    public final xvf0 B;
    public final xvf0 D;
    public final l9g E;
    public final l9g F;
    public final nf H;
    public final i6r a;
    public final ddf b;
    public final m3o c;
    public final r51 w;
    public final ujt0 x;
    public final aye0 y;
    public final ga0 z;
    public final xvf0 C = dhs0.a(kgf.a);
    public final xvf0 G = i5m.b(hbv0.a);

    public n9g(ujt0 ujt0Var, ddf ddfVar, r51 r51Var, m3o m3oVar, aye0 aye0Var, i6r i6rVar, ga0 ga0Var) {
        this.a = i6rVar;
        this.b = ddfVar;
        this.c = m3oVar;
        this.w = r51Var;
        this.x = ujt0Var;
        this.y = aye0Var;
        this.z = ga0Var;
        this.A = new l9g(i6rVar, 12);
        int i = 9;
        this.B = dhs0.a(new e4f(new l9g(i6rVar, 10), i));
        this.D = dhs0.a(new fn5(new l9g(i6rVar, 8), 16));
        this.E = new l9g(i6rVar, 14);
        this.F = new l9g(i6rVar, 13);
        l9g l9gVar = new l9g(i6rVar, i);
        int i2 = 11;
        lf lfVar = new lf(l9gVar, new l9g(i6rVar, i2), i);
        l9g l9gVar2 = new l9g(i6rVar, 7);
        this.H = new nf(lfVar, new oe(l9gVar, l9gVar2, new kpp0(l9gVar, l9gVar2, this.A, i2), 7), 3);
    }

    @Override // defpackage.ww4
    public final d6v0 I0() {
        d6v0 I0 = ((c0g) this.a).I0();
        q5z.h(I0);
        return I0;
    }

    @Override // defpackage.ww4
    public final e8v0 L() {
        return ((c0g) this.a).L();
    }

    @Override // defpackage.ww4
    public final Activity N() {
        return ((c0g) this.a).w;
    }

    @Override // defpackage.f51
    public final pyv Z() {
        c0g c0gVar = (c0g) this.a;
        Context H1 = c0gVar.H1();
        q5z.h(H1);
        hbm hbmVar = new hbm(H1);
        tk51 t1 = c0gVar.t1();
        q5z.h(t1);
        f m6 = c0gVar.m6();
        q5z.h(m6);
        return new bw0(hbmVar, t1, m6);
    }

    @Override // defpackage.ww4
    public final c b() {
        c b = ((c0g) this.a).b();
        q5z.h(b);
        return b;
    }

    @Override // defpackage.ww4
    public final zuj0 c() {
        zuj0 c = ((c0g) this.a).c();
        q5z.h(c);
        return c;
    }

    @Override // defpackage.ww4
    public final ney d() {
        ney d = ((c0g) this.a).d();
        q5z.h(d);
        return d;
    }

    @Override // defpackage.ww4
    public final pav e() {
        pav e = ((c0g) this.a).e();
        q5z.h(e);
        return e;
    }

    public final lcz f() {
        c0g c0gVar = (c0g) this.a;
        pho T1 = c0gVar.T1();
        q5z.h(T1);
        reu reuVar = new reu(23, new b1(T1));
        n v5 = c0gVar.v5();
        q5z.h(v5);
        return new lcz(reuVar, v5);
    }

    @Override // defpackage.f51
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final c390 a() {
        i6r i6rVar = this.a;
        c0g c0gVar = (c0g) i6rVar;
        Context H1 = c0gVar.H1();
        q5z.h(H1);
        tt2 k = c0gVar.k();
        q5z.h(k);
        b bVar = new b(H1, k, i5m.a(this.A));
        jc61 G6 = c0gVar.G6();
        q5z.h(G6);
        ddf ddfVar = this.b;
        rwp0 rwp0Var = (rwp0) ddfVar.b;
        i a = G6.a(rwp0Var);
        k7x0 s6 = c0gVar.s6();
        q5z.h(s6);
        w3b0 v1 = c0gVar.v1();
        q5z.h(v1);
        ru.yandex.taxi.search.f a2 = k51.a(ddfVar, v1);
        hju hjuVar = new hju();
        zuj0 c = c0gVar.c();
        q5z.h(c);
        hjuVar.a = c;
        k3o k3oVar = this.c.a;
        gu11 B6 = c0gVar.B6();
        q5z.h(B6);
        c b = c0gVar.b();
        q5z.h(b);
        pdc F1 = c0gVar.F1();
        q5z.h(F1);
        v7b0 v7b0Var = new v7b0(s6, a2, hjuVar, k3oVar, B6, b, F1);
        ah00 B = c0gVar.B();
        q5z.h(B);
        lx4 y1 = c0gVar.y1();
        q5z.h(y1);
        pho T1 = ((c0g) i6rVar).T1();
        q5z.h(T1);
        e51 e51Var = new e51(T1);
        r8h E1 = c0gVar.E1();
        q5z.h(E1);
        q5z.i(rwp0Var);
        r51 r51Var = this.w;
        SourcePicker sourcePicker = r51Var.a;
        q5z.i(sourcePicker);
        MainScreenBehavior mainScreenBehavior = MainScreenBehavior.SHORTCUTS;
        q5z.i(mainScreenBehavior);
        ec00 x560Var = new x560(mainScreenBehavior);
        if (!this.x.a) {
            x560Var = new rw60();
        }
        pho T12 = ((c0g) i6rVar).T1();
        q5z.h(T12);
        e51 e51Var2 = new e51(T12);
        b5v0 b5v0Var = r51Var.c;
        if (b5v0Var == null) {
            b5v0Var = new g191(e51Var2);
        }
        b5v0 b5v0Var2 = b5v0Var;
        pho T13 = c0gVar.T1();
        q5z.h(T13);
        mbv0 mbv0Var = new mbv0(B, y1, e51Var, E1, rwp0Var, sourcePicker, x560Var, b5v0Var2, new pj(T13));
        pho T14 = c0gVar.T1();
        q5z.h(T14);
        wff wffVar = new wff(new o61(T14));
        lcz f = f();
        com.yandex.go.zone.interactors.b n = c0gVar.z.n();
        atd0 V5 = c0gVar.V5();
        q5z.h(V5);
        a aVar = new a(V5);
        w6r X = c0gVar.X();
        q5z.h(X);
        zuj0 c2 = c0gVar.c();
        q5z.h(c2);
        fhf fhfVar = new fhf(X, c2, c0gVar.z.A1());
        q5z.i(rwp0Var);
        s3o s3oVar = new s3o();
        pho T15 = ((c0g) i6rVar).T1();
        q5z.h(T15);
        ryh ryhVar = new ryh(13, new e51(T15));
        q5z.i(sourcePicker);
        f3o f3oVar = new f3o(ryhVar, sourcePicker);
        caq0 caq0Var = new caq0();
        w4l0 w4l0Var = (w4l0) this.y.b;
        q5z.i(w4l0Var);
        v7j0 X5 = c0gVar.X5();
        ru.yandex.taxi.address.interactor.b l6 = c0gVar.l6();
        q5z.h(l6);
        wiq0 c6 = c0gVar.c6();
        q5z.h(c6);
        rqo l1 = c0gVar.l1();
        q5z.h(l1);
        k kVar = new k(l1);
        fif K1 = c0gVar.K1();
        q5z.h(K1);
        rqo l12 = c0gVar.l1();
        q5z.h(l12);
        nbv0 nbv0Var = new nbv0(c6, kVar, K1, new dy6(l12, 4));
        k7x0 s62 = c0gVar.s6();
        q5z.h(s62);
        hgf hgfVar = (hgf) this.B.get();
        po21 C6 = c0gVar.C6();
        q5z.h(C6);
        atd0 V52 = c0gVar.V5();
        q5z.h(V52);
        n v5 = c0gVar.v5();
        q5z.h(v5);
        igf igfVar = new igf(s62, hgfVar, C6, V52, v5, f(), c0gVar.R5());
        k7x0 s63 = c0gVar.s6();
        q5z.h(s63);
        jgf jgfVar = (jgf) this.C.get();
        po21 C62 = c0gVar.C6();
        q5z.h(C62);
        atd0 V53 = c0gVar.V5();
        q5z.h(V53);
        n v52 = c0gVar.v5();
        q5z.h(v52);
        dgf dgfVar = new dgf(s63, jgfVar, C62, V53, v52, c0gVar.R5(), f());
        q I5 = c0gVar.I5();
        q5z.h(I5);
        wiq0 c62 = c0gVar.c6();
        q5z.h(c62);
        com.yandex.go.navigation.screen.c S = c0gVar.S();
        q5z.h(S);
        ru.yandex.taxi.search.c cVar = new ru.yandex.taxi.search.c(I5, c62, S);
        pc60 J5 = c0gVar.J5();
        y46 y46Var = (y46) this.D.get();
        h51 u1 = c0gVar.u1();
        rqo l13 = c0gVar.l1();
        q5z.h(l13);
        prj0 prj0Var = new prj0(l13);
        msi k6 = c0gVar.k6();
        qoi N1 = c0gVar.N1();
        q5z.h(N1);
        oep0 a6 = c0gVar.a6();
        q5z.h(a6);
        d6v0 I0 = c0gVar.I0();
        q5z.h(I0);
        wb1 w1 = c0gVar.w1();
        oep0 a62 = c0gVar.a6();
        q5z.h(a62);
        wiq0 c63 = c0gVar.c6();
        q5z.h(c63);
        umb0 Q5 = c0gVar.Q5();
        w6r X2 = c0gVar.X();
        q5z.h(X2);
        h4v0 h4v0Var = new h4v0(a62, c63, this.F, Q5, X2);
        ru.yandex.taxi.search.suggest.i r1 = c0gVar.r1();
        q5z.h(r1);
        kr0 kr0Var = (kr0) c0gVar.Ec.get();
        q5z.h(kr0Var);
        tt2 k2 = c0gVar.k();
        q5z.h(k2);
        gbv0 gbv0Var = (gbv0) this.G.get();
        com.yandex.go.taxi.tariffs.interactor.b c3 = c0gVar.z.c();
        w6r X3 = c0gVar.X();
        q5z.h(X3);
        return new c390(bVar, a, v7b0Var, mbv0Var, wffVar, f, n, aVar, fhfVar, rwp0Var, s3oVar, f3oVar, caq0Var, w4l0Var, X5, l6, nbv0Var, igfVar, dgfVar, cVar, J5, y46Var, u1, prj0Var, k6, N1, this.E, a6, I0, w1, h4v0Var, r1, kr0Var, k2, gbv0Var, c3, this.z, X3);
    }

    @Override // defpackage.f51
    public final yvf0 h0() {
        return this.H;
    }
}
