package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.route.interactor.c;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment;
import ru.yandex.taxi.logistics.experiments.k;

/* loaded from: classes12.dex */
public final class p0j {
    public final cwb a;
    public final wwf b;

    public p0j(cwb cwbVar, wwf wwfVar) {
        this.a = cwbVar;
        this.b = wwfVar;
    }

    public static String a(List list) {
        return list.size() == 1 ? q5z.F((Address) list.get(0)) : !list.isEmpty() ? q5z.l(list) : "";
    }

    public final String b(boolean z) {
        dwb dwbVar = (dwb) this.a;
        boolean z2 = false;
        if (!dwbVar.a().isEmpty()) {
            Address address = (Address) dwbVar.a().get(0);
            z2 = q5z.x(address).equals(q5z.F(address));
        }
        wwf wwfVar = this.b;
        wiq0 wiq0Var = (wiq0) wwfVar.c;
        c cVar = (c) wwfVar.b;
        k kVar = (k) wwfVar.a;
        pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).m();
        String str = m != null ? m.b : null;
        if (str == null) {
            str = "";
        }
        if (kVar.f(str) && !cVar.c().b.isEmpty()) {
            Address address2 = (Address) a.R(cVar.c().b);
            if (address2 != null) {
                boolean g = wwfVar.g();
                if (g && wwf.f(address2)) {
                    DeliveryPvzExperiment b = kVar.b();
                    return wwf.b(address2, d6z.Y(b, b.h));
                }
                if (!g && wwf.f(address2)) {
                    DeliveryPvzExperiment b2 = kVar.b();
                    return d6z.Y(b2, b2.l);
                }
                if (g) {
                    DeliveryPvzExperiment b3 = kVar.b();
                    if (evu0.J(d6z.Y(b3, b3.j))) {
                        return q5z.F(address2);
                    }
                }
                DeliveryPvzExperiment b4 = kVar.b();
                return d6z.Y(b4, b4.j);
            }
        } else {
            if (z && d() && dwbVar.c()) {
                return a(dwbVar.a());
            }
            if ((!z || !d() || !dwbVar.b()) && ((!z || !d() || !z2) && z && d())) {
                return a(dwbVar.a());
            }
        }
        return "";
    }

    public final String c(boolean z) {
        dwb dwbVar = (dwb) this.a;
        List a = dwbVar.a();
        if (!z || !d() || !dwbVar.c()) {
            return (z && d()) ? a.size() > 1 ? q5z.k(a) : a.size() == 1 ? q5z.x((Address) a.get(0)) : "" : a(a);
        }
        List A0 = a.A0(a, 1);
        return A0.size() > 1 ? q5z.k(A0) : A0.size() == 1 ? q5z.x((Address) A0.get(0)) : "";
    }

    public final boolean d() {
        return ((dwb) this.a).e();
    }
}
