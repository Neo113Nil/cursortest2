package xsna;

import java.util.Arrays;

/* compiled from: ObjectIntMap.kt */
/* loaded from: classes11.dex */
public final class eh50<K> extends op70<K> {
    public int f;

    public eh50() {
        this((Object) null);
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
        Arrays.fill(this.b, 0, this.d, (Object) null);
        this.f = h5h0.a(this.d) - this.e;
    }

    public final int e(int i) {
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

    public final int f(K k) {
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
                int e = e(i4);
                long j8 = 255;
                if (this.f != 0 || ((this.a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.d;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (Long.compareUnsigned(this.e * 32, i14 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i16 = this.d;
                            Object[] objArr2 = this.b;
                            int[] iArr = this.c;
                            j3 = 128;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j9 = j8;
                                long j10 = jArr4[i18] & (-9187201950435737472L);
                                jArr4[i18] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i18++;
                                i15 = i15;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i19 = i15;
                            int length = jArr4.length;
                            int i20 = length - 1;
                            int i21 = length - 2;
                            long j11 = 72057594037927935L;
                            jArr4[i21] = (jArr4[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[i20] = jArr4[0];
                            int i22 = 0;
                            while (i22 != i16) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j12 = (jArr4[i23] >> i24) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj = objArr2[i22];
                                    int hashCode2 = (obj != null ? obj.hashCode() : 0) * i13;
                                    int i25 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e2 = e(i25);
                                    int i26 = i25 & i16;
                                    long j13 = j11;
                                    if (((e2 - i26) & i16) / 8 == ((i22 - i26) & i16) / i19) {
                                        jArr4[i23] = ((r8 & 127) << i24) | (jArr4[i23] & (~(j << i24)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i22++;
                                        i19 = i19;
                                        j11 = j13;
                                    } else {
                                        int i27 = i19;
                                        int i28 = e2 >> 3;
                                        long j14 = jArr4[i28];
                                        int i29 = (e2 & 7) << 3;
                                        if (((j14 >> i29) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i28] = ((~(j << i29)) & j14) | ((r8 & 127) << i29);
                                            jArr4[i23] = (jArr4[i23] & (~(j << i24))) | (128 << i24);
                                            objArr[e2] = objArr[i22];
                                            objArr[i22] = null;
                                            iArr[e2] = iArr[i22];
                                            iArr[i22] = 0;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i28] = ((r8 & 127) << i29) | ((~(j << i29)) & j14);
                                            Object obj2 = objArr[e2];
                                            objArr[e2] = objArr[i22];
                                            objArr[i22] = obj2;
                                            int i30 = iArr[e2];
                                            iArr[e2] = iArr[i22];
                                            iArr[i22] = i30;
                                            i22--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i22++;
                                        i16 = i;
                                        i19 = i27;
                                        j11 = j13;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i22++;
                                }
                            }
                            this.f = h5h0.a(this.d) - this.e;
                            e = e(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int c = h5h0.c(this.d);
                    long[] jArr5 = this.a;
                    Object[] objArr3 = this.b;
                    int[] iArr2 = this.c;
                    int i31 = this.d;
                    g(c);
                    long[] jArr6 = this.a;
                    Object[] objArr4 = this.b;
                    int[] iArr3 = this.c;
                    int i32 = this.d;
                    int i33 = 0;
                    while (i33 < i31) {
                        if (((jArr5[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < 128) {
                            Object obj3 = objArr3[i33];
                            int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i13;
                            int i34 = hashCode3 ^ (hashCode3 << 16);
                            int e3 = e(i34 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j15 = i34 & 127;
                            int i35 = e3 >> 3;
                            int i36 = (e3 & 7) << 3;
                            long j16 = (jArr[i35] & (~(255 << i36))) | (j15 << i36);
                            jArr[i35] = j16;
                            jArr[(((e3 - 7) & i32) + (i32 & 7)) >> 3] = j16;
                            objArr4[e3] = obj3;
                            iArr3[e3] = iArr2[i33];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i33++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e = e(i4);
                }
                this.e++;
                int i37 = this.f;
                long[] jArr7 = this.a;
                int i38 = e >> 3;
                long j17 = jArr7[i38];
                int i39 = (e & 7) << 3;
                this.f = i37 - (((j17 >> i39) & j) == j3 ? 1 : 0);
                int i40 = this.d;
                long j18 = (j17 & (~(j << i39))) | (j2 << i39);
                jArr7[i38] = j18;
                jArr7[(((e - 7) & i40) + (i40 & 7)) >> 3] = j18;
                return ~e;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
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
        this.b = new Object[max];
        this.c = new int[max];
    }

    public final void h(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final void i(K k, int i) {
        int f = f(k);
        if (f < 0) {
            f = ~f;
        }
        this.b[f] = k;
        this.c[f] = i;
    }

    public eh50(int i) {
        if (i >= 0) {
            g(h5h0.e(i));
        } else {
            alk.B("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ eh50(Object obj) {
        this(6);
    }
}
