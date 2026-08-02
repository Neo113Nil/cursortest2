package defpackage;

import android.content.Context;
import com.yandex.go.taxi.order.OrderCancelProcessingObserver;
import com.yandex.go.taxi.order.details.v1.elements.buttons.j;
import com.yandex.go.taxi.order.details.v1.elements.buttons.o;
import com.yandex.go.taxi.order.details.v1.elements.payment.b;
import com.yandex.go.taxi.order.details.v1.elements.support.a;
import com.yandex.go.taxi.order.provider.w;
import com.yandex.go.taxi.order.repositories.c;
import com.yandex.go.taxi.order.state.e;
import com.yandex.go.taxi.order.state.h;
import com.yandex.go.taxi.order.state.l;
import com.yandex.passport.sloth.ui.dependencies.m;
import ru.yandex.taxi.order.d;
import ru.yandex.taxi.styling.f;

/* loaded from: classes14.dex */
public final class n0g implements fxx0 {
    public final pa80 a;
    public final zzf b;
    public final c0g c;
    public final e0g d;
    public final f0g e;
    public final l0g f;
    public final xvf0 g = i5m.b(m7j.a);
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
    public final rct0 v;
    public final kj7 w;
    public final o4f x;
    public final xvf0 y;
    public final n3w z;

    public n0g(zzf zzfVar, c0g c0gVar, e0g e0gVar, f0g f0gVar, l0g l0gVar, pa80 pa80Var) {
        this.b = zzfVar;
        this.c = c0gVar;
        this.d = e0gVar;
        this.e = f0gVar;
        this.f = l0gVar;
        this.a = pa80Var;
        int i = 22;
        int i2 = 5;
        xvf0 b = i5m.b(new pgi(l0gVar.i, zzfVar.Y, new t160(zzfVar.d0, i), i2));
        this.h = b;
        this.i = i5m.b(new c0j(l0gVar.B, zzfVar.Ea, b, f0gVar.x2, 21));
        this.j = i5m.b(r4j.a);
        this.k = i5m.b(new gmh(new zo0(f0gVar.J, zzfVar.Ye, c0gVar.J9, zzfVar.Ze, this.h, zzfVar.S3, 17), 15));
        this.l = i5m.b(new rwh(zzfVar.Uh, 29));
        this.m = i5m.b(p6j.a);
        this.n = i5m.b(new fwc(zzfVar.n, f0gVar.S0, i));
        this.o = i5m.b(m0q0.a);
        this.p = i5m.b(vkw0.a);
        this.q = i5m.b(kqk0.a);
        this.r = i5m.b(r7j.a);
        this.s = i5m.b(f8j.a);
        this.t = i5m.b(new gmh(new peb(zzfVar.W, 12), 16));
        this.u = i5m.b(new faj(tim.a, 24));
        xvf0 a = dhs0.a(new wj0(c0gVar.M8, e0gVar.o, c0gVar.ij, c0gVar.fj, c0gVar.ej, c0gVar.dj, c0gVar.hj, c0gVar.B, 10));
        ibz0 ibz0Var = new ibz0(zzfVar.I2, zzfVar.J2, 17);
        xvf0 xvf0Var = c0gVar.U;
        this.v = new rct0(xvf0Var, zzfVar.p3, a, ibz0Var, zzfVar.U, 23);
        this.w = new kj7(xvf0Var, (xvf0) new ig7(xvf0Var, i2), zzfVar.kj, 4, (byte) 0);
        n3w a2 = n3w.a(this);
        xvf0 xvf0Var2 = zzfVar.bb;
        upk0 upk0Var = new upk0(xvf0Var2, i);
        lq40 lq40Var = l0gVar.i;
        nf nfVar = c0gVar.Sl;
        grg grgVar = frg.a;
        nup0 nup0Var = zzfVar.O;
        xvf0 xvf0Var3 = zzfVar.W;
        xvf0 xvf0Var4 = zzfVar.Ma;
        xvf0 xvf0Var5 = zzfVar.I2;
        xvf0 xvf0Var6 = c0gVar.E0;
        b900 b900Var = c0gVar.Tl;
        xvf0 xvf0Var7 = zzfVar.Ze;
        bwy bwyVar = c0gVar.Vl;
        axy axyVar = c0gVar.Wl;
        xvf0 xvf0Var8 = zzfVar.n;
        o4f o4fVar = new o4f(lq40Var, nfVar, grgVar, xvf0Var2, nup0Var, xvf0Var3, xvf0Var4, xvf0Var5, xvf0Var6, b900Var, xvf0Var7, bwyVar, axyVar, xvf0Var8, 2);
        this.x = o4fVar;
        this.y = i5m.b(new wi7(a2, xvf0Var6, upk0Var, o4fVar, c0gVar.Xl, xvf0Var2, c0gVar.pm, c0gVar.Ul, xvf0Var8, c0gVar.mm, (xvf0) cup0.a, (xvf0) agm.a));
        this.z = n3w.a(new ic11(new gus(hs70.a, l0gVar.i)));
    }

