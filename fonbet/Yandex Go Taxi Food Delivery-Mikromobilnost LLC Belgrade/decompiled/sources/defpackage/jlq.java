package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.SearchProgressExperiment;

/* loaded from: classes9.dex */
public final class jlq implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("search_progress", SearchProgressExperiment.class, new xiq(1), ExperimentSource.FINAL_SUGGEST, false);
    }
}
