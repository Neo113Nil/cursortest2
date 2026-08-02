package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class dsc0 implements b70 {
    public static final List a = Collections.singletonList("__typename");

    public static yrc0 c(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(a) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new yrc0(str, nrc0.c(xdxVar, cVar));
    }
}
