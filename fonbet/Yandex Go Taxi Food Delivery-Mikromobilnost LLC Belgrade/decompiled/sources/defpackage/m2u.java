package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class m2u implements b70 {
    public static final m2u a = new m2u();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        g2u g2uVar = (g2u) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(g2uVar.a);
        List list = knc0.a;
        knc0.d(bfxVar, cVar, g2uVar.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new g2u(str, knc0.c(xdxVar, cVar));
    }
}
