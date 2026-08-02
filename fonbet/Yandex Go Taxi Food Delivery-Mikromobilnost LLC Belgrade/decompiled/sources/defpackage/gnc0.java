package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes8.dex */
public final class gnc0 implements b70 {
    public static final gnc0 a = new gnc0();
    public static final List b = scc.g("showAfter", "closeAfter");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        vhc0 vhc0Var = (vhc0) obj;
        bfxVar.A1("showAfter");
        om60 om60Var = l80.k;
        om60Var.a(bfxVar, cVar, vhc0Var.a);
        bfxVar.A1("closeAfter");
        om60Var.a(bfxVar, cVar, vhc0Var.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Integer num = null;
        Integer num2 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                num = (Integer) l80.k.b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new vhc0(num, num2);
                }
                num2 = (Integer) l80.k.b(xdxVar, cVar);
            }
        }
    }
}
