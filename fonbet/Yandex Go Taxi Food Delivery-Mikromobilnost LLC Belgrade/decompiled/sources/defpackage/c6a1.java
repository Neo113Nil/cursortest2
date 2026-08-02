package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.Arrays;
import java.util.List;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes4.dex */
public abstract class c6a1 {
    public static final void a(int i, fid fidVar, sls slsVar, f530 f530Var) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-440235594);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            cq91.a(null, ohb1.e(btsVar, oyh0.folders_empty_state_text), f530Var2, wwg.S(-960744442, true, new qvn(elb1.d(btsVar) ? wwg0.msg_zero_chats_dark : wwg0.msg_zero_chats_light), btsVar), wwg.S(-1233180729, true, new xde(1, slsVar), btsVar), btsVar, ((i2 << 6) & 896) | 27648, 1);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ve6(f530Var2, slsVar, i, 3);
        }
    }

    public static int b(int i) {
        if (i >= 32768) {
            return i < 8388608 ? i < 524288 ? i < 131072 ? i < 65536 ? 16 : 17 : i < 262144 ? 18 : 19 : i < 2097152 ? i < 1048576 ? 20 : 21 : i < 4194304 ? 22 : 23 : i < 134217728 ? i < 33554432 ? i < 16777216 ? 24 : 25 : i < 67108864 ? 26 : 27 : i < 536870912 ? i < 268435456 ? 28 : 29 : i < 1073741824 ? 30 : 31;
        }
        if (i >= 128) {
            return i < 2048 ? i < 512 ? i < 256 ? 8 : 9 : i < 1024 ? 10 : 11 : i < 8192 ? i < 4096 ? 12 : 13 : i < 16384 ? 14 : 15;
        }
        if (i >= 8) {
            return i < 32 ? i < 16 ? 4 : 5 : i < 64 ? 6 : 7;
        }
        if (i >= 2) {
            return i < 4 ? 2 : 3;
        }
        if (i < 1) {
            return i < 0 ? 32 : 0;
        }
        return 1;
    }

    public static int c(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        int i4;
        int i5 = i2 - 1;
        int i6 = i3 - 1;
        while (true) {
            if (i5 <= i6) {
                i4 = 0;
                break;
            }
            if (iArr[i5] != 0) {
                i4 = 1;
                break;
            }
            i5--;
        }
        if (i4 == 0) {
            while (true) {
                if (i6 <= i5) {
                    break;
                }
                if (iArr2[i6 + i] != 0) {
                    i4 = -1;
                    break;
                }
                i6--;
            }
            if (i4 == 0) {
                while (i5 >= 0) {
                    int i7 = iArr[i5];
                    int i8 = i5 + i;
                    if (i7 != iArr2[i8]) {
                        return n(i7) > n(iArr2[i8]) ? 1 : -1;
                    }
                    i5--;
                }
            }
        }
        return i4;
    }

    public static int d(int i, int[] iArr) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (iArr[i2] != 0) {
                return i2 + 1;
            }
        }
        return 0;
    }

    public static void e(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr2, i2, iArr, i, iArr2.length < i3 ? iArr2.length : i3);
        if (iArr2.length < i3) {
            Arrays.fill(iArr, iArr2.length + i, i + i3, 0);
        }
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (n(iArr2[i2]) - n(iArr3[i2])) - ((int) (-(j >> 32)));
            iArr[i2] = (int) j;
        }
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3, int i, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 + i;
            long j2 = j >>> 32;
            j = j2 + n(iArr3[i3]) + n(iArr2[i4]);
            iArr[i4] = (int) j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    public static void h(int[] iArr, int[] iArr2, int[] iArr3, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int[] iArr4;
        int i7;
        int[] iArr5;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr6;
        long j;
        char c;
        int i12;
        boolean z;
        int i13;
        int i14;
        ?? r13;
        int d = d(i4, iArr3);
        if (d == 0) {
            w511.w("Division By Zero");
            return;
        }
        boolean z2 = false;
        int c2 = c(0, i3, d, iArr2, iArr3);
        if (c2 < 0) {
            System.arraycopy(iArr2, 0, iArr, i, i3 < i4 ? i3 : i4);
            if (i3 < i4) {
                Arrays.fill(iArr, i + i3, i + i4, 0);
                return;
            }
            return;
        }
        if (c2 == 0) {
            Arrays.fill(iArr, i, i + i4, 0);
            return;
        }
        int d2 = d(i3, iArr2);
        int[] iArr7 = new int[68];
        int[] iArr8 = new int[68];
        int[] iArr9 = new int[68];
        System.arraycopy(iArr3, 0, iArr7, 0, d);
        System.arraycopy(iArr2, 0, iArr8, 0, d2);
        long j2 = 0;
        char c3 = HexString.CHAR_SPACE;
        int i15 = 1;
        if (d == 1) {
            int i16 = iArr7[0];
            long n = n(i16);
            if (d2 != 1) {
                int b = 32 - b(i16);
                int i17 = d2 - 1;
                int i18 = iArr8[i17];
                long n2 = n(i18);
                if (n2 < n) {
                    iArr9[i17] = 0;
                    j = 1;
                } else {
                    j = 1;
                    int i19 = (int) (n2 / n);
                    iArr9[i17] = i19;
                    int i20 = (int) (n2 - (i19 * n));
                    n2 = n(i20);
                    i18 = i20;
                }
                int i21 = 0;
                while (true) {
                    i21 += i15;
                    if (i21 < d2) {
                        int i22 = (d2 - i21) - i15;
                        long n3 = (n2 << c3) | n(iArr8[i22]);
                        long j3 = j2;
                        if (n3 >= j2) {
                            int i23 = (int) (n3 / n);
                            c = c3;
                            int i24 = i15;
                            int i25 = (int) (n3 - (i23 * n));
                            z = z2;
                            i13 = b;
                            i14 = i23;
                            i12 = i24;
                            i18 = i25;
                        } else {
                            c = c3;
                            int i26 = i15;
                            long n4 = n(i16);
                            if (n4 == j) {
                                break;
                            }
                            long j4 = (n3 >>> i26) / (n4 >>> i26);
                            long j5 = n3 - (j4 * n4);
                            while (j5 < j3) {
                                j5 += n4;
                                j4 -= j;
                            }
                            i12 = i26;
                            long j6 = j5;
                            z = z2;
                            i13 = b;
                            long j7 = j4;
                            while (j6 >= n4) {
                                j6 -= n4;
                                j7 += j;
                            }
                            i14 = (int) j7;
                            i18 = (int) j6;
                        }
                        iArr9[i22] = i14;
                        n2 = n(i18);
                        c3 = c;
                        z2 = z;
                        b = i13;
                        i15 = i12;
                        j2 = j3;
                    } else {
                        boolean z3 = z2;
                        if (b > 0) {
                            iArr8[z3 ? 1 : 0] = i18 % i16;
                            r13 = z3;
                        } else {
                            iArr8[z3 ? 1 : 0] = i18;
                            r13 = z3;
                        }
                    }
                }
                iArr[i] = iArr8[r13];
                return;
            }
            long n5 = n(iArr8[0]);
            int i27 = (int) (n5 / n);
            iArr9[0] = i27;
            iArr8[0] = (int) (n5 - (i27 * n));
            r13 = z2;
            iArr[i] = iArr8[r13];
            return;
        }
        int i28 = 1;
        int i29 = 0;
        int i30 = d - 1;
        int b2 = 32 - b(iArr7[i30]);
        iArr8[d2] = 0;
        if (b2 > 0) {
            o(iArr7, d, b2);
            o(iArr8, d2, b2);
        }
        int i31 = iArr7[i30];
        long n6 = n(i31);
        int i32 = iArr7[d - 2];
        int i33 = d2 - d;
        while (i33 >= 0) {
            int i34 = i33 + d;
            int i35 = i28;
            int i36 = iArr8[i34];
            int i37 = i29;
            int i38 = i36 - 2147483648;
            int i39 = iArr8[i34 - 1];
            if (i36 == i31) {
                i10 = i36 + i39;
                i5 = i31;
                i7 = i32;
                i9 = -1;
                i6 = i33;
                iArr5 = iArr7;
                i8 = i34;
                i11 = i10 + Integer.MIN_VALUE < i38 ? i35 : i37;
                iArr4 = iArr9;
            } else {
                i5 = i31;
                i6 = i33;
                iArr4 = iArr9;
                long n7 = (i36 << 32) | n(i39);
                i7 = i32;
                if (n7 >= 0) {
                    i9 = (int) (n7 / n6);
                    iArr5 = iArr7;
                    i10 = (int) (n7 - (i9 * n6));
                    i8 = i34;
                } else {
                    iArr5 = iArr7;
                    long n8 = n(i5);
                    if (n8 == 1) {
                        i9 = (int) n7;
                        i8 = i34;
                        i11 = i37;
                        i10 = i11;
                    } else {
                        long j8 = (n7 >>> i35) / (n8 >>> i35);
                        long j9 = n7 - (j8 * n8);
                        while (j9 < 0) {
                            j9 += n8;
                            j8--;
                        }
                        long j10 = j8;
                        i8 = i34;
                        long j11 = j10;
                        while (j9 >= n8) {
                            j9 -= n8;
                            j11++;
                        }
                        i9 = (int) j11;
                        i10 = (int) j9;
                    }
                }
                i11 = i37;
            }
            if (i9 == 0) {
                iArr6 = iArr4;
            } else {
                if (i11 == 0) {
                    long n9 = n(iArr8[i8 - 2]);
                    if ((n(i9) * n(i7)) - Long.MIN_VALUE > ((n(i10) << 32) | n9) - Long.MIN_VALUE) {
                        int i40 = i9 - 1;
                        if (n((int) (n(i10) + n6)) >= n6) {
                            if ((n(i40) * n(i7)) - Long.MIN_VALUE > (n9 | (n(r10) << 32)) - Long.MIN_VALUE) {
                                i9 -= 2;
                            }
                        }
                        i9 = i40;
                    }
                }
                iArr8[i8] = i37;
                long n10 = n(i9);
                long j12 = 0;
                int i41 = i37;
                int i42 = i6;
                while (i41 < d) {
                    long n11 = (n(iArr5[i41]) * n10) + j12;
                    int[] iArr10 = iArr4;
                    long j13 = n10;
                    long j14 = iArr8[i42] - n11;
                    int i43 = i42 + 1;
                    iArr8[i42] = (int) j14;
                    j12 = (n11 >>> 32) + (((j14 << 32) >>> 32) > n(~((int) n11)) ? i35 : i37);
                    i41++;
                    iArr4 = iArr10;
                    n10 = j13;
                    i42 = i43;
                }
                iArr6 = iArr4;
                if (((int) j12) - 2147483648 > i38) {
                    int i44 = d + 1;
                    long j15 = 0;
                    for (int i45 = i37; i45 < i44; i45++) {
                        int i46 = i45 + i6;
                        long n12 = n(iArr8[i46]) + n(iArr5[i45]) + j15;
                        iArr8[i46] = (int) n12;
                        j15 = n12 >>> 32;
                    }
                    i9--;
                }
                iArr6[i6] = i9;
            }
            i33 = i6 - 1;
            i28 = i35;
            i29 = i37;
            i32 = i7;
            i31 = i5;
            iArr7 = iArr5;
            iArr9 = iArr6;
        }
        int i47 = i29;
        if (b2 > 0) {
            int i48 = 32 - b2;
            int i49 = iArr8[i47];
            int i50 = i47;
            while (i50 < i30) {
                int i51 = i50 + 1;
                int i52 = iArr8[i51];
                iArr8[i50] = (i49 >>> b2) | (i52 << i48);
                i50 = i51;
                i49 = i52;
            }
            iArr8[i30] = iArr8[i30] >>> b2;
        }
        System.arraycopy(iArr8, i47, iArr, i, d);
    }

    public static void i(int[] iArr, int[] iArr2, int[] iArr3, int i, int i2, int i3, int[] iArr4, int i4) {
        int i5 = i4 + i4;
        int[] iArr5 = new int[i5 + 2];
        if (((i4 == 8 && i4 == 8) || (i4 == 16 && i4 == 16)) && i2 == 0 && i3 == 0) {
            long j = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                long e = (r5a1.e(iArr3[0]) * r5a1.e(iArr2[i6])) + j;
                j = e >>> 32;
                iArr5[i6] = (int) e;
            }
            iArr5[i4] = (int) j;
            for (int i7 = 1; i7 < i4; i7++) {
                long j2 = 0;
                int i8 = 0;
                while (i8 < i4) {
                    int i9 = i7 + i8;
                    long e2 = j2 + r5a1.e(iArr5[i9]) + (r5a1.e(iArr3[i7]) * r5a1.e(iArr2[i8]));
                    iArr5[i9] = (int) e2;
                    i8++;
                    j2 = e2 >>> 32;
                }
                iArr5[i7 + i4] = (int) j2;
            }
        } else {
            int[] iArr6 = new int[35];
            Arrays.fill(iArr5, 0, i5, 0);
            for (int i10 = 0; i10 < i4; i10++) {
                int i11 = iArr3[i10 + i3];
                int i12 = i4 + i2;
                long j3 = 0;
                for (int i13 = i2; i13 < i12; i13++) {
                    long n = j3 + (n(i11) * n(iArr2[i13]));
                    iArr6[i13 - i2] = (int) n;
                    j3 = n >>> 32;
                }
                iArr6[i4] = (int) j3;
                g(iArr5, iArr5, iArr6, i10, i4 + 1);
            }
        }
        h(iArr, iArr5, iArr4, i, i4, i5, i4);
    }

    public static void j(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i, int i2, int i3, int i4, int i5) {
        if ((i4 & 1) == 0 || !(i5 == 64 || i5 == 32 || i5 == 16)) {
            i(iArr, iArr2, iArr3, i, i2, i3, iArr4, i5);
            return;
        }
        int[] iArr5 = new int[35];
        int i6 = i5 + 1;
        Arrays.fill(iArr5, 0, i6, 0);
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 < i5) {
                int i8 = iArr3[i7 + i3];
                long j = 0;
                for (int i9 = 0; i9 < i5; i9++) {
                    j = (j >>> 32) + n(iArr5[i9]) + (n(i8) * n(iArr2[i9 + i2]));
                    iArr5[i9] = (int) j;
                }
                iArr5[i5] = iArr5[i5] + ((int) (j >>> 32));
            }
            int n = (int) (((n(i4) * n(iArr5[0])) << 32) >>> 32);
            long n2 = n(iArr5[0]) + (n(n) * n(iArr4[0]));
            for (int i10 = 1; i10 < i5; i10++) {
                n2 = (n2 >>> 32) + n(iArr5[i10]) + (n(n) * n(iArr4[i10]));
                iArr5[i10 - 1] = (int) n2;
            }
            long n3 = n(iArr5[i5]) + (n2 >>> 32);
            iArr5[i5 - 1] = (int) n3;
            iArr5[i5] = (int) (n3 >>> 32);
        }
        if (iArr5[i5] != 0) {
            f(iArr5, iArr5, iArr4, i5);
        }
        while (c(0, i5, i5, iArr5, iArr4) >= 0) {
            f(iArr5, iArr5, iArr4, i5);
        }
        e(i, 0, i5, iArr, iArr5);
    }

    public static final void k(xky0 xky0Var, final Context context, final boolean z, final CharSequence charSequence, final long j) {
        if (asy0.c(j) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) uo91.a.invoke(context);
        if (list.isEmpty()) {
            return;
        }
        xky0Var.a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            xky0Var.a.g(new hly0(resolveInfo.loadLabel(packageManager).toString(), new tls() { // from class: d6f0
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    uo91.b.invoke(context, resolveInfo, Boolean.valueOf(z), charSequence, new asy0(j));
                    ((lly0) obj).close();
                    return zy11.a;
                }
            }, 0, new b6f0(i)));
        }
        xky0Var.a();
    }

    public static void l(int i, int[] iArr) {
        int i2 = 0;
        int i3 = iArr[0];
        while (true) {
            int i4 = i - 1;
            if (i2 >= i4) {
                iArr[i4] = iArr[i4] >> 1;
                return;
            }
            int i5 = i2 + 1;
            int i6 = iArr[i5];
            iArr[i2] = (i3 >>> 1) | (i6 << 31);
            i2 = i5;
            i3 = i6;
        }
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3, int i, int i2, int i3) {
        int[] iArr4 = new int[69];
        if ((i2 & 1) == 0 || !(i3 == 8 || i3 == 32 || i3 == 16)) {
            e(i, 0, i3, iArr, iArr2);
            return;
        }
        int i4 = i3 + 1;
        Arrays.fill(iArr4, 0, i4, 0);
        e(i4, 0, i3, iArr4, iArr2);
        h(iArr, iArr4, iArr3, i, i4, i3 + i3 + 1, i3);
    }

    public static long n(int i) {
        return (i << 32) >>> 32;
    }

    public static void o(int[] iArr, int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        int i3 = 32 - i2;
        int i4 = i - 1;
        int i5 = 0;
        while (i4 >= 0) {
            int i6 = iArr[i4];
            iArr[i4 + 1] = (i5 << i2) | (i6 >>> i3);
            i4--;
            i5 = i6;
        }
        iArr[0] = iArr[0] << i2;
    }

    public static f530 p(wg6 wg6Var, lx40 lx40Var) {
        return new mf6(wg6Var, lx40Var);
    }
}
