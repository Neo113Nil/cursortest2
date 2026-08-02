package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class i8f implements b70 {
    public static final i8f a = new i8f();
    public static final List b = Collections.singletonList("invoice");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("invoice");
        l80.a(k8f.a).a(bfxVar, cVar, ((e8f) obj).a);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        g8f g8fVar = null;
        while (xdxVar.h2(b) == 0) {
            g8fVar = (g8f) l80.a(k8f.a).b(xdxVar, cVar);
        }
        return new e8f(g8fVar);
    }
}
