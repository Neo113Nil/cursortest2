package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class i2e implements b70 {
    public static final i2e a = new i2e();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        z1e z1eVar = (z1e) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(z1eVar.a);
        List list = cfc.a;
        cfc.d(bfxVar, cVar, z1eVar.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new z1e(str, cfc.c(xdxVar, cVar));
    }
}
