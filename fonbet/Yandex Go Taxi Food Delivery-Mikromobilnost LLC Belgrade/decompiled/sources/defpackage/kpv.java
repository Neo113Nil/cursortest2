package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.summary.mobilityhub.router.a;
import com.yandex.mapkit.geometry.Point;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class kpv implements k41 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ h55 c;

    public kpv(m41 m41Var, a aVar) {
        this.a = 1;
        this.b = m41Var;
        this.c = aVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        h55 h55Var = this.c;
        switch (i) {
            case 0:
                ((y4c0) h55Var).P((wjg) obj);
                break;
            case 1:
                ((a) h55Var).Q(null);
                break;
            default:
                y4c0 y4c0Var = (y4c0) h55Var;
                ((uo21) y4c0Var.G).detach();
                y4c0Var.D((m950) ((e840) y4c0Var.E).get(), new yf50(((qf50) obj).a), new rf50(y4c0Var));
                break;
        }
    }

    @Override // defpackage.k41
    public final void d(Address address) {
        int i = this.a;
        h55 h55Var = this.c;
        switch (i) {
            case 0:
                y4c0 y4c0Var = (y4c0) h55Var;
                i650 i650Var = ((tjg) ((h3y) y4c0Var.F).get()).a;
                i650Var.a.a("navigation.reports.road_events.save_location.click", n.u(i650Var), 1, new HashMap());
                y4c0Var.P(new wjg(new Point(address.getAddress().a.a, address.getAddress().a.b), address, false));
                break;
            case 1:
                a aVar = (a) h55Var;
                int i2 = pw20.a[((m41) this.b).c.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        w511.b();
                        break;
                    } else {
                        aVar.F.l(address);
                    }
                }
                aVar.Q(null);
                break;
            default:
                y4c0 y4c0Var2 = (y4c0) h55Var;
                ((uo21) y4c0Var2.G).detach();
                e51 e51Var = ((ya50) y4c0Var2.H).b;
                e51Var.a.a("AddressSearch.PointOnMap.Chosen", n.t(e51Var), 1, new HashMap());
                y4c0Var2.r(new yd0(address, 19));
                break;
        }
    }

    public /* synthetic */ kpv(h55 h55Var, Object obj, int i) {
        this.a = i;
        this.c = h55Var;
        this.b = obj;
    }
}
