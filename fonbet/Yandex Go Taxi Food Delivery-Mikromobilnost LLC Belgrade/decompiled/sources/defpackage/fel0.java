package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import kotlin.Pair;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes6.dex */
public final class fel0 {
    public static List a(j001 j001Var, j001 j001Var2, List list) {
        char c;
        double d;
        double k;
        PolylinePosition polylinePosition;
        Double c2;
        PolylinePosition polylinePosition2;
        i001 i001Var;
        List list2 = list;
        PolylinePosition d2 = d(cwa1.d(j001Var.getCoordinates()), list2);
        PolylinePosition d3 = d(cwa1.d(j001Var2.getCoordinates()), list2);
        boolean z = true;
        if (d2 == null || d3 == null) {
            return scc.g(j001Var, j001Var2);
        }
        j001 e = e(list2, d2, j001Var);
        if (e == null) {
            return scc.g(j001Var, j001Var2);
        }
        j001 e2 = e(list2, d3, j001Var2);
        if (e2 == null) {
            return scc.g(j001Var, j001Var2);
        }
        if (d3.getSegmentIndex() < d2.getSegmentIndex() || (d3.getSegmentIndex() == d2.getSegmentIndex() && d3.getSegmentPosition() < d2.getSegmentPosition())) {
            return Collections.singletonList(e);
        }
        Pair pair = d2.getSegmentIndex() != d3.getSegmentIndex() ? d2.getSegmentIndex() < d3.getSegmentIndex() ? new Pair(d2, d3) : new Pair(d3, d2) : d2.getSegmentPosition() <= d3.getSegmentPosition() ? new Pair(d2, d3) : new Pair(d3, d2);
        PolylinePosition polylinePosition3 = (PolylinePosition) pair.getFirst();
        PolylinePosition polylinePosition4 = (PolylinePosition) pair.getSecond();
        double d4 = 0.0d;
        if (polylinePosition3.getSegmentIndex() == polylinePosition4.getSegmentIndex()) {
            Polyline polyline = a.b;
            c = 0;
            k = (polylinePosition4.getSegmentPosition() - polylinePosition3.getSegmentPosition()) * a.k((Point) list2.get(polylinePosition3.getSegmentIndex()), (Point) list2.get(polylinePosition3.getSegmentIndex() + 1));
            d = 1.0d;
        } else {
            double segmentPosition = 1.0d - polylinePosition3.getSegmentPosition();
            Polyline polyline2 = a.b;
            c = 0;
            d = 1.0d;
            double k2 = (a.k((Point) list2.get(polylinePosition3.getSegmentIndex()), (Point) list2.get(polylinePosition3.getSegmentIndex() + 1)) * segmentPosition) + 0.0d;
            int segmentIndex = polylinePosition3.getSegmentIndex() + 1;
            int segmentIndex2 = polylinePosition4.getSegmentIndex();
            while (segmentIndex < segmentIndex2) {
                Polyline polyline3 = a.b;
                Point point = (Point) list2.get(segmentIndex);
                segmentIndex++;
                k2 += a.k(point, (Point) list2.get(segmentIndex));
            }
            double segmentPosition2 = polylinePosition4.getSegmentPosition();
            Polyline polyline4 = a.b;
            k = (a.k((Point) list2.get(polylinePosition4.getSegmentIndex()), (Point) list2.get(polylinePosition4.getSegmentIndex() + 1)) * segmentPosition2) + k2;
        }
        long time = j001Var2.getTimestamp().getTime() - j001Var.getTimestamp().getTime();
        if (k <= 0.0d || time <= 0) {
            j001[] j001VarArr = new j001[2];
            j001VarArr[c] = e;
            j001VarArr[1] = e2;
            return scc.g(j001VarArr);
        }
        int min = Math.min((int) ((40.0d * k) + 5.0d), 5);
        ArrayList arrayList = new ArrayList();
        arrayList.add(e);
        int i = min + 1;
        double d5 = k / i;
        long j = time / i;
        if (1 <= min) {
            int i2 = 1;
            while (true) {
                int segmentIndex3 = d2.getSegmentIndex();
                double segmentPosition3 = d2.getSegmentPosition();
                Polyline polyline5 = a.b;
                boolean z2 = z;
                double d6 = d4;
                int i3 = segmentIndex3 + 1;
                double k3 = a.k((Point) list2.get(segmentIndex3), (Point) list2.get(i3));
                double segmentPosition4 = (d - d2.getSegmentPosition()) * k3;
                if (d5 > segmentPosition4) {
                    double d7 = d5 - segmentPosition4;
                    while (true) {
                        if (i3 >= list2.size() - 1) {
                            polylinePosition = null;
                            break;
                        }
                        Polyline polyline6 = a.b;
                        int i4 = i3 + 1;
                        double k4 = a.k((Point) list2.get(i3), (Point) list2.get(i4));
                        if (d7 <= k4) {
                            polylinePosition = new PolylinePosition(i3, k4 > d6 ? d7 / k4 : d6);
                        } else {
                            d7 -= k4;
                            i3 = i4;
                        }
                    }
                } else {
                    polylinePosition = new PolylinePosition(segmentIndex3, segmentPosition3 + (k3 > d6 ? d5 / k3 : d6));
                }
                if (polylinePosition != null) {
                    long time2 = (i2 * j) + e.getTimestamp().getTime();
                    Point b = b(list2, polylinePosition);
                    if (b == null || (c2 = c(list2, polylinePosition)) == null) {
                        polylinePosition2 = polylinePosition;
                        i001Var = null;
                    } else {
                        polylinePosition2 = polylinePosition;
                        i001Var = new i001(new zzs(b.getLatitude(), b.getLongitude(), 0, null, Long.valueOf(time2), 12), c2.doubleValue(), new Date(time2));
                    }
                    if (i001Var != null) {
                        arrayList.add(i001Var);
                    }
                    if (i2 == min) {
                        break;
                    }
                    i2++;
                    d2 = polylinePosition2;
                    list2 = list;
                    z = z2;
                    d4 = d6;
                } else {
                    break;
                }
            }
        }
        arrayList.add(e2);
        return arrayList;
    }

