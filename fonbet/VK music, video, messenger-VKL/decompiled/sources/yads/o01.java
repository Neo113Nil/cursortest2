package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import xsna.uf3;

/* loaded from: classes10.dex */
public final class o01 implements vl0 {
    public final ry2 a;
    public String b;
    public q83 c;
    public n01 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final az1 g = new az1(32);
    public final az1 h = new az1(33);
    public final az1 i = new az1(34);
    public final az1 j = new az1(39);
    public final az1 k = new az1(40);
    public long m = C.TIME_UNSET;
    public final kc2 n = new kc2();

    public o01(ry2 ry2Var) {
        this.a = ry2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0450 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    @Override // yads.vl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(kc2 kc2Var) {
        int i;
        long j;
        int i2;
        long j2;
        byte[] bArr;
        int i3;
        int i4;
        int i5;
        long j3;
        boolean z;
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        byte[] bArr2;
        int[] iArr;
        kc2 kc2Var2 = kc2Var;
        if (this.c == null) {
            throw new IllegalStateException();
        }
        int i8 = mc3.a;
        while (true) {
            int i9 = kc2Var2.c;
            int i10 = kc2Var2.b;
            int i11 = i9 - i10;
            if (i11 <= 0) {
                return;
            }
            byte[] bArr3 = kc2Var2.a;
            this.l += i11;
            this.c.a(i11, kc2Var2);
            while (i10 < i9) {
                int a = ez1.a(bArr3, i10, i9, this.f);
                if (a == i9) {
                    a(bArr3, i10, i9);
                    return;
                }
                int i12 = a + 3;
                int i13 = (bArr3[i12] & 126) >> 1;
                int i14 = a - i10;
                if (i14 > 0) {
                    a(bArr3, i10, a);
                }
                int i15 = i9 - a;
                long j4 = this.l - i15;
                int i16 = i14 < 0 ? -i14 : 0;
                long j5 = this.m;
                n01 n01Var = this.d;
                boolean z4 = this.e;
                if (n01Var.j && n01Var.g) {
                    n01Var.m = n01Var.c;
                    n01Var.j = false;
                } else if (n01Var.h || n01Var.g) {
                    if (z4 && n01Var.i) {
                        j = j5;
                        long j6 = n01Var.b;
                        i2 = i16;
                        int i17 = i15 + ((int) (j4 - j6));
                        long j7 = n01Var.l;
                        if (j7 == C.TIME_UNSET) {
                            i = i9;
                        } else {
                            i = i9;
                            n01Var.a.a(j7, n01Var.m ? 1 : 0, (int) (j6 - n01Var.k), i17, null);
                        }
                    } else {
                        i = i9;
                        j = j5;
                        i2 = i16;
                    }
                    n01Var.k = n01Var.b;
                    n01Var.l = n01Var.e;
                    n01Var.m = n01Var.c;
                    n01Var.i = true;
                    if (!this.e) {
                        this.g.a(i2);
                        this.h.a(i2);
                        this.i.a(i2);
                        az1 az1Var = this.g;
                        if (az1Var.c) {
                            az1 az1Var2 = this.h;
                            if (az1Var2.c) {
                                az1 az1Var3 = this.i;
                                if (az1Var3.c) {
                                    q83 q83Var = this.c;
                                    String str = this.b;
                                    int i18 = az1Var.e;
                                    byte[] bArr4 = new byte[az1Var2.e + i18 + az1Var3.e];
                                    bArr = bArr3;
                                    System.arraycopy(az1Var.d, 0, bArr4, 0, i18);
                                    i3 = i12;
                                    System.arraycopy(az1Var2.d, 0, bArr4, az1Var.e, az1Var2.e);
                                    System.arraycopy(az1Var3.d, 0, bArr4, az1Var.e + az1Var2.e, az1Var3.e);
                                    lc2 lc2Var = new lc2(az1Var2.d, 0, az1Var2.e);
                                    lc2Var.d(44);
                                    int b = lc2Var.b(3);
                                    lc2Var.f();
                                    int b2 = lc2Var.b(2);
                                    boolean c = lc2Var.c();
                                    int b3 = lc2Var.b(5);
                                    int i19 = 0;
                                    for (int i20 = 0; i20 < 32; i20++) {
                                        if (lc2Var.c()) {
                                            i19 |= 1 << i20;
                                        }
                                    }
                                    int[] iArr2 = new int[6];
                                    for (int i21 = 0; i21 < 6; i21++) {
                                        iArr2[i21] = lc2Var.b(8);
                                    }
                                    int b4 = lc2Var.b(8);
                                    int i22 = 0;
                                    for (int i23 = 0; i23 < b; i23++) {
                                        if (lc2Var.c()) {
                                            i22 += 89;
                                        }
                                        if (lc2Var.c()) {
                                            i22 += 8;
                                        }
                                    }
                                    lc2Var.d(i22);
                                    if (b > 0) {
                                        lc2Var.d((8 - b) * 2);
                                    }
                                    lc2Var.d();
                                    int d = lc2Var.d();
                                    if (d == 3) {
                                        lc2Var.f();
                                    }
                                    int d2 = lc2Var.d();
                                    int d3 = lc2Var.d();
                                    if (lc2Var.c()) {
                                        int d4 = lc2Var.d();
                                        bArr2 = bArr4;
                                        int d5 = lc2Var.d();
                                        iArr = iArr2;
                                        int d6 = lc2Var.d();
                                        i5 = i15;
                                        int d7 = lc2Var.d();
                                        i4 = i13;
                                        int i24 = (d == 1 || d == 2) ? 2 : 1;
                                        j2 = j4;
                                        int i25 = d == 1 ? 2 : 1;
                                        d2 = uf3.a(d4, d5, i24, d2);
                                        d3 = uf3.a(d6, d7, i25, d3);
                                    } else {
                                        j2 = j4;
                                        i4 = i13;
                                        bArr2 = bArr4;
                                        iArr = iArr2;
                                        i5 = i15;
                                    }
                                    lc2Var.d();
                                    lc2Var.d();
                                    int d8 = lc2Var.d();
                                    for (int i26 = lc2Var.c() ? 0 : b; i26 <= b; i26++) {
                                        lc2Var.d();
                                        lc2Var.d();
                                        lc2Var.d();
                                    }
                                    lc2Var.d();
                                    lc2Var.d();
                                    lc2Var.d();
                                    lc2Var.d();
                                    lc2Var.d();
                                    lc2Var.d();
                                    if (lc2Var.c() && lc2Var.c()) {
                                        int i27 = 0;
                                        while (i27 < 4) {
                                            for (int i28 = 0; i28 < 6; i28 += i27 == 3 ? 3 : 1) {
                                                if (lc2Var.c()) {
                                                    int min = Math.min(64, 1 << ((i27 << 1) + 4));
                                                    if (i27 > 1) {
                                                        lc2Var.e();
                                                    }
                                                    for (int i29 = 0; i29 < min; i29++) {
                                                        lc2Var.e();
                                                    }
                                                } else {
                                                    lc2Var.d();
                                                }
                                            }
                                            i27++;
                                        }
                                    }
                                    lc2Var.d(2);
                                    if (lc2Var.c()) {
                                        lc2Var.d(8);
                                        lc2Var.d();
                                        lc2Var.d();
                                        lc2Var.f();
                                    }
                                    int d9 = lc2Var.d();
                                    boolean z5 = false;
                                    int i30 = 0;
                                    for (int i31 = 0; i31 < d9; i31++) {
                                        if (i31 != 0) {
                                            z5 = lc2Var.c();
                                        }
                                        if (z5) {
                                            lc2Var.f();
                                            lc2Var.d();
                                            for (int i32 = 0; i32 <= i30; i32++) {
                                                if (lc2Var.c()) {
                                                    lc2Var.f();
                                                }
                                            }
                                        } else {
                                            int d10 = lc2Var.d();
                                            int d11 = lc2Var.d();
                                            int i33 = d10 + d11;
                                            for (int i34 = 0; i34 < d10; i34++) {
                                                lc2Var.d();
                                                lc2Var.f();
                                            }
                                            for (int i35 = 0; i35 < d11; i35++) {
                                                lc2Var.d();
                                                lc2Var.f();
                                            }
                                            i30 = i33;
                                        }
                                    }
                                    if (lc2Var.c()) {
                                        for (int i36 = 0; i36 < lc2Var.d(); i36++) {
                                            lc2Var.d(d8 + 5);
                                        }
                                    }
                                    lc2Var.d(2);
                                    float f = 1.0f;
                                    if (lc2Var.c()) {
                                        if (lc2Var.c()) {
                                            int b5 = lc2Var.b(8);
                                            if (b5 == 255) {
                                                int b6 = lc2Var.b(16);
                                                int b7 = lc2Var.b(16);
                                                if (b6 != 0 && b7 != 0) {
                                                    f = b6 / b7;
                                                }
                                            } else {
                                                float[] fArr = ez1.b;
                                                if (b5 < 17) {
                                                    f = fArr[b5];
                                                } else {
                                                    lg1.a("Unexpected aspect_ratio_idc value: ", b5, "H265Reader");
                                                }
                                            }
                                        }
                                        if (lc2Var.c()) {
                                            lc2Var.f();
                                        }
                                        if (lc2Var.c()) {
                                            lc2Var.d(4);
                                            if (lc2Var.c()) {
                                                lc2Var.d(24);
                                            }
                                        }
                                        if (lc2Var.c()) {
                                            lc2Var.d();
                                            lc2Var.d();
                                        }
                                        lc2Var.f();
                                        if (lc2Var.c()) {
                                            d3 *= 2;
                                        }
                                    }
                                    String a2 = jx.a(b2, c, b3, i19, iArr, b4);
                                    mx0 mx0Var = new mx0();
                                    mx0Var.a = str;
                                    mx0Var.k = "video/hevc";
                                    mx0Var.h = a2;
                                    mx0Var.p = d2;
                                    mx0Var.q = d3;
                                    mx0Var.t = f;
                                    mx0Var.m = Collections.singletonList(bArr2);
                                    q83Var.a(new nx0(mx0Var));
                                    this.e = true;
                                    if (this.j.a(i2)) {
                                        az1 az1Var4 = this.j;
                                        int a3 = ez1.a(az1Var4.e, az1Var4.d);
                                        kc2 kc2Var3 = this.n;
                                        kc2Var3.a = this.j.d;
                                        kc2Var3.c = a3;
                                        kc2Var3.b = 0;
                                        kc2Var3.e(5);
                                        j3 = j;
                                        rt.a(j3, this.n, this.a.b);
                                    } else {
                                        j3 = j;
                                    }
                                    if (this.k.a(i2)) {
                                        az1 az1Var5 = this.k;
                                        int a4 = ez1.a(az1Var5.e, az1Var5.d);
                                        kc2 kc2Var4 = this.n;
                                        kc2Var4.a = this.k.d;
                                        kc2Var4.c = a4;
                                        z = false;
                                        kc2Var4.b = 0;
                                        kc2Var4.e(5);
                                        rt.a(j3, this.n, this.a.b);
                                    } else {
                                        z = false;
                                    }
                                    long j8 = this.m;
                                    n01 n01Var2 = this.d;
                                    boolean z6 = this.e;
                                    n01Var2.g = z;
                                    n01Var2.h = z;
                                    n01Var2.e = j8;
                                    n01Var2.d = z ? 1 : 0;
                                    long j9 = j2;
                                    n01Var2.b = j9;
                                    i6 = i4;
                                    if (i6 >= 32) {
                                        if (i6 == 40) {
                                            i7 = 16;
                                            z2 = true;
                                            z3 = (i6 >= i7 || i6 > 21) ? z ? 1 : 0 : z2;
                                            n01Var2.c = z3;
                                            if (!z3 || i6 <= 9) {
                                                z = z2;
                                            }
                                            n01Var2.f = z;
                                            if (!this.e) {
                                                this.g.b(i6);
                                                this.h.b(i6);
                                                this.i.b(i6);
                                            }
                                            this.j.b(i6);
                                            this.k.b(i6);
                                            bArr3 = bArr;
                                            i10 = i3;
                                            i9 = i;
                                        } else {
                                            if (n01Var2.i && !n01Var2.j) {
                                                if (z6) {
                                                    long j10 = n01Var2.l;
                                                    if (j10 != C.TIME_UNSET) {
                                                        n01Var2.a.a(j10, n01Var2.m ? 1 : 0, (int) (j9 - n01Var2.k), i5, null);
                                                    }
                                                }
                                                n01Var2.i = z;
                                            }
                                            if ((32 <= i6 && i6 <= 35) || i6 == 39) {
                                                z2 = true;
                                                n01Var2.h = !n01Var2.j;
                                                n01Var2.j = true;
                                                i7 = 16;
                                                if (i6 >= i7) {
                                                }
                                                n01Var2.c = z3;
                                                if (!z3) {
                                                }
                                                z = z2;
                                                n01Var2.f = z;
                                                if (!this.e) {
                                                }
                                                this.j.b(i6);
                                                this.k.b(i6);
                                                bArr3 = bArr;
                                                i10 = i3;
                                                i9 = i;
                                            }
                                        }
                                    }
                                    z2 = true;
                                    i7 = 16;
                                    if (i6 >= i7) {
                                    }
                                    n01Var2.c = z3;
                                    if (!z3) {
                                    }
                                    z = z2;
                                    n01Var2.f = z;
                                    if (!this.e) {
                                    }
                                    this.j.b(i6);
                                    this.k.b(i6);
                                    bArr3 = bArr;
                                    i10 = i3;
                                    i9 = i;
                                }
                            }
                        }
                    }
                    j2 = j4;
                    bArr = bArr3;
                    i3 = i12;
                    i4 = i13;
                    i5 = i15;
                    if (this.j.a(i2)) {
                    }
                    if (this.k.a(i2)) {
                    }
                    long j82 = this.m;
                    n01 n01Var22 = this.d;
                    boolean z62 = this.e;
                    n01Var22.g = z;
                    n01Var22.h = z;
                    n01Var22.e = j82;
                    n01Var22.d = z ? 1 : 0;
                    long j92 = j2;
                    n01Var22.b = j92;
                    i6 = i4;
                    if (i6 >= 32) {
                    }
                    z2 = true;
                    i7 = 16;
                    if (i6 >= i7) {
                    }
                    n01Var22.c = z3;
                    if (!z3) {
                    }
                    z = z2;
                    n01Var22.f = z;
                    if (!this.e) {
                    }
                    this.j.b(i6);
                    this.k.b(i6);
                    bArr3 = bArr;
                    i10 = i3;
                    i9 = i;
                }
                i = i9;
                j = j5;
                i2 = i16;
                if (!this.e) {
                }
                j2 = j4;
                bArr = bArr3;
                i3 = i12;
                i4 = i13;
                i5 = i15;
                if (this.j.a(i2)) {
                }
                if (this.k.a(i2)) {
                }
                long j822 = this.m;
                n01 n01Var222 = this.d;
                boolean z622 = this.e;
                n01Var222.g = z;
                n01Var222.h = z;
                n01Var222.e = j822;
                n01Var222.d = z ? 1 : 0;
                long j922 = j2;
                n01Var222.b = j922;
                i6 = i4;
                if (i6 >= 32) {
                }
                z2 = true;
                i7 = 16;
                if (i6 >= i7) {
                }
                n01Var222.c = z3;
                if (!z3) {
                }
                z = z2;
                n01Var222.f = z;
                if (!this.e) {
                }
                this.j.b(i6);
                this.k.b(i6);
                bArr3 = bArr;
                i10 = i3;
                i9 = i;
            }
            kc2Var2 = kc2Var;
        }
    }

