package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.scooters.passes.data.model.ScootersPassesBduiExperiment;

/* loaded from: classes4.dex */
public final class gaq implements v7p {
    public static gaq a() {
        return faq.a;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("scooters_client_passes_bdui", ScootersPassesBduiExperiment.class, new thp(18), ExperimentSource.PRODUCTS, true);
    }
}
