package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.cuy;
import xsna.iy8;

/* compiled from: CacheWindowLogic.kt */
/* loaded from: classes11.dex */
public abstract class by8 {
    public final vt5 a;
    public final pg50<List<cuy.b>> b = g9x.a();
    public final qg50 c = p9x.a();
    public final mg50 d;
    public final pg50<iy8> e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;

    public by8(vt5 vt5Var) {
        this.a = vt5Var;
        int i = x8x.a;
        this.d = new mg50();
        this.e = g9x.a();
        this.g = -1;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
    }

    public final int a(cy8 cy8Var, int i, boolean z) {
        List<cuy.b> b;
        List<cuy.b> b2;
        pg50<iy8> pg50Var = this.e;
        if (pg50Var.a(i)) {
            return pg50Var.b(i).b;
        }
        pg50<List<cuy.b>> pg50Var2 = this.b;
        int i2 = 0;
        if (pg50Var2.a(i)) {
            if (!z || (b2 = pg50Var2.b(i)) == null) {
                return -1;
            }
            int size = b2.size();
            while (i2 < size) {
                b2.get(i2).d();
                i2++;
            }
            return -1;
        }
        pg50Var2.k(i, cy8Var.a(i, new d6(1, this, cy8Var)));
        if (!z || (b = pg50Var2.b(i)) == null) {
            return -1;
        }
        int size2 = b.size();
        while (i2 < size2) {
            b.get(i2).d();
            i2++;
        }
        return -1;
    }

    public final boolean b() {
        return (this.h == Integer.MAX_VALUE || this.i == Integer.MIN_VALUE) ? false : true;
    }

