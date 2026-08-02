package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class m01 implements vl0 {
    public final ry2 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public q83 j;
    public l01 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final az1 d = new az1(7);
    public final az1 e = new az1(8);
    public final az1 f = new az1(6);
    public long m = C.TIME_UNSET;
    public final kc2 o = new kc2();

    public m01(ry2 ry2Var, boolean z, boolean z2) {
        this.a = ry2Var;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0225, code lost:
    
        if (r4.j == r7.j) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x022f, code lost:
    
        if (r13 != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0243, code lost:
    
        if (r4.n == r7.n) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0256, code lost:
    
        if (r4.p == r7.p) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0264, code lost:
    
        if (r4.l == r7.l) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0304 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d9  */
    @Override // yads.vl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(kc2 kc2Var) {
        int i;
        int i2;
        int i3;
        l01 l01Var;
        boolean z;
        long j;
        boolean z2;
        l01 l01Var2;
        int i4;
        q83 q83Var = this.j;
        if (q83Var == null) {
            throw new IllegalStateException();
        }
        int i5 = mc3.a;
        int i6 = kc2Var.b;
        int i7 = kc2Var.c;
        byte[] bArr = kc2Var.a;
        int i8 = i7 - i6;
        this.g += i8;
        q83Var.a(i8, kc2Var);
        while (true) {
            int a = ez1.a(bArr, i6, i7, this.h);
            if (a == i7) {
                if (!this.l || this.k.c) {
                    this.d.a(bArr, i6, i7);
                    this.e.a(bArr, i6, i7);
                }
                this.f.a(bArr, i6, i7);
                this.k.a(bArr, i6, i7);
                return;
            }
            int i9 = a + 3;
            int i10 = bArr[i9] & 31;
            int i11 = a - i6;
            if (i11 > 0) {
                if (!this.l || this.k.c) {
                    this.d.a(bArr, i6, a);
                    this.e.a(bArr, i6, a);
                }
                this.f.a(bArr, i6, a);
                this.k.a(bArr, i6, a);
            }
            int i12 = i7 - a;
            long j2 = this.g - i12;
            int i13 = i11 < 0 ? -i11 : 0;
            long j3 = this.m;
            if (!this.l || this.k.c) {
                this.d.a(i13);
                this.e.a(i13);
                if (this.l) {
                    i = i12;
                    i2 = i9;
                    i3 = i7;
                    az1 az1Var = this.d;
                    if (az1Var.c) {
                        dz1 b = ez1.b(az1Var.d, 3, az1Var.e);
                        this.k.d.append(b.d, b);
                        az1 az1Var2 = this.d;
                        az1Var2.b = false;
                        az1Var2.c = false;
                    } else {
                        az1 az1Var3 = this.e;
                        if (az1Var3.c) {
                            lc2 lc2Var = new lc2(az1Var3.d, 4, az1Var3.e);
                            int d = lc2Var.d();
                            int d2 = lc2Var.d();
                            lc2Var.f();
                            this.k.e.append(d, new cz1(d, d2, lc2Var.c()));
                            az1 az1Var4 = this.e;
                            az1Var4.b = false;
                            az1Var4.c = false;
                        }
                    }
                } else if (this.d.c && this.e.c) {
                    ArrayList arrayList = new ArrayList();
                    az1 az1Var5 = this.d;
                    arrayList.add(Arrays.copyOf(az1Var5.d, az1Var5.e));
                    az1 az1Var6 = this.e;
                    arrayList.add(Arrays.copyOf(az1Var6.d, az1Var6.e));
                    az1 az1Var7 = this.d;
                    dz1 b2 = ez1.b(az1Var7.d, 3, az1Var7.e);
                    az1 az1Var8 = this.e;
                    i = i12;
                    lc2 lc2Var2 = new lc2(az1Var8.d, 4, az1Var8.e);
                    int d3 = lc2Var2.d();
                    int d4 = lc2Var2.d();
                    lc2Var2.f();
                    cz1 cz1Var = new cz1(d3, d4, lc2Var2.c());
                    i2 = i9;
                    String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(b2.a), Integer.valueOf(b2.b), Integer.valueOf(b2.c));
                    q83 q83Var2 = this.j;
                    mx0 mx0Var = new mx0();
                    i3 = i7;
                    mx0Var.a = this.i;
                    mx0Var.k = "video/avc";
                    mx0Var.h = format;
                    mx0Var.p = b2.e;
                    mx0Var.q = b2.f;
                    mx0Var.t = b2.g;
                    mx0Var.m = arrayList;
                    q83Var2.a(new nx0(mx0Var));
                    this.l = true;
                    this.k.d.append(b2.d, b2);
                    this.k.e.append(d3, cz1Var);
                    az1 az1Var9 = this.d;
                    az1Var9.b = false;
                    az1Var9.c = false;
                    az1 az1Var10 = this.e;
                    az1Var10.b = false;
                    az1Var10.c = false;
                }
                if (this.f.a(i13)) {
                    az1 az1Var11 = this.f;
                    int a2 = ez1.a(az1Var11.e, az1Var11.d);
                    kc2 kc2Var2 = this.o;
                    kc2Var2.a = this.f.d;
                    kc2Var2.c = a2;
                    kc2Var2.b = 0;
                    kc2Var2.e(4);
                    rt.a(j3, this.o, this.a.b);
                }
                l01Var = this.k;
                z = this.l;
                boolean z3 = this.n;
                if (l01Var.i != 9) {
                    if (l01Var.c) {
                        k01 k01Var = l01Var.n;
                        k01 k01Var2 = l01Var.m;
                        if (k01Var.a) {
                            if (k01Var2.a) {
                                dz1 dz1Var = k01Var.c;
                                if (dz1Var == null) {
                                    throw new IllegalStateException();
                                }
                                dz1 dz1Var2 = k01Var2.c;
                                if (dz1Var2 == null) {
                                    throw new IllegalStateException();
                                }
                                if (k01Var.f == k01Var2.f) {
                                    if (k01Var.g == k01Var2.g) {
                                        if (k01Var.h == k01Var2.h) {
                                            if (k01Var.i) {
                                                if (k01Var2.i) {
                                                }
                                            }
                                            int i14 = k01Var.d;
                                            int i15 = k01Var2.d;
                                            if (i14 != i15) {
                                                if (i14 != 0) {
                                                }
                                            }
                                            int i16 = dz1Var.k;
                                            if (i16 == 0) {
                                                if (dz1Var2.k == 0) {
                                                    if (k01Var.m == k01Var2.m) {
                                                    }
                                                }
                                            }
                                            if (i16 == 1) {
                                                if (dz1Var2.k == 1) {
                                                    if (k01Var.o == k01Var2.o) {
                                                    }
                                                }
                                            }
                                            boolean z4 = k01Var.k;
                                            if (z4 == k01Var2.k) {
                                                if (z4) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (l01Var.b) {
                        k01 k01Var3 = l01Var.n;
                        z3 = k01Var3.b && ((i4 = k01Var3.e) == 7 || i4 == 2);
                    }
                    boolean z5 = l01Var.r;
                    int i17 = l01Var.i;
                    z2 = z5 | (i17 != 5 || (z3 && i17 == 1));
                    l01Var.r = z2;
                    if (z2) {
                        this.n = false;
                    }
                    long j4 = this.m;
                    if (this.l || this.k.c) {
                        this.d.b(i10);
                        this.e.b(i10);
                    }
                    this.f.b(i10);
                    l01Var2 = this.k;
                    l01Var2.i = i10;
                    l01Var2.l = j4;
                    l01Var2.j = j2;
                    if ((l01Var2.b && i10 == 1) || (l01Var2.c && (i10 == 5 || i10 == 1 || i10 == 2))) {
                        k01 k01Var4 = l01Var2.m;
                        l01Var2.m = l01Var2.n;
                        l01Var2.n = k01Var4;
                        k01Var4.b = false;
                        k01Var4.a = false;
                        l01Var2.h = 0;
                        l01Var2.k = true;
                    }
                    i6 = i2;
                    i7 = i3;
                }
                if (z && l01Var.o) {
                    long j5 = l01Var.j;
                    int i18 = i + ((int) (j2 - j5));
                    j = l01Var.q;
                    if (j != C.TIME_UNSET) {
                        l01Var.a.a(j, l01Var.r ? 1 : 0, (int) (j5 - l01Var.p), i18, null);
                    }
                }
                l01Var.p = l01Var.j;
                l01Var.q = l01Var.l;
                l01Var.r = false;
                l01Var.o = true;
                if (l01Var.b) {
                }
                boolean z52 = l01Var.r;
                int i172 = l01Var.i;
                z2 = z52 | (i172 != 5 || (z3 && i172 == 1));
                l01Var.r = z2;
                if (z2) {
                }
                long j42 = this.m;
                if (this.l) {
                }
                this.d.b(i10);
                this.e.b(i10);
                this.f.b(i10);
                l01Var2 = this.k;
                l01Var2.i = i10;
                l01Var2.l = j42;
                l01Var2.j = j2;
                if (l01Var2.b) {
                    k01 k01Var42 = l01Var2.m;
                    l01Var2.m = l01Var2.n;
                    l01Var2.n = k01Var42;
                    k01Var42.b = false;
                    k01Var42.a = false;
                    l01Var2.h = 0;
                    l01Var2.k = true;
                    i6 = i2;
                    i7 = i3;
                }
                k01 k01Var422 = l01Var2.m;
                l01Var2.m = l01Var2.n;
                l01Var2.n = k01Var422;
                k01Var422.b = false;
                k01Var422.a = false;
                l01Var2.h = 0;
                l01Var2.k = true;
                i6 = i2;
                i7 = i3;
            }
            i = i12;
            i2 = i9;
            i3 = i7;
            if (this.f.a(i13)) {
            }
            l01Var = this.k;
            z = this.l;
            boolean z32 = this.n;
            if (l01Var.i != 9) {
            }
            if (z) {
                long j52 = l01Var.j;
                int i182 = i + ((int) (j2 - j52));
                j = l01Var.q;
                if (j != C.TIME_UNSET) {
                }
            }
            l01Var.p = l01Var.j;
            l01Var.q = l01Var.l;
            l01Var.r = false;
            l01Var.o = true;
            if (l01Var.b) {
            }
            boolean z522 = l01Var.r;
            int i1722 = l01Var.i;
            z2 = z522 | (i1722 != 5 || (z32 && i1722 == 1));
            l01Var.r = z2;
            if (z2) {
            }
            long j422 = this.m;
            if (this.l) {
            }
            this.d.b(i10);
            this.e.b(i10);
            this.f.b(i10);
            l01Var2 = this.k;
            l01Var2.i = i10;
            l01Var2.l = j422;
            l01Var2.j = j2;
            if (l01Var2.b) {
            }
            k01 k01Var4222 = l01Var2.m;
            l01Var2.m = l01Var2.n;
            l01Var2.n = k01Var4222;
            k01Var4222.b = false;
            k01Var4222.a = false;
            l01Var2.h = 0;
            l01Var2.k = true;
            i6 = i2;
            i7 = i3;
        }
    }

    @Override // yads.vl0
    public final void b() {
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, pa3 pa3Var) {
        pa3Var.a();
        pa3Var.b();
        this.i = pa3Var.e;
        pa3Var.b();
        q83 a = qq0Var.a(pa3Var.d, 2);
        this.j = a;
        this.k = new l01(a, this.b, this.c);
        this.a.a(qq0Var, pa3Var);
    }

    @Override // yads.vl0
    public final void a(int i, long j) {
        if (j != C.TIME_UNSET) {
            this.m = j;
        }
        this.n = ((i & 2) != 0) | this.n;
    }

    @Override // yads.vl0
    public final void a() {
        this.g = 0L;
        this.n = false;
        this.m = C.TIME_UNSET;
        ez1.a(this.h);
        az1 az1Var = this.d;
        az1Var.b = false;
        az1Var.c = false;
        az1 az1Var2 = this.e;
        az1Var2.b = false;
        az1Var2.c = false;
        az1 az1Var3 = this.f;
        az1Var3.b = false;
        az1Var3.c = false;
        l01 l01Var = this.k;
        if (l01Var != null) {
            l01Var.a();
        }
    }
}
