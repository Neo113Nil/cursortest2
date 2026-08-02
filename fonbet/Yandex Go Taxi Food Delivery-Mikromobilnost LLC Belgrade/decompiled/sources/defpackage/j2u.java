package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class j2u implements b70 {
    public static final j2u a = new j2u();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        e2u e2uVar = (e2u) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(e2uVar.a);
        List list = wjc0.a;
        wjc0.d(bfxVar, cVar, e2uVar.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new e2u(str, wjc0.c(xdxVar, cVar));
    }
}
