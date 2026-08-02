package com.yandex.go.chargers.surge.info;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.aii0;
import defpackage.an91;
import defpackage.bts;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.d17;
import defpackage.dbb1;
import defpackage.did;
import defpackage.dmw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fv9;
import defpackage.gwa;
import defpackage.hbb1;
import defpackage.hh8;
import defpackage.hhb1;
import defpackage.i9a;
import defpackage.i9a1;
import defpackage.igr0;
import defpackage.j9a;
import defpackage.khl0;
import defpackage.l0;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m3u0;
import defpackage.m5d;
import defpackage.mja1;
import defpackage.ohd;
import defpackage.oip0;
import defpackage.pw91;
import defpackage.qgy;
import defpackage.qic;
import defpackage.qje;
import defpackage.qk30;
import defpackage.r1b0;
import defpackage.scc;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.to5;
import defpackage.tse0;
import defpackage.v0b1;
import defpackage.vfc;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.xva;
import defpackage.xya1;
import defpackage.ydb1;
import defpackage.yrl;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes12.dex */
public abstract class d {
    public static final void a(gwa gwaVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1645668334);
        int i2 = i | (btsVar.k(gwaVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            oip0 o = pw91.o(btsVar);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ChargersSurgeInfoScreenKt$ChargersSurgeInfoScreen$1$1(tlsVar, gwaVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar, 0, 0, 8191);
            androidx.compose.runtime.internal.a S = wwg.S(1875641698, true, new qk30(17, gwaVar, tlsVar, o), btsVar);
            androidx.compose.runtime.internal.a S2 = wwg.S(-554128242, true, new l0(11, o, gwaVar), btsVar);
            btsVar = btsVar;
            com.yandex.go.design.compose.modal.bottomsheet.c.a(null, a, null, false, false, null, null, null, null, null, S, S2, btsVar, 0, 54, 1021);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(gwaVar, tlsVar, i, 9);
        }
    }

