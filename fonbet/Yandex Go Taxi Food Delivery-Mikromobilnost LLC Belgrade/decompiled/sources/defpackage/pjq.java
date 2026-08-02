package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.taxi.order.recalculation.experiment.PriceRecalculationExperiment;

/* loaded from: classes9.dex */
public final class pjq implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("new_price_recalculation", PriceRecalculationExperiment.class, new iiq(27), ExperimentSource.LAUNCH, false);
    }
}
