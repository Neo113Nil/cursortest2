package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class hou0 extends za5 {
    public static i1e f(c7e0 c7e0Var, String str) {
        Object obj;
        List list = c7e0Var.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((b7e0) obj).b.b, str)) {
                    break;
                }
            }
            b7e0 b7e0Var = (b7e0) obj;
            if (b7e0Var != null) {
                return b7e0Var.b;
            }
        }
        return null;
    }
}
