package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes.dex */
public abstract class fhe0 {
    public static final /* synthetic */ int a = 0;

    static {
        new a7u0(new mlc0(27));
    }

    public static final void a(a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(442516910);
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            btsVar.e0(1766838549);
            btsVar.t(false);
            btsVar.e0(1767392772);
            aVar.invoke(btsVar, 6);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vy2(aVar, i);
        }
    }

    public static final xx40 b(xx40 xx40Var, int i, boolean z) {
        char c;
        char c2;
        boolean c3 = xx40Var.c(i);
        char c4 = 7;
        long j = -9187201950435737472L;
        if (!c3 || z) {
            if (c3 || !z) {
                return null;
            }
            xx40 xx40Var2 = new xx40(xx40Var.d + 1);
            int[] iArr = xx40Var.b;
            long[] jArr = xx40Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & j) != j) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((j2 & 255) < 128) {
                                int i5 = iArr[(i2 << 3) + i4];
                                xx40Var2.b[xx40Var2.d(i5)] = i5;
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    j = -9187201950435737472L;
                }
            }
            xx40Var2.a(i);
            return xx40Var2;
        }
        xx40 xx40Var3 = new xx40(xx40Var.d - 1);
        int[] iArr2 = xx40Var.b;
        long[] jArr2 = xx40Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i6 = 0;
            while (true) {
                long j3 = jArr2[i6];
                if ((((~j3) << c4) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j3 & 255) < 128) {
                            c2 = c4;
                            if (iArr2[(i6 << 3) + i8] != i) {
                                xx40Var3.a(i);
                            }
                        } else {
                            c2 = c4;
                        }
                        j3 >>= 8;
                        i8++;
                        c4 = c2;
                    }
                    c = c4;
                    if (i7 != 8) {
                        break;
                    }
                } else {
                    c = c4;
                }
                if (i6 == length2) {
                    break;
                }
                i6++;
                c4 = c;
            }
        }
        return xx40Var3;
    }
}
