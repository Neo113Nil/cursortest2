package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class i300 implements b70 {
    public static final List a = scc.g("name", "text", "url");

    public static b300 c(xdx xdxVar, c cVar) {
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                foe foeVar2 = l80.a;
                str2 = xdxVar.nextString();
            } else {
                if (h2 != 2) {
                    return new b300(str, str2, str3);
                }
                foe foeVar3 = l80.a;
                str3 = xdxVar.nextString();
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, b300 b300Var) {
        bfxVar.A1("name");
        foe foeVar = l80.a;
        bfxVar.r0(b300Var.a);
        bfxVar.A1("text");
        bfxVar.r0(b300Var.b);
        bfxVar.A1("url");
        bfxVar.r0(b300Var.c);
    }
}
