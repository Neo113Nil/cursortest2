package xsna;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ByteQuadsCanonicalizer.java */
/* loaded from: classes12.dex */
public final class hu8 {
    public final hu8 a;
    public final AtomicReference<a> b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public int[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public String[] l;
    public int m;
    public int n;
    public boolean o;

    public hu8(int i) {
        this.a = null;
        this.k = 0;
        this.o = true;
        this.c = i;
        this.d = false;
        this.e = true;
        this.b = new AtomicReference<>(new a(64, 4, new int[512], new String[128], 448, 512));
    }

    public final int a(int i) {
        return (i & (this.g - 1)) << 2;
    }

    public final int b(int i) throws StreamConstraintsException {
        int a2 = a(i);
        int[] iArr = this.f;
        if (iArr[a2 + 3] == 0) {
            return a2;
        }
        if (this.k > (this.g >> 1)) {
            int d = (this.m - d()) >> 2;
            int i2 = this.k;
            if (d > ((i2 + 1) >> 7) || i2 > this.g * 0.8d) {
                return c(i);
            }
        }
        int i3 = this.h + ((a2 >> 3) << 2);
        if (iArr[i3 + 3] == 0) {
            return i3;
        }
        int i4 = this.i;
        int i5 = this.j;
        int i6 = i4 + ((a2 >> (i5 + 2)) << i5);
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            if (iArr[i6 + 3] == 0) {
                return i6;
            }
            i6 += 4;
        }
        int i8 = this.m;
        int i9 = i8 + 4;
        this.m = i9;
        int i10 = this.g;
        if (i9 < (i10 << 3)) {
            return i8;
        }
        if (!this.e || i10 <= 1024) {
            return c(i);
        }
        StringBuilder sb = new StringBuilder("Spill-over slots in symbol table with ");
        sb.append(this.k);
        sb.append(" entries, hash area of ");
        sb.append(this.g);
        sb.append(" slots is now full (all ");
        throw new StreamConstraintsException(h5s.c(this.g >> 3, " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`", sb));
    }

