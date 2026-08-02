package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class i1u0 implements b70 {
    public static final i1u0 a = new i1u0();
    public static final List b = Collections.singletonList("invoice");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("invoice");
        l80.a(k1u0.a).a(bfxVar, cVar, ((e1u0) obj).a);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        g1u0 g1u0Var = null;
        while (xdxVar.h2(b) == 0) {
            g1u0Var = (g1u0) l80.a(k1u0.a).b(xdxVar, cVar);
        }
        return new e1u0(g1u0Var);
    }
}