    public final bu0 a() {
        l0g l0gVar = this.f;
        zch zchVar = new zch((cm70) l0gVar.r.get());
        qnh qnhVar = new qnh((cm70) l0gVar.r.get());
        yzh yzhVar = new yzh((cm70) l0gVar.r.get());
        ix70 ix70Var = l0gVar.a;
        o2y0 o2y0Var = ix70Var.a;
        q5z.i(o2y0Var);
        c0g c0gVar = this.c;
        w030 w030Var = (w030) c0gVar.o0.get();
        vf41 j3 = c0gVar.j3();
        zzf zzfVar = c0gVar.z;
        a aVar = new a(w030Var, j3, (ru.yandex.taxi.am.token.a) zzfVar.C3.get(), (tse) c0gVar.B.get(), (tt2) zzfVar.n.get());
        e6v0 e6v0Var = c0gVar.a.b6;
        f0g f0gVar = this.e;
        m mVar = new m(o2y0Var, aVar, e6v0Var, (x1y0) f0gVar.U5.get(), (k870) c0gVar.Cw.get(), (k2y0) f0gVar.O5.get(), (z1y0) f0gVar.C0.get(), (p0h) f0gVar.T5.get(), c0gVar.Wd, (oep0) c0gVar.T.get());
        zzf zzfVar2 = this.b;
        yzh yzhVar2 = new yzh(new wwf((n3h) zzfVar2.J1.get(), new qnh(new x770((pho) zzfVar2.d0.get())), h()));
        zch zchVar2 = new zch(new b5j((n3h) zzfVar2.J1.get()));
        Context context = (Context) c0gVar.U.get();
        k3c d2 = c0gVar.d2();
        tj60 tj60Var = (tj60) c0gVar.t7.get();
        ci70 ci70Var = (ci70) zzfVar2.Ma.get();
        o2y0 o2y0Var2 = ix70Var.a;
        q5z.i(o2y0Var2);
        q4g q4gVar = new q4g(context, d2, tj60Var, ci70Var, o2y0Var2);
        l2y0 l2y0Var = (l2y0) f0gVar.I5.get();
        o2y0 o2y0Var3 = ix70Var.a;
        q5z.i(o2y0Var3);
        return new bu0(zchVar, qnhVar, yzhVar, mVar, yzhVar2, zchVar2, q4gVar, l2y0Var, o2y0Var3);
    }

    public final e b() {
        o2y0 o2y0Var = this.f.a.a;
        q5z.i(o2y0Var);
        zzf zzfVar = this.b;
        bu1 bu1Var = new bu1((c) zzfVar.bb.get());
        w wVar = (w) zzfVar.kr.get();
        c cVar = (c) zzfVar.bb.get();
        f0g f0gVar = this.e;
        return new e(o2y0Var, bu1Var, wVar, cVar, (d) f0gVar.D.get(), (l1t) f0gVar.E.get(), (ru.yandex.taxi.costcenters.ride.c) zzfVar.mr.get(), (tt2) zzfVar.n.get(), d(), (pwy0) zzfVar.U.get(), new com.yandex.go.taxi.order.change.source.data.e((rqo) this.c.z.C.get()));
    }

    public final l c() {
        o2y0 o2y0Var = this.f.a.a;
        q5z.i(o2y0Var);
        zzf zzfVar = this.b;
        return new l(o2y0Var, (OrderCancelProcessingObserver) zzfVar.Dh.get(), d(), (xdf) zzfVar.S3.get(), (tt2) zzfVar.n.get());
    }

