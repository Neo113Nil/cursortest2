package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class k2u implements b70 {
    public static final k2u a = new k2u();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        f2u f2uVar = (f2u) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(f2uVar.a);
        List list = tqc0.a;
        tqc0.d(bfxVar, cVar, f2uVar.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new f2u(str, tqc0.c(xdxVar, cVar));
    }
}