    @Override // yads.vl0
    public final void b() {
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, pa3 pa3Var) {
        pa3Var.a();
        pa3Var.b();
        this.b = pa3Var.e;
        pa3Var.b();
        q83 a = qq0Var.a(pa3Var.d, 2);
        this.c = a;
        this.d = new n01(a);
        this.a.a(qq0Var, pa3Var);
    }

    public final void a(byte[] bArr, int i, int i2) {
        n01 n01Var = this.d;
        if (n01Var.f) {
            int i3 = n01Var.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                n01Var.g = (bArr[i4] & 128) != 0;
                n01Var.f = false;
            } else {
                n01Var.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    @Override // yads.vl0
    public final void a(int i, long j) {
        if (j != C.TIME_UNSET) {
            this.m = j;
        }
    }

    @Override // yads.vl0
    public final void a() {
        this.l = 0L;
        this.m = C.TIME_UNSET;
        ez1.a(this.f);
        az1 az1Var = this.g;
        az1Var.b = false;
        az1Var.c = false;
        az1 az1Var2 = this.h;
        az1Var2.b = false;
        az1Var2.c = false;
        az1 az1Var3 = this.i;
        az1Var3.b = false;
        az1Var3.c = false;
        az1 az1Var4 = this.j;
        az1Var4.b = false;
        az1Var4.c = false;
        az1 az1Var5 = this.k;
        az1Var5.b = false;
        az1Var5.c = false;
        n01 n01Var = this.d;
        if (n01Var != null) {
            n01Var.f = false;
            n01Var.g = false;
            n01Var.h = false;
            n01Var.i = false;
            n01Var.j = false;
        }
    }
}
