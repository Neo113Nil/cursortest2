package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class l2e implements b70 {
    public static final List a = scc.g("name", "id", "textStyle", C0553n3.g, "commonOverlays", "actions");

    public static e2e c(xdx xdxVar, c cVar) {
        Object obj;
        Object obj2;
        Object obj3;
        String str = null;
        String str2 = null;
        d2e d2eVar = null;
        y1e y1eVar = null;
        List list = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                foe foeVar2 = l80.a;
                str2 = xdxVar.nextString();
            } else if (h2 == 2) {
                ep60 a2 = l80.a(n2e.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj3 = null;
                } else {
                    obj3 = a2.b(xdxVar, cVar);
                }
                d2eVar = (d2e) obj3;
            } else if (h2 == 3) {
                ep60 a3 = l80.a(h2e.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj2 = null;
                } else {
                    obj2 = a3.b(xdxVar, cVar);
                }
                y1eVar = (y1e) obj2;
            } else if (h2 == 4) {
                k2e k2eVar = k2e.a;
                foe foeVar3 = l80.a;
                lqy lqyVar = new lqy(new ep60(k2eVar, true));
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj = null;
                } else {
                    obj = lqyVar.b(xdxVar, cVar);
                }
                list = (List) obj;
            } else {
                if (h2 != 5) {
                    return new e2e(str, str2, d2eVar, y1eVar, list, arrayList);
                }
                g2e g2eVar = g2e.a;
                foe foeVar4 = l80.a;
                ep60 ep60Var = new ep60(g2eVar, true);
                xdxVar.l();
                ArrayList arrayList2 = new ArrayList();
                while (xdxVar.hasNext()) {
                    arrayList2.add(ep60Var.b(xdxVar, cVar));
                }
                xdxVar.j();
                arrayList = arrayList2;
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, e2e e2eVar) {
        bfxVar.A1("name");
        foe foeVar = l80.a;
        bfxVar.r0(e2eVar.a);
        bfxVar.A1("id");
        bfxVar.r0(e2eVar.b);
        bfxVar.A1("textStyle");
        ep60 a2 = l80.a(n2e.a);
        d2e d2eVar = e2eVar.c;
        if (d2eVar == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, d2eVar);
        }
        bfxVar.A1(C0553n3.g);
        ep60 a3 = l80.a(h2e.a);
        y1e y1eVar = e2eVar.d;
        if (y1eVar == null) {
            bfxVar.k2();
        } else {
            a3.a(bfxVar, cVar, y1eVar);
        }
        bfxVar.A1("commonOverlays");
        lqy lqyVar = new lqy(new ep60(k2e.a, true));
        List list = e2eVar.e;
        if (list == null) {
            bfxVar.k2();
        } else {
            lqyVar.c(bfxVar, cVar, list);
        }
        bfxVar.A1("actions");
        g2e g2eVar = g2e.a;
        ArrayList arrayList = e2eVar.f;
        bfxVar.l();
        for (Object obj : arrayList) {
            if (bfxVar instanceof ek00) {
                bfxVar.u();
                g2eVar.a(bfxVar, cVar, obj);
                bfxVar.y();
            } else {
                ek00 ek00Var = new ek00();
                ek00Var.u();
                g2eVar.a(ek00Var, cVar, obj);
                ek00Var.y();
                uga1.f(bfxVar, ek00Var.c());
            }
        }
        bfxVar.j();
    }
}
