package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.payments.paymentlist.experiments.ExtraTipsPaymentMethodsExperiment;

/* loaded from: classes9.dex */
public final class eup implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("extra_tips_payment_methods", ExtraTipsPaymentMethodsExperiment.class, new stp(2), ExperimentSource.ZONE_INFO, false);
    }
}
