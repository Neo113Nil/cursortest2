package defpackage;

import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Status;
import ru.yandex.taxi.eats_orders.domain.entities.order.status.EatsOrderStatus;

/* loaded from: classes8.dex */
public final class o601 {
    public static int a(w201 w201Var) {
        if (w201Var instanceof v7y0) {
            return 1;
        }
        if ((w201Var instanceof q6y0) || (w201Var instanceof z4y0)) {
            return 2;
        }
        if (w201Var instanceof y2y0) {
            return 3;
        }
        if (w201Var instanceof q6o0) {
            return 4;
        }
        if (w201Var instanceof jem) {
            return 5;
        }
        if (w201Var instanceof bjz) {
            return 6;
        }
        if (w201Var instanceof d3p) {
            return 7;
        }
        if (w201Var instanceof qg50) {
            return 8;
        }
        if (w201Var instanceof xda) {
            return 9;
        }
        if (w201Var instanceof pu6) {
            return 10;
        }
        w511.b();
        return 0;
    }

    public static boolean b(w201 w201Var) {
        if (w201Var instanceof bjz) {
            if (((bjz) w201Var).h == LogisticsOrderTracking$Status.Stub) {
                return true;
            }
        } else if (w201Var instanceof d3p) {
            if (((d3p) w201Var).f == EatsOrderStatus.PENDING) {
                return true;
            }
        } else if (!(w201Var instanceof q6y0) && !(w201Var instanceof z4y0) && !(w201Var instanceof v7y0) && !(w201Var instanceof y2y0) && !(w201Var instanceof jem) && !(w201Var instanceof q6o0) && !(w201Var instanceof xda) && !(w201Var instanceof qg50) && !(w201Var instanceof pu6)) {
            w511.b();
        }
        return false;
    }
}
