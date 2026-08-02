package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class d4i {
    public final c8r a;
    public final mjx0 b;

    public d4i(c8r c8rVar, mjx0 mjx0Var) {
        this.a = c8rVar;
        this.b = mjx0Var;
    }

    public final ArrayList a(dhg dhgVar) {
        List list;
        Object obj;
        b580 b580Var;
        String str = dhgVar.d;
        String str2 = dhgVar.a;
        if (str2 == null) {
            str2 = "";
        }
        mi31 b = c8r.b(this.a, str, str2, null, 4);
        pex0 pex0Var = b != null ? b.a : null;
        kjx0 a = this.b.a(pex0Var);
        Map map = dhgVar.e;
        List f = pex0Var != null ? pex0Var.f() : null;
        if (!map.isEmpty() && (list = f) != null && !list.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                Iterator it = f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((lmw0) obj).getName(), entry.getKey())) {
                        break;
                    }
                }
                lmw0 lmw0Var = (lmw0) obj;
                if (lmw0Var != null) {
                    Object value = entry.getValue();
                    if ((lmw0Var instanceof fmw0) && (value instanceof Boolean)) {
                        fmw0 fmw0Var = (fmw0) lmw0Var;
                        b580Var = gi.e(fmw0Var.a, fmw0Var.b);
                    } else if ((lmw0Var instanceof jmw0) && (value instanceof Number)) {
                        jmw0 jmw0Var = (jmw0) lmw0Var;
                        ArrayList arrayList = jmw0Var.s().c;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (new of70(((Number) value).intValue()).equals(((ejj0) obj2).l)) {
                                arrayList2.add(obj2);
                            }
                        }
                        b580Var = q5z.u(jmw0Var, arrayList2);
                    } else {
                        b580Var = null;
                    }
                    if (b580Var != null) {
                        a.c(b580Var, false);
                    }
                }
            }
            a.a();
        }
        return a.d;
    }
}
