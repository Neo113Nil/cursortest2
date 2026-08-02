package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.PolylinePosition;
import java.util.List;

/* loaded from: classes14.dex */
public final class h8l0 {
    public final ool0 a;
    public final PolylinePosition b;

    public h8l0(ool0 ool0Var, PolylinePosition polylinePosition) {
        this.a = ool0Var;
        this.b = polylinePosition;
    }

    public final nzr a() {
        List<Point> points = this.a.getGeometry().getPoints();
        PolylinePosition polylinePosition = this.b;
        return new nzr(points, (polylinePosition == null || points.isEmpty()) ? 0 : polylinePosition.getSegmentIndex());
    }
}
