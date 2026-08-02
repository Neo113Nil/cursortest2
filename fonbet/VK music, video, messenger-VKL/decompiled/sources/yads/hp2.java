package yads;

import xsna.pn00;

/* loaded from: classes10.dex */
public abstract class hp2 {
    public static final gp2 a(gp2 gp2Var, gp2 gp2Var2) {
        if (gp2Var2 == null) {
            return new gp2(gp2Var.a, gp2Var.b);
        }
        c cVar = gp2Var.b;
        if (cVar == null) {
            cVar = gp2Var2.b;
        }
        return new gp2(pn00.n(gp2Var.a, gp2Var2.a), cVar);
    }
}
