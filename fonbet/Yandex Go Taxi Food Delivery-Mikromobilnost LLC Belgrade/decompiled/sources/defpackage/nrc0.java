package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class nrc0 implements b70 {
    public static final List a = scc.g("text", "textDecoration", "color", "metaColor", "metaStyle", "fontSize", "fontStyle", "fontWeight");

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        return new defpackage.mrc0(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static mrc0 c(xdx xdxVar, c cVar) {
        Object obj;
        String str = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            switch (xdxVar.h2(a)) {
                case 0:
                    foe foeVar = l80.a;
                    str = xdxVar.nextString();
                    break;
                case 1:
                    lqy lqyVar = new lqy(l80.i);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj = null;
                    } else {
                        obj = lqyVar.b(xdxVar, cVar);
                    }
                    list = (List) obj;
                    break;
                case 2:
                    str2 = (String) l80.i.b(xdxVar, cVar);
                    break;
                case 3:
                    str3 = (String) l80.i.b(xdxVar, cVar);
                    break;
                case 4:
                    str4 = (String) l80.i.b(xdxVar, cVar);
                    break;
                case 5:
                    num = (Integer) l80.k.b(xdxVar, cVar);
                    break;
                case 6:
                    str5 = (String) l80.i.b(xdxVar, cVar);
                    break;
                case 7:
                    str6 = (String) l80.i.b(xdxVar, cVar);
                    break;
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, mrc0 mrc0Var) {
        bfxVar.A1("text");
        foe foeVar = l80.a;
        bfxVar.r0(mrc0Var.a);
        bfxVar.A1("textDecoration");
        om60 om60Var = l80.i;
        lqy lqyVar = new lqy(om60Var);
        List list = mrc0Var.b;
        if (list == null) {
            bfxVar.k2();
        } else {
            lqyVar.a(bfxVar, cVar, list);
        }
        bfxVar.A1("color");
        om60Var.a(bfxVar, cVar, mrc0Var.c);
        bfxVar.A1("metaColor");
        om60Var.a(bfxVar, cVar, mrc0Var.d);
        bfxVar.A1("metaStyle");
        om60Var.a(bfxVar, cVar, mrc0Var.e);
        bfxVar.A1("fontSize");
        l80.k.a(bfxVar, cVar, mrc0Var.f);
        bfxVar.A1("fontStyle");
        om60Var.a(bfxVar, cVar, mrc0Var.g);
        bfxVar.A1("fontWeight");
        om60Var.a(bfxVar, cVar, mrc0Var.h);
    }
}
