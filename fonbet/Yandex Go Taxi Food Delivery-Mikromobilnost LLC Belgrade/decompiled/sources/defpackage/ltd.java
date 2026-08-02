package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ltd implements b70 {
    public static final ltd a = new ltd();
    public static final List b = Collections.singletonList("upsaleComposites");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("upsaleComposites");
        l80.a(ptd.a).a(bfxVar, cVar, ((dtd) obj).a);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        htd htdVar = null;
        while (xdxVar.h2(b) == 0) {
            htdVar = (htd) l80.a(ptd.a).b(xdxVar, cVar);
        }
        return new dtd(htdVar);
    }
}