    public final com.yandex.go.taxi.order.details.v1.domain.a d() {
        l0g l0gVar = this.f;
        ix70 ix70Var = l0gVar.a;
        o2y0 o2y0Var = ix70Var.a;
        q5z.i(o2y0Var);
        zzf zzfVar = this.b;
        ru.yandex.taxi.styling.c X0 = zzfVar.X0();
        l7j l7jVar = (l7j) this.g.get();
        i7j i7jVar = new i7j();
        c0g c0gVar = this.c;
        com.yandex.go.taxi.order.details.v1.elements.source.d dVar = new com.yandex.go.taxi.order.details.v1.elements.source.d(i7jVar, c0gVar.g6(), (tt2) zzfVar.n.get(), (zuj0) zzfVar.W.get(), new a22((zuj0) zzfVar.W.get()), (ru.yandex.taxi.widget.utils.e) c0gVar.J9.get());
        o2y0 o2y0Var2 = ix70Var.a;
        q5z.i(o2y0Var2);
        com.yandex.go.taxi.order.details.v1.elements.source.c cVar = new com.yandex.go.taxi.order.details.v1.elements.source.c(l7jVar, dVar, o2y0Var2, (tt2) zzfVar.n.get());
        c7j c7jVar = (c7j) l0gVar.x.get();
        com.yandex.go.taxi.order.details.v1.elements.route_point.d dVar2 = new com.yandex.go.taxi.order.details.v1.elements.route_point.d(new y6j(), (sgu0) c0gVar.lh.get(), (tt2) zzfVar.n.get(), (zuj0) zzfVar.W.get(), new a22((zuj0) zzfVar.W.get()), (ru.yandex.taxi.widget.utils.e) c0gVar.J9.get(), zzfVar.a);
        o2y0 o2y0Var3 = ix70Var.a;
        q5z.i(o2y0Var3);
        com.yandex.go.taxi.order.details.v1.elements.route_point.c cVar2 = new com.yandex.go.taxi.order.details.v1.elements.route_point.c(c7jVar, dVar2, o2y0Var3, (tt2) zzfVar.n.get());
        k5j k5jVar = (k5j) l0gVar.y.get();
        com.yandex.go.taxi.order.details.v1.elements.destination.d dVar3 = new com.yandex.go.taxi.order.details.v1.elements.destination.d(new h5j(), c0gVar.O1(), (tt2) zzfVar.n.get(), (zuj0) zzfVar.W.get(), new a22((zuj0) zzfVar.W.get()), (ru.yandex.taxi.widget.utils.e) c0gVar.J9.get());
        o2y0 o2y0Var4 = ix70Var.a;
        q5z.i(o2y0Var4);
        com.yandex.go.taxi.order.details.v1.elements.destination.c cVar3 = new com.yandex.go.taxi.order.details.v1.elements.destination.c(k5jVar, dVar3, o2y0Var4, (tt2) zzfVar.n.get());
        pwy0 pwy0Var = (pwy0) zzfVar.U.get();
        f T5 = c0gVar.T5();
        zzf zzfVar2 = c0gVar.z;
        com.yandex.go.taxi.order.change.source.data.e eVar = new com.yandex.go.taxi.order.change.source.data.e((rqo) zzfVar2.C.get());
        h hVar = (h) l0gVar.B.get();
        spl0 spl0Var = (spl0) c0gVar.fm.get();
        gs70 gs70Var = new gs70();
        vd00 vd00Var = (vd00) this.i.get();
        xvf0 xvf0Var = this.h;
        p4j p4jVar = (p4j) xvf0Var.get();
        f0g f0gVar = this.e;
        x980 x980Var = f0gVar.a;
        v2y0 v1 = f0gVar.v1();
        ba80 ba80Var = (ba80) zzfVar.wn.get();
        zuj0 zuj0Var = (zuj0) zzfVar.W.get();
        o2y0 o2y0Var5 = ix70Var.a;
        q5z.i(o2y0Var5);
        com.yandex.go.taxi.order.details.v1.elements.buttons.h hVar2 = new com.yandex.go.taxi.order.details.v1.elements.buttons.h(hVar, spl0Var, gs70Var, vd00Var, p4jVar, x980Var, x980Var, v1, ba80Var, zuj0Var, o2y0Var5, (n3h) zzfVar.J1.get());
        xvf0 xvf0Var2 = this.j;
        com.yandex.go.taxi.order.details.v1.elements.buttons.a aVar = new com.yandex.go.taxi.order.details.v1.elements.buttons.a(hVar2, (q4j) xvf0Var2.get());
        com.yandex.go.taxi.order.domain.repositories.e eVar2 = (com.yandex.go.taxi.order.domain.repositories.e) zzfVar.hj.get();
        b bVar = new b(zzfVar.d1(), (ru.yandex.taxi.widget.c) zzfVar.Ze.get(), (xdf) zzfVar.S3.get(), (pdc) zzfVar.Ye.get(), (zuj0) zzfVar.W.get(), (k7x0) zzfVar.M3.get());
        o2y0 o2y0Var6 = ix70Var.a;
        q5z.i(o2y0Var6);
        com.yandex.go.taxi.order.details.v1.elements.payment.a aVar2 = new com.yandex.go.taxi.order.details.v1.elements.payment.a(new u6j(eVar2, bVar, o2y0Var6));
        y4j y4jVar = new y4j((com.yandex.go.taxi.order.details.v1.elements.cancel.a) this.k.get());
        com.yandex.go.taxi.order.promo_plaques.data.a aVar3 = (com.yandex.go.taxi.order.promo_plaques.data.a) this.l.get();
        ru.yandex.taxi.communications.b bVar2 = new ru.yandex.taxi.communications.b((ru.yandex.taxi.communications.data.a) zzfVar2.Uh.get());
        lpf0 lpf0Var = new lpf0();
        com.yandex.go.lootbox.impl.domain.interactors.animation.e s = xpb1.s((t2g) c0gVar.a.b.bm.get());
        q5z.i(s);
        xpf0 xpf0Var = new xpf0(aVar3, bVar2, lpf0Var, new a5r(s), (tt2) zzfVar.n.get());
        gs70 gs70Var2 = new gs70();
        fh70 fh70Var = (fh70) c0gVar.om.get();
        tt a = f0gVar.a();
        bu0 a2 = a();
        cjw0 f = f();
        p4j p4jVar2 = (p4j) xvf0Var.get();
        ru.yandex.taxi.widget.utils.e eVar3 = (ru.yandex.taxi.widget.utils.e) c0gVar.J9.get();
        zuj0 zuj0Var2 = (zuj0) zzfVar.W.get();
        tt2 tt2Var = (tt2) zzfVar.n.get();
        o2y0 o2y0Var7 = ix70Var.a;
        q5z.i(o2y0Var7);
        j jVar = new j(new o(gs70Var2, fh70Var, a, a2, f, p4jVar2, eVar3, zuj0Var2, tt2Var, o2y0Var7), (q4j) xvf0Var2.get());
        com.yandex.go.taxi.order.details.v1.elements.info.a aVar4 = new com.yandex.go.taxi.order.details.v1.elements.info.a((o6j) this.m.get(), new com.yandex.go.taxi.order.details.v1.elements.info.b((zuj0) zzfVar.W.get(), this.a.a, (xdf) zzfVar.S3.get(), (pdc) zzfVar.Ye.get(), (ru.yandex.taxi.widget.utils.e) c0gVar.J9.get(), (ru.yandex.taxi.widget.c) zzfVar.Ze.get()));
        gs70 gs70Var3 = new gs70();
        r5j r5jVar = (r5j) l0gVar.C.get();
        gs70 gs70Var4 = new gs70();
        p5j p5jVar = new p5j((zhm) f0gVar.R0.get(), (zuj0) zzfVar.W.get());
        zhm zhmVar = (zhm) f0gVar.R0.get();
        zzf zzfVar3 = f0gVar.w;
        return new com.yandex.go.taxi.order.details.v1.domain.a(o2y0Var, X0, cVar, cVar2, cVar3, pwy0Var, T5, eVar, aVar, aVar2, y4jVar, xpf0Var, jVar, aVar4, new com.yandex.go.taxi.order.details.v1.elements.driver.c(gs70Var3, r5jVar, new apf(gs70Var4, p5jVar, new com.yandex.go.taxi.order.details.v1.elements.driver.d(zhmVar, (zuj0) zzfVar3.W.get()), (p4j) xvf0Var.get(), new d58(new com.yandex.go.taxi.order.details.v1.elements.driver.b(new gs70(), new gic(), (ru.yandex.taxi.widget.utils.e) f0gVar.x.J9.get(), (zuj0) zzfVar3.W.get(), (tt2) zzfVar3.n.get(), zzfVar3.a), (n6j) this.n.get()))), new com.yandex.go.taxi.order.details.v1.elements.upsell.a((y7j) l0gVar.D.get(), new x7j((ru.yandex.taxi.widget.c) zzfVar.Ze.get(), (ru.yandex.taxi.widget.utils.e) c0gVar.J9.get(), h(), (tt2) zzfVar.n.get())), new com.yandex.go.taxi.order.details.v1.elements.section_detail.a((l0q0) this.o.get(), new k0q0((pdc) zzfVar.Ye.get(), (ru.yandex.taxi.widget.utils.e) c0gVar.J9.get(), (ru.yandex.taxi.widget.c) zzfVar.Ze.get())), new tkw0((ukw0) this.p.get(), f()), new com.yandex.go.taxi.order.details.v1.elements.ride_support.a((jqk0) this.q.get(), new iqk0((pdc) zzfVar.Ye.get(), (ru.yandex.taxi.widget.utils.e) c0gVar.J9.get(), (ru.yandex.taxi.widget.c) zzfVar.Ze.get())), new p7j(new gs70(), (q7j) this.r.get()), new ht70(new yj70(new y480(new gs70())), (it70) l0gVar.E.get(), new y480(new gs70())), new com.yandex.go.taxi.order.details.v1.elements.user_requirements.b((e8j) this.s.get(), new com.yandex.go.taxi.order.details.v1.elements.user_requirements.c((ru.yandex.taxi.widget.utils.e) c0gVar.J9.get(), new com.yandex.go.taxi.order.details.v1.elements.user_requirements.a((zuj0) zzfVar.W.get(), (ru.yandex.taxi.widget.c) zzfVar.Ze.get()), (ru.yandex.taxi.widget.c) zzfVar.Ze.get())), new com.yandex.go.taxi.order.details.v1.elements.complete_button.a((e5j) this.t.get(), new d5j((tt2) zzfVar.n.get(), new vbb((zuj0) zzfVar.W.get()), (ru.yandex.taxi.widget.c) zzfVar.Ze.get())), new com.yandex.go.taxi.order.details.v1.elements.driver_phone.a((yim) this.u.get(), new com.yandex.go.taxi.order.details.v1.elements.driver_phone.b(new sim(), (ru.yandex.taxi.widget.c) zzfVar.Ze.get(), (zuj0) zzfVar.W.get())), (tt2) zzfVar.n.get());
    }

