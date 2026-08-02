package defpackage;

import com.yandex.go.taxi.order.provider.a;
import java.util.Collection;
import java.util.List;

/* loaded from: classes8.dex */
public final class brh {
    public final n20 a;
    public final qyw b;

    public brh(n20 n20Var, qyw qywVar) {
        this.a = n20Var;
        this.b = qywVar;
    }

    public final boolean a(u0k u0kVar) {
        if (!(u0kVar instanceof lea0)) {
            return false;
        }
        lea0 lea0Var = (lea0) u0kVar;
        boolean a = this.b.a(lea0Var);
        List l = ((a) this.a).l();
        if (!a) {
            return false;
        }
        List<o2y0> list = l;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (o2y0 o2y0Var : list) {
            if (jl40.l(o2y0Var.b().q().b, lea0Var.getId()) && o2y0Var.b().q().a() == lea0Var.c()) {
                return false;
            }
        }
        return true;
    }
}
