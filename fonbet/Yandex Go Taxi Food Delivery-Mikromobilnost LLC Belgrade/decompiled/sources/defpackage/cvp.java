package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsCustomSubtitlesExperiment;

/* loaded from: classes9.dex */
public final class cvp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("payment_method_subtitle_replacement", PaymentMethodsCustomSubtitlesExperiment.class, new stp(3), ExperimentSource.ZONE_INFO, true);
    }
}
