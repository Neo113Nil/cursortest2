package com.yandex.go.summary.ui.compose.mapcontent;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.b0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cjb1;
import defpackage.cma1;
import defpackage.did;
import defpackage.dx2;
import defpackage.f530;
import defpackage.fid;
import defpackage.i9a1;
import defpackage.iez;
import defpackage.jpa1;
import defpackage.lr20;
import defpackage.n6w;
import defpackage.ng00;
import defpackage.nww0;
import defpackage.o430;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.qor;
import defpackage.r1b0;
import defpackage.s1a1;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.ug00;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xm91;
import defpackage.yn91;
import defpackage.yur;
import defpackage.yx40;
import defpackage.z91;
import defpackage.zpn;

/* loaded from: classes14.dex */
public abstract class a {
    public static final void a(ug00 ug00Var, f530 f530Var, yur yurVar, qor qorVar, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-406658306);
        int i2 = i | (btsVar.k(ug00Var) ? 4 : 2) | 48 | (btsVar.k(qorVar) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = ug00Var.a != null;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.g(0);
                btsVar.o0(Q);
            }
            yx40 yx40Var = (yx40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.g(0);
                btsVar.o0(Q2);
            }
            yx40 yx40Var2 = (yx40) Q2;
            int i3 = ((i2 >> 9) & 112) | 6;
            b(yx40Var, tlsVar, btsVar, i3);
            c(yx40Var2, tlsVar, btsVar, i3);
            c530 c530Var = c530.a;
            f530 f = i9a1.f(c530Var);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new dx2(yx40Var, 8);
                btsVar.o0(Q3);
            }
            f530 g = s1a1.g(xm91.b(f, (tls) Q3), qorVar.getFloatValue());
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, g);
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
            z91 z91Var = ug00Var.a;
            yur yurVar2 = z ? yurVar : null;
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var) {
                Q4 = new iez(25);
                btsVar.o0(Q4);
            }
            int i4 = ((i2 >> 12) & 14) | 48;
            jpa1.c(z91Var, null, yurVar2, yn91.g(tlsVar, (tls) Q4, btsVar, i4), btsVar, 0);
            Object Q5 = btsVar.Q();
            if (Q5 == o430Var) {
                Q5 = new dx2(yx40Var2, 9);
                btsVar.o0(Q5);
            }
            f530 b = xm91.b(c530Var, (tls) Q5);
            nww0 nww0Var = ug00Var.b;
            yur yurVar3 = !z ? yurVar : null;
            Object Q6 = btsVar.Q();
            if (Q6 == o430Var) {
                Q6 = new iez(26);
                btsVar.o0(Q6);
            }
            cjb1.b(nww0Var, b, yurVar3, yn91.g(tlsVar, (tls) Q6, btsVar, i4), btsVar, 48, 0);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0(f530Var2, (Object) ug00Var, (Object) yurVar, (Object) qorVar, (Object) tlsVar, i, 20);
        }
    }

    public static final void b(n6w n6wVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1599556651);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n6wVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new MapContentItemKt$SendMapContentHeightChangedUiActionEffect$1$1(n6wVar, tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.f(n6wVar, tlsVar, (wls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ng00(n6wVar, tlsVar, i, 1);
        }
    }

    public static final void c(n6w n6wVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1023439554);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n6wVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new MapContentItemKt$SendSurgeWidgetHeightChangedUiActionEffect$1$1(n6wVar, tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.f(n6wVar, tlsVar, (wls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ng00(n6wVar, tlsVar, i, 0);
        }
    }
}
