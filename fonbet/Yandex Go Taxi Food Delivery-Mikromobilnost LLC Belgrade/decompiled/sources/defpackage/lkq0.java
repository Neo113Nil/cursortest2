package defpackage;

/* loaded from: classes10.dex */
public final class lkq0 implements dui0 {
    public final long a;
    public final zkq0 b;
    public final long c;
    public ymu w;
    public ho40 x;
    public final f530 y;

    public lkq0(long j, zkq0 zkq0Var, long j2) {
        ymu ymuVar = ymu.w;
        this.a = j;
        this.b = zkq0Var;
        this.c = j2;
        this.w = ymuVar;
        kkq0 kkq0Var = new kkq0(this, 2);
        mkq0 mkq0Var = new mkq0(kkq0Var, zkq0Var, j);
        nkq0 nkq0Var = new nkq0(kkq0Var, zkq0Var, j);
        y9m y9mVar = new y9m(1, nkq0Var, mkq0Var);
        tvd0 tvd0Var = exw0.a;
        www0 www0Var = new www0(nkq0Var, mkq0Var, y9mVar, 4);
        wvd0.a.getClass();
        this.y = yx91.b(www0Var, y5e.b0);
    }

    public final void a(dry0 dry0Var) {
        hkq0 hkq0Var;
        dry0 dry0Var2 = (dry0) this.w.c;
        if (dry0Var2 != null && !jl40.l(dry0Var2.a.a, dry0Var.a.a) && (hkq0Var = this.b.i) != null) {
            hkq0Var.invoke(Long.valueOf(this.a));
        }
        this.w = ymu.k(this.w, null, dry0Var, 1);
    }

    @Override // defpackage.dui0
    public final void b() {
        kkq0 kkq0Var = new kkq0(this, 0);
        kkq0 kkq0Var2 = new kkq0(this, 1);
        long j = this.a;
        ho40 ho40Var = new ho40(j, kkq0Var, kkq0Var2);
        zkq0 zkq0Var = this.b;
        gy40 gy40Var = zkq0Var.c;
        if (j == 0) {
            lxv.a("The selectable contains an invalid id: " + j);
        }
        if (gy40Var.b(j)) {
            lxv.a("Another selectable with the id: " + ho40Var + ".selectableId has already subscribed.");
        }
        gy40Var.h(j, ho40Var);
        zkq0Var.b.add(ho40Var);
        zkq0Var.a = false;
        this.x = ho40Var;
    }

    @Override // defpackage.dui0
    public final void d() {
        ho40 ho40Var = this.x;
        if (ho40Var != null) {
            this.b.d(ho40Var);
            this.x = null;
        }
    }

    @Override // defpackage.dui0
    public final void e() {
        ho40 ho40Var = this.x;
        if (ho40Var != null) {
            this.b.d(ho40Var);
            this.x = null;
        }
    }
}