    public final com.yandex.go.taxi.order.quality_question.presentation.a e() {
        o2y0 o2y0Var = this.f.a.a;
        q5z.i(o2y0Var);
        zzf zzfVar = this.b;
        return new com.yandex.go.taxi.order.quality_question.presentation.a(new q6c0(o2y0Var, (c) zzfVar.bb.get(), new ngg0(), (tt2) zzfVar.n.get()));
    }

    public final cjw0 f() {
        new ckw0();
        zzf zzfVar = this.b;
        ko21 ko21Var = (ko21) zzfVar.i.get();
        fn21 fn21Var = (fn21) zzfVar.a0.get();
        zuj0 zuj0Var = (zuj0) zzfVar.W.get();
        cjw0 cjw0Var = new cjw0();
        cjw0Var.a = ko21Var;
        cjw0Var.b = fn21Var;
        cjw0Var.c = zuj0Var;
        return cjw0Var;
    }

    public final ru.yandex.taxi.combo.ui.a g() {
        zzf zzfVar = this.b;
        return new ru.yandex.taxi.combo.ui.a(new ru.yandex.taxi.combo.interactor.f((n20) zzfVar.o4.get(), (tt2) zzfVar.n.get(), new bd11((k7x0) this.c.z.M3.get()), (com.yandex.go.taxi.order.view.l) this.e.B.get()));
    }

    public final apf h() {
        zzf zzfVar = this.b;
        v7j v7jVar = new v7j((dne0) zzfVar.d.get(), 0);
        l0g l0gVar = this.f;
        y7j y7jVar = (y7j) l0gVar.D.get();
        o2y0 o2y0Var = l0gVar.a.a;
        q5z.i(o2y0Var);
        return new apf(v7jVar, y7jVar, o2y0Var, new qnh(new x770((pho) zzfVar.d0.get())), 19);
    }
}
