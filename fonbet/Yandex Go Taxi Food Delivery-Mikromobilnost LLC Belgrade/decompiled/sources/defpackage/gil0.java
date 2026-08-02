package defpackage;

/* loaded from: classes10.dex */
public final class gil0 implements wil0 {
    public final vil0 a;
    public g001 c;
    public int d;
    public long f;
    public long g;
    public final df90 b = new df90();
    public long e = -9223372036854775807L;

    public gil0(vil0 vil0Var) {
        this.a = vil0Var;
    }

    @Override // defpackage.wil0
    public final void a(long j, long j2) {
        this.e = j;
        this.g = j2;
    }

    @Override // defpackage.wil0
    public final void b(long j) {
        d6z.x(this.e == -9223372036854775807L);
        this.e = j;
    }

    @Override // defpackage.wil0
    public final void c(ef90 ef90Var, long j, int i, boolean z) {
        int y = ef90Var.y() & 3;
        int y2 = ef90Var.y() & 255;
        long d = qva1.d(this.a.b, this.g, j, this.e);
        if (y != 0) {
            if (y == 1 || y == 2) {
                int i2 = this.d;
                if (i2 > 0) {
                    g001 g001Var = this.c;
                    int i3 = tw21.a;
                    g001Var.c(this.f, 1, i2, 0, null);
                    this.d = 0;
                }
            } else if (y != 3) {
                ny61.g(String.valueOf(y));
                return;
            }
            int a = ef90Var.a();
            g001 g001Var2 = this.c;
            g001Var2.getClass();
            g001Var2.a(ef90Var, a, 0);
            int i4 = this.d + a;
            this.d = i4;
            this.f = d;
            if (z && y == 3) {
                g001 g001Var3 = this.c;
                int i5 = tw21.a;
                g001Var3.c(d, 1, i4, 0, null);
                this.d = 0;
                return;
            }
            return;
        }
        int i6 = this.d;
        if (i6 > 0) {
            g001 g001Var4 = this.c;
            int i7 = tw21.a;
            g001Var4.c(this.f, 1, i6, 0, null);
            this.d = 0;
        }
        if (y2 == 1) {
            int a2 = ef90Var.a();
            g001 g001Var5 = this.c;
            g001Var5.getClass();
            g001Var5.a(ef90Var, a2, 0);
            g001 g001Var6 = this.c;
            int i8 = tw21.a;
            g001Var6.c(d, 1, a2, 0, null);
            return;
        }
        byte[] bArr = ef90Var.a;
        df90 df90Var = this.b;
        df90Var.getClass();
        df90Var.k(bArr.length, bArr);
        df90Var.p(2);
        long j2 = d;
        for (int i9 = 0; i9 < y2; i9++) {
            hb e = m83.e(df90Var);
            int i10 = e.c;
            g001 g001Var7 = this.c;
            g001Var7.getClass();
            g001Var7.a(ef90Var, i10, 0);
            g001 g001Var8 = this.c;
            int i11 = tw21.a;
            g001Var8.c(j2, 1, e.c, 0, null);
            j2 = ((e.d / e.a) * 1000000) + j2;
            df90Var.p(i10);
        }
    }

    @Override // defpackage.wil0
    public final void d(d5p d5pVar, int i) {
        g001 B = d5pVar.B(i, 1);
        this.c = B;
        B.d(this.a.c);
    }
}
