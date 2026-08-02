package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ps60 implements b70 {
    public static final List a = scc.g("price", "until");

    public static os60 c(xdx xdxVar, c cVar) {
        ns60 ns60Var = null;
        Object obj = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                qs60 qs60Var = qs60.a;
                foe foeVar = l80.a;
                ns60Var = (ns60) new ep60(qs60Var, true).b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new os60(ns60Var, obj);
                }
                foe foeVar2 = l80.a;
                obj = ooc.y(xdxVar);
            }
        }
    }
}
