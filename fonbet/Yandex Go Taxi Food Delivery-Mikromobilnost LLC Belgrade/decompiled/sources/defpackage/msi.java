package defpackage;

import com.yandex.go.address.models.Address;
import java.util.Iterator;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes5.dex */
public final class msi {
    public final zr0 a;
    public final zuh b;

    public msi(zr0 zr0Var, zuh zuhVar) {
        this.a = zr0Var;
        this.b = zuhVar;
    }

    public final void a(itj0 itj0Var) {
        Object obj;
        if (this.b.a().b) {
            RoutePointType routePointType = itj0Var.b;
            if (routePointType == RoutePointType.POINT_B || routePointType == RoutePointType.POINT_A) {
                Iterator it = itj0Var.d.iterator();
                do {
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    x9v0 x9v0Var = (x9v0) it.next();
                    Address address = x9v0Var.u;
                    if (address != null) {
                        il0 E1 = address.E1();
                        E1.getClass();
                        if (!(E1 == il0.b)) {
                            obj = new jl0(address, E1.a, x9v0Var);
                        }
                    }
                } while (obj == null);
                if (obj == null) {
                    obj = kl0.a;
                }
                this.a.a.l(obj);
            }
        }
    }
}
