package com.yandex.go.chargers.subscription.presentation.landing;

import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.aii0;
import defpackage.an91;
import defpackage.bms;
import defpackage.bts;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fta;
import defpackage.gta;
import defpackage.i9a;
import defpackage.j5d;
import defpackage.j690;
import defpackage.jg0;
import defpackage.jl40;
import defpackage.jva;
import defpackage.khl0;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.mhe;
import defpackage.mr1;
import defpackage.my8;
import defpackage.n8a;
import defpackage.o430;
import defpackage.od9;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.ooc;
import defpackage.ota;
import defpackage.ovi0;
import defpackage.pa31;
import defpackage.pi6;
import defpackage.pta;
import defpackage.qgy;
import defpackage.qha;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.scc;
import defpackage.sic;
import defpackage.sls;
import defpackage.sn1;
import defpackage.sp5;
import defpackage.tls;
import defpackage.ts;
import defpackage.un1;
import defpackage.unr0;
import defpackage.v0b1;
import defpackage.vfc;
import defpackage.vta;
import defpackage.wg6;
import defpackage.wkb0;
import defpackage.wls;
import defpackage.wta;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.xta;
import defpackage.ydb1;
import defpackage.yn91;
import defpackage.yta;
import defpackage.z4;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes11.dex */
public abstract class c {
    public static final void a(gta gtaVar, tls tlsVar, boolean z, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1906898727);
        int i2 = (btsVar.k(gtaVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.a(z) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 m = an91.m(c530.a, 16.0f, 0.0f, 2);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            h(gtaVar, btsVar, i2 & 14);
            g(gtaVar.c, btsVar, 0);
            f(gtaVar.d, btsVar, 0);
            e(i2 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND, btsVar, tlsVar, gtaVar.e, z);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(gtaVar, tlsVar, z, i, 3);
        }
    }

