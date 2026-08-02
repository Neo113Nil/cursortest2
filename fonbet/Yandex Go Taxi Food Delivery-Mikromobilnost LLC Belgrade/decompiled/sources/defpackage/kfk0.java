package defpackage;

import com.yandex.go.taxi.order.experiments.RideCardComposeExperiment;
import com.yandex.go.taxi.order.experiments.d;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import java.util.Map;

/* loaded from: classes14.dex */
public final class kfk0 {
    public final boolean a;
    public final Map b;
    public final boolean c;

    static {
        d dVar = RideCardComposeExperiment.Companion;
    }

    public kfk0(o2y0 o2y0Var) {
        OrderStatusInfo V = o2y0Var.b().V();
        RideCardComposeExperiment.Companion.getClass();
        qn11 qn11Var = RideCardComposeExperiment.e;
        qn11 b = V.b(RideCardComposeExperiment.class);
        RideCardComposeExperiment rideCardComposeExperiment = (RideCardComposeExperiment) (b != null ? b : qn11Var);
        this.a = rideCardComposeExperiment.b;
        Map map = rideCardComposeExperiment.c;
        this.b = map;
        this.c = map.isEmpty();
    }
}
