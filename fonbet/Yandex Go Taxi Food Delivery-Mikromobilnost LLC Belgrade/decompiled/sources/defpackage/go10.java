package defpackage;

import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.mapkit.maps.core.geometry.Point;
import kotlin.a;

/* loaded from: classes13.dex */
public final class go10 implements l2c0 {
    public final i3y a = a.a(new w410(20));
    public final i3y b = a.a(new xyz(21, this));

    public final double a() {
        return ((Number) this.b.getValue()).doubleValue();
    }

    public final Point b(h041 h041Var) {
        com.yandex.mapkit.geometry.Point xyToWorld = ((Projection) this.a.getValue()).xyToWorld(new XYPoint(a() * h041Var.a, a() * h041Var.b), 0);
        return Point.INSTANCE.invoke(xyToWorld.getLatitude(), xyToWorld.getLongitude());
    }
}
