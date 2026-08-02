package defpackage;

import android.net.Uri;
import com.yandex.go.coroutines.b;
import com.yandex.go.navigator.incidents.experiment.IncidentsAvailabilityExperiment;
import com.yandex.go.navigator.incidents.experiment.IncidentsAvailabilityExperimentRepository$special$$inlined$start$1;
import com.yandex.go.navigator.incidents.experiment.a;
import java.util.List;

/* loaded from: classes12.dex */
public final class ipv {
    public final qqo a;
    public final tpr b;

    public ipv(rqo rqoVar) {
        a aVar = IncidentsAvailabilityExperiment.Companion;
        aVar.getClass();
        IncidentsAvailabilityExperiment incidentsAvailabilityExperiment = IncidentsAvailabilityExperiment.f;
        qqo c = ((jbh) rqoVar).c(incidentsAvailabilityExperiment);
        this.a = c;
        tpr a = c.a();
        aVar.getClass();
        this.b = b.d(a, new IncidentsAvailabilityExperimentRepository$special$$inlined$start$1(incidentsAvailabilityExperiment, null));
    }

    public static hpv a(IncidentsAvailabilityExperiment incidentsAvailabilityExperiment) {
        List M = kotlin.collections.a.M(incidentsAvailabilityExperiment.c);
        if (M.isEmpty()) {
            M = null;
        }
        if (M == null) {
            IncidentsAvailabilityExperiment.Companion.getClass();
            M = IncidentsAvailabilityExperiment.g;
        }
        boolean z = incidentsAvailabilityExperiment.b;
        String str = incidentsAvailabilityExperiment.d;
        return new hpv(z, M, str != null ? Uri.parse(str) : null);
    }
}
