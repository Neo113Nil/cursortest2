package com.yandex.go.taxi.order.state;

import android.view.View;
import defpackage.apf;
import defpackage.avj0;
import defpackage.b980;
import defpackage.bu0;
import defpackage.bvf0;
import defpackage.c0g;
import defpackage.f0g;
import defpackage.fh70;
import defpackage.fxx0;
import defpackage.gpf0;
import defpackage.i3y;
import defpackage.jqr;
import defpackage.jxx0;
import defpackage.k48;
import defpackage.l780;
import defpackage.m48;
import defpackage.mth;
import defpackage.n0g;
import defpackage.ney;
import defpackage.o2y0;
import defpackage.p370;
import defpackage.p4j;
import defpackage.q48;
import defpackage.q5z;
import defpackage.rol0;
import defpackage.spl0;
import defpackage.t48;
import defpackage.tje;
import defpackage.web1;
import defpackage.x980;
import defpackage.xw;
import defpackage.za80;
import defpackage.zuj0;
import defpackage.zzf;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.models.CopySource;
import ru.yandex.taxi.superapp.orders.models.ActionType;
import ru.yandex.taxi.superapp.orders.ui.PopupWindowAboveFromView;

/* loaded from: classes14.dex */
public abstract class o extends l780 {
    public final za80 E;
    public final x980 F;
    public final ru.yandex.taxi.apprate.common.domain.a G;
    public final com.yandex.go.taxi.order.details.v1.domain.a H;
    public final k48 I;
    public final t48 J;
    public final p370 K;
    public final com.yandex.go.taxi.order.details.v1.elements.buttons.i L;
    public final bu0 M;
    public final gpf0 N;
    public final apf O;
    public final r0 P;
    public final zuj0 Q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(fxx0 fxx0Var, Class cls, ney neyVar) {
        super(cls, neyVar, r4, r5, (spl0) r0.fm.get());
        o2y0 o2y0Var = ((n0g) fxx0Var).f.a.a;
        q5z.i(o2y0Var);
        n0g n0gVar = (n0g) fxx0Var;
        p4j p4jVar = (p4j) n0gVar.h.get();
        c0g c0gVar = n0gVar.c;
        this.E = n0gVar.a.a;
        f0g f0gVar = n0gVar.e;
        this.F = f0gVar.a;
        zzf zzfVar = n0gVar.b;
        this.G = f0gVar.L();
        this.H = n0gVar.d();
        this.I = (k48) c0gVar.a.C5.get();
        this.J = c0gVar.C1();
        this.K = f0gVar.s1();
        o2y0 o2y0Var2 = n0gVar.f.a.a;
        q5z.i(o2y0Var2);
        this.L = new com.yandex.go.taxi.order.details.v1.elements.buttons.i(o2y0Var2, (fh70) c0gVar.om.get());
        this.M = n0gVar.a();
        this.N = f0gVar.t1();
        this.O = n0gVar.h();
        this.P = bvf0.c(null);
        this.Q = (zuj0) zzfVar.W.get();
        this.A.b();
    }

    @Override // defpackage.l780, defpackage.qc5, defpackage.ad5, defpackage.zc5
    public void Cg() {
        super.Cg();
        ru.yandex.taxi.superapp.orders.ui.c cVar = ((m48) this.I).k;
        if (cVar != null) {
            i3y i3yVar = cVar.d;
            if (i3yVar.isInitialized()) {
                ((PopupWindowAboveFromView) i3yVar.getValue()).dismiss();
            }
        }
    }

    public final void Ng(jxx0 jxx0Var) {
        Mg(jxx0Var);
        com.yandex.go.taxi.order.details.v1.domain.a aVar = this.H;
        tje.N(Jg(), null, null, new TaxiOnTheWayViewPresenter$observeHeaderSection$$inlined$collectIn$1(new jqr(new m0(aVar.l, new mth(this.P, 6), new TaxiOnTheWayViewPresenter$observeHeaderSection$1(3, null)), new TaxiOnTheWayViewPresenter$observeHeaderSection$2(this, null), 3), null, this), 3);
        tje.N(Jg(), null, null, new TaxiOnTheWayViewPresenter$observeHeaderSection$$inlined$collectIn$2(aVar.m, null, this), 3);
        tje.N(Jg(), null, null, new TaxiOnTheWayViewPresenter$observeButtons$$inlined$collectIn$1(aVar.n, null, this), 3);
        tje.N(Jg(), null, null, new TaxiOnTheWayViewPresenter$observeButtons$$inlined$collectIn$2(aVar.u, null, this), 3);
        tje.N(Jg(), null, null, new TaxiOnTheWayViewPresenter$observeButtons$$inlined$collectIn$3(new jqr(kotlinx.coroutines.flow.e.T(new n(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(new rol0(new TaxiOnTheWayViewPresenter$observeButtons$3(this, null)), new TaxiOnTheWayViewPresenter$observeButtons$$inlined$flatMapLatest$1(this, null)))), 1), new TaxiOnTheWayViewPresenter$observeButtons$6(2, null), 3), null, this), 3);
        tje.N(Jg(), null, null, new TaxiOnTheWayViewPresenter$observeCancelButtonStyle$$inlined$collectIn$1(aVar.t, null, this), 3);
        tje.N(Jg(), null, null, new TaxiOnTheWayViewPresenter$observePromoPlaques$$inlined$collectIn$1(aVar.v, null, this), 3);
        tje.N(Jg(), null, null, new TaxiOnTheWayViewPresenter$observePromoPlaques$$inlined$collectIn$2(aVar.w, null, this), 3);
        tje.N(Jg(), null, null, new TaxiOnTheWayViewPresenter$observeCardStyle$$inlined$collectIn$1(aVar.A, null, this), 3);
        tje.N(Jg(), null, null, new TaxiOnTheWayViewPresenter$observeUpsell$$inlined$collectIn$1(new jqr(aVar.B, new TaxiOnTheWayViewPresenter$observeUpsell$1(this, null), 3), null, this), 3);
    }

    public final void Og(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActionType actionType = ((xw) it.next()).a;
            p4j p4jVar = this.B;
            p4jVar.getClass();
            p4jVar.b(p4j.a(actionType));
        }
    }

    public final void Pg(View view) {
        q48 a = this.J.a(this.A.b(), false);
        if (web1.i(a)) {
            this.B.c("CopyMenu");
            zuj0 zuj0Var = this.Q;
            ((m48) this.I).b(a, view, -tje.u(24, ((avj0) zuj0Var).a), tje.u(24, ((avj0) zuj0Var).a), CopySource.DETAILS, 8388661);
        }
    }

    public final void Qg(b980 b980Var) {
        this.P.l(b980Var);
        if (b980Var.e != null) {
            this.B.b("CopyMenu");
        }
    }
}
