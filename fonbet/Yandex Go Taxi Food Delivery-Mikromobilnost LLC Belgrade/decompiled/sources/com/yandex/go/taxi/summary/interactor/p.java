package com.yandex.go.taxi.summary.interactor;

import defpackage.bvf0;
import defpackage.ck31;
import defpackage.dqe0;
import defpackage.ekz;
import defpackage.ixb;
import defpackage.jqr;
import defpackage.jxb;
import defpackage.lct0;
import defpackage.mct0;
import defpackage.p0j;
import defpackage.pex0;
import defpackage.sue0;
import defpackage.tpr;
import defpackage.w810;
import defpackage.wae0;
import defpackage.wiq0;
import defpackage.yjt0;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.sourcedestination.DestinationTrailMode;

/* loaded from: classes14.dex */
public final class p {
    public final ck31 a;
    public final ru.yandex.taxi.hints.interactors.c b;
    public final w810 c;
    public final wiq0 d;
    public final ekz e;
    public final wae0 f;
    public final dqe0 g;
    public final com.yandex.go.route.interactor.c h;
    public final yjt0 i;
    public final p0j j;
    public final ixb k;
    public final ru.yandex.taxi.widget.utils.e l;
    public final sue0 m;
    public final lct0 n;
    public final r0 o;

    public p(ck31 ck31Var, ru.yandex.taxi.hints.interactors.c cVar, w810 w810Var, wiq0 wiq0Var, ekz ekzVar, wae0 wae0Var, dqe0 dqe0Var, com.yandex.go.route.interactor.c cVar2, yjt0 yjt0Var, p0j p0jVar, ixb ixbVar, ru.yandex.taxi.widget.utils.e eVar, sue0 sue0Var) {
        this.a = ck31Var;
        this.b = cVar;
        this.c = w810Var;
        this.d = wiq0Var;
        this.e = ekzVar;
        this.f = wae0Var;
        this.g = dqe0Var;
        this.h = cVar2;
        this.i = yjt0Var;
        this.j = p0jVar;
        this.k = ixbVar;
        this.l = eVar;
        this.m = sue0Var;
        mct0 mct0Var = mct0.m;
        lct0 lct0Var = new lct0();
        this.n = lct0Var;
        this.o = bvf0.c(lct0Var.a());
    }

    public final void a() {
        d();
        pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.d).m();
        this.n.a = this.i.b(m != null ? m.B0.a : false);
        c();
    }

    public final tpr b() {
        jqr jqrVar = new jqr(this.h.f(), new SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$1(this, null), 3);
        com.yandex.go.taxi.tariffs.internal.repository.k kVar = (com.yandex.go.taxi.tariffs.internal.repository.k) this.a;
        return kotlinx.coroutines.flow.e.t(new m0(this.o, com.yandex.go.coroutines.b.d(new o(new jqr(kotlinx.coroutines.flow.e.p(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{jqrVar, new jqr(kVar.e(), new SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$2(this, null), 3), new jqr(this.b.a(), new SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$3(this, null), 3), new jqr(this.e.a(), new SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$4(this, null), 3), new jqr(((jxb) this.k).b(), new SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$5(this, null), 3), new jqr(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new k(kVar.e())), new SummarySourceDestinationModelInteractor$rideTimeIconFlow$$inlined$flatMapLatest$1(this, null)), new SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$6(this, null), 3)}, 6)), 200L), new SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$7(this, null), 3)), new SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$start$1(2, null)), new SummarySourceDestinationModelInteractor$sourceDestinationFlow$1(3, null)));
    }

    public final void c() {
        String a = ((jxb) this.k).a();
        lct0 lct0Var = this.n;
        if (a != null) {
            lct0Var.f = DestinationTrailMode.NONE;
            lct0Var.b(a);
            return;
        }
        List list = this.h.c().b;
        pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.d).m();
        boolean z = m != null ? m.B0.a : false;
        if (list.isEmpty()) {
            lct0Var.f = DestinationTrailMode.NONE;
            lct0Var.b("");
            return;
        }
        lct0Var.f = list.size() < this.c.a() ? DestinationTrailMode.ADD_DESTINATION : DestinationTrailMode.NONE;
        int size = list.size();
        p0j p0jVar = this.j;
        if (size == 1) {
            lct0Var.b(p0jVar.c(z));
            return;
        }
        String c = p0jVar.c(z);
        int size2 = list.size();
        lct0Var.d = c;
        lct0Var.l = size2;
    }

    public final void d() {
        pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.d).m();
        boolean z = m != null ? m.B0.a : false;
        String a = this.i.a(z);
        lct0 lct0Var = this.n;
        lct0Var.b = a;
        if (((jxb) this.k).a() != null) {
            lct0Var.e = null;
        } else {
            lct0Var.e = this.j.b(z);
        }
    }
}
