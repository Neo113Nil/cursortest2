package xsna;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: NalUnitUtil.java */
/* loaded from: classes12.dex */
public final class rt50 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    /* compiled from: NalUnitUtil.java */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class c {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int[] e;
        public final int f;

        public c(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = iArr;
            this.f = i4;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class d {
        public final ImmutableList<c> a;
        public final int[] b;

        public d(com.google.common.collect.g gVar, int[] iArr) {
            this.a = ImmutableList.m(gVar);
            this.b = iArr;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class e {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public e(int i, int i2, int i3, int i4, int i5) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class f {
        public final ImmutableList<e> a;
        public final int[] b;

        public f(com.google.common.collect.g gVar, int[] iArr) {
            this.a = ImmutableList.m(gVar);
            this.b = iArr;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class g {
        public final int a;

        public g(int i) {
            this.a = i;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class h {
        public final int a;

        @Nullable
        public final c b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final float j;
        public final int k;
        public final int l;
        public final int m;
        public final int n;

        public h(int i, @Nullable c cVar, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, int i9, int i10, int i11, int i12) {
            this.a = i;
            this.b = cVar;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.j = f;
            this.k = i9;
            this.l = i10;
            this.m = i11;
            this.n = i12;
            this.h = i7;
            this.i = i8;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class i {
        public final int a;
        public final int b;
        public final int c;

        public i(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class j {
        public final ImmutableList<i> a;
        public final int[] b;

        public j(com.google.common.collect.g gVar, int[] iArr) {
            this.a = ImmutableList.m(gVar);
            this.b = iArr;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class k {
        public final ImmutableList<a> a;
        public final d b;

        @Nullable
        public final f c;

        @Nullable
        public final j d;

        public k(@Nullable com.google.common.collect.g gVar, d dVar, @Nullable f fVar, @Nullable j jVar) {
            ImmutableList<a> immutableList;
            if (gVar != null) {
                immutableList = ImmutableList.m(gVar);
            } else {
                ImmutableList.b bVar = ImmutableList.c;
                immutableList = com.google.common.collect.g.f;
            }
            this.a = immutableList;
            this.b = dVar;
            this.c = fVar;
            this.d = jVar;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class l {
        public final int a;
        public final boolean b;

        public l(int i, int i2, boolean z) {
            this.a = i2;
            this.b = z;
        }
    }

    /* compiled from: NalUnitUtil.java */
    public static final class m {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final float g;
        public final int h;
        public final int i;
        public final boolean j;
        public final boolean k;
        public final int l;
        public final int m;
        public final int n;
        public final boolean o;
        public final int p;
        public final int q;
        public final int r;
        public final int s;

        public m(int i, int i2, int i3, int i4, int i5, int i6, float f, int i7, int i8, boolean z, boolean z2, int i9, int i10, int i11, boolean z3, int i12, int i13, int i14, int i15) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = f;
            this.h = i7;
            this.i = i8;
            this.j = z;
            this.k = z2;
            this.l = i9;
            this.m = i10;
            this.n = i11;
            this.o = z3;
            this.p = i12;
            this.q = i13;
            this.r = i14;
            this.s = i15;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        fxc0.z(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            a(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            a(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            a(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    @Nullable
    public static String c(androidx.media3.common.a aVar) {
        String str = aVar.n;
        String str2 = aVar.k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return aVar.n;
    }

    public static boolean d(byte[] bArr, int i2, androidx.media3.common.a aVar) {
        int i3;
        if (Objects.equals(aVar.n, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i3 = b2 & 31) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(aVar.n, "video/hevc")) {
            b f2 = f(new yi90(bArr, 4, i2 + 4));
            int i4 = f2.a;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && f2.c == aVar.E - 1) {
                return false;
            }
        }
        return true;
    }

    public static int e(androidx.media3.common.a aVar) {
        String c2 = c(aVar);
        if (Objects.equals(c2, "video/avc")) {
            return 1;
        }
        return Objects.equals(c2, "video/hevc") ? 2 : 0;
    }

    public static b f(yi90 yi90Var) {
        yi90Var.i();
        return new b(yi90Var.e(6), yi90Var.e(6), yi90Var.e(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c g(yi90 yi90Var, boolean z, int i2, @Nullable c cVar) {
        int[] iArr;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int[] iArr2 = new int[6];
        if (z) {
            int e2 = yi90Var.e(2);
            z3 = yi90Var.d();
            i6 = yi90Var.e(5);
            i7 = 0;
            for (int i8 = 0; i8 < 32; i8++) {
                if (yi90Var.d()) {
                    i7 |= 1 << i8;
                }
            }
            for (int i9 = 0; i9 < 6; i9++) {
                iArr2[i9] = yi90Var.e(8);
            }
            i3 = e2;
        } else {
            if (cVar == null) {
                iArr = iArr2;
                i3 = 0;
                z2 = false;
                i4 = 0;
                i5 = 0;
                int e3 = yi90Var.e(8);
                int i10 = 0;
                for (int i11 = 0; i11 < i2; i11++) {
                    if (yi90Var.d()) {
                        i10 += 88;
                    }
                    if (yi90Var.d()) {
                        i10 += 8;
                    }
                }
                yi90Var.j(i10);
                if (i2 > 0) {
                    yi90Var.j((8 - i2) * 2);
                }
                return new c(i3, z2, i4, i5, iArr, e3);
            }
            int i12 = cVar.a;
            z3 = cVar.b;
            i6 = cVar.c;
            i7 = cVar.d;
            iArr2 = cVar.e;
            i3 = i12;
        }
        iArr = iArr2;
        z2 = z3;
        i4 = i6;
        i5 = i7;
        int e32 = yi90Var.e(8);
        int i102 = 0;
        while (i11 < i2) {
        }
        yi90Var.j(i102);
        if (i2 > 0) {
        }
        return new c(i3, z2, i4, i5, iArr, e32);
    }

    @Nullable
    public static g h(int i2, int i3, byte[] bArr) {
        byte b2;
        int i4 = i2 + 2;
        do {
            i3--;
            b2 = bArr[i3];
            if (b2 != 0) {
                break;
            }
        } while (i3 > i4);
        if (b2 == 0 || i3 <= i4) {
            return null;
        }
        yi90 yi90Var = new yi90(bArr, i4, i3 + 1);
        while (yi90Var.b(16)) {
            int e2 = yi90Var.e(8);
            int i5 = 0;
            while (e2 == 255) {
                i5 += 255;
                e2 = yi90Var.e(8);
            }
            int i6 = i5 + e2;
            int e3 = yi90Var.e(8);
            int i7 = 0;
            while (e3 == 255) {
                i7 += 255;
                e3 = yi90Var.e(8);
            }
            int i8 = i7 + e3;
            if (i8 == 0 || !yi90Var.b(i8)) {
                return null;
            }
            if (i6 == 176) {
                int f2 = yi90Var.f();
                boolean d2 = yi90Var.d();
                int f3 = d2 ? yi90Var.f() : 0;
                int f4 = yi90Var.f();
                int i9 = -1;
                for (int i10 = 0; i10 <= f4; i10++) {
                    i9 = yi90Var.f();
                    yi90Var.f();
                    int e4 = yi90Var.e(6);
                    if (e4 == 63) {
                        return null;
                    }
                    yi90Var.e(e4 == 0 ? Math.max(0, f2 - 30) : Math.max(0, (e4 + f2) - 31));
                    if (d2) {
                        int e5 = yi90Var.e(6);
                        if (e5 == 63) {
                            return null;
                        }
                        yi90Var.e(e5 == 0 ? Math.max(0, f3 - 30) : Math.max(0, (e5 + f3) - 31));
                    }
                    if (yi90Var.d()) {
                        yi90Var.j(10);
                    }
                }
                return new g(i9);
            }
            yi90Var.j(i8 * 8);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h i(byte[] bArr, int i2, int i3, @Nullable k kVar) {
        int i4;
        int f2;
        int i5;
        int i6;
        int f3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int f4;
        int i14;
        float f5;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        j jVar;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        f fVar;
        b f6 = f(new yi90(bArr, i2, i3));
        int i28 = 2;
        yi90 yi90Var = new yi90(bArr, i2 + 2, i3);
        yi90Var.j(4);
        int e2 = yi90Var.e(3);
        int i29 = f6.b;
        boolean z = i29 != 0 && e2 == 7;
        if (kVar != null) {
            ImmutableList<a> immutableList = kVar.a;
            if (!immutableList.isEmpty()) {
                i4 = immutableList.get(Math.min(i29, immutableList.size() - 1)).a;
                c cVar = null;
                if (z) {
                    yi90Var.i();
                    cVar = g(yi90Var, true, e2, null);
                } else if (kVar != null) {
                    d dVar = kVar.b;
                    int[] iArr = dVar.b;
                    ImmutableList<c> immutableList2 = dVar.a;
                    int i30 = iArr[i4];
                    if (immutableList2.size() > i30) {
                        cVar = immutableList2.get(i30);
                    }
                }
                yi90Var.f();
                if (z) {
                    f2 = yi90Var.f();
                    if (f2 == 3) {
                        yi90Var.i();
                    }
                    int f7 = yi90Var.f();
                    int f8 = yi90Var.f();
                    if (yi90Var.d()) {
                        int f9 = yi90Var.f();
                        int f10 = yi90Var.f();
                        int f11 = yi90Var.f();
                        int f12 = yi90Var.f();
                        if (f2 != 1 && f2 != 2) {
                            i28 = 1;
                        }
                        i6 = uf3.a(f9, f10, i28, f7);
                        i5 = uf3.a(f11, f12, f2 == 1 ? 2 : 1, f8);
                    } else {
                        i5 = f8;
                        i6 = f7;
                    }
                    int f13 = yi90Var.f();
                    f3 = yi90Var.f();
                    i7 = i5;
                    i8 = f8;
                    i9 = i6;
                    i10 = f7;
                    i11 = f13;
                } else {
                    int e3 = yi90Var.d() ? yi90Var.e(8) : -1;
                    if (kVar != null && (fVar = kVar.c) != null) {
                        ImmutableList<e> immutableList3 = fVar.a;
                        if (e3 == -1) {
                            e3 = fVar.b[i4];
                        }
                        if (e3 != -1 && immutableList3.size() > e3) {
                            e eVar = immutableList3.get(e3);
                            f2 = eVar.a;
                            i9 = eVar.d;
                            i7 = eVar.e;
                            int i31 = eVar.b;
                            f3 = eVar.c;
                            i11 = i31;
                            i8 = i7;
                            i10 = i9;
                        }
                    }
                    i8 = 0;
                    i10 = 0;
                    i11 = 0;
                    i7 = 0;
                    f3 = 0;
                    f2 = 0;
                    i9 = 0;
                }
                int f14 = yi90Var.f();
                if (z) {
                    i12 = 1;
                    int i32 = yi90Var.d() ? 0 : e2;
                    i13 = -1;
                    while (i32 <= e2) {
                        yi90Var.f();
                        i13 = Math.max(yi90Var.f(), i13);
                        yi90Var.f();
                        i32++;
                        i8 = i8;
                    }
                } else {
                    i12 = 1;
                    i13 = -1;
                }
                int i33 = i8;
                yi90Var.f();
                yi90Var.f();
                yi90Var.f();
                yi90Var.f();
                yi90Var.f();
                yi90Var.f();
                if (yi90Var.d()) {
                    int i34 = 6;
                    if (z ? yi90Var.d() : false) {
                        yi90Var.j(6);
                    } else if (yi90Var.d()) {
                        int i35 = 0;
                        int i36 = 4;
                        while (i35 < i36) {
                            int i37 = i36;
                            int i38 = 0;
                            while (i38 < i34) {
                                if (yi90Var.d()) {
                                    i27 = i13;
                                    int min = Math.min(64, i12 << ((i35 << 1) + 4));
                                    if (i35 > i12) {
                                        yi90Var.g();
                                    }
                                    for (int i39 = 0; i39 < min; i39++) {
                                        yi90Var.g();
                                    }
                                } else {
                                    yi90Var.f();
                                    i27 = i13;
                                }
                                i38 += i35 == 3 ? 3 : 1;
                                i13 = i27;
                                i34 = 6;
                                i12 = 1;
                            }
                            i35++;
                            i36 = i37;
                            i34 = 6;
                            i12 = 1;
                        }
                    }
                }
                int i40 = i13;
                yi90Var.j(2);
                if (yi90Var.d()) {
                    yi90Var.j(8);
                    yi90Var.f();
                    yi90Var.f();
                    yi90Var.i();
                }
                f4 = yi90Var.f();
                i14 = 0;
                int[] iArr2 = new int[0];
                int i41 = i4;
                int[] iArr3 = new int[0];
                int i42 = -1;
                int i43 = -1;
                while (i14 < f4) {
                    if (i14 == 0 || !yi90Var.d()) {
                        i23 = f4;
                        i24 = i14;
                        i25 = i10;
                        i26 = f14;
                        int f15 = yi90Var.f();
                        int f16 = yi90Var.f();
                        int[] iArr4 = new int[f15];
                        int i44 = 0;
                        while (i44 < f15) {
                            iArr4[i44] = (i44 > 0 ? iArr4[i44 - 1] : 0) - (yi90Var.f() + 1);
                            yi90Var.i();
                            i44++;
                        }
                        int[] iArr5 = new int[f16];
                        int i45 = 0;
                        while (i45 < f16) {
                            iArr5[i45] = yi90Var.f() + 1 + (i45 > 0 ? iArr5[i45 - 1] : 0);
                            yi90Var.i();
                            i45++;
                        }
                        iArr3 = iArr4;
                        iArr2 = iArr5;
                        i42 = f15;
                        i43 = f16;
                    } else {
                        i23 = f4;
                        int i46 = i42 + i43;
                        int f17 = (1 - ((yi90Var.d() ? 1 : 0) * 2)) * (yi90Var.f() + 1);
                        i24 = i14;
                        int i47 = i46 + 1;
                        i25 = i10;
                        boolean[] zArr = new boolean[i47];
                        for (int i48 = 0; i48 <= i46; i48++) {
                            if (yi90Var.d()) {
                                zArr[i48] = true;
                            } else {
                                zArr[i48] = yi90Var.d();
                            }
                        }
                        int[] iArr6 = new int[i47];
                        int[] iArr7 = new int[i47];
                        int i49 = 0;
                        for (int i50 = i43 - 1; i50 >= 0; i50--) {
                            int i51 = iArr2[i50] + f17;
                            if (i51 < 0 && zArr[i42 + i50]) {
                                iArr6[i49] = i51;
                                i49++;
                            }
                        }
                        if (f17 < 0 && zArr[i46]) {
                            iArr6[i49] = f17;
                            i49++;
                        }
                        int i52 = i49;
                        i26 = f14;
                        for (int i53 = 0; i53 < i42; i53++) {
                            int i54 = iArr3[i53] + f17;
                            if (i54 < 0 && zArr[i53]) {
                                iArr6[i52] = i54;
                                i52++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr6, i52);
                        int i55 = 0;
                        for (int i56 = i42 - 1; i56 >= 0; i56--) {
                            int i57 = iArr3[i56] + f17;
                            if (i57 > 0 && zArr[i56]) {
                                iArr7[i55] = i57;
                                i55++;
                            }
                        }
                        if (f17 > 0 && zArr[i46]) {
                            iArr7[i55] = f17;
                            i55++;
                        }
                        int i58 = i52;
                        int i59 = i55;
                        for (int i60 = 0; i60 < i43; i60++) {
                            int i61 = iArr2[i60] + f17;
                            if (i61 > 0 && zArr[i42 + i60]) {
                                iArr7[i59] = i61;
                                i59++;
                            }
                        }
                        iArr2 = Arrays.copyOf(iArr7, i59);
                        i43 = i59;
                        i42 = i58;
                        iArr3 = copyOf;
                    }
                    i14 = i24 + 1;
                    f4 = i23;
                    i10 = i25;
                    f14 = i26;
                }
                int i62 = i10;
                int i63 = f14;
                if (yi90Var.d()) {
                    int f18 = yi90Var.f();
                    for (int i64 = 0; i64 < f18; i64++) {
                        yi90Var.j(i63 + 5);
                    }
                }
                yi90Var.j(2);
                float f19 = 1.0f;
                if (yi90Var.d()) {
                    f5 = 1.0f;
                    i15 = i33;
                    i16 = i40;
                    i17 = -1;
                    i18 = -1;
                    i19 = -1;
                } else {
                    if (yi90Var.d()) {
                        int e4 = yi90Var.e(8);
                        if (e4 == 255) {
                            int e5 = yi90Var.e(16);
                            int e6 = yi90Var.e(16);
                            if (e5 != 0 && e6 != 0) {
                                f19 = e5 / e6;
                            }
                        } else if (e4 < 17) {
                            f19 = b[e4];
                        } else {
                            sn.d(e4, "Unexpected aspect_ratio_idc value: ");
                        }
                    }
                    if (yi90Var.d()) {
                        yi90Var.i();
                    }
                    if (yi90Var.d()) {
                        yi90Var.j(3);
                        i22 = yi90Var.d() ? 1 : 2;
                        if (yi90Var.d()) {
                            int e7 = yi90Var.e(8);
                            int e8 = yi90Var.e(8);
                            yi90Var.j(8);
                            i20 = m6g.i(e7);
                            i21 = m6g.j(e8);
                        } else {
                            i20 = -1;
                            i21 = -1;
                        }
                    } else {
                        if (kVar != null && (jVar = kVar.d) != null) {
                            ImmutableList<i> immutableList4 = jVar.a;
                            int i65 = jVar.b[i41];
                            if (immutableList4.size() > i65) {
                                i iVar = immutableList4.get(i65);
                                int i66 = iVar.a;
                                int i67 = iVar.b;
                                i21 = iVar.c;
                                i20 = i66;
                                i22 = i67;
                            }
                        }
                        i20 = -1;
                        i21 = -1;
                        i22 = -1;
                    }
                    if (yi90Var.d()) {
                        yi90Var.f();
                        yi90Var.f();
                    }
                    yi90Var.i();
                    if (yi90Var.d()) {
                        i7 *= 2;
                    }
                    i17 = i20;
                    f5 = f19;
                    i15 = i33;
                    i16 = i40;
                    i19 = i21;
                    i18 = i22;
                }
                return new h(e2, cVar, f2, i11, f3, i9, i7, i62, i15, f5, i16, i17, i18, i19);
            }
        }
        i4 = 0;
        c cVar2 = null;
        if (z) {
        }
        yi90Var.f();
        if (z) {
        }
        int f142 = yi90Var.f();
        if (z) {
        }
        int i332 = i8;
        yi90Var.f();
        yi90Var.f();
        yi90Var.f();
        yi90Var.f();
        yi90Var.f();
        yi90Var.f();
        if (yi90Var.d()) {
        }
        int i402 = i13;
        yi90Var.j(2);
        if (yi90Var.d()) {
        }
        f4 = yi90Var.f();
        i14 = 0;
        int[] iArr22 = new int[0];
        int i412 = i4;
        int[] iArr32 = new int[0];
        int i422 = -1;
        int i432 = -1;
        while (i14 < f4) {
        }
        int i622 = i10;
        int i632 = f142;
        if (yi90Var.d()) {
        }
        yi90Var.j(2);
        float f192 = 1.0f;
        if (yi90Var.d()) {
        }
        return new h(e2, cVar2, f2, i11, f3, i9, i7, i622, i15, f5, i16, i17, i18, i19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k j(int i2, int i3, byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        j jVar;
        int i4;
        int i5;
        int i6;
        com.google.common.collect.g gVar;
        String str;
        int[] iArr3;
        com.google.common.collect.g gVar2;
        int i7;
        com.google.common.collect.g gVar3;
        boolean[][] zArr;
        int i8;
        boolean[][] zArr2;
        int[] iArr4;
        int[] iArr5;
        int i9;
        boolean z;
        int i10;
        boolean d2;
        int i11;
        int i12;
        int i13;
        boolean d3;
        int i14;
        int i15;
        boolean z2;
        boolean z3;
        yi90 yi90Var = new yi90(bArr, i2, i3);
        f(yi90Var);
        yi90Var.j(4);
        boolean d4 = yi90Var.d();
        boolean d5 = yi90Var.d();
        int e2 = yi90Var.e(6);
        int i16 = e2 + 1;
        int e3 = yi90Var.e(3);
        yi90Var.j(17);
        c g2 = g(yi90Var, true, e3, null);
        for (int i17 = yi90Var.d() ? 0 : e3; i17 <= e3; i17++) {
            yi90Var.f();
            yi90Var.f();
            yi90Var.f();
        }
        int e4 = yi90Var.e(6);
        int f2 = yi90Var.f() + 1;
        int i18 = 6;
        d dVar = new d(ImmutableList.p(g2), new int[1]);
        boolean z4 = i16 >= 2 && f2 >= 2;
        boolean z5 = d4 && d5;
        int i19 = e4 + 1;
        boolean z6 = i19 >= i16;
        if (!z4 || !z5 || !z6) {
            return new k(null, dVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr6 = (int[][]) Array.newInstance((Class<?>) cls, f2, i19);
        int i20 = 1;
        int[] iArr7 = new int[f2];
        int[] iArr8 = new int[f2];
        iArr6[0][0] = 0;
        iArr7[0] = 1;
        iArr8[0] = 0;
        for (int i21 = 1; i21 < f2; i21++) {
            int i22 = 0;
            for (int i23 = 0; i23 <= e4; i23++) {
                if (yi90Var.d()) {
                    iArr6[i21][i22] = i23;
                    iArr8[i21] = i23;
                    i22++;
                }
                iArr7[i21] = i22;
            }
        }
        if (yi90Var.d()) {
            yi90Var.j(64);
            if (yi90Var.d()) {
                yi90Var.f();
            }
            int f3 = yi90Var.f();
            int i24 = 0;
            while (i24 < f3) {
                yi90Var.f();
                if (i24 == 0 || yi90Var.d()) {
                    boolean d6 = yi90Var.d();
                    boolean d7 = yi90Var.d();
                    z3 = d6;
                    z2 = d7;
                    if (d6 || d7) {
                        d2 = yi90Var.d();
                        if (d2) {
                            yi90Var.j(19);
                        }
                        yi90Var.j(8);
                        if (d2) {
                            yi90Var.j(4);
                        }
                        yi90Var.j(15);
                        i12 = d6;
                        i11 = d7;
                        i13 = 0;
                        while (i13 <= e3) {
                            boolean d8 = yi90Var.d();
                            if (!d8) {
                                d8 = yi90Var.d();
                            }
                            if (d8) {
                                yi90Var.f();
                                d3 = false;
                            } else {
                                d3 = yi90Var.d();
                            }
                            if (d3) {
                                i14 = i24;
                                i15 = 0;
                            } else {
                                i14 = i24;
                                i15 = yi90Var.f();
                            }
                            int[][] iArr9 = iArr6;
                            int i25 = i12 + i11;
                            int[] iArr10 = iArr8;
                            int i26 = 0;
                            while (i26 < i25) {
                                int i27 = i25;
                                for (int i28 = 0; i28 <= i15; i28++) {
                                    yi90Var.f();
                                    yi90Var.f();
                                    if (d2) {
                                        yi90Var.f();
                                        yi90Var.f();
                                    }
                                    yi90Var.i();
                                }
                                i26++;
                                i25 = i27;
                            }
                            i13++;
                            i24 = i14;
                            iArr6 = iArr9;
                            iArr8 = iArr10;
                        }
                        i24++;
                    }
                } else {
                    z3 = false;
                    z2 = false;
                }
                d2 = false;
                i12 = z3;
                i11 = z2;
                i13 = 0;
                while (i13 <= e3) {
                }
                i24++;
            }
        }
        int[][] iArr11 = iArr6;
        int[] iArr12 = iArr8;
        if (!yi90Var.d()) {
            return new k(null, dVar, null, null);
        }
        int i29 = yi90Var.d;
        if (i29 > 0) {
            yi90Var.j(8 - i29);
        }
        c g3 = g(yi90Var, false, e3, g2);
        boolean d9 = yi90Var.d();
        boolean[] zArr3 = new boolean[16];
        int i30 = 0;
        for (int i31 = 0; i31 < 16; i31++) {
            boolean d10 = yi90Var.d();
            zArr3[i31] = d10;
            if (d10) {
                i30++;
            }
        }
        if (i30 == 0 || !zArr3[1]) {
            return new k(null, dVar, null, null);
        }
        int[] iArr13 = new int[i30];
        for (int i32 = 0; i32 < i30 - (d9 ? 1 : 0); i32++) {
            iArr13[i32] = yi90Var.e(3);
        }
        int[] iArr14 = new int[i30 + 1];
        if (d9) {
            int i33 = 1;
            while (i33 < i30) {
                int[] iArr15 = iArr14;
                for (int i34 = 0; i34 < i33; i34++) {
                    iArr15[i33] = iArr13[i34] + 1 + iArr15[i33];
                }
                i33++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i30] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i16, i30);
        int[] iArr17 = new int[i16];
        iArr17[0] = 0;
        boolean d11 = yi90Var.d();
        int i35 = 1;
        while (i35 < i16) {
            if (d11) {
                i10 = i35;
                iArr17[i10] = yi90Var.e(i18);
            } else {
                i10 = i35;
                iArr17[i10] = i10;
            }
            if (d9) {
                for (int i36 = 0; i36 < i30; i36++) {
                    iArr16[i10][i36] = (iArr17[i10] & ((1 << iArr[r30]) - 1)) >> iArr[i36];
                }
            } else {
                int i37 = 0;
                while (i37 < i30) {
                    int i38 = i37;
                    iArr16[i10][i38] = yi90Var.e(iArr13[i37] + 1);
                    i37 = i38 + 1;
                }
            }
            i35 = i10 + 1;
            i18 = 6;
        }
        int[] iArr18 = new int[i19];
        int i39 = 1;
        int i40 = 0;
        while (i40 < i16) {
            iArr18[iArr17[i40]] = -1;
            int[] iArr19 = iArr18;
            int i41 = 0;
            int i42 = 0;
            while (i41 < 16) {
                if (zArr3[i41]) {
                    if (i41 == i20) {
                        iArr19[iArr17[i40]] = iArr16[i40][i42];
                    }
                    i42++;
                }
                i41++;
                i20 = 1;
            }
            if (i40 > 0) {
                int i43 = 0;
                while (true) {
                    if (i43 >= i40) {
                        z = true;
                        break;
                    }
                    int i44 = i43;
                    if (iArr19[iArr17[i40]] == iArr19[iArr17[i43]]) {
                        z = false;
                        break;
                    }
                    i43 = i44 + 1;
                }
                if (z) {
                    i39++;
                }
            }
            i40++;
            iArr18 = iArr19;
            i20 = 1;
        }
        int[] iArr20 = iArr18;
        int e5 = yi90Var.e(4);
        if (i39 < 2 || e5 == 0) {
            return new k(null, dVar, null, null);
        }
        int[] iArr21 = new int[i39];
        for (int i45 = 0; i45 < i39; i45++) {
            iArr21[i45] = yi90Var.e(e5);
        }
        int[] iArr22 = new int[i19];
        for (int i46 = 0; i46 < i16; i46++) {
            iArr22[Math.min(iArr17[i46], e4)] = i46;
        }
        ImmutableList.a aVar = new ImmutableList.a();
        int i47 = 0;
        while (i47 <= e4) {
            int[] iArr23 = iArr22;
            int i48 = i39;
            int min = Math.min(iArr20[i47], i48 - 1);
            aVar.c(new a(iArr23[i47], min >= 0 ? iArr21[min] : -1));
            i47++;
            iArr22 = iArr23;
            iArr17 = iArr17;
            i39 = i48;
        }
        int[] iArr24 = iArr17;
        com.google.common.collect.g g4 = aVar.g();
        if (((a) g4.get(0)).b == -1) {
            return new k(null, dVar, null, null);
        }
        int i49 = 1;
        while (true) {
            if (i49 > e4) {
                i49 = -1;
                break;
            }
            if (((a) g4.get(i49)).b != -1) {
                break;
            }
            i49++;
        }
        if (i49 == -1) {
            return new k(null, dVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i16, i16);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i16, i16);
        for (int i50 = 1; i50 < i16; i50++) {
            for (int i51 = 0; i51 < i50; i51++) {
                boolean[] zArr6 = zArr4[i50];
                boolean[] zArr7 = zArr5[i50];
                boolean d12 = yi90Var.d();
                zArr7[i51] = d12;
                zArr6[i51] = d12;
            }
        }
        for (int i52 = 1; i52 < i16; i52++) {
            int i53 = 0;
            while (i53 < e2) {
                boolean[][] zArr8 = zArr4;
                int i54 = 0;
                while (true) {
                    if (i54 < i52) {
                        boolean[] zArr9 = zArr5[i52];
                        if (zArr9[i54] && zArr5[i54][i53]) {
                            zArr9[i53] = true;
                            break;
                        }
                        i54++;
                    }
                }
                i53++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr25 = new int[i19];
        for (int i55 = 0; i55 < i16; i55++) {
            int i56 = 0;
            for (int i57 = 0; i57 < i55; i57++) {
                i56 += zArr10[i55][i57] ? 1 : 0;
            }
            iArr25[iArr24[i55]] = i56;
        }
        int i58 = 0;
        for (int i59 = 0; i59 < i16; i59++) {
            if (iArr25[iArr24[i59]] == 0) {
                i58++;
            }
        }
        if (i58 > 1) {
            return new k(null, dVar, null, null);
        }
        int[] iArr26 = new int[i16];
        int[] iArr27 = new int[f2];
        if (yi90Var.d()) {
            iArr2 = iArr25;
            int i60 = 0;
            while (i60 < i16) {
                int i61 = i60;
                iArr26[i61] = yi90Var.e(3);
                i60 = i61 + 1;
            }
        } else {
            iArr2 = iArr25;
            Arrays.fill(iArr26, 0, i16, e3);
        }
        int i62 = 0;
        while (i62 < f2) {
            int i63 = i62;
            boolean[][] zArr11 = zArr5;
            int[] iArr28 = iArr26;
            int i64 = 0;
            for (int i65 = 0; i65 < iArr7[i63]; i65++) {
                i64 = Math.max(i64, iArr28[((a) g4.get(iArr11[i63][i65])).a]);
            }
            iArr27[i63] = i64 + 1;
            i62 = i63 + 1;
            zArr5 = zArr11;
            iArr26 = iArr28;
        }
        boolean[][] zArr12 = zArr5;
        if (yi90Var.d()) {
            int i66 = 0;
            while (i66 < e2) {
                int i67 = i66 + 1;
                int i68 = i67;
                while (i68 < i16) {
                    if (zArr10[i68][i66]) {
                        i9 = e2;
                        yi90Var.j(3);
                    } else {
                        i9 = e2;
                    }
                    i68++;
                    e2 = i9;
                }
                i66 = i67;
            }
        }
        yi90Var.i();
        int f4 = yi90Var.f() + 1;
        ImmutableList.a aVar2 = new ImmutableList.a();
        aVar2.c(g2);
        if (f4 > 1) {
            aVar2.c(g3);
            for (int i69 = 2; i69 < f4; i69++) {
                g3 = g(yi90Var, yi90Var.d(), e3, g3);
                aVar2.c(g3);
            }
        }
        com.google.common.collect.g g5 = aVar2.g();
        int f5 = yi90Var.f() + f2;
        if (f5 > f2) {
            return new k(null, dVar, null, null);
        }
        int e6 = yi90Var.e(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, f5, i19);
        int[] iArr29 = new int[f5];
        int i70 = 0;
        int[] iArr30 = new int[f5];
        int i71 = 0;
        while (i71 < f2) {
            iArr29[i71] = i70;
            iArr30[i71] = iArr12[i71];
            if (e6 == 0) {
                i8 = i71;
                zArr2 = zArr13;
                iArr4 = iArr29;
                iArr5 = iArr27;
                Arrays.fill(zArr13[i8], i70, iArr7[i8], true);
                iArr4[i8] = iArr7[i8];
            } else {
                i8 = i71;
                zArr2 = zArr13;
                iArr4 = iArr29;
                iArr5 = iArr27;
                if (e6 == 1) {
                    int i72 = iArr12[i8];
                    for (int i73 = 0; i73 < iArr7[i8]; i73++) {
                        zArr2[i8][i73] = iArr11[i8][i73] == i72;
                    }
                    iArr4[i8] = 1;
                } else {
                    i70 = 0;
                    zArr2[0][0] = true;
                    iArr4[0] = 1;
                    i71 = i8 + 1;
                    zArr13 = zArr2;
                    iArr29 = iArr4;
                    iArr27 = iArr5;
                }
            }
            i70 = 0;
            i71 = i8 + 1;
            zArr13 = zArr2;
            iArr29 = iArr4;
            iArr27 = iArr5;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = iArr27;
        int[] iArr33 = new int[i19];
        int i74 = 2;
        int[] iArr34 = new int[2];
        iArr34[1] = i19;
        iArr34[i70] = f5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr34);
        int i75 = 1;
        int i76 = 0;
        while (i75 < f5) {
            if (e6 == i74) {
                for (int i77 = 0; i77 < iArr7[i75]; i77++) {
                    zArr14[i75][i77] = yi90Var.d();
                    int i78 = iArr31[i75];
                    boolean z7 = zArr14[i75][i77];
                    iArr31[i75] = i78 + (z7 ? 1 : 0);
                    if (z7) {
                        iArr30[i75] = iArr11[i75][i77];
                    }
                }
            }
            if (i76 == 0) {
                i7 = 0;
                if (iArr11[i75][0] == 0 && zArr14[i75][0]) {
                    for (int i79 = 1; i79 < iArr7[i75]; i79++) {
                        if (iArr11[i75][i79] == i49 && zArr14[i75][i49]) {
                            i76 = i75;
                        }
                    }
                }
            } else {
                i7 = 0;
            }
            int i80 = i7;
            while (i80 < iArr7[i75]) {
                if (f4 > 1) {
                    zArr15[i75][i80] = zArr14[i75][i80];
                    gVar3 = g5;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int c2 = t6o.c(f4);
                    if (!zArr[i75][i80]) {
                        int i81 = ((a) g4.get(iArr11[i75][i80])).a;
                        int i82 = i7;
                        while (true) {
                            if (i82 >= i80) {
                                break;
                            }
                            int i83 = i82;
                            if (zArr12[i81][((a) g4.get(iArr11[i75][i83])).a]) {
                                zArr[i75][i80] = true;
                                break;
                            }
                            i82 = i83 + 1;
                        }
                    }
                    if (zArr[i75][i80]) {
                        if (i76 <= 0 || i75 != i76) {
                            yi90Var.j(c2);
                        } else {
                            iArr33[i80] = yi90Var.e(c2);
                        }
                    }
                } else {
                    gVar3 = g5;
                    zArr = zArr15;
                }
                i80++;
                g5 = gVar3;
                zArr15 = zArr;
            }
            com.google.common.collect.g gVar4 = g5;
            boolean[][] zArr16 = zArr15;
            if (iArr31[i75] == 1 && iArr2[iArr30[i75]] > 0) {
                yi90Var.i();
            }
            i75++;
            g5 = gVar4;
            zArr15 = zArr16;
            i74 = 2;
        }
        com.google.common.collect.g gVar5 = g5;
        boolean[][] zArr17 = zArr15;
        if (i76 == 0) {
            return new k(null, dVar, null, null);
        }
        int f6 = yi90Var.f();
        int i84 = f6 + 1;
        String str2 = "expectedSize";
        k15.h(i84, "expectedSize");
        ImmutableList.a aVar3 = new ImmutableList.a(i84);
        int[] iArr35 = new int[i16];
        int i85 = 0;
        while (i85 < i84) {
            int e7 = yi90Var.e(16);
            int e8 = yi90Var.e(16);
            int i86 = i85;
            if (yi90Var.d()) {
                i4 = yi90Var.e(2);
                if (i4 == 3) {
                    yi90Var.i();
                }
                i5 = yi90Var.e(4);
                i6 = yi90Var.e(4);
            } else {
                i4 = 0;
                i5 = 0;
                i6 = 0;
            }
            if (yi90Var.d()) {
                int f7 = yi90Var.f();
                gVar2 = gVar5;
                int f8 = yi90Var.f();
                gVar = g4;
                int f9 = yi90Var.f();
                iArr3 = iArr33;
                int f10 = yi90Var.f();
                str = str2;
                e7 = uf3.a(f7, f8, (i4 == 1 || i4 == 2) ? 2 : 1, e7);
                e8 = uf3.a(f9, f10, i4 == 1 ? 2 : 1, e8);
            } else {
                gVar = g4;
                str = str2;
                iArr3 = iArr33;
                gVar2 = gVar5;
            }
            aVar3.c(new e(i4, i5, i6, e7, e8));
            i85 = i86 + 1;
            gVar5 = gVar2;
            g4 = gVar;
            iArr33 = iArr3;
            str2 = str;
        }
        com.google.common.collect.g gVar6 = g4;
        String str3 = str2;
        int[] iArr36 = iArr33;
        com.google.common.collect.g gVar7 = gVar5;
        if (i84 <= 1 || !yi90Var.d()) {
            for (int i87 = 1; i87 < i16; i87++) {
                iArr35[i87] = Math.min(i87, f6);
            }
        } else {
            double d13 = i84;
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int c3 = t6o.c(d13);
            for (int i88 = 1; i88 < i16; i88++) {
                iArr35[i88] = yi90Var.e(c3);
            }
        }
        f fVar = new f(aVar3.g(), iArr35);
        yi90Var.j(2);
        for (int i89 = 1; i89 < i16; i89++) {
            if (iArr2[iArr24[i89]] == 0) {
                yi90Var.i();
            }
        }
        for (int i90 = 1; i90 < f5; i90++) {
            boolean d14 = yi90Var.d();
            int i91 = 0;
            while (i91 < iArr32[i90]) {
                if ((i91 <= 0 || !d14) ? i91 == 0 : yi90Var.d()) {
                    for (int i92 = 0; i92 < iArr7[i90]; i92++) {
                        if (zArr17[i90][i92]) {
                            yi90Var.f();
                        }
                    }
                    yi90Var.f();
                    yi90Var.f();
                }
                i91++;
            }
        }
        int f11 = yi90Var.f() + 2;
        if (yi90Var.d()) {
            yi90Var.j(f11);
        } else {
            for (int i93 = 1; i93 < i16; i93++) {
                for (int i94 = 0; i94 < i93; i94++) {
                    if (zArr10[i93][i94]) {
                        yi90Var.j(f11);
                    }
                }
            }
        }
        int f12 = yi90Var.f();
        for (int i95 = 1; i95 <= f12; i95++) {
            yi90Var.j(8);
        }
        if (yi90Var.d()) {
            int i96 = yi90Var.d;
            if (i96 > 0) {
                yi90Var.j(8 - i96);
            }
            if (!yi90Var.d() ? yi90Var.d() : true) {
                yi90Var.i();
            }
            boolean d15 = yi90Var.d();
            boolean d16 = yi90Var.d();
            if (d15 || d16) {
                for (int i97 = 0; i97 < f2; i97++) {
                    for (int i98 = 0; i98 < iArr32[i97]; i98++) {
                        boolean d17 = d15 ? yi90Var.d() : false;
                        boolean d18 = d16 ? yi90Var.d() : false;
                        if (d17) {
                            yi90Var.j(32);
                        }
                        if (d18) {
                            yi90Var.j(18);
                        }
                    }
                }
            }
            boolean d19 = yi90Var.d();
            int e9 = d19 ? yi90Var.e(4) + 1 : i16;
            k15.h(e9, str3);
            ImmutableList.a aVar4 = new ImmutableList.a(e9);
            int[] iArr37 = new int[i16];
            for (int i99 = 0; i99 < e9; i99++) {
                yi90Var.j(3);
                int i100 = yi90Var.d() ? 1 : 2;
                int i101 = m6g.i(yi90Var.e(8));
                int j2 = m6g.j(yi90Var.e(8));
                yi90Var.j(8);
                aVar4.c(new i(i101, i100, j2));
            }
            if (d19 && e9 > 1) {
                for (int i102 = 0; i102 < i16; i102++) {
                    iArr37[i102] = yi90Var.e(4);
                }
            }
            jVar = new j(aVar4.g(), iArr37);
        } else {
            jVar = null;
        }
        return new k(gVar6, new d(gVar7, iArr36), fVar, jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m k(int i2, int i3, byte[] bArr) {
        int f2;
        int f3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        boolean d2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        yi90 yi90Var = new yi90(bArr, i2 + 1, i3);
        int e2 = yi90Var.e(8);
        int e3 = yi90Var.e(8);
        int e4 = yi90Var.e(8);
        int f4 = yi90Var.f();
        if (e2 == 100 || e2 == 110 || e2 == 122 || e2 == 244 || e2 == 44 || e2 == 83 || e2 == 86 || e2 == 118 || e2 == 128 || e2 == 138) {
            f2 = yi90Var.f();
            boolean d3 = f2 == 3 ? yi90Var.d() : false;
            int f5 = yi90Var.f();
            f3 = yi90Var.f();
            yi90Var.i();
            if (yi90Var.d()) {
                int i20 = f2 != 3 ? 8 : 12;
                i4 = 16;
                int i21 = 0;
                while (i21 < i20) {
                    if (yi90Var.d()) {
                        int i22 = i21 < 6 ? 16 : 64;
                        int i23 = 8;
                        int i24 = 8;
                        for (int i25 = 0; i25 < i22; i25++) {
                            if (i23 != 0) {
                                i23 = ((yi90Var.g() + i24) + 256) % 256;
                            }
                            if (i23 != 0) {
                                i24 = i23;
                            }
                        }
                    }
                    i21++;
                }
            } else {
                i4 = 16;
            }
            z = d3;
            i5 = f5;
        } else {
            f2 = 1;
            i4 = 16;
            i5 = 0;
            z = false;
            f3 = 0;
        }
        int f6 = yi90Var.f() + 4;
        int f7 = yi90Var.f();
        if (f7 == 0) {
            i9 = yi90Var.f() + 4;
            i6 = e2;
            i7 = f7;
            i8 = f3;
        } else {
            if (f7 == 1) {
                boolean d4 = yi90Var.d();
                yi90Var.g();
                yi90Var.g();
                i6 = e2;
                long f8 = yi90Var.f();
                i7 = f7;
                for (int i26 = 0; i26 < f8; i26++) {
                    yi90Var.f();
                }
                i8 = f3;
                z2 = d4;
                i9 = 0;
                yi90Var.f();
                yi90Var.i();
                int f9 = yi90Var.f() + 1;
                int f10 = yi90Var.f() + 1;
                d2 = yi90Var.d();
                int i27 = 2 - (d2 ? 1 : 0);
                int i28 = f10 * i27;
                if (!d2) {
                    yi90Var.i();
                }
                yi90Var.i();
                int i29 = f9 * 16;
                int i30 = i28 * 16;
                if (yi90Var.d()) {
                    i10 = f6;
                    i11 = i8;
                    i12 = e3;
                    i13 = 1;
                } else {
                    int f11 = yi90Var.f();
                    int f12 = yi90Var.f();
                    i10 = f6;
                    int f13 = yi90Var.f();
                    i11 = i8;
                    int f14 = yi90Var.f();
                    if (f2 == 0) {
                        i12 = e3;
                        i13 = 1;
                        i19 = 1;
                    } else {
                        i12 = e3;
                        int i31 = f2 == 3 ? 1 : 2;
                        i13 = 1;
                        i27 *= f2 == 1 ? 2 : 1;
                        i19 = i31;
                    }
                    i29 = uf3.a(f11, f12, i19, i29);
                    i30 = uf3.a(f13, f14, i27, i30);
                }
                int i32 = i30;
                int i33 = i29;
                int i34 = i6;
                int i35 = ((i34 != 44 || i34 == 86 || i34 == 100 || i34 == 110 || i34 == 122 || i34 == 244) && (i12 & 16) != 0) ? 0 : i4;
                int i36 = -1;
                float f15 = 1.0f;
                if (yi90Var.d()) {
                    i14 = i35;
                    i15 = -1;
                    i16 = -1;
                    i17 = -1;
                } else {
                    if (yi90Var.d()) {
                        int e5 = yi90Var.e(8);
                        if (e5 == 255) {
                            int i37 = i4;
                            int e6 = yi90Var.e(i37);
                            int e7 = yi90Var.e(i37);
                            if (e6 != 0 && e7 != 0) {
                                f15 = e6 / e7;
                            }
                        } else if (e5 < 17) {
                            f15 = b[e5];
                        } else {
                            sn.d(e5, "Unexpected aspect_ratio_idc value: ");
                        }
                    }
                    if (yi90Var.d()) {
                        yi90Var.i();
                    }
                    if (yi90Var.d()) {
                        yi90Var.j(3);
                        if (!yi90Var.d()) {
                            i13 = 2;
                        }
                        if (yi90Var.d()) {
                            int e8 = yi90Var.e(8);
                            int e9 = yi90Var.e(8);
                            yi90Var.j(8);
                            i36 = m6g.i(e8);
                            i18 = m6g.j(e9);
                        } else {
                            i18 = -1;
                        }
                    } else {
                        i18 = -1;
                        i13 = -1;
                    }
                    if (yi90Var.d()) {
                        yi90Var.f();
                        yi90Var.f();
                    }
                    if (yi90Var.d()) {
                        yi90Var.j(65);
                    }
                    boolean d5 = yi90Var.d();
                    if (d5) {
                        l(yi90Var);
                    }
                    boolean d6 = yi90Var.d();
                    if (d6) {
                        l(yi90Var);
                    }
                    if (d5 || d6) {
                        yi90Var.i();
                    }
                    yi90Var.i();
                    if (yi90Var.d()) {
                        yi90Var.i();
                        yi90Var.f();
                        yi90Var.f();
                        yi90Var.f();
                        yi90Var.f();
                        i35 = yi90Var.f();
                        yi90Var.f();
                    }
                    i14 = i35;
                    i17 = i18;
                    i15 = i36;
                    i16 = i13;
                }
                return new m(i34, i12, e4, f4, i33, i32, f15, i5, i11, z, d2, i10, i7, i9, z2, i15, i16, i17, i14);
            }
            i6 = e2;
            i7 = f7;
            i8 = f3;
            i9 = 0;
        }
        z2 = false;
        yi90Var.f();
        yi90Var.i();
        int f92 = yi90Var.f() + 1;
        int f102 = yi90Var.f() + 1;
        d2 = yi90Var.d();
        int i272 = 2 - (d2 ? 1 : 0);
        int i282 = f102 * i272;
        if (!d2) {
        }
        yi90Var.i();
        int i292 = f92 * 16;
        int i302 = i282 * 16;
        if (yi90Var.d()) {
        }
        int i322 = i302;
        int i332 = i292;
        int i342 = i6;
        if (i342 != 44) {
        }
        int i362 = -1;
        float f152 = 1.0f;
        if (yi90Var.d()) {
        }
        return new m(i342, i12, e4, f4, i332, i322, f152, i5, i11, z, d2, i10, i7, i9, z2, i15, i16, i17, i14);
    }

    public static void l(yi90 yi90Var) {
        int f2 = yi90Var.f() + 1;
        yi90Var.j(8);
        for (int i2 = 0; i2 < f2; i2++) {
            yi90Var.f();
            yi90Var.f();
            yi90Var.i();
        }
        yi90Var.j(20);
    }

    public static int m(byte[] bArr, int i2) {
        int i3;
        synchronized (c) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = d;
                    if (iArr.length <= i5) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = d[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }
}
