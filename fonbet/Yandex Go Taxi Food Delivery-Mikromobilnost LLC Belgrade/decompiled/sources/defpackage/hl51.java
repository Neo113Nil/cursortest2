package defpackage;

import androidx.media3.common.a;

/* loaded from: classes10.dex */
public final class hl51 extends z35 {
    public final int H;
    public final long I;
    public final osb J;
    public long K;
    public volatile boolean L;
    public boolean M;
    public int N;
    public long O;

    public hl51(kpg kpgVar, npg npgVar, a aVar, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, osb osbVar) {
        super(kpgVar, npgVar, aVar, i, obj, j, j2, j3, j4, j5);
        this.N = 0;
        this.O = -1L;
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
        long j4 = this.O;
        if (j4 != -1 && j4 <= 0) {
            this.M = true;
            int i = this.N;
            this.N = i + 1;
            if (i < 3) {
                return;
            }
        }
        try {
            npg e = this.b.e(this.K, j4);
            this.O = this.B.open(e);
            kbh kbhVar = new kbh(this.B, e.f, this.O);
            do {
                try {
                    if (this.L) {
                        break;
                    }
                } finally {
                    long j5 = kbhVar.w - this.b.f;
                    this.K = j5;
                    long j6 = this.O;
                    if (j6 != -1) {
                        this.O = j6 - j5;
                    }
                }
            } while (((su6) this.J).c(kbhVar));
            a aVar = this.w;
            String str = aVar.m;
            int i2 = aVar.K;
            int i3 = aVar.L;
            if (eh20.n(str) && ((i2 > 1 || i3 > 1) && i2 != -1 && i3 != -1)) {
                g001 K = ymuVar.K(4);
                int i4 = i2 * i3;
                long j7 = (this.A - this.z) / i4;
                for (int i5 = 1; i5 < i4; i5++) {
                    K.a(new ef90(), 0, 0);
                    K.c(i5 * j7, 0, 0, 0, null);
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
