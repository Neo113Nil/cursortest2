package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.routeselector.a;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes13.dex */
public final class h85 implements abe0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h85(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    private final void p1() {
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((i85) obj).r(new qu(9));
                break;
            case 1:
                ((pw1) obj).r(new qu(9));
                break;
            case 2:
                ((yn5) obj).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.abe0
    public final void b0(String str) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((i85) obj).r(new h0(str, 14));
                break;
            case 1:
                pw1 pw1Var = (pw1) obj;
                pw1Var.r(new qu(9));
                ((qa0) pw1Var.F).accept(str);
                break;
            case 2:
                yn5 yn5Var = (yn5) obj;
                yn5Var.r(new qu(9));
                ((cx7) yn5Var.F).invoke(str);
                break;
            case 3:
                ((a) obj).K.a(str);
                break;
            case 4:
                oy80 oy80Var = ((zat0) obj).J;
                Address h = ((y9y0) oy80Var.b).h();
                if (h != null) {
                    String J1 = h.J1();
                    if ((!evu0.J(str) || (J1 != null && !evu0.J(J1))) && !cvu0.t(J1, evu0.k0(str).toString(), true)) {
                        ((i) ((atd0) oy80Var.c)).f(h.B(), str, RoutePointType.POINT_A, "");
                        break;
                    }
                }
                break;
            default:
                ((tls) obj).invoke(str);
                break;
        }
    }
}
