package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ind implements b70 {
    public static final List a = Collections.singletonList("__typename");

    public static nmd c(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(a) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new nmd(str, p5a0.c(xdxVar, cVar));
    }
}
