package defpackage;

/* loaded from: classes10.dex */
public final class l3q0 implements yi11 {
    public final e3q0 a;
    public final ef90 b = new ef90(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public l3q0(e3q0 e3q0Var) {
        this.a = e3q0Var;
    }

    @Override // defpackage.yi11
    public final void a(int i, ef90 ef90Var) {
        boolean z = (i & 1) != 0;
        int y = z ? ef90Var.b + ef90Var.y() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            ef90Var.K(y);
            this.d = 0;
        }
        while (ef90Var.a() > 0) {
            int i2 = this.d;
            ef90 ef90Var2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int y2 = ef90Var.y();
                    ef90Var.K(ef90Var.b - 1);
                    if (y2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(ef90Var.a(), 3 - this.d);
                ef90Var.i(this.d, min, ef90Var2.a);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    ef90Var2.K(0);
                    ef90Var2.J(3);
                    ef90Var2.L(1);
                    int y3 = ef90Var2.y();
                    int y4 = ef90Var2.y();
                    this.e = (y3 & 128) != 0;
                    int i4 = (((y3 & 15) << 8) | y4) + 3;
                    this.c = i4;
                    byte[] bArr = ef90Var2.a;
                    if (bArr.length < i4) {
                        ef90Var2.c(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(ef90Var.a(), this.c - this.d);
                ef90Var.i(this.d, min2, ef90Var2.a);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        ef90Var2.J(i6);
                    } else {
                        if (tw21.m(0, i6, -1, ef90Var2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        ef90Var2.J(this.c - 4);
                    }
                    ef90Var2.K(0);
                    this.a.b(ef90Var2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.yi11
    public final void c(sez0 sez0Var, d5p d5pVar, xi11 xi11Var) {
        this.a.c(sez0Var, d5pVar, xi11Var);
        this.f = true;
    }

    @Override // defpackage.yi11
    public final void d() {
        this.f = true;
    }
}
