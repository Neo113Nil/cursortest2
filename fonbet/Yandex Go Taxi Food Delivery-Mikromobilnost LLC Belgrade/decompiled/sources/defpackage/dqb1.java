package defpackage;

import androidx.compose.animation.core.b;
import androidx.compose.animation.k;
import androidx.compose.animation.m;
import androidx.compose.ui.graphics.d;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public abstract class dqb1 {
    public static final void a(xfv xfvVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(628737570);
        int i2 = (btsVar.k(xfvVar) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            m3u0 b = b.b(xfvVar.b, null, null, null, btsVar, 0, 30);
            f530 q = ljs0.q(sm91.f(f530Var, 0.0f, xfvVar.d, 1), xfvVar.c);
            boolean k = btsVar.k(b);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new xo1(b, 10);
                btsVar.o0(Q);
            }
            f530 a = d.a(q, (tls) Q);
            v0b1.a(xfvVar.a, a, null, null, wwg.S(647550802, true, new os(xfvVar, a, 26), btsVar), null, null, null, 0.0f, 0, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 1004);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new iu30(xfvVar, f530Var, i, 9);
        }
    }

    public static final void b(v49 v49Var, f530 f530Var, fid fidVar, int i) {
        v49 v49Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-47429490);
        int i2 = (btsVar.k(v49Var) ? 4 : 2) | i | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            w2o a = k.e(null, 3).a(k.d(null, null, 15)).a(k.q(3, null, null));
            zmo a2 = k.f(null, 3).a(k.l(null, null, 15)).a(k.v(3, null, null));
            x9d.a.getClass();
            f530Var = c530.a;
            v49Var2 = v49Var;
            ttb1.a(v49Var2, f530Var, a, a2, "CashbackItem", x9d.d, btsVar, (i2 & 14) | 224688, 0);
        } else {
            v49Var2 = v49Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new iu30(v49Var2, f530Var, i, 13);
        }
    }

    public static final void c(mco mcoVar, f530 f530Var, fid fidVar, int i) {
        mco mcoVar2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2121351272);
        int i2 = (btsVar.k(mcoVar) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            w2o e = k.e(null, 3);
            zmo f = k.f(null, 3);
            x9d.a.getClass();
            mcoVar2 = mcoVar;
            f530Var2 = f530Var;
            ttb1.a(mcoVar2, f530Var2, e, f, "EtaItem", x9d.b, btsVar, (i2 & 14) | 224640 | (i2 & 112), 0);
        } else {
            mcoVar2 = mcoVar;
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new iu30(mcoVar2, f530Var2, i, 11);
        }
    }

    public static final void d(ebp0 ebp0Var, ln40 ln40Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(858158704);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(ebp0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(ln40Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            qwd qwdVar = u76.a;
            jt1 alignment = ((BodyAlign) btsVar.m(qwdVar)).getAlignment();
            ebp0Var.getClass();
            cj6 cj6Var = cj6.a;
            c530 c530Var = c530.a;
            f530 m = an91.m(cj6Var.a(c530Var, alignment), 0.0f, 2.0f, 1);
            sic a = qic.a(lr20.c, ((BodyAlign) btsVar.m(qwdVar)).getHorizontal(), btsVar, 0);
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
            l(ln40Var.a, null, btsVar, 0);
            k(ln40Var.b, null, btsVar, 0);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(ebp0Var, ln40Var, f530Var2, i, 18);
        }
    }

    public static final void e(sn40 sn40Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        pn40 pn40Var;
        Object xw8Var;
        String str;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1721322677);
        int i2 = i | (btsVar.k(sn40Var) ? 4 : 2) | (btsVar.k(f530Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            qn40 qn40Var = sn40Var.f;
            nn40 nn40Var = sn40Var.b;
            ln40 ln40Var = sn40Var.c;
            on40 on40Var = sn40Var.d;
            pn40 pn40Var2 = sn40Var.e;
            String str2 = sn40Var.g;
            boolean z = qn40Var != null;
            fgd fgdVar = (fgd) btsVar.m(g3z.a);
            boolean a = btsVar.a(z) | ((i2 & 896) == 256) | btsVar.k(qn40Var) | btsVar.e(fgdVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (a || Q == o430Var) {
                pn40Var = pn40Var2;
                str = str2;
                xw8Var = new xw8(z, tlsVar, qn40Var, fgdVar, 3);
                btsVar.o0(xw8Var);
            } else {
                pn40Var = pn40Var2;
                xw8Var = Q;
                str = str2;
            }
            String str3 = str;
            f530 d = q791.d(f530Var, z, null, null, (sls) xw8Var, 14);
            boolean k = btsVar.k(str3) | btsVar.e(pn40Var);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new t130(22, str3, pn40Var);
                btsVar.o0(Q2);
            }
            ydb1.a(fnq0.a(d, (tls) Q2), wwg.S(-1438015669, true, new wg30(13, nn40Var), btsVar), wwg.S(-794729850, true, new wg30(14, ln40Var), btsVar), wwg.S(941092797, true, new wg30(15, on40Var), btsVar), wwg.S(293094720, true, new wg30(16, pn40Var), btsVar), null, SlotSize.L, false, btsVar, 1600944, 160);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240((Object) sn40Var, (Object) f530Var, tlsVar, i, 13);
        }
    }

    public static final void f(ibp0 ibp0Var, nn40 nn40Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-656292758);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(nn40Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            float size = ibp0Var.c().getSize();
            c530 c530Var = c530.a;
            f530 o = an91.o(ljs0.e(c530Var, size), 16.0f, 0.0f, 0.0f, 0.0f, 14);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, o);
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o2);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            uo5 uo5Var = x4c.A;
            cj6 cj6Var = cj6.a;
            a(nn40Var.a, cj6Var.a(c530Var, uo5Var), btsVar, 0);
            c(nn40Var.b, cj6Var.a(c530Var, uo5Var), btsVar, 0);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(ibp0Var, nn40Var, f530Var2, i, 16);
        }
    }

    public static final void g(ibp0 ibp0Var, on40 on40Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1331428294);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 48) == 0) {
            i2 = i | (btsVar.k(on40Var) ? 32 : 16);
        } else {
            i2 = i;
        }
        int i3 = i2 | 384;
        if (btsVar.V(i3 & 1, (i3 & 145) != 144)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            int i4 = 11;
            sic a = qic.a(new i43(1.0f, true, new quz(i4)), x4c.I, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, o);
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
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d);
            lhl0 a2 = khl0.a(new i43(2.0f, true, new quz(i4)), x4c.F, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            i(on40Var.b, an91.o(c530Var, 0.0f, 0.0f, 0.0f, 0.5f, 7), btsVar, 48);
            j(on40Var.a, null, btsVar, 0);
            btsVar.t(true);
            b(on40Var.c, null, btsVar, 0);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(ibp0Var, on40Var, f530Var2, i, 15);
        }
    }

    public static final void h(ibp0 ibp0Var, pn40 pn40Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(836870538);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(ibp0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(pn40Var) : btsVar.e(pn40Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            btsVar.e0(-1074706542);
            boolean z = pn40Var.a;
            boolean z2 = pn40Var.b;
            float f = ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f;
            c530 c530Var = c530.a;
            xkb1.b(z, an91.o(c530Var, 8.0f, 0.0f, f, 0.0f, 10), null, z2, btsVar, 0, 4);
            btsVar.t(false);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(ibp0Var, pn40Var, f530Var2, i, 17);
        }
    }

    public static final void i(xq80 xq80Var, f530 f530Var, fid fidVar, int i) {
        xq80 xq80Var2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1999964812);
        int i2 = (btsVar.k(xq80Var) ? 4 : 2) | i;
        int i3 = 14;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            w2o e = k.e(null, 3);
            so5 so5Var = x4c.I;
            w2o a = e.a(k.a(null, so5Var, 13));
            Object Q = btsVar.Q();
            int i4 = 29;
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new ur70(i4);
                btsVar.o0(Q);
            }
            w2o a2 = a.a(k.o(1, (tls) Q, null));
            zmo a3 = k.f(null, 3).a(k.i(null, so5Var, 13));
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new ur70(i4);
                btsVar.o0(Q2);
            }
            zmo a4 = a3.a(k.t(1, (tls) Q2, null));
            x9d.a.getClass();
            f530Var2 = f530Var;
            xq80Var2 = xq80Var;
            ttb1.a(xq80Var2, f530Var2, a2, a4, "OriginalPriceItem", x9d.e, btsVar, (i2 & 14) | 224688, 0);
        } else {
            xq80Var2 = xq80Var;
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new iu30(xq80Var2, f530Var2, i, i3);
        }
    }

    public static final void j(b1f0 b1f0Var, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(2057701462);
        int i2 = (btsVar2.k(b1f0Var) ? 4 : 2) | i | 48;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            m3u0 a = m.a(tje.n(b1f0Var.b, btsVar2), null, null, btsVar2, 0, 14);
            c530 c530Var = c530.a;
            f530 c = ooc.c(c530Var);
            CharSequence charSequence = b1f0Var.a;
            ety0 ety0Var = xya1.e(btsVar2).g.a;
            boolean k = btsVar2.k(a);
            Object Q = btsVar2.Q();
            if (k || Q == did.a) {
                Q = new w9d(a, 3);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            qgy.a(charSequence, (xfc) Q, null, c, 0L, 0L, new sjy0(6), 0L, 0, 0, 0, ety0Var, btsVar, 0, 0, 12148);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new iu30(b1f0Var, f530Var2, i, 12);
        }
    }

    public static final void k(w2v0 w2v0Var, f530 f530Var, fid fidVar, int i) {
        w2v0 w2v0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1643637426);
        int i2 = (btsVar.k(w2v0Var) ? 4 : 2) | i | 48;
        int i3 = 15;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            w2o a = k.e(null, 3).a(k.d(null, null, 15)).a(k.q(3, null, null));
            zmo a2 = k.f(null, 3).a(k.l(null, null, 15)).a(k.v(3, null, null));
            x9d.a.getClass();
            c530 c530Var = c530.a;
            w2v0Var2 = w2v0Var;
            ttb1.a(w2v0Var2, c530Var, a, a2, "SubtitleItem", x9d.c, btsVar, (i2 & 14) | 224688, 0);
            f530Var = c530Var;
        } else {
            w2v0Var2 = w2v0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new iu30(w2v0Var2, f530Var, i, i3);
        }
    }

    public static final void l(ziz0 ziz0Var, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-193346252);
        int i2 = (btsVar2.k(ziz0Var) ? 4 : 2) | i | 48;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            m3u0 a = m.a(tje.n(ziz0Var.b, btsVar2), null, null, btsVar2, 0, 14);
            String str = ziz0Var.a;
            ety0 ety0Var = xya1.e(btsVar2).g.a;
            boolean k = btsVar2.k(a);
            Object Q = btsVar2.Q();
            if (k || Q == did.a) {
                Q = new w9d(a, 4);
                btsVar2.o0(Q);
            }
            f530Var2 = c530.a;
            btsVar = btsVar2;
            jeb1.e(str, (xfc) Q, f530Var2, 0L, 0L, null, 0L, 0, false, 0, 0, ety0Var, btsVar, 384, 16376);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new iu30(ziz0Var, f530Var2, i, 10);
        }
    }
}
