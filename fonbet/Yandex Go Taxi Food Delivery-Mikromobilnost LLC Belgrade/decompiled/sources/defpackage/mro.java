package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class mro implements b70 {
    public static final mro a = new mro();
    public static final List b = Collections.singletonList("experiments");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("experiments");
        l80.a(nro.a).a(bfxVar, cVar, ((iro) obj).a);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        jro jroVar = null;
        while (xdxVar.h2(b) == 0) {
            jroVar = (jro) l80.a(nro.a).b(xdxVar, cVar);
        }
        return new iro(jroVar);
    }
}
