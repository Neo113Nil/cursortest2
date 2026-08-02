package xsna;

import android.location.Location;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.points_map.feature.model.DeliveryPointDistance;
import com.vk.ecomm.cart.impl.points_map.feature.model.DeliveryPointsMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hyl;
import xsna.kyl;
import xsna.pmb0;

/* compiled from: DeliveryPointsMapReducer.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class sxl extends FunctionReferenceImpl implements izs<hyl, kyl.e> {
    @Override // xsna.izs
    public final kyl.e invoke(hyl hylVar) {
        boolean z;
        DeliveryPoint.WeekDay weekDay;
        hyl hylVar2 = hylVar;
        xyl xylVar = (xyl) this.receiver;
        xylVar.getClass();
        DeliveryPoint deliveryPoint = hylVar2.f;
        hyl.c cVar = hylVar2.e;
        hyl.b bVar = hylVar2.d;
        tj00 tj00Var = bVar.a;
        if (epx.f(tj00Var.a.a, Coordinates.d) || (z = tj00Var.c)) {
            return kyl.e.c.c;
        }
        if (bVar.f != null) {
            return kyl.e.c.c;
        }
        Throwable th = cVar.c;
        List<DeliveryPoint> list = cVar.a;
        if (th != null) {
            return new kyl.e.b(pmb0.c.c);
        }
        if (deliveryPoint != null) {
            switch (Calendar.getInstance().get(7)) {
                case 1:
                    weekDay = DeliveryPoint.WeekDay.SUNDAY;
                    break;
                case 2:
                    weekDay = DeliveryPoint.WeekDay.MONDAY;
                    break;
                case 3:
                    weekDay = DeliveryPoint.WeekDay.TUESDAY;
                    break;
                case 4:
                    weekDay = DeliveryPoint.WeekDay.WEDNESDAY;
                    break;
                case 5:
                    weekDay = DeliveryPoint.WeekDay.THURSDAY;
                    break;
                case 6:
                    weekDay = DeliveryPoint.WeekDay.FRIDAY;
                    break;
                case 7:
                    weekDay = DeliveryPoint.WeekDay.SATURDAY;
                    break;
                default:
                    weekDay = null;
                    break;
            }
            return weekDay != null ? new kyl.e.d(hylVar2.b(), deliveryPoint, weekDay) : kyl.e.c.c;
        }
        if (hylVar2.c == DeliveryPointsMode.SHOW_DELIVERY_POINT) {
            return kyl.e.c.c;
        }
        if (bVar.e || cVar.d || z) {
            return kyl.e.f.c;
        }
        if (list.isEmpty()) {
            if (cVar.b < 25000.0d) {
                return hylVar2.h.a ? new kyl.e.b(pmb0.a.c) : kyl.e.a.c;
            }
            return new kyl.e.b(hylVar2.i ? pmb0.d.c : pmb0.b.c);
        }
        List<DeliveryPoint> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (DeliveryPoint deliveryPoint2 : list2) {
            Coordinates coordinates = bVar.b;
            boolean z2 = coordinates != null;
            if (coordinates == null) {
                coordinates = tj00Var.a.a;
            }
            alt altVar = (alt) xylVar.a.getValue();
            Coordinates a = iwl.a(deliveryPoint2);
            altVar.getClass();
            double d = coordinates.b;
            boolean z3 = z2;
            double d2 = coordinates.c;
            xyl xylVar2 = xylVar;
            double d3 = a.b;
            double d4 = a.c;
            float[] fArr = new float[3];
            Location.distanceBetween(d, d2, d3, d4, fArr);
            int b = an10.b(fArr[0]);
            Pair pair = b >= 1000 ? new Pair(Float.valueOf(an10.b(b / 100.0f) / 10.0f), DeliveryPointDistance.Unit.KILOMETERS) : new Pair(Float.valueOf(b), DeliveryPointDistance.Unit.METERS);
            arrayList.add(new i5u0(deliveryPoint2, new DeliveryPointDistance(b, ((Number) pair.d()).floatValue(), (DeliveryPointDistance.Unit) pair.g(), z3)));
            xylVar = xylVar2;
        }
        return new kyl.e.C3216e(j5g.D0(new di1(1), arrayList));
    }
}
