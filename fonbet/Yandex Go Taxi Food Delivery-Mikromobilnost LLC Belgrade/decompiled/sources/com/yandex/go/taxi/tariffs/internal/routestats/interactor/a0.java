package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import com.yandex.go.zone.model.Zone;
import defpackage.au50;
import defpackage.b2k;
import defpackage.hqe0;
import defpackage.i270;
import defpackage.jd21;
import defpackage.kni;
import defpackage.ldm;
import defpackage.mmf0;
import defpackage.mth;
import defpackage.n1d;
import defpackage.p0u;
import defpackage.pte0;
import defpackage.qoj0;
import defpackage.stx;
import defpackage.tpr;
import defpackage.usx;
import defpackage.uvw;
import defpackage.vo40;
import defpackage.wiq0;
import defpackage.wtx;
import defpackage.x1f0;
import defpackage.yk;
import defpackage.zy11;
import java.util.Arrays;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.preorder.repositories.PreorderZoneModeRepository$zoneModeFlow$$inlined$start$1;

/* loaded from: classes8.dex */
public final class a0 {
    public final ru.yandex.taxi.launch.c a;
    public final com.yandex.go.route.interactor.b b;
    public final qoj0 c;
    public final mmf0 d;
    public final hqe0 e;
    public final n1d f;
    public final vo40 g;
    public final ru.yandex.taxi.preorder.tollroad.data.e h;
    public final au50 i;
    public final pte0 j;
    public final ldm k;
    public final kni l;
    public final uvw m;
    public final jd21 n;
    public final ru.yandex.taxi.am.i o;
    public final wiq0 p;

    public a0(ru.yandex.taxi.launch.c cVar, com.yandex.go.route.interactor.b bVar, qoj0 qoj0Var, mmf0 mmf0Var, hqe0 hqe0Var, n1d n1dVar, vo40 vo40Var, ru.yandex.taxi.preorder.tollroad.data.e eVar, au50 au50Var, pte0 pte0Var, ldm ldmVar, kni kniVar, uvw uvwVar, jd21 jd21Var, ru.yandex.taxi.am.i iVar, wiq0 wiq0Var) {
        this.a = cVar;
        this.b = bVar;
        this.c = qoj0Var;
        this.d = mmf0Var;
        this.e = hqe0Var;
        this.f = n1dVar;
        this.g = vo40Var;
        this.h = eVar;
        this.i = au50Var;
        this.j = pte0Var;
        this.k = ldmVar;
        this.l = kniVar;
        this.m = uvwVar;
        this.n = jd21Var;
        this.o = iVar;
        this.p = wiq0Var;
    }

    public final tpr a(Zone zone) {
        z zVar = new z(this.a.b());
        x xVar = new x(new t(new mth(kotlinx.coroutines.flow.e.s(new v(this.b.k()), new yk(26)), 7), this), this);
        qoj0 qoj0Var = this.c;
        b2k s = kotlinx.coroutines.flow.e.s(new q(kotlinx.coroutines.flow.e.r(com.yandex.go.coroutines.b.d(new o(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{qoj0Var.b.a, new m(qoj0Var.d.a)}, 2))), new RequirementsInfoInteractor$requirementsFlow$$inlined$start$1(0L, null)), new p0u(13)), qoj0Var), new yk(25));
        mmf0 mmf0Var = this.d;
        k kVar = new k(kotlinx.coroutines.flow.e.t(mmf0Var.b.c()), mmf0Var);
        hqe0 hqe0Var = this.e;
        n0 n0Var = hqe0Var.b.c;
        zy11 zy11Var = zy11.a;
        tpr t = kotlinx.coroutines.flow.e.t(new m0(com.yandex.go.coroutines.b.d(n0Var, new PreorderInfoInteractor$preorderInfoFlow$$inlined$start$1(zy11Var, null)), hqe0Var.c.a, new PreorderInfoInteractor$preorderInfoFlow$1(hqe0Var, null)));
        n1d n1dVar = this.f;
        ru.yandex.taxi.preorder.repositories.g gVar = (ru.yandex.taxi.preorder.repositories.g) n1dVar.c;
        tpr t2 = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.l(kotlinx.coroutines.flow.e.t(new i(com.yandex.go.coroutines.b.d(gVar.c, new PaymentInfoInteractor$paymentFlow$lambda$0$$inlined$start$1(zy11Var, null)), n1dVar, gVar)), com.yandex.go.coroutines.b.d(new e(new mth(kotlinx.coroutines.flow.e.t(new g(((x1f0) n1dVar.d).b)), 4), n1dVar), new PaymentInfoInteractor$paymentFlow$$inlined$start$1(0L, null)), kotlinx.coroutines.flow.e.d(((wtx) n1dVar.e).b), kotlinx.coroutines.flow.e.d(((usx) n1dVar.f).b), kotlinx.coroutines.flow.e.d(((stx) n1dVar.g).b), new PaymentInfoInteractor$paymentFlow$2(null)));
        r0 r0Var = this.h.g;
        tpr t3 = kotlinx.coroutines.flow.e.t(new b(((i270) this.i.b).a));
        kni kniVar = this.l;
        tpr t4 = kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.delivery.a(new tpr[]{kniVar.a.b, kniVar.b.b, kniVar.c.d, kniVar.d.b, kniVar.e.b, kniVar.f.b}));
        pte0 pte0Var = this.j;
        return kotlinx.coroutines.flow.e.t(new r(new tpr[]{zVar, xVar, s, kVar, t, t2, r0Var, t3, t4, kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.preorder.repositories.i(com.yandex.go.coroutines.b.d(pte0Var.b, new PreorderZoneModeRepository$zoneModeFlow$$inlined$start$1(zy11Var, null)), pte0Var)), kotlinx.coroutines.flow.e.d(this.n.a), this.o.a(), kotlinx.coroutines.flow.e.d(this.k.a), com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.p(this.g.a.d(), 800L), new MulticlassInfoInteractor$selectedClassesChangedFlow$$inlined$start$1(zy11Var, null)), ((com.yandex.go.taxi.tariffs.internal.repository.k) this.p).j.b()}, this, zone));
    }
}
