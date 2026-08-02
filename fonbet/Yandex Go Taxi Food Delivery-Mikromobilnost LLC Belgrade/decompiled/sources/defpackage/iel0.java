package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.runtime.Error;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class iel0 implements DrivingSession.DrivingRouteListener {
    public final /* synthetic */ jel0 a;

    public iel0(jel0 jel0Var) {
        this.a = jel0Var;
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSession.DrivingRouteListener
    public final void onDrivingRoutes(List list) {
        boolean isEmpty = list.isEmpty();
        jel0 jel0Var = this.a;
        r0 r0Var = jel0Var.c;
        if (isEmpty) {
            jel0Var.a();
            ral0 ral0Var = new ral0("Request returned success but there is no route");
            r0Var.getClass();
            r0Var.m(null, ral0Var);
            return;
        }
        jel0Var.a();
        DrivingRoute drivingRoute = (DrivingRoute) list.get(0);
        int i = jel0Var.h;
        jel0Var.h = i + 1;
        sal0 sal0Var = new sal0(drivingRoute, i, drivingRoute.getPosition().getSegmentIndex(), drivingRoute.getPosition().getSegmentPosition());
        r0Var.getClass();
        r0Var.m(null, sal0Var);
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSession.DrivingRouteListener
    public final void onDrivingRoutesError(Error error) {
        jel0 jel0Var = this.a;
        jel0Var.a();
        r0 r0Var = jel0Var.c;
        ral0 ral0Var = new ral0("Route build error");
        r0Var.getClass();
        r0Var.m(null, ral0Var);
    }
}
