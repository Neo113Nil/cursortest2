package defpackage;

import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes14.dex */
public final class l641 implements Session.RouteListener {
    public final /* synthetic */ jx6 a;
    public final /* synthetic */ m641 b;
    public final /* synthetic */ j641 c;
    public final /* synthetic */ x5s0 d;

    public l641(jx6 jx6Var, m641 m641Var, j641 j641Var, x5s0 x5s0Var) {
        this.a = jx6Var;
        this.b = m641Var;
        this.c = j641Var;
        this.d = x5s0Var;
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutes(List list) {
        boolean isEmpty = list.isEmpty();
        jx6 jx6Var = this.a;
        if (isEmpty) {
            jx6Var.accept(null);
            return;
        }
        Route route = (Route) list.get(0);
        this.b.c.put(this.c, route);
        jx6Var.accept(route);
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutesError(Error error) {
        this.d.accept(error);
    }
}
