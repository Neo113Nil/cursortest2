package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class nha0 implements b70 {
    public static final nha0 a = new nha0();
    public static final List b = scc.g("light", "dark");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        eha0 eha0Var = (eha0) obj;
        bfxVar.A1("light");
        l80.a(pha0.a).a(bfxVar, cVar, eha0Var.a);
        bfxVar.A1("dark");
        l80.a(mha0.a).a(bfxVar, cVar, eha0Var.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        gha0 gha0Var = null;
        dha0 dha0Var = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                gha0Var = (gha0) l80.a(pha0.a).b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new eha0(gha0Var, dha0Var);
                }
                dha0Var = (dha0) l80.a(mha0.a).b(xdxVar, cVar);
            }
        }
    }
}
