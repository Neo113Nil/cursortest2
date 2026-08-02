package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class p5a0 implements b70 {
    public static final List a = scc.g("id", "title", "lightTheme", "darkTheme", "asset");

    public static c4a0 c(xdx xdxVar, c cVar) {
        Object obj;
        String str = null;
        String str2 = null;
        a4a0 a4a0Var = null;
        z3a0 z3a0Var = null;
        v3a0 v3a0Var = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                foe foeVar2 = l80.a;
                str2 = xdxVar.nextString();
            } else if (h2 == 2) {
                a4a0Var = (a4a0) l80.a(o5a0.a).b(xdxVar, cVar);
            } else if (h2 == 3) {
                z3a0Var = (z3a0) l80.a(n5a0.a).b(xdxVar, cVar);
            } else {
                if (h2 != 4) {
                    return new c4a0(str, str2, a4a0Var, z3a0Var, v3a0Var);
                }
                m5a0 m5a0Var = m5a0.a;
                foe foeVar3 = l80.a;
                ep60 ep60Var = new ep60(m5a0Var, true);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj = null;
                } else {
                    obj = ep60Var.b(xdxVar, cVar);
                }
                v3a0Var = (v3a0) obj;
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, c4a0 c4a0Var) {
        bfxVar.A1("id");
        foe foeVar = l80.a;
        bfxVar.r0(c4a0Var.a);
        bfxVar.A1("title");
        bfxVar.r0(c4a0Var.b);
        bfxVar.A1("lightTheme");
        l80.a(o5a0.a).a(bfxVar, cVar, c4a0Var.c);
        bfxVar.A1("darkTheme");
        l80.a(n5a0.a).a(bfxVar, cVar, c4a0Var.d);
        bfxVar.A1("asset");
        ep60 ep60Var = new ep60(m5a0.a, true);
        v3a0 v3a0Var = c4a0Var.e;
        if (v3a0Var == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, v3a0Var);
        }
    }
}