    public static Point b(List list, PolylinePosition polylinePosition) {
        if (list.isEmpty()) {
            return null;
        }
        Pair pair = new Pair(Integer.valueOf(polylinePosition.getSegmentIndex()), Double.valueOf(polylinePosition.getSegmentPosition()));
        int intValue = ((Number) pair.getFirst()).intValue();
        double doubleValue = ((Number) pair.getSecond()).doubleValue();
        if (intValue >= list.size() - 1) {
            return (Point) b64.c(1, list);
        }
        Point point = (Point) list.get(intValue);
        Point point2 = (Point) list.get(intValue + 1);
        return new Point(((point2.getLatitude() - point.getLatitude()) * doubleValue) + point.getLatitude(), ((point2.getLongitude() - point.getLongitude()) * doubleValue) + point.getLongitude());
    }

    public static Double c(List list, PolylinePosition polylinePosition) {
        int segmentIndex = polylinePosition.getSegmentIndex();
        if (segmentIndex >= list.size() - 1) {
            segmentIndex = list.size() - 2;
        }
        if (segmentIndex < 0 || segmentIndex >= list.size() - 1) {
            return null;
        }
        Polyline polyline = a.b;
        Point point = (Point) list.get(segmentIndex);
        Point point2 = (Point) list.get(segmentIndex + 1);
        double radians = Math.toRadians(point.getLongitude());
        double radians2 = Math.toRadians(point.getLatitude());
        double radians3 = Math.toRadians(point2.getLongitude());
        double radians4 = Math.toRadians(point2.getLatitude());
        double d = radians3 - radians;
        return Double.valueOf((Math.toDegrees(Math.atan2(Math.cos(radians4) * Math.sin(d), (Math.sin(radians4) * Math.cos(radians2)) - (Math.cos(d) * (Math.cos(radians4) * Math.sin(radians2))))) + 360.0d) % 360.0d);
    }

    public static PolylinePosition d(Point point, List list) {
        Polyline polyline = a.b;
        PolylinePosition polylinePosition = null;
        Pair pair = new Pair(null, null);
        int f = scc.f(list);
        double d = Double.MAX_VALUE;
        int i = 0;
        while (i < f) {
            Point point2 = (Point) list.get(i);
            int i2 = i + 1;
            Point point3 = (Point) list.get(i2);
            Point point4 = new Point(point.getLatitude() - point2.getLatitude(), point.getLongitude() - point2.getLongitude());
            Point point5 = new Point(point3.getLatitude() - point2.getLatitude(), point3.getLongitude() - point2.getLongitude());
            PolylinePosition polylinePosition2 = polylinePosition;
            int i3 = f;
            double max = Math.max(0.0d, Math.min(1.0d, ((point5.getLongitude() * point4.getLongitude()) + (point5.getLatitude() * point4.getLatitude())) / (Math.pow(point5.getLongitude(), 2.0d) + Math.pow(point5.getLatitude(), 2.0d))));
            Point point6 = new Point((point5.getLatitude() * max) + point2.getLatitude(), (point5.getLongitude() * max) + point2.getLongitude());
            double pow = Math.pow(point.getLongitude() - point6.getLongitude(), 2.0d) + Math.pow(point.getLatitude() - point6.getLatitude(), 2.0d);
            if (pow < d) {
                pair = new Pair(Integer.valueOf(i), Double.valueOf(max));
                d = pow;
            }
            polylinePosition = polylinePosition2;
            i = i2;
            f = i3;
        }
        PolylinePosition polylinePosition3 = polylinePosition;
        Integer num = (Integer) pair.getFirst();
        Double d2 = (Double) pair.getSecond();
        return (num == null || d2 == null) ? polylinePosition3 : new PolylinePosition(num.intValue(), d2.doubleValue());
    }

    public static j001 e(List list, PolylinePosition polylinePosition, j001 j001Var) {
        Double c;
        Point b = b(list, polylinePosition);
        if (b != null && (c = c(list, polylinePosition)) != null) {
            double doubleValue = c.doubleValue();
            zzs zzsVar = new zzs(b.getLatitude(), b.getLongitude(), 0, null, Long.valueOf(j001Var.getTimestamp().getTime()), 12);
            if (j001Var instanceof h001) {
                h001 h001Var = (h001) j001Var;
                return new h001(zzsVar, doubleValue, h001Var.c, h001Var.d, h001Var.e);
            }
            if (j001Var instanceof i001) {
                return new i001(zzsVar, doubleValue, ((i001) j001Var).c);
            }
            w511.b();
        }
        return null;
    }
}
