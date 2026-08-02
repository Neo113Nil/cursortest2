package yads;

/* loaded from: classes10.dex */
public final class wx2 implements qa3 {
    public final vx2 a;
    public final kc2 b = new kc2(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public wx2(vx2 vx2Var) {
        this.a = vx2Var;
    }

    @Override // yads.qa3
    public final void a(int i, kc2 kc2Var) {
        boolean z = (i & 1) != 0;
        int m = z ? kc2Var.b + kc2Var.m() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            kc2Var.e(m);
            this.d = 0;
        }
        while (true) {
            int i2 = kc2Var.c - kc2Var.b;
            if (i2 <= 0) {
                return;
            }
            int i3 = this.d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int m2 = kc2Var.m();
                    kc2Var.e(kc2Var.b - 1);
                    if (m2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(kc2Var.c - kc2Var.b, 3 - this.d);
                kc2Var.a(this.b.a, this.d, min);
                int i4 = this.d + min;
                this.d = i4;
                if (i4 == 3) {
                    this.b.e(0);
                    this.b.d(3);
                    kc2 kc2Var2 = this.b;
                    kc2Var2.e(kc2Var2.b + 1);
                    int m3 = this.b.m();
                    int m4 = this.b.m();
                    this.e = (m3 & 128) != 0;
                    int i5 = (((m3 & 15) << 8) | m4) + 3;
                    this.c = i5;
                    byte[] bArr = this.b.a;
                    if (bArr.length < i5) {
                        this.b.a(Math.min(4098, Math.max(i5, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(i2, this.c - i3);
                kc2Var.a(this.b.a, this.d, min2);
                int i6 = this.d + min2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.e) {
                        byte[] bArr2 = this.b.a;
                        int i8 = -1;
                        for (int i9 = 0; i9 < i7; i9++) {
                            i8 = mc3.n[((i8 >>> 24) ^ (bArr2[i9] & 255)) & 255] ^ (i8 << 8);
                        }
                        int i10 = mc3.a;
                        if (i8 != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.d(this.c - 4);
                    } else {
                        this.b.d(i7);
                    }
                    this.b.e(0);
                    this.a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // yads.qa3
    public final void a(c83 c83Var, qq0 qq0Var, pa3 pa3Var) {
        this.a.a(c83Var, qq0Var, pa3Var);
        this.f = true;
    }

    @Override // yads.qa3
    public final void a() {
        this.f = true;
    }
}
