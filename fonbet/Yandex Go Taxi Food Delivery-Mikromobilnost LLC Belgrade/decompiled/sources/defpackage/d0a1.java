package defpackage;

import android.graphics.PointF;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.LinearRing;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.PolygonMapObject;
import com.yandex.mapkit.map.RotationType;
import com.yandex.runtime.image.ImageProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes6.dex */
public abstract class d0a1 {
    public static final Object a = new Object();

    public static final void a(m5n m5nVar, f530 f530Var, sls slsVar, fid fidVar, int i) {
        int i2;
        sls slsVar2;
        bts btsVar;
        f530 f530Var2;
        long j;
        boolean z;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2911919);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(m5nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            slsVar2 = slsVar;
            i3 |= btsVar2.e(slsVar2) ? 256 : 128;
        } else {
            slsVar2 = slsVar;
        }
        boolean z2 = false;
        if (btsVar2.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 e = ljs0.e(an91.m(ljs0.c(c530Var, 1.0f), 8.0f, 0.0f, 2), 56.0f);
            ldc ldcVar = m5nVar.e;
            if (ldcVar == null) {
                btsVar2.e0(1496625244);
                j = ((el51) btsVar2.m(gl51.a)).f();
                btsVar2.t(false);
            } else {
                btsVar2.e0(1496623880);
                btsVar2.t(false);
                j = ldcVar.a;
            }
            gv90 gv90Var = m5nVar.f;
            if (gv90Var instanceof mu90) {
                z2 = ((mu90) gv90Var).b;
            } else if (gv90Var != null) {
                z = true;
                int i4 = (i3 >> 6) & 14;
                f530Var2 = c530Var;
                btsVar = btsVar2;
                a.a(slsVar2, e, null, j, 0L, null, z, null, null, null, wwg.S(1498264186, true, new ota(19, m5nVar), btsVar2), btsVar, i4, 3828);
            }
            z = z2;
            int i42 = (i3 >> 6) & 14;
            f530Var2 = c530Var;
            btsVar = btsVar2;
            a.a(slsVar2, e, null, j, 0L, null, z, null, null, null, wwg.S(1498264186, true, new ota(19, m5nVar), btsVar2), btsVar, i42, 3828);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm((Object) m5nVar, f530Var2, (Object) slsVar, i, 3);
        }
    }

    public static final boolean b(x5u0 x5u0Var, int i, o2b0 o2b0Var) {
        boolean z;
        synchronized (a) {
            int i2 = x5u0Var.d;
            if (i2 == i) {
                x5u0Var.c = o2b0Var;
                z = true;
                x5u0Var.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static final void c(Collection collection, float f, BoundingBox boundingBox) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ap00 ap00Var = (ap00) it.next();
            Object obj = ap00Var.d;
            d3e0 d3e0Var = obj instanceof d3e0 ? (d3e0) obj : null;
            if (d3e0Var != null) {
                Point point = d3e0Var.a;
                Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                if (ru.yandex.taxi.map.utils.a.r(boundingBox, point.getLatitude(), point.getLongitude())) {
                    ap00Var.i(ru.yandex.taxi.layers.source.factory.a.d(d3e0Var.b, f));
                }
            }
        }
    }

    public static final void d(Collection collection, float f, BoundingBox boundingBox) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ap00 ap00Var = (ap00) it.next();
            Object obj = ap00Var.d;
            if (!(obj instanceof o3e0)) {
                obj = null;
            }
            o3e0 o3e0Var = (o3e0) obj;
            if (o3e0Var == null) {
                o3e0Var = new o3e0();
                ap00Var.h(o3e0Var);
            }
            BoundingBox boundingBox2 = o3e0Var.b;
            Polyline polyline = ru.yandex.taxi.map.utils.a.b;
            if (boundingBox != null && boundingBox2 != null && (ru.yandex.taxi.map.utils.a.r(boundingBox, boundingBox2.getNorthEast().getLatitude(), boundingBox2.getNorthEast().getLongitude()) || ru.yandex.taxi.map.utils.a.r(boundingBox, boundingBox2.getNorthEast().getLatitude(), boundingBox2.getSouthWest().getLongitude()) || ru.yandex.taxi.map.utils.a.r(boundingBox, boundingBox2.getSouthWest().getLatitude(), boundingBox2.getNorthEast().getLongitude()) || ru.yandex.taxi.map.utils.a.r(boundingBox, boundingBox2.getSouthWest().getLatitude(), boundingBox2.getSouthWest().getLongitude()) || ru.yandex.taxi.map.utils.a.r(boundingBox2, boundingBox.getNorthEast().getLatitude(), boundingBox.getNorthEast().getLongitude()) || ru.yandex.taxi.map.utils.a.r(boundingBox2, boundingBox.getNorthEast().getLatitude(), boundingBox.getSouthWest().getLongitude()) || ru.yandex.taxi.map.utils.a.r(boundingBox2, boundingBox.getSouthWest().getLatitude(), boundingBox.getNorthEast().getLongitude()) || ru.yandex.taxi.map.utils.a.r(boundingBox2, boundingBox.getSouthWest().getLatitude(), boundingBox.getSouthWest().getLongitude()))) {
                Object obj2 = ap00Var.d;
                o3e0 o3e0Var2 = (o3e0) (obj2 instanceof o3e0 ? obj2 : null);
                if (o3e0Var2 == null) {
                    o3e0Var2 = new o3e0();
                    ap00Var.h(o3e0Var2);
                }
                nm40 nm40Var = o3e0Var2.a;
                if (nm40Var != null) {
                    ap00Var.i(ru.yandex.taxi.layers.source.factory.a.d(nm40Var.c, f));
                }
            }
        }
    }

    public static final x5u0 e(SnapshotStateSet snapshotStateSet) {
        return (x5u0) q2t0.t((x5u0) snapshotStateSet.getFirstStateRecord(), snapshotStateSet);
    }

    public static final void f(xm00 xm00Var, d3e0 d3e0Var, float f) {
        lz2 lz2Var = d3e0Var.c;
        f4c0 f4c0Var = new f4c0(d3e0Var.a, null, 6);
        PointF pointF = lz2Var.h;
        RotationType rotationType = RotationType.ROTATE;
        Float valueOf = Float.valueOf(lz2Var.b);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        float f2 = lz2Var.d;
        f4c0Var.D(new IconStyle(pointF, rotationType, valueOf, bool, bool2, Float.valueOf(f2), null));
        pt3 pt3Var = lz2Var.e;
        f4c0Var.C(pt3Var != null ? scc.g(new PointF(pt3Var.b, pt3Var.c), new PointF(pt3Var.d, pt3Var.e)) : Collections.singletonList(new PointF(1.0f, f2)));
        f4c0Var.y(lz2Var.a);
        f4c0Var.h(d3e0Var);
        f4c0Var.i(ru.yandex.taxi.layers.source.factory.a.d(d3e0Var.b, f));
        xm00Var.getClass();
        f4c0Var.b(xm00Var);
    }

    public static final void g(xm00 xm00Var, nm40 nm40Var, float f) {
        for (shs0 shs0Var : nm40Var.f) {
            LinearRing linearRing = shs0Var.a;
            v3e0 v3e0Var = shs0Var.c;
            Polygon polygon = !el00.a ? null : new Polygon(linearRing, shs0Var.b);
            if (polygon != null) {
                n3e0 n3e0Var = new n3e0(polygon);
                n3e0Var.u(v3e0Var.a);
                n3e0Var.r(v3e0Var.b);
                n3e0Var.p(v3e0Var.c);
                n3e0Var.i(ru.yandex.taxi.layers.source.factory.a.d(nm40Var.c, f));
                n3e0Var.k(nm40Var.d);
                Object obj = n3e0Var.d;
                if (!(obj instanceof o3e0)) {
                    obj = null;
                }
                o3e0 o3e0Var = (o3e0) obj;
                if (o3e0Var == null) {
                    o3e0Var = new o3e0();
                    n3e0Var.h(o3e0Var);
                }
                o3e0Var.a = nm40Var;
                Object obj2 = n3e0Var.d;
                if (!(obj2 instanceof o3e0)) {
                    obj2 = null;
                }
                o3e0 o3e0Var2 = (o3e0) obj2;
                if (o3e0Var2 == null) {
                    o3e0Var2 = new o3e0();
                    n3e0Var.h(o3e0Var2);
                }
                o3e0Var2.b = k.a(new k7d0(11, polygon));
                Object obj3 = n3e0Var.d;
                o3e0 o3e0Var3 = (o3e0) (obj3 instanceof o3e0 ? obj3 : null);
                if (o3e0Var3 == null) {
                    o3e0Var3 = new o3e0();
                    n3e0Var.h(o3e0Var3);
                }
                o3e0Var3.c = v3e0Var;
                xm00Var.getClass();
                n3e0Var.b(xm00Var);
                iib iibVar = shs0Var.d;
                if (iibVar != null) {
                    ((PolygonMapObject) n3e0Var.g).setPattern((ImageProvider) iibVar.b, iibVar.a);
                }
            }
        }
    }

    public static final mv51 h(tf51 tf51Var) {
        return new mv51(tf51Var.a, tf51Var.b, tf51Var.c, tf51Var.e, tf51Var.d);
    }

    public static final void i(xm00 xm00Var, nm40 nm40Var) {
        ArrayList n = xm00Var.n();
        ArrayList arrayList = new ArrayList();
        Iterator it = n.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ap00 ap00Var = (ap00) next;
            Object obj = ap00Var.d;
            o3e0 o3e0Var = (o3e0) (obj instanceof o3e0 ? obj : null);
            if (o3e0Var == null) {
                o3e0Var = new o3e0();
                ap00Var.h(o3e0Var);
            }
            if (o3e0Var.a == nm40Var) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof n3e0) {
                arrayList2.add(next2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            n3e0 n3e0Var = (n3e0) it3.next();
            Object obj2 = n3e0Var.d;
            if (!(obj2 instanceof o3e0)) {
                obj2 = null;
            }
            o3e0 o3e0Var2 = (o3e0) obj2;
            if (o3e0Var2 == null) {
                o3e0Var2 = new o3e0();
                n3e0Var.h(o3e0Var2);
            }
            v3e0 v3e0Var = o3e0Var2.c;
            if (v3e0Var != null) {
                float f = v3e0Var.c;
                if (nm40Var.h) {
                    f *= 2.5f;
                }
                n3e0Var.p(f);
            }
        }
    }
}
