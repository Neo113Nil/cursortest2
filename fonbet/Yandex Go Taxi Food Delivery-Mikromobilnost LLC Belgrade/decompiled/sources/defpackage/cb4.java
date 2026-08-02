package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class cb4 implements b70 {
    public static final List a = scc.g("empty", "passportAvatarId");

    public static xa4 c(xdx xdxVar, c cVar) {
        Boolean bool = null;
        String str = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                bool = (Boolean) l80.f.b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new xa4(bool.booleanValue(), str);
                }
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            }
        }
    }
}
