package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class foc0 implements b70 {
    public static final foc0 a = new foc0();
    public static final List b = scc.g("name", "value");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        doc0 doc0Var = (doc0) obj;
        bfxVar.A1("name");
        foe foeVar = l80.a;
        bfxVar.r0(doc0Var.a);
        bfxVar.A1("value");
        bfxVar.r0(doc0Var.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        String str2 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    return new doc0(str, str2);
                }
                foe foeVar2 = l80.a;
                str2 = xdxVar.nextString();
            }
        }
    }
}
