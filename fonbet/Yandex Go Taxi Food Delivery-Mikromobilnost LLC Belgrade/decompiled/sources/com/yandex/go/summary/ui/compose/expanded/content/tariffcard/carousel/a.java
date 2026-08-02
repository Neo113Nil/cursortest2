package com.yandex.go.summary.ui.compose.expanded.content.tariffcard.carousel;

import androidx.compose.animation.k;
import androidx.compose.animation.m;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import defpackage.aii0;
import defpackage.ajz0;
import defpackage.an91;
import defpackage.bb1;
import defpackage.bj0;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.d47;
import defpackage.did;
import defpackage.ety0;
import defpackage.f530;
import defpackage.ffb1;
import defpackage.ffx;
import defpackage.fgd;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fx8;
import defpackage.g3z;
import defpackage.gz6;
import defpackage.hh8;
import defpackage.hx8;
import defpackage.hz8;
import defpackage.j4b1;
import defpackage.jeb1;
import defpackage.jj2;
import defpackage.jv8;
import defpackage.k2z;
import defpackage.ku0;
import defpackage.ky7;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m3u0;
import defpackage.n8v;
import defpackage.nx2;
import defpackage.o430;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rb0;
import defpackage.rx3;
import defpackage.sb2;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.t0;
import defpackage.tcb1;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.ttb1;
import defpackage.unr0;
import defpackage.uy2;
import defpackage.vmb1;
import defpackage.vvf0;
import defpackage.vw8;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wwg;
import defpackage.x2v0;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.xo1;
import defpackage.xw8;
import defpackage.xw91;
import defpackage.xx8;
import defpackage.xya1;
import defpackage.yfv;
import defpackage.yre;
import defpackage.z7m;
import defpackage.zh;
import defpackage.zpn;
import defpackage.zw8;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public abstract class a {
    public static final void a(final f530 f530Var, jj2 jj2Var, ButtonSize buttonSize, gz6 gz6Var, ButtonForm buttonForm, final androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        ButtonSize buttonSize2;
        jj2 jj2Var2;
        ButtonForm buttonForm2;
        ButtonForm buttonForm3;
        yre a;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1726738831);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | 48 | (btsVar.k(gz6Var) ? 2048 : 1024) | HProv.ALG_CLASS_DATA_ENCRYPT;
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                jj2Var2 = sb2.G(0.0f, 0.0f, 7, null);
                buttonForm3 = ButtonForm.Squircle;
            } else {
                btsVar.Y();
                jj2Var2 = jj2Var;
                buttonForm3 = buttonForm;
            }
            btsVar.u();
            final m3u0 a2 = m.a(tje.n(gz6Var.a, btsVar), jj2Var2, null, btsVar, 48, 12);
            m3u0 a3 = m.a(tje.n(gz6Var.b, btsVar), jj2Var2, null, btsVar, 48, 12);
            final float size = buttonSize.getSize();
            int i3 = zw8.a[buttonForm3.ordinal()];
            if (i3 == 1) {
                buttonSize2 = buttonSize;
                btsVar.e0(1538659047);
                btsVar.t(false);
                a = ffx.a(50);
            } else {
                if (i3 != 2) {
                    throw unr0.y(1538657907, btsVar, false);
                }
                btsVar.e0(1538660724);
                buttonSize2 = buttonSize;
                a = new z7m(tcb1.c(buttonSize2, btsVar));
                btsVar.t(false);
            }
            byk0 byk0Var = cyk0.a;
            final byk0 byk0Var2 = new byk0(a, a, a, a);
            final yre yreVar = a;
            sb2.c(new vvf0[]{k2z.b.a(a2.getValue()), k2z.a.a(a3.getValue())}, wwg.S(-822520241, true, new wls() { // from class: ww8
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                        f530 f530Var2 = f530.this;
                        float f = size;
                        f530 a4 = ljs0.a(f530Var2, f, f);
                        yre yreVar2 = yreVar;
                        boolean k = btsVar2.k(yreVar2);
                        m3u0 m3u0Var = a2;
                        boolean k2 = k | btsVar2.k(m3u0Var);
                        Object Q = btsVar2.Q();
                        if (k2 || Q == did.a) {
                            Q = new v07(yreVar2, m3u0Var, 1);
                            btsVar2.o0(Q);
                        }
                        f530 l = ymb1.l(bb1.g(a4, (tls) Q), byk0Var2);
                        z910 d = pi6.d(x4c.y, false);
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d2 = b.d(btsVar2, l);
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
                        aVar.invoke(cj6.a, btsVar2, 6);
                        btsVar2.t(true);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 48);
            buttonForm2 = buttonForm3;
        } else {
            buttonSize2 = buttonSize;
            btsVar.Y();
            jj2Var2 = jj2Var;
            buttonForm2 = buttonForm;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t0(f530Var, jj2Var2, buttonSize2, gz6Var, buttonForm2, aVar, i, 7);
        }
    }

    public static final void b(d47 d47Var, f530 f530Var, fid fidVar, int i) {
        wp2 wp2Var = d47Var.d;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-795769720);
        int i2 = (btsVar.k(d47Var) ? 4 : 2) | i | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            wp2 wp2Var2 = d47Var.c;
            boolean k = btsVar.k(wp2Var) | btsVar.k(wp2Var2);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new gz6(wp2Var, wp2Var2);
                btsVar.o0(Q);
            }
            c530 c530Var = c530.a;
            a(ljs0.c(c530Var, 1.0f), null, ButtonSize.XS, (gz6) Q, null, wwg.S(-1634785342, true, new bj0(22, d47Var), btsVar), btsVar, 196992);
            f530Var = c530Var;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(d47Var, f530Var, i, 11);
        }
    }

    public static final void c(hx8 hx8Var, f530 f530Var, tls tlsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        tls tlsVar2;
        int i4;
        f530 f530Var3;
        tls tlsVar3;
        c530 c530Var;
        tls tlsVar4;
        int i5;
        c530 c530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1806019435);
        int i6 = i | (btsVar.k(hx8Var) ? 4 : 2);
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i6 | 48;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i3 = i6 | (btsVar.k(f530Var2) ? 32 : 16);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i4 = i3 | 384;
            tlsVar2 = tlsVar;
        } else {
            tlsVar2 = tlsVar;
            i4 = i3 | (btsVar.e(tlsVar2) ? 256 : 128);
        }
        boolean z = true;
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            c530 c530Var3 = c530.a;
            f530 f530Var4 = i7 != 0 ? c530Var3 : f530Var2;
            o430 o430Var = did.a;
            if (i8 != 0) {
                Object Q = btsVar.Q();
                if (Q == o430Var) {
                    Q = new jv8(1);
                    btsVar.o0(Q);
                }
                c530Var = c530Var3;
                tlsVar4 = (tls) Q;
            } else {
                c530Var = c530Var3;
                tlsVar4 = tlsVar2;
            }
            m3u0 a = m.a(tje.n(hx8Var.d, btsVar), null, null, btsVar, 0, 14);
            zh zhVar = hx8Var.j;
            fgd fgdVar = (fgd) btsVar.m(g3z.a);
            f530 f530Var5 = f530Var4;
            fx8 fx8Var = hx8Var.i;
            boolean a2 = ((i4 & 896) == 256) | btsVar.a(true) | btsVar.k(fx8Var) | btsVar.k(fgdVar);
            Object Q2 = btsVar.Q();
            if (a2 || Q2 == o430Var) {
                i5 = 0;
                c530Var2 = c530Var;
                xw8 xw8Var = new xw8(z, tlsVar4, fx8Var, fgdVar, 0);
                btsVar.o0(xw8Var);
                Q2 = xw8Var;
            } else {
                i5 = 0;
                c530Var2 = c530Var;
            }
            sls slsVar = (sls) Q2;
            xw91 xw91Var = ((nx2) btsVar.m(uy2.c)).b;
            f530 q = ljs0.q(f530Var5, 104.0f);
            boolean k = btsVar.k(a) | btsVar.b(16.0f);
            Object Q3 = btsVar.Q();
            if (k || Q3 == o430Var) {
                Q3 = new xo1(a, 3);
                btsVar.o0(Q3);
            }
            f530 a3 = vmb1.a(bb1.g(q, (tls) Q3), true, null, slsVar, 30);
            boolean k2 = btsVar.k(zhVar) | btsVar.a(true) | btsVar.k(slsVar);
            Object Q4 = btsVar.Q();
            if (k2 || Q4 == o430Var) {
                Q4 = new rx3((Object) zhVar, true, (Object) slsVar, 2);
                btsVar.o0(Q4);
            }
            f530 o = an91.o(fnq0.a(a3, (tls) Q4), 8.0f, 0.0f, 8.0f, 8.0f, 2);
            sic a4 = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a4);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            f(hx8Var.e, null, btsVar, i5);
            oeb1.c(btsVar, ljs0.e(c530Var2, 8.0f));
            h(hx8Var.f, null, btsVar, i5);
            g(hx8Var.g, null, btsVar, i5);
            oeb1.c(btsVar, ljs0.e(c530Var2, 8.0f));
            oeb1.c(btsVar, new x2y(1.0f, true));
            b(hx8Var.h, null, btsVar, i5);
            btsVar.t(true);
            f530Var3 = f530Var5;
            tlsVar3 = tlsVar4;
        } else {
            btsVar.Y();
            f530Var3 = f530Var2;
            tlsVar3 = tlsVar2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0(hx8Var, f530Var3, tlsVar3, i, i2);
        }
    }

    public static final void d(hz8 hz8Var, f530 f530Var, tls tlsVar, tpr tprVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1742317085);
        int i2 = (btsVar.k(hz8Var) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.k(tprVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            com.yandex.go.summary.ui.compose.common.layout.b.a(wwg.S(473133775, true, new hh8(6, hz8Var), btsVar), wwg.S(1727915792, true, new xx8(0, tprVar, hz8Var, tlsVar), btsVar), f530Var, btsVar, ((i2 << 3) & 896) | 54);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0(i, 11, tlsVar, f530Var, hz8Var, tprVar);
        }
    }

    public static final void e(androidx.compose.foundation.lazy.b bVar, tpr tprVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-810576893);
        int i2 = (btsVar.k(bVar) ? 4 : 2) | i | (btsVar.k(tprVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new CarouselItemKt$CollectCarouselComposeActionEffect$1$1(tprVar, bVar, null);
                btsVar.o0(Q);
            }
            zpn.f(bVar, tprVar, (wls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(bVar, tprVar, i, 12);
        }
    }

    public static final void f(yfv yfvVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(261854004);
        int i2 = (btsVar.k(yfvVar) ? 4 : 2) | i | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 m = ljs0.m(c530Var, 52.0f);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(null);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            m3u0 f = ffb1.f(yfvVar.a, btsVar, 0);
            boolean k = btsVar.k(f);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new CarouselCellItemKt$ImageItem$1$1(f, oz40Var, null);
                btsVar.o0(Q2);
            }
            zpn.e(btsVar, (wls) Q2, f);
            n8v n8vVar = (n8v) oz40Var.getValue();
            if (n8vVar == null) {
                btsVar.e0(1232788927);
                com.yandex.go.design.compose.loading.b.a(m, null, false, null, null, null, false, btsVar, 384, 250);
                btsVar.t(false);
            } else {
                btsVar.e0(1232879137);
                j4b1.c(n8vVar, m, null, null, null, null, 0.0f, 0, btsVar, 0, 252);
                btsVar = btsVar;
                btsVar.t(false);
            }
            f530Var = c530Var;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(yfvVar, f530Var, i, 10);
        }
    }

    public static final void g(x2v0 x2v0Var, f530 f530Var, fid fidVar, int i) {
        x2v0 x2v0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1741098120);
        int i2 = (btsVar.k(x2v0Var) ? 4 : 2) | i | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            x2v0Var2 = x2v0Var;
            ttb1.a(x2v0Var2, null, k.e(null, 3), k.f(null, 3), "SubtitleItem", wwg.S(1601430096, true, new vw8(0), btsVar), btsVar, (i2 & 14) | 224640, 2);
            f530Var = c530.a;
        } else {
            x2v0Var2 = x2v0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(x2v0Var2, f530Var, i, 8);
        }
    }

    public static final void h(ajz0 ajz0Var, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1909581550);
        int i2 = (btsVar2.k(ajz0Var) ? 4 : 2) | i | 48;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar = btsVar2;
            String str = ajz0Var.a;
            wp2 wp2Var = ajz0Var.b;
            ety0 ety0Var = xya1.e(btsVar).h.a;
            sjy0 sjy0Var = new sjy0(3);
            f530Var2 = c530.a;
            jeb1.f(str, f530Var2, wp2Var, 0L, 0L, null, sjy0Var, 0L, 2, false, 2, 0, null, ety0Var, btsVar, 805306416, 48, 13688);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(ajz0Var, f530Var2, i, 9);
        }
    }
}