    public static final void b(final xva xvaVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2014251367);
        int i2 = (btsVar.k(xvaVar) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            ydb1.a(null, wwg.S(-894910851, true, new zls() { // from class: bwa
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    xva xvaVar2 = xvaVar;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                uo5 uo5Var = x4c.y;
                                f530 m = ljs0.m(c530.a, 56.0f);
                                z910 d = pi6.d(uo5Var, false);
                                int hashCode = Long.hashCode(btsVar2.T);
                                r1b0 o = btsVar2.o();
                                f530 d2 = b.d(btsVar2, m);
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
                                qje.W(btsVar2, d.f, d);
                                qje.W(btsVar2, d.e, o);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d2);
                                v0b1.a(mja1.a(xvaVar2.a, new jfv(AppColor$Palette.Text), 4), null, null, null, null, null, null, null, 0.0f, 0, btsVar2, 0, 1022);
                                btsVar2.t(true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                i43 i43Var = new i43(1.0f, false, new m6(8, x4c.E));
                                f530 o2 = an91.o(c530.a, 0.0f, 8.0f, 12.0f, 8.0f, 1);
                                sic a = qic.a(i43Var, x4c.G, btsVar3, 6);
                                int hashCode2 = Long.hashCode(btsVar3.T);
                                r1b0 o3 = btsVar3.o();
                                f530 d3 = b.d(btsVar3, o2);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar2);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, a);
                                qje.W(btsVar3, d.e, o3);
                                qje.W(btsVar3, d.g, Integer.valueOf(hashCode2));
                                qje.M(btsVar3, d.h);
                                qje.W(btsVar3, d.d, d3);
                                if (xvaVar2.b.length() > 0) {
                                    btsVar3.e0(-34306969);
                                    qgy.b(xvaVar2.b, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar3, 0, 0, 16382);
                                    btsVar3.t(false);
                                } else {
                                    btsVar3.e0(-34263724);
                                    btsVar3.t(false);
                                }
                                CharSequence charSequence = xvaVar2.c;
                                if (charSequence == null || charSequence.length() <= 0) {
                                    btsVar3.e0(-34166508);
                                    btsVar3.t(false);
                                } else {
                                    btsVar3.e0(-34212636);
                                    qgy.b(xvaVar2.c, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar3, 0, 0, 16382);
                                    btsVar3.t(false);
                                }
                                btsVar3.t(true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), wwg.S(-1528957192, true, new zls() { // from class: bwa
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    xva xvaVar2 = xvaVar;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                uo5 uo5Var = x4c.y;
                                f530 m = ljs0.m(c530.a, 56.0f);
                                z910 d = pi6.d(uo5Var, false);
                                int hashCode = Long.hashCode(btsVar2.T);
                                r1b0 o = btsVar2.o();
                                f530 d2 = b.d(btsVar2, m);
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
                                qje.W(btsVar2, d.f, d);
                                qje.W(btsVar2, d.e, o);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d2);
                                v0b1.a(mja1.a(xvaVar2.a, new jfv(AppColor$Palette.Text), 4), null, null, null, null, null, null, null, 0.0f, 0, btsVar2, 0, 1022);
                                btsVar2.t(true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                i43 i43Var = new i43(1.0f, false, new m6(8, x4c.E));
                                f530 o2 = an91.o(c530.a, 0.0f, 8.0f, 12.0f, 8.0f, 1);
                                sic a = qic.a(i43Var, x4c.G, btsVar3, 6);
                                int hashCode2 = Long.hashCode(btsVar3.T);
                                r1b0 o3 = btsVar3.o();
                                f530 d3 = b.d(btsVar3, o2);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar2);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, a);
                                qje.W(btsVar3, d.e, o3);
                                qje.W(btsVar3, d.g, Integer.valueOf(hashCode2));
                                qje.M(btsVar3, d.h);
                                qje.W(btsVar3, d.d, d3);
                                if (xvaVar2.b.length() > 0) {
                                    btsVar3.e0(-34306969);
                                    qgy.b(xvaVar2.b, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar3, 0, 0, 16382);
                                    btsVar3.t(false);
                                } else {
                                    btsVar3.e0(-34263724);
                                    btsVar3.t(false);
                                }
                                CharSequence charSequence = xvaVar2.c;
                                if (charSequence == null || charSequence.length() <= 0) {
                                    btsVar3.e0(-34166508);
                                    btsVar3.t(false);
                                } else {
                                    btsVar3.e0(-34212636);
                                    qgy.b(xvaVar2.c, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar3, 0, 0, 16382);
                                    btsVar3.t(false);
                                }
                                btsVar3.t(true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), null, null, null, null, false, btsVar, 432, 249);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hh8(xvaVar, i, 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final void c(gwa gwaVar, fid fidVar, int i) {
        bts btsVar;
        Throwable th;
        boolean z;
        c530 c530Var;
        c530 c530Var2;
        bts btsVar2;
        ?? r1;
        bts btsVar3;
        c530 c530Var3;
        bts btsVar4 = (bts) fidVar;
        btsVar4.g0(105954797);
        int i2 = i | (btsVar4.k(gwaVar) ? 4 : 2);
        if (btsVar4.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var4 = c530.a;
            f530 c = bzk0.c(ljs0.c(c530Var4, 1.0f), AppColor$Palette.Background, cyk0.e(0.0f, 0.0f, 24.0f, 24.0f, 3));
            sic a = qic.a(lr20.c, x4c.G, btsVar4, 0);
            int hashCode = Long.hashCode(btsVar4.T);
            r1b0 o = btsVar4.o();
            f530 d = androidx.compose.ui.b.d(btsVar4, c);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (btsVar4.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar4.i0();
            if (btsVar4.S) {
                btsVar4.n(slsVar);
            } else {
                btsVar4.r0();
            }
            qje.W(btsVar4, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar4, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar4, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar4, androidx.compose.ui.node.d.h);
            qje.W(btsVar4, androidx.compose.ui.node.d.d, d);
            String str = gwaVar.b;
            if (str == null) {
                btsVar4.e0(-766138148);
                btsVar4.t(false);
                z = false;
                c530Var = c530Var4;
                th = null;
            } else {
                btsVar4.e0(-766138147);
                th = null;
                z = false;
                c530Var = c530Var4;
                v0b1.a(mja1.a(str, null, 6), an91.o(c530Var4, 10.0f, 10.0f, 0.0f, 8.0f, 4), null, null, null, null, null, null, 0.0f, 0, btsVar4, 0, 1020);
                btsVar4.t(false);
            }
            if (gwaVar.c.length() > 0) {
                btsVar4.e0(-765937918);
                c530Var2 = c530Var;
                boolean z2 = z;
                qgy.b(gwaVar.c, null, an91.o(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 16.0f, 12.0f, 2), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.d(btsVar4).e.d, null, btsVar4, 384, 0, 12282);
                bts btsVar5 = btsVar4;
                btsVar5.t(z2);
                r1 = z2;
                btsVar2 = btsVar5;
            } else {
                c530Var2 = c530Var;
                boolean z3 = z;
                btsVar4.e0(-765725537);
                btsVar4.t(z3);
                r1 = z3;
                btsVar2 = btsVar4;
            }
            CharSequence charSequence = gwaVar.d;
            if (charSequence == null || charSequence.length() <= 0) {
                btsVar2.e0(-765499361);
                btsVar2.t(r1);
                btsVar3 = btsVar2;
            } else {
                btsVar2.e0(-765670419);
                c530 c530Var5 = c530Var2;
                c530Var2 = c530Var5;
                fid fidVar2 = btsVar2;
                qgy.b(gwaVar.d, null, an91.o(ljs0.c(c530Var5, 1.0f), 16.0f, 0.0f, 16.0f, 16.0f, 2), null, 0L, 0L, null, 0L, 0, 0, 0, null, null, fidVar2, 384, 0, 16378);
                bts btsVar6 = fidVar2;
                btsVar6.t(r1);
                btsVar3 = btsVar6;
            }
            btsVar3.e0(-1271618701);
            int i3 = r1;
            for (Object obj : gwaVar.e) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw th;
                }
                xva xvaVar = (xva) obj;
                if (i3 > 0) {
                    btsVar3.e0(-334903276);
                    c530Var3 = c530Var2;
                    yrl.b(6, 6, btsVar3, an91.o(c530Var3, 56.0f, 0.0f, 16.0f, 0.0f, 10));
                    btsVar3.t(r1);
                } else {
                    c530Var3 = c530Var2;
                    btsVar3.e0(-334819669);
                    btsVar3.t(r1);
                }
                b(xvaVar, btsVar3, r1);
                i3 = i4;
                c530Var2 = c530Var3;
            }
            btsVar3.t(r1);
            btsVar3.t(true);
            btsVar = btsVar3;
        } else {
            btsVar4.Y();
            btsVar = btsVar4;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hh8(gwaVar, i, 26);
        }
    }

    public static final void d(gwa gwaVar, tls tlsVar, oip0 oip0Var, fid fidVar, int i) {
        int i2;
        c530 c530Var;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-842439186);
        dmw0 dmw0Var = btsVar.a;
        int i3 = i | (btsVar.k(gwaVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.k(oip0Var) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            igr0 c = dbb1.c(btsVar);
            m3u0 c2 = hhb1.c(oip0Var, btsVar);
            c530 c530Var2 = c530.a;
            f530 d = i9a1.d(bzk0.c(ljs0.c(hbb1.c(c530Var2, c, false, 0.0f, c2, 6), 1.0f), AppColor$Palette.Background, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)));
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, d);
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
            qje.W(btsVar, wlsVar4, d2);
            if (gwaVar.f.length() <= 0 && gwaVar.g.length() <= 0) {
                i2 = i3;
                c530Var = c530Var2;
                z = false;
                tse0.s(btsVar, 1281321300, c530Var, 8.0f, btsVar);
                btsVar.t(false);
            } else {
                btsVar.e0(1280638866);
                to5 to5Var = x4c.E;
                f530 m = an91.m(ljs0.b(ljs0.c(c530Var2, 1.0f), 0.0f, 40.0f, 1), 16.0f, 0.0f, 2);
                lhl0 a2 = khl0.a(lr20.a, to5Var, btsVar, 48);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d3 = androidx.compose.ui.b.d(btsVar, m);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, a2);
                qje.W(btsVar, wlsVar2, o2);
                vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
                qje.W(btsVar, wlsVar4, d3);
                i2 = i3;
                c530Var = c530Var2;
                qgy.b(gwaVar.f, null, new x2y(1.0f, true), null, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar).g.a, null, btsVar, 805306368, 6, 10746);
                qgy.b(gwaVar.g, null, ljs0.w(c530Var, 3), null, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar).h.a, null, btsVar, 805306752, 6, 10746);
                btsVar = btsVar;
                btsVar.t(true);
                z = false;
                btsVar.t(false);
            }
            ButtonStyle buttonStyle = ButtonStyle.Main;
            f530 o3 = an91.o(ljs0.c(c530Var, 1.0f), 8.0f, 0.0f, 8.0f, 8.0f, 2);
            boolean z2 = (i2 & 112) == 32 ? true : z;
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new fv9(14, tlsVar);
                btsVar.o0(Q);
            }
            m5d.a.getClass();
            d17.c(o3, false, null, buttonStyle, null, (sls) Q, m5d.b, btsVar, 1575942, 22);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(gwaVar, tlsVar, oip0Var, i, 6);
        }
    }
}
