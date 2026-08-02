package defpackage;

/* loaded from: classes7.dex */
public final class mn81 extends lm81 {
    public final int o;
    public final long p;
    public final uz71 q;
    public long r;
    public volatile boolean s;
    public boolean t;

    public mn81(u871 u871Var, no71 no71Var, qd81 qd81Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, uz71 uz71Var) {
        super(u871Var, no71Var, qd81Var, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.q = uz71Var;
    }

    @Override // defpackage.zl61
    public final void a() {
        int e;
        if (this.r == 0) {
            gr81 gr81Var = this.m;
            if (gr81Var == null) {
                ny61.k();
                return;
            }
            long j = this.p;
            for (ed81 ed81Var : (ed81[]) gr81Var.c) {
                if (ed81Var.D != j) {
                    ed81Var.D = j;
                    ed81Var.y = true;
                }
            }
            uz71 uz71Var = this.q;
            long j2 = this.k;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.p;
            long j4 = this.l;
            uz71Var.b(gr81Var, j3, j4 != -9223372036854775807L ? j4 - this.p : -9223372036854775807L);
        }
        try {
            no71 no71Var = this.b;
            long j5 = this.r;
            long j6 = no71Var.f;
            long j7 = -1;
            if (j6 != -1) {
                j7 = j6 - j5;
            }
            no71 a = no71Var.a(j5, j7);
            bh81 bh81Var = this.i;
            w971 w971Var = new w971(bh81Var, a.e, bh81Var.Q(a));
            do {
                try {
                    if (this.s) {
                        break;
                    }
                    e = this.q.a.e(w971Var, uz71.D);
                    if (e == 1) {
                        throw new IllegalStateException();
                    }
                } finally {
                    this.r = w971Var.w - this.b.e;
                }
            } while (e == 0);
            xca1.c(this.i);
            this.t = !this.s;
        } catch (Throwable th) {
            xca1.c(this.i);
            throw th;
        }
    }

    @Override // defpackage.zl61
    public final void b() {
        this.s = true;
    }

    @Override // defpackage.lm81
    public final long c() {
        return this.j + this.o;
    }

    @Override // defpackage.lm81
    public final boolean d() {
        return this.t;
    }
}
