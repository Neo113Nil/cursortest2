package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* loaded from: classes11.dex */
public abstract class joa1 {
    public static final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1217842570);
        if (btsVar.V(i & 1, i != 0)) {
            f530 f = i9a1.f(m4m0.a(ljs0.u(ljs0.c(c530.a, 1.0f), x4c.D, 2), zoy0.G(((ry2) btsVar.m(uy2.a)).b ? i01.a : i01.b, 0.0f, 0.0f, 14), null, 6));
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, f);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            g2d.a.getClass();
            ydb1.a(null, null, g2d.b, null, null, null, null, false, btsVar, 384, 251);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zbd(i, 10);
        }
    }

    public static boolean b(ef90 ef90Var, cfr cfrVar, int i, yer yerVar) {
        long A = ef90Var.A();
        long j = A >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((A >> 12) & 15);
        int i3 = (int) ((A >> 8) & 15);
        int i4 = (int) ((A >> 4) & 15);
        int i5 = (int) ((A >> 1) & 7);
        boolean z2 = (A & 1) == 1;
        if (i4 <= 7) {
            if (i4 != cfrVar.g - 1) {
                return false;
            }
        } else if (i4 > 10 || cfrVar.g != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == cfrVar.i) || z2) {
            return false;
        }
        try {
            long F = ef90Var.F();
            if (!z) {
                F *= cfrVar.b;
            }
            yerVar.a = F;
            int c = c(i2, ef90Var);
            if (c == -1 || c > cfrVar.b) {
                return false;
            }
            int i6 = cfrVar.e;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != cfrVar.f) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int E = ef90Var.E();
                    if (i3 == 14) {
                        E *= 10;
                    }
                    if (E != i6) {
                        return false;
                    }
                } else if (ef90Var.y() * 1000 != i6) {
                    return false;
                }
            }
            int y = ef90Var.y();
            int i7 = ef90Var.b;
            byte[] bArr = ef90Var.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = ef90Var.b; i10 < i8; i10++) {
                i9 = tw21.n[i9 ^ (bArr[i10] & 255)];
            }
            int i11 = tw21.a;
            return y == i9;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int c(int i, ef90 ef90Var) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return ef90Var.y() + 1;
            case 7:
                return ef90Var.E() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static final yzj0 d(int i) {
        return new yzj0(i, c51.a);
    }
}
