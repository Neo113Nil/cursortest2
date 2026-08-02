package defpackage;

import android.os.SystemClock;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import ru.yandex.taxi.map.overlay.order.OrderMapOverlayComponent$Mode;

/* loaded from: classes6.dex */
public final class ha80 {
    public final f0g a;
    public final yvf0 b;
    public final f0g c;
    public final g6y0 d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    public ha80(f0g f0gVar, yvf0 yvf0Var, f0g f0gVar2, g6y0 g6y0Var) {
        this.a = f0gVar;
        this.b = yvf0Var;
        this.c = f0gVar2;
        this.d = g6y0Var;
    }

    public final Pair a(o2y0 o2y0Var) {
        ConcurrentHashMap concurrentHashMap = this.e;
        ga80 ga80Var = (ga80) concurrentHashMap.get(o2y0Var);
        if (ga80Var != null) {
            return new Pair(ga80Var, Boolean.FALSE);
        }
        long a = s630.a();
        ix70 ix70Var = new ix70(o2y0Var);
        nw70 nw70Var = new nw70(1, pw21.e(this.c, o2y0Var, OrderMapOverlayComponent$Mode.SINGLE, (agi0) ((zxf0) pwf0.c(agi0.class))));
        f0g f0gVar = this.a;
        f0gVar.getClass();
        l0g l0gVar = new l0g(f0gVar.w, f0gVar.x, f0gVar.y, f0gVar.z, ix70Var, nw70Var);
        long a2 = f8z0.a(a);
        ga80 ga80Var2 = (ga80) concurrentHashMap.putIfAbsent(o2y0Var, l0gVar);
        if (ga80Var2 == null) {
            ((i6y0) this.d).b(new z5y0(TaxiOrderSessionCheckpoint.ORDER_VIEW_COMPONENT_CREATED, SystemClock.elapsedRealtime(), e3n.e(a2)));
        }
        return ga80Var2 != null ? new Pair(ga80Var2, Boolean.FALSE) : new Pair(l0gVar, Boolean.TRUE);
    }
}
