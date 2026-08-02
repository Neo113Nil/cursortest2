package defpackage;

import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.runtime.Error;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class hrt implements Session.RouteListener {
    public final si3 a;

    public hrt(si3 si3Var) {
        this.a = si3Var;
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutes(List list) {
        boolean isEmpty = list.isEmpty();
        si3 si3Var = this.a;
        if (isEmpty) {
            si3Var.invoke(null);
        } else {
            Route route = (Route) a.P(list);
            si3Var.invoke(new a0l0(route.getGeometry(), Long.valueOf((long) nzs.a(route))));
        }
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutesError(Error error) {
        this.a.invoke(null);
    }
}
