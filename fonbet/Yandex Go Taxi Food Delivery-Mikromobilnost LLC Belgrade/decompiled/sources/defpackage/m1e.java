package defpackage;

import com.apollographql.apollo3.api.a;
import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class m1e implements b70 {
    public static final m1e a = new m1e();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        f1e f1eVar = (f1e) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(f1eVar.a);
        g1e g1eVar = f1eVar.b;
        if (g1eVar != null) {
            List list = n1e.a;
            bfxVar.A1("name");
            bfxVar.r0(g1eVar.a);
            bfxVar.A1("text");
            bfxVar.r0(g1eVar.b);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        j70 j70Var = cVar.a;
        g1e g1eVar = null;
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        if (str == null) {
            ny61.r("__typename was not found");
            return null;
        }
        if (a.a(a.b("TextProperties"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            g1eVar = n1e.c(xdxVar, cVar);
        }
        return new f1e(str, g1eVar);
    }
}
