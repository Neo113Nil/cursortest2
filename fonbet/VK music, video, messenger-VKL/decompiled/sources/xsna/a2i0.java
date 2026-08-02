package xsna;

import xsna.tsp0;

/* compiled from: SectionReader.java */
/* loaded from: classes12.dex */
public final class a2i0 implements tsp0 {
    public final z1i0 a;
    public final xi90 b = new xi90(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public a2i0(z1i0 z1i0Var) {
        this.a = z1i0Var;
    }

    @Override // xsna.tsp0
    public final void a(int i, xi90 xi90Var) {
        boolean z = (i & 1) != 0;
        int C = z ? xi90Var.b + xi90Var.C() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            xi90Var.P(C);
            this.d = 0;
        }
        while (xi90Var.a() > 0) {
            int i2 = this.d;
            xi90 xi90Var2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int C2 = xi90Var.C();
                    xi90Var.P(xi90Var.b - 1);
                    if (C2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(xi90Var.a(), 3 - this.d);
                xi90Var.n(xi90Var2.a, this.d, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    xi90Var2.P(0);
                    xi90Var2.O(3);
                    xi90Var2.Q(1);
                    int C3 = xi90Var2.C();
                    int C4 = xi90Var2.C();
                    this.e = (C3 & 128) != 0;
                    int i4 = (((C3 & 15) << 8) | C4) + 3;
                    this.c = i4;
                    byte[] bArr = xi90Var2.a;
                    if (bArr.length < i4) {
                        xi90Var2.d(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(xi90Var.a(), this.c - this.d);
                xi90Var.n(xi90Var2.a, this.d, min2);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        xi90Var2.O(i6);
                    } else {
                        if (y2r0.n(0, i6, -1, xi90Var2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        xi90Var2.O(this.c - 4);
                    }
                    xi90Var2.P(0);
                    this.a.a(xi90Var2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // xsna.tsp0
    public final void b(txo0 txo0Var, rgq rgqVar, tsp0.c cVar) {
        this.a.b(txo0Var, rgqVar, cVar);
        this.f = true;
    }

    @Override // xsna.tsp0
    public final void seek() {
        this.f = true;
    }
}
