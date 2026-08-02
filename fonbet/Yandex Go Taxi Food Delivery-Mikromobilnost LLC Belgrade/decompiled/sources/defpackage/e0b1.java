package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class e0b1 {
    public static au2 a;

    public static final void a(final urm0 urm0Var, tls tlsVar, fid fidVar, int i) {
        tls tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1404224707);
        int i2 = i | (btsVar.k(urm0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        final int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 k = an91.k(c530Var, 8.0f);
            boolean b = btsVar.b(4.0f) | btsVar.a(false);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (b || Q == o430Var) {
                Q = new jg0(27);
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            boolean z = urm0Var.a;
            boolean z2 = !z;
            f530 b2 = ofb1.b(c530Var, z, null, 14);
            int i4 = i2 & 112;
            boolean z3 = i4 == 32;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new wzl0(6, tlsVar);
                btsVar.o0(Q2);
            }
            xlb1.a((sls) Q2, b2, z2, null, null, wwg.S(-1505235901, true, new zls() { // from class: nrm0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    urm0 urm0Var2 = urm0Var;
                    switch (i5) {
                        case 0:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                m9b1.a(ebp0Var, urm0Var2.f, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar2, intValue & 14, 0, 16382);
                                break;
                            }
                        default:
                            ebp0 ebp0Var2 = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var2) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                m9b1.a(ebp0Var2, urm0Var2.g, null, null, xya1.e(btsVar3).g.b, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 16374);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, null, null, btsVar, ImageMetadata.EDGE_MODE, 984);
            boolean z4 = urm0Var.a;
            boolean z5 = !z4;
            f530 b3 = ofb1.b(c530Var, z4, null, 14);
            boolean z6 = i4 == 32;
            Object Q3 = btsVar.Q();
            if (z6 || Q3 == o430Var) {
                tlsVar2 = tlsVar;
                Q3 = new wzl0(7, tlsVar2);
                btsVar.o0(Q3);
            } else {
                tlsVar2 = tlsVar;
            }
            final int i5 = 1;
            phb1.b((sls) Q3, b3, z5, null, null, wwg.S(-407865999, true, new zls() { // from class: nrm0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i52 = i5;
                    zy11 zy11Var = zy11.a;
                    urm0 urm0Var2 = urm0Var;
                    switch (i52) {
                        case 0:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                m9b1.a(ebp0Var, urm0Var2.f, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar2, intValue & 14, 0, 16382);
                                break;
                            }
                        default:
                            ebp0 ebp0Var2 = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var2) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                m9b1.a(ebp0Var2, urm0Var2.g, null, null, xya1.e(btsVar3).g.b, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 16374);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, null, null, btsVar, ImageMetadata.EDGE_MODE, 984);
            btsVar.t(true);
        } else {
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(urm0Var, tlsVar2, i, 17);
        }
    }

    public static final void b(urm0 urm0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1585546364);
        int i2 = (btsVar.k(urm0Var) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            for (final trm0 trm0Var : urm0Var.e) {
                ydb1.a(null, wwg.S(2140056008, true, new zls() { // from class: orm0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i5 = i3;
                        zy11 zy11Var = zy11.a;
                        trm0 trm0Var2 = trm0Var;
                        switch (i5) {
                            case 0:
                                ibp0 ibp0Var = (ibp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var, mja1.a(trm0Var2.c, null, 6), null, null, null, null, 0.0f, 0, null, btsVar2, intValue & 14, 510);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    m9b1.b(ebp0Var, trm0Var2.a, null, null, null, 0, 0, trm0Var2.b, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 32638);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), wwg.S(1636587395, true, new zls() { // from class: orm0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i5 = i4;
                        zy11 zy11Var = zy11.a;
                        trm0 trm0Var2 = trm0Var;
                        switch (i5) {
                            case 0:
                                ibp0 ibp0Var = (ibp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var, mja1.a(trm0Var2.c, null, 6), null, null, null, null, 0.0f, 0, null, btsVar2, intValue & 14, 510);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    m9b1.b(ebp0Var, trm0Var2.a, null, null, null, 0, 0, trm0Var2.b, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 32638);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), null, null, null, null, false, btsVar, 432, 249);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mrm0(urm0Var, i, 2);
        }
    }

    public static final void c(wbu wbuVar, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        a S;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1968094768);
        int i2 = (btsVar2.k(wbuVar) ? 4 : 2) | i | (btsVar2.e(slsVar) ? 32 : 16);
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            v4v v4vVar = wbuVar.c;
            a aVar = null;
            if (v4vVar == null) {
                btsVar2.e0(912783766);
                btsVar2.t(false);
                S = null;
            } else {
                btsVar2.e0(912783767);
                S = wwg.S(331666759, true, new mb(v4vVar, 11), btsVar2);
                btsVar2.t(false);
            }
            a S2 = wwg.S(1492602572, true, new bns(7, wbuVar), btsVar2);
            if (wbuVar.d == null) {
                btsVar2.e0(913252920);
                btsVar2.t(false);
            } else {
                btsVar2.e0(913252921);
                aVar = wwg.S(-1532101868, true, new lau(slsVar, wbuVar), btsVar2);
                btsVar2.t(false);
            }
            btsVar = btsVar2;
            web1.c(null, 0.0f, false, 0.0f, null, S, S2, null, null, aVar, null, null, false, btsVar, 1572864, 0, 7583);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lau(wbuVar, slsVar, i);
        }
    }

    public static final void d(urm0 urm0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1838409405);
        int i3 = i | (btsVar.k(urm0Var) ? 4 : 2);
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            f530 m = an91.m(c530.a, 16.0f, 0.0f, 2);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            i2 = 0;
            qgy.b(urm0Var.c, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.d(btsVar).e.d, null, btsVar, 0, 0, 12286);
            btsVar = btsVar;
            if (urm0Var.d.length() > 0) {
                btsVar.e0(-1124402074);
                qgy.b(urm0Var.d, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).g.a, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                btsVar.e0(-1124264465);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            i2 = 0;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mrm0(urm0Var, i, i2);
        }
    }

    public static final void e(urm0 urm0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2095430058);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(urm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new ut9(25, urm0Var, tlsVar), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(urm0Var, tlsVar, i, 26);
        }
    }

    public static final void f(urm0 urm0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1681657252);
        int i2 = (btsVar.k(urm0Var) ? 4 : 2) | i;
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else if (urm0Var.b.length() > 0) {
            btsVar.e0(1752778038);
            ovi0 a2 = mja1.a(urm0Var.b, null, 6);
            f530 l = ymb1.l(an91.o(ljs0.b(ljs0.c(c530.a, 1.0f), 0.0f, 132.0f, 1), 16.0f, 4.0f, 16.0f, 0.0f, 8), cyk0.c(16.0f));
            nbd.a.getClass();
            v0b1.a(a2, l, null, nbd.b, null, null, null, mhe.a, 0.0f, 0, btsVar, 12585984, 884);
            btsVar.t(false);
        } else {
            btsVar.e0(1753343230);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mrm0(urm0Var, i, 1);
        }
    }
}
