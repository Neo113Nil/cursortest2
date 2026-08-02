package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.PolylinePosition;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes6.dex */
public final class f6c {
    public static ix4 a(Point point, List list, PolylinePosition polylinePosition, int i, int i2) {
        Point point2;
        double segmentPosition = polylinePosition.getSegmentPosition() + polylinePosition.getSegmentIndex();
        double d = 0.0d;
        e6c e6cVar = new e6c(new PolylinePosition(0, 0.0d), Double.MAX_VALUE, Double.MAX_VALUE);
        int i3 = i;
        if (i3 <= i2) {
            while (true) {
                Point point3 = (Point) a.S(i3, list);
                Pair pair = null;
                if (point3 != null && (point2 = (Point) a.S(i3 + 1, list)) != null) {
                    pair = new Pair(point3, point2);
                }
                if (pair != null) {
                    Point point4 = (Point) pair.c();
                    Point point5 = (Point) pair.f();
                    double longitude = point4.getLongitude();
                    double latitude = point4.getLatitude();
                    double longitude2 = point5.getLongitude() - longitude;
                    double latitude2 = point5.getLatitude() - latitude;
                    double d2 = (latitude2 * latitude2) + (longitude2 * longitude2);
                    double longitude3 = point.getLongitude();
                    double latitude3 = point.getLatitude();
                    if (d2 != d) {
                        d = y6i0.b(vfc.a(latitude3 - latitude, latitude2, (longitude3 - longitude) * longitude2, d2), 0.0d, 1.0d);
                    }
                    double longitude4 = point.getLongitude() - ((longitude2 * d) + longitude);
                    double latitude4 = point.getLatitude() - ((latitude2 * d) + latitude);
                    double d3 = (latitude4 * latitude4) + (longitude4 * longitude4);
                    PolylinePosition polylinePosition2 = new PolylinePosition(i3, d);
                    double d4 = e6cVar.b;
                    if (d3 < d4 - 1.0E-9d) {
                        e6cVar = new e6c(polylinePosition2, d3, Math.abs((polylinePosition2.getSegmentPosition() + polylinePosition2.getSegmentIndex()) - segmentPosition));
                    } else if (d3 < d4 + 1.0E-9d) {
                        double abs = Math.abs((polylinePosition2.getSegmentPosition() + polylinePosition2.getSegmentIndex()) - segmentPosition);
                        if (abs < e6cVar.c) {
                            e6cVar = new e6c(polylinePosition2, e6cVar.b, abs);
                        }
                    }
                }
                if (i3 == i2) {
                    break;
                }
                i3++;
                d = 0.0d;
            }
        }
        return new ix4(e6cVar.a, e6cVar.b);
    }
}
