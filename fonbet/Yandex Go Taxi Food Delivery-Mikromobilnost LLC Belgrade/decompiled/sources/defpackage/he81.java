package defpackage;

/* loaded from: classes7.dex */
public final class he81 extends lg81 {
    public final uz71 j;
    public gr81 k;
    public long l;
    public volatile boolean m;

    public he81(u871 u871Var, no71 no71Var, qd81 qd81Var, int i, Object obj, uz71 uz71Var) {
        super(u871Var, no71Var, 2, qd81Var, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.j = uz71Var;
    }

    @Override // defpackage.zl61
    public final void a() {
        int e;
        if (this.l == 0) {
            this.j.b(this.k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            no71 no71Var = this.b;
            long j = this.l;
            long j2 = no71Var.f;
            long j3 = -1;
            if (j2 != -1) {
                j3 = j2 - j;
            }
            no71 a = no71Var.a(j, j3);
            bh81 bh81Var = this.i;
            w971 w971Var = new w971(bh81Var, a.e, bh81Var.Q(a));
            do {
                try {
                    if (this.m) {
                        break;
                    }
                    e = this.j.a.e(w971Var, uz71.D);
                    if (e == 1) {
                        throw new IllegalStateException();
                    }
                } finally {
                    this.l = w971Var.w - this.b.e;
                }
            } while (e == 0);
        } finally {
            xca1.c(this.i);
        }
    }

    @Override // defpackage.zl61
    public final void b() {
        this.m = true;
    }
}
