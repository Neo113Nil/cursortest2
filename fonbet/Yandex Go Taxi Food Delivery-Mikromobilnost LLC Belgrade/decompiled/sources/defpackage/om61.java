package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;
import yads.cs1;
import yads.t31;

/* loaded from: classes7.dex */
public final class om61 extends co61 {
    public s1n n;
    public int o;
    public boolean p;
    public uz31 q;
    public aj31 r;

    @Override // defpackage.co61
    public final long a(dl81 dl81Var) {
        byte[] bArr = dl81Var.a;
        byte b = bArr[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        s1n s1nVar = this.n;
        if (s1nVar == null) {
            ny61.k();
            return 0L;
        }
        boolean z = ((w7o[]) s1nVar.x)[(b >> 1) & (255 >>> (8 - s1nVar.a))].a;
        uz31 uz31Var = (uz31) s1nVar.b;
        int i = !z ? uz31Var.e : uz31Var.f;
        long j = this.p ? (this.o + i) / 4 : 0;
        int length = bArr.length;
        int i2 = dl81Var.c + 4;
        if (length < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2);
            int length2 = copyOf.length;
            dl81Var.a = copyOf;
            dl81Var.c = length2;
            dl81Var.b = 0;
        } else {
            dl81Var.k(i2);
        }
        byte[] bArr2 = dl81Var.a;
        int i3 = dl81Var.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // defpackage.co61
    public final void b(long j) {
        this.g = j;
        this.p = j != 0;
        uz31 uz31Var = this.q;
        this.o = uz31Var != null ? uz31Var.e : 0;
    }

    @Override // defpackage.co61
    public final void c(boolean z) {
        super.c(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x03f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03fb  */
    @Override // defpackage.co61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(dl81 dl81Var, long j, lg61 lg61Var) {
        s1n s1nVar;
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (this.n != null) {
            lg61Var.a.getClass();
            return false;
        }
        uz31 uz31Var = this.q;
        int i4 = 1;
        if (uz31Var == null) {
            w8a1.e(1, dl81Var, false);
            int h = dl81Var.h();
            if (h < 0) {
                ny61.r(q8a1.c(h, "Top bit not zero: "));
                return false;
            }
            int s = dl81Var.s();
            int h2 = dl81Var.h();
            if (h2 < 0) {
                ny61.r(q8a1.c(h2, "Top bit not zero: "));
                return false;
            }
            int h3 = dl81Var.h();
            int i5 = h3 <= 0 ? -1 : h3;
            int h4 = dl81Var.h();
            int i6 = h4 <= 0 ? -1 : h4;
            dl81Var.h();
            int s2 = dl81Var.s();
            int pow = (int) Math.pow(2.0d, s2 & 15);
            int pow2 = (int) Math.pow(2.0d, (s2 & PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC) >> 4);
            dl81Var.s();
            this.q = new uz31(s, h2, i5, i6, pow, pow2, Arrays.copyOf(dl81Var.a, dl81Var.c));
        } else {
            aj31 aj31Var = this.r;
            if (aj31Var != null) {
                int i7 = dl81Var.c;
                byte[] bArr = new byte[i7];
                System.arraycopy(dl81Var.a, 0, bArr, 0, i7);
                int i8 = uz31Var.a;
                int i9 = 5;
                w8a1.e(5, dl81Var, false);
                int s3 = dl81Var.s() + 1;
                a69 a69Var = new a69(dl81Var.a, 4);
                int i10 = 8;
                a69Var.f(dl81Var.b * 8);
                int i11 = 0;
                while (true) {
                    boolean z2 = z;
                    if (i11 < s3) {
                        int i12 = i10;
                        if (a69Var.a(24) != 5653314) {
                            su71.b((a69Var.d * 8) + a69Var.e, "expected code book to start with [0x56, 0x43, 0x42] at ");
                            return z2;
                        }
                        int a = a69Var.a(16);
                        int a2 = a69Var.a(24);
                        long[] jArr = new long[a2];
                        long j2 = 0;
                        if (a69Var.c()) {
                            i = i4;
                            int a3 = a69Var.a(i9) + 1;
                            int i13 = z2 ? 1 : 0;
                            while (i13 < a2) {
                                int i14 = z2 ? 1 : 0;
                                for (int i15 = a2 - i13; i15 > 0; i15 >>>= 1) {
                                    i14++;
                                }
                                int a4 = a69Var.a(i14);
                                int i16 = z2 ? 1 : 0;
                                while (i16 < a4 && i13 < a2) {
                                    jArr[i13] = a3;
                                    i13++;
                                    i16++;
                                    uz31Var = uz31Var;
                                    aj31Var = aj31Var;
                                }
                                a3++;
                                uz31Var = uz31Var;
                                aj31Var = aj31Var;
                            }
                        } else {
                            boolean c = a69Var.c();
                            i = i4;
                            int i17 = z2 ? 1 : 0;
                            while (i17 < a2) {
                                if (c) {
                                    if (a69Var.c()) {
                                        i3 = i17;
                                        jArr[i3] = a69Var.a(i9) + 1;
                                    } else {
                                        i3 = i17;
                                        jArr[i3] = 0;
                                    }
                                    i2 = 5;
                                } else {
                                    i2 = i9;
                                    i3 = i17;
                                    jArr[i3] = a69Var.a(i2) + 1;
                                }
                                i17 = i3 + 1;
                                i9 = i2;
                            }
                        }
                        aj31 aj31Var2 = aj31Var;
                        uz31 uz31Var2 = uz31Var;
                        int a5 = a69Var.a(4);
                        if (a5 > 2) {
                            dy31.g(null, q8a1.c(a5, "lookup type greater than 2 not decodable: "));
                            return z2;
                        }
                        int i18 = i;
                        if (a5 == i18 || a5 == 2) {
                            a69Var.f(32);
                            a69Var.f(32);
                            int a6 = a69Var.a(4) + i18;
                            a69Var.f(i18);
                            if (a5 != i18) {
                                j2 = a2 * a;
                            } else if (a != 0) {
                                j2 = (long) Math.floor(Math.pow(a2, 1.0d / a));
                            }
                            a69Var.f((int) (a6 * j2));
                        }
                        i11++;
                        i10 = i12;
                        z = z2 ? 1 : 0;
                        uz31Var = uz31Var2;
                        aj31Var = aj31Var2;
                        i9 = 5;
                        i4 = 1;
                    } else {
                        aj31 aj31Var3 = aj31Var;
                        uz31 uz31Var3 = uz31Var;
                        int i19 = i10;
                        int i20 = 6;
                        int a7 = a69Var.a(6) + 1;
                        for (int i21 = z2 ? 1 : 0; i21 < a7; i21++) {
                            if (a69Var.a(16) != 0) {
                                dy31.g(null, "placeholder of time domain transforms not zeroed out");
                                return z2;
                            }
                        }
                        int i22 = 1;
                        int a8 = a69Var.a(6) + 1;
                        int i23 = z2 ? 1 : 0;
                        while (true) {
                            int i24 = 3;
                            if (i23 < a8) {
                                int a9 = a69Var.a(16);
                                if (a9 == 0) {
                                    int i25 = i19;
                                    a69Var.f(i25);
                                    a69Var.f(16);
                                    a69Var.f(16);
                                    a69Var.f(6);
                                    a69Var.f(i25);
                                    int a10 = a69Var.a(4) + 1;
                                    int i26 = z2 ? 1 : 0;
                                    while (i26 < a10) {
                                        a69Var.f(i25);
                                        i26++;
                                        i25 = 8;
                                    }
                                } else {
                                    if (a9 != i22) {
                                        dy31.g(null, q8a1.c(a9, "floor type greater than 1 not decodable: "));
                                        return z2;
                                    }
                                    int a11 = a69Var.a(5);
                                    int[] iArr = new int[a11];
                                    int i27 = -1;
                                    for (int i28 = z2 ? 1 : 0; i28 < a11; i28++) {
                                        int a12 = a69Var.a(4);
                                        iArr[i28] = a12;
                                        if (a12 > i27) {
                                            i27 = a12;
                                        }
                                    }
                                    int i29 = i27 + 1;
                                    int[] iArr2 = new int[i29];
                                    int i30 = z2 ? 1 : 0;
                                    while (i30 < i29) {
                                        iArr2[i30] = a69Var.a(i24) + 1;
                                        int a13 = a69Var.a(2);
                                        int i31 = i19;
                                        if (a13 > 0) {
                                            a69Var.f(i31);
                                        }
                                        int i32 = z2 ? 1 : 0;
                                        for (int i33 = 1; i32 < (i33 << a13); i33 = 1) {
                                            a69Var.f(i31);
                                            i32++;
                                            i31 = 8;
                                        }
                                        i30++;
                                        i19 = 8;
                                        i24 = 3;
                                    }
                                    a69Var.f(2);
                                    int a14 = a69Var.a(4);
                                    int i34 = z2 ? 1 : 0;
                                    int i35 = i34;
                                    int i36 = i35;
                                    while (i34 < a11) {
                                        i35 += iArr2[iArr[i34]];
                                        while (i36 < i35) {
                                            a69Var.f(a14);
                                            i36++;
                                        }
                                        i34++;
                                    }
                                }
                                i23++;
                                i19 = 8;
                                i20 = 6;
                                i22 = 1;
                            } else {
                                int a15 = a69Var.a(i20) + 1;
                                int i37 = z2 ? 1 : 0;
                                while (i37 < a15) {
                                    if (a69Var.a(16) > 2) {
                                        dy31.g(null, "residueType greater than 2 is not decodable");
                                        return z2;
                                    }
                                    a69Var.f(24);
                                    a69Var.f(24);
                                    a69Var.f(24);
                                    int a16 = a69Var.a(i20) + 1;
                                    int i38 = 8;
                                    a69Var.f(8);
                                    int[] iArr3 = new int[a16];
                                    for (int i39 = z2 ? 1 : 0; i39 < a16; i39++) {
                                        iArr3[i39] = ((a69Var.c() ? a69Var.a(5) : z2 ? 1 : 0) * 8) + a69Var.a(3);
                                    }
                                    int i40 = z2 ? 1 : 0;
                                    while (i40 < a16) {
                                        int i41 = z2 ? 1 : 0;
                                        while (i41 < i38) {
                                            if ((iArr3[i40] & (1 << i41)) != 0) {
                                                a69Var.f(i38);
                                            }
                                            i41++;
                                            i38 = 8;
                                        }
                                        i40++;
                                        i38 = 8;
                                    }
                                    i37++;
                                    i20 = 6;
                                }
                                int a17 = a69Var.a(i20) + 1;
                                for (int i42 = z2 ? 1 : 0; i42 < a17; i42++) {
                                    int a18 = a69Var.a(16);
                                    if (a18 != 0) {
                                        nba1.c("VorbisUtil", "mapping type other than 0 not supported: " + a18);
                                    } else {
                                        int a19 = a69Var.c() ? a69Var.a(4) + 1 : 1;
                                        if (a69Var.c()) {
                                            int a20 = a69Var.a(8) + 1;
                                            for (int i43 = z2 ? 1 : 0; i43 < a20; i43++) {
                                                int i44 = i8 - 1;
                                                int i45 = z2 ? 1 : 0;
                                                for (int i46 = i44; i46 > 0; i46 >>>= 1) {
                                                    i45++;
                                                }
                                                a69Var.f(i45);
                                                int i47 = z2 ? 1 : 0;
                                                while (i44 > 0) {
                                                    i47++;
                                                    i44 >>>= 1;
                                                }
                                                a69Var.f(i47);
                                            }
                                        }
                                        if (a69Var.a(2) != 0) {
                                            dy31.g(null, "to reserved bits must be zero after mapping coupling steps");
                                            return z2;
                                        }
                                        if (a19 > 1) {
                                            for (int i48 = z2 ? 1 : 0; i48 < i8; i48++) {
                                                a69Var.f(4);
                                            }
                                        }
                                        for (int i49 = z2 ? 1 : 0; i49 < a19; i49++) {
                                            a69Var.f(8);
                                            a69Var.f(8);
                                            a69Var.f(8);
                                        }
                                    }
                                }
                                int a21 = a69Var.a(6);
                                int i50 = a21 + 1;
                                w7o[] w7oVarArr = new w7o[i50];
                                for (int i51 = z2 ? 1 : 0; i51 < i50; i51++) {
                                    boolean c2 = a69Var.c();
                                    a69Var.a(16);
                                    a69Var.a(16);
                                    a69Var.a(8);
                                    w7oVarArr[i51] = new w7o(c2);
                                }
                                if (!a69Var.c()) {
                                    dy31.g(null, "framing bit after modes not set as expected");
                                    return z2;
                                }
                                int i52 = z2 ? 1 : 0;
                                while (a21 > 0) {
                                    i52++;
                                    a21 >>>= 1;
                                }
                                s1nVar = new s1n(uz31Var3, aj31Var3, bArr, w7oVarArr, i52);
                            }
                        }
                    }
                }
                this.n = s1nVar;
                if (s1nVar != null) {
                    return true;
                }
                uz31 uz31Var4 = (uz31) s1nVar.b;
                ArrayList arrayList = new ArrayList();
                arrayList.add(uz31Var4.g);
                arrayList.add((byte[]) s1nVar.w);
                cs1 d = w8a1.d(t31.q((String[]) ((aj31) s1nVar.c).b));
                da81 da81Var = new da81();
                da81Var.k = "audio/vorbis";
                da81Var.f = uz31Var4.d;
                da81Var.g = uz31Var4.c;
                da81Var.x = uz31Var4.a;
                da81Var.y = uz31Var4.b;
                da81Var.m = arrayList;
                da81Var.i = d;
                lg61Var.a = new qd81(da81Var);
                return true;
            }
            this.r = w8a1.c(dl81Var, true, true);
        }
        s1nVar = null;
        this.n = s1nVar;
        if (s1nVar != null) {
        }
    }
}
