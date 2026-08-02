package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class jnd implements b70 {
    public static final List a = scc.g("__typename", "widgetOpenCardUrls");

    public static omd c(xdx xdxVar, c cVar) {
        String str = null;
        umd umdVar = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    xdxVar.rewind();
                    return new omd(str, umdVar, p5a0.c(xdxVar, cVar));
                }
                umdVar = (umd) l80.a(pnd.a).b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, omd omdVar) {
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(omdVar.a);
        bfxVar.A1("widgetOpenCardUrls");
        l80.a(pnd.a).a(bfxVar, cVar, omdVar.b);
        List list = p5a0.a;
        p5a0.d(bfxVar, cVar, omdVar.c);
    }
}
