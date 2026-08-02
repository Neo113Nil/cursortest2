package defpackage;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.map.WalkRouteInteractor$scheduleUpdate$lambda$0$$inlined$safeCollectIn$1;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.WalkRouteOrderExperiment;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.transport.masstransit.Session;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.a;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class c641 {
    public final tse a;
    public final m641 b;
    public final o2y0 c;
    public final a3y0 d = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "WalkRouteInteractor");
    public Point e;
    public Point f;
    public n0 g;
    public pzt0 h;

    public c641(tse tseVar, m641 m641Var, o2y0 o2y0Var) {
        this.a = tseVar;
        this.b = m641Var;
        this.c = o2y0Var;
    }

    public final WalkRouteOrderExperiment a() {
        OrderStatusInfo V = this.c.b().V();
        V.getClass();
        qn11 qn11Var = WalkRouteOrderExperiment.l;
        qn11 b = V.b(WalkRouteOrderExperiment.class);
        if (b != null) {
            qn11Var = b;
        }
        return (WalkRouteOrderExperiment) qn11Var;
    }

    public final boolean b(float f) {
        float f2;
        WalkRouteOrderExperiment a = a();
        Integer num = a.c;
        if (num == null || num.intValue() < 0) {
            a3y0.d(a.j, "minZoomLevel", new IllegalStateException("invalid maxDistanceMeters: " + num), null, 4);
            f2 = 0.0f;
        } else {
            f2 = a.h.floatValue();
        }
        return f >= f2;
    }

    public final boolean c() {
        if (!a().b()) {
            return false;
        }
        o2y0 o2y0Var = this.c;
        int i = a641.a[o2y0Var.c().ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            return false;
        }
        WalkRouteOrderExperiment a = a();
        DriveState c = o2y0Var.c();
        Iterable iterable = a.i;
        Object obj = null;
        if (iterable == null) {
            a3y0.d(a.j, "orderStatusRules", new IllegalStateException("WalkRouteOrderExperiment has no orderStatusRules"), null, 4);
            iterable = EmptyList.a;
        }
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((WalkRouteOrderExperiment.OrderStatusRule) next).a == c) {
                obj = next;
                break;
            }
        }
        return obj != null && o2y0Var.b().b.M == null;
    }

    public final WalkRouteOrderExperiment.OrderStatusRule d() {
        WalkRouteOrderExperiment a = a();
        Iterable iterable = a.i;
        Object obj = null;
        if (iterable == null) {
            a3y0.d(a.j, "orderStatusRules", new IllegalStateException("WalkRouteOrderExperiment has no orderStatusRules"), null, 4);
            iterable = EmptyList.a;
        }
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (this.c.c() == ((WalkRouteOrderExperiment.OrderStatusRule) next).a) {
                obj = next;
                break;
            }
        }
        return (WalkRouteOrderExperiment.OrderStatusRule) obj;
    }

    public final void e(Runnable runnable, boolean z) {
        int i;
        if (z) {
            Session session = this.b.b;
            if (session != null) {
                session.cancel();
            }
            pzt0 pzt0Var = this.h;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.h = null;
            runnable.run();
            return;
        }
        n0 n0Var = this.g;
        if (n0Var != null) {
            n0Var.g(runnable);
            return;
        }
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        o430 o430Var = e3n.b;
        WalkRouteOrderExperiment a = a();
        Integer num = a.e;
        if (num == null || num.intValue() < 0) {
            a3y0.d(a.j, "minUpdateRateSeconds", new IllegalStateException("invalid minUpdateRateSeconds: " + num), null, 4);
            i = Integer.MAX_VALUE;
        } else {
            i = num.intValue();
        }
        this.h = tje.N(this.a, null, null, new WalkRouteInteractor$scheduleUpdate$lambda$0$$inlined$safeCollectIn$1(e.N(b, a.t(kp50.U(i, DurationUnit.SECONDS))), null, this), 3);
        runnable.run();
        this.g = b;
    }
}
