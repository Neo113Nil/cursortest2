package defpackage;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.transport.TransportFactory;
import com.yandex.mapkit.transport.masstransit.FitnessOptions;
import com.yandex.mapkit.transport.masstransit.PedestrianRouter;
import com.yandex.mapkit.transport.masstransit.RouteOptions;
import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public final class mra0 extends k45 {
    public PedestrianRouter b;
    public Session c;

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1852281244) {
                if (hashCode != 225827961) {
                    if (hashCode == 1370295993 && str.equals("requestRoutes")) {
                        ArrayList j = lyi.j((Map) x920Var.b);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = j.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (((RequestPoint) next).getType() == RequestPointType.WAYPOINT) {
                                arrayList.add(next);
                            }
                        }
                        if (arrayList.size() < 2) {
                            ((ba20) da20Var).error("requestRoutes", "The route must have at least two WayPoint points", null);
                            return;
                        }
                        Session session = this.c;
                        if (session != null) {
                            session.cancel();
                        }
                        lra0 lra0Var = new lra0(this, (ba20) da20Var);
                        PedestrianRouter pedestrianRouter = this.b;
                        this.c = (pedestrianRouter != null ? pedestrianRouter : null).requestRoutes(j, new TimeOptions(), new RouteOptions(new FitnessOptions(false, false), false), lra0Var);
                        return;
                    }
                } else if (str.equals("initRouter")) {
                    if (this.b == null) {
                        this.b = TransportFactory.getInstance().createPedestrianRouter();
                    }
                    ((ba20) da20Var).success(null);
                    return;
                }
            } else if (str.equals("cancelRoutes")) {
                Session session2 = this.c;
                if (session2 != null) {
                    session2.cancel();
                }
                this.c = null;
                ((ba20) da20Var).success(null);
                return;
            }
        }
        ((ba20) da20Var).notImplemented();
    }
}
