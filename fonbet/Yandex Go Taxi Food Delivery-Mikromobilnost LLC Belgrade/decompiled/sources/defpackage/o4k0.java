package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class o4k0 implements b70 {
    public static final o4k0 a = new o4k0();
    public static final List b = Collections.singletonList("url");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("url");
        foe foeVar = l80.a;
        bfxVar.r0(((c4k0) obj).a);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        return new c4k0(str);
    }
}
