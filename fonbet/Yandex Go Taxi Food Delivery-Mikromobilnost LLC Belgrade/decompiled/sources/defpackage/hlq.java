package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.SearchOrderDetailsExperiment;

/* loaded from: classes9.dex */
public final class hlq implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("show_order_details_on_search", SearchOrderDetailsExperiment.class, new xiq(3), ExperimentSource.FINAL_SUGGEST, true);
    }
}
