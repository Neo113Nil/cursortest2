package yads;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class z30 {
    public final jp2 a;
    public final gp2 b;

    public z30(bu1 bu1Var, gp2 gp2Var) {
        this.a = bu1Var;
        this.b = gp2Var;
    }

    public final void a(y30 y30Var) {
        this.b.b(y30Var.b, "log_type");
        dp2 dp2Var = dp2.c;
        gp2 gp2Var = this.b;
        Map map = gp2Var.a;
        this.a.a(new fp2("log", new LinkedHashMap(map), gp2Var.b));
    }
}
