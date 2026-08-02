package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes8.dex */
public final class jpc0 implements b70 {
    public static final jpc0 a = new jpc0();
    public static final List b = scc.g("argName", "intValue", "stringValue");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bpc0 bpc0Var = (bpc0) obj;
        bfxVar.A1("argName");
        foe foeVar = l80.a;
        bfxVar.r0(bpc0Var.a());
        bfxVar.A1("intValue");
        l80.k.a(bfxVar, cVar, bpc0Var.b());
        bfxVar.A1("stringValue");
        l80.i.a(bfxVar, cVar, bpc0Var.c());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        Integer num = null;
        String str2 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                num = (Integer) l80.k.b(xdxVar, cVar);
            } else {
                if (h2 != 2) {
                    return new bpc0(str, num, str2);
                }
                str2 = (String) l80.i.b(xdxVar, cVar);
            }
        }
    }
}
