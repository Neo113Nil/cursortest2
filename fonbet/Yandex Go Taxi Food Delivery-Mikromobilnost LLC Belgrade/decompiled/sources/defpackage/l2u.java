package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class l2u implements b70 {
    public static final List a = scc.g("indentRules", "backgroundColorSettings", "backgroundShapeSettings", "width");

    public static i2u c(xdx xdxVar, c cVar) {
        g2u g2uVar = null;
        ArrayList arrayList = null;
        f2u f2uVar = null;
        h2u h2uVar = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                m2u m2uVar = m2u.a;
                foe foeVar = l80.a;
                g2uVar = (g2u) new ep60(m2uVar, true).b(xdxVar, cVar);
            } else if (h2 == 1) {
                j2u j2uVar = j2u.a;
                foe foeVar2 = l80.a;
                ep60 ep60Var = new ep60(j2uVar, true);
                xdxVar.l();
                arrayList = new ArrayList();
                while (xdxVar.hasNext()) {
                    arrayList.add(ep60Var.b(xdxVar, cVar));
                }
                xdxVar.j();
            } else if (h2 == 2) {
                k2u k2uVar = k2u.a;
                foe foeVar3 = l80.a;
                f2uVar = (f2u) new ep60(k2uVar, true).b(xdxVar, cVar);
            } else {
                if (h2 != 3) {
                    return new i2u(g2uVar, arrayList, f2uVar, h2uVar);
                }
                n2u n2uVar = n2u.a;
                foe foeVar4 = l80.a;
                h2uVar = (h2u) new ep60(n2uVar, true).b(xdxVar, cVar);
            }
        }
    }
}
