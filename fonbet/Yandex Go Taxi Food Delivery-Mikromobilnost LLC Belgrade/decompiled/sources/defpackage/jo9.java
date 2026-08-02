package defpackage;

import android.content.Context;
import com.yandex.go.chargers.background.ChargersBackgroundModalView;
import ru.yandex.taxi.design.utils.a;

/* loaded from: classes12.dex */
public final class jo9 extends m230 {
    public final oep0 E;
    public final w030 F;
    public final vn9 G;
    public final awa H;
    public final yvf0 I;
    public final go9 J;
    public final bo9 K;

    public jo9(oep0 oep0Var, w030 w030Var, vn9 vn9Var, awa awaVar, yvf0 yvf0Var, go9 go9Var, bo9 bo9Var) {
        super(null);
        this.E = oep0Var;
        this.F = w030Var;
        this.G = vn9Var;
        this.H = awaVar;
        this.I = yvf0Var;
        this.J = go9Var;
        this.K = bo9Var;
    }

    @Override // defpackage.m230, defpackage.h55
    public final void G(Object obj) {
        super.G((zy11) obj);
        this.G.c();
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        io9 io9Var = new io9(this);
        ho9 ho9Var = this.J.a;
        fo9 fo9Var = new fo9((em9) ho9Var.a.get(), (iwa) ho9Var.b.get(), (po9) ho9Var.c.get(), (jra) ho9Var.d.get(), io9Var);
        v920 v920Var = this.K.a;
        return new ChargersBackgroundModalView((Context) ((xvf0) v920Var.a).get(), (pav) ((xvf0) v920Var.b).get(), (ip11) ((rxf) v920Var.c).get(), (a) ((qxf) v920Var.w).get(), (lma) ((pxf) v920Var.x).get(), (vn9) ((xvf0) v920Var.y).get(), fo9Var);
    }
}
