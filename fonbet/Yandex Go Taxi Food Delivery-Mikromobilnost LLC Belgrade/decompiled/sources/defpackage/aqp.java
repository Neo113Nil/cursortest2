package defpackage;

import com.yandex.go.call_order_fallback.experiments.CallOrderFallbackExperiment;
import com.yandex.go.experiments.api.ExperimentSource;

/* loaded from: classes9.dex */
public final class aqp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("show_call_order_in_fallback", CallOrderFallbackExperiment.class, new spp(3), ExperimentSource.ZONE_INFO, true);
    }
}
