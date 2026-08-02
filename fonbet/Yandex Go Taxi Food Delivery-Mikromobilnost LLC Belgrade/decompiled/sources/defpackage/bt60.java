package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class bt60 implements b70 {
    public static final List a = Collections.singletonList("__typename");

    public static vs60 c(xdx xdxVar, c cVar) {
        Object obj = null;
        String str = null;
        while (xdxVar.h2(a) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        List list = rt60.a;
        while (xdxVar.h2(rt60.a) == 0) {
            foe foeVar2 = l80.a;
            obj = ooc.y(xdxVar);
        }
        return new vs60(str, new qt60(obj));
    }
}
