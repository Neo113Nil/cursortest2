package defpackage;

import com.yandex.go.route.experiment.RouteTariffVehicleTypeExperiment;
import ru.yandex.taxi.object.RouteVehicleType;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final class del0 {
    public final qqo a;

    public del0(rqo rqoVar) {
        RouteTariffVehicleTypeExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).c(RouteTariffVehicleTypeExperiment.e);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public final RouteVehicleType a(pex0 pex0Var) {
        String str = (String) ((RouteTariffVehicleTypeExperiment) this.a.b()).c.get(pex0Var.b);
        if (str != null) {
            switch (str.hashCode()) {
                case 3357597:
                    if (str.equals("moto")) {
                        return RouteVehicleType.MOTO;
                    }
                    break;
                case 3552798:
                    if (str.equals(TariffOrderFlow.ORDER_FLOW_TAXI_KEY)) {
                        return RouteVehicleType.TAXI;
                    }
                    break;
                case 110640223:
                    if (str.equals("truck")) {
                        return RouteVehicleType.TRUCK;
                    }
                    break;
                case 1544803905:
                    if (str.equals("default")) {
                        return RouteVehicleType.DEFAULT;
                    }
                    break;
            }
        }
        return RouteVehicleType.TAXI;
    }
}
