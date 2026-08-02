package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.QualityQuestionExperiment;

/* loaded from: classes9.dex */
public final class dlq implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("quality_question", QualityQuestionExperiment.class, new xiq(5), ExperimentSource.TOTW, false);
    }
}
