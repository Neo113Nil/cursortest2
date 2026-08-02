package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class h2e implements b70 {
    public static final h2e a = new h2e();
    public static final List b = scc.g("color", "colors");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        y1e y1eVar = (y1e) obj;
        bfxVar.A1("color");
        foe foeVar = l80.a;
        bfxVar.r0(y1eVar.a);
        bfxVar.A1("colors");
        j2e j2eVar = j2e.a;
        a2e a2eVar = y1eVar.b;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            j2eVar.a(bfxVar, cVar, a2eVar);
            ek00Var.y();
            return;
        }
        ek00 ek00Var2 = new ek00();
        ek00Var2.u();
        j2eVar.a(ek00Var2, cVar, a2eVar);
        ek00Var2.y();
        uga1.f(bfxVar, ek00Var2.c());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        a2e a2eVar = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    return new y1e(str, a2eVar);
                }
                j2e j2eVar = j2e.a;
                foe foeVar2 = l80.a;
                a2eVar = (a2e) new ep60(j2eVar, true).b(xdxVar, cVar);
            }
        }
    }
}
