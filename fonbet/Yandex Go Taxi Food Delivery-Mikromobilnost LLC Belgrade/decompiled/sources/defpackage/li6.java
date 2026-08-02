package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.BoundingBoxHelper;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes6.dex */
public final class li6 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();

    public final void a(Point point) {
        if (k.t(point.getLatitude(), point.getLongitude())) {
            this.a.add(point);
        }
    }

    public final void b(Polyline polyline) {
        if (!el00.a) {
            ny61.r("MapKit must be initialized before building a BoundingBox");
            return;
        }
        BoundingBox bounds = BoundingBoxHelper.getBounds(polyline);
        Point southWest = bounds.getSouthWest();
        if (k.t(southWest.getLatitude(), southWest.getLongitude())) {
            Point northEast = bounds.getNorthEast();
            if (k.t(northEast.getLatitude(), northEast.getLongitude())) {
                this.b.add(bounds);
            }
        }
    }

    public final void c(List list) {
        for (Object obj : list) {
            Point point = (Point) obj;
            if (k.t(point.getLatitude(), point.getLongitude())) {
                this.a.add(obj);
            }
        }
    }
}
