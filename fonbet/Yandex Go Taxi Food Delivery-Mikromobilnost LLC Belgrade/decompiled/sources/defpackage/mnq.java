package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.zone.repository.ZoneFallbackTtlExperiment;

/* loaded from: classes9.dex */
public final class mnq implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("launch_zone_info_fallback_cache_ttl", ZoneFallbackTtlExperiment.class, new wmq(4), ExperimentSource.LAUNCH, true);
    }
}
