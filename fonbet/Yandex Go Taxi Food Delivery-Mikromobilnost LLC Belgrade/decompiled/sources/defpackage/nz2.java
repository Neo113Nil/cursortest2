package defpackage;

import com.yandex.go.taxi.order.map.route.a;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.WalkRouteOrderExperiment;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import java.util.List;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes14.dex */
public final class nz2 {
    public final dgi0 a;
    public final h b;
    public final a c;
    public final mvd0 d;
    public final c641 e;
    public final jdj f;

    public nz2(dgi0 dgi0Var, h hVar, a aVar, mvd0 mvd0Var, c641 c641Var, jdj jdjVar) {
        this.a = dgi0Var;
        this.b = hVar;
        this.c = aVar;
        this.d = mvd0Var;
        this.e = c641Var;
        this.f = jdjVar;
    }

    public static void c(fi6 fi6Var, int i) {
        if (fi6Var.i()) {
            return;
        }
        BoundingBox g = fi6Var.g();
        Point northEast = g.getNorthEast();
        Point southWest = g.getSouthWest();
        zzs zzsVar = new zzs(northEast.getLatitude(), northEast.getLongitude(), 0, null, null, 28);
        zzs zzsVar2 = new zzs(southWest.getLatitude(), southWest.getLongitude(), 0, null, null, 28);
        double d = i;
        zzs e = srb1.e(zzsVar, d);
        zzs f = srb1.f(zzsVar2, d);
        Polyline polyline = ru.yandex.taxi.map.utils.a.b;
        fi6Var.c(new Point(f.a, f.b));
        fi6Var.c(new Point(e.a, e.b));
    }

    public final void a(fi6 fi6Var) {
        yz70 yz70Var = this.a.a;
        zzs zzsVar = yz70Var.d;
        if (zzsVar != null && yz70Var.e) {
            Polyline polyline = ru.yandex.taxi.map.utils.a.b;
            fi6Var.c(new Point(zzsVar.a, zzsVar.b));
        }
    }

    public final void b(fi6 fi6Var) {
        zzs zzsVar;
        jdj jdjVar = this.f;
        dgi0 dgi0Var = (dgi0) jdjVar.b;
        o2y0 o2y0Var = (o2y0) jdjVar.w;
        yay0 yay0Var = (yay0) jdjVar.c;
        yz70 yz70Var = dgi0Var.a;
        if (dgi0Var.d) {
            h201 a8 = yay0Var.a(o2y0Var).a8();
            zzsVar = a8 == null ? yz70Var.k : a8.a;
        } else {
            zzsVar = yz70Var.k;
        }
        if (zzsVar == null) {
            return;
        }
        Polyline polyline = ru.yandex.taxi.map.utils.a.b;
        fi6Var.c(new Point(zzsVar.a, zzsVar.b));
        p201 Q2 = yay0Var.a(o2y0Var).Q2();
        if (Q2 == null) {
            return;
        }
        int i = Q2.d;
        p201 Q22 = ((yay0) jdjVar.c).a((o2y0) jdjVar.w).Q2();
        if (Q22 == null || !Q22.a) {
            return;
        }
        double d = i;
        zzs e = srb1.e(zzsVar, d);
        fi6Var.c(new Point(e.a, e.b));
        zzs f = srb1.f(zzsVar, d);
        fi6Var.c(new Point(f.a, f.b));
    }

    public final void d(fi6 fi6Var) {
        yz70 yz70Var = this.a.a;
        zzs zzsVar = yz70Var.a;
        if (zzsVar == null) {
            return;
        }
        if (yz70Var.b || yz70Var.c) {
            Polyline polyline = ru.yandex.taxi.map.utils.a.b;
            fi6Var.c(new Point(zzsVar.a, zzsVar.b));
        }
    }

    public final void e(fi6 fi6Var, boolean z) {
        mo21 mo21Var;
        dgi0 dgi0Var = this.a;
        yz70 yz70Var = dgi0Var.a;
        zzs zzsVar = yz70Var.a;
        if (zzsVar == null || (mo21Var = dgi0Var.b) == null) {
            return;
        }
        boolean z2 = yz70Var.o;
        boolean z3 = yz70Var.r != null;
        if (!z2 || z3) {
            return;
        }
        if (ru.yandex.taxi.map.utils.a.j(zzsVar, mo21Var.a()) < ((cne0) this.b.b).i("min_distance_me_order_point", 0) || z) {
            fi6Var.c(new Point(mo21Var.a, mo21Var.b));
        }
    }

    public final void f(fi6 fi6Var, List list) {
        if (list == null) {
            return;
        }
        c641 c641Var = this.e;
        WalkRouteOrderExperiment.OrderStatusRule d = c641Var.d();
        WalkRouteOrderExperiment.OrderStatusRule.PointType pointType = d == null ? WalkRouteOrderExperiment.OrderStatusRule.PointType.NONE : d.b;
        mvd0 mvd0Var = this.d;
        Point a = mvd0Var.a(pointType);
        if (a != null) {
            fi6Var.c(a);
        }
        WalkRouteOrderExperiment.OrderStatusRule d2 = c641Var.d();
        Point a2 = mvd0Var.a(d2 == null ? WalkRouteOrderExperiment.OrderStatusRule.PointType.NONE : d2.c);
        if (a2 != null) {
            fi6Var.c(a2);
        }
        fi6Var.e(list);
    }
}
