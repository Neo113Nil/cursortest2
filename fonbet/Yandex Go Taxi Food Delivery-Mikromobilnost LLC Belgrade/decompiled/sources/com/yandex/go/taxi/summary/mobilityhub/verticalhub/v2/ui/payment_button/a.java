package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.payment_button;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.a1v;
import defpackage.aii0;
import defpackage.an91;
import defpackage.awk0;
import defpackage.b1v;
import defpackage.bm50;
import defpackage.bts;
import defpackage.bzk0;
import defpackage.c1v;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.h111;
import defpackage.ivy;
import defpackage.jl40;
import defpackage.k3r;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lv90;
import defpackage.m1a0;
import defpackage.o430;
import defpackage.ofb1;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.q791;
import defpackage.qgy;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sd31;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.td31;
import defpackage.tls;
import defpackage.unr0;
import defpackage.uo5;
import defpackage.utb1;
import defpackage.vfc;
import defpackage.wls;
import defpackage.ww90;
import defpackage.x4c;
import defpackage.xw90;
import defpackage.xya1;
import defpackage.y0v;
import defpackage.ypu;
import defpackage.z0a0;
import defpackage.z0v;
import defpackage.z910;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes14.dex */
public abstract class a {
    public static final void a(c1v c1vVar, z0a0 z0a0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        boolean z;
        boolean z2;
        bts btsVar2;
        boolean z3;
        Object obj;
        bts btsVar3;
        String str;
        boolean z4;
        Object obj2;
        uo5 uo5Var = x4c.y;
        bts btsVar4 = (bts) fidVar;
        btsVar4.g0(1881936566);
        dmw0 dmw0Var = btsVar4.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar4.k(c1vVar) : btsVar4.e(c1vVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar4.k(z0a0Var) : btsVar4.e(z0a0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar4.e(tlsVar) ? 256 : 128;
        }
        if (btsVar4.V(i2 & 1, (i2 & 147) != 146)) {
            k3r k3rVar = ljs0.b;
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar4.T);
            r1b0 o = btsVar4.o();
            f530 d2 = b.d(btsVar4, k3rVar);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar4.i0();
            if (btsVar4.S) {
                btsVar4.n(slsVar);
            } else {
                btsVar4.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar4, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar4, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar4, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar4, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar4, wlsVar4, d2);
            boolean z5 = c1vVar instanceof a1v;
            o430 o430Var = did.a;
            c530 c530Var = c530.a;
            cj6 cj6Var = cj6.a;
            if (z5) {
                btsVar4.e0(974870432);
                a1v a1vVar = (a1v) c1vVar;
                lv90 lv90Var = a1vVar.b;
                m1a0 m1a0Var = a1vVar.a;
                PaymentMethod$Type a = lv90Var.a().a();
                if (a == null || (str = a.getCode()) == null) {
                    str = "";
                }
                tlsVar.invoke(new td31(str));
                f530 a2 = cj6Var.a(c530Var, uo5Var);
                boolean e = ((i2 & 896) == 256) | btsVar4.e(lv90Var);
                Object Q = btsVar4.Q();
                Object obj3 = Q;
                if (e || Q == o430Var) {
                    bm50 bm50Var = new bm50(29, tlsVar, lv90Var);
                    btsVar4.o0(bm50Var);
                    obj3 = bm50Var;
                }
                f530 b = q791.b(a2, null, null, false, null, new awk0(0), (sls) obj3, 12);
                Object Q2 = btsVar4.Q();
                Object obj4 = Q2;
                if (Q2 == o430Var) {
                    PaymentButtonKt$PaymentButton$1$2$1 paymentButtonKt$PaymentButton$1$2$1 = PaymentButtonKt$PaymentButton$1$2$1.a;
                    btsVar4.o0(paymentButtonKt$PaymentButton$1$2$1);
                    obj4 = paymentButtonKt$PaymentButton$1$2$1;
                }
                tls tlsVar3 = (tls) obj4;
                boolean e2 = ((i2 & 112) == 32 || ((i2 & 64) != 0 && btsVar4.e(z0a0Var))) | btsVar4.e(m1a0Var);
                Object Q3 = btsVar4.Q();
                if (e2 || Q3 == o430Var) {
                    z4 = false;
                    ww90 ww90Var = new ww90(0, m1a0Var, z0a0Var);
                    btsVar4.o0(ww90Var);
                    obj2 = ww90Var;
                } else {
                    z4 = false;
                    obj2 = Q3;
                }
                androidx.compose.ui.viewinterop.b.a(tlsVar3, b, (tls) obj2, btsVar4, 6, 0);
                btsVar4.t(z4);
            } else if (c1vVar instanceof b1v) {
                btsVar4.e0(975643789);
                h111 h111Var = ((b1v) c1vVar).a;
                if (h111Var.a == null) {
                    btsVar4.e0(975643788);
                    z3 = false;
                    btsVar4.t(false);
                } else {
                    btsVar4.e0(975643789);
                    tlsVar.invoke(new sd31(h111Var.j));
                    f530 a3 = cj6Var.a(c530Var, uo5Var);
                    boolean z6 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && btsVar4.e(c1vVar))) | ((i2 & 896) == 256);
                    Object Q4 = btsVar4.Q();
                    if (z6 || Q4 == o430Var) {
                        z3 = false;
                        xw90 xw90Var = new xw90(0, c1vVar, tlsVar);
                        btsVar4.o0(xw90Var);
                        obj = xw90Var;
                    } else {
                        z3 = false;
                        obj = Q4;
                    }
                    utb1.a(h111Var, an91.m(q791.b(a3, null, null, false, null, new awk0(z3 ? 1 : 0), (sls) obj, 12), 12.0f, 0.0f, 2), btsVar4, z3 ? 1 : 0);
                    btsVar4.t(z3);
                }
                btsVar4.t(z3);
            } else {
                if (c1vVar instanceof y0v) {
                    btsVar4.e0(976597039);
                    f530 a4 = cj6Var.a(c530Var, uo5Var);
                    sic a5 = qic.a(lr20.c, x4c.G, btsVar4, 0);
                    int hashCode2 = Long.hashCode(btsVar4.T);
                    r1b0 o2 = btsVar4.o();
                    f530 d3 = b.d(btsVar4, a4);
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar);
                    } else {
                        btsVar4.r0();
                    }
                    qje.W(btsVar4, wlsVar, a5);
                    qje.W(btsVar4, wlsVar2, o2);
                    vfc.v(hashCode2, btsVar4, wlsVar3, btsVar4, tlsVar2);
                    qje.W(btsVar4, wlsVar4, d3);
                    pi6.a(ofb1.b(bzk0.c(ljs0.n(an91.l(c530Var, 12.0f, 6.0f), 36.0f, 24.0f), AppColor$Palette.BgMinor, cyk0.c(4.0f)), false, null, 15), btsVar4, 0);
                    h111 h111Var2 = ((y0v) c1vVar).a;
                    CharSequence charSequence = h111Var2 != null ? h111Var2.g : null;
                    if (charSequence == null) {
                        btsVar4.e0(-802227563);
                        btsVar4.t(false);
                        z2 = false;
                        z = true;
                        btsVar2 = btsVar4;
                    } else {
                        btsVar4.e0(-802227562);
                        z2 = false;
                        z = true;
                        qgy.b(charSequence, charSequence.toString(), ofb1.b(new ypu(x4c.H), false, null, 15), null, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, xya1.e(btsVar4).h.a, null, btsVar4, 0, 0, 12152);
                        bts btsVar5 = btsVar4;
                        btsVar5.t(false);
                        btsVar2 = btsVar5;
                    }
                    btsVar2.t(z);
                    btsVar2.t(z2);
                    btsVar3 = btsVar2;
                } else {
                    z = true;
                    if (!jl40.l(c1vVar, z0v.a)) {
                        throw unr0.y(862731300, btsVar4, false);
                    }
                    btsVar4.e0(977357252);
                    btsVar4.t(false);
                    btsVar3 = btsVar4;
                }
                btsVar3.t(z);
                btsVar = btsVar3;
            }
            z = true;
            btsVar3 = btsVar4;
            btsVar3.t(z);
            btsVar = btsVar3;
        } else {
            btsVar4.Y();
            btsVar = btsVar4;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(c1vVar, z0a0Var, tlsVar, i, 23);
        }
    }
}
