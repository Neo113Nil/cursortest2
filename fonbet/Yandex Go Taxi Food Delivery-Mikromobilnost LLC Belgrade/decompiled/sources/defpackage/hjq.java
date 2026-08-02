package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.taxi.order.experiments.OnlyV2RideCardExperiment;

/* loaded from: classes9.dex */
public final class hjq implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("use_bdui_only_ride_card", OnlyV2RideCardExperiment.class, new iiq(12), ExperimentSource.LAUNCH, true);
    }
}
