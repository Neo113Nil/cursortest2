package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class eeg implements b70 {
    public static final List a = scc.g("shape", "textColor", "textColors", C0553n3.g);

    public static ceg c(xdx xdxVar, c cVar) {
        Object b;
        Object b2;
        String str = null;
        String str2 = null;
        beg begVar = null;
        aeg aegVar = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                str = (String) l80.i.b(xdxVar, cVar);
            } else if (h2 == 1) {
                str2 = (String) l80.i.b(xdxVar, cVar);
            } else if (h2 == 2) {
                feg fegVar = feg.a;
                foe foeVar = l80.a;
                ep60 ep60Var = new ep60(fegVar, true);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = ep60Var.b(xdxVar, cVar);
                }
                begVar = (beg) b2;
            } else {
                if (h2 != 3) {
                    return new ceg(str, str2, begVar, aegVar);
                }
                ep60 a2 = l80.a(deg.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b = null;
                } else {
                    b = a2.b(xdxVar, cVar);
                }
                aegVar = (aeg) b;
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, ceg cegVar) {
        bfxVar.A1("shape");
        om60 om60Var = l80.i;
        om60Var.a(bfxVar, cVar, cegVar.a);
        bfxVar.A1("textColor");
        om60Var.a(bfxVar, cVar, cegVar.b);
        bfxVar.A1("textColors");
        ep60 ep60Var = new ep60(feg.a, true);
        beg begVar = cegVar.c;
        if (begVar == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, begVar);
        }
        bfxVar.A1(C0553n3.g);
        ep60 a2 = l80.a(deg.a);
        aeg aegVar = cegVar.d;
        if (aegVar == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, aegVar);
        }
    }
}
