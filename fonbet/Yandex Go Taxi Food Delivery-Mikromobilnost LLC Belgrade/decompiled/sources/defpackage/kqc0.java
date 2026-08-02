package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class kqc0 implements b70 {
    public static final List a = scc.g("colors", "centralPoint");

    public static hqc0 c(xdx xdxVar, c cVar) {
        ArrayList arrayList = null;
        fqc0 fqc0Var = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                jqc0 jqc0Var = jqc0.a;
                foe foeVar = l80.a;
                ep60 ep60Var = new ep60(jqc0Var, true);
                xdxVar.l();
                arrayList = new ArrayList();
                while (xdxVar.hasNext()) {
                    arrayList.add(ep60Var.b(xdxVar, cVar));
                }
                xdxVar.j();
            } else {
                if (h2 != 1) {
                    return new hqc0(arrayList, fqc0Var);
                }
                iqc0 iqc0Var = iqc0.a;
                foe foeVar2 = l80.a;
                fqc0Var = (fqc0) new ep60(iqc0Var, true).b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, hqc0 hqc0Var) {
        bfxVar.A1("colors");
        jqc0 jqc0Var = jqc0.a;
        foe foeVar = l80.a;
        ArrayList arrayList = hqc0Var.a;
        bfxVar.l();
        for (Object obj : arrayList) {
            if (bfxVar instanceof ek00) {
                ek00 ek00Var = (ek00) bfxVar;
                ek00Var.u();
                jqc0Var.a(bfxVar, cVar, obj);
                ek00Var.y();
            } else {
                ek00 ek00Var2 = new ek00();
                ek00Var2.u();
                jqc0Var.a(ek00Var2, cVar, obj);
                ek00Var2.y();
                uga1.f(bfxVar, ek00Var2.c());
            }
        }
        bfxVar.j();
        bfxVar.A1("centralPoint");
        iqc0 iqc0Var = iqc0.a;
        fqc0 fqc0Var = hqc0Var.b;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var3 = (ek00) bfxVar;
            ek00Var3.u();
            iqc0Var.a(bfxVar, cVar, fqc0Var);
            ek00Var3.y();
            return;
        }
        ek00 ek00Var4 = new ek00();
        ek00Var4.u();
        iqc0Var.a(ek00Var4, cVar, fqc0Var);
        ek00Var4.y();
        uga1.f(bfxVar, ek00Var4.c());
    }
}
