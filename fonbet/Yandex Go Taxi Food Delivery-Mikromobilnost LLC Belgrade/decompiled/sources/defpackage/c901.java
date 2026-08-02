package defpackage;

import com.yandex.mapkit.directions.traffic_lights.Signal;
import com.yandex.mapkit.navigation.automotive.TrafficLightsController;
import com.yandex.mapkit.navigation.automotive.TrafficLightsControllerListener;
import com.yandex.mapkit.navigation.automotive.UpcomingTrafficLightWithSignal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public final class c901 implements TrafficLightsControllerListener {
    public final /* synthetic */ g901 a;
    public final /* synthetic */ d901 b;
    public final /* synthetic */ g901 c;

    public c901(g901 g901Var, d901 d901Var, g901 g901Var2) {
        this.a = g901Var;
        this.b = d901Var;
        this.c = g901Var2;
    }

    @Override // com.yandex.mapkit.navigation.automotive.TrafficLightsControllerListener
    public final void onTrafficLightsChanged() {
        this.a.invoke();
    }

    @Override // com.yandex.mapkit.navigation.automotive.TrafficLightsControllerListener
    public final void onTrafficLightsCountdownUpdated() {
        List<UpcomingTrafficLightWithSignal> trafficLightsWithSignal;
        TrafficLightsController trafficLightsController = this.b.b;
        if (trafficLightsController == null || (trafficLightsWithSignal = trafficLightsController.getTrafficLightsWithSignal()) == null) {
            return;
        }
        List<UpcomingTrafficLightWithSignal> list = trafficLightsWithSignal;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((UpcomingTrafficLightWithSignal) it.next()).getSignal() != Signal.GREEN) {
                this.c.invoke();
                return;
            }
        }
    }
}
