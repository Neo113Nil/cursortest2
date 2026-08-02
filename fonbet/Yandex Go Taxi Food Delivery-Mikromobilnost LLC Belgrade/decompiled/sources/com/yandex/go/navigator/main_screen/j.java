package com.yandex.go.navigator.main_screen;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.adp;
import defpackage.aii0;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dtr0;
import defpackage.e68;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.ger;
import defpackage.gv9;
import defpackage.gxm;
import defpackage.l700;
import defpackage.lg6;
import defpackage.lpt0;
import defpackage.o430;
import defpackage.ofp0;
import defpackage.ohd;
import defpackage.ooi;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.q0b1;
import defpackage.qab1;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.r901;
import defpackage.rfb1;
import defpackage.sls;
import defpackage.spr;
import defpackage.tls;
import defpackage.up2;
import defpackage.wg6;
import defpackage.whb1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.x700;
import defpackage.xm91;
import defpackage.y7m;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public abstract class j {
    public static final void a(x700 x700Var, tls tlsVar, h hVar, fid fidVar, int i) {
        tls tlsVar2;
        x700 x700Var2;
        char c;
        o430 o430Var;
        c530 c530Var;
        boolean z;
        o430 o430Var2;
        Continuation continuation;
        boolean k;
        Object Q;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1322744290);
        int i2 = i | (btsVar.e(x700Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(hVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar, 48, 0, 8189);
            oz40 oz40Var = a.g;
            float f = x700Var.d ? 0.1f : 0.4f;
            fwi fwiVar = (fwi) btsVar.m(androidx.compose.ui.platform.j.h);
            float f2 = ofp0.d;
            int a2 = ger.a(a, f * f2, true, btsVar, 384, 12);
            boolean z2 = (((dtr0) oz40Var.getValue()).a == -2 || ((dtr0) oz40Var.getValue()).a == -1) ? false : true;
            float intValue = (-a.h.getFloatValue()) / a.B.getIntValue();
            Object Q2 = btsVar.Q();
            o430 o430Var3 = did.a;
            if (Q2 == o430Var3) {
                Q2 = androidx.compose.runtime.f.j(new y7m(108.0f));
                btsVar.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            boolean k2 = btsVar.k(fwiVar);
            Object Q3 = btsVar.Q();
            if (k2 || Q3 == o430Var3) {
                Q3 = new ooi(fwiVar, oz40Var2, 4);
                btsVar.o0(Q3);
            }
            c530 c530Var2 = c530.a;
            f530 b = xm91.b(c530Var2, (tls) Q3);
            float f3 = rfb1.f(a) * (f2 - ((y7m) oz40Var2.getValue()).a);
            lg6 c2 = qab1.c(a, (rfb1.g(a) || ((dtr0) oz40Var.getValue()).a == -2) ? AppColor$Palette.Fog : new up2(up2.b), null, btsVar, 384, 0);
            byk0 e = cyk0.e(40.0f, 40.0f, 0.0f, 0.0f, 12);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, c530Var2);
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
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            if (((dtr0) oz40Var.getValue()).a == -1) {
                btsVar.e0(-294455142);
                btsVar.t(false);
                c530Var = c530Var2;
                o430Var = o430Var3;
                z = false;
                c = HexString.CHAR_SPACE;
                btsVar = btsVar;
            } else {
                btsVar.e0(-295404610);
                q0b1.a(btsVar, 0);
                String str = x700Var.e;
                String str2 = x700Var.f;
                String str3 = x700Var.g;
                spr sprVar = x700Var.a;
                r901 r901Var = sprVar.a;
                e68 e68Var = sprVar.b;
                lpt0 lpt0Var = x700Var.h;
                int i3 = i2 & 112;
                c = HexString.CHAR_SPACE;
                boolean z3 = i3 == 32;
                Object Q4 = btsVar.Q();
                if (z3 || Q4 == o430Var3) {
                    Q4 = new adp(9, tlsVar);
                    btsVar.o0(Q4);
                }
                o430Var = o430Var3;
                btsVar = btsVar;
                c530Var = c530Var2;
                z = false;
                whb1.a(b, str, str2, str3, r901Var, e68Var, lpt0Var, (tls) Q4, btsVar, 32768);
                btsVar.t(false);
            }
            boolean z4 = z;
            com.yandex.go.design.compose.modal.bottomsheet.c.a(c530Var, a, c2, false, false, null, null, null, wwg.S(1423345691, true, new l700(a, intValue, x700Var, f3, tlsVar, hVar), btsVar), null, null, wwg.S(1901267080, true, new gv9(e, z2, x700Var, tlsVar, 3), btsVar), btsVar, 100687878, 48, 1768);
            btsVar.t(true);
            boolean k3 = btsVar.k(a) | ((i2 & 112) == 32 ? true : z4);
            Object Q5 = btsVar.Q();
            if (k3) {
                o430Var2 = o430Var;
            } else {
                o430Var2 = o430Var;
                if (Q5 != o430Var2) {
                    tlsVar2 = tlsVar;
                    continuation = null;
                    zpn.e(btsVar, (wls) Q5, zy11.a);
                    x700Var2 = x700Var;
                    Boolean valueOf = Boolean.valueOf(x700Var2.d);
                    k = btsVar.k(a) | (((i2 & 14) != 4 || btsVar.e(x700Var2)) ? true : z4) | btsVar.c(a2);
                    Q = btsVar.Q();
                    if (!k || Q == o430Var2) {
                        Q = new MainModalScreenKt$MainModalScreen$3$1(x700Var2, a, a2, continuation);
                        btsVar.o0(Q);
                    }
                    zpn.e(btsVar, (wls) Q, valueOf);
                }
            }
            tlsVar2 = tlsVar;
            continuation = null;
            Q5 = new MainModalScreenKt$MainModalScreen$2$1(a, tlsVar2, null);
            btsVar.o0(Q5);
            zpn.e(btsVar, (wls) Q5, zy11.a);
            x700Var2 = x700Var;
            Boolean valueOf2 = Boolean.valueOf(x700Var2.d);
            k = btsVar.k(a) | (((i2 & 14) != 4 || btsVar.e(x700Var2)) ? true : z4) | btsVar.c(a2);
            Q = btsVar.Q();
            if (!k) {
            }
            Q = new MainModalScreenKt$MainModalScreen$3$1(x700Var2, a, a2, continuation);
            btsVar.o0(Q);
            zpn.e(btsVar, (wls) Q, valueOf2);
        } else {
            tlsVar2 = tlsVar;
            x700Var2 = x700Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm(x700Var2, tlsVar2, hVar, i, 23);
        }
    }
}
