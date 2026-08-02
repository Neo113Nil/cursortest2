package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class pyt implements b70 {
    public static final pyt a = new pyt();
    public static final List b = scc.g("hexColor", "location");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        iyt iytVar = (iyt) obj;
        bfxVar.A1("hexColor");
        ryt rytVar = ryt.a;
        foe foeVar = l80.a;
        jyt jytVar = iytVar.a;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            rytVar.a(bfxVar, cVar, jytVar);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            rytVar.a(ek00Var2, cVar, jytVar);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("location");
        l80.c.a(bfxVar, cVar, Double.valueOf(iytVar.b));
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        jyt jytVar = null;
        Double d = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                ryt rytVar = ryt.a;
                foe foeVar = l80.a;
                jytVar = (jyt) new ep60(rytVar, true).b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new iyt(jytVar, d.doubleValue());
                }
                d = (Double) l80.c.b(xdxVar, cVar);
            }
        }
    }
}
