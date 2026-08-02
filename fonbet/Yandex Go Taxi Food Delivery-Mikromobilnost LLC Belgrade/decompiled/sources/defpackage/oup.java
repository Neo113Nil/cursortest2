package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.payments.paymentlist.experiments.MaasPaymentOptionExperiment;

/* loaded from: classes9.dex */
public final class oup implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("maas_payment_method", MaasPaymentOptionExperiment.class, new stp(15), ExperimentSource.LAUNCH, false);
    }
}
