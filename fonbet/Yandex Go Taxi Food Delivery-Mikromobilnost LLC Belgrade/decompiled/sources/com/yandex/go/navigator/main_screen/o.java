package com.yandex.go.navigator.main_screen;

import com.yandex.go.navigator.domain.v;
import com.yandex.mapkit.navigation.automotive.Navigation;
import defpackage.ah00;
import defpackage.avj0;
import defpackage.dg50;
import defpackage.flm;
import defpackage.gcc0;
import defpackage.gfl0;
import defpackage.h3y;
import defpackage.h55;
import defpackage.hcc0;
import defpackage.hhs0;
import defpackage.i3y;
import defpackage.iez;
import defpackage.ifl0;
import defpackage.ihs0;
import defpackage.ilm;
import defpackage.j700;
import defpackage.jpj0;
import defpackage.kyh0;
import defpackage.lg50;
import defpackage.m950;
import defpackage.n1j0;
import defpackage.oj00;
import defpackage.qf50;
import defpackage.re50;
import defpackage.tb00;
import defpackage.tje;
import defpackage.tt2;
import defpackage.tz60;
import defpackage.ub00;
import defpackage.uf50;
import defpackage.uj00;
import defpackage.ut;
import defpackage.x240;
import defpackage.yce;
import defpackage.yvf0;
import defpackage.zuj0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class o extends h55 {
    public final ut D;
    public final re50 E;
    public final v F;
    public final com.yandex.go.navigator.events.f G;
    public final yvf0 H;
    public final yvf0 I;
    public final com.yandex.go.navigator.address.a J;
    public final com.yandex.go.navigator.domain.b K;
    public final jpj0 L;
    public final tt2 M;
    public final yvf0 N;
    public final com.yandex.go.navigator.main_screen.experiement.e O;
    public final lg50 P;
    public final tz60 Q;
    public final h3y R;
    public final zuj0 S;
    public final yvf0 T;
    public final ah00 U;
    public final i3y V;

    public o(ut utVar, re50 re50Var, v vVar, com.yandex.go.navigator.events.f fVar, yvf0 yvf0Var, yvf0 yvf0Var2, com.yandex.go.navigator.address.a aVar, com.yandex.go.navigator.domain.b bVar, jpj0 jpj0Var, tt2 tt2Var, yvf0 yvf0Var3, com.yandex.go.navigator.main_screen.experiement.e eVar, lg50 lg50Var, tz60 tz60Var, h3y h3yVar, zuj0 zuj0Var, yvf0 yvf0Var4, ah00 ah00Var) {
        super(null);
        this.D = utVar;
        this.E = re50Var;
        this.F = vVar;
        this.G = fVar;
        this.H = yvf0Var;
        this.I = yvf0Var2;
        this.J = aVar;
        this.K = bVar;
        this.L = jpj0Var;
        this.M = tt2Var;
        this.N = yvf0Var3;
        this.O = eVar;
        this.P = lg50Var;
        this.Q = tz60Var;
        this.R = h3yVar;
        this.S = zuj0Var;
        this.T = yvf0Var4;
        this.U = ah00Var;
        this.V = kotlin.a.a(new tb00(this, 2));
    }

    public static final void P(o oVar) {
        oVar.B((m950) oVar.I.get(), new qf50(new uf50(null, ((avj0) oVar.S).h(kyh0.add_route_stop)), false), new ilm(oVar, 1), new n1j0(oVar.Q()));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        ((hcc0) ((gcc0) this.R.get())).a();
        this.F.b();
        Q().i();
        this.G.b(new iez(21), true);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        if (this.E.c() == null) {
            tje.N(o(), null, null, new MainScreenRootRouter$initFromAddress$1(this, null), 3);
        }
        tje.N(o(), null, null, new MainScreenRootRouter$onLaunch$1(this, null), 3);
    }

    public final uj00 Q() {
        return (uj00) this.V.getValue();
    }

    public final void R(boolean z) {
        int i = 0;
        int i2 = 1;
        char c = 1;
        char c2 = 1;
        if (!v(Q())) {
            A(Q(), new oj00(new tb00(this, i), new tb00(this, i2)), new flm(this, c2 == true ? 1 : 0));
        }
        v vVar = this.F;
        boolean a = vVar.a();
        com.yandex.go.navigator.events.f fVar = vVar.c;
        if (!a) {
            r0 r0Var = vVar.e;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
            fVar.b(new x240(21, vVar), true);
            vVar.b.e = true;
            fVar.b(new yce(c == true ? 1 : 0, 12), true);
            Navigation b = vVar.a.b();
            if (b != null) {
                b.resetRoutes();
                ihs0 ihs0Var = vVar.g;
                ihs0Var.b.a(new hhs0(ihs0Var));
                b.startGuidance(null);
                b.resume();
            }
        }
        B((m950) this.D.get(), new j700(z), new ub00(this), new n1j0(Q()));
    }

    public final void S(gfl0 gfl0Var) {
        this.F.b();
        Q().i();
        this.G.b(new iez(21), true);
        B((m950) this.T.get(), new dg50(true, (ifl0) gfl0Var), new m(this), new n1j0(Q()));
    }
}