    public final int c(int i) throws StreamConstraintsException {
        this.o = false;
        int[] iArr = this.f;
        String[] strArr = this.l;
        int i2 = this.g;
        int i3 = this.k;
        int i4 = i2 + i2;
        int i5 = this.m;
        if (i4 > 65536) {
            n(true);
        } else {
            this.f = new int[iArr.length + (i2 << 3)];
            this.g = i4;
            int i6 = i4 << 2;
            this.h = i6;
            this.i = i6 + (i6 >> 1);
            int i7 = i4 >> 2;
            this.j = i7 < 64 ? 4 : i7 <= 256 ? 5 : i7 <= 1024 ? 6 : 7;
            this.l = new String[strArr.length << 1];
            n(false);
            int[] iArr2 = new int[16];
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9 += 4) {
                int i10 = iArr[i9 + 3];
                if (i10 != 0) {
                    i8++;
                    String str = strArr[i9 >> 2];
                    if (i10 == 1) {
                        iArr2[0] = iArr[i9];
                        f(str, iArr2, 1);
                    } else if (i10 == 2) {
                        iArr2[0] = iArr[i9];
                        iArr2[1] = iArr[i9 + 1];
                        f(str, iArr2, 2);
                    } else if (i10 != 3) {
                        if (i10 > iArr2.length) {
                            iArr2 = new int[i10];
                        }
                        System.arraycopy(iArr, iArr[i9 + 1], iArr2, 0, i10);
                        f(str, iArr2, i10);
                    } else {
                        iArr2[0] = iArr[i9];
                        iArr2[1] = iArr[i9 + 1];
                        iArr2[2] = iArr[i9 + 2];
                        f(str, iArr2, 3);
                    }
                }
            }
            if (i8 != i3) {
                throw new IllegalStateException(efz.a(i3, i8, "Internal error: Failed rehash(), old count=", ", copyCount="));
            }
        }
        int a2 = a(i);
        int[] iArr3 = this.f;
        if (iArr3[a2 + 3] == 0) {
            return a2;
        }
        int i11 = this.h + ((a2 >> 3) << 2);
        if (iArr3[i11 + 3] == 0) {
            return i11;
        }
        int i12 = this.i;
        int i13 = this.j;
        int i14 = i12 + ((a2 >> (i13 + 2)) << i13);
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            if (iArr3[i14 + 3] == 0) {
                return i14;
            }
            i14 += 4;
        }
        int i16 = this.m;
        this.m = i16 + 4;
        return i16;
    }

    public final int d() {
        int i = this.g;
        return (i << 3) - i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr2 = this.f;
        switch (i) {
            case 4:
                i3 = 0;
                int i7 = i3 + 1;
                int i8 = i2 + 1;
                if (iArr[i3] == iArr2[i2]) {
                    return false;
                }
                int i9 = i3 + 2;
                int i10 = i2 + 2;
                if (iArr[i7] != iArr2[i8]) {
                    return false;
                }
                return iArr[i9] == iArr2[i10] && iArr[i3 + 3] == iArr2[i2 + 3];
            case 5:
                i4 = 0;
                i3 = i4 + 1;
                int i11 = i2 + 1;
                if (iArr[i4] == iArr2[i2]) {
                    return false;
                }
                i2 = i11;
                int i72 = i3 + 1;
                int i82 = i2 + 1;
                if (iArr[i3] == iArr2[i2]) {
                }
                break;
            case 6:
                i5 = 0;
                i4 = i5 + 1;
                int i12 = i2 + 1;
                if (iArr[i5] == iArr2[i2]) {
                    return false;
                }
                i2 = i12;
                i3 = i4 + 1;
                int i112 = i2 + 1;
                if (iArr[i4] == iArr2[i2]) {
                }
                break;
            case 7:
                i6 = 0;
                i5 = i6 + 1;
                int i13 = i2 + 1;
                if (iArr[i6] == iArr2[i2]) {
                    return false;
                }
                i2 = i13;
                i4 = i5 + 1;
                int i122 = i2 + 1;
                if (iArr[i5] == iArr2[i2]) {
                }
                break;
            case 8:
                int i14 = i2 + 1;
                if (iArr[0] != iArr2[i2]) {
                    return false;
                }
                i6 = 1;
                i2 = i14;
                i5 = i6 + 1;
                int i132 = i2 + 1;
                if (iArr[i6] == iArr2[i2]) {
                }
                break;
            default:
                int i15 = 0;
                while (true) {
                    int i16 = i15 + 1;
                    int i17 = i2 + 1;
                    if (iArr[i15] != this.f[i2]) {
                        return false;
                    }
                    if (i16 >= i) {
                        return true;
                    }
                    i15 = i16;
                    i2 = i17;
                }
        }
    }

    public final String f(String str, int[] iArr, int i) throws StreamConstraintsException {
        int b;
        if (this.o) {
            if (this.a == null) {
                if (this.k == 0) {
                    throw new IllegalStateException("Internal error: Cannot add names to Root symbol table");
                }
                throw new IllegalStateException("Internal error: Cannot add names to Placeholder symbol table");
            }
            int[] iArr2 = this.f;
            this.f = Arrays.copyOf(iArr2, iArr2.length);
            String[] strArr = this.l;
            this.l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.o = false;
        }
        if (this.d) {
            str = InternCache.b.a(str);
        }
        if (i == 1) {
            int i2 = iArr[0] ^ this.c;
            int i3 = i2 + (i2 >>> 16);
            int i4 = i3 ^ (i3 << 3);
            b = b(i4 + (i4 >>> 12));
            int[] iArr3 = this.f;
            iArr3[b] = iArr[0];
            iArr3[b + 3] = 1;
        } else if (i == 2) {
            b = b(g(iArr[0], iArr[1]));
            int[] iArr4 = this.f;
            iArr4[b] = iArr[0];
            iArr4[b + 1] = iArr[1];
            iArr4[b + 3] = 2;
        } else if (i != 3) {
            int i5 = i(i, iArr);
            b = b(i5);
            int[] iArr5 = this.f;
            iArr5[b] = i5;
            int i6 = this.n;
            int i7 = i6 + i;
            if (i7 > iArr5.length) {
                this.f = Arrays.copyOf(this.f, Math.max(i7 - iArr5.length, Math.min(4096, this.g)) + this.f.length);
            }
            System.arraycopy(iArr, 0, this.f, i6, i);
            this.n += i;
            int[] iArr6 = this.f;
            iArr6[b + 1] = i6;
            iArr6[b + 3] = i;
        } else {
            b = b(h(iArr[0], iArr[1], iArr[2]));
            int[] iArr7 = this.f;
            iArr7[b] = iArr[0];
            iArr7[b + 1] = iArr[1];
            iArr7[b + 2] = iArr[2];
            iArr7[b + 3] = 3;
        }
        this.l[b >> 2] = str;
        this.k++;
        return str;
    }

    public final int g(int i, int i2) {
        int i3 = i + (i >>> 15);
        int i4 = this.c ^ ((i2 * 33) + (i3 ^ (i3 >>> 9)));
        int i5 = i4 + (i4 >>> 16);
        int i6 = i5 ^ (i5 >>> 4);
        return i6 + (i6 << 3);
    }

    public final int h(int i, int i2, int i3) {
        int i4 = i ^ this.c;
        int i5 = (((i4 + (i4 >>> 9)) * 31) + i2) * 33;
        int i6 = (i5 + (i5 >>> 15)) ^ i3;
        int i7 = i6 + (i6 >>> 4);
        int i8 = i7 + (i7 >>> 15);
        return i8 ^ (i8 << 9);
    }

    public final int i(int i, int[] iArr) {
        if (i < 4) {
            throw new IllegalArgumentException("qlen is too short, needs to be at least 4");
        }
        int i2 = iArr[0] ^ this.c;
        int i3 = i2 + (i2 >>> 9) + iArr[1];
        int i4 = ((i3 + (i3 >>> 15)) * 33) ^ iArr[2];
        int i5 = i4 + (i4 >>> 4);
        for (int i6 = 3; i6 < i; i6++) {
            int i7 = iArr[i6];
            i5 += i7 ^ (i7 >> 21);
        }
        int i8 = i5 * 65599;
        int i9 = i8 + (i8 >>> 19);
        return (i9 << 5) ^ i9;
    }

    public final String j(int i) {
        int i2 = this.c ^ i;
        int i3 = i2 + (i2 >>> 16);
        int i4 = i3 ^ (i3 << 3);
        int a2 = a(i4 + (i4 >>> 12));
        int[] iArr = this.f;
        int i5 = iArr[a2 + 3];
        if (i5 == 1) {
            if (iArr[a2] == i) {
                return this.l[a2 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this.h + ((a2 >> 3) << 2);
        int i7 = iArr[i6 + 3];
        if (i7 == 1) {
            if (iArr[i6] == i) {
                return this.l[i6 >> 2];
            }
        } else if (i7 == 0) {
            return null;
        }
        int i8 = this.i;
        int i9 = this.j;
        int i10 = i8 + ((a2 >> (i9 + 2)) << i9);
        int i11 = (1 << i9) + i10;
        while (i10 < i11) {
            int i12 = iArr[i10 + 3];
            if (i == iArr[i10] && 1 == i12) {
                return this.l[i10 >> 2];
            }
            if (i12 == 0) {
                return null;
            }
            i10 += 4;
        }
        for (int d = d(); d < this.m; d += 4) {
            if (i == iArr[d] && 1 == iArr[d + 3]) {
                return this.l[d >> 2];
            }
        }
        return null;
    }

    public final String k(int i, int i2) {
        int a2 = a(g(i, i2));
        int[] iArr = this.f;
        int i3 = iArr[a2 + 3];
        if (i3 == 2) {
            if (i == iArr[a2] && i2 == iArr[a2 + 1]) {
                return this.l[a2 >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this.h + ((a2 >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 2) {
            if (i == iArr[i4] && i2 == iArr[i4 + 1]) {
                return this.l[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this.i;
        int i7 = this.j;
        int i8 = i6 + ((a2 >> (i7 + 2)) << i7);
        int i9 = (1 << i7) + i8;
        while (true) {
            if (i8 < i9) {
                int i10 = iArr[i8 + 3];
                if (i == iArr[i8] && i2 == iArr[i8 + 1] && 2 == i10) {
                    return this.l[i8 >> 2];
                }
                if (i10 == 0) {
                    break;
                }
                i8 += 4;
            } else {
                for (int d = d(); d < this.m; d += 4) {
                    if (i == iArr[d] && i2 == iArr[d + 1] && 2 == iArr[d + 3]) {
                        return this.l[d >> 2];
                    }
                }
            }
        }
        return null;
    }

    public final String l(int i, int i2, int i3) {
        int a2 = a(h(i, i2, i3));
        int[] iArr = this.f;
        int i4 = iArr[a2 + 3];
        if (i4 == 3) {
            if (i == iArr[a2] && iArr[a2 + 1] == i2 && iArr[a2 + 2] == i3) {
                return this.l[a2 >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.h + ((a2 >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 3) {
            if (i == iArr[i5] && iArr[i5 + 1] == i2 && iArr[i5 + 2] == i3) {
                return this.l[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        int i7 = this.i;
        int i8 = this.j;
        int i9 = i7 + ((a2 >> (i8 + 2)) << i8);
        int i10 = (1 << i8) + i9;
        while (true) {
            if (i9 < i10) {
                int i11 = iArr[i9 + 3];
                if (i == iArr[i9] && i2 == iArr[i9 + 1] && i3 == iArr[i9 + 2] && 3 == i11) {
                    return this.l[i9 >> 2];
                }
                if (i11 == 0) {
                    break;
                }
                i9 += 4;
            } else {
                for (int d = d(); d < this.m; d += 4) {
                    if (i == iArr[d] && i2 == iArr[d + 1] && i3 == iArr[d + 2] && 3 == iArr[d + 3]) {
                        return this.l[d >> 2];
                    }
                }
            }
        }
        return null;
    }

    public final String m(int i, int[] iArr) {
        if (i < 4) {
            return i != 1 ? i != 2 ? i != 3 ? "" : l(iArr[0], iArr[1], iArr[2]) : k(iArr[0], iArr[1]) : j(iArr[0]);
        }
        int i2 = i(i, iArr);
        int a2 = a(i2);
        int[] iArr2 = this.f;
        int i3 = iArr2[a2 + 3];
        if (i2 == iArr2[a2] && i3 == i && e(i, iArr2[a2 + 1], iArr)) {
            return this.l[a2 >> 2];
        }
        if (i3 == 0) {
            return null;
        }
        int i4 = this.h + ((a2 >> 3) << 2);
        int i5 = iArr2[i4 + 3];
        if (i2 == iArr2[i4] && i5 == i && e(i, iArr2[i4 + 1], iArr)) {
            return this.l[i4 >> 2];
        }
        int i6 = this.i;
        int i7 = this.j;
        int i8 = i6 + ((a2 >> (i7 + 2)) << i7);
        int[] iArr3 = this.f;
        int i9 = (1 << i7) + i8;
        while (i8 < i9) {
            int i10 = iArr3[i8 + 3];
            if (i2 == iArr3[i8] && i == i10 && e(i, iArr3[i8 + 1], iArr)) {
                return this.l[i8 >> 2];
            }
            if (i10 == 0) {
                return null;
            }
            i8 += 4;
        }
        for (int d = d(); d < this.m; d += 4) {
            if (i2 == iArr3[d] && i == iArr3[d + 3] && e(i, iArr3[d + 1], iArr)) {
                return this.l[d >> 2];
            }
        }
        return null;
    }

    public final void n(boolean z) {
        this.k = 0;
        this.m = d();
        this.n = this.g << 3;
        if (z) {
            Arrays.fill(this.f, 0);
            Arrays.fill(this.l, (Object) null);
        }
    }

    public final String toString() {
        int i = this.h;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 3; i4 < i; i4 += 4) {
            if (this.f[i4] != 0) {
                i3++;
            }
        }
        int i5 = this.i;
        int i6 = 0;
        for (int i7 = this.h + 3; i7 < i5; i7 += 4) {
            if (this.f[i7] != 0) {
                i6++;
            }
        }
        int i8 = this.i + 3;
        int i9 = this.g + i8;
        int i10 = 0;
        while (i8 < i9) {
            if (this.f[i8] != 0) {
                i10++;
            }
            i8 += 4;
        }
        int d = (this.m - d()) >> 2;
        int i11 = this.g << 3;
        for (int i12 = 3; i12 < i11; i12 += 4) {
            if (this.f[i12] != 0) {
                i2++;
            }
        }
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", hu8.class.getName(), Integer.valueOf(this.k), Integer.valueOf(this.g), Integer.valueOf(i3), Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(d), Integer.valueOf(i3 + i6 + i10 + d), Integer.valueOf(i2));
    }

    /* compiled from: ByteQuadsCanonicalizer.java */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int[] d;
        public final String[] e;
        public final int f;
        public final int g;

        public a(int i, int i2, int[] iArr, String[] strArr, int i3, int i4) {
            this.a = i;
            this.b = 0;
            this.c = i2;
            this.d = iArr;
            this.e = strArr;
            this.f = i3;
            this.g = i4;
        }

        public a(hu8 hu8Var) {
            this.a = hu8Var.g;
            this.b = hu8Var.k;
            this.c = hu8Var.j;
            this.d = hu8Var.f;
            this.e = hu8Var.l;
            this.f = hu8Var.m;
            this.g = hu8Var.n;
        }
    }

    public hu8(hu8 hu8Var, int i, a aVar, boolean z, boolean z2) {
        this.a = hu8Var;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.b = null;
        this.k = aVar.b;
        int i2 = aVar.a;
        this.g = i2;
        int i3 = i2 << 2;
        this.h = i3;
        this.i = i3 + (i3 >> 1);
        this.j = aVar.c;
        this.f = aVar.d;
        this.l = aVar.e;
        this.m = aVar.f;
        this.n = aVar.g;
        this.o = true;
    }
}
