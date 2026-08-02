package defpackage;

import com.yandex.go.delivery.rental_duration_selector.experiment.RentalDurationExperiment;
import com.yandex.go.experiments.api.ExperimentSource;

/* loaded from: classes9.dex */
public final class mzp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("delivery_rental_duration", RentalDurationExperiment.class, new ezp(3), ExperimentSource.ZONE_INFO, false);
    }
}
