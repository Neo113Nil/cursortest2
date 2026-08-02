package defpackage;

import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class f0f0 {
    public final o2y0 a;
    public final List b;
    public final RouteChangeType c;
    public final Runnable d;
    public final Runnable e;

    public f0f0(o2y0 o2y0Var, List list, RouteChangeType routeChangeType, Runnable runnable, Runnable runnable2) {
        this.a = o2y0Var;
        this.b = list;
        this.c = routeChangeType;
        this.d = runnable;
        this.e = runnable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0f0)) {
            return false;
        }
        f0f0 f0f0Var = (f0f0) obj;
        return jl40.l(this.a, f0f0Var.a) && this.b.equals(f0f0Var.b) && this.c == f0f0Var.c && this.d.equals(f0f0Var.d) && this.e.equals(f0f0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        return "PriceRecalculationShownModel(orderHolder=" + this.a + ", address=" + this.b + ", requestType=" + this.c + ", fallbackAction=" + this.d + ", saveNewRouteAction=" + this.e + Extension.C_BRAKE;
    }
}
