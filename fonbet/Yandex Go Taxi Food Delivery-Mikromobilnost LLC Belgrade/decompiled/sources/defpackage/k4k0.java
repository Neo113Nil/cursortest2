package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class k4k0 implements b70 {
    public static final k4k0 a = new k4k0();
    public static final List b = scc.g("light", "dark");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        y3k0 y3k0Var = (y3k0) obj;
        bfxVar.A1("light");
        p4k0 p4k0Var = p4k0.a;
        foe foeVar = l80.a;
        d4k0 d4k0Var = y3k0Var.a;
        boolean z = bfxVar instanceof ek00;
        if (z) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            p4k0Var.a(bfxVar, cVar, d4k0Var);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            p4k0Var.a(ek00Var2, cVar, d4k0Var);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("dark");
        m4k0 m4k0Var = m4k0.a;
        a4k0 a4k0Var = y3k0Var.b;
        if (z) {
            ek00 ek00Var3 = (ek00) bfxVar;
            ek00Var3.u();
            m4k0Var.a(bfxVar, cVar, a4k0Var);
            ek00Var3.y();
            return;
        }
        ek00 ek00Var4 = new ek00();
        ek00Var4.u();
        m4k0Var.a(ek00Var4, cVar, a4k0Var);
        ek00Var4.y();
        uga1.f(bfxVar, ek00Var4.c());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        d4k0 d4k0Var = null;
        a4k0 a4k0Var = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                p4k0 p4k0Var = p4k0.a;
                foe foeVar = l80.a;
                d4k0Var = (d4k0) new ep60(p4k0Var, true).b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new y3k0(d4k0Var, a4k0Var);
                }
                m4k0 m4k0Var = m4k0.a;
                foe foeVar2 = l80.a;
                a4k0Var = (a4k0) new ep60(m4k0Var, true).b(xdxVar, cVar);
            }
        }
    }
}
