package com.yandex.go.preorder.lifecycle;

import defpackage.cjt0;
import defpackage.cl11;
import defpackage.gtq0;
import defpackage.hbp0;
import defpackage.jgt0;
import defpackage.kqv0;
import defpackage.l9s;
import defpackage.net0;
import defpackage.nzb0;
import defpackage.pft0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyo0;
import defpackage.ykn0;
import defpackage.z3g0;
import ru.yandex.taxi.preorder.source.domain.s;

/* loaded from: classes6.dex */
public final class f implements pft0 {
    public final nzb0 a;
    public final jgt0 b;
    public final ru.yandex.taxi.clarifypoint.b c;
    public final kqv0 d;
    public final ru.yandex.taxi.linked_order.a e;
    public final ru.yandex.taxi.preorder.source.domain.r f;
    public final net0 g;
    public final s h;
    public final z3g0 i;
    public final com.yandex.go.preorder.address.e j;
    public final cjt0 k;
    public final ru.yandex.taxi.preorder.source.mode.interactor.e l;

    public f(nzb0 nzb0Var, jgt0 jgt0Var, ru.yandex.taxi.clarifypoint.b bVar, kqv0 kqv0Var, ru.yandex.taxi.linked_order.a aVar, ru.yandex.taxi.preorder.source.domain.r rVar, net0 net0Var, s sVar, z3g0 z3g0Var, com.yandex.go.preorder.address.e eVar, cjt0 cjt0Var, ru.yandex.taxi.preorder.source.mode.interactor.e eVar2) {
        this.a = nzb0Var;
        this.b = jgt0Var;
        this.c = bVar;
        this.d = kqv0Var;
        this.e = aVar;
        this.f = rVar;
        this.g = net0Var;
        this.h = sVar;
        this.i = z3g0Var;
        this.j = eVar;
        this.k = cjt0Var;
        this.l = eVar2;
    }

    @Override // defpackage.pft0
    public final void d(tse tseVar) {
        hbp0 hbp0Var = this.a.a;
        hbp0Var.a();
        gtq0.t(tseVar, new uyo0(4, hbp0Var));
        this.g.d();
        this.d.a();
        this.l.b();
        this.f.g();
        s sVar = this.h;
        sVar.d();
        cjt0 cjt0Var = sVar.q;
        cjt0Var.g = new ykn0(17, sVar);
        l9s l9sVar = cjt0Var.f;
        if (!l9sVar.a || !l9sVar.b) {
            l9sVar.a = true;
            l9sVar.b = true;
            ((cl11) l9sVar.c).onResume();
        }
        jgt0 jgt0Var = this.b;
        ru.yandex.taxi.linked_order.a aVar = this.e;
        aVar.p = jgt0Var;
        aVar.h();
        this.c.a();
        this.i.b();
        tje.N(tseVar, null, null, new SourcePointCommonLifecycleListener$onResume$1(this, null), 3);
    }

    @Override // defpackage.pft0
    public final void onPause() {
        ru.yandex.taxi.linked_order.a aVar = this.e;
        aVar.p = null;
        aVar.h();
        this.c.l.b();
        pzt0 pzt0Var = this.i.j;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        cjt0 cjt0Var = this.k;
        cjt0Var.g = null;
        l9s l9sVar = cjt0Var.f;
        if (l9sVar.a) {
            l9sVar.a = false;
            if (l9sVar.b) {
                ((cl11) l9sVar.c).onPause();
            }
            l9sVar.b = false;
        }
    }
}
