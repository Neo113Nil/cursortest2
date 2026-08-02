package com.yandex.go.chargers.discounts.discount_stations.ui;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.a7y;
import defpackage.adb1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.bms;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cs8;
import defpackage.did;
import defpackage.dmw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.ft9;
import defpackage.gt9;
import defpackage.ht9;
import defpackage.i43;
import defpackage.it9;
import defpackage.j690;
import defpackage.jl40;
import defpackage.ky7;
import defpackage.ljs0;
import defpackage.mr1;
import defpackage.n7u0;
import defpackage.ohd;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.q791;
import defpackage.qic;
import defpackage.qje;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.u08;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.wg0;
import defpackage.wg6;
import defpackage.wls;
import defpackage.ws9;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.ydb1;
import defpackage.yrl;
import defpackage.z910;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class b {
    public static final void a(final it9 it9Var, final tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(414954607);
        int i2 = (btsVar.k(it9Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar, 48, 0, 8189);
            f530 d = ooc.d(c530.a, null, 3);
            androidx.compose.runtime.internal.a S = wwg.S(-1852571715, true, new wg0(7, tlsVar), btsVar);
            androidx.compose.runtime.internal.a S2 = wwg.S(-387472433, true, new bms() { // from class: com.yandex.go.chargers.discounts.discount_stations.ui.a
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
                        f530 d2 = ooc.d(an91.j(ljs0.c(c530.a, 1.0f), j690Var), null, 3);
                        z910 d3 = pi6.d(x4c.b, false);
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d4 = androidx.compose.ui.b.d(btsVar2, d2);
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
                        qje.W(btsVar2, androidx.compose.ui.node.d.f, d3);
                        qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
                        qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                        qje.M(btsVar2, androidx.compose.ui.node.d.h);
                        qje.W(btsVar2, androidx.compose.ui.node.d.d, d4);
                        it9 it9Var2 = it9.this;
                        boolean z = it9Var2 instanceof gt9;
                        tls tlsVar2 = tlsVar;
                        if (z) {
                            btsVar2.e0(-388589791);
                            ws9.a(btsVar2, 0);
                            boolean k = btsVar2.k(tlsVar2) | btsVar2.k(it9Var2);
                            Object Q = btsVar2.Q();
                            if (k || Q == did.a) {
                                Q = new ChargersDiscountStationsScreenKt$ChargersDiscountStationsScreen$2$1$1$1(tlsVar2, it9Var2, null);
                                btsVar2.o0(Q);
                            }
                            zpn.e(btsVar2, (wls) Q, it9Var2);
                            btsVar2.t(false);
                        } else if (jl40.l(it9Var2, ht9.a)) {
                            btsVar2.e0(-428168644);
                            ws9.a(btsVar2, 0);
                            btsVar2.t(false);
                        } else {
                            if (!(it9Var2 instanceof ft9)) {
                                throw unr0.y(-428179142, btsVar2, false);
                            }
                            btsVar2.e0(-428165171);
                            b.b((ft9) it9Var2, tlsVar2, btsVar2, 0);
                            btsVar2.t(false);
                        }
                        btsVar2.t(true);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar);
            btsVar = btsVar;
            com.yandex.go.design.compose.modal.bottomsheet.c.a(d, a, null, false, false, null, null, S, null, null, null, S2, btsVar, 12582912, 48, 1916);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(it9Var, tlsVar, i, 20);
        }
    }

    public static final void b(ft9 ft9Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1644072356);
        int i2 = (btsVar.k(ft9Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.foundation.lazy.b a = a7y.a(0, 3, btsVar);
            int i3 = i2 & 14;
            oz40 n = f.n(ft9Var, btsVar);
            int i4 = i2 & 112;
            boolean k = btsVar.k(a) | btsVar.k(n) | (i4 == 32);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (k || Q == obj) {
                Q = new ChargersDiscountStationsScreenKt$Content$1$1(a, tlsVar, n, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, a);
            f530 o = an91.o(ljs0.c(c530.a, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            boolean z = (i3 == 4) | (i4 == 32);
            Object Q2 = btsVar.Q();
            if (z || Q2 == obj) {
                Q2 = new cs8(11, ft9Var, tlsVar);
                btsVar.o0(Q2);
            }
            adb1.a(o, a, null, null, null, null, false, null, (tls) Q2, btsVar, 6, 508);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(ft9Var, tlsVar, i, 21);
        }
    }

    public static final void c(final n7u0 n7u0Var, tls tlsVar, boolean z, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1705877467);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.e(n7u0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.a(z) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            z910 d = pi6.d(x4c.B, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = androidx.compose.ui.b.d(btsVar, c530Var);
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
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d2);
            i43 i43Var = new i43(1.0f, true, new quz(11));
            f530 c = ljs0.c(c530Var, 1.0f);
            boolean z2 = ((i2 & 14) == 4 || btsVar.e(n7u0Var)) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new u08(23, tlsVar, n7u0Var);
                btsVar.o0(Q);
            }
            f530 d3 = q791.d(c, false, null, null, (sls) Q, 15);
            sic a = qic.a(i43Var, x4c.G, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d4 = androidx.compose.ui.b.d(btsVar, d3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d4);
            final int i3 = 0;
            final int i4 = 1;
            ydb1.a(null, null, wwg.S(-385137746, true, new zls() { // from class: us9
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    c530 c530Var2 = c530.a;
                    n7u0 n7u0Var2 = n7u0Var;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                sic a2 = qic.a(lr20.c, x4c.G, btsVar2, 0);
                                int hashCode3 = Long.hashCode(btsVar2.T);
                                r1b0 o3 = btsVar2.o();
                                f530 d5 = b.d(btsVar2, c530Var2);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar2.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar2.i0();
                                if (btsVar2.S) {
                                    btsVar2.n(slsVar2);
                                } else {
                                    btsVar2.r0();
                                }
                                qje.W(btsVar2, d.f, a2);
                                qje.W(btsVar2, d.e, o3);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode3));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d5);
                                qgy.b(n7u0Var2.b, null, ljs0.c(c530Var2, 1.0f), AppColor$Palette.Text, 0L, 0L, new sjy0(5), 0L, 2, 1, 0, xya1.e(btsVar2).g.a, null, btsVar2, 805309824, 6, 10610);
                                qgy.b(n7u0Var2.c, null, ljs0.c(c530Var2, 1.0f), AppColor$Palette.TextMinor, 0L, 0L, new sjy0(5), 0L, 2, 1, 0, xya1.e(btsVar2).h.a, null, btsVar2, 805309824, 6, 10610);
                                btsVar2.t(true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(1 & intValue2, (intValue2 & 17) != 16)) {
                                oeb1.c(btsVar3, ljs0.q(c530Var2, 24.0f));
                                if (evu0.J(n7u0Var2.d)) {
                                    btsVar3.e0(564508974);
                                    btsVar3.t(false);
                                } else {
                                    btsVar3.e0(564312558);
                                    qgy.b(n7u0Var2.d, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 1, 0, xya1.e(btsVar3).h.a, null, btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 6, 11254);
                                    btsVar3 = btsVar3;
                                    btsVar3.t(false);
                                }
                                o4b1.b(mt71.m(dzg0.chevron_next, 0, btsVar3), "chevron_next", ljs0.m(c530Var2, 24.0f), null, mhe.f, 0.0f, new c36(tje.n(AppColor$Palette.Text, btsVar3), 5), btsVar3, 25016, 40);
                                oeb1.c(btsVar3, ljs0.q(c530Var2, 8.0f));
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), null, wwg.S(-1884714956, true, new zls() { // from class: us9
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    c530 c530Var2 = c530.a;
                    n7u0 n7u0Var2 = n7u0Var;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                sic a2 = qic.a(lr20.c, x4c.G, btsVar2, 0);
                                int hashCode3 = Long.hashCode(btsVar2.T);
                                r1b0 o3 = btsVar2.o();
                                f530 d5 = b.d(btsVar2, c530Var2);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (btsVar2.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar2.i0();
                                if (btsVar2.S) {
                                    btsVar2.n(slsVar2);
                                } else {
                                    btsVar2.r0();
                                }
                                qje.W(btsVar2, d.f, a2);
                                qje.W(btsVar2, d.e, o3);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode3));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d5);
                                qgy.b(n7u0Var2.b, null, ljs0.c(c530Var2, 1.0f), AppColor$Palette.Text, 0L, 0L, new sjy0(5), 0L, 2, 1, 0, xya1.e(btsVar2).g.a, null, btsVar2, 805309824, 6, 10610);
                                qgy.b(n7u0Var2.c, null, ljs0.c(c530Var2, 1.0f), AppColor$Palette.TextMinor, 0L, 0L, new sjy0(5), 0L, 2, 1, 0, xya1.e(btsVar2).h.a, null, btsVar2, 805309824, 6, 10610);
                                btsVar2.t(true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(1 & intValue2, (intValue2 & 17) != 16)) {
                                oeb1.c(btsVar3, ljs0.q(c530Var2, 24.0f));
                                if (evu0.J(n7u0Var2.d)) {
                                    btsVar3.e0(564508974);
                                    btsVar3.t(false);
                                } else {
                                    btsVar3.e0(564312558);
                                    qgy.b(n7u0Var2.d, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 1, 0, xya1.e(btsVar3).h.a, null, btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 6, 11254);
                                    btsVar3 = btsVar3;
                                    btsVar3.t(false);
                                }
                                o4b1.b(mt71.m(dzg0.chevron_next, 0, btsVar3), "chevron_next", ljs0.m(c530Var2, 24.0f), null, mhe.f, 0.0f, new c36(tje.n(AppColor$Palette.Text, btsVar3), 5), btsVar3, 25016, 40);
                                oeb1.c(btsVar3, ljs0.q(c530Var2, 8.0f));
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), null, null, false, btsVar, 24960, 235);
            btsVar.t(true);
            if (z) {
                btsVar.e0(1716588962);
                yrl.b(6, 6, btsVar, an91.m(c530Var, 16.0f, 0.0f, 2));
                btsVar.t(false);
            } else {
                btsVar.e0(1716661037);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(n7u0Var, tlsVar, z, i, 2);
        }
    }
}
