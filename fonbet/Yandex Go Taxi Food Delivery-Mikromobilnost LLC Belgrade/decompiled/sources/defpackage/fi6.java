package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.BoundingBoxHelper;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes6.dex */
public final class fi6 {
    public final ArrayList a = new ArrayList();
    public BoundingBox b;

    public static boolean j(Point point) {
        if (Math.abs(point.getLatitude()) > Double.MAX_VALUE || Math.abs(point.getLongitude()) > Double.MAX_VALUE) {
            return false;
        }
        double latitude = point.getLatitude();
        if (-90.0d > latitude || latitude > 90.0d) {
            return false;
        }
        double longitude = point.getLongitude();
        return -180.0d <= longitude && longitude <= 180.0d;
    }

    public static Point k(Point point, Point point2) {
        return new Point(point2.getLatitude() - (point.getLatitude() - point2.getLatitude()), point2.getLongitude() - (point.getLongitude() - point2.getLongitude()));
    }

    public final void a(zzs zzsVar) {
        c(a.F(zzsVar));
    }

    public final void b(BoundingBox boundingBox) {
        if (j(boundingBox.getSouthWest()) && j(boundingBox.getNorthEast())) {
            BoundingBox boundingBox2 = this.b;
            if (boundingBox2 != null) {
                if (!el00.a) {
                    ny61.r("MapKit should be initialized before calling getBounds");
                    return;
                } else {
                    BoundingBox bounds = BoundingBoxHelper.getBounds(boundingBox2, boundingBox);
                    if (bounds != null) {
                        boundingBox = bounds;
                    }
                }
            }
            this.b = boundingBox;
        }
    }

    public final void c(Point point) {
        if (j(point)) {
            this.a.add(point);
        }
    }

    public final void d(Polyline polyline) {
        if (el00.a) {
            b(BoundingBoxHelper.getBounds(polyline));
        } else {
            ny61.r("MapKit should be initialized before calling getBounds");
        }
    }

    public final void e(List list) {
        for (Object obj : list) {
            if (j((Point) obj)) {
                this.a.add(obj);
            }
        }
    }

    public final void f(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a.F((zzs) it.next()));
        }
        e(arrayList);
    }

    public final BoundingBox g() {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            b(a.e(0, arrayList));
            arrayList.clear();
        }
        BoundingBox boundingBox = this.b;
        if (boundingBox != null) {
            return boundingBox;
        }
        ny61.r("Nothing was added as bounding box");
        return null;
    }

    public final BoundingBox h(Point point) {
        if (this.a.isEmpty() && this.b == null) {
            if (el00.a) {
                return BoundingBoxHelper.getBounds(point);
            }
            ny61.r("MapKit should be initialized before calling getBounds");
            return null;
        }
        BoundingBox g = g();
        Point southWest = g.getSouthWest();
        Point k = k(southWest, point);
        Point northEast = g.getNorthEast();
        return a.e(0, scc.g(southWest, k, northEast, k(northEast, point)));
    }

    public final boolean i() {
        return this.b == null && this.a.isEmpty();
    }
}
