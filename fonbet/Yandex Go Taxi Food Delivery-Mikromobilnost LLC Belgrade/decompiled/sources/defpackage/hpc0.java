package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class hpc0 implements b70 {
    public static final hpc0 a = new hpc0();
    public static final List b = Collections.singletonList("value");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("value");
        l80.f.a(bfxVar, cVar, Boolean.valueOf(((zoc0) obj).a()));
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Boolean bool = null;
        while (xdxVar.h2(b) == 0) {
            bool = (Boolean) l80.f.b(xdxVar, cVar);
        }
        return new zoc0(bool.booleanValue());
    }
}
