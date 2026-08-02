package defpackage;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.map.route.a;
import com.yandex.go.taxi.order.models.api.response.CheckInInfo;
import com.yandex.go.taxi.order.models.api.response.CheckInZone;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.WalkRouteOrderExperiment;
import com.yandex.mapkit.geometry.Point;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class mvd0 {
    public final a a;
    public final o2y0 b;
    public final yay0 c;
    public final dgi0 d;
    public final igi0 e;
    public final a3y0 f = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "PointTypeInteractor");

    public mvd0(a aVar, o2y0 o2y0Var, yay0 yay0Var, dgi0 dgi0Var, igi0 igi0Var) {
        this.a = aVar;
        this.b = o2y0Var;
        this.c = yay0Var;
        this.d = dgi0Var;
        this.e = igi0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Point a(WalkRouteOrderExperiment.OrderStatusRule.PointType pointType) {
        zzs zzsVar;
        CheckInZone checkInZone;
        zzs zzsVar2;
        int i = lvd0.a[pointType.ordinal()];
        a3y0 a3y0Var = this.f;
        dgi0 dgi0Var = this.d;
        o2y0 o2y0Var = this.b;
        switch (i) {
            case 1:
                h201 a8 = this.c.a(o2y0Var).a8();
                if (a8 != null && (zzsVar = a8.a) != null) {
                    return new Point(zzsVar.a, zzsVar.b);
                }
                return null;
            case 2:
                if (o2y0Var.c() != DriveState.WAITING || dgi0Var.a.c) {
                    zzs v = o2y0Var.b().v();
                    if (v != null) {
                        return new Point(v.a, v.b);
                    }
                    a3y0.d(a3y0Var, "getPointA", new IllegalStateException("src point is null"), null, 4);
                    return null;
                }
                return null;
            case 3:
                zzs m = o2y0Var.b().m();
                if (m != null) {
                    return new Point(m.a, m.b);
                }
                a3y0.d(a3y0Var, "getPointB", new IllegalStateException("dest point is null"), null, 4);
                return null;
            case 4:
                DriveState c = o2y0Var.c();
                o8g0 o8g0Var = this.a.s;
                ool0 ool0Var = (o8g0Var == null || c != ((DriveState) o8g0Var.b)) ? null : (ool0) o8g0Var.a;
                if (ool0Var != null) {
                    return (Point) kotlin.collections.a.b0(ool0Var.getGeometry().getPoints());
                }
                return null;
            case 5:
                mo21 mo21Var = dgi0Var.b;
                if (this.e.a() && mo21Var != null) {
                    return new Point(mo21Var.a, mo21Var.b);
                }
                return null;
            case 6:
                CheckInInfo checkInInfo = o2y0Var.b().V().a0;
                if (checkInInfo != null && (checkInZone = (CheckInZone) kotlin.collections.a.R(checkInInfo.a)) != null && (zzsVar2 = checkInZone.a) != null) {
                    return new Point(zzsVar2.a, zzsVar2.b);
                }
                return null;
            default:
                return null;
        }
    }
}