    public static final void b(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1195505985);
        dmw0 dmw0Var = btsVar.a;
        if (btsVar.V(i & 1, i != 0)) {
            c530 c530Var = c530.a;
            f530 n = an91.n(c530Var, 16.0f, 8.0f, 16.0f, 50.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, n);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 c = ljs0.c(c530Var, 1.0f);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, c);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            com.yandex.go.design.compose.loading.b.a(ljs0.e(new x2y(1.0f, true), 16.0f).k(new pa31(x4c.E)), cyk0.c(100.0f), false, null, null, null, false, btsVar, 0, 252);
            f530 o3 = an91.o(c530Var, 8.0f, 8.0f, 0.0f, 8.0f, 4);
            z910 d3 = pi6.d(x4c.b, false);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d4 = androidx.compose.ui.b.d(btsVar, o3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d3);
            qje.W(btsVar, wlsVar2, o4);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d4);
            d(6, 0, btsVar, ljs0.m(c530Var, 40.0f));
            btsVar.t(true);
            btsVar.t(true);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530Var, 1.0f), 218.0f), cyk0.c(24.0f), false, null, null, null, false, btsVar, 6, 252);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530Var, 1.0f), 72.0f), cyk0.c(24.0f), false, null, null, null, false, btsVar, 6, 252);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qha(i, 7);
        }
    }

    public static final void c(final yta ytaVar, final tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2093474438);
        int i2 = i | (btsVar.k(ytaVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar, 0, 0, 8191);
            androidx.compose.runtime.internal.a S = wwg.S(1670118259, true, new sp5(17, a, tlsVar), btsVar);
            androidx.compose.runtime.internal.a S2 = wwg.S(682082790, true, new bms() { // from class: com.yandex.go.chargers.subscription.presentation.landing.b
                @Override // defpackage.bms
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    j690 j690Var = (j690) obj2;
                    fid fidVar2 = (fid) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 48) == 0) {
                        intValue |= ((bts) fidVar2).k(j690Var) ? 32 : 16;
                    }
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 145) != 144)) {
                        f530 d = ooc.d(an91.j(c530.a, j690Var), null, 3);
                        z910 d2 = pi6.d(x4c.b, false);
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d3 = androidx.compose.ui.b.d(btsVar2, d);
                        ohd.G1.getClass();
                        sls slsVar = androidx.compose.ui.node.d.b;
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
                        qje.W(btsVar2, androidx.compose.ui.node.d.f, d2);
                        qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
                        qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                        qje.M(btsVar2, androidx.compose.ui.node.d.h);
                        qje.W(btsVar2, androidx.compose.ui.node.d.d, d3);
                        xta xtaVar = xta.a;
                        yta ytaVar2 = yta.this;
                        if (jl40.l(ytaVar2, xtaVar)) {
                            btsVar2.e0(685886780);
                            c.b(btsVar2, 0);
                            btsVar2.t(false);
                        } else {
                            boolean z = ytaVar2 instanceof vta;
                            tls tlsVar2 = tlsVar;
                            if (z) {
                                btsVar2.e0(685969643);
                                vta vtaVar = (vta) ytaVar2;
                                c.a(vtaVar.a, tlsVar2, vtaVar.b, btsVar2, 0);
                                btsVar2.t(false);
                            } else {
                                if (!(ytaVar2 instanceof wta)) {
                                    throw unr0.y(-2056086502, btsVar2, false);
                                }
                                btsVar2.e0(686098634);
                                boolean k = btsVar2.k(tlsVar2) | btsVar2.k(ytaVar2);
                                Object Q = btsVar2.Q();
                                if (k || Q == did.a) {
                                    Q = new ChargersSubscriptionLandingScreenKt$ChargersSubscriptionLandingScreen$2$1$1$1(tlsVar2, ytaVar2, null);
                                    btsVar2.o0(Q);
                                }
                                zpn.e(btsVar2, (wls) Q, ytaVar2);
                                btsVar2.t(false);
                            }
                        }
                        btsVar2.t(true);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar);
            btsVar = btsVar;
            com.yandex.go.design.compose.modal.bottomsheet.c.a(null, a, null, false, false, null, null, null, S, null, null, S2, btsVar, 100663296, 48, 1789);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ChargersSubscriptionLandingScreenKt$ChargersSubscriptionLandingScreen$3$1(tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(ytaVar, tlsVar, i, 7);
        }
    }

    public static final void d(int i, int i2, fid fidVar, f530 f530Var) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-271403083);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = 0;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            com.yandex.go.design.compose.loading.b.a(f530Var.k(ljs0.c), cyk0.a, false, null, null, null, false, btsVar, 0, 252);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new pta(f530Var, i, i2, i5);
        }
    }

    public static final void e(int i, fid fidVar, tls tlsVar, List list, boolean z) {
        int i2;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-947901451);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = androidx.compose.ui.b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 c = ljs0.c(c530Var, 1.0f);
            boolean c2 = btsVar.c(2) | btsVar.b(4.0f) | btsVar.a(false);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (c2 || Q == o430Var) {
                Q = new jg0(12);
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, c);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, z910Var);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d2);
            btsVar.e0(1258059759);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fta ftaVar = (fta) it.next();
                boolean z3 = !z;
                boolean k = btsVar.k(ftaVar);
                Object Q2 = btsVar.Q();
                if (k || Q2 == o430Var) {
                    Q2 = new od9(15, ftaVar);
                    btsVar.o0(Q2);
                }
                f530 b = fnq0.b(c530Var, false, (tls) Q2);
                boolean k2 = btsVar.k(ftaVar) | ((i3 & 112) == 32);
                Object Q3 = btsVar.Q();
                if (k2 || Q3 == o430Var) {
                    Q3 = new n8a(8, tlsVar, ftaVar);
                    btsVar.o0(Q3);
                }
                yn91.f(b, z3, null, null, (sls) Q3, wwg.S(614054833, true, new my8(ftaVar, z, 6), btsVar), btsVar, ImageMetadata.EDGE_MODE);
                c530Var = c530Var;
            }
            z2 = z;
            btsVar.t(false);
            btsVar.t(true);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            btsVar.t(true);
        } else {
            z2 = z;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ts(list, tlsVar, z2, i, 1);
        }
    }

    public static final void f(CharSequence charSequence, fid fidVar, int i) {
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-53345526);
        int i2 = i | (btsVar.k(charSequence) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var2 = c530.a;
            f530 d = androidx.compose.ui.b.d(btsVar, c530Var2);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            if (charSequence == null) {
                btsVar.e0(1131068002);
                btsVar.t(false);
                c530Var = c530Var2;
            } else {
                btsVar.e0(1131068003);
                c530Var = c530Var2;
                qgy.b(charSequence, null, an91.o(c530Var2, 0.0f, 14.0f, 0.0f, 0.0f, 13), null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar, 384, 0, 16378);
                btsVar = btsVar;
                btsVar.t(false);
            }
            ly3.B(c530Var, 14.0f, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, 7, charSequence);
        }
    }

    public static final void g(List list, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-176915194);
        int i2 = 4;
        int i3 = (btsVar.k(list) ? 4 : 2) | i;
        int i4 = 0;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            f530 c = bzk0.c(c530.a, AppColor$Palette.BgMinor, cyk0.c(24.0f));
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            btsVar.e0(1405307543);
            int i5 = 0;
            for (Object obj : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    scc.m();
                    throw null;
                }
                jva jvaVar = (jva) obj;
                ydb1.a(null, wwg.S(1699982516, true, new ota(i4, jvaVar), btsVar), wwg.S(-1412561895, true, new wkb0(jvaVar, i5, list), btsVar), null, null, null, null, false, btsVar, 432, 249);
                i5 = i6;
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sn1(i, i2, list);
        }
    }

    public static final void h(gta gtaVar, fid fidVar, int i) {
        int i2;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1173352371);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(gtaVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = androidx.compose.ui.b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 m = an91.m(ljs0.c(c530Var, 1.0f), 0.0f, 16.0f, 1);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, m);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            qgy.b(gtaVar.a, null, new x2y(1.0f, true).k(new pa31(x4c.E)), null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar, 0, 0, 16378);
            btsVar = btsVar;
            ovi0 ovi0Var = gtaVar.b;
            if (ovi0Var == null) {
                btsVar.e0(-1839475393);
                btsVar.t(false);
                z = true;
            } else {
                btsVar.e0(-1839475392);
                f530 m2 = ljs0.m(an91.o(c530Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 40.0f);
                z910 d3 = pi6.d(x4c.b, false);
                int hashCode3 = Long.hashCode(btsVar.T);
                r1b0 o3 = btsVar.o();
                f530 d4 = androidx.compose.ui.b.d(btsVar, m2);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, d3);
                qje.W(btsVar, wlsVar2, o3);
                vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar);
                qje.W(btsVar, wlsVar4, d4);
                f530 m3 = ljs0.m(c530Var, 40.0f);
                j5d.a.getClass();
                v0b1.a(ovi0Var, m3, null, j5d.b, null, null, null, mhe.e, 0.0f, 0, btsVar, 12586032, 884);
                z = true;
                btsVar.t(true);
                btsVar.t(false);
            }
            btsVar.t(z);
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(gtaVar, i, 8);
        }
    }
}
