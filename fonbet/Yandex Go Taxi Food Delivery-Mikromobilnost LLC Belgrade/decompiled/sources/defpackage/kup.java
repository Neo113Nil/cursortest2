package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.payments.paymentlist.experiments.ForcedPaymentMethodChangeExperiment;

/* loaded from: classes9.dex */
public final class kup implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("forced_payment_method_change", ForcedPaymentMethodChangeExperiment.class, new stp(10), ExperimentSource.ZONE_INFO, true);
    }
}
