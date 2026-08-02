package yads;

import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class s03 implements u32 {
    public final gz1 a;
    public final br2 b;
    public final n9 c;
    public final wy d;

    public s03(gz1 gz1Var, br2 br2Var, n9 n9Var, wy wyVar) {
        this.a = gz1Var;
        this.b = br2Var;
        this.c = n9Var;
        this.d = wyVar;
    }

    @Override // yads.u32
    public final gp2 a(v9 v9Var, d4 d4Var, e22 e22Var) {
        br2 br2Var = this.b;
        gz1 gz1Var = this.a;
        gp2 a = br2Var.a(v9Var, d4Var);
        if (e22Var != null) {
            List a2 = br2Var.b.a(e22Var);
            if (!a2.isEmpty()) {
                a.a(a2, "image_sizes");
            }
        }
        a.b(gz1Var.c, "ad_id");
        Map map = gz1Var.l;
        if (map != null) {
            a.a.putAll(map);
        }
        gp2 a3 = this.c.a(d4Var.e);
        return hp2.a(hp2.a(a, a3), this.d.a(d4Var));
    }
}
