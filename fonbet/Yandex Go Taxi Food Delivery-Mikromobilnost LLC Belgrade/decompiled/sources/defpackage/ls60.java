package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ls60 implements b70 {
    public static final List a = scc.g("period", "price", "repetitionCount");

    public static ks60 c(xdx xdxVar, c cVar) {
        Object obj = null;
        js60 js60Var = null;
        Integer num = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                obj = ooc.y(xdxVar);
            } else if (h2 == 1) {
                ms60 ms60Var = ms60.a;
                foe foeVar2 = l80.a;
                js60Var = (js60) new ep60(ms60Var, true).b(xdxVar, cVar);
            } else {
                if (h2 != 2) {
                    return new ks60(obj, js60Var, num.intValue());
                }
                num = (Integer) l80.b.b(xdxVar, cVar);
            }
        }
    }
}
