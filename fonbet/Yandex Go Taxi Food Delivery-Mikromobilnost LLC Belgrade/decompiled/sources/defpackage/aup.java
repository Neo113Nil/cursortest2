package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.payments.shared.antifraud.experiments.CorpAntiFraudExperiment;

/* loaded from: classes9.dex */
public final class aup implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("b2b_anti_fraud", CorpAntiFraudExperiment.class, new stp(11), ExperimentSource.ZONE_INFO, false);
    }
}
