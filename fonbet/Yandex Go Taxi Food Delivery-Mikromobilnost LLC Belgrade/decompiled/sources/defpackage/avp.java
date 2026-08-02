package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsCashIconExperiment;

/* loaded from: classes9.dex */
public final class avp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("payment_methods_cash_icon", PaymentMethodsCashIconExperiment.class, new stp(14), ExperimentSource.ZONE_INFO, true);
    }
}
