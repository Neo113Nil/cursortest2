package defpackage;

import com.yandex.go.chargers.offer.experiments.ChargersDiscountsEntryPointExperiment;
import com.yandex.go.experiments.api.ExperimentSource;

/* loaded from: classes9.dex */
public final class mqp implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("chargers_discounts_and_promocodes", ChargersDiscountsEntryPointExperiment.class, new spp(10), ExperimentSource.PRODUCTS, false);
    }
}
