package defpackage;

import com.yandex.go.chargers.data.model.ChargersSupportedHostsExperiment;
import com.yandex.go.experiments.api.ExperimentSource;

/* loaded from: classes9.dex */
public final class iqp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("chargers_client_supported_hosts", ChargersSupportedHostsExperiment.class, new spp(6), ExperimentSource.PRODUCTS, false);
    }
}
