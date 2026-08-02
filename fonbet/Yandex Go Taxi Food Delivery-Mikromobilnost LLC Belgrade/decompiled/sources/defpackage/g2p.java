package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.superapp.impl.presenter_delegate.a;
import com.yandex.go.superapp.impl.presenter_delegate.d;
import com.yandex.go.superapp.impl.presenter_delegate.e;
import com.yandex.go.superapp.model.Action;
import ru.yandex.taxi.eatskit.c;

/* loaded from: classes12.dex */
public final class g2p extends qc5 {
    public final c A;
    public final y3p B;
    public final a C;
    public final e1p D;
    public final g1p E;
    public final com.yandex.go.superapp.impl.presenter_delegate.c F;
    public final d G;
    public final e H;
    public final yrv0 I;
    public final h1p J;
    public final e2x0 K;
    public final rvq0 L;
    public final com.yandex.go.external_service.deeplink.a M;
    public final a850 N;
    public final bdn O;
    public Long P;

    public g2p(Lifecycle lifecycle, c cVar, y3p y3pVar, a aVar, e1p e1pVar, g1p g1pVar, com.yandex.go.superapp.impl.presenter_delegate.c cVar2, d dVar, e eVar, yrv0 yrv0Var, h1p h1pVar, e2x0 e2x0Var, rvq0 rvq0Var, com.yandex.go.external_service.deeplink.a aVar2, a850 a850Var, bdn bdnVar) {
        super(r2p.class, lifecycle);
        this.A = cVar;
        this.B = y3pVar;
        this.C = aVar;
        this.D = e1pVar;
        this.E = g1pVar;
        this.F = cVar2;
        this.G = dVar;
        this.H = eVar;
        this.I = yrv0Var;
        this.J = h1pVar;
        this.K = e2x0Var;
        this.L = rvq0Var;
        this.M = aVar2;
        this.N = a850Var;
        this.O = bdnVar;
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        e1p e1pVar = this.D;
        yrv0 yrv0Var = e1pVar.a;
        h1p h1pVar = e1pVar.c;
        yrv0Var.c("Superapp.Showcase.Dismissed", h1pVar, null);
        yrv0Var.a(h1pVar).a = false;
        this.A.t(false);
        y3p y3pVar = this.B;
        Action action = y3pVar.b.a;
        if (action == Action.SHOW_RELATIVE_PATH || action == Action.FORCE_RELATIVE_PATH) {
            y3pVar.b = o3p.f;
        }
        this.N.d(this.J.getValue());
        pzt0 pzt0Var = this.E.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.K.b(qoi0.a(g2p.class));
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        this.G.b(Kg());
        this.F.a(Kg());
        tse Kg = Kg();
        com.yandex.go.external_service.deeplink.a aVar = this.M;
        ru.yandex.taxi.deeplinks.a.c(Kg, aVar.d, new db0(2, aVar));
    }
}
