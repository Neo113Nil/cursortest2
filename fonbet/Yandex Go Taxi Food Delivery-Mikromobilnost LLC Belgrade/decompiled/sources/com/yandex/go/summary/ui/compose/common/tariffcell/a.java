package com.yandex.go.summary.ui.compose.common.tariffcell;

import androidx.compose.animation.core.b;
import androidx.compose.animation.k;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.m;
import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.alb0;
import defpackage.an91;
import defpackage.ax5;
import defpackage.bts;
import defpackage.byk0;
import defpackage.bza1;
import defpackage.bzk0;
import defpackage.c1p0;
import defpackage.c530;
import defpackage.c8i0;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.d1f0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.ej31;
import defpackage.ety0;
import defpackage.f4b1;
import defpackage.f530;
import defpackage.ffb1;
import defpackage.fgd;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fwi;
import defpackage.g3z;
import defpackage.gex0;
import defpackage.hex0;
import defpackage.i69;
import defpackage.iex0;
import defpackage.j4b1;
import defpackage.jeb1;
import defpackage.jex0;
import defpackage.jl40;
import defpackage.jtn;
import defpackage.k3r;
import defpackage.k58;
import defpackage.kh91;
import defpackage.kp50;
import defpackage.lex0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m3u0;
import defpackage.mex0;
import defpackage.mhe;
import defpackage.nvs0;
import defpackage.nx2;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.oco;
import defpackage.oeb1;
import defpackage.ofb1;
import defpackage.ogx0;
import defpackage.ohd;
import defpackage.oxv0;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qic;
import defpackage.qje;
import defpackage.qk30;
import defpackage.qke;
import defpackage.qm4;
import defpackage.quz0;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.so5;
import defpackage.tje;
import defpackage.tls;
import defpackage.ttb1;
import defpackage.unr0;
import defpackage.uo5;
import defpackage.uy2;
import defpackage.vfc;
import defpackage.vwy;
import defpackage.w9d;
import defpackage.wls;
import defpackage.wwg;
import defpackage.wwy;
import defpackage.x4c;
import defpackage.xfc;
import defpackage.xlp0;
import defpackage.xw91;
import defpackage.xwy;
import defpackage.xya1;
import defpackage.y1f;
import defpackage.ymb1;
import defpackage.yn91;
import defpackage.ywy;
import defpackage.z910;
import defpackage.zpn;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public abstract class a {
    public static final void a(String str, qm4 qm4Var, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1894164198);
        int i2 = (btsVar.k(str) ? 4 : 2) | i | (btsVar.k(qm4Var) ? 32 : 16) | 384;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530Var2 = c530.a;
            ttb1.a(qm4Var, f530Var2, k.e(null, 3), k.f(null, 3), "BadgeItem", wwg.S(-1928638375, true, new alb0(28, str), btsVar), btsVar, ((i2 >> 3) & 14) | 224688, 0);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0(str, qm4Var, f530Var2, i, 8);
        }
    }

    public static final void b(k58 k58Var, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-820367909);
        int i2 = (btsVar.k(k58Var) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            m3u0 b = b.b(((fwi) btsVar.m(j.h)).w0(k58Var.d), null, "CarImageOffsetX", null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 22);
            m3u0 b2 = b.b(k58Var.b, null, "CarImageAlpha", null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 22);
            f530 l = ymb1.l(ljs0.e(ljs0.q(f530Var, k58Var.c), 38.0f), qke.q);
            boolean k = btsVar.k(b) | btsVar.k(b2);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new gex0(b, b2, 0);
                btsVar.o0(Q);
            }
            f530 a = d.a(l, (tls) Q);
            Object Q2 = btsVar.Q();
            wwy wwyVar = wwy.a;
            if (Q2 == o430Var) {
                Q2 = f.j(wwyVar);
                btsVar.o0(Q2);
            }
            oz40 oz40Var = (oz40) Q2;
            m3u0 f = ffb1.f(k58Var.a, btsVar, 0);
            boolean k2 = btsVar.k(f);
            Object Q3 = btsVar.Q();
            if (k2 || Q3 == o430Var) {
                Q3 = new TariffCellItemKt$CarImageItem$1$1(f, oz40Var, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, f);
            ywy ywyVar = (ywy) oz40Var.getValue();
            if (jl40.l(ywyVar, vwy.a)) {
                btsVar.e0(-1215224048);
                btsVar.e0(-1215043566);
                oeb1.c(btsVar, a);
                btsVar.t(false);
                btsVar.t(false);
            } else if (jl40.l(ywyVar, wwyVar)) {
                btsVar.e0(-1214953387);
                com.yandex.go.design.compose.loading.b.a(a, null, false, null, null, null, false, btsVar, 0, 254);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                if (!(ywyVar instanceof xwy)) {
                    throw unr0.y(1900458970, btsVar, false);
                }
                btsVar.e0(-1214857907);
                j4b1.c(((xwy) ywyVar).a, a, null, null, null, mhe.a, 0.0f, 0, btsVar, ImageMetadata.EDGE_MODE, 220);
                btsVar = btsVar;
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c1p0(k58Var, f530Var, i, 29);
        }
    }

    public static final void c(y1f y1fVar, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1747151547);
        int i2 = (btsVar.k(y1fVar) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530Var2 = f530Var;
            o4b1.b(vfc.k(y1fVar.a, 0, -1411607277, btsVar, false), null, ljs0.m(an91.o(f530Var, 0.0f, 8.0f, 4.0f, 0.0f, 9), 16.0f), null, null, 0.0f, null, btsVar, 8, 56);
        } else {
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hex0(y1fVar, f530Var2, i, i3);
        }
    }

    public static final void d(oco ocoVar, f530 f530Var, fid fidVar, int i) {
        oco ocoVar2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2117008031);
        int i2 = (btsVar.k(ocoVar) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        int i3 = 1;
        int i4 = 3;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ocoVar2 = ocoVar;
            f530Var2 = f530Var;
            ttb1.a(ocoVar2, f530Var2, k.e(null, 3), k.f(null, 3), "EtaItem", wwg.S(-114762381, true, new iex0((fwi) btsVar.m(j.h), i3), btsVar), btsVar, (i2 & 14) | 224640 | (i2 & 112), 0);
        } else {
            ocoVar2 = ocoVar;
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hex0(ocoVar2, f530Var2, i, i4);
        }
    }

    public static final void e(d1f0 d1f0Var, f530 f530Var, fid fidVar, int i) {
        d1f0 d1f0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(766295091);
        int i2 = 2;
        int i3 = (btsVar.k(d1f0Var) ? 4 : 2) | i | 48;
        int i4 = 0;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            fwi fwiVar = (fwi) btsVar.m(j.h);
            so5 so5Var = x4c.G;
            c530 c530Var = c530.a;
            d1f0Var2 = d1f0Var;
            ttb1.a(d1f0Var2, c530Var, k.a(null, so5Var, 13), k.i(null, so5Var, 13), "PriceItem", wwg.S(-1476117778, true, new iex0(fwiVar, i4), btsVar), btsVar, (i3 & 14) | 224688, 0);
            f530Var = c530Var;
        } else {
            d1f0Var2 = d1f0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hex0(d1f0Var2, f530Var, i, i2);
        }
    }

    public static final void f(mex0 mex0Var, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1008318420);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (btsVar.k(mex0Var) ? 4 : 2) | i | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            xw91 xw91Var = ((nx2) btsVar.m(uy2.c)).b;
            boolean b = btsVar.b(16.0f);
            Object Q = btsVar.Q();
            if (b || Q == did.a) {
                Q = cyk0.c(16.0f);
                btsVar.o0(Q);
            }
            i69 i69Var = mex0Var.b;
            k3r k3rVar = ljs0.b;
            f530 n = an91.n(bzk0.c(ljs0.s(k3rVar, i69Var.a, 0.0f, 2), i69Var.e, (byk0) Q), i69Var.c, 0.0f, i69Var.d, i69Var.b);
            uo5 uo5Var = x4c.b;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, n);
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
            tls tlsVar = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d2);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, k3rVar);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            f530Var2 = c530.a;
            f530 m = ymb1.m(ljs0.e(f530Var2, 46.0f));
            z910 d4 = pi6.d(uo5Var, false);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d5 = androidx.compose.ui.b.d(btsVar, m);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d4);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d5);
            cj6 cj6Var = cj6.a;
            b(mex0Var.c, cj6Var.a(f530Var2, uo5Var), btsVar, 0);
            d(mex0Var.e, cj6Var.a(f530Var2, x4c.A), btsVar, 0);
            btsVar.t(true);
            h(mex0Var.d, null, btsVar, 0);
            e(mex0Var.g, null, btsVar, 0);
            btsVar.t(true);
            y1f y1fVar = mex0Var.f;
            if (y1fVar == null) {
                btsVar.e0(-122916789);
                btsVar.t(false);
            } else {
                btsVar.e0(-122916788);
                c(y1fVar, cj6Var.a(f530Var2, x4c.w), btsVar, 0);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c1p0(mex0Var, f530Var2, i, 28);
        }
    }

    public static final void g(mex0 mex0Var, f530 f530Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        f530 a;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2009780831);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(mex0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 >> 6;
            kh91.b(mex0Var.j, tlsVar2, btsVar, i4 & 112);
            ej31 ej31Var = mex0Var.a;
            String str = mex0Var.k;
            boolean z = ej31Var.c;
            String str2 = mex0Var.l;
            quz0 quz0Var = mex0Var.i;
            qm4 qm4Var = mex0Var.h;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new oxv0(28);
                btsVar.o0(Q);
            }
            tls g = yn91.g(tlsVar, (tls) Q, btsVar, (i4 & 14) | 48);
            fgd fgdVar = (fgd) btsVar.m(g3z.a);
            boolean k = ((i3 & 896) == 256) | btsVar.k(ej31Var) | btsVar.k(fgdVar);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new xlp0(24, tlsVar, ej31Var, fgdVar);
                btsVar.o0(Q2);
            }
            sls slsVar = (sls) Q2;
            f530Var2 = c530.a;
            f530 e = ljs0.e(f530Var2, 86.0f);
            boolean k2 = btsVar.k(str) | btsVar.a(z) | btsVar.k(str2) | btsVar.k(slsVar) | btsVar.k(quz0Var) | btsVar.k(g) | btsVar.e(qm4Var);
            Object Q3 = btsVar.Q();
            if (k2 || Q3 == o430Var) {
                ax5 ax5Var = new ax5(str, z, str2, quz0Var, g, qm4Var, slsVar);
                btsVar.o0(ax5Var);
                Q3 = ax5Var;
            }
            Object obj = null;
            a = androidx.compose.ui.b.a(fnq0.a(e, (tls) Q3), m.a(), new qk30(19, obj, slsVar, obj));
            f4b1.a(wwg.S(-652512231, true, new jex0(mex0Var, 0), btsVar), a, 0.0f, 0.0f, wwg.S(-204045795, true, new jex0(mex0Var, 1), btsVar), btsVar, 24582, 12);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0((Object) mex0Var, f530Var2, (Object) tlsVar, (Object) tlsVar2, i, 14);
        }
    }

    public static final void h(ogx0 ogx0Var, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        ety0 ety0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-277608613);
        int i2 = 2;
        int i3 = (btsVar.k(ogx0Var) ? 4 : 2) | i | 48;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            fwi fwiVar = (fwi) btsVar.m(j.h);
            m3u0 b = b.b(fwiVar.w0(ogx0Var.e), null, "tariffNameOffsetX", null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 22);
            m3u0 a = androidx.compose.animation.m.a(tje.n(ogx0Var.b, btsVar), null, null, btsVar, 0, 14);
            boolean z = ogx0Var.d;
            c530 c530Var = c530.a;
            f530 o = an91.o(kp50.F(ofb1.b(c530Var, z, null, 6), new jtn(b, i2)), 4.0f, 2.0f, 4.0f, 0.0f, 8);
            String str = ogx0Var.a;
            int i4 = lex0.c[ogx0Var.c.ordinal()];
            if (i4 == 1) {
                btsVar.e0(-439598561);
                ety0Var = xya1.e(btsVar).h.b;
                btsVar.t(false);
            } else {
                if (i4 != 2) {
                    throw unr0.y(-439601262, btsVar, false);
                }
                btsVar.e0(-439595872);
                ety0Var = xya1.e(btsVar).h.a;
                btsVar.t(false);
            }
            ety0 c = bza1.c(ety0Var, fwiVar);
            boolean k = btsVar.k(a);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new w9d(a, 8);
                btsVar.o0(Q);
            }
            jeb1.e(str, (xfc) Q, o, 0L, 0L, new sjy0(5), 0L, 0, false, 0, 0, c, btsVar, 0, 16248);
            btsVar = btsVar;
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hex0(ogx0Var, f530Var2, i, 1);
        }
    }
}
