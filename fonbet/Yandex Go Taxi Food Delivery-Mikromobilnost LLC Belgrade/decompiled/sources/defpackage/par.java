package defpackage;

import com.yandex.mapkit.geometry.Point;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes12.dex */
public final class par {
    public final zuj0 a;
    public final cne0 b;
    public final oar c;
    public ArrayList d;
    public String e;
    public long f;

    public par(dne0 dne0Var, zuj0 zuj0Var) {
        this.a = zuj0Var;
        cne0 a = dne0Var.a("com.yandex.go.navigator.route_stats");
        this.b = a;
        this.c = new oar();
        this.d = new ArrayList();
        this.e = "";
        this.f = a.j("NAVIGATOR_ROUTE_STATS_START_TIME", 0L);
    }

    public final double a() {
        Iterator it = this.d.iterator();
        float f = 0.0f;
        if (it.hasNext()) {
            Point point = (Point) it.next();
            while (it.hasNext()) {
                Point point2 = (Point) it.next();
                f += a.i(point.getLatitude(), point.getLongitude(), point2.getLatitude(), point2.getLongitude());
                point = point2;
            }
        }
        return f;
    }
}
