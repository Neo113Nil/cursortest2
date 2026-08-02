package defpackage;

import androidx.compose.ui.graphics.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class p4v {
    public static final f530 a = ljs0.m(c530.a, yws0.c);

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(mgv mgvVar, String str, f530 f530Var, long j, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        long j2;
        long j3;
        f530 f530Var3;
        aii0 v;
        f530 f530Var4;
        long j4;
        int i4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-126890956);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(mgvVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.k(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 256 : 128;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (btsVar.d(j2)) {
                        i4 = 2048;
                        i3 |= i4;
                    }
                } else {
                    j2 = j;
                }
                i4 = 1024;
                i3 |= i4;
            } else {
                j2 = j;
            }
            if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
                btsVar.Y();
                j3 = j2;
                f530Var3 = f530Var2;
            } else {
                btsVar.a0();
                if ((i & 1) == 0 || btsVar.C()) {
                    f530 f530Var5 = i5 != 0 ? c530.a : f530Var2;
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        f530Var4 = f530Var5;
                        j4 = ((ldc) btsVar.m(bfe.a)).a;
                        btsVar.u();
                        b(ba91.c(mgvVar, btsVar), str, f530Var4, j4, btsVar, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
                        f530Var3 = f530Var4;
                        j3 = j4;
                    } else {
                        f530Var4 = f530Var5;
                    }
                } else {
                    btsVar.Y();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    f530Var4 = f530Var2;
                }
                j4 = j2;
                btsVar.u();
                b(ba91.c(mgvVar, btsVar), str, f530Var4, j4, btsVar, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
                f530Var3 = f530Var4;
                j3 = j4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new o4v(mgvVar, str, f530Var3, j3, i, i2, 2);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if ((r23 & 8) != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (r3 & ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues.maxDWORD))) != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(pa90 pa90Var, String str, f530 f530Var, long j, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        long j2;
        f530 f530Var3;
        long j3;
        aii0 v;
        f530 f530Var4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2142239481);
        if ((i & 6) == 0) {
            i3 = (btsVar.e(pa90Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.k(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 256 : 128;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
                j2 = j;
                i3 |= ((i2 & 8) == 0 && btsVar.d(j2)) ? 2048 : 1024;
            } else {
                j2 = j;
            }
            if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
                btsVar.Y();
                f530Var3 = f530Var2;
                j3 = j2;
            } else {
                btsVar.a0();
                int i5 = i & 1;
                f530 f530Var5 = c530.a;
                if (i5 == 0 || btsVar.C()) {
                    if (i4 != 0) {
                        f530Var2 = f530Var5;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = ((ldc) btsVar.m(bfe.a)).a;
                        i3 &= -7169;
                    }
                    btsVar.u();
                    boolean z = (((i3 & 7168) ^ HProv.ALG_TYPE_SECURECHANNEL) > 2048 && btsVar.d(j2)) || (i3 & HProv.ALG_TYPE_SECURECHANNEL) == 2048;
                    Object Q = btsVar.Q();
                    o430 o430Var = did.a;
                    if (z || Q == o430Var) {
                        Q = ldc.c(j2, ldc.m) ? null : new c36(j2, 5);
                        btsVar.o0(Q);
                    }
                    wec wecVar = (wec) Q;
                    if (str != null) {
                        btsVar.e0(-537002883);
                        boolean z2 = (i3 & 112) == 32;
                        Object Q2 = btsVar.Q();
                        if (z2 || Q2 == o430Var) {
                            Q2 = new vsq(str, 10);
                            btsVar.o0(Q2);
                        }
                        f530Var4 = fnq0.b(f530Var5, false, (tls) Q2);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-536844101);
                        btsVar.t(false);
                        f530Var4 = f530Var5;
                    }
                    f530 d = d.d(f530Var2);
                    if (!cjs0.a(pa90Var.i(), 9205357640488583168L)) {
                        long i6 = pa90Var.i();
                        if (Float.isInfinite(Float.intBitsToFloat((int) (i6 >> 32)))) {
                        }
                        pi6.a(cma1.j0(d.k(f530Var5), pa90Var, null, mhe.b, 0.0f, wecVar, 22).k(f530Var4), btsVar, 0);
                        f530Var3 = f530Var2;
                        j3 = j2;
                    }
                    f530Var5 = a;
                    pi6.a(cma1.j0(d.k(f530Var5), pa90Var, null, mhe.b, 0.0f, wecVar, 22).k(f530Var4), btsVar, 0);
                    f530Var3 = f530Var2;
                    j3 = j2;
                } else {
                    btsVar.Y();
                }
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new o4v(pa90Var, str, f530Var3, j3, i, i2, 0);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }
}
