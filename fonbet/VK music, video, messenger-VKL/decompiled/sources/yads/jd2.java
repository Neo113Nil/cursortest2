package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class jd2 implements qa3 {
    public final vl0 a;
    public final jc2 b = new jc2(new byte[10]);
    public int c = 0;
    public int d;
    public c83 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public jd2(vl0 vl0Var) {
        this.a = vl0Var;
    }

    @Override // yads.qa3
    public final void a(int i, kc2 kc2Var) {
        int i2;
        int i3;
        int i4;
        if (this.e == null) {
            throw new IllegalStateException();
        }
        int i5 = -1;
        int i6 = 0;
        if ((i & 1) != 0) {
            int i7 = this.c;
            if (i7 != 0 && i7 != 1) {
                if (i7 == 2) {
                    ji1.d("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i7 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        ji1.d("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    this.a.b();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i8 = i;
        while (true) {
            int i9 = kc2Var.c;
            int i10 = kc2Var.b;
            int i11 = i9 - i10;
            if (i11 <= 0) {
                return;
            }
            int i12 = this.c;
            if (i12 == 0) {
                i2 = i5;
                i3 = i6;
                kc2Var.e(i11 + i10);
            } else if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    int i13 = this.j;
                    int i14 = i13 == i5 ? i6 : i11 - i13;
                    if (i14 > 0) {
                        i11 -= i14;
                        kc2Var.d(i10 + i11);
                    }
                    this.a.a(kc2Var);
                    int i15 = this.j;
                    if (i15 != i5) {
                        int i16 = i15 - i11;
                        this.j = i16;
                        if (i16 == 0) {
                            this.a.b();
                            this.c = 1;
                            this.d = i6;
                        }
                    }
                } else if (a(Math.min(10, this.i), kc2Var, this.b.a) && a(this.i, kc2Var, (byte[]) null)) {
                    this.b.b(i6);
                    this.l = C.TIME_UNSET;
                    if (this.f) {
                        this.b.c(4);
                        this.b.c(1);
                        this.b.c(1);
                        long a = (this.b.a(15) << 15) | (this.b.a(3) << 30) | this.b.a(15);
                        this.b.c(1);
                        if (!this.h && this.g) {
                            this.b.c(4);
                            this.b.c(1);
                            this.b.c(1);
                            this.b.c(1);
                            this.e.b((this.b.a(3) << 30) | (this.b.a(15) << 15) | this.b.a(15));
                            this.h = true;
                        }
                        this.l = this.e.b(a);
                    }
                    i8 |= this.k ? 4 : 0;
                    this.a.a(i8, this.l);
                    this.c = 3;
                    this.d = 0;
                    i6 = 0;
                    i5 = -1;
                }
                i2 = i5;
                i3 = i6;
            } else {
                i3 = i6;
                if (a(9, kc2Var, this.b.a)) {
                    this.b.b(i3);
                    int a2 = this.b.a(24);
                    if (a2 != 1) {
                        lg1.a("Unexpected start code prefix: ", a2, "PesReader");
                        this.j = -1;
                        i4 = 0;
                        i2 = -1;
                    } else {
                        this.b.c(8);
                        int a3 = this.b.a(16);
                        this.b.c(5);
                        this.k = this.b.e();
                        this.b.c(2);
                        this.f = this.b.e();
                        this.g = this.b.e();
                        this.b.c(6);
                        int a4 = this.b.a(8);
                        this.i = a4;
                        if (a3 == 0) {
                            this.j = -1;
                        } else {
                            int i17 = (a3 - 3) - a4;
                            this.j = i17;
                            if (i17 < 0) {
                                ji1.d("PesReader", "Found negative packet payload size: " + this.j);
                                i2 = -1;
                                this.j = -1;
                                i4 = 2;
                            }
                        }
                        i2 = -1;
                        i4 = 2;
                    }
                    this.c = i4;
                    i3 = 0;
                    this.d = 0;
                } else {
                    i2 = -1;
                }
            }
            i6 = i3;
            i5 = i2;
        }
    }

    public final boolean a(int i, kc2 kc2Var, byte[] bArr) {
        int min = Math.min(kc2Var.c - kc2Var.b, i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            kc2Var.e(kc2Var.b + min);
        } else {
            kc2Var.a(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    @Override // yads.qa3
    public final void a(c83 c83Var, qq0 qq0Var, pa3 pa3Var) {
        this.e = c83Var;
        this.a.a(qq0Var, pa3Var);
    }

    @Override // yads.qa3
    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }
}
