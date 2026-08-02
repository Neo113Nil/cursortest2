package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class ow1 implements vl0 {
    public final kc2 a;
    public final pw1 b;
    public final String c;
    public q83 d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public ow1(String str) {
        kc2 kc2Var = new kc2(4);
        this.a = kc2Var;
        kc2Var.a()[0] = -1;
        this.b = new pw1();
        this.l = C.TIME_UNSET;
        this.c = str;
    }

    @Override // yads.vl0
    public final void a(kc2 kc2Var) {
        if (this.d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i = kc2Var.c;
            int i2 = kc2Var.b;
            int i3 = i - i2;
            if (i3 <= 0) {
                return;
            }
            int i4 = this.f;
            if (i4 == 0) {
                byte[] bArr = kc2Var.a;
                while (true) {
                    if (i2 >= i) {
                        kc2Var.e(i);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.i && (b & 224) == 224;
                    this.i = z;
                    if (z2) {
                        kc2Var.e(i2 + 1);
                        this.i = false;
                        this.a.a[1] = bArr[i2];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i4 == 1) {
                int min = Math.min(i3, 4 - this.g);
                kc2Var.a(this.a.a, this.g, min);
                int i5 = this.g + min;
                this.g = i5;
                if (i5 >= 4) {
                    this.a.e(0);
                    if (this.b.a(this.a.b())) {
                        pw1 pw1Var = this.b;
                        this.k = pw1Var.c;
                        if (!this.h) {
                            int i6 = pw1Var.d;
                            this.j = (pw1Var.g * 1000000) / i6;
                            mx0 mx0Var = new mx0();
                            mx0Var.a = this.e;
                            mx0Var.k = pw1Var.b;
                            mx0Var.l = 4096;
                            mx0Var.x = pw1Var.e;
                            mx0Var.y = i6;
                            mx0Var.c = this.c;
                            this.d.a(new nx0(mx0Var));
                            this.h = true;
                        }
                        this.a.e(0);
                        this.d.a(4, this.a);
                        this.f = 2;
                    } else {
                        this.g = 0;
                        this.f = 1;
                    }
                }
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(i3, this.k - this.g);
                this.d.a(min2, kc2Var);
                int i7 = this.g + min2;
                this.g = i7;
                int i8 = this.k;
                if (i7 >= i8) {
                    long j = this.l;
                    if (j != C.TIME_UNSET) {
                        this.d.a(j, 1, i8, 0, null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            }
        }
    }

    @Override // yads.vl0
    public final void b() {
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, pa3 pa3Var) {
        pa3Var.a();
        pa3Var.b();
        this.e = pa3Var.e;
        pa3Var.b();
        this.d = qq0Var.a(pa3Var.d, 1);
    }

    @Override // yads.vl0
    public final void a(int i, long j) {
        if (j != C.TIME_UNSET) {
            this.l = j;
        }
    }

    @Override // yads.vl0
    public final void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = C.TIME_UNSET;
    }
}
