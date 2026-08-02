package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class dwl {
    public final k6x a;

    public static m5x a(rfa0 rfa0Var) {
        w53 w53Var = new w53();
        w53Var.put("type", new o6x(rfa0Var.a.getCode()));
        String str = rfa0Var.b;
        if (str != null) {
            w53Var.put("payment_method_id", new o6x(str));
        }
        Boolean bool = rfa0Var.d;
        if (bool != null) {
            w53Var.put("has_limits", new w4x(bool.booleanValue()));
        }
        List list = rfa0Var.e;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(a((rfa0) it.next()));
            }
            w53Var.put("complements", new v4x(arrayList));
        }
        return new m5x(w53Var);
    }

    public dwl(cf21 cf21Var, k6x k6xVar) {
        this.a = k6xVar;
    }
}
