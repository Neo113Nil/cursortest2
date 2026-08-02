package yads;

import java.util.Map;
import xsna.drm0;
import xsna.j8y;
import xsna.jgp;

/* loaded from: classes10.dex */
public final class ic1 implements vn3 {
    public final er2 a;
    public final j8y b;
    public final qn3 c;

    public ic1(m53 m53Var, j8y j8yVar, qn3 qn3Var) {
        this.a = m53Var;
        this.b = j8yVar;
        this.c = qn3Var;
    }

    @Override // yads.vn3
    public final Object a(g92 g92Var) {
        this.c.getClass();
        int i = g92Var.a;
        yq2 yq2Var = new yq2(g92Var.b);
        Map map = g92Var.c;
        if (map == null) {
            map = jgp.b;
        }
        String str = (String) this.a.a(new xq2(i, yq2Var, map));
        if (str == null || drm0.N(str)) {
            return null;
        }
        j8y j8yVar = this.b;
        j8yVar.getClass();
        return (j80) j8yVar.a(j80.Companion.serializer(), str);
    }
}
