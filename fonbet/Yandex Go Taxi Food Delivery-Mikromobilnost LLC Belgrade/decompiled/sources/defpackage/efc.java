package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class efc implements b70 {
    public static final List a = Collections.singletonList("gradient");

    public static yec c(xdx xdxVar, c cVar) {
        xec xecVar = null;
        while (xdxVar.h2(a) == 0) {
            dfc dfcVar = dfc.a;
            foe foeVar = l80.a;
            xecVar = (xec) new ep60(dfcVar, true).b(xdxVar, cVar);
        }
        return new yec(xecVar);
    }

    public static void d(bfx bfxVar, c cVar, yec yecVar) {
        bfxVar.A1("gradient");
        dfc dfcVar = dfc.a;
        foe foeVar = l80.a;
        xec xecVar = yecVar.a;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            dfcVar.a(bfxVar, cVar, xecVar);
            ek00Var.y();
            return;
        }
        ek00 ek00Var2 = new ek00();
        ek00Var2.u();
        dfcVar.a(ek00Var2, cVar, xecVar);
        ek00Var2.y();
        uga1.f(bfxVar, ek00Var2.c());
    }
}
