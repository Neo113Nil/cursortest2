package defpackage;

import com.yandex.go.chargers.data.e;
import com.yandex.go.chargers.plus.a;
import com.yandex.go.chargers.station.api.ChargersStationOpenReason;
import com.yandex.go.chargers.surge.domain.ChargersScreenWithSurge;
import ru.yandex.taxi.layers.presentation.walkroute.simple.b;

/* loaded from: classes12.dex */
public final class csa extends h55 {
    public final yvf0 D;
    public final iwa E;
    public final vn9 F;
    public final a G;
    public final yvf0 H;
    public final yvf0 I;
    public final yvf0 J;
    public final e K;
    public final h3y L;

    public csa(av4 av4Var, iwa iwaVar, vn9 vn9Var, a aVar, rx4 rx4Var, xvf0 xvf0Var, qx4 qx4Var, e eVar, h3y h3yVar) {
        super(null);
        this.D = av4Var;
        this.E = iwaVar;
        this.F = vn9Var;
        this.G = aVar;
        this.H = rx4Var;
        this.I = xvf0Var;
        this.J = qx4Var;
        this.K = eVar;
        this.L = h3yVar;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        this.G.a(o());
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        a aVar = this.G;
        aVar.g.b();
        aVar.i = null;
        aVar.h = null;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        b bVar = (b) this.L.get();
        g641 g641Var = bVar.d;
        if (g641Var != null) {
            g641Var.Lg();
        }
        bVar.e = null;
        this.F.a();
        iwa iwaVar = this.E;
        iwaVar.a.l(null);
        iwaVar.a(null);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        hr9 hr9Var = (hr9) obj;
        b bVar = (b) this.L.get();
        vm7 vm7Var = new vm7(19);
        bVar.e = vm7Var;
        g641 g641Var = bVar.d;
        if (g641Var != null) {
            g641Var.Ig(vm7Var);
        }
        this.F.d();
        this.E.a(ChargersScreenWithSurge.STATION);
        P(hr9Var, hr9Var.c);
    }

    public final void P(hr9 hr9Var, ChargersStationOpenReason chargersStationOpenReason) {
        D((m950) this.J.get(), new gr9(hr9Var.a, chargersStationOpenReason, hr9Var.b), new bsa(this, hr9Var));
    }
}
