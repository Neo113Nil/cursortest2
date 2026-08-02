package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class xk0 implements vl0 {
    public final String b;
    public String c;
    public q83 d;
    public int f;
    public int g;
    public long h;
    public nx0 i;
    public int j;
    public final kc2 a = new kc2(new byte[18]);
    public int e = 0;
    public long k = C.TIME_UNSET;

    public xk0(String str) {
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
    @Override // yads.vl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(kc2 kc2Var) {
        int i;
        byte b;
        boolean z;
        int i2;
        int i3;
        byte b2;
        int i4;
        byte b3;
        int i5;
        byte b4;
        if (this.d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i6 = kc2Var.c - kc2Var.b;
            if (i6 <= 0) {
                return;
            }
            int i7 = this.e;
            if (i7 == 0) {
                while (kc2Var.c - kc2Var.b > 0) {
                    int i8 = this.g << 8;
                    this.g = i8;
                    int m = i8 | kc2Var.m();
                    this.g = m;
                    if (m == 2147385345 || m == -25230976 || m == 536864768 || m == -14745368) {
                        byte[] bArr = this.a.a;
                        bArr[0] = (byte) ((m >> 24) & 255);
                        bArr[1] = (byte) ((m >> 16) & 255);
                        bArr[2] = (byte) ((m >> 8) & 255);
                        bArr[3] = (byte) (m & 255);
                        this.f = 4;
                        this.g = 0;
                        this.e = 1;
                        break;
                    }
                }
            } else if (i7 == 1) {
                byte[] bArr2 = this.a.a;
                int min = Math.min(i6, 18 - this.f);
                kc2Var.a(bArr2, this.f, min);
                int i9 = this.f + min;
                this.f = i9;
                if (i9 == 18) {
                    byte[] bArr3 = this.a.a;
                    if (this.i == null) {
                        nx0 a = yk0.a(bArr3, this.c, this.b);
                        this.i = a;
                        this.d.a(a);
                    }
                    byte b5 = bArr3[0];
                    if (b5 != -2) {
                        if (b5 == -1) {
                            i5 = ((bArr3[7] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            b4 = bArr3[9];
                        } else if (b5 != 31) {
                            i = ((bArr3[5] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            b = bArr3[7];
                        } else {
                            i5 = ((bArr3[7] & 255) << 4) | ((bArr3[6] & 3) << 12);
                            b4 = bArr3[8];
                        }
                        i2 = (i5 | ((b4 & 60) >> 2)) + 1;
                        z = true;
                        if (z) {
                            i2 = (i2 * 16) / 14;
                        }
                        this.j = i2;
                        if (b5 == -2) {
                            if (b5 == -1) {
                                i3 = (bArr3[4] & 7) << 4;
                                b3 = bArr3[7];
                            } else if (b5 != 31) {
                                i3 = (bArr3[4] & 1) << 6;
                                b2 = bArr3[5];
                            } else {
                                i3 = (bArr3[5] & 7) << 4;
                                b3 = bArr3[6];
                            }
                            i4 = b3 & 60;
                            this.h = (int) ((((((i4 >> 2) | i3) + 1) * 32) * 1000000) / this.i.A);
                            this.a.e(0);
                            this.d.a(18, this.a);
                            this.e = 2;
                        } else {
                            i3 = (bArr3[5] & 1) << 6;
                            b2 = bArr3[4];
                        }
                        i4 = b2 & 252;
                        this.h = (int) ((((((i4 >> 2) | i3) + 1) * 32) * 1000000) / this.i.A);
                        this.a.e(0);
                        this.d.a(18, this.a);
                        this.e = 2;
                    } else {
                        i = ((bArr3[4] & 3) << 12) | ((bArr3[7] & 255) << 4);
                        b = bArr3[6];
                    }
                    i2 = (i | ((b & 240) >> 4)) + 1;
                    z = false;
                    if (z) {
                    }
                    this.j = i2;
                    if (b5 == -2) {
                    }
                    i4 = b2 & 252;
                    this.h = (int) ((((((i4 >> 2) | i3) + 1) * 32) * 1000000) / this.i.A);
                    this.a.e(0);
                    this.d.a(18, this.a);
                    this.e = 2;
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(i6, this.j - this.f);
                this.d.a(min2, kc2Var);
                int i10 = this.f + min2;
                this.f = i10;
                int i11 = this.j;
                if (i10 == i11) {
                    long j = this.k;
                    if (j != C.TIME_UNSET) {
                        this.d.a(j, 1, i11, 0, null);
                        this.k += this.h;
                    }
                    this.e = 0;
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
        this.c = pa3Var.e;
        pa3Var.b();
        this.d = qq0Var.a(pa3Var.d, 1);
    }

    @Override // yads.vl0
    public final void a(int i, long j) {
        if (j != C.TIME_UNSET) {
            this.k = j;
        }
    }

    @Override // yads.vl0
    public final void a() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = C.TIME_UNSET;
    }
}
