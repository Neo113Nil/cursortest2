package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class n1e implements b70 {
    public static final List a = scc.g("name", "text");

    public static g1e c(xdx xdxVar, c cVar) {
        String str = null;
        String str2 = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    return new g1e(str, str2);
                }
                foe foeVar2 = l80.a;
                str2 = xdxVar.nextString();
            }
        }
    }
}
