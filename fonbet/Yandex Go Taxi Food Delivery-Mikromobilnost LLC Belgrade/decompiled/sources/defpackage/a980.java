package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.provider.a;
import java.util.List;

/* loaded from: classes9.dex */
public final class a980 {
    public final h3y a;

    public a980(h3y h3yVar) {
        this.a = h3yVar;
    }

    public static String c(String str, o2y0 o2y0Var, boolean z) {
        TaxiOrder b;
        String str2 = (o2y0Var == null || (b = o2y0Var.b()) == null) ? null : b.V().U;
        if (str2 == null || evu0.J(str2)) {
            return str;
        }
        if (str == null || evu0.J(str)) {
            return str2;
        }
        return g8e.p(str2, z ? ". " : " ", str);
    }

    public final String a(o2y0 o2y0Var, String str) {
        List l = ((a) ((n20) this.a.get())).l();
        return l.size() > 1 ? c(str, o2y0Var, true) : (l.isEmpty() || ((o2y0) l.get(0)) == o2y0Var) ? str : c(str, o2y0Var, true);
    }

    public final String b(String str, String str2) {
        h3y h3yVar = this.a;
        o2y0 n = str2 != null ? ((a) ((n20) h3yVar.get())).n(str2) : null;
        return (n != null && ((a) ((n20) h3yVar.get())).l().size() > 1) ? c(str, n, false) : str;
    }
}
