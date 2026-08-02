package yads;

import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes10.dex */
public abstract class w23 {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(oq0 oq0Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        int i;
        int i2;
        long length = oq0Var.getLength();
        long j = -1;
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i3 != 0 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = length;
        }
        int i4 = (int) j2;
        kc2 kc2Var = new kc2(64);
        int i5 = 0;
        int i6 = 0;
        boolean z5 = false;
        while (i6 < i4) {
            kc2Var.c(8);
            if (!oq0Var.b(kc2Var.a, i5, 8, true)) {
                break;
            }
            long n = kc2Var.n();
            int b = kc2Var.b();
            if (n == 1) {
                oq0Var.a(kc2Var.a, 8, 8);
                kc2Var.d(16);
                z4 = i5;
                i = i6;
                i2 = 16;
                n = kc2Var.i();
            } else {
                if (n == 0) {
                    long length2 = oq0Var.getLength();
                    if (length2 != j) {
                        n = (length2 - oq0Var.c()) + 8;
                    }
                }
                z4 = i5;
                i = i6;
                i2 = 8;
            }
            long j3 = i2;
            if (n < j3) {
                return z4;
            }
            int i7 = i + i2;
            boolean z6 = z4;
            if (b == 1836019574) {
                i4 += (int) n;
                if (i3 != 0 && i4 > length) {
                    i4 = (int) length;
                }
                i6 = i7;
                i5 = z6 ? 1 : 0;
                j = -1;
            } else {
                if (b == 1836019558 || b == 1836475768) {
                    z3 = true;
                    break;
                }
                int i8 = i3;
                if ((i7 + n) - j3 >= i4) {
                    break;
                }
                int i9 = (int) (n - j3);
                i6 = i7 + i9;
                if (b == 1718909296) {
                    if (i9 < 8) {
                        return z6;
                    }
                    kc2Var.c(i9);
                    oq0Var.a(kc2Var.a, z6 ? 1 : 0, i9);
                    int i10 = i9 / 4;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (i11 != 1) {
                            int b2 = kc2Var.b();
                            if ((b2 >>> 8) != 3368816 && (b2 != 1751476579 || !z2)) {
                                int[] iArr = a;
                                for (int i12 = 0; i12 < 29; i12++) {
                                    if (iArr[i12] != b2) {
                                    }
                                }
                            }
                            z5 = true;
                            break;
                        }
                        kc2Var.e(kc2Var.b + 4);
                    }
                    if (!z5) {
                        return false;
                    }
                } else if (i9 != 0) {
                    oq0Var.b(i9);
                }
                i3 = i8;
                j = -1;
                i5 = 0;
            }
        }
        z3 = false;
        return z5 && z == z3;
    }
}
