package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class l300 implements b70 {
    public static final l300 a = new l300();
    public static final List b = Collections.singletonList("agreement");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("agreement");
        ep60 a2 = l80.a(g300.a);
        z200 z200Var = ((e300) obj).a;
        if (z200Var == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, z200Var);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        z200 z200Var = null;
        while (xdxVar.h2(b) == 0) {
            ep60 a2 = l80.a(g300.a);
            if (xdxVar.peek() == JsonReader$Token.NULL) {
                xdxVar.skipValue();
                b2 = null;
            } else {
                b2 = a2.b(xdxVar, cVar);
            }
            z200Var = (z200) b2;
        }
        return new e300(z200Var);
    }
}
