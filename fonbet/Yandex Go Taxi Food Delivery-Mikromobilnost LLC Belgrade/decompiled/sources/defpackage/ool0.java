package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Polyline;

/* loaded from: classes14.dex */
public interface ool0 {
    default DrivingRoute a() {
        nol0 nol0Var = this instanceof nol0 ? (nol0) this : null;
        if (nol0Var != null) {
            return nol0Var.a;
        }
        return null;
    }

    default Polyline getGeometry() {
        if (this instanceof mol0) {
            return ((mol0) this).a;
        }
        if (this instanceof nol0) {
            return ((nol0) this).a.getGeometry();
        }
        w511.b();
        return null;
    }
}
