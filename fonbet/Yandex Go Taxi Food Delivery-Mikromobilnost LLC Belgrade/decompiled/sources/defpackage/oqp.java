package defpackage;

import com.yandex.go.chargers.offer.experiments.ChargersMultiOfferExperiment;
import com.yandex.go.experiments.api.ExperimentSource;

/* loaded from: classes4.dex */
public final class oqp implements v7p {
    public static oqp a() {
        return nqp.a;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("chargers_client_offer_multi", ChargersMultiOfferExperiment.class, new thp(15), ExperimentSource.PRODUCTS, false);
    }
}
