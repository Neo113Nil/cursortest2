package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class ert implements p8w {
    public static final List b = scc.g("/3.0/taxiontheway", "/4.0/orderperformerinfo", "4.0/mlutp/v1/", "/4.0/pending-orders/v1/orders");
    public final ai4 a;

    public ert(ai4 ai4Var) {
        this.a = ai4Var;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        String str = d5j0Var.a.i;
        Iterator it = b.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.a.a("Request '%s' executing in background", d5j0Var.a);
                break;
            }
            if (evu0.y(str, (String) it.next(), false)) {
                break;
            }
        }
        return zci0Var.b(d5j0Var);
    }
}
