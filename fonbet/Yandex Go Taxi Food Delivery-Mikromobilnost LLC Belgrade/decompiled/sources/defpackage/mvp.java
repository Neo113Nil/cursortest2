package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.payments.shared.SharedPaymentExperiment;

/* loaded from: classes9.dex */
public final class mvp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("coop_account", SharedPaymentExperiment.class, new dsp(25), ExperimentSource.ZONE_INFO, false);
    }
}
