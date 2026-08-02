package defpackage;

import android.content.Context;
import com.yandex.go.multimodal_route.interactors.d;
import com.yandex.go.multimodal_route.ui.detailed_card.g;
import com.yandex.go.multimodal_route.ui.error.a;
import com.yandex.go.payments.data.p;
import com.yandex.go.route.interactor.b;
import ru.yandex.taxi.masstransit.detailedroute.ui.f;

/* loaded from: classes12.dex */
public final class ks40 extends pgd {
    public final Context F;
    public final d130 G;
    public final yvf0 H;
    public final t0w0 I;
    public final zv40 J;
    public final yvf0 K;
    public final yvf0 L;
    public final h3y M;
    public final z0a0 N;
    public final h3y O;
    public final h3y P;
    public final h3y Q;
    public final ra00 R;
    public final a3v S;
    public final zuj0 T;
    public final h3y U;
    public final wr40 V;
    public final es40 W;
    public final ft40 Z;
    public final xv10 a0;
    public cg30 b0;
    public bg30 c0;
    public final mu5 d0;

    public ks40(gt40 gt40Var, at40 at40Var, f fVar, Context context, d130 d130Var, y3g y3gVar, t0w0 t0w0Var, zv40 zv40Var, b4g b4gVar, b4g b4gVar2, h3y h3yVar, z0a0 z0a0Var, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, ra00 ra00Var, a3v a3vVar, zuj0 zuj0Var, h3y h3yVar5, wr40 wr40Var, es40 es40Var) {
        super(0);
        this.F = context;
        this.G = d130Var;
        this.H = y3gVar;
        this.I = t0w0Var;
        this.J = zv40Var;
        this.K = b4gVar;
        this.L = b4gVar2;
        this.M = h3yVar;
        this.N = z0a0Var;
        this.O = h3yVar2;
        this.P = h3yVar3;
        this.Q = h3yVar4;
        this.R = ra00Var;
        this.S = a3vVar;
        this.T = zuj0Var;
        this.U = h3yVar5;
        this.V = wr40Var;
        this.W = es40Var;
        tt ttVar = gt40Var.a;
        this.Z = new ft40((tt2) ((y3g) ttVar.a).get(), fVar, (uu40) ((y3g) ttVar.b).get(), (b) ((b4g) ttVar.c).get(), (p) ((b4g) ttVar.d).get(), (a2a0) ((b4g) ttVar.e).get(), (zuj0) ((b4g) ttVar.f).get(), (atd0) ((b4g) ttVar.g).get(), (ole0) ((y3g) ttVar.h).get(), (a) ((lq40) ttVar.i).get(), (d) ((y3g) ttVar.j).get(), (g) ((xvf0) ttVar.k).get(), (a3l0) ((b4g) ttVar.l).get(), (yxf0) ((b4g) ttVar.m).get(), (es40) ((s730) ttVar.n).get());
        lf2 lf2Var = at40Var.a;
        this.a0 = new xv10(fVar, (z711) lf2Var.a.a, (g) lf2Var.b.get(), (es40) lf2Var.c.get());
        this.d0 = new mu5(new x240(16, this));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        cg30 cg30Var = this.b0;
        if (cg30Var != null) {
            cg30Var.i();
        }
        this.b0 = null;
        this.c0 = null;
        this.S.a0(this);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.S.b8(this);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.d0;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
