package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class jk21 implements b70 {
    public static final jk21 a = new jk21();
    public static final List b = Collections.singletonList("user");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("user");
        ep60 a2 = l80.a(kk21.a);
        gk21 gk21Var = ((fk21) obj).a;
        if (gk21Var == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, gk21Var);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        gk21 gk21Var = null;
        while (xdxVar.h2(b) == 0) {
            ep60 a2 = l80.a(kk21.a);
            if (xdxVar.peek() == JsonReader$Token.NULL) {
                xdxVar.skipValue();
                b2 = null;
            } else {
                b2 = a2.b(xdxVar, cVar);
            }
            gk21Var = (gk21) b2;
        }
        return new fk21(gk21Var);
    }
}
