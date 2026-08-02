package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.payments.paymentlist.experiments.GPayAllowedCardNetworksExperiment;

/* loaded from: classes9.dex */
public final class mup implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("gpay_allowed_card_networks", GPayAllowedCardNetworksExperiment.class, new dsp(26), ExperimentSource.FINAL_SUGGEST, false);
    }
}
