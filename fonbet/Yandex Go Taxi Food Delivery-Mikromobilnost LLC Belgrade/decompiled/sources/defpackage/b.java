package defpackage;

import okio.ByteString;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public abstract class b {
    public static final byte[] a = "0123456789abcdef".getBytes(uza.a);
    public static final long[] b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED};

    public static final long a(yp6 yp6Var, ByteString byteString, long j, long j2, int i) {
        t7q0 t7q0Var;
        long j3 = j;
        long j4 = j2;
        long j5 = i;
        j.b(byteString.h(), 0L, j5);
        if (i <= 0) {
            ny61.g("byteCount == 0");
            return 0L;
        }
        if (j3 < 0) {
            w511.f(qv10.j(j3, "fromIndex < 0: "));
            return 0L;
        }
        if (j3 > j4) {
            StringBuilder w = unr0.w(j3, "fromIndex > toIndex: ", " > ");
            w.append(j4);
            throw new IllegalArgumentException(w.toString().toString());
        }
        long j6 = yp6Var.b;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (t7q0Var = yp6Var.a) == null) {
            return -1L;
        }
        long j7 = 0;
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                t7q0Var = t7q0Var.g;
                j6 -= t7q0Var.c - t7q0Var.b;
            }
            byte[] l = byteString.l();
            byte b2 = l[0];
            long min = Math.min(j4, (yp6Var.b - j5) + 1);
            while (j6 < min) {
                byte[] bArr = t7q0Var.a;
                int min2 = (int) Math.min(t7q0Var.c, (t7q0Var.b + min) - j6);
                for (int i2 = (int) ((t7q0Var.b + j3) - j6); i2 < min2; i2++) {
                    if (bArr[i2] == b2 && b(t7q0Var, i2 + 1, l, 1, i)) {
                        return (i2 - t7q0Var.b) + j6;
                    }
                }
                j6 += t7q0Var.c - t7q0Var.b;
                t7q0Var = t7q0Var.f;
                j3 = j6;
            }
            return -1L;
        }
        while (true) {
            long j8 = j7 + (t7q0Var.c - t7q0Var.b);
            if (j8 > j3) {
                break;
            }
            t7q0Var = t7q0Var.f;
            j7 = j8;
        }
        byte[] l2 = byteString.l();
        byte b3 = l2[0];
        long min3 = Math.min(j4, (yp6Var.b - j5) + 1);
        while (j7 < min3) {
            byte[] bArr2 = t7q0Var.a;
            int min4 = (int) Math.min(t7q0Var.c, (t7q0Var.b + min3) - j7);
            for (int i3 = (int) ((t7q0Var.b + j3) - j7); i3 < min4; i3++) {
                if (bArr2[i3] == b3 && b(t7q0Var, i3 + 1, l2, 1, i)) {
                    return (i3 - t7q0Var.b) + j7;
                }
            }
            j7 += t7q0Var.c - t7q0Var.b;
            t7q0Var = t7q0Var.f;
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean b(t7q0 t7q0Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = t7q0Var.c;
        byte[] bArr2 = t7q0Var.a;
        while (i2 < i3) {
            if (i == i4) {
                t7q0Var = t7q0Var.f;
                byte[] bArr3 = t7q0Var.a;
                bArr2 = bArr3;
                i = t7q0Var.b;
                i4 = t7q0Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(yp6 yp6Var, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (yp6Var.e(j2) == 13) {
                String T = yp6Var.T(j2, uza.a);
                yp6Var.skip(2L);
                return T;
            }
        }
        String T2 = yp6Var.T(j, uza.a);
        yp6Var.skip(1L);
        return T2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0053, code lost:
    
        return -2;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[LOOP:0: B:8:0x0019->B:29:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int d(yp6 yp6Var, ng70 ng70Var, boolean z) {
        int i;
        int i2;
        int i3;
        t7q0 t7q0Var;
        int i4;
        t7q0 t7q0Var2 = yp6Var.a;
        if (t7q0Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = t7q0Var2.a;
        int i5 = t7q0Var2.b;
        int i6 = t7q0Var2.c;
        int[] iArr = ng70Var.b;
        t7q0 t7q0Var3 = t7q0Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (t7q0Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            t7q0Var3 = t7q0Var3.f;
                            int i16 = t7q0Var3.b;
                            byte[] bArr2 = t7q0Var3.a;
                            i2 = t7q0Var3.c;
                            if (t7q0Var3 == t7q0Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                t7q0Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i < 0) {
                        }
                    } else {
                        i11++;
                    }
                }
                break loop0;
            }
            int i17 = (i10 * (-1)) + i11;
            while (true) {
                int i18 = i5 + 1;
                int i19 = i11 + 1;
                if ((bArr[i5] & 255) != iArr[i11]) {
                    break loop0;
                }
                boolean z2 = i19 == i17;
                if (i18 == i6) {
                    t7q0 t7q0Var4 = t7q0Var3.f;
                    i3 = t7q0Var4.b;
                    byte[] bArr3 = t7q0Var4.a;
                    i4 = t7q0Var4.c;
                    if (t7q0Var4 != t7q0Var2) {
                        t7q0Var = t7q0Var4;
                        bArr = bArr3;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr3;
                        t7q0Var = null;
                    }
                } else {
                    t7q0Var = t7q0Var3;
                    i4 = i6;
                    i3 = i18;
                }
                if (z2) {
                    i = iArr[i19];
                    int i20 = i4;
                    t7q0Var3 = t7q0Var;
                    i2 = i20;
                    break;
                }
                i5 = i3;
                i6 = i4;
                t7q0Var3 = t7q0Var;
                i11 = i19;
            }
            if (i < 0) {
                return i;
            }
            int i21 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i21;
        }
        return i7;
    }
}
