package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.ARG_CHECKING_PREDICATE_TYPE;
import java.util.List;

/* loaded from: classes8.dex */
public final class gpc0 implements b70 {
    public static final gpc0 a = new gpc0();
    public static final List b = scc.g("type", "argName");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        yoc0 yoc0Var = (yoc0) obj;
        bfxVar.A1("type");
        n1.e(bfxVar, yoc0Var.b());
        bfxVar.A1("argName");
        foe foeVar = l80.a;
        bfxVar.r0(yoc0Var.a());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        ARG_CHECKING_PREDICATE_TYPE arg_checking_predicate_type = null;
        String str = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                arg_checking_predicate_type = n1.c(xdxVar);
            } else {
                if (h2 != 1) {
                    return new yoc0(arg_checking_predicate_type, str);
                }
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            }
        }
    }
}
