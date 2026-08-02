package xsna;

import java.util.Arrays;

/* compiled from: ScatterSet.kt */
/* loaded from: classes11.dex */
public final class qh50<E> extends j5h0<E> {
    public int e;

    public qh50() {
        this((Object) null);
    }

    public final boolean e(E e) {
        int i = this.d;
        this.b[g(e)] = e;
        return this.d != i;
    }

    public final void f() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != h5h0.a) {
            jw5.r(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.b, 0, this.c, (Object) null);
        this.e = h5h0.a(this.c) - this.d;
    }

    public final int g(E e) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2;
        int i3 = -862048943;
        int hashCode = (e != null ? e.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.c;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
            long j5 = i6;
            int i12 = i6;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                int i13 = i3;
                if (epx.f(this.b[numberOfTrailingZeros], e)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i3 = i13;
            }
            int i14 = i3;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int h = h(i5);
                long j8 = 255;
                if (this.e != 0 || ((this.a[h >> 3] >> ((h & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i15 = this.c;
                    if (i15 > 8) {
                        int i16 = 8;
                        if (Long.compareUnsigned(this.d * 32, i15 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i17 = this.c;
                            Object[] objArr2 = this.b;
                            int i18 = (i17 + 7) >> 3;
                            int i19 = 0;
                            j3 = 128;
                            while (i19 < i18) {
                                long j9 = j8;
                                long j10 = jArr4[i19] & (-9187201950435737472L);
                                jArr4[i19] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i19++;
                                i16 = i16;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i20 = i16;
                            int length = jArr4.length;
                            int i21 = length - 1;
                            int i22 = length - 2;
                            long j11 = 72057594037927935L;
                            jArr4[i22] = (jArr4[i22] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[i21] = jArr4[0];
                            int i23 = 0;
                            while (i23 != i17) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j12 = (jArr4[i24] >> i25) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj = objArr2[i23];
                                    int hashCode2 = (obj != null ? obj.hashCode() : 0) * i14;
                                    int i26 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int h2 = h(i26);
                                    int i27 = i26 & i17;
                                    if (((h2 - i27) & i17) / i20 == ((i23 - i27) & i17) / i20) {
                                        long j13 = j11;
                                        jArr4[i24] = ((r7 & 127) << i25) | ((~(j << i25)) & jArr4[i24]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i23++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i28 = h2 >> 3;
                                        long j15 = jArr4[i28];
                                        int i29 = (h2 & 7) << 3;
                                        if (((j15 >> i29) & j) == 128) {
                                            i2 = i20;
                                            i = i17;
                                            objArr = objArr2;
                                            jArr4[i28] = ((~(j << i29)) & j15) | ((r7 & 127) << i29);
                                            jArr4[i24] = (jArr4[i24] & (~(j << i25))) | (128 << i25);
                                            objArr[h2] = objArr[i23];
                                            objArr[i23] = null;
                                        } else {
                                            i = i17;
                                            objArr = objArr2;
                                            i2 = i20;
                                            jArr4[i28] = ((r7 & 127) << i29) | ((~(j << i29)) & j15);
                                            Object obj2 = objArr[h2];
                                            objArr[h2] = objArr[i23];
                                            objArr[i23] = obj2;
                                            i23--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
                                        i23++;
                                        j11 = j14;
                                        i20 = i2;
                                        i17 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i23++;
                                }
                            }
                            this.e = h5h0.a(this.c) - this.d;
                            h = h(i5);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int c = h5h0.c(this.c);
                    long[] jArr5 = this.a;
                    Object[] objArr3 = this.b;
                    int i30 = this.c;
                    i(c);
                    long[] jArr6 = this.a;
                    Object[] objArr4 = this.b;
                    int i31 = this.c;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj3 = objArr3[i32];
                            int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i14;
                            int i33 = hashCode3 ^ (hashCode3 << 16);
                            int h3 = h(i33 >>> 7);
                            long j16 = i33 & 127;
                            int i34 = h3 >> 3;
                            int i35 = (h3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i34] & (~(255 << i35))) | (j16 << i35);
                            jArr[i34] = j17;
                            jArr[(((h3 - 7) & i31) + (i31 & 7)) >> 3] = j17;
                            objArr4[h3] = obj3;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i32++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    h = h(i5);
                }
                this.d++;
                int i36 = this.e;
                long[] jArr7 = this.a;
                int i37 = h >> 3;
                long j18 = jArr7[i37];
                int i38 = (h & 7) << 3;
                this.e = i36 - (((j18 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.c;
                long j19 = (j18 & (~(j << i38))) | (j2 << i38);
                jArr7[i37] = j19;
                jArr7[(((h - 7) & i39) + (i39 & 7)) >> 3] = j19;
                return h;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i6 = i12;
            i3 = i14;
        }
    }

    public final int h(int i) {
        int i2 = this.c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void i(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, h5h0.d(i)) : 0;
        this.c = max;
        if (max == 0) {
            jArr = h5h0.a;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.e = h5h0.a(this.c) - this.d;
        this.b = max == 0 ? ey2.d : new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(E e) {
        int i;
        int i2 = 0;
        int hashCode = (e != null ? e.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.c;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.a;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i5;
                if (epx.f(this.b[i], e)) {
                    break loop0;
                } else {
                    j3 &= j3 - 1;
                }
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            n(i);
        }
    }

    public final void k(E e) {
        this.b[g(e)] = e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(j5h0<E> j5h0Var) {
        Object[] objArr = j5h0Var.b;
        long[] jArr = j5h0Var.a;
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
                        k(objArr[(i << 3) + i3]);
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(E e) {
        int i;
        int hashCode = (e != null ? e.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.c;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (epx.f(this.b[i], e)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        boolean z = i >= 0;
        if (z) {
            n(i);
        }
        return z;
    }

    public final void n(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public qh50(int i) {
        if (i >= 0) {
            i(h5h0.e(i));
        } else {
            alk.B("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ qh50(Object obj) {
        this(6);
    }
}