    public final void c(cy8 cy8Var, int i, int i2) {
        int i3;
        pg50<iy8> pg50Var = this.e;
        iy8 b = pg50Var.b(i);
        iy8.a aVar = iy8.c;
        if (b != null) {
            b.b = i2;
            b.a = aVar;
        } else {
            b = new iy8();
            b.a = aVar;
            b.b = i2;
        }
        pg50Var.k(i, b);
        if (i > this.i) {
            this.i = i;
            this.k -= i2;
        } else if (i < this.h) {
            this.h = i;
            this.j -= i2;
        }
        if (Math.signum(this.f) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.k > 0) {
                i3 = this.i + 1;
            }
            i3 = -1;
        } else {
            if (Math.signum(this.f) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.j > 0) {
                i3 = this.h - 1;
            }
            i3 = -1;
        }
        if (i3 > 0) {
            cy8Var.b(i3);
            if (i3 != -1) {
                cy8Var.b(i3);
                if (i3 < this.m) {
                    this.b.k(i3, cy8Var.a(i3, new p9(1, this, cy8Var)));
                }
            }
        }
        g();
    }

    public final void d(cy8 cy8Var, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        boolean z2 = Math.signum(f) == Math.signum(this.f);
        if (!z) {
            if (!z2 || this.l) {
                this.j = i3 - i5;
                this.h = i;
            } else {
                int b = an10.b(Math.abs(f)) + this.j;
                int i7 = i3 - i5;
                if (b > i7) {
                    b = i7;
                }
                this.j = b;
            }
            while (this.j > 0 && (i6 = this.h) > 0) {
                int a = a(cy8Var, this.h - 1, i6 + (-1) == i + (-1) && ((f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i5));
                if (a == -1) {
                    return;
                }
                this.h--;
                this.j -= a;
            }
            return;
        }
        if (!z2 || this.l) {
            this.k = i3 - i4;
            this.i = i2;
        } else {
            int b2 = an10.b(Math.abs(f)) + this.k;
            int i8 = i3 - i4;
            if (b2 > i8) {
                b2 = i8;
            }
            this.k = b2;
        }
        while (this.k > 0) {
            int i9 = this.i;
            cy8Var.b(i9);
            if (i9 == -1) {
                return;
            }
            int i10 = this.i;
            cy8Var.b(i10);
            if (i10 >= this.m - 1) {
                return;
            }
            int a2 = a(cy8Var, this.i + 1, this.i + 1 == i2 + 1 && ((f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i4));
            if (a2 == -1) {
                return;
            }
            this.i++;
            this.k -= a2;
        }
    }

    public final void e(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int[] iArr;
        int[] iArr2;
        int i3;
        char c3;
        int i4;
        qg50 qg50Var = this.c;
        qg50Var.c();
        pg50<List<cuy.b>> pg50Var = this.b;
        int[] iArr3 = pg50Var.b;
        long[] jArr = pg50Var.a;
        int length = jArr.length - 2;
        int i5 = 8;
        if (length >= 0) {
            int i6 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr[i6];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((j4 & 255) < 128 && i <= (i4 = iArr3[(i6 << 3) + i8]) && i4 <= i2) {
                            qg50Var.b(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i7 != 8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                } else {
                    i6++;
                }
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        mg50 mg50Var = this.d;
        int[] iArr4 = mg50Var.b;
        long[] jArr2 = mg50Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j5 = jArr2[i9];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j5 & j2) < j) {
                            c3 = c;
                            int i12 = iArr4[(i9 << 3) + i11];
                            if (i <= i12 && i12 <= i2) {
                                qg50Var.b(i12);
                            }
                        } else {
                            c3 = c;
                        }
                        j5 >>= 8;
                        i11++;
                        c = c3;
                    }
                    c2 = c;
                    if (i10 != 8) {
                        break;
                    }
                } else {
                    c2 = c;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                c = c2;
            }
        } else {
            c2 = c;
        }
        pg50<iy8> pg50Var2 = this.e;
        int[] iArr5 = pg50Var2.b;
        long[] jArr3 = pg50Var2.a;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i13 = 0;
            while (true) {
                long j6 = jArr3[i13];
                if ((((~j6) << c2) & j6 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length3)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j6 & j2) < j) {
                            i3 = i5;
                            int i16 = iArr5[(i13 << 3) + i15];
                            if (i <= i16 && i16 <= i2) {
                                qg50Var.b(i16);
                            }
                        } else {
                            i3 = i5;
                        }
                        j6 >>= i3;
                        i15++;
                        i5 = i3;
                    }
                    if (i14 != i5) {
                        break;
                    }
                }
                if (i13 == length3) {
                    break;
                }
                i13++;
                i5 = 8;
            }
        }
        int[] iArr6 = qg50Var.b;
        long[] jArr4 = qg50Var.a;
        int length4 = jArr4.length - 2;
        if (length4 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j7 = jArr4[i17];
            if ((((~j7) << c2) & j7 & j3) != j3) {
                int i18 = 8 - ((~(i17 - length4)) >>> 31);
                int i19 = 0;
                while (i19 < i18) {
                    if ((j7 & j2) < j) {
                        int i20 = iArr6[(i17 << 3) + i19];
                        List<cuy.b> i21 = pg50Var.i(i20);
                        if (i21 != null) {
                            int size = i21.size();
                            for (int i22 = 0; i22 < size; i22++) {
                                i21.get(i22).cancel();
                            }
                        }
                        int a = mg50Var.a(i20);
                        if (a >= 0) {
                            mg50Var.e--;
                            long[] jArr5 = mg50Var.a;
                            int i23 = mg50Var.d;
                            int i24 = a >> 3;
                            int i25 = (a & 7) << 3;
                            iArr2 = iArr6;
                            long j8 = (jArr5[i24] & (~(255 << i25))) | (254 << i25);
                            jArr5[i24] = j8;
                            jArr5[(((a - 7) & i23) + (i23 & 7)) >> 3] = j8;
                        } else {
                            iArr2 = iArr6;
                        }
                        pg50Var2.i(i20);
                    } else {
                        iArr2 = iArr6;
                    }
                    j7 >>= 8;
                    i19++;
                    iArr6 = iArr2;
                }
                iArr = iArr6;
                if (i18 != 8) {
                    return;
                }
            } else {
                iArr = iArr6;
            }
            if (i17 == length4) {
                return;
            }
            i17++;
            iArr6 = iArr;
        }
    }

    public final void f() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.d();
        this.e.d();
        pg50<List<cuy.b>> pg50Var = this.b;
        long[] jArr = pg50Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = pg50Var.b[i4];
                        List list = (List) pg50Var.c[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((cuy.b) list.get(i6)).cancel();
                        }
                        pg50Var.j(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void g() {
        ld2.a(this.j, "prefetchWindowStartExtraSpace");
        ld2.a(this.k, "prefetchWindowEndExtraSpace");
        ld2.a(this.h, "prefetchWindowStartIndex");
        ld2.a(this.i, "prefetchWindowEndIndex");
    }
}
