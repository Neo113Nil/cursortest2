package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class g4s0 {
    public volatile d4s0 a;

    public final d4s0 a(y430 y430Var, Object obj) {
        d4s0 d4s0Var = this.a;
        try {
            List d = y430Var.d(obj, d4s0Var.d);
            d4s0 b = d4s0Var.b(d);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : d) {
                if (obj2 instanceof nc6) {
                    arrayList.add(obj2);
                }
            }
            d4s0 a = d4s0.a(b, null, tcc.o(scc.g(arrayList, b.i)), 3839);
            if (d4s0Var != this.a) {
                jst.e.w(new Throwable("sequence corrupt!"));
            }
            this.a = a;
            return a;
        } catch (Throwable th) {
            jst.e.k(th, "Unable to apply models update");
            return d4s0Var;
        }
    }
}
