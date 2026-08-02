package defpackage;

import java.math.RoundingMode;

/* loaded from: classes10.dex */
public final class fil0 implements wil0 {
    public final vil0 a;
    public final df90 b = new df90();
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public long g;
    public g001 h;
    public long i;

    public fil0(vil0 vil0Var) {
        this.a = vil0Var;
        this.c = vil0Var.b;
        String str = (String) vil0Var.d.get("mode");
        str.getClass();
        if (f0b1.f(str, "AAC-hbr")) {
            this.d = 13;
            this.e = 3;
        } else {
            if (!f0b1.f(str, "AAC-lbr")) {
                w511.x("AAC mode not supported");
                throw null;
            }
            this.d = 6;
            this.e = 2;
        }
        this.f = this.e + this.d;
    }

    @Override // defpackage.wil0
    public final void a(long j, long j2) {
        this.g = j;
        this.i = j2;
    }

    @Override // defpackage.wil0
    public final void b(long j) {
        this.g = j;
    }

    @Override // defpackage.wil0
    public final void c(ef90 ef90Var, long j, int i, boolean z) {
        this.h.getClass();
        short v = ef90Var.v();
        int i2 = v / this.f;
        long d = qva1.d(this.c, this.i, j, this.g);
        df90 df90Var = this.b;
        df90Var.l(ef90Var);
        int i3 = this.e;
        int i4 = this.d;
        if (i2 == 1) {
            int g = df90Var.g(i4);
            df90Var.o(i3);
            this.h.a(ef90Var, ef90Var.a(), 0);
            if (z) {
                this.h.c(d, 1, g, 0, null);
                return;
            }
            return;
        }
        ef90Var.L((v + 7) / 8);
        long j2 = d;
        for (int i5 = 0; i5 < i2; i5++) {
            int g2 = df90Var.g(i4);
            df90Var.o(i3);
            this.h.a(ef90Var, g2, 0);
            this.h.c(j2, 1, g2, 0, null);
            j2 += tw21.e0(i2, 1000000L, this.c, RoundingMode.DOWN);
        }
    }

    @Override // defpackage.wil0
    public final void d(d5p d5pVar, int i) {
        g001 B = d5pVar.B(i, 1);
        this.h = B;
        B.d(this.a.c);
    }
}
