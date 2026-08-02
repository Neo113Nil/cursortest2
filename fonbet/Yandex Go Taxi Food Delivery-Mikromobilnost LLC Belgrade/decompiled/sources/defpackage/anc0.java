package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class anc0 implements b70 {
    public static final List a = scc.g("color", "metaColor", "verticalAlignment", "imageTag", "width", "height");

    public static zmc0 c(xdx xdxVar, c cVar) {
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        Integer num2 = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                str = (String) l80.i.b(xdxVar, cVar);
            } else if (h2 == 1) {
                str2 = (String) l80.i.b(xdxVar, cVar);
            } else if (h2 == 2) {
                str3 = (String) l80.i.b(xdxVar, cVar);
            } else if (h2 == 3) {
                foe foeVar = l80.a;
                str4 = xdxVar.nextString();
            } else if (h2 == 4) {
                num = (Integer) l80.k.b(xdxVar, cVar);
            } else {
                if (h2 != 5) {
                    return new zmc0(str, str2, str3, str4, num, num2);
                }
                num2 = (Integer) l80.k.b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, zmc0 zmc0Var) {
        bfxVar.A1("color");
        om60 om60Var = l80.i;
        om60Var.a(bfxVar, cVar, zmc0Var.a);
        bfxVar.A1("metaColor");
        om60Var.a(bfxVar, cVar, zmc0Var.b);
        bfxVar.A1("verticalAlignment");
        om60Var.a(bfxVar, cVar, zmc0Var.c);
        bfxVar.A1("imageTag");
        bfxVar.r0(zmc0Var.d);
        bfxVar.A1("width");
        om60 om60Var2 = l80.k;
        om60Var2.a(bfxVar, cVar, zmc0Var.e);
        bfxVar.A1("height");
        om60Var2.a(bfxVar, cVar, zmc0Var.f);
    }
}
