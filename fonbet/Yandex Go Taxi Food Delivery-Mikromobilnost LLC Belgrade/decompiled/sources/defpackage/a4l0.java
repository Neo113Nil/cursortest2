package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Polyline;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes6.dex */
public class a4l0 {
    public final DrivingRoute a;
    public final Polyline b;
    public final List c;
    public final q6l0 d;

    public a4l0(zzs zzsVar) {
        this(k.i(Collections.singletonList(a.F(zzsVar))), 13);
    }

    public final Polyline a() {
        q6l0 q6l0Var = this.d;
        if (q6l0Var != null) {
            return (Polyline) q6l0Var.j.getValue();
        }
        DrivingRoute drivingRoute = this.a;
        if (drivingRoute != null) {
            return drivingRoute.getGeometry();
        }
        Polyline polyline = this.b;
        return polyline != null ? polyline : k.g();
    }

    public a4l0(DrivingRoute drivingRoute, Polyline polyline, ArrayList arrayList, q6l0 q6l0Var) {
        this.a = drivingRoute;
        this.b = polyline;
        this.c = arrayList;
        this.d = q6l0Var;
    }

    public /* synthetic */ a4l0(Polyline polyline, int i) {
        this(null, (i & 2) != 0 ? null : polyline, null, null);
    }

    public a4l0() {
        this(null, 15);
    }
}
