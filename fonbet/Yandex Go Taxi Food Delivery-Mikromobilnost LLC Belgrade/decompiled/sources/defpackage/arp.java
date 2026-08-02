package defpackage;

import com.yandex.go.clarify_address.ClarifiedAddressCacheTimeExperiment;
import com.yandex.go.experiments.api.ExperimentSource;

/* loaded from: classes9.dex */
public final class arp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("clarified_address_cache_time", ClarifiedAddressCacheTimeExperiment.class, new spp(15), ExperimentSource.FINAL_SUGGEST, true);
    }
}
