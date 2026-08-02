package defpackage;

import androidx.media3.common.a;

/* loaded from: classes10.dex */
public final class fee extends z35 {
    public final int H;
    public final long I;
    public final osb J;
    public long K;
    public volatile boolean L;
    public boolean M;

    public fee(kpg kpgVar, npg npgVar, a aVar, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, osb osbVar) {
        super(kpgVar, npgVar, aVar, i, obj, j, j2, j3, j4, j5);
        this.H = i2;
        this.I = j6;
        this.J = osbVar;
    }

    @Override // defpackage.ib10
    public final long a() {
        return this.C + this.H;
    }

    @Override // defpackage.ib10
    public final boolean b() {
        return this.M;
    }

    @Override // defpackage.pyy
    public final void d() {
        this.L = true;
    }

    @Override // defpackage.pyy
    public final void load() {
        ymu ymuVar = this.F;
        d6z.z(ymuVar);
        if (this.K == 0) {
            ymuVar.F(this.I);
            osb osbVar = this.J;
            long j = this.D;
            long j2 = j == -9223372036854775807L ? -9223372036854775807L : j - this.I;
            long j3 = this.E;
            ((su6) osbVar).b(ymuVar, j2, j3 != -9223372036854775807L ? j3 - this.I : -9223372036854775807L);
        }
        try {
            npg d = this.b.d(this.K);
            x7u0 x7u0Var = this.B;
            kbh kbhVar = new kbh(x7u0Var, d.f, x7u0Var.open(d));
            do {
                try {
                    if (this.L) {
                        break;
                    }
                } finally {
                    this.K = kbhVar.w - this.b.f;
                }
            } while (((su6) this.J).c(kbhVar));
            a aVar = this.w;
            String str = aVar.m;
            int i = aVar.K;
            int i2 = aVar.L;
            if (eh20.n(str) && ((i > 1 || i2 > 1) && i != -1 && i2 != -1)) {
                g001 K = ymuVar.K(4);
                int i3 = i * i2;
                long j4 = (this.A - this.z) / i3;
                for (int i4 = 1; i4 < i3; i4++) {
                    K.a(new ef90(), 0, 0);
                    K.c(i4 * j4, 0, 0, 0, null);
                }
            }
            yri0.b(this.B);
            this.M = !this.L;
        } catch (Throwable th) {
            yri0.b(this.B);
            throw th;
        }
    }
}
