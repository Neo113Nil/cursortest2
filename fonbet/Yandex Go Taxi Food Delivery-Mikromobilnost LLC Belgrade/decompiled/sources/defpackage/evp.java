package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.payments.promo.PaymentMethodsPromoBannerExperiment;

/* loaded from: classes9.dex */
public final class evp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("fintech_paymentmethods_banner", PaymentMethodsPromoBannerExperiment.class, new dsp(27), ExperimentSource.ZONE_INFO, false);
    }
}
