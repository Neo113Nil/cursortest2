package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class cfc implements b70 {
    public static final List a = Collections.singletonList("value");

    public static bfc c(xdx xdxVar, c cVar) {
        ArrayList arrayList = null;
        while (xdxVar.h2(a) == 0) {
            gfc gfcVar = gfc.a;
            foe foeVar = l80.a;
            ep60 ep60Var = new ep60(gfcVar, true);
            xdxVar.l();
            arrayList = new ArrayList();
            while (xdxVar.hasNext()) {
                arrayList.add(ep60Var.b(xdxVar, cVar));
            }
            xdxVar.j();
        }
        return new bfc(arrayList);
    }

    public static void d(bfx bfxVar, c cVar, bfc bfcVar) {
        bfxVar.A1("value");
        gfc gfcVar = gfc.a;
        foe foeVar = l80.a;
        ArrayList arrayList = bfcVar.a;
        bfxVar.l();
        for (Object obj : arrayList) {
            if (bfxVar instanceof ek00) {
                bfxVar.u();
                gfcVar.a(bfxVar, cVar, obj);
                bfxVar.y();
            } else {
                ek00 ek00Var = new ek00();
                ek00Var.u();
                gfcVar.a(ek00Var, cVar, obj);
                ek00Var.y();
                uga1.f(bfxVar, ek00Var.c());
            }
        }
        bfxVar.j();
    }
}
