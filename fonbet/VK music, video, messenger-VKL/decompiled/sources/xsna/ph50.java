package xsna;

import java.util.Arrays;

/* compiled from: ScatterMap.kt */
/* loaded from: classes11.dex */
public final class ph50<K, V> extends g5h0<K, V> {
    public int f;

    public ph50() {
        this((Object) null);
    }

    public final void h() {
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
        Arrays.fill(this.b, 0, this.d, (Object) null);
        this.f = h5h0.a(this.d) - this.e;
    }

    public final int i(int i) {
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

    public final int j(K k) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2 = -862048943;
        int hashCode = (k != null ? k.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.d;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j7) >> 3)) & i6;
                int i12 = i2;
                if (epx.f(this.b[numberOfTrailingZeros], k)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int i14 = i(i4);
                long j8 = 255;
                if (this.f != 0 || ((this.a[i14 >> 3] >> ((i14 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i15 = this.d;
                    if (i15 > 8) {
                        int i16 = 8;
                        if (Long.compareUnsigned(this.e * 32, i15 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i17 = this.d;
                            Object[] objArr2 = this.b;
                            Object[] objArr3 = this.c;
                            j3 = 128;
                            int i18 = (i17 + 7) >> 3;
                            int i19 = 0;
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
                            jArr4[i22] = (jArr4[i22] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[i21] = jArr4[0];
                            int i23 = 0;
                            while (i23 != i17) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j11 = (jArr4[i24] >> i25) & j;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj = objArr2[i23];
                                    int hashCode2 = (obj != null ? obj.hashCode() : 0) * i13;
                                    int i26 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int i27 = i(i26);
                                    int i28 = i26 & i17;
                                    if (((i27 - i28) & i17) / i20 == ((i23 - i28) & i17) / i20) {
                                        jArr4[i24] = ((r8 & 127) << i25) | (jArr4[i24] & (~(j << i25)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i23++;
                                        i20 = i20;
                                    } else {
                                        int i29 = i20;
                                        int i30 = i27 >> 3;
                                        long j12 = jArr4[i30];
                                        int i31 = (i27 & 7) << 3;
                                        if (((j12 >> i31) & j) == 128) {
                                            i = i17;
                                            objArr = objArr2;
                                            jArr4[i30] = ((~(j << i31)) & j12) | ((r8 & 127) << i31);
                                            jArr4[i24] = (jArr4[i24] & (~(j << i25))) | (128 << i25);
                                            objArr[i27] = objArr[i23];
                                            objArr[i23] = null;
                                            objArr3[i27] = objArr3[i23];
                                            objArr3[i23] = null;
                                        } else {
                                            i = i17;
                                            objArr = objArr2;
                                            jArr4[i30] = ((r8 & 127) << i31) | ((~(j << i31)) & j12);
                                            Object obj2 = objArr[i27];
                                            objArr[i27] = objArr[i23];
                                            objArr[i23] = obj2;
                                            Object obj3 = objArr3[i27];
                                            objArr3[i27] = objArr3[i23];
                                            objArr3[i23] = obj3;
                                            i23--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i23++;
                                        i20 = i29;
                                        i17 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i23++;
                                }
                            }
                            this.f = h5h0.a(this.d) - this.e;
                            i14 = i(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int c = h5h0.c(this.d);
                    long[] jArr5 = this.a;
                    Object[] objArr4 = this.b;
                    Object[] objArr5 = this.c;
                    int i32 = this.d;
                    k(c);
                    long[] jArr6 = this.a;
                    Object[] objArr6 = this.b;
                    Object[] objArr7 = this.c;
                    int i33 = this.d;
                    int i34 = 0;
                    while (i34 < i32) {
                        if (((jArr5[i34 >> 3] >> ((i34 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr4[i34];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i35 = hashCode3 ^ (hashCode3 << 16);
                            int i36 = i(i35 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j13 = i35 & 127;
                            int i37 = i36 >> 3;
                            int i38 = (i36 & 7) << 3;
                            long j14 = (jArr[i37] & (~(255 << i38))) | (j13 << i38);
                            jArr[i37] = j14;
                            jArr[(((i36 - 7) & i33) + (i33 & 7)) >> 3] = j14;
                            objArr6[i36] = obj4;
                            objArr7[i36] = objArr5[i34];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i34++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    i14 = i(i4);
                }
                this.e++;
                int i39 = this.f;
                long[] jArr7 = this.a;
                int i40 = i14 >> 3;
                long j15 = jArr7[i40];
                int i41 = (i14 & 7) << 3;
                this.f = i39 - (((j15 >> i41) & j) == j3 ? 1 : 0);
                int i42 = this.d;
                long j16 = (j15 & (~(j << i41))) | (j2 << i41);
                jArr7[i40] = j16;
                jArr7[(((i14 - 7) & i42) + (i42 & 7)) >> 3] = j16;
                return ~i14;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final void k(int i) {
        long[] jArr;
        Object[] objArr = ey2.d;
        int max = i > 0 ? Math.max(7, h5h0.d(i)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = h5h0.a;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            int i3 = max >> 3;
            long j = 255 << ((max & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j)) | j;
            jArr = jArr2;
        }
        this.a = jArr;
        this.f = h5h0.a(this.d) - this.e;
        this.b = max == 0 ? objArr : new Object[max];
        if (max != 0) {
            objArr = new Object[max];
        }
        this.c = objArr;
    }

    public final V l(K k, V v) {
        int j = j(k);
        if (j < 0) {
            j = ~j;
        }
        Object[] objArr = this.c;
        V v2 = (V) objArr[j];
        this.b[j] = k;
        objArr[j] = v;
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(g5h0<K, V> g5h0Var) {
        Object[] objArr = g5h0Var.b;
        Object[] objArr2 = g5h0Var.c;
        long[] jArr = g5h0Var.a;
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
                        p(objArr[i4], objArr2[i4]);
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V n(K k) {
        int i;
        int i2 = 0;
        int hashCode = (k != null ? k.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.d;
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
                if (epx.f(this.b[i], k)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            return o(i);
        }
        return null;
    }

    public final V o(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        Object[] objArr = this.c;
        V v = (V) objArr[i];
        objArr[i] = null;
        return v;
    }

    public final void p(K k, V v) {
        int j = j(k);
        if (j < 0) {
            j = ~j;
        }
        this.b[j] = k;
        this.c[j] = v;
    }

    public ph50(int i) {
        if (i >= 0) {
            k(h5h0.e(i));
        } else {
            alk.B("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ ph50(Object obj) {
        this(6);
    }
}
