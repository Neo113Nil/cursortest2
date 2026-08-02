package xsna;

import java.util.Arrays;

/* compiled from: IntSet.kt */
/* loaded from: classes11.dex */
public final class qg50 extends o9x {
    public int e;

    public qg50() {
        this((Object) null);
    }

    public final boolean b(int i) {
        int i2 = this.d;
        this.b[d(i)] = i;
        return this.d != i2;
    }

    public final void c() {
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
        this.e = h5h0.a(this.c) - this.d;
    }

    public final int d(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        int i3;
        int i4;
        int i5 = -862048943;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.c;
        int i10 = i7 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = 1;
            long j4 = ((jArr3[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr3[i12] >>> i13);
            long j5 = i8;
            int i15 = i11;
            int i16 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j7) >> 3)) & i9;
                int i17 = i5;
                int i18 = i16;
                if (this.b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i5 = i17;
                i16 = i18;
            }
            int i19 = i5;
            int i20 = i16;
            char c = '\b';
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int e = e(i7);
                long j8 = 255;
                if (this.e != 0 || ((this.a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i21 = this.c;
                    if (i21 > 8) {
                        j3 = 128;
                        if (Long.compareUnsigned(this.d * 32, i21 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i22 = this.c;
                            int[] iArr2 = this.b;
                            int i23 = (i22 + 7) >> 3;
                            int i24 = i20;
                            while (i24 < i23) {
                                char c2 = c;
                                long j9 = jArr4[i24] & (-9187201950435737472L);
                                jArr4[i24] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i24++;
                                j5 = j5;
                                c = c2;
                                j8 = j8;
                            }
                            j = j8;
                            j2 = j5;
                            int length = jArr4.length;
                            int i25 = length - 1;
                            int i26 = length - 2;
                            long j10 = 72057594037927935L;
                            jArr4[i26] = (jArr4[i26] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[i25] = jArr4[i20];
                            int i27 = i20;
                            while (i27 != i22) {
                                int i28 = i27 >> 3;
                                int i29 = (i27 & 7) << 3;
                                long j11 = (jArr4[i28] >> i29) & j;
                                if (j11 != 128 && j11 == 254) {
                                    int hashCode2 = Integer.hashCode(iArr2[i27]) * i19;
                                    int i30 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e2 = e(i30);
                                    int i31 = i30 & i22;
                                    if (((e2 - i31) & i22) / 8 == ((i27 - i31) & i22) / 8) {
                                        long j12 = j10;
                                        jArr4[i28] = ((r7 & 127) << i29) | ((~(j << i29)) & jArr4[i28]);
                                        jArr4[jArr4.length - i14] = (jArr4[i20] & j12) | Long.MIN_VALUE;
                                        i27++;
                                        j10 = j12;
                                    } else {
                                        long j13 = j10;
                                        int i32 = e2 >> 3;
                                        long j14 = jArr4[i32];
                                        int i33 = (e2 & 7) << 3;
                                        if (((j14 >> i33) & j) == 128) {
                                            i3 = i14;
                                            iArr = iArr2;
                                            int i34 = i27;
                                            jArr4[i32] = ((~(j << i33)) & j14) | ((r7 & 127) << i33);
                                            jArr4[i28] = (jArr4[i28] & (~(j << i29))) | (128 << i29);
                                            iArr[e2] = iArr[i34];
                                            iArr[i34] = i20;
                                            i4 = i34;
                                        } else {
                                            iArr = iArr2;
                                            int i35 = i27;
                                            i3 = i14;
                                            jArr4[i32] = ((r7 & 127) << i33) | ((~(j << i33)) & j14);
                                            int i36 = iArr[e2];
                                            iArr[e2] = iArr[i35];
                                            iArr[i35] = i36;
                                            i4 = i35 - 1;
                                        }
                                        jArr4[jArr4.length - i3] = (jArr4[i20] & j13) | Long.MIN_VALUE;
                                        i27 = i4 + i3;
                                        i14 = i3;
                                        j10 = j13;
                                        iArr2 = iArr;
                                    }
                                } else {
                                    i27++;
                                }
                            }
                            i2 = i14;
                            this.e = h5h0.a(this.c) - this.d;
                            e = e(i7);
                        }
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int c3 = h5h0.c(this.c);
                    long[] jArr5 = this.a;
                    int[] iArr3 = this.b;
                    int i37 = this.c;
                    f(c3);
                    long[] jArr6 = this.a;
                    int[] iArr4 = this.b;
                    int i38 = this.c;
                    int i39 = i20;
                    while (i39 < i37) {
                        if (((jArr5[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < j3) {
                            int i40 = iArr3[i39];
                            int hashCode3 = Integer.hashCode(i40) * i19;
                            int i41 = hashCode3 ^ (hashCode3 << 16);
                            int e3 = e(i41 >>> 7);
                            long j15 = i41 & 127;
                            int i42 = e3 >> 3;
                            int i43 = (e3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j16 = (jArr6[i42] & (~(255 << i43))) | (j15 << i43);
                            jArr[i42] = j16;
                            jArr[(((e3 - 7) & i38) + (i38 & 7)) >> 3] = j16;
                            iArr4[e3] = i40;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i39++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e = e(i7);
                }
                this.d += i2;
                int i44 = this.e;
                long[] jArr7 = this.a;
                int i45 = e >> 3;
                long j17 = jArr7[i45];
                int i46 = (e & 7) << 3;
                if (((j17 >> i46) & j) != j3) {
                    i2 = i20;
                }
                this.e = i44 - i2;
                int i47 = this.c;
                long j18 = (j17 & (~(j << i46))) | (j2 << i46);
                jArr7[i45] = j18;
                jArr7[(((e - 7) & i47) + (i47 & 7)) >> 3] = j18;
                return e;
            }
            i11 = i15 + 8;
            i10 = (i10 + i11) & i9;
            i5 = i19;
        }
    }

    public final int e(int i) {
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

    public final void f(int i) {
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
        this.b = new int[max];
    }

    public final void g(int i) {
        this.b[d(i)] = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.c;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.b[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        boolean z = i2 >= 0;
        if (z) {
            i(i2);
        }
        return z;
    }

    public final void i(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public qg50(int i) {
        if (i >= 0) {
            f(h5h0.e(i));
        } else {
            alk.B("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ qg50(Object obj) {
        this(6);
    }
}
