package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.COMPARISON_PREDICATE_TYPE;
import java.util.List;

/* loaded from: classes8.dex */
public final class ipc0 implements b70 {
    public static final ipc0 a = new ipc0();
    public static final List b = scc.g("type", "argName", "intValue", "doubleValue", "stringValue");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        apc0 apc0Var = (apc0) obj;
        bfxVar.A1("type");
        n1.f(bfxVar, apc0Var.e());
        bfxVar.A1("argName");
        foe foeVar = l80.a;
        bfxVar.r0(apc0Var.a());
        bfxVar.A1("intValue");
        l80.k.a(bfxVar, cVar, apc0Var.c());
        bfxVar.A1("doubleValue");
        l80.j.a(bfxVar, cVar, apc0Var.b());
        bfxVar.A1("stringValue");
        l80.i.a(bfxVar, cVar, apc0Var.d());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        COMPARISON_PREDICATE_TYPE comparison_predicate_type = null;
        String str = null;
        Integer num = null;
        Double d = null;
        String str2 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                comparison_predicate_type = n1.d(xdxVar);
            } else if (h2 == 1) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 2) {
                num = (Integer) l80.k.b(xdxVar, cVar);
            } else if (h2 == 3) {
                d = (Double) l80.j.b(xdxVar, cVar);
            } else {
                if (h2 != 4) {
                    return new apc0(comparison_predicate_type, str, num, d, str2);
                }
                str2 = (String) l80.i.b(xdxVar, cVar);
            }
        }
    }
}
