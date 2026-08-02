package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.runtime.Error;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class grt implements DrivingSession.DrivingRouteListener {
    public final si3 a;

    public grt(si3 si3Var) {
        this.a = si3Var;
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSession.DrivingRouteListener
    public final void onDrivingRoutes(List list) {
        List<DrivingRoute> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (DrivingRoute drivingRoute : list2) {
            arrayList.add(new a0l0(drivingRoute.getGeometry(), Long.valueOf((long) drivingRoute.getMetadata().getWeight().getTimeWithTraffic().getValue())));
        }
        this.a.invoke(arrayList);
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSession.DrivingRouteListener
    public final void onDrivingRoutesError(Error error) {
        this.a.invoke(EmptyList.a);
    }
}
