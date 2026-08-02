package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class goc0 implements b70 {
    public static final List a = Collections.singletonList("metrics");

    public static eoc0 c(xdx xdxVar, c cVar) {
        Object b;
        List list = null;
        while (xdxVar.h2(a) == 0) {
            lqy lqyVar = new lqy(l80.a(foc0.a));
            if (xdxVar.peek() == JsonReader$Token.NULL) {
                xdxVar.skipValue();
                b = null;
            } else {
                b = lqyVar.b(xdxVar, cVar);
            }
            list = (List) b;
        }
        return new eoc0(list);
    }

    public static void d(bfx bfxVar, c cVar, eoc0 eoc0Var) {
        bfxVar.A1("metrics");
        lqy lqyVar = new lqy(l80.a(foc0.a));
        List list = eoc0Var.a;
        if (list == null) {
            bfxVar.k2();
        } else {
            lqyVar.c(bfxVar, cVar, list);
        }
    }
}
