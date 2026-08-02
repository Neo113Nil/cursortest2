package defpackage;

import com.yandex.go.taxi.order.net.taxi.dto.response.TaxiRouteResponse;
import com.yandex.mapkit.geometry.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.taxi.net.tracker.models.TrackPoint$Remote$Source;

/* loaded from: classes14.dex */
public final class bay0 {
    public final jtq0 a;

    public bay0(jtq0 jtq0Var) {
        this.a = jtq0Var;
    }

    public static List a(List list, List list2) {
        if (list.isEmpty() || list.size() != list2.size()) {
            return EmptyList.a;
        }
        List<Pair> J = a.J(a.P0(list, list2), 1);
        Point point = new Point(((Number) list.get(0)).doubleValue() / 1000000.0d, ((Number) list2.get(0)).doubleValue() / 1000000.0d);
        int n = tcc.n(J, 9);
        if (n == 0) {
            return Collections.singletonList(point);
        }
        ArrayList arrayList = new ArrayList(n + 1);
        arrayList.add(point);
        for (Pair pair : J) {
            double doubleValue = ((Number) pair.getFirst()).doubleValue();
            Point point2 = new Point((doubleValue / 1000000.0d) + point.getLatitude(), (((Number) pair.getSecond()).doubleValue() / 1000000.0d) + point.getLongitude());
            arrayList.add(point2);
            point = point2;
        }
        return arrayList;
    }

    public static p201 b(TaxiRouteResponse.DriverInfo driverInfo) {
        if (driverInfo == null) {
            return p201.l;
        }
        return new p201(driverInfo.f, driverInfo.g, driverInfo.h, driverInfo.k, driverInfo.i, driverInfo.j, driverInfo.a, driverInfo.b, driverInfo.c, driverInfo.d, driverInfo.e);
    }

    public final ArrayList c(List list) {
        long d = this.a.d();
        List<TaxiRouteResponse.TrackPoint> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (TaxiRouteResponse.TrackPoint trackPoint : list2) {
            arrayList.add(new h001(trackPoint.a, trackPoint.b, trackPoint.c, Long.valueOf(d), TrackPoint$Remote$Source.TAXIROUTE));
        }
        return arrayList;
    }
}
