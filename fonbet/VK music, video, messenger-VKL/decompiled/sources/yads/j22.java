package yads;

import com.ironsource.O6;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class j22 implements gr2 {
    public final d4 a;
    public final u32 b;
    public final ks1 c;
    public v9 d;

    public /* synthetic */ j22(d4 d4Var) {
        this(d4Var, new g32(), new ks1());
    }

    public final gp2 a() {
        gp2 gp2Var;
        gp2 gp2Var2 = new gp2((Map) null, 3);
        v9 v9Var = this.d;
        if (v9Var == null) {
            return gp2Var2;
        }
        gp2 a = hp2.a(gp2Var2, this.b.a(v9Var, this.a, (e22) v9Var.t));
        rr1 rr1Var = this.a.k;
        ks1 ks1Var = this.c;
        if (rr1Var != null) {
            ks1Var.getClass();
            gp2Var = ks1.a(rr1Var);
        } else {
            ks1Var.getClass();
            gp2Var = new gp2(new LinkedHashMap(), 2);
            gp2Var.b(cp2.a, O6.G1);
        }
        return hp2.a(a, gp2Var);
    }

    public j22(d4 d4Var, u32 u32Var, ks1 ks1Var) {
        this.a = d4Var;
        this.b = u32Var;
        this.c = ks1Var;
    }

    public final void a(v9 v9Var) {
        this.d = v9Var;
    }
}
