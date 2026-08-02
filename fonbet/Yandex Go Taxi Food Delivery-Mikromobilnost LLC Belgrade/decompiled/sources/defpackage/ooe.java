package defpackage;

import com.yandex.go.copter.experiment.CopterInfoExperiment;
import com.yandex.go.copter.experiment.CopterOrderFlowExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto;
import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes14.dex */
public final class ooe implements noe {
    public final roe a;

    public ooe(roe roeVar) {
        this.a = roeVar;
    }

    public final boolean a(TaxiOrder taxiOrder) {
        if (taxiOrder.b.P != TariffOrderFlow.COPTER_FLOW || taxiOrder.h.getB() != DriveState.SCHEDULING) {
            return false;
        }
        MapRouteParametersDto o = taxiOrder.o();
        return (o != null ? o.a : null) instanceof MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto;
    }

    public final boolean b(pex0 pex0Var) {
        return (pex0Var != null ? pex0Var.u0 : null) == TariffOrderFlow.COPTER_FLOW;
    }

    public final boolean c(TaxiOrder taxiOrder) {
        boolean z;
        String x = taxiOrder.x();
        List list = this.a.a().e;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (jl40.l(((CopterOrderFlowExperiment.RoutePointSettings) it.next()).a, x)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return ((CopterInfoExperiment) taxiOrder.V().b(CopterInfoExperiment.class)) != null || z;
    }
}
