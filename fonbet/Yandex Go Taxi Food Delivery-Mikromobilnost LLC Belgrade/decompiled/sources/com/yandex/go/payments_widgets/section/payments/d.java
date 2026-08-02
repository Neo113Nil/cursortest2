package com.yandex.go.payments_widgets.section.payments;

import defpackage.ala0;
import defpackage.b921;
import defpackage.cea0;
import defpackage.dea0;
import defpackage.e0q0;
import defpackage.f0q0;
import defpackage.fla0;
import defpackage.gla0;
import defpackage.hea0;
import defpackage.hla0;
import defpackage.i3y;
import defpackage.jla0;
import defpackage.mds0;
import defpackage.nla0;
import defpackage.ovl;
import defpackage.pxl;
import defpackage.pzt0;
import defpackage.qv10;
import defpackage.t9a0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wgr;
import defpackage.xla0;
import defpackage.yla0;
import flex.section.divkit.DivkitSnippet;

/* loaded from: classes8.dex */
public final class d extends f0q0 {
    public final PaymentWidgetsSection g;
    public final pxl h;
    public final wgr i;
    public final tse j;
    public final jla0 k;
    public final nla0 l;
    public final dea0 m;
    public final b921 n;
    public final hea0 o;
    public final fla0 p;
    public final xla0 q;
    public final yla0 r;
    public final ala0 s;
    public final i3y t = kotlin.a.a(new t9a0(4, this));
    public pzt0 u;
    public pzt0 v;
    public pzt0 w;

    public d(PaymentWidgetsSection paymentWidgetsSection, pxl pxlVar, wgr wgrVar, tse tseVar, jla0 jla0Var, nla0 nla0Var, dea0 dea0Var, b921 b921Var, hea0 hea0Var, fla0 fla0Var, xla0 xla0Var, yla0 yla0Var, ala0 ala0Var) {
        this.g = paymentWidgetsSection;
        this.h = pxlVar;
        this.i = wgrVar;
        this.j = tseVar;
        this.k = jla0Var;
        this.l = nla0Var;
        this.m = dea0Var;
        this.n = b921Var;
        this.o = hea0Var;
        this.p = fla0Var;
        this.q = xla0Var;
        this.r = yla0Var;
        this.s = ala0Var;
    }

    @Override // defpackage.f0q0
    public final void b() {
        DivkitSnippet divkitSnippet;
        mds0 c;
        DivkitSnippet divkitSnippet2;
        mds0 c2;
        Boolean bool;
        PaymentWidgetsSection paymentWidgetsSection = this.g;
        PaymentWidgetsDataDto paymentWidgetsDataDto = paymentWidgetsSection.c;
        PaymentWidgetsDataDto paymentWidgetsDataDto2 = paymentWidgetsSection.c;
        boolean booleanValue = (paymentWidgetsDataDto == null || (bool = paymentWidgetsDataDto.d) == null) ? true : bool.booleanValue();
        jla0 jla0Var = this.k;
        jla0Var.getClass();
        ovl ovlVar = jla0Var.a;
        Boolean bool2 = paymentWidgetsDataDto2 != null ? paymentWidgetsDataDto2.c : null;
        e0q0 e0q0Var = this.e;
        pxl pxlVar = this.h;
        hla0 hla0Var = (bool2 == null || !booleanValue || (divkitSnippet2 = paymentWidgetsDataDto2.a) == null || (c2 = ovlVar.c(divkitSnippet2, pxlVar, e0q0Var)) == null) ? null : new hla0(paymentWidgetsSection.a, new gla0(c2, paymentWidgetsDataDto2.c.booleanValue()));
        this.m.a.l((paymentWidgetsDataDto2 == null || (divkitSnippet = paymentWidgetsDataDto2.b) == null || (c = ovlVar.c(divkitSnippet, pxlVar, e0q0Var)) == null) ? null : new cea0(c, booleanValue));
        qv10.B(hla0Var != null, this.r.a, null);
        if (hla0Var != null) {
            this.f.C(hla0Var);
        }
        pzt0 pzt0Var = this.v;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        PaymentWidgetsSectionController$onActivate$2 paymentWidgetsSectionController$onActivate$2 = new PaymentWidgetsSectionController$onActivate$2(this, null);
        tse tseVar = this.j;
        this.v = tje.N(tseVar, null, null, paymentWidgetsSectionController$onActivate$2, 3);
        pzt0 pzt0Var2 = this.w;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.w = tje.N(tseVar, null, null, new PaymentWidgetsSectionController$onActivate$3(this, null), 3);
        pzt0 pzt0Var3 = this.u;
        if (pzt0Var3 == null || !pzt0Var3.isActive()) {
            this.u = tje.N(tseVar, null, null, new PaymentWidgetsSectionController$onActivate$4(this, null), 3);
        }
    }

    @Override // defpackage.f0q0
    public final void c() {
        qv10.B(false, this.r.a, null);
        this.m.a.l(null);
        pzt0 pzt0Var = this.v;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.w;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        PaymentWidgetsAnalyticsInteractor$VisibilityState paymentWidgetsAnalyticsInteractor$VisibilityState = PaymentWidgetsAnalyticsInteractor$VisibilityState.NO_SECTION;
        ala0 ala0Var = this.s;
        tje.N(ala0Var.a, null, null, new PaymentWidgetsAnalyticsInteractor$onVisibilityChanged$1(ala0Var, paymentWidgetsAnalyticsInteractor$VisibilityState, null), 3);
    }
}
