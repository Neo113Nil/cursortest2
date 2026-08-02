package com.yandex.go.superapp.order_tracking.eats.presentation.navigation;

import android.content.Context;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.superapp.order_tracking.eats.presentation.ui.EatsOrderDetailsModalView;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import defpackage.a3v;
import defpackage.afn;
import defpackage.ah00;
import defpackage.alm;
import defpackage.bfn;
import defpackage.byx;
import defpackage.c430;
import defpackage.cfn;
import defpackage.cyx;
import defpackage.dr00;
import defpackage.gh00;
import defpackage.m230;
import defpackage.m950;
import defpackage.n6w0;
import defpackage.nfh;
import defpackage.o950;
import defpackage.oa1;
import defpackage.pav;
import defpackage.qoi0;
import defpackage.qp0;
import defpackage.sy60;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u1n;
import defpackage.u45;
import defpackage.ufn;
import defpackage.un0;
import defpackage.w030;
import defpackage.w49;
import defpackage.xvf0;
import defpackage.yvf0;
import defpackage.zen;
import defpackage.zth;

/* loaded from: classes14.dex */
public final class g extends m230 {
    public final w030 E;
    public final com.yandex.go.superapp.tracking.data.e F;
    public final bfn G;
    public final zen H;
    public final alm I;
    public final ah00 J;
    public final a3v K;
    public final dr00 L;
    public final n6w0 M;
    public final tt2 N;
    public final yvf0 O;
    public final cyx P;
    public final oa1 Q;

    public g(w030 w030Var, com.yandex.go.superapp.tracking.data.e eVar, bfn bfnVar, zen zenVar, alm almVar, ah00 ah00Var, a3v a3vVar, dr00 dr00Var, n6w0 n6w0Var, tt2 tt2Var, yvf0 yvf0Var, cyx cyxVar, oa1 oa1Var) {
        super("EatsOrderDetailsRouter");
        this.E = w030Var;
        this.F = eVar;
        this.G = bfnVar;
        this.H = zenVar;
        this.I = almVar;
        this.J = ah00Var;
        this.K = a3vVar;
        this.L = dr00Var;
        this.M = n6w0Var;
        this.N = tt2Var;
        this.O = yvf0Var;
        this.P = cyxVar;
        this.Q = oa1Var;
    }

    @Override // defpackage.m230, defpackage.h55
    public final void G(Object obj) {
        this.K.b8(qoi0.a(afn.class));
        this.Q.b(DetailsOpenReason.HEADER, "");
        super.G((cfn) obj);
        ((gh00) this.J).L(null);
        this.F.b();
        this.P.b(new byx(Screen.MAIN, new c430(Mode.EATS, (kotlinx.serialization.json.b) null, (un0) null)));
    }

    @Override // defpackage.m230, defpackage.h55
    public final void H(Object obj) {
        super.H((cfn) obj);
        this.K.a0(qoi0.a(afn.class));
        this.F.c();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new EatsOrderDetailsRouter$onLaunch$1(this, null), 3);
        A((m950) this.I.get(), new ufn(((cfn) obj).a), sy60.Q2);
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        cfn cfnVar = (cfn) obj;
        String str = cfnVar.a;
        u1n u1nVar = new u1n(this, cfnVar);
        o950 lifecycle = getLifecycle();
        nfh nfhVar = this.G.a;
        com.yandex.go.superapp.order_tracking.eats.presentation.ui.a aVar = new com.yandex.go.superapp.order_tracking.eats.presentation.ui.a(str, u1nVar, lifecycle, (com.yandex.go.superapp.order_tracking.eats.domain.c) ((zth) nfhVar.a).get(), (a3v) ((xvf0) nfhVar.b).get(), (tt2) ((xvf0) nfhVar.c).get());
        qp0 qp0Var = this.H.a;
        return new EatsOrderDetailsModalView((Context) qp0Var.a.get(), (pav) qp0Var.b.get(), (w49) qp0Var.c.get(), aVar);
    }
}
