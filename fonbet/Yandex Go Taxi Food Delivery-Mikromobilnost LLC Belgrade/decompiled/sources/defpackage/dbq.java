package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.scooters.passes.super_pass.experiments.ScootersSuperPassGracePeriodExperiment;

/* loaded from: classes9.dex */
public final class dbq implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("scooters_client_super_pass_grace_period", ScootersSuperPassGracePeriodExperiment.class, new k8q(20), ExperimentSource.PRODUCTS, true);
    }
}
