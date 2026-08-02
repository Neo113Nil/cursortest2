package com.yandex.go.scooters.passes.active.v3;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.scooters.passes.active.v3.c;
import defpackage.aii0;
import defpackage.an91;
import defpackage.aum0;
import defpackage.avm0;
import defpackage.bj6;
import defpackage.bts;
import defpackage.bum0;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.c8i0;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.dbb1;
import defpackage.did;
import defpackage.dum0;
import defpackage.ety0;
import defpackage.eum0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fum0;
import defpackage.gji0;
import defpackage.hbb1;
import defpackage.htm0;
import defpackage.i9a1;
import defpackage.jeb1;
import defpackage.jt1;
import defpackage.jtm0;
import defpackage.ka01;
import defpackage.lbb0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ls40;
import defpackage.na01;
import defpackage.oeb1;
import defpackage.ofb1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.oip0;
import defpackage.p1b1;
import defpackage.pdf0;
import defpackage.q6a1;
import defpackage.q791;
import defpackage.qeg0;
import defpackage.qgy;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.r1b0;
import defpackage.rly0;
import defpackage.rzo;
import defpackage.scc;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.t7l0;
import defpackage.tls;
import defpackage.tmm0;
import defpackage.tse0;
import defpackage.ulb1;
import defpackage.ut9;
import defpackage.utm0;
import defpackage.vnf0;
import defpackage.vtm0;
import defpackage.wls;
import defpackage.wtm0;
import defpackage.wwg;
import defpackage.wzl0;
import defpackage.x4c;
import defpackage.xtm0;
import defpackage.xya1;
import defpackage.y740;
import defpackage.ydb1;
import defpackage.ymb1;
import defpackage.yrl;
import defpackage.z3b1;
import defpackage.zls;
import defpackage.zpn;
import defpackage.ztm0;
import defpackage.zy11;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public abstract class c {
    public static final void a(bj6 bj6Var, fum0 fum0Var, tls tlsVar, oip0 oip0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1867655213);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(bj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(fum0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(oip0Var) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            jt1 jt1Var = x4c.B;
            c530 c530Var = c530.a;
            f530 k = an91.k(i9a1.d(ljs0.c(bzk0.c(hbb1.c(bj6Var.a(c530Var, jt1Var), dbb1.c(btsVar), false, 0.0f, p1b1.f(oip0Var, btsVar), 6), AppColor$Palette.BgFloating, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), 1.0f)), 8.0f);
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, k);
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
            int i3 = i2 >> 3;
            int i4 = i3 & 14;
            int i5 = i3 & HProv.PP_DELETE_SAVED_PASSWD;
            b(fum0Var, tlsVar, btsVar, i5);
            if (fum0Var.h != null) {
                tse0.s(btsVar, -711743102, c530Var, 4.0f, btsVar);
                h(fum0Var, fum0Var.h, tlsVar, btsVar, (i2 & 896) | i4);
                btsVar.t(false);
            } else {
                btsVar.e0(-711642197);
                btsVar.t(false);
            }
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            c(fum0Var, tlsVar, btsVar, i5);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0(bj6Var, fum0Var, tlsVar, oip0Var, i, 5);
        }
    }

    public static final void b(fum0 fum0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(959239894);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(fum0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = !fum0Var.b;
            f530 b = ofb1.b(ljs0.c(c530.a, 1.0f), fum0Var.b, null, 14);
            boolean z2 = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new wzl0(15, tlsVar);
                btsVar.o0(Q);
            }
            ulb1.a(b, z, null, (sls) Q, wwg.S(-2046100681, true, new htm0(fum0Var, 3), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 4);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jtm0(fum0Var, tlsVar, i, 2);
        }
    }

    public static final void c(fum0 fum0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        aii0 v;
        jtm0 jtm0Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-445510026);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(fum0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            vtm0 vtm0Var = fum0Var.i;
            if (vtm0Var == null) {
                v = btsVar2.v();
                if (v != null) {
                    jtm0Var = new jtm0(fum0Var, tlsVar, i, 0);
                    v.d = jtm0Var;
                }
                return;
            }
            String str = vtm0Var.a;
            ety0 ety0Var = xya1.e(btsVar2).i.a;
            AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
            boolean z = !fum0Var.b;
            boolean k = btsVar2.k(vtm0Var) | ((i2 & 112) == 32);
            Object Q = btsVar2.Q();
            int i3 = 3;
            if (k || Q == did.a) {
                Q = new tmm0(i3, tlsVar, vtm0Var);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            jeb1.f(str, q791.d(c530.a, z, null, null, (sls) Q, 14), appColor$Palette, 0L, 0L, rly0.c, new sjy0(3), 0L, 0, false, 0, 0, null, ety0Var, btsVar, 1573248, 0, 16184);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        v = btsVar.v();
        if (v != null) {
            jtm0Var = new jtm0(fum0Var, tlsVar, i, 1);
            v.d = jtm0Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x012b, code lost:
    
        if (r6 == defpackage.did.a) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(fum0 fum0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        Object obj;
        gji0 gji0Var = qke.q;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1314934502);
        int i2 = 2;
        int i3 = (btsVar2.k(fum0Var) ? 4 : 2) | i | (btsVar2.e(tlsVar) ? 32 : 16);
        int i4 = 0;
        if (btsVar2.V(i3 & 1, (i3 & 19) != 18)) {
            ydb1.a(null, null, wwg.S(1561841513, true, new htm0(fum0Var, i4), btsVar2), null, null, null, null, false, btsVar2, 384, 251);
            c530 c530Var = c530.a;
            f530 c = bzk0.c(ymb1.l(an91.m(c530Var, 16.0f, 0.0f, 2), cyk0.c(24.0f)), AppColor$Palette.BgMinor, gji0Var);
            final ?? r9 = 0;
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, c);
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
            qje.W(btsVar2, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, androidx.compose.ui.node.d.h);
            qje.W(btsVar2, androidx.compose.ui.node.d.d, d);
            xtm0 xtm0Var = fum0Var.e;
            boolean z = fum0Var.b;
            List list = xtm0Var.c;
            btsVar2.e0(991581500);
            int i5 = 0;
            for (Object obj2 : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    scc.m();
                    throw null;
                }
                final wtm0 wtm0Var = (wtm0) obj2;
                avm0 avm0Var = wtm0Var.a;
                f530 c2 = bzk0.c(ymb1.l(q6a1.c(c530Var, (avm0Var == null || !z) ? true : r9), cyk0.c(24.0f)), wtm0Var.d, gji0Var);
                boolean z2 = (z || avm0Var == null) ? r9 : true;
                int i7 = ((i3 & 112) == 32 ? 1 : r9) | (btsVar2.k(wtm0Var) ? 1 : 0);
                Object Q = btsVar2.Q();
                if (i7 == 0) {
                    obj = Q;
                }
                tmm0 tmm0Var = new tmm0(i2, tlsVar, wtm0Var);
                btsVar2.o0(tmm0Var);
                obj = tmm0Var;
                f530 d2 = q791.d(c2, z2, null, null, (sls) obj, 14);
                final int i8 = 1;
                boolean z3 = z;
                c530 c530Var2 = c530Var;
                List list2 = list;
                int i9 = i5;
                gji0 gji0Var2 = gji0Var;
                ydb1.a(d2, wwg.S(-623271508, true, new zls() { // from class: ktm0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i10 = r9;
                        zy11 zy11Var = zy11.a;
                        wtm0 wtm0Var2 = wtm0Var;
                        switch (i10) {
                            case 0:
                                String str = wtm0Var2.e;
                                ibp0 ibp0Var = (ibp0) obj3;
                                fid fidVar2 = (fid) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar2;
                                if (!btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else if (str != null && str.length() != 0) {
                                    btsVar3.e0(-737779668);
                                    tdb1.d(ibp0Var, mja1.a(str, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue & 14, 510);
                                    btsVar3.t(false);
                                    break;
                                } else {
                                    btsVar3.e0(-737823471);
                                    nnm.s(c530.a, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar3, false);
                                    break;
                                }
                                break;
                            default:
                                ebp0 ebp0Var = (ebp0) obj3;
                                fid fidVar3 = (fid) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar4 = (bts) fidVar3;
                                if (!btsVar4.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    m9b1.b(ebp0Var, wtm0Var2.b, null, null, null, 0, 0, wtm0Var2.c, null, null, 0, 0, null, btsVar4, intValue2 & 14, 0, 32638);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar2), wwg.S(1927586279, true, new zls() { // from class: ktm0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i10 = i8;
                        zy11 zy11Var = zy11.a;
                        wtm0 wtm0Var2 = wtm0Var;
                        switch (i10) {
                            case 0:
                                String str = wtm0Var2.e;
                                ibp0 ibp0Var = (ibp0) obj3;
                                fid fidVar2 = (fid) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar2;
                                if (!btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else if (str != null && str.length() != 0) {
                                    btsVar3.e0(-737779668);
                                    tdb1.d(ibp0Var, mja1.a(str, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue & 14, 510);
                                    btsVar3.t(false);
                                    break;
                                } else {
                                    btsVar3.e0(-737823471);
                                    nnm.s(c530.a, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar3, false);
                                    break;
                                }
                                break;
                            default:
                                ebp0 ebp0Var = (ebp0) obj3;
                                fid fidVar3 = (fid) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar4 = (bts) fidVar3;
                                if (!btsVar4.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    m9b1.b(ebp0Var, wtm0Var2.b, null, null, null, 0, 0, wtm0Var2.c, null, null, 0, 0, null, btsVar4, intValue2 & 14, 0, 32638);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar2), null, avm0Var != null ? na01.a : ka01.a, null, null, false, btsVar2, 432, 232);
                if (i9 < scc.f(list2)) {
                    btsVar2.e0(-1616564045);
                    c530Var = c530Var2;
                    yrl.b(6, 6, btsVar2, an91.o(c530Var, 56.0f, 0.0f, 0.0f, 4.0f, 6));
                    btsVar2.t(false);
                } else {
                    c530Var = c530Var2;
                    btsVar2.e0(-1616478516);
                    btsVar2.t(false);
                }
                r9 = 0;
                i5 = i6;
                z = z3;
                list = list2;
                gji0Var = gji0Var2;
                i2 = 2;
            }
            boolean z4 = r9;
            btsVar2.t(z4);
            btsVar2.t(true);
            if (fum0Var.f.length() > 0) {
                btsVar2.e0(1184539015);
                qgy.b(fum0Var.f, null, an91.n(c530Var, 16.0f, 8.0f, 16.0f, 4.0f), AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).h.a, null, btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 0, 12274);
                bts btsVar3 = btsVar2;
                btsVar3.t(z4);
                btsVar = btsVar3;
            } else {
                btsVar2.e0(1184759208);
                btsVar2.t(z4);
                btsVar = btsVar2;
            }
        } else {
            btsVar2.Y();
            btsVar = btsVar2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(fum0Var, tlsVar, i, 19);
        }
    }

    public static final void e(fum0 fum0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1387974776);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(fum0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new ut9(28, fum0Var, tlsVar), btsVar), btsVar, 3456, 3);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ScootersActivePassesV3ScreenKt$ScootersActivePassesV3Screen$2$1(tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jtm0(fum0Var, tlsVar, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [f530, qor] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    public static final void f(final fum0 fum0Var, final aum0 aum0Var, final tls tlsVar, fid fidVar, final int i) {
        aii0 aii0Var;
        wls wlsVar;
        fum0 fum0Var2 = fum0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(20025558);
        int i2 = 16;
        int i3 = i | (btsVar.k(fum0Var2) ? 4 : 2) | (btsVar.k(aum0Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        final boolean z = 0;
        final ?? r8 = 1;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            if (aum0Var != null) {
                List list = aum0Var.a;
                if (!list.isEmpty()) {
                    f530 c = bzk0.c(ymb1.l(an91.m(c530.a, 16.0f, 0.0f, 2), cyk0.c(24.0f)), AppColor$Palette.BgMinor, qke.q);
                    sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = androidx.compose.ui.b.d(btsVar, c);
                    ohd.G1.getClass();
                    sls slsVar = androidx.compose.ui.node.d.b;
                    Throwable th = null;
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
                    btsVar.e0(662147593);
                    int i4 = 0;
                    for (Object obj : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            Throwable th2 = th;
                            scc.m();
                            throw th2;
                        }
                        final ztm0 ztm0Var = (ztm0) obj;
                        ?? r10 = th;
                        int i6 = i4;
                        boolean z2 = z;
                        List list2 = list;
                        ydb1.a(null, wwg.S(-1221780986, r8, new zls() { // from class: ltm0
                            @Override // defpackage.zls
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                int i7 = z;
                                zy11 zy11Var = zy11.a;
                                ztm0 ztm0Var2 = ztm0Var;
                                switch (i7) {
                                    case 0:
                                        ibp0 ibp0Var = (ibp0) obj2;
                                        fid fidVar2 = (fid) obj3;
                                        int intValue = ((Integer) obj4).intValue();
                                        if ((intValue & 6) == 0) {
                                            intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                                        }
                                        bts btsVar2 = (bts) fidVar2;
                                        if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                            btsVar2.Y();
                                            break;
                                        } else {
                                            tdb1.d(ibp0Var, mja1.a(ztm0Var2.a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar2, intValue & 14, 510);
                                            break;
                                        }
                                    default:
                                        ebp0 ebp0Var = (ebp0) obj2;
                                        fid fidVar3 = (fid) obj3;
                                        int intValue2 = ((Integer) obj4).intValue();
                                        if ((intValue2 & 6) == 0) {
                                            intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                                        }
                                        bts btsVar3 = (bts) fidVar3;
                                        if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                            btsVar3.Y();
                                            break;
                                        } else {
                                            m9b1.b(ebp0Var, ztm0Var2.b, null, null, null, 0, 0, ztm0Var2.c, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 32638);
                                            break;
                                        }
                                }
                                return zy11Var;
                            }
                        }, btsVar), wwg.S(1329076801, r8, new zls() { // from class: ltm0
                            @Override // defpackage.zls
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                int i7 = r8;
                                zy11 zy11Var = zy11.a;
                                ztm0 ztm0Var2 = ztm0Var;
                                switch (i7) {
                                    case 0:
                                        ibp0 ibp0Var = (ibp0) obj2;
                                        fid fidVar2 = (fid) obj3;
                                        int intValue = ((Integer) obj4).intValue();
                                        if ((intValue & 6) == 0) {
                                            intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                                        }
                                        bts btsVar2 = (bts) fidVar2;
                                        if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                            btsVar2.Y();
                                            break;
                                        } else {
                                            tdb1.d(ibp0Var, mja1.a(ztm0Var2.a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar2, intValue & 14, 510);
                                            break;
                                        }
                                    default:
                                        ebp0 ebp0Var = (ebp0) obj2;
                                        fid fidVar3 = (fid) obj3;
                                        int intValue2 = ((Integer) obj4).intValue();
                                        if ((intValue2 & 6) == 0) {
                                            intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                                        }
                                        bts btsVar3 = (bts) fidVar3;
                                        if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                            btsVar3.Y();
                                            break;
                                        } else {
                                            m9b1.b(ebp0Var, ztm0Var2.b, null, null, null, 0, 0, ztm0Var2.c, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 32638);
                                            break;
                                        }
                                }
                                return zy11Var;
                            }
                        }, btsVar), null, wwg.S(-895298821, r8, new ls40(i2, ztm0Var, fum0Var2, tlsVar), btsVar), null, null, false, btsVar, 25008, 233);
                        if (i6 < scc.f(list2)) {
                            btsVar.e0(891617768);
                            yrl.e(r10, r10, btsVar, z2 ? 1 : 0, 7);
                            btsVar.t(z2);
                        } else {
                            btsVar.e0(891658130);
                            btsVar.t(z2);
                        }
                        r8 = 1;
                        i2 = 16;
                        th = r10;
                        z = z2 ? 1 : 0;
                        i4 = i5;
                        list = list2;
                        fum0Var2 = fum0Var;
                    }
                    btsVar.t(z);
                    btsVar.t(true);
                }
            }
            aii0Var = btsVar.v();
            if (aii0Var != null) {
                final int i7 = 1;
                wlsVar = new wls(fum0Var, aum0Var, tlsVar, i, i7) { // from class: itm0
                    public final /* synthetic */ int a;
                    public final /* synthetic */ fum0 b;
                    public final /* synthetic */ aum0 c;
                    public final /* synthetic */ tls w;

                    {
                        this.a = i7;
                    }

                    @Override // defpackage.wls
                    public final Object invoke(Object obj2, Object obj3) {
                        int i8 = this.a;
                        zy11 zy11Var = zy11.a;
                        tls tlsVar2 = this.w;
                        aum0 aum0Var2 = this.c;
                        fum0 fum0Var3 = this.b;
                        fid fidVar2 = (fid) obj2;
                        ((Integer) obj3).getClass();
                        switch (i8) {
                            case 0:
                                c.f(fum0Var3, aum0Var2, tlsVar2, fidVar2, vng.O(1));
                                break;
                            default:
                                c.f(fum0Var3, aum0Var2, tlsVar2, fidVar2, vng.O(1));
                                break;
                        }
                        return zy11Var;
                    }
                };
                aii0Var.d = wlsVar;
            }
            return;
        }
        btsVar.Y();
        aii0Var = btsVar.v();
        if (aii0Var != null) {
            final int i8 = 0;
            wlsVar = new wls(fum0Var, aum0Var, tlsVar, i, i8) { // from class: itm0
                public final /* synthetic */ int a;
                public final /* synthetic */ fum0 b;
                public final /* synthetic */ aum0 c;
                public final /* synthetic */ tls w;

                {
                    this.a = i8;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj3) {
                    int i82 = this.a;
                    zy11 zy11Var = zy11.a;
                    tls tlsVar2 = this.w;
                    aum0 aum0Var2 = this.c;
                    fum0 fum0Var3 = this.b;
                    fid fidVar2 = (fid) obj2;
                    ((Integer) obj3).getClass();
                    switch (i82) {
                        case 0:
                            c.f(fum0Var3, aum0Var2, tlsVar2, fidVar2, vng.O(1));
                            break;
                        default:
                            c.f(fum0Var3, aum0Var2, tlsVar2, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
            aii0Var.d = wlsVar;
        }
    }

    public static final void g(fum0 fum0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(974155810);
        int i2 = 2;
        int i3 = (btsVar.k(fum0Var) ? 4 : 2) | i;
        int i4 = 1;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            bum0 bum0Var = fum0Var.c.c;
            if (bum0Var != null) {
                btsVar.e0(-18127802);
                ydb1.a(null, null, wwg.S(-337208842, true, new htm0(fum0Var, i4), btsVar), null, wwg.S(2113237628, true, new y740(20, fum0Var, bum0Var), btsVar), null, null, false, btsVar, 24960, 235);
                btsVar.t(false);
            } else {
                btsVar.e0(-16891956);
                ydb1.a(an91.o(c530.a, 0.0f, 12.0f, 0.0f, 0.0f, 13), null, wwg.S(-418411507, true, new htm0(fum0Var, i2), btsVar), null, null, null, null, false, btsVar, 390, 250);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lbb0(fum0Var, i, 22);
        }
    }

    public static final void h(fum0 fum0Var, utm0 utm0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1228246534);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(fum0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(utm0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = !fum0Var.b;
            f530 b = ofb1.b(ljs0.c(c530.a, 1.0f), fum0Var.b, null, 14);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new tmm0(i3, tlsVar, fum0Var);
                btsVar.o0(Q);
            }
            ohb1.b(b, z, null, (sls) Q, wwg.S(1972221753, true, new pdf0(25, utm0Var), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 4);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(fum0Var, utm0Var, tlsVar, i, 27);
        }
    }

    public static final void i(fum0 fum0Var, eum0 eum0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1081120754);
        int i2 = i | (btsVar.k(fum0Var) ? 4 : 2) | (btsVar.k(eum0Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            boolean z = !fum0Var.b;
            CharSequence charSequence = eum0Var.b;
            CharSequence charSequence2 = eum0Var.c;
            boolean z2 = false;
            CharSequence charSequence3 = eum0Var.d;
            dum0 dum0Var = eum0Var.f;
            CharSequence charSequence4 = dum0Var != null ? dum0Var.a : null;
            String str = eum0Var.e;
            boolean z3 = (i2 & 896) == 256;
            if ((i2 & 112) == 32) {
                z2 = true;
            }
            boolean z4 = z3 | z2;
            Object Q = btsVar.Q();
            if (z4 || Q == did.a) {
                Q = new tmm0(5, tlsVar, eum0Var);
                btsVar.o0(Q);
            }
            z3b1.a(null, z, charSequence, charSequence2, charSequence3, charSequence4, str, (sls) Q, btsVar, 0, 1);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0((Object) fum0Var, (Object) eum0Var, tlsVar, i, 15);
        }
    }
}
