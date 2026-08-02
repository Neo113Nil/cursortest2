package defpackage;

import androidx.media3.common.a;

/* loaded from: classes10.dex */
public final class ac30 implements tqn {
    public final ef90 a;
    public final bc30 b;
    public final String c;
    public final int d;
    public final String e;
    public g001 f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public ac30(String str, int i, String str2) {
        ef90 ef90Var = new ef90(4);
        this.a = ef90Var;
        ef90Var.a[0] = -1;
        this.b = new bc30();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.tqn
    public final void b(ef90 ef90Var) {
        d6z.z(this.f);
        while (ef90Var.a() > 0) {
            int i = this.h;
            ef90 ef90Var2 = this.a;
            if (i == 0) {
                byte[] bArr = ef90Var.a;
                int i2 = ef90Var.b;
                int i3 = ef90Var.c;
                while (true) {
                    if (i2 >= i3) {
                        ef90Var.K(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        ef90Var.K(i2 + 1);
                        this.k = false;
                        ef90Var2.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int min = Math.min(ef90Var.a(), 4 - this.i);
                ef90Var.i(this.i, min, ef90Var2.a);
                int i4 = this.i + min;
                this.i = i4;
                if (i4 >= 4) {
                    ef90Var2.K(0);
                    int k = ef90Var2.k();
                    bc30 bc30Var = this.b;
                    if (bc30Var.a(k)) {
                        this.m = bc30Var.c;
                        if (!this.j) {
                            this.l = (bc30Var.g * 1000000) / bc30Var.d;
                            f7s f7sVar = new f7s();
                            f7sVar.a = this.g;
                            f7sVar.l = eh20.q(this.e);
                            f7sVar.m = eh20.q(bc30Var.b);
                            f7sVar.n = 4096;
                            f7sVar.C = bc30Var.e;
                            f7sVar.D = bc30Var.d;
                            f7sVar.d = this.c;
                            f7sVar.f = this.d;
                            this.f.d(new a(f7sVar));
                            this.j = true;
                        }
                        ef90Var2.K(0);
                        this.f.a(ef90Var2, 4, 0);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            } else {
                if (i != 2) {
                    ny61.k();
                    return;
                }
                int min2 = Math.min(ef90Var.a(), this.m - this.i);
                this.f.a(ef90Var, min2, 0);
                int i5 = this.i + min2;
                this.i = i5;
                if (i5 >= this.m) {
                    d6z.x(this.n != -9223372036854775807L);
                    this.f.c(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // defpackage.tqn
    public final void d() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.tqn
    public final void e(int i, long j) {
        this.n = j;
    }

    @Override // defpackage.tqn
    public final void g(boolean z) {
    }

    @Override // defpackage.tqn
    public final void h(d5p d5pVar, xi11 xi11Var) {
        xi11Var.c();
        xi11Var.d();
        this.g = xi11Var.e;
        xi11Var.d();
        this.f = d5pVar.B(xi11Var.d, 1);
    }
}
