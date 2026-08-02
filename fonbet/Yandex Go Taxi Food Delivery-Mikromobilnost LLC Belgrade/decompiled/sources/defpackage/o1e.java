package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class o1e implements b70 {
    public static final o1e a = new o1e();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        h1e h1eVar = (h1e) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(h1eVar.a);
        List list = cfc.a;
        cfc.d(bfxVar, cVar, h1eVar.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new h1e(str, cfc.c(xdxVar, cVar));
    }
}
