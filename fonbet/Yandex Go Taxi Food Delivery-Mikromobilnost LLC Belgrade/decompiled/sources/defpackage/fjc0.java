package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class fjc0 implements b70 {
    public static final List a = Collections.singletonList("text");

    public static djc0 c(xdx xdxVar, c cVar) {
        cjc0 cjc0Var = null;
        while (xdxVar.h2(a) == 0) {
            cjc0Var = (cjc0) l80.a(gjc0.a).b(xdxVar, cVar);
        }
        return new djc0(cjc0Var);
    }

    public static void d(bfx bfxVar, c cVar, djc0 djc0Var) {
        bfxVar.A1("text");
        l80.a(gjc0.a).a(bfxVar, cVar, djc0Var.a);
    }
}
