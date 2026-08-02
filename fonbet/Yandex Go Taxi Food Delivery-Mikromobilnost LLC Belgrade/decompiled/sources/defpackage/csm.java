package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.yx360.design.compose.atoms.DsButtonClose$Type;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class csm {
    public static final void a(boolean z, DsButtonClose$Type dsButtonClose$Type, sls slsVar, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1427989026);
        int i2 = (btsVar.a(z) ? 4 : 2) | i | (btsVar.c(dsButtonClose$Type.ordinal()) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128);
        if ((i2 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.e0(-2092073999);
            if (z) {
                btsVar.e0(1849434622);
                Object Q = btsVar.Q();
                if (Q == did.a) {
                    Q = new teb(20);
                    btsVar.o0(Q);
                }
                btsVar.t(false);
                f530Var2 = fnq0.a(f530Var, (tls) Q);
            } else {
                f530Var2 = f530Var;
            }
            btsVar.t(false);
            ho91.a(slsVar, dsButtonClose$Type, f530Var2, btsVar, ((i2 >> 6) & 14) | (i2 & 112), 0);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(z, dsButtonClose$Type, slsVar, f530Var, i, 7);
        }
    }

    public static final void b(boolean z, String str, String str2, zrm zrmVar, wls wlsVar, fid fidVar, int i) {
        int i2;
        String str3;
        wls wlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-133630567);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str2;
            i2 |= btsVar.k(str3) ? 256 : 128;
        } else {
            str3 = str2;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(zrmVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            wlsVar2 = wlsVar;
            i2 |= btsVar.e(wlsVar2) ? 16384 : 8192;
        } else {
            wlsVar2 = wlsVar;
        }
        if ((i2 & 9363) == 9362 && btsVar.E()) {
            btsVar.Y();
        } else {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
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
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            qje.W(btsVar, d.d, d2);
            boolean z2 = btsVar.m(j.n) == LayoutDirection.Rtl;
            btsVar.e0(-1224400529);
            boolean a = ((i2 & HProv.ALG_CLASS_ALL) == 16384) | ((i2 & 14) == 4) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | btsVar.a(z2);
            Object Q = btsVar.Q();
            if (a || Q == did.a) {
                qwa qwaVar = new qwa(z2, str, str3, zrmVar, z, wlsVar2);
                btsVar.o0(qwaVar);
                Q = qwaVar;
            }
            btsVar.t(false);
            e.a(c530Var, (wls) Q, btsVar, 6, 0);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ym1(i, 8, (cms) wlsVar, (Object) str, (Object) str2, (Object) zrmVar, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(boolean z, f530 f530Var, String str, String str2, zrm zrmVar, wls wlsVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        String str3;
        int i5;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1020112656);
        if ((i & 6) == 0) {
            i3 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str3 = str;
                i3 |= btsVar.k(str3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    str4 = str2;
                    i3 |= btsVar.k(str4) ? 2048 : 1024;
                    if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        i3 |= btsVar.k(zrmVar) ? 16384 : 8192;
                    }
                    if ((196608 & i) == 0) {
                        i3 |= btsVar.e(wlsVar) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !btsVar.E()) {
                        c530 c530Var = c530.a;
                        f530 f530Var4 = i6 == 0 ? c530Var : f530Var2;
                        if (i4 != 0) {
                            str3 = null;
                        }
                        if (i5 != 0) {
                            str4 = null;
                        }
                        f530 c = ljs0.c(f530Var4, 1.0f);
                        qnm qnmVar = qnm.a;
                        long a = qnm.c(btsVar).a();
                        qnm.e.getClass();
                        f530 b = m4m0.b(c, a, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12));
                        qnm.d.getClass();
                        f530 l = an91.l(b, 16.0f, 8.0f);
                        sic a2 = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 0);
                        int hashCode = Long.hashCode(btsVar.T);
                        r1b0 o = btsVar.o();
                        f530 d = b.d(btsVar, l);
                        ohd.G1.getClass();
                        sls slsVar = d.b;
                        if (btsVar.a != null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar.i0();
                        if (btsVar.S) {
                            btsVar.n(slsVar);
                        } else {
                            btsVar.r0();
                        }
                        qje.W(btsVar, d.f, a2);
                        qje.W(btsVar, d.e, o);
                        wls wlsVar2 = d.g;
                        if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                            b64.z(hashCode, btsVar, hashCode, wlsVar2);
                        }
                        qje.W(btsVar, d.d, d);
                        if (z) {
                            btsVar.e0(-1780018384);
                            d(new ypu(x4c.H), btsVar, 0);
                            btsVar.t(false);
                        } else {
                            btsVar.e0(-1779926624);
                            oeb1.c(btsVar, c530Var);
                            btsVar.t(false);
                        }
                        btsVar.e0(2020794820);
                        if (str3 == null && str4 == null && zrmVar == null && wlsVar == null) {
                            str5 = str3;
                            str6 = str4;
                        } else {
                            int i7 = i3 & 14;
                            int i8 = i3 >> 3;
                            int i9 = i7 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (i8 & HProv.ALG_CLASS_ALL);
                            str5 = str3;
                            str6 = str4;
                            b(z, str5, str6, zrmVar, wlsVar, btsVar, i9);
                        }
                        btsVar.t(false);
                        btsVar.t(true);
                        str7 = str5;
                        str8 = str6;
                        f530Var3 = f530Var4;
                    } else {
                        btsVar.Y();
                        f530Var3 = f530Var2;
                        str7 = str3;
                        str8 = str4;
                    }
                    aii0 v = btsVar.v();
                    if (v != null) {
                        v.d = new rpm(z, f530Var3, str7, str8, zrmVar, wlsVar, i, i2);
                        return;
                    }
                    return;
                }
                str4 = str2;
                if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                }
                if ((196608 & i) == 0) {
                }
                if ((74899 & i3) == 74898) {
                }
                c530 c530Var2 = c530.a;
                if (i6 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                f530 c2 = ljs0.c(f530Var4, 1.0f);
                qnm qnmVar2 = qnm.a;
                long a3 = qnm.c(btsVar).a();
                qnm.e.getClass();
                f530 b2 = m4m0.b(c2, a3, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12));
                qnm.d.getClass();
                f530 l2 = an91.l(b2, 16.0f, 8.0f);
                sic a22 = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 0);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d2 = b.d(btsVar, l2);
                ohd.G1.getClass();
                sls slsVar2 = d.b;
                if (btsVar.a != null) {
                }
            }
            str3 = str;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str4 = str2;
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            c530 c530Var22 = c530.a;
            if (i6 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            f530 c22 = ljs0.c(f530Var4, 1.0f);
            qnm qnmVar22 = qnm.a;
            long a32 = qnm.c(btsVar).a();
            qnm.e.getClass();
            f530 b22 = m4m0.b(c22, a32, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12));
            qnm.d.getClass();
            f530 l22 = an91.l(b22, 16.0f, 8.0f);
            sic a222 = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 0);
            int hashCode22 = Long.hashCode(btsVar.T);
            r1b0 o22 = btsVar.o();
            f530 d22 = b.d(btsVar, l22);
            ohd.G1.getClass();
            sls slsVar22 = d.b;
            if (btsVar.a != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str3 = str;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str4 = str2;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        c530 c530Var222 = c530.a;
        if (i6 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        f530 c222 = ljs0.c(f530Var4, 1.0f);
        qnm qnmVar222 = qnm.a;
        long a322 = qnm.c(btsVar).a();
        qnm.e.getClass();
        f530 b222 = m4m0.b(c222, a322, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12));
        qnm.d.getClass();
        f530 l222 = an91.l(b222, 16.0f, 8.0f);
        sic a2222 = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 0);
        int hashCode222 = Long.hashCode(btsVar.T);
        r1b0 o222 = btsVar.o();
        f530 d222 = b.d(btsVar, l222);
        ohd.G1.getClass();
        sls slsVar222 = d.b;
        if (btsVar.a != null) {
        }
    }

    public static final void d(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1832857381);
        if ((((btsVar.k(f530Var) ? 4 : 2) | i) & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            qnm qnmVar = qnm.a;
            qnm.c.getClass();
            f530 n = ljs0.n(f530Var, 32.0f, 4.0f);
            long a0 = qnm.c(btsVar).a0();
            qnm.e.getClass();
            pi6.a(m4m0.b(n, a0, cyk0.c(1000.0f)), btsVar, 0);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, 17);
        }
    }

    public static final void e(int i, fid fidVar, f530 f530Var, String str, String str2) {
        bts btsVar;
        int i2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1017784274);
        int i3 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.k(str2) ? 32 : 16);
        if ((i3 & 147) == 146 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            sic a = qic.a(lr20.c, x4c.H, btsVar2, 48);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d);
            btsVar2.e0(1481169711);
            if (str == null || str.length() == 0) {
                btsVar = btsVar2;
                i2 = i3;
            } else {
                Integer num = (str2 == null || str2.length() == 0) ? 2 : null;
                int intValue = num != null ? num.intValue() : 1;
                qnm qnmVar = qnm.a;
                ety0 o2 = ltm.b(btsVar2).o(btsVar2);
                long g0 = qnm.c(btsVar2).g0();
                btsVar2.e0(1849434622);
                Object Q = btsVar2.Q();
                if (Q == did.a) {
                    Q = new urm(1);
                    btsVar2.o0(Q);
                }
                btsVar2.t(false);
                i2 = i3;
                vqy0.c(str, fnq0.b(c530.a, false, (tls) Q), g0, 0L, null, 0L, new sjy0(3), 0L, 2, false, intValue, 0, o2, btsVar2, i3 & 14, 384, 109560);
                btsVar = btsVar2;
            }
            btsVar.t(false);
            btsVar.e0(1481187385);
            if (str2 != null && str2.length() != 0) {
                qnm qnmVar2 = qnm.a;
                bts btsVar3 = btsVar;
                vqy0.c(str2, null, qnm.c(btsVar).h0(), 0L, null, 0L, null, 0L, 2, false, 1, 0, ltm.b(btsVar).c(btsVar), btsVar3, (i2 >> 3) & 14, 24960, 110586);
                btsVar = btsVar3;
            }
            btsVar.t(false);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ks6(str, str2, f530Var, i, 3);
        }
    }
}
