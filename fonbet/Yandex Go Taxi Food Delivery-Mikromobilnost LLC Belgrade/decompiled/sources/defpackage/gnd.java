package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class gnd implements b70 {
    public static final List a = scc.g("__typename", "bankName", "widgetUrls");

    public static lmd c(xdx xdxVar, c cVar) {
        Object b;
        String str = null;
        String str2 = null;
        xmd xmdVar = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                str2 = (String) l80.i.b(xdxVar, cVar);
            } else {
                if (h2 != 2) {
                    xdxVar.rewind();
                    return new lmd(str, str2, xmdVar, p5a0.c(xdxVar, cVar));
                }
                ep60 a2 = l80.a(snd.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b = null;
                } else {
                    b = a2.b(xdxVar, cVar);
                }
                xmdVar = (xmd) b;
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, lmd lmdVar) {
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(lmdVar.a);
        bfxVar.A1("bankName");
        l80.i.a(bfxVar, cVar, lmdVar.b);
        bfxVar.A1("widgetUrls");
        ep60 a2 = l80.a(snd.a);
        xmd xmdVar = lmdVar.c;
        if (xmdVar == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, xmdVar);
        }
        List list = p5a0.a;
        p5a0.d(bfxVar, cVar, lmdVar.d);
    }
}
