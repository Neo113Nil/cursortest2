package defpackage;

import com.yandex.go.taxi.summary.shared.experiment.SummaryIntermediatePointsExperiment;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes14.dex */
public final class fov0 implements qqo {
    public final /* synthetic */ en11 a;
    public final wiq0 b;

    public fov0(wiq0 wiq0Var, rqo rqoVar) {
        this.a = ((jbh) rqoVar).b(new SummaryIntermediatePointsExperiment(0));
        this.b = wiq0Var;
    }

    @Override // defpackage.qqo
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.qqo
    public final Object b() {
        return (SummaryIntermediatePointsExperiment) this.a.b();
    }

    public final boolean isEnabled() {
        pex0 m = ((k) this.b).m();
        if (((SummaryIntermediatePointsExperiment) this.a.b()).b) {
            return (m != null ? m.u0 : null) == TariffOrderFlow.TAXI_FLOW;
        }
        return false;
    }
}
