package xsna;

import java.util.Arrays;

/* compiled from: LongObjectMap.kt */
/* loaded from: classes11.dex */
public final class xg50<V> extends s300<V> {
    public int f;

    public xg50(int i) {
        if (i >= 0) {
            g(h5h0.e(i));
        } else {
            alk.B("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void d() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != h5h0.a) {
            jw5.r(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.c, 0, this.d, (Object) null);
        this.f = h5h0.a(this.d) - this.e;
    }

    public final int e(long j) {
        long j2;
        long j3;
        int i;
        int i2;
        long j4;
        long[] jArr;
        long[] jArr2;
        long j5;
        Object[] objArr;
        int i3;
        long[] jArr3;
        int i4 = -862048943;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.d;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr4 = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j6 = ((jArr4[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr4[i11] >>> i12);
            long j7 = i7;
            int i14 = i10;
            int i15 = 0;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (j9 != 0) {
                int numberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j9) >> 3)) & i8;
                int i16 = i4;
                if (this.b[numberOfTrailingZeros] == j) {
                    return numberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i4 = i16;
            }
            int i17 = i4;
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int f = f(i6);
                if (this.f != 0 || ((this.a[f >> 3] >> ((f & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j3 = j7;
                    i = 0;
                    i2 = 1;
                    j4 = 128;
                } else {
                    int i18 = this.d;
                    if (i18 > 8) {
                        j4 = 128;
                        if (Long.compareUnsigned(this.e * 32, i18 * 25) <= 0) {
                            long[] jArr5 = this.a;
                            int i19 = this.d;
                            long[] jArr6 = this.b;
                            Object[] objArr2 = this.c;
                            int i20 = (i19 + 7) >> 3;
                            j2 = 255;
                            int i21 = 0;
                            while (i21 < i20) {
                                long j10 = jArr5[i21] & (-9187201950435737472L);
                                jArr5[i21] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i21++;
                                i13 = i13;
                                i15 = i15;
                                j7 = j7;
                            }
                            j3 = j7;
                            i = i15;
                            int i22 = i13;
                            char c = 7;
                            int length = jArr5.length;
                            int i23 = length - 1;
                            int i24 = length - 2;
                            long j11 = 72057594037927935L;
                            jArr5[i24] = (jArr5[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr5[i23] = jArr5[i];
                            int i25 = i;
                            while (i25 != i19) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j12 = (jArr5[i26] >> i27) & 255;
                                if (j12 != 128 && j12 == 254) {
                                    int hashCode2 = Long.hashCode(jArr6[i25]) * i17;
                                    int i28 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int f2 = f(i28);
                                    int i29 = i28 & i19;
                                    char c2 = c;
                                    if (((f2 - i29) & i19) / 8 == ((i25 - i29) & i19) / 8) {
                                        int i30 = i22;
                                        j5 = j11;
                                        jArr5[i26] = ((r9 & 127) << i27) | (jArr5[i26] & (~(255 << i27)));
                                        jArr5[jArr5.length - i30] = (jArr5[i] & j5) | Long.MIN_VALUE;
                                        i25++;
                                        i22 = i30;
                                        c = c2;
                                    } else {
                                        int i31 = i22;
                                        j5 = j11;
                                        int i32 = f2 >> 3;
                                        long j13 = jArr5[i32];
                                        int i33 = (f2 & 7) << 3;
                                        if (((j13 >> i33) & 255) == 128) {
                                            i3 = i31;
                                            jArr3 = jArr6;
                                            objArr = objArr2;
                                            jArr5[i32] = (j13 & (~(255 << i33))) | ((r9 & 127) << i33);
                                            jArr5[i26] = (jArr5[i26] & (~(255 << i27))) | (128 << i27);
                                            jArr3[f2] = jArr3[i25];
                                            jArr3[i25] = 0;
                                            objArr[f2] = objArr[i25];
                                            objArr[i25] = null;
                                        } else {
                                            objArr = objArr2;
                                            i3 = i31;
                                            jArr3 = jArr6;
                                            jArr5[i32] = ((r9 & 127) << i33) | (j13 & (~(255 << i33)));
                                            long j14 = jArr3[f2];
                                            jArr3[f2] = jArr3[i25];
                                            jArr3[i25] = j14;
                                            Object obj = objArr[f2];
                                            objArr[f2] = objArr[i25];
                                            objArr[i25] = obj;
                                            i25--;
                                        }
                                        jArr5[jArr5.length - 1] = (jArr5[i] & j5) | Long.MIN_VALUE;
                                        i25++;
                                        jArr6 = jArr3;
                                        i22 = i3;
                                        c = c2;
                                        objArr2 = objArr;
                                    }
                                    j11 = j5;
                                } else {
                                    i25++;
                                }
                            }
                            i2 = i22;
                            this.f = h5h0.a(this.d) - this.e;
                            f = f(i6);
                        }
                    } else {
                        j4 = 128;
                    }
                    j2 = 255;
                    j3 = j7;
                    i = 0;
                    i2 = 1;
                    int c3 = h5h0.c(this.d);
                    long[] jArr7 = this.a;
                    long[] jArr8 = this.b;
                    Object[] objArr3 = this.c;
                    int i34 = this.d;
                    g(c3);
                    long[] jArr9 = this.a;
                    long[] jArr10 = this.b;
                    Object[] objArr4 = this.c;
                    int i35 = this.d;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr7[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j4) {
                            long j15 = jArr8[i36];
                            int hashCode3 = Long.hashCode(j15) * i17;
                            int i37 = hashCode3 ^ (hashCode3 << 16);
                            int f3 = f(i37 >>> 7);
                            jArr = jArr9;
                            jArr2 = jArr7;
                            long j16 = i37 & 127;
                            int i38 = f3 >> 3;
                            int i39 = (f3 & 7) << 3;
                            long j17 = (jArr[i38] & (~(255 << i39))) | (j16 << i39);
                            jArr[i38] = j17;
                            jArr[(((f3 - 7) & i35) + (i35 & 7)) >> 3] = j17;
                            jArr10[f3] = j15;
                            objArr4[f3] = objArr3[i36];
                        } else {
                            jArr = jArr9;
                            jArr2 = jArr7;
                        }
                        i36++;
                        jArr7 = jArr2;
                        jArr9 = jArr;
                    }
                    f = f(i6);
                }
                this.e++;
                int i40 = this.f;
                long[] jArr11 = this.a;
                int i41 = f >> 3;
                long j18 = jArr11[i41];
                int i42 = (f & 7) << 3;
                if (((j18 >> i42) & j2) != j4) {
                    i2 = i;
                }
                this.f = i40 - i2;
                int i43 = this.d;
                long j19 = (j18 & (~(j2 << i42))) | (j3 << i42);
                jArr11[i41] = j19;
                jArr11[(((f - 7) & i43) + (i43 & 7)) >> 3] = j19;
                return f;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i17;
        }
    }

    public final int f(int i) {
        int i2 = this.d;
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

    public final void g(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, h5h0.d(i)) : 0;
        this.d = max;
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
        this.f = h5h0.a(this.d) - this.e;
        this.b = new long[max];
        this.c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V h(long j) {
        int i;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (i3 * 72340172838076673L) ^ j2;
            long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.b[i] == j) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i < 0) {
            return null;
        }
        this.e--;
        long[] jArr2 = this.a;
        int i9 = this.d;
        int i10 = i >> 3;
        int i11 = (i & 7) << 3;
        long j5 = (jArr2[i10] & (~(255 << i11))) | (254 << i11);
        jArr2[i10] = j5;
        jArr2[(((i - 7) & i9) + (i9 & 7)) >> 3] = j5;
        Object[] objArr = this.c;
        V v = (V) objArr[i];
        objArr[i] = null;
        return v;
    }

    public final void i(long j, V v) {
        int e = e(j);
        this.b[e] = j;
        this.c[e] = v;
    }

    public /* synthetic */ xg50() {
        this(6);
    }
}
