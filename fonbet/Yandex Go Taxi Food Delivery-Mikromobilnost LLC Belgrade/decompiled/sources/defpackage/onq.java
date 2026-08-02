package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.net.taxi.dto.response.typed_experiments.MulticlassTariffPositionExperiment;

/* loaded from: classes9.dex */
public final class onq implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("summary_multiclass_tariff_position", MulticlassTariffPositionExperiment.class, new wmq(5), ExperimentSource.ROUTESTATS, false);
    }
}
