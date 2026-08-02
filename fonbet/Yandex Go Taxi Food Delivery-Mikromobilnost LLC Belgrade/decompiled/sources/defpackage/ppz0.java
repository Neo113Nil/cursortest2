package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.DrivingRouteMetadata;
import com.yandex.mapkit.directions.driving.Weight;
import defpackage.soz0;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.preorder.tollroad.data.e;

/* loaded from: classes6.dex */
public final class ppz0 implements gqz0 {
    public final wiq0 a;
    public final h3y b;
    public final opz0 c;
    public final irz0 d;
    public final arz0 e;

    public ppz0(wiq0 wiq0Var, h3y h3yVar, opz0 opz0Var, irz0 irz0Var, arz0 arz0Var) {
        this.a = wiq0Var;
        this.b = h3yVar;
        this.c = opz0Var;
        this.d = irz0Var;
        this.e = arz0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0251 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0250 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fqz0 a() {
        Object obj;
        Object obj2;
        DrivingRouteMetadata metadata;
        Weight weight;
        LocalizedValue timeWithTraffic;
        DrivingRouteMetadata metadata2;
        Weight weight2;
        LocalizedValue timeWithTraffic2;
        pex0 m = ((k) this.a).m();
        if (m == null || !m.X) {
            return zpz0.a;
        }
        soz0 d = this.c.d();
        if (!d.b) {
            return cqz0.a;
        }
        irz0 irz0Var = this.d;
        Double d2 = null;
        if (!irz0Var.a) {
            irz0Var.a = true;
            soz0.k kVar = d.e;
            if (!irz0.a(kVar.a.a, d)) {
                xby.t(jst.e, "TollRoads.Validation.Error", null, "singleRoad texts are invalid", 6);
            }
            if (!irz0.a(kVar.b.a, d)) {
                xby.t(jst.e, "TollRoads.Validation.Error", null, "singleRoad texts are invalid", 6);
            }
            soz0.b bVar = kVar.b.b;
            if (!d.f && (d6z.Y(d, bVar.a).length() <= 0 || d6z.Y(d, bVar.b).length() <= 0 || d6z.Y(d, bVar.e).length() <= 0)) {
                xby.t(jst.e, "TollRoads.Validation.Error", null, "multipleRoads listItems are invalid", 6);
            }
            soz0.j jVar = kVar.c.a;
            if (d6z.Y(d, jVar.a).length() <= 0 || d6z.Y(d, jVar.b).length() <= 0 || d6z.Y(d, jVar.c).length() <= 0) {
                xby.t(jst.e, "TollRoads.Validation.Error", null, "orderButton titles are invalid", 6);
            }
        }
        List a = ((e) this.b.get()).a();
        boolean c = in91.c(a);
        grz0 grz0Var = (grz0) ((e) this.b.get()).f.getValue();
        boolean f = ((e) this.b.get()).f();
        soz0.g gVar = d.e.a.b;
        boolean z = false;
        if (gVar != null && gVar.a) {
            z = true;
        }
        boolean c2 = ((e) this.b.get()).c();
        if (this.c.e()) {
            if (this.c.d().g && ((Boolean) ((e) this.b.get()).h.getValue()).booleanValue()) {
                return eqz0.a;
            }
            opz0 opz0Var = this.c;
            List list = a;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!((DrivingRoute) obj).getMetadata().getFlags().getHasTolls()) {
                    break;
                }
            }
            DrivingRoute drivingRoute = (DrivingRoute) obj;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((DrivingRoute) obj2).getMetadata().getFlags().getHasTolls()) {
                    break;
                }
            }
            DrivingRoute drivingRoute2 = (DrivingRoute) obj2;
            Double valueOf = (drivingRoute == null || (metadata2 = drivingRoute.getMetadata()) == null || (weight2 = metadata2.getWeight()) == null || (timeWithTraffic2 = weight2.getTimeWithTraffic()) == null) ? null : Double.valueOf(timeWithTraffic2.getValue());
            if (drivingRoute2 != null && (metadata = drivingRoute2.getMetadata()) != null && (weight = metadata.getWeight()) != null && (timeWithTraffic = weight.getTimeWithTraffic()) != null) {
                d2 = Double.valueOf(timeWithTraffic.getValue());
            }
            arz0 arz0Var = this.e;
            Integer num = opz0Var.d().h.a;
            Double d3 = opz0Var.d().h.b;
            arz0Var.getClass();
            if (valueOf != null && d2 != null && num != null && d3 != null && valueOf.doubleValue() > 0.0d) {
                double doubleValue = d2.doubleValue() - valueOf.doubleValue();
                if (doubleValue >= 0.0d && doubleValue >= num.intValue() && doubleValue / valueOf.doubleValue() >= d3.doubleValue()) {
                    return aqz0.a;
                }
            }
        }
        xpz0 xpz0Var = xpz0.a;
        vpz0 vpz0Var = vpz0.a;
        if (c2 && z) {
            return bqz0.a;
        }
        if (a.isEmpty()) {
            return f ? vpz0Var : xpz0Var;
        }
        if (a.size() != 1) {
            return rpz0.a;
        }
        if (c && grz0Var == grz0.c) {
            return tpz0.a;
        }
        if (c && (jl40.l(grz0Var.a, Boolean.TRUE) || grz0Var.a == null)) {
            return spz0.a;
        }
        if (!c && jl40.l(grz0Var.a, Boolean.TRUE)) {
            return upz0.a;
        }
        if (jl40.l(grz0Var.a, Boolean.FALSE)) {
            return ypz0.a;
        }
        if (f) {
        }
    }
}
