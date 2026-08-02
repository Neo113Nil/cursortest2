package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class j01 implements vl0 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final kc3 a;
    public i01 f;
    public long g;
    public String h;
    public q83 i;
    public boolean j;
    public final boolean[] c = new boolean[4];
    public final h01 d = new h01();
    public long k = C.TIME_UNSET;
    public final az1 e = new az1(178);
    public final kc2 b = new kc2();

    public j01(kc3 kc3Var) {
        this.a = kc3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0140  */
    @Override // yads.vl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(kc2 kc2Var) {
        int i;
        int i2;
        boolean z;
        i01 i01Var;
        long j;
        int i3;
        int i4;
        float f;
        if (this.f == null) {
            throw new IllegalStateException();
        }
        q83 q83Var = this.i;
        if (q83Var == null) {
            throw new IllegalStateException();
        }
        int i5 = kc2Var.b;
        int i6 = kc2Var.c;
        byte[] bArr = kc2Var.a;
        int i7 = i6 - i5;
        this.g += i7;
        q83Var.a(i7, kc2Var);
        while (true) {
            int a = ez1.a(bArr, i5, i6, this.c);
            if (a == i6) {
                if (!this.j) {
                    this.d.a(bArr, i5, i6);
                }
                i01 i01Var2 = this.f;
                if (i01Var2.c) {
                    int i8 = i01Var2.f;
                    int i9 = (i5 + 1) - i8;
                    if (i9 < i6) {
                        i01Var2.d = ((bArr[i9] & 192) >> 6) == 0;
                        i01Var2.c = false;
                    } else {
                        i01Var2.f = (i6 - i5) + i8;
                    }
                }
                az1 az1Var = this.e;
                if (az1Var != null) {
                    az1Var.a(bArr, i5, i6);
                    return;
                }
                return;
            }
            int i10 = a + 3;
            byte b = kc2Var.a[i10];
            int i11 = b & 255;
            int i12 = a - i5;
            if (this.j) {
                i = i6;
                i2 = i10;
            } else {
                if (i12 > 0) {
                    this.d.a(bArr, i5, a);
                }
                int i13 = i12 < 0 ? -i12 : 0;
                h01 h01Var = this.d;
                int i14 = h01Var.b;
                if (i14 != 0) {
                    i = i6;
                    if (i14 == 1) {
                        i2 = i10;
                        i4 = 0;
                        if (i11 != 181) {
                            ji1.d("H263Reader", "Unexpected start code value");
                            h01Var.a = false;
                            h01Var.c = 0;
                            h01Var.b = 0;
                        } else {
                            h01Var.b = 2;
                        }
                    } else if (i14 == 2) {
                        i2 = i10;
                        i4 = 0;
                        if (i11 > 31) {
                            ji1.d("H263Reader", "Unexpected start code value");
                            h01Var.a = false;
                            h01Var.c = 0;
                            h01Var.b = 0;
                        } else {
                            h01Var.b = 3;
                        }
                    } else if (i14 == 3) {
                        i2 = i10;
                        if ((b & 240) != 32) {
                            ji1.d("H263Reader", "Unexpected start code value");
                            i4 = 0;
                            h01Var.a = false;
                            h01Var.c = 0;
                            h01Var.b = 0;
                        } else {
                            i4 = 0;
                            h01Var.d = h01Var.c;
                            h01Var.b = 4;
                        }
                    } else {
                        if (i14 != 4) {
                            throw new IllegalStateException();
                        }
                        if (i11 == 179 || i11 == 181) {
                            h01Var.c -= i13;
                            h01Var.a = false;
                            q83 q83Var2 = this.i;
                            int i15 = h01Var.d;
                            String str = this.h;
                            str.getClass();
                            byte[] copyOf = Arrays.copyOf(h01Var.e, h01Var.c);
                            jc2 jc2Var = new jc2(copyOf.length, copyOf);
                            jc2Var.d(i15);
                            jc2Var.d(4);
                            jc2Var.g();
                            jc2Var.c(8);
                            if (jc2Var.e()) {
                                jc2Var.c(4);
                                jc2Var.c(3);
                            }
                            int a2 = jc2Var.a(4);
                            i2 = i10;
                            if (a2 == 15) {
                                int a3 = jc2Var.a(8);
                                int a4 = jc2Var.a(8);
                                if (a4 == 0) {
                                    ji1.d("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                    if (jc2Var.e()) {
                                        jc2Var.c(2);
                                        jc2Var.c(1);
                                        if (jc2Var.e()) {
                                            jc2Var.c(15);
                                            jc2Var.g();
                                            jc2Var.c(15);
                                            jc2Var.g();
                                            jc2Var.c(15);
                                            jc2Var.g();
                                            jc2Var.c(3);
                                            jc2Var.c(11);
                                            jc2Var.g();
                                            jc2Var.c(15);
                                            jc2Var.g();
                                        }
                                    }
                                    if (jc2Var.a(2) != 0) {
                                        ji1.d("H263Reader", "Unhandled video object layer shape");
                                    }
                                    jc2Var.g();
                                    int a5 = jc2Var.a(16);
                                    jc2Var.g();
                                    if (jc2Var.e()) {
                                        if (a5 == 0) {
                                            ji1.d("H263Reader", "Invalid vop_increment_time_resolution");
                                        } else {
                                            int i16 = 0;
                                            for (int i17 = a5 - 1; i17 > 0; i17 >>= 1) {
                                                i16++;
                                            }
                                            jc2Var.c(i16);
                                        }
                                    }
                                    jc2Var.g();
                                    int a6 = jc2Var.a(13);
                                    jc2Var.g();
                                    int a7 = jc2Var.a(13);
                                    jc2Var.g();
                                    jc2Var.g();
                                    mx0 mx0Var = new mx0();
                                    mx0Var.a = str;
                                    mx0Var.k = MimeTypes.VIDEO_MP4V;
                                    mx0Var.p = a6;
                                    mx0Var.q = a7;
                                    mx0Var.t = f;
                                    mx0Var.m = Collections.singletonList(copyOf);
                                    q83Var2.a(new nx0(mx0Var));
                                    this.j = true;
                                } else {
                                    f = a3 / a4;
                                    if (jc2Var.e()) {
                                    }
                                    if (jc2Var.a(2) != 0) {
                                    }
                                    jc2Var.g();
                                    int a52 = jc2Var.a(16);
                                    jc2Var.g();
                                    if (jc2Var.e()) {
                                    }
                                    jc2Var.g();
                                    int a62 = jc2Var.a(13);
                                    jc2Var.g();
                                    int a72 = jc2Var.a(13);
                                    jc2Var.g();
                                    jc2Var.g();
                                    mx0 mx0Var2 = new mx0();
                                    mx0Var2.a = str;
                                    mx0Var2.k = MimeTypes.VIDEO_MP4V;
                                    mx0Var2.p = a62;
                                    mx0Var2.q = a72;
                                    mx0Var2.t = f;
                                    mx0Var2.m = Collections.singletonList(copyOf);
                                    q83Var2.a(new nx0(mx0Var2));
                                    this.j = true;
                                }
                            } else {
                                float[] fArr = l;
                                if (a2 < 7) {
                                    f = fArr[a2];
                                    if (jc2Var.e()) {
                                    }
                                    if (jc2Var.a(2) != 0) {
                                    }
                                    jc2Var.g();
                                    int a522 = jc2Var.a(16);
                                    jc2Var.g();
                                    if (jc2Var.e()) {
                                    }
                                    jc2Var.g();
                                    int a622 = jc2Var.a(13);
                                    jc2Var.g();
                                    int a722 = jc2Var.a(13);
                                    jc2Var.g();
                                    jc2Var.g();
                                    mx0 mx0Var22 = new mx0();
                                    mx0Var22.a = str;
                                    mx0Var22.k = MimeTypes.VIDEO_MP4V;
                                    mx0Var22.p = a622;
                                    mx0Var22.q = a722;
                                    mx0Var22.t = f;
                                    mx0Var22.m = Collections.singletonList(copyOf);
                                    q83Var2.a(new nx0(mx0Var22));
                                    this.j = true;
                                } else {
                                    ji1.d("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                    if (jc2Var.e()) {
                                    }
                                    if (jc2Var.a(2) != 0) {
                                    }
                                    jc2Var.g();
                                    int a5222 = jc2Var.a(16);
                                    jc2Var.g();
                                    if (jc2Var.e()) {
                                    }
                                    jc2Var.g();
                                    int a6222 = jc2Var.a(13);
                                    jc2Var.g();
                                    int a7222 = jc2Var.a(13);
                                    jc2Var.g();
                                    jc2Var.g();
                                    mx0 mx0Var222 = new mx0();
                                    mx0Var222.a = str;
                                    mx0Var222.k = MimeTypes.VIDEO_MP4V;
                                    mx0Var222.p = a6222;
                                    mx0Var222.q = a7222;
                                    mx0Var222.t = f;
                                    mx0Var222.m = Collections.singletonList(copyOf);
                                    q83Var2.a(new nx0(mx0Var222));
                                    this.j = true;
                                }
                            }
                        } else {
                            i2 = i10;
                            i4 = 0;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i10;
                    i4 = 0;
                    if (i11 == 176) {
                        h01Var.b = 1;
                        h01Var.a = true;
                    }
                }
                h01Var.a(h01.f, i4, 3);
            }
            i01 i01Var3 = this.f;
            if (i01Var3.c) {
                int i18 = i01Var3.f;
                int i19 = (i5 + 1) - i18;
                if (i19 < a) {
                    i01Var3.d = ((bArr[i19] & 192) >> 6) == 0;
                    i01Var3.c = false;
                } else {
                    i01Var3.f = i18 + i12;
                }
            }
            az1 az1Var2 = this.e;
            if (az1Var2 != null) {
                if (i12 > 0) {
                    az1Var2.a(bArr, i5, a);
                    i3 = 0;
                } else {
                    i3 = -i12;
                }
                if (this.e.a(i3)) {
                    az1 az1Var3 = this.e;
                    int a8 = ez1.a(az1Var3.e, az1Var3.d);
                    kc2 kc2Var2 = this.b;
                    int i20 = mc3.a;
                    kc2Var2.a = this.e.d;
                    kc2Var2.c = a8;
                    kc2Var2.b = 0;
                    kc3 kc3Var = this.a;
                    long j2 = this.k;
                    kc3Var.getClass();
                    if (kc2Var2.c - kc2Var2.b >= 9) {
                        int b2 = kc2Var2.b();
                        int b3 = kc2Var2.b();
                        int m = kc2Var2.m();
                        if (b2 == 434 && b3 == 1195456820 && m == 3) {
                            rt.b(j2, kc2Var2, kc3Var.b);
                        }
                    }
                }
                if (i11 == 178) {
                    z = true;
                    if (kc2Var.a[a + 2] == 1) {
                        this.e.b(i11);
                    }
                    int i21 = i - a;
                    long j3 = this.g - i21;
                    i01Var = this.f;
                    boolean z2 = this.j;
                    if (i01Var.e == 182 && z2 && i01Var.b) {
                        j = i01Var.h;
                        if (j != C.TIME_UNSET) {
                            i01Var.a.a(j, i01Var.d ? 1 : 0, (int) (j3 - i01Var.g), i21, null);
                        }
                    }
                    if (i01Var.e != 179) {
                        i01Var.g = j3;
                    }
                    i01 i01Var4 = this.f;
                    long j4 = this.k;
                    i01Var4.e = i11;
                    i01Var4.d = false;
                    i01Var4.b = (i11 != 182 || i11 == 179) ? z : false;
                    if (i11 == 182) {
                        z = false;
                    }
                    i01Var4.c = z;
                    i01Var4.f = 0;
                    i01Var4.h = j4;
                    i6 = i;
                    i5 = i2;
                }
            }
            z = true;
            int i212 = i - a;
            long j32 = this.g - i212;
            i01Var = this.f;
            boolean z22 = this.j;
            if (i01Var.e == 182) {
                j = i01Var.h;
                if (j != C.TIME_UNSET) {
                }
            }
            if (i01Var.e != 179) {
            }
            i01 i01Var42 = this.f;
            long j42 = this.k;
            i01Var42.e = i11;
            i01Var42.d = false;
            i01Var42.b = (i11 != 182 || i11 == 179) ? z : false;
            if (i11 == 182) {
            }
            i01Var42.c = z;
            i01Var42.f = 0;
            i01Var42.h = j42;
            i6 = i;
            i5 = i2;
        }
    }

    @Override // yads.vl0
    public final void b() {
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, pa3 pa3Var) {
        pa3Var.a();
        pa3Var.b();
        this.h = pa3Var.e;
        pa3Var.b();
        q83 a = qq0Var.a(pa3Var.d, 2);
        this.i = a;
        this.f = new i01(a);
        kc3 kc3Var = this.a;
        if (kc3Var != null) {
            kc3Var.a(qq0Var, pa3Var);
        }
    }

    @Override // yads.vl0
    public final void a(int i, long j) {
        if (j != C.TIME_UNSET) {
            this.k = j;
        }
    }

    @Override // yads.vl0
    public final void a() {
        ez1.a(this.c);
        h01 h01Var = this.d;
        h01Var.a = false;
        h01Var.c = 0;
        h01Var.b = 0;
        i01 i01Var = this.f;
        if (i01Var != null) {
            i01Var.b = false;
            i01Var.c = false;
            i01Var.d = false;
            i01Var.e = -1;
        }
        az1 az1Var = this.e;
        if (az1Var != null) {
            az1Var.b = false;
            az1Var.c = false;
        }
        this.g = 0L;
        this.k = C.TIME_UNSET;
    }
}
