package defpackage;

import com.yandex.mobile.drive.sdk.full.DriveSummaryCardCollapseSource;
import com.yandex.mobile.drive.sdk.full.DriveSummaryCardExpansionSource;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.layers.presentation.walkroute.simple.b;

/* loaded from: classes12.dex */
public final class ahm extends ad5 implements m5m {
    public final tgm A;
    public final b B;
    public final wiq0 C;
    public final com.yandex.go.route.interactor.b D;
    public final kdm E;
    public final pcm F;
    public final r0 G;
    public fem H;
    public t0k I;
    public boolean J;
    public boolean K;
    public boolean L;
    public DriveSummaryCardExpansionSource M;
    public DriveSummaryCardCollapseSource N;
    public boolean O;
    public final b01 P;
    public final qnh x;
    public final String y;
    public final ah00 z;

    public ahm(qnh qnhVar, String str, ah00 ah00Var, tgm tgmVar, b bVar, wiq0 wiq0Var, com.yandex.go.route.interactor.b bVar2, kdm kdmVar, pcm pcmVar) {
        super(xgm.class);
        this.x = qnhVar;
        this.y = str;
        this.z = ah00Var;
        this.A = tgmVar;
        this.B = bVar;
        this.C = wiq0Var;
        this.D = bVar2;
        this.E = kdmVar;
        this.F = pcmVar;
        this.G = bvf0.c(Boolean.FALSE);
        this.K = true;
        this.P = new b01(5, this);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        tgm tgmVar = this.A;
        tgmVar.a.a0(tgmVar.b);
        ((gh00) this.z).u(this.P);
    }

    public final void Kg() {
        if (this.L || ((xgm) Dg()).isCollapsed()) {
            ((rrj) this.x.a).r(new qu(9));
        } else {
            this.N = DriveSummaryCardCollapseSource.BackButton;
            ((xgm) Dg()).collapse();
        }
    }

    public final void Lg(t0k t0kVar, DriveSummaryCardExpansionSource driveSummaryCardExpansionSource) {
        this.M = driveSummaryCardExpansionSource;
        if (jl40.l(t0kVar, cem.a)) {
            this.L = true;
            if (((xgm) Dg()).isCollapsed()) {
                ((xgm) Dg()).expand();
                return;
            }
            return;
        }
        if (t0kVar instanceof dem) {
            ((xgm) Dg()).expand();
        } else {
            w511.b();
        }
    }

    public final void Mg(t0k t0kVar) {
        this.I = t0kVar;
        if (jl40.l(t0kVar, cem.a)) {
            ((xgm) Dg()).k5();
        } else if (t0kVar instanceof dem) {
            ((xgm) Dg()).Ha((dem) t0kVar);
        } else {
            w511.b();
        }
    }
}
