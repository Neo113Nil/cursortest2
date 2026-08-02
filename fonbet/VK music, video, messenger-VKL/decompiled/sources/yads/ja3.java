package yads;

/* loaded from: classes10.dex */
public final class ja3 implements vx2 {
    public final jc2 a = new jc2(new byte[4]);
    public final /* synthetic */ la3 b;

    public ja3(la3 la3Var) {
        this.b = la3Var;
    }

    @Override // yads.vx2
    public final void a(c83 c83Var, qq0 qq0Var, pa3 pa3Var) {
    }

    @Override // yads.vx2
    public final void a(kc2 kc2Var) {
        if (kc2Var.m() == 0 && (kc2Var.m() & 128) != 0) {
            kc2Var.e(kc2Var.b + 6);
            int i = (kc2Var.c - kc2Var.b) / 4;
            for (int i2 = 0; i2 < i; i2++) {
                jc2 jc2Var = this.a;
                kc2Var.a(jc2Var.a, 0, 4);
                jc2Var.b(0);
                int a = this.a.a(16);
                this.a.c(3);
                if (a == 0) {
                    this.a.c(13);
                } else {
                    int a2 = this.a.a(13);
                    if (this.b.g.get(a2) == null) {
                        la3 la3Var = this.b;
                        la3Var.g.put(a2, new wx2(new ka3(la3Var, a2)));
                        this.b.m++;
                    }
                }
            }
            la3 la3Var2 = this.b;
            if (la3Var2.a != 2) {
                la3Var2.g.remove(0);
            }
        }
    }
}
