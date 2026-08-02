package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class l1e implements b70 {
    public static final List a = scc.g("text", "shape", "textColor", "textColors", C0553n3.g, "attributedText");

    public static i1e c(xdx xdxVar, c cVar) {
        Object obj;
        Object obj2;
        Object obj3;
        String str = null;
        String str2 = null;
        String str3 = null;
        h1e h1eVar = null;
        e1e e1eVar = null;
        d1e d1eVar = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                str = (String) l80.i.b(xdxVar, cVar);
            } else if (h2 == 1) {
                str2 = (String) l80.i.b(xdxVar, cVar);
            } else if (h2 == 2) {
                str3 = (String) l80.i.b(xdxVar, cVar);
            } else if (h2 == 3) {
                o1e o1eVar = o1e.a;
                foe foeVar = l80.a;
                ep60 ep60Var = new ep60(o1eVar, true);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj3 = null;
                } else {
                    obj3 = ep60Var.b(xdxVar, cVar);
                }
                h1eVar = (h1e) obj3;
            } else if (h2 == 4) {
                ep60 a2 = l80.a(k1e.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj2 = null;
                } else {
                    obj2 = a2.b(xdxVar, cVar);
                }
                e1eVar = (e1e) obj2;
            } else {
                if (h2 != 5) {
                    return new i1e(str, str2, str3, h1eVar, e1eVar, d1eVar);
                }
                ep60 a3 = l80.a(j1e.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    obj = null;
                } else {
                    obj = a3.b(xdxVar, cVar);
                }
                d1eVar = (d1e) obj;
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, i1e i1eVar) {
        bfxVar.A1("text");
        om60 om60Var = l80.i;
        om60Var.a(bfxVar, cVar, i1eVar.a);
        bfxVar.A1("shape");
        om60Var.a(bfxVar, cVar, i1eVar.b);
        bfxVar.A1("textColor");
        om60Var.a(bfxVar, cVar, i1eVar.c);
        bfxVar.A1("textColors");
        ep60 ep60Var = new ep60(o1e.a, true);
        h1e h1eVar = i1eVar.d;
        if (h1eVar == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, h1eVar);
        }
        bfxVar.A1(C0553n3.g);
        ep60 a2 = l80.a(k1e.a);
        e1e e1eVar = i1eVar.e;
        if (e1eVar == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, e1eVar);
        }
        bfxVar.A1("attributedText");
        ep60 a3 = l80.a(j1e.a);
        d1e d1eVar = i1eVar.f;
        if (d1eVar == null) {
            bfxVar.k2();
        } else {
            a3.a(bfxVar, cVar, d1eVar);
        }
    }
}
