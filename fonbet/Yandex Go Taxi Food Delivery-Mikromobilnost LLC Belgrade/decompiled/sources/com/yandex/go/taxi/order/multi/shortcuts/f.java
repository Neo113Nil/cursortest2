package com.yandex.go.taxi.order.multi.shortcuts;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.payments.api.preorder.SuitabilityCheckType;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import defpackage.a3y0;
import defpackage.a7t0;
import defpackage.arv0;
import defpackage.bhv0;
import defpackage.c4r0;
import defpackage.cre0;
import defpackage.dqe0;
import defpackage.dre0;
import defpackage.egz;
import defpackage.evu0;
import defpackage.hjv0;
import defpackage.hxx;
import defpackage.icv0;
import defpackage.jc00;
import defpackage.jre0;
import defpackage.k9s0;
import defpackage.kpi0;
import defpackage.m950;
import defpackage.mre0;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wiq0;
import defpackage.yqv0;
import defpackage.yvf0;
import defpackage.ziv0;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes8.dex */
public final class f {
    public final tse a;
    public final ru.yandex.taxi.deeplinks.e b;
    public final yvf0 c;
    public final wiq0 d;
    public final arv0 e;
    public final ru.yandex.taxi.superapp.orders.multi.a f;
    public final icv0 g;
    public final c4r0 h;
    public final dqe0 i;
    public final jc00 j;
    public final g k;
    public final kpi0 l;
    public final yvf0 m;
    public final oep0 n;
    public final a3y0 o = new a3y0(TaxiOrderLogGroup.NAVIGATION.getTag(), "OrderSummaryRouter");
    public pzt0 p;

    public f(tse tseVar, ru.yandex.taxi.deeplinks.e eVar, yvf0 yvf0Var, wiq0 wiq0Var, arv0 arv0Var, ru.yandex.taxi.superapp.orders.multi.a aVar, icv0 icv0Var, c4r0 c4r0Var, dqe0 dqe0Var, jc00 jc00Var, g gVar, kpi0 kpi0Var, yvf0 yvf0Var2, oep0 oep0Var) {
        this.a = tseVar;
        this.b = eVar;
        this.c = yvf0Var;
        this.d = wiq0Var;
        this.e = arv0Var;
        this.f = aVar;
        this.g = icv0Var;
        this.h = c4r0Var;
        this.i = dqe0Var;
        this.j = jc00Var;
        this.k = gVar;
        this.l = kpi0Var;
        this.m = yvf0Var2;
        this.n = oep0Var;
    }

    public static final void a(f fVar, ZoneAddress zoneAddress, Address address, boolean z) {
        ((a7t0) fVar.e).b(new yqv0(SummaryUiState$Type.NORMAL, ""));
        fVar.l.b();
        cre0 cre0Var = new cre0();
        cre0Var.f(zoneAddress);
        cre0Var.b(address);
        cre0Var.c(!fVar.g.a(new SuitabilityCheckType[0]));
        cre0Var.d();
        dre0 a = cre0Var.a();
        oep0 oep0Var = fVar.n;
        m950 m950Var = (m950) fVar.m.get();
        k9s0 k9s0Var = k9s0.f;
        ((pep0) oep0Var).f(m950Var, new mre0(a, egz.G(true, new bhv0(0), z ? ziv0.a : hjv0.a)), hxx.a);
    }

    public final void b(k9s0 k9s0Var, Address address, boolean z) {
        ZoneAddress f = this.i.f();
        if (z && f != null) {
            c(k9s0Var, f, address);
            return;
        }
        ((pep0) this.n).f((m950) this.m.get(), jre0.a, hxx.a);
        tje.N(this.a, null, null, new OrderSummaryRouter$openSummaryOnOrder$1(this, k9s0Var, address, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r7.g.a(new com.yandex.go.payments.api.preorder.SuitabilityCheckType[0]) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(k9s0 k9s0Var, ZoneAddress zoneAddress, Address address) {
        String str = k9s0Var.b;
        String str2 = k9s0Var.a;
        String str3 = k9s0Var.c;
        if (str == null) {
            a3y0.d(this.o, "showSummary", new IllegalArgumentException("Error open order deeplink. Tariff class is null"), null, 4);
            return;
        }
        ((a7t0) this.e).b(str3 != null ? new yqv0(SummaryUiState$Type.TRAP, str3) : new yqv0(SummaryUiState$Type.NORMAL, ""));
        SelectionOrigin selectionOrigin = k9s0Var.d;
        if (selectionOrigin == null) {
            selectionOrigin = SelectionOrigin.SHORTCUT;
        }
        if (str2 == null || evu0.J(str2)) {
            str2 = null;
        }
        boolean z = true;
        this.h.b(selectionOrigin, str, str2 != null ? str2 : "", true);
        cre0 cre0Var = new cre0();
        cre0Var.e(str);
        cre0Var.f(zoneAddress);
        cre0Var.b(address);
        if (this.j.a()) {
        }
        z = false;
        cre0Var.c(z);
        cre0Var.d();
        ((pep0) this.n).f((m950) this.m.get(), new mre0(cre0Var.a(), k9s0Var), hxx.a);
    }

    public final void d(Address address, boolean z) {
        pzt0 pzt0Var = this.p;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.p = tje.N(this.a, null, null, new OrderSummaryRouter$specifySourcePointAndShowSummary$1(this, address, z, null), 3);
    }
}
