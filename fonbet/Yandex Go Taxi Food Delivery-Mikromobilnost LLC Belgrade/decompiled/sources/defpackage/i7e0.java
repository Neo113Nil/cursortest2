package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class i7e0 implements b70 {
    public static final i7e0 a = new i7e0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        b7e0 b7e0Var = (b7e0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(b7e0Var.a);
        List list = l1e.a;
        l1e.d(bfxVar, cVar, b7e0Var.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new b7e0(str, l1e.c(xdxVar, cVar));
    }
}
