package com.yandex.go.design.compose.loading;

import defpackage.aii0;
import defpackage.bb1;
import defpackage.bts;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dur0;
import defpackage.ehr0;
import defpackage.eja1;
import defpackage.eur0;
import defpackage.f530;
import defpackage.fid;
import defpackage.jcb1;
import defpackage.ldc;
import defpackage.ltr0;
import defpackage.m4m0;
import defpackage.mcb1;
import defpackage.mgu;
import defpackage.mtr0;
import defpackage.o430;
import defpackage.pi6;
import defpackage.q4z;
import defpackage.rx3;
import defpackage.tje;
import defpackage.tls;
import defpackage.tp2;
import defpackage.up2;
import defpackage.up5;
import defpackage.wls;
import defpackage.wp2;
import defpackage.yx91;
import defpackage.yzy;
import defpackage.zp2;
import defpackage.zpn;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:116:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, ehr0 ehr0Var, boolean z, eur0 eur0Var, wp2 wp2Var, wp2 wp2Var2, boolean z2, fid fidVar, int i, int i2) {
        int i3;
        ehr0 ehr0Var2;
        boolean z3;
        eur0 eur0Var2;
        int i4;
        int i5;
        wp2 wp2Var3;
        int i6;
        boolean z4;
        wp2 wp2Var4;
        ehr0 ehr0Var3;
        boolean z5;
        wp2 wp2Var5;
        aii0 v;
        ehr0 ehr0Var4;
        wp2 wp2Var6;
        int i7;
        int i8;
        int i9;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1350798532);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                ehr0Var2 = ehr0Var;
                if (btsVar.k(ehr0Var2)) {
                    i9 = 32;
                    i3 |= i9;
                }
            } else {
                ehr0Var2 = ehr0Var;
            }
            i9 = 16;
            i3 |= i9;
        } else {
            ehr0Var2 = ehr0Var;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z3 = z;
            i3 |= btsVar.a(z3) ? 256 : 128;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
                if ((i2 & 8) == 0) {
                    eur0Var2 = eur0Var;
                    if (btsVar.k(eur0Var2)) {
                        i8 = 2048;
                        i3 |= i8;
                    }
                } else {
                    eur0Var2 = eur0Var;
                }
                i8 = 1024;
                i3 |= i8;
            } else {
                eur0Var2 = eur0Var;
            }
            i4 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
            i5 = i2 & 32;
            if (i5 == 0) {
                i4 = 221184 | i3;
            } else if ((196608 & i) == 0) {
                i4 |= btsVar.k(wp2Var) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        wp2Var3 = wp2Var2;
                        if (btsVar.k(wp2Var3)) {
                            i7 = 1048576;
                            i4 |= i7;
                        }
                    } else {
                        wp2Var3 = wp2Var2;
                    }
                    i7 = 524288;
                    i4 |= i7;
                } else {
                    wp2Var3 = wp2Var2;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    z4 = z2;
                    i4 |= btsVar.a(z4) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                    if (btsVar.V(i4 & 1, (i4 & 4793491) == 4793490)) {
                        btsVar.Y();
                        wp2Var4 = wp2Var;
                        ehr0Var3 = ehr0Var2;
                        z5 = z3;
                        wp2Var5 = wp2Var3;
                    } else {
                        btsVar.a0();
                        if ((i & 1) == 0 || btsVar.C()) {
                            if ((i2 & 2) != 0) {
                                ehr0Var4 = cyk0.a;
                                i4 &= -113;
                            } else {
                                ehr0Var4 = ehr0Var2;
                            }
                            if (i10 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i4 &= -7169;
                                eur0Var2 = yx91.a;
                            }
                            wp2Var6 = i5 != 0 ? null : wp2Var;
                            if ((i2 & 64) != 0) {
                                i4 &= -3670017;
                                wp2Var3 = new up2(zp2.d);
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                        } else {
                            btsVar.Y();
                            if ((i2 & 2) != 0) {
                                i4 &= -113;
                            }
                            if ((i2 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i2 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            ehr0Var4 = ehr0Var2;
                            wp2Var6 = wp2Var;
                        }
                        btsVar.u();
                        boolean z6 = wp2Var6 == null;
                        long n = tje.n(wp2Var6 == null ? tp2.a : wp2Var6, btsVar);
                        boolean z7 = z3;
                        long n2 = tje.n(wp2Var3, btsVar);
                        if (z6) {
                            n = ldc.b(n, 0.08f, 0.0f, 0.0f, 0.0f, 14);
                        }
                        wp2 wp2Var7 = wp2Var3;
                        dur0 d = mcb1.d(n, n2, btsVar);
                        boolean k = btsVar.k(d);
                        Object Q = btsVar.Q();
                        o430 o430Var = did.a;
                        if (k || Q == o430Var) {
                            Q = new yzy(d);
                            btsVar.o0(Q);
                        }
                        btsVar.e0(-1037237373);
                        ltr0 ltr0Var = (ltr0) btsVar.m(q4z.a);
                        btsVar.t(false);
                        mtr0 e = jcb1.e(z4, eur0Var2, btsVar, ((i4 >> 21) & 14) | ((i4 >> 6) & 112));
                        wp2 wp2Var8 = wp2Var6;
                        f530 a = m4m0.a(f530Var, (yzy) Q, ehr0Var4, 4);
                        boolean k2 = btsVar.k(e) | btsVar.k(d);
                        Object Q2 = btsVar.Q();
                        if (k2 || Q2 == o430Var) {
                            Q2 = new mgu(27, e, d);
                            btsVar.o0(Q2);
                        }
                        f530 y = eja1.y(a, (tls) Q2);
                        boolean k3 = ((i4 & 896) == 256) | btsVar.k(d) | btsVar.k(ltr0Var);
                        Object Q3 = btsVar.Q();
                        if (k3 || Q3 == o430Var) {
                            Q3 = new rx3(z7, d, ltr0Var, 7);
                            btsVar.o0(Q3);
                        }
                        pi6.a(bb1.g(y, (tls) Q3), btsVar, 0);
                        boolean k4 = btsVar.k(ltr0Var);
                        Object Q4 = btsVar.Q();
                        if (k4 || Q4 == o430Var) {
                            Q4 = new LoadingKt$Loading$3$1(ltr0Var, null);
                            btsVar.o0(Q4);
                        }
                        zpn.e(btsVar, (wls) Q4, ltr0Var);
                        ehr0Var3 = ehr0Var4;
                        wp2Var5 = wp2Var7;
                        z5 = z7;
                        wp2Var4 = wp2Var8;
                    }
                    eur0 eur0Var3 = eur0Var2;
                    boolean z8 = z4;
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new up5(f530Var, ehr0Var3, z5, eur0Var3, wp2Var4, wp2Var5, z8, i, i2);
                        return;
                    }
                    return;
                }
                z4 = z2;
                if (btsVar.V(i4 & 1, (i4 & 4793491) == 4793490)) {
                }
                eur0 eur0Var32 = eur0Var2;
                boolean z82 = z4;
                v = btsVar.v();
                if (v == null) {
                }
            }
            if ((1572864 & i) == 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            z4 = z2;
            if (btsVar.V(i4 & 1, (i4 & 4793491) == 4793490)) {
            }
            eur0 eur0Var322 = eur0Var2;
            boolean z822 = z4;
            v = btsVar.v();
            if (v == null) {
            }
        }
        z3 = z;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
        }
        i4 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        z4 = z2;
        if (btsVar.V(i4 & 1, (i4 & 4793491) == 4793490)) {
        }
        eur0 eur0Var3222 = eur0Var2;
        boolean z8222 = z4;
        v = btsVar.v();
        if (v == null) {
        }
    }
}
