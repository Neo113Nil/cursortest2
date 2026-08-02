package defpackage;

import com.yandex.go.ads.prefetch.impl.AdvertPrefetchExperiment;
import com.yandex.go.experiments.api.ExperimentSource;

/* loaded from: classes9.dex */
public final class nop implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("superapp_ads_prefetch_clients_enabled", AdvertPrefetchExperiment.class, new jnp(14), ExperimentSource.LAUNCH, true);
    }
}
