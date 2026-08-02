package defpackage;

import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.runtime.Error;
import java.util.List;
import ru.yandex.taxi.map_common.map.o;

/* loaded from: classes6.dex */
public final class dv00 implements DrivingSession.DrivingRouteListener {
    public final /* synthetic */ o a;

    public dv00(o oVar) {
        this.a = oVar;
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSession.DrivingRouteListener
    public final void onDrivingRoutes(List list) {
        o.c(this.a, list);
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSession.DrivingRouteListener
    public final void onDrivingRoutesError(Error error) {
        this.a.e("Can't get driving routes: " + error.getClass());
    }
}
