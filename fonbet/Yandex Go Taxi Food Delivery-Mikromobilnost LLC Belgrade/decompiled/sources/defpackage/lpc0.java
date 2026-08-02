package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class lpc0 implements b70 {
    public static final lpc0 a = new lpc0();
    public static final List b = Collections.singletonList("nodeId");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("nodeId");
        l80.b.a(bfxVar, cVar, Integer.valueOf(((dpc0) obj).a()));
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Integer num = null;
        while (xdxVar.h2(b) == 0) {
            num = (Integer) l80.b.b(xdxVar, cVar);
        }
        return new dpc0(num.intValue());
    }
}
