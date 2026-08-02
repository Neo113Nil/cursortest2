package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment;

/* loaded from: classes9.dex */
public final class nyp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("select_delivery_pvz", DeliveryPvzExperiment.class, new rwp(14), ExperimentSource.ZONE_INFO, false);
    }
}
