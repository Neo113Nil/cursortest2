package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class krc0 implements b70 {
    public static final List a = Collections.singletonList("text");

    public static irc0 c(xdx xdxVar, c cVar) {
        hrc0 hrc0Var = null;
        while (xdxVar.h2(a) == 0) {
            hrc0Var = (hrc0) l80.a(lrc0.a).b(xdxVar, cVar);
        }
        return new irc0(hrc0Var);
    }

    public static void d(bfx bfxVar, c cVar, irc0 irc0Var) {
        bfxVar.A1("text");
        l80.a(lrc0.a).a(bfxVar, cVar, irc0Var.a);
    }
}
