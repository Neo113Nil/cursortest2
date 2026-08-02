package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.yandex.mapkit.geometry.geo.XYPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.map_common.map.utils.a;

/* loaded from: classes6.dex */
public final class j0l0 {
    public final a a;
    public List b = EmptyList.a;
    public final PointF c = new PointF();
    public final PointF d = new PointF();
    public final PointF e = new PointF();
    public final Path f;
    public final PathMeasure g;
    public final float[] h;
    public final float[] i;
    public long j;
    public long k;
    public String l;

    public j0l0(a aVar) {
        this.a = aVar;
        Path path = new Path();
        this.f = path;
        this.g = new PathMeasure(path, false);
        this.h = new float[2];
        this.i = new float[2];
    }

    public final h201 a(long j) {
        Iterator it = this.b.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (j <= ((j001) it.next()).getTimestamp().getTime()) {
                break;
            }
            i++;
        }
        Pair pair = new Pair((j001) this.b.get(Math.max(i - 1, 0)), (j001) this.b.get(Math.max(i, 0)));
        j001 j001Var = (j001) pair.getFirst();
        j001 j001Var2 = (j001) pair.getSecond();
        g201 g201Var = new g201(this.l, j001Var);
        if (j001Var == j001Var2 || j001Var2.getTimestamp().getTime() <= j001Var.getTimestamp().getTime()) {
            return new h201(j001Var.getCoordinates(), Double.valueOf(j001Var.getDirection()), true, j001Var.getTimestamp().getTime(), g201Var);
        }
        float time = j001Var2.getTimestamp().getTime() - j001Var.getTimestamp().getTime();
        float time2 = j - j001Var.getTimestamp().getTime();
        float j2 = ru.yandex.taxi.map.utils.a.j(j001Var.getCoordinates(), j001Var2.getCoordinates());
        boolean l = jl40.l(j001Var.getCoordinates(), j001Var2.getCoordinates());
        if (j2 < 7.0f) {
            zzs coordinates = j001Var.getCoordinates();
            zzs coordinates2 = j001Var2.getCoordinates();
            double d = time2 / time;
            double d2 = coordinates2.a;
            double d3 = coordinates.a;
            double a = x4e.a(d2, d3, d, d3);
            double d4 = coordinates2.b;
            double d5 = coordinates.b;
            zzs zzsVar = new zzs(a, x4e.a(d4, d5, d, d5), 0, null, null, 28);
            double pow = (Math.pow((0.5d * d) - 1.0d, 4.0d) * (-1.0d)) + 1.0d;
            double direction = j001Var.getDirection();
            return new h201(zzsVar, Double.valueOf(((((((j001Var2.getDirection() - direction) % 360.0d) + 540.0d) % 360.0d) - 180.0d) * pow) + direction), l, j, g201Var);
        }
        zzs coordinates3 = j001Var.getCoordinates();
        a aVar = this.a;
        XYPoint c = aVar.c(coordinates3);
        XYPoint c2 = aVar.c(j001Var2.getCoordinates());
        float direction2 = (float) (((j001Var.getDirection() - 90.0d) / 180.0d) * 3.141592653589793d);
        float direction3 = (float) (((j001Var2.getDirection() + 90.0d) / 180.0d) * 3.141592653589793d);
        float x = (float) (c2.getX() - c.getX());
        float y = (float) (c2.getY() - c.getY());
        PointF pointF = this.e;
        pointF.set(x, y);
        float length = pointF.length() / 4.0f;
        double d6 = direction2;
        float cos = ((float) Math.cos(d6)) * length;
        float sin = ((float) Math.sin(d6)) * length;
        PointF pointF2 = this.c;
        pointF2.set(cos, sin);
        double d7 = direction3;
        float cos2 = (((float) Math.cos(d7)) * length) + pointF.x;
        float sin2 = (length * ((float) Math.sin(d7))) + pointF.y;
        PointF pointF3 = this.d;
        pointF3.set(cos2, sin2);
        Path path = this.f;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF.x, pointF.y);
        PathMeasure pathMeasure = this.g;
        pathMeasure.setPath(path, false);
        pathMeasure.getPosTan((pathMeasure.getLength() * time2) / time, this.h, this.i);
        return new h201(aVar.f(new XYPoint(c.getX() + r4[0], c.getY() + r4[1])), Double.valueOf(((Math.atan2(r0[1], r0[0]) / 3.141592653589793d) * 180.0d) + 90.0d), l, j, g201Var);
    }

    public final void b(String str, List list) {
        this.k = 0L;
        if (!list.isEmpty()) {
            this.j = ((j001) kotlin.collections.a.Z(list)).getTimestamp().getTime();
        }
        this.b = new ArrayList(new u1l(2, list));
        long j = this.k;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j = Math.max(j, ((j001) it.next()).getTimestamp().getTime());
        }
        this.k = j;
        this.l = str;
    }
}
