package com.yandex.go.routestops.v2.ui;

import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.routestops.v2.ui.c;
import defpackage.aii0;
import defpackage.an91;
import defpackage.aq5;
import defpackage.bj6;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.d17;
import defpackage.dhj0;
import defpackage.did;
import defpackage.erb1;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fzv;
import defpackage.gv40;
import defpackage.i4a1;
import defpackage.jf61;
import defpackage.jk30;
import defpackage.lg6;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lt90;
import defpackage.lx40;
import defpackage.n4m;
import defpackage.o430;
import defpackage.ohd;
import defpackage.pdf0;
import defpackage.qab1;
import defpackage.qeg0;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.t7l0;
import defpackage.tls;
import defpackage.tx40;
import defpackage.uo5;
import defpackage.up2;
import defpackage.v6k0;
import defpackage.vdl0;
import defpackage.vnf0;
import defpackage.vpa1;
import defpackage.wg0;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xm91;
import defpackage.ydb1;
import defpackage.ytk0;
import defpackage.z0l0;
import defpackage.zdl0;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes11.dex */
public abstract class c {
    public static final void a(n4m n4mVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1845330212);
        int i2 = (btsVar.k(n4mVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i3 = 18;
        int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 o = an91.o(an91.m(ljs0.c(c530.a, 1.0f), 8.0f, 0.0f, 2), 0.0f, 4.0f, 0.0f, 8.0f, 5);
            ButtonStyle buttonStyle = ButtonStyle.Main;
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new v6k0(14, tlsVar);
                btsVar.o0(Q);
            }
            d17.c(o, true, null, buttonStyle, null, (sls) Q, wwg.S(-1928573576, true, new pdf0(i3, n4mVar), btsVar), btsVar, 1575942, 20);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(n4mVar, tlsVar, i, i4);
        }
    }

    public static final void b(bj6 bj6Var, jf61 jf61Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-887692730);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(bj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(jf61Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            uo5 uo5Var = x4c.A;
            c530 c530Var = c530.a;
            f530 k = an91.k(bj6Var.a(c530Var, uo5Var), 8.0f);
            boolean z = (i2 & 896) == 256;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new v6k0(16, tlsVar);
                btsVar.o0(Q);
            }
            vpa1.a(k, false, ButtonSize.M, (sls) Q, wwg.S(367939781, false, vdl0.a, btsVar), btsVar, 24960, 2);
            g.e(jf61Var.a, bj6Var.a(c530Var, x4c.C), k.e(null, 3), k.f(null, 3), null, wwg.S(-361381266, true, new wg0(27, tlsVar), btsVar), btsVar, 200064, 16);
            btsVar = btsVar;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(bj6Var, jf61Var, tlsVar, i, 23);
        }
    }

    public static final void c(wg6 wg6Var, int i, tls tlsVar, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1817058917);
        int i3 = (btsVar.k(wg6Var) ? 4 : 2) | i2 | (btsVar.c(i) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new RouteStopsV2ScreenKt$OnBottomSheetHeightChangeEffect$1$1(i, wg6Var, tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ytk0(wg6Var, i, tlsVar, i2);
        }
    }

    public static final void d(final zdl0 zdl0Var, final tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-45565616);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(zdl0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = i2;
        final int i4 = 0;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar, 54, 0, 8188);
            lg6 c = qab1.c(a, new up2(up2.b), null, btsVar, 384, 0);
            lx40 f = erb1.f(a, true, 0, btsVar, 48, 6);
            final int i5 = 1;
            com.yandex.go.design.compose.modal.bottomsheet.c.a(null, a, c, false, false, null, null, null, wwg.S(1964783875, true, new zls() { // from class: udl0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i4;
                    zy11 zy11Var = zy11.a;
                    tls tlsVar2 = tlsVar;
                    zdl0 zdl0Var2 = zdl0Var;
                    bj6 bj6Var = (bj6) obj;
                    fid fidVar2 = (fid) obj2;
                    Integer num = (Integer) obj3;
                    switch (i6) {
                        case 0:
                            int intValue = num.intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(bj6Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                c.b(bj6Var, zdl0Var2.b, tlsVar2, btsVar2, intValue & 14);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            int intValue2 = num.intValue();
                            bts btsVar3 = (bts) fidVar2;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                f530 d = i9a1.d(c530.a);
                                z910 d2 = pi6.d(x4c.b, false);
                                int hashCode = Long.hashCode(btsVar3.T);
                                r1b0 o = btsVar3.o();
                                f530 d3 = b.d(btsVar3, d);
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, d2);
                                qje.W(btsVar3, d.e, o);
                                qje.W(btsVar3, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar3, d.h);
                                qje.W(btsVar3, d.d, d3);
                                c.a(zdl0Var2.c, tlsVar2, btsVar3, 0);
                                btsVar3.t(true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), null, wwg.S(-524678204, true, new zls() { // from class: udl0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i5;
                    zy11 zy11Var = zy11.a;
                    tls tlsVar2 = tlsVar;
                    zdl0 zdl0Var2 = zdl0Var;
                    bj6 bj6Var = (bj6) obj;
                    fid fidVar2 = (fid) obj2;
                    Integer num = (Integer) obj3;
                    switch (i6) {
                        case 0:
                            int intValue = num.intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(bj6Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                c.b(bj6Var, zdl0Var2.b, tlsVar2, btsVar2, intValue & 14);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            int intValue2 = num.intValue();
                            bts btsVar3 = (bts) fidVar2;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                f530 d = i9a1.d(c530.a);
                                z910 d2 = pi6.d(x4c.b, false);
                                int hashCode = Long.hashCode(btsVar3.T);
                                r1b0 o = btsVar3.o();
                                f530 d3 = b.d(btsVar3, d);
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                if (btsVar3.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar3.i0();
                                if (btsVar3.S) {
                                    btsVar3.n(slsVar);
                                } else {
                                    btsVar3.r0();
                                }
                                qje.W(btsVar3, d.f, d2);
                                qje.W(btsVar3, d.e, o);
                                qje.W(btsVar3, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar3, d.h);
                                qje.W(btsVar3, d.d, d3);
                                c.a(zdl0Var2.c, tlsVar2, btsVar3, 0);
                                btsVar3.t(true);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), wwg.S(96495088, true, new dhj0(f, zdl0Var, tlsVar, 15), btsVar), btsVar, 100663296, 54, 761);
            btsVar = btsVar;
            int i6 = f.b;
            boolean z = (i3 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new gv40(29, tlsVar);
                btsVar.o0(Q);
            }
            c(a, i6, (tls) Q, btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(zdl0Var, tlsVar, i, 22);
        }
    }

    public static final void e(lx40 lx40Var, zdl0 zdl0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(918177440);
        int i2 = i | (btsVar.k(lx40Var) ? 4 : 2) | (btsVar.k(zdl0Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.f(0.0f);
                btsVar.o0(Q);
            }
            tx40 tx40Var = (tx40) Q;
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new aq5(tx40Var, 5);
                btsVar.o0(Q2);
            }
            f530 b = xm91.b(c, (tls) Q2);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, b);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            f(zdl0Var.a, btsVar, 6);
            i4a1.d(zdl0Var.d, an91.o(c530Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), tlsVar, btsVar, (i2 & 896) | 48);
            btsVar.t(true);
            boolean z = (i2 & 14) == 4;
            Object Q3 = btsVar.Q();
            if (z || Q3 == o430Var) {
                Q3 = new RouteStopsV2ScreenKt$ScreenContent$3$1(tx40Var, lx40Var, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, zy11.a);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0((Object) lx40Var, (Object) zdl0Var, tlsVar, i, 12);
        }
    }

    public static final void f(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1494296909);
        int i2 = 16;
        int i3 = (btsVar.k(str) ? 32 : 16) | i;
        if (btsVar.V(i3 & 1, (i3 & 17) != 16)) {
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new z0l0(i2);
                btsVar.o0(Q);
            }
            ydb1.a(fnq0.b(c530.a, false, (tls) Q), null, wwg.S(1713142430, true, new jk30(str, i2), btsVar), null, null, null, null, false, btsVar, 384, 250);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 25);
        }
    }
}
