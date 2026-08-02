package com.yandex.go.address.position_confirmation;

import com.yandex.go.clarify_address.AddressClarificationReason;
import defpackage.aq80;
import defpackage.bvf0;
import defpackage.h3y;
import defpackage.hit;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.kr0;
import defpackage.mdh;
import defpackage.mr0;
import defpackage.mth;
import defpackage.mzb;
import defpackage.oyb0;
import defpackage.pv0;
import defpackage.qy41;
import defpackage.ry41;
import defpackage.ryb0;
import defpackage.sjh;
import defpackage.syb0;
import defpackage.szb;
import defpackage.t1a1;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.tyb0;
import defpackage.uyj;
import defpackage.vde0;
import defpackage.vyb0;
import defpackage.w511;
import defpackage.wde0;
import defpackage.wyb0;
import defpackage.wzb;
import defpackage.xna1;
import defpackage.xyb0;
import defpackage.z6r;
import defpackage.zy11;
import defpackage.zyb0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.map_object.v0;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes12.dex */
public final class j {
    public final tt2 a;
    public final h3y b;
    public final ru.yandex.taxi.search.suggest.i c;
    public final com.yandex.go.navigation.screen.c d;
    public final hit e;
    public final h3y f;
    public final kr0 g;
    public final mr0 h;
    public final a i;
    public final oyb0 j;
    public final k k;
    public final zyb0 l;
    public final mzb m;
    public final r0 n = bvf0.c(zy11.a);

    public j(tt2 tt2Var, h3y h3yVar, ru.yandex.taxi.search.suggest.i iVar, com.yandex.go.navigation.screen.c cVar, hit hitVar, h3y h3yVar2, kr0 kr0Var, mr0 mr0Var, z6r z6rVar, a aVar, oyb0 oyb0Var, k kVar, zyb0 zyb0Var, mzb mzbVar) {
        this.a = tt2Var;
        this.b = h3yVar;
        this.c = iVar;
        this.d = cVar;
        this.e = hitVar;
        this.f = h3yVar2;
        this.g = kr0Var;
        this.h = mr0Var;
        this.i = aVar;
        this.j = oyb0Var;
        this.k = kVar;
        this.l = zyb0Var;
        this.m = mzbVar;
        if (((pv0) iVar.i().orElse(null)) != null) {
            z6rVar.a.set(!xna1.b(r0.a));
        }
    }

    public final void a() {
        if (jl40.l(this.j.a(), syb0.a)) {
            return;
        }
        r0 r0Var = this.n;
        r0Var.getClass();
        r0Var.m(null, zy11.a);
    }

    public final tpr b() {
        tpr k;
        RoutePointType routePointType = RoutePointType.POINT_A;
        ru.yandex.taxi.search.suggest.i iVar = this.c;
        k = iVar.k(routePointType, false);
        tpr iVar2 = new i(k);
        pv0 pv0Var = (pv0) iVar.i().orElse(null);
        if (pv0Var != null) {
            iVar2 = com.yandex.go.coroutines.b.d(iVar2, new PinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$lambda$1$$inlined$start$1(pv0Var, null));
        }
        int i = 3;
        g gVar = new g(new e(new mth(new j0(null, new jqr(kotlinx.coroutines.flow.e.l(new jqr(kotlinx.coroutines.flow.e.t(new jqr(kotlinx.coroutines.flow.e.t(iVar2), new PinPositionConfirmationInteractorImpl$sourcePointAddressInfoFlow$1(this, null), i)), new PinPositionConfirmationInteractorImpl$needConfirmationFlow$1(this, null), i), this.h.c, kotlinx.coroutines.flow.e.t(new c(this.l.d, this)), new jqr(this.d.c(), new PinPositionConfirmationInteractorImpl$needConfirmationFlow$2(this, null), i), this.n, new PinPositionConfirmationInteractorImpl$needConfirmationFlow$3(this, null)), new PinPositionConfirmationInteractorImpl$needConfirmationFlow$4(this, null), i), new PinPositionConfirmationInteractorImpl$needConfirmationFlow$$inlined$withPreviousEmit$1(3, null)), 6), this));
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(gVar, mdh.b);
    }

    public final void c() {
        oyb0 oyb0Var = this.j;
        xyb0 a = oyb0Var.a();
        if (jl40.l(a, wyb0.a) || jl40.l(a, tyb0.a) || jl40.l(a, syb0.a)) {
            return;
        }
        ryb0 ryb0Var = ryb0.a;
        if (jl40.l(a, ryb0Var)) {
            return;
        }
        if (!(a instanceof vyb0)) {
            w511.b();
            return;
        }
        vyb0 vyb0Var = (vyb0) a;
        ((com.yandex.go.clarify_address.before_order.a) this.m).b.d = true;
        tje.N(this.e.a, null, null, new PinPositionConfirmationInteractorImpl$startConfirmation$1(this, vyb0Var, null), 3);
        oyb0Var.a.l(ryb0Var);
        t1a1 t1a1Var = vyb0Var.d;
        if (t1a1Var instanceof vde0) {
            vde0 vde0Var = (vde0) t1a1Var;
            ((ry41) ((qy41) this.b.get())).e(new v0(vde0Var.b, vde0Var.c, vde0Var.e, vde0Var.f, 212), vde0Var.g);
            return;
        }
        if (!t1a1Var.equals(wde0.b)) {
            w511.b();
            return;
        }
        ((wzb) ((szb) this.f.get())).a(new aq80(this), this.d.b());
    }

    public final void d() {
        this.l.a(false);
        this.j.a.l(syb0.a);
        ((com.yandex.go.clarify_address.a) this.g).c(true, AddressClarificationReason.Map);
    }
}
