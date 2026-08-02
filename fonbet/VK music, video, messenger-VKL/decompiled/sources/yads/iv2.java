package yads;

import java.util.Map;
import xsna.jgp;

/* loaded from: classes10.dex */
public final class iv2 implements fr2 {
    public final er2 a;
    public final qn3 b;

    public /* synthetic */ iv2(bu1 bu1Var) {
        this(e92.a(bu1Var), new qn3());
    }

    @Override // yads.fr2
    public final Object a(g92 g92Var) {
        this.b.getClass();
        int i = g92Var.a;
        yq2 yq2Var = new yq2(g92Var.b);
        Map map = g92Var.c;
        if (map == null) {
            map = jgp.b;
        }
        return (qu2) this.a.a(new xq2(i, yq2Var, map));
    }

    public iv2(er2 er2Var, qn3 qn3Var) {
        this.a = er2Var;
        this.b = qn3Var;
    }
}
