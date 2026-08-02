package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class k8f implements b70 {
    public static final k8f a = new k8f();
    public static final List b = Collections.singletonList("externalCreate");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("externalCreate");
        j8f j8fVar = j8f.a;
        foe foeVar = l80.a;
        f8f f8fVar = ((g8f) obj).a;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            j8fVar.a(bfxVar, cVar, f8fVar);
            ek00Var.y();
            return;
        }
        ek00 ek00Var2 = new ek00();
        ek00Var2.u();
        j8fVar.a(ek00Var2, cVar, f8fVar);
        ek00Var2.y();
        uga1.f(bfxVar, ek00Var2.c());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        f8f f8fVar = null;
        while (xdxVar.h2(b) == 0) {
            j8f j8fVar = j8f.a;
            foe foeVar = l80.a;
            f8fVar = (f8f) new ep60(j8fVar, true).b(xdxVar, cVar);
        }
        return new g8f(f8fVar);
    }
}
