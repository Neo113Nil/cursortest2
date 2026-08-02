package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class j8f implements b70 {
    public static final j8f a = new j8f();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        f8f f8fVar = (f8f) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(f8fVar.a);
        List list = qxw.a;
        qxw.d(bfxVar, cVar, f8fVar.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new f8f(str, qxw.c(xdxVar, cVar));
    }
}
