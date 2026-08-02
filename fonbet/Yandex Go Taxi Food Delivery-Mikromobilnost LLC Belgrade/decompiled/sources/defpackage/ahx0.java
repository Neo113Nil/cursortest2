package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ahx0 implements b70 {
    public static final ahx0 a = new ahx0();
    public static final List b = Collections.singletonList("name");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("name");
        cVar.d(mgx0.a).a(bfxVar, cVar, ((wgx0) obj).a);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            str = (String) cVar.d(mgx0.a).b(xdxVar, cVar);
        }
        return new wgx0(str);
    }
}
