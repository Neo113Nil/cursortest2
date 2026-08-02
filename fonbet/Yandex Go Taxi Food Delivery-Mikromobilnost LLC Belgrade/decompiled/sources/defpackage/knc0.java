package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class knc0 implements b70 {
    public static final List a = scc.g("indentLeft", "indentRight", "indentTop", "indentBottom");

    public static jnc0 c(xdx xdxVar, c cVar) {
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                num = (Integer) l80.b.b(xdxVar, cVar);
            } else if (h2 == 1) {
                num2 = (Integer) l80.b.b(xdxVar, cVar);
            } else if (h2 == 2) {
                num3 = (Integer) l80.b.b(xdxVar, cVar);
            } else {
                if (h2 != 3) {
                    return new jnc0(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                }
                num4 = (Integer) l80.b.b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, jnc0 jnc0Var) {
        bfxVar.A1("indentLeft");
        foe foeVar = l80.b;
        foeVar.a(bfxVar, cVar, Integer.valueOf(jnc0Var.a));
        bfxVar.A1("indentRight");
        foeVar.a(bfxVar, cVar, Integer.valueOf(jnc0Var.b));
        bfxVar.A1("indentTop");
        foeVar.a(bfxVar, cVar, Integer.valueOf(jnc0Var.c));
        bfxVar.A1("indentBottom");
        foeVar.a(bfxVar, cVar, Integer.valueOf(jnc0Var.d));
    }
}
