package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ku21 implements b70 {
    public static final ku21 a = new ku21();
    public static final List b = Collections.singletonList("userSyncStatus");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("userSyncStatus");
        l80.a(lu21.a).a(bfxVar, cVar, ((hu21) obj).a);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        iu21 iu21Var = null;
        while (xdxVar.h2(b) == 0) {
            iu21Var = (iu21) l80.a(lu21.a).b(xdxVar, cVar);
        }
        return new hu21(iu21Var);
    }
}
