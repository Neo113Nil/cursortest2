package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class j7e0 implements b70 {
    public static final j7e0 a = new j7e0();
    public static final List b = scc.g("textColor", C0553n3.g, "commonOverlays", "buttons");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        c7e0 c7e0Var = (c7e0) obj;
        bfxVar.A1("textColor");
        l80.i.a(bfxVar, cVar, c7e0Var.a);
        bfxVar.A1(C0553n3.g);
        ep60 a2 = l80.a(g7e0.a);
        z6e0 z6e0Var = c7e0Var.b;
        if (z6e0Var == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, z6e0Var);
        }
        bfxVar.A1("commonOverlays");
        lqy lqyVar = new lqy(new ep60(i7e0.a, true));
        List list = c7e0Var.c;
        if (list == null) {
            bfxVar.k2();
        } else {
            lqyVar.a(bfxVar, cVar, list);
        }
        bfxVar.A1("buttons");
        ep60 a3 = l80.a(h7e0.a);
        ArrayList arrayList = c7e0Var.d;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (obj2 == null) {
                bfxVar.k2();
            } else {
                a3.a(bfxVar, cVar, obj2);
            }
        }
        bfxVar.j();
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        Object b3;
        Object b4;
        String str = null;
        z6e0 z6e0Var = null;
        List list = null;
        ArrayList arrayList = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                str = (String) l80.i.b(xdxVar, cVar);
            } else if (h2 == 1) {
                ep60 a2 = l80.a(g7e0.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b4 = null;
                } else {
                    b4 = a2.b(xdxVar, cVar);
                }
                z6e0Var = (z6e0) b4;
            } else if (h2 == 2) {
                i7e0 i7e0Var = i7e0.a;
                foe foeVar = l80.a;
                lqy lqyVar = new lqy(new ep60(i7e0Var, true));
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b3 = null;
                } else {
                    b3 = lqyVar.b(xdxVar, cVar);
                }
                list = (List) b3;
            } else {
                if (h2 != 3) {
                    return new c7e0(str, z6e0Var, list, arrayList);
                }
                ep60 a3 = l80.a(h7e0.a);
                ArrayList z = oyr.z(xdxVar);
                while (xdxVar.hasNext()) {
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        b2 = null;
                    } else {
                        b2 = a3.b(xdxVar, cVar);
                    }
                    z.add(b2);
                }
                xdxVar.j();
                arrayList = z;
            }
        }
    }
}
