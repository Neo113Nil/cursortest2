package yads;

import com.ironsource.O6;

/* loaded from: classes10.dex */
public final class jg3 implements eh3 {
    public final d4 a;
    public final v9 b;
    public final u32 c;

    public /* synthetic */ jg3(d4 d4Var, v9 v9Var) {
        this(d4Var, v9Var, new g32());
    }

    @Override // yads.eh3
    public final gp2 a() {
        v9 v9Var = this.b;
        e22 e22Var = (e22) v9Var.t;
        if (e22Var == null) {
            e22Var = null;
        }
        gp2 a = this.c.a(v9Var, this.a, e22Var);
        a.b(cp2.a, O6.G1);
        a.b = this.b.i;
        return a;
    }

    public jg3(d4 d4Var, v9 v9Var, u32 u32Var) {
        this.a = d4Var;
        this.b = v9Var;
        this.c = u32Var;
    }
}
