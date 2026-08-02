package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class k1e implements b70 {
    public static final k1e a = new k1e();
    public static final List b = Collections.singletonList("color");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("color");
        l80.i.a(bfxVar, cVar, ((e1e) obj).a);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            str = (String) l80.i.b(xdxVar, cVar);
        }
        return new e1e(str);
    }
}
