package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class mi4 implements b70 {
    public static final mi4 a = new mi4();
    public static final List b = scc.g("a", "hex", "location");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        ei4 ei4Var = (ei4) obj;
        bfxVar.A1("a");
        foe foeVar = l80.c;
        foeVar.a(bfxVar, cVar, Double.valueOf(ei4Var.a));
        bfxVar.A1("hex");
        foe foeVar2 = l80.a;
        bfxVar.r0(ei4Var.b);
        bfxVar.A1("location");
        foeVar.a(bfxVar, cVar, Double.valueOf(ei4Var.c));
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Double d = null;
        Double d2 = null;
        String str = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                d = (Double) l80.c.b(xdxVar, cVar);
            } else if (h2 == 1) {
                Double d3 = d2;
                foe foeVar = l80.a;
                str = xdxVar.nextString();
                d2 = d3;
            } else {
                if (h2 != 2) {
                    return new ei4(str, d.doubleValue(), d2.doubleValue());
                }
                d2 = (Double) l80.c.b(xdxVar, cVar);
            }
        }
    }
}
