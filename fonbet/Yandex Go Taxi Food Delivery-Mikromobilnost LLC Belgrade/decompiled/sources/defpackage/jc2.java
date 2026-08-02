package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes7.dex */
public final class jc2 implements cq6 {
    public List a = EmptyList.a;

    @Override // defpackage.cq6
    public final Double a(md6 md6Var) {
        Object obj;
        Double d = (Double) md6Var.c;
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (!this.a.isEmpty()) {
                List<fns0> list = this.a;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (fns0 fns0Var : list) {
                    arrayList.add(new fns0(fns0Var.a + 10.0d, fns0Var.b, fns0Var.c));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    fns0 fns0Var2 = (fns0) next;
                    if (fns0Var2.a < fns0Var2.b) {
                        arrayList2.add(next);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    fns0 fns0Var3 = (fns0) obj;
                    if (fns0Var3.a <= doubleValue && doubleValue <= fns0Var3.b) {
                        break;
                    }
                }
                fns0 fns0Var4 = (fns0) obj;
                if (fns0Var4 == null) {
                    Iterator it3 = arrayList2.iterator();
                    fns0 fns0Var5 = null;
                    Double d2 = null;
                    while (it3.hasNext()) {
                        fns0 fns0Var6 = (fns0) it3.next();
                        double abs = Math.abs(fns0Var6.a - doubleValue);
                        if (d2 == null || abs < d2.doubleValue()) {
                            d2 = Double.valueOf(abs);
                            fns0Var5 = fns0Var6;
                        }
                    }
                    if (fns0Var5 != null && fns0Var5.c) {
                        double d3 = (fns0Var5.a - doubleValue) + 3.0d;
                        if (d3 > 0.0d) {
                            return Double.valueOf(d3);
                        }
                    }
                } else if (fns0Var4.c) {
                    return Double.valueOf(3.0d);
                }
            }
        }
        return null;
    }
}
