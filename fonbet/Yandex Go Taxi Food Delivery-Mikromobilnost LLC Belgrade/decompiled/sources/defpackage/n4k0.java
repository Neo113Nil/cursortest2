package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class n4k0 implements b70 {
    public static final n4k0 a = new n4k0();
    public static final List b = scc.g("light", "dark");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        b4k0 b4k0Var = (b4k0) obj;
        bfxVar.A1("light");
        l80.a(o4k0.a).a(bfxVar, cVar, b4k0Var.a);
        bfxVar.A1("dark");
        l80.a(l4k0.a).a(bfxVar, cVar, b4k0Var.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        c4k0 c4k0Var = null;
        z3k0 z3k0Var = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                c4k0Var = (c4k0) l80.a(o4k0.a).b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new b4k0(c4k0Var, z3k0Var);
                }
                z3k0Var = (z3k0) l80.a(l4k0.a).b(xdxVar, cVar);
            }
        }
    }
}
