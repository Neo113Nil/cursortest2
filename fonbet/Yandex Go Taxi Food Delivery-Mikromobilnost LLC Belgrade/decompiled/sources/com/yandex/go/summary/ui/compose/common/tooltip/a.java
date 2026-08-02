package com.yandex.go.summary.ui.compose.common.tooltip;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.summary.ui.model.common.tooltip.TooltipAlignment;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.did;
import defpackage.eja1;
import defpackage.f530;
import defpackage.fid;
import defpackage.nhz0;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qje;
import defpackage.quz0;
import defpackage.qwd;
import defpackage.r1b0;
import defpackage.rmy0;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.wu60;
import defpackage.x4c;
import defpackage.ypv0;
import defpackage.yx40;
import defpackage.z910;
import defpackage.zhb0;
import defpackage.zjy0;
import defpackage.zpn;
import defpackage.zpv0;

/* loaded from: classes14.dex */
public abstract class a {
    public static final qwd a = new qwd(new nhz0(8));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [bts, fid, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.runtime.internal.a] */
    public static final void a(String str, quz0 quz0Var, f530 f530Var, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        androidx.compose.runtime.internal.a aVar2;
        f530 f530Var2;
        Object tooltipControllerBoxKt$TooltipControllerBox$2$1;
        Object obj;
        oz40 oz40Var;
        ypv0 ypv0Var;
        zpv0 zpv0Var;
        ?? r7 = (bts) fidVar;
        r7.g0(234405981);
        int i2 = i | (r7.k(str) ? 4 : 2) | (r7.k(quz0Var) ? 32 : 16) | 384;
        if (r7.V(i2 & 1, (i2 & 1171) != 1170)) {
            ypv0 ypv0Var2 = (ypv0) r7.m(a);
            Object Q = r7.Q();
            Object obj2 = did.a;
            if (Q == obj2) {
                Q = f.j(new wu60(0L));
                r7.o0(Q);
            }
            oz40 oz40Var2 = (oz40) Q;
            Object Q2 = r7.Q();
            if (Q2 == obj2) {
                Q2 = f.g(0);
                r7.o0(Q2);
            }
            yx40 yx40Var = (yx40) Q2;
            Object Q3 = r7.Q();
            if (Q3 == obj2) {
                Q3 = f.j(TooltipAlignment.START);
                r7.o0(Q3);
            }
            oz40 oz40Var3 = (oz40) Q3;
            oz40 n = f.n(quz0Var, r7);
            Object Q4 = r7.Q();
            if (Q4 == obj2) {
                Q4 = f.j(null);
                r7.o0(Q4);
            }
            oz40 oz40Var4 = (oz40) Q4;
            boolean k = r7.k(n);
            Object Q5 = r7.Q();
            if (k || Q5 == obj2) {
                zpv0 zpv0Var2 = new zpv0(str, oz40Var3, n, oz40Var2, yx40Var);
                r7.o0(zpv0Var2);
                Q5 = zpv0Var2;
            }
            zpv0 zpv0Var3 = (zpv0) Q5;
            Object Q6 = r7.Q();
            if (Q6 == obj2) {
                Q6 = new rmy0(15, oz40Var2, yx40Var);
                r7.o0(Q6);
            }
            f530Var2 = c530.a;
            f530 y = eja1.y(f530Var2, (tls) Q6);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(r7.T);
            r1b0 o = r7.o();
            f530 d2 = b.d(r7, y);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (r7.a == null) {
                cma1.b0();
                throw null;
            }
            r7.i0();
            if (r7.S) {
                r7.n(slsVar);
            } else {
                r7.r0();
            }
            qje.W(r7, d.f, d);
            qje.W(r7, d.e, o);
            qje.W(r7, d.g, Integer.valueOf(hashCode));
            qje.M(r7, d.h);
            qje.W(r7, d.d, d2);
            ?? r8 = aVar;
            r8.invoke(cj6.a, r7, 54);
            r7.t(true);
            boolean k2 = r7.k(n) | r7.k(zpv0Var3) | r7.e(ypv0Var2);
            Object Q7 = r7.Q();
            if (k2 || Q7 == obj2) {
                obj = obj2;
                oz40Var = oz40Var4;
                tooltipControllerBoxKt$TooltipControllerBox$2$1 = new TooltipControllerBoxKt$TooltipControllerBox$2$1(oz40Var, n, oz40Var3, ypv0Var2, zpv0Var3, null);
                ypv0Var = ypv0Var2;
                zpv0Var = zpv0Var3;
                r7.o0(tooltipControllerBoxKt$TooltipControllerBox$2$1);
            } else {
                ypv0Var = ypv0Var2;
                tooltipControllerBoxKt$TooltipControllerBox$2$1 = Q7;
                zpv0Var = zpv0Var3;
                obj = obj2;
                oz40Var = oz40Var4;
            }
            zpn.g(n, zpv0Var, oz40Var, (wls) tooltipControllerBoxKt$TooltipControllerBox$2$1, r7);
            boolean e = r7.e(ypv0Var) | ((i2 & 14) == 4);
            Object Q8 = r7.Q();
            if (e || Q8 == obj) {
                Q8 = new zjy0(6, oz40Var, ypv0Var, str);
                r7.o0(Q8);
            }
            zpn.a(oz40Var, (tls) Q8, r7);
            aVar2 = r8;
        } else {
            aVar2 = aVar;
            r7.Y();
            f530Var2 = f530Var;
        }
        aii0 v = r7.v();
        if (v != null) {
            v.d = new zhb0(str, quz0Var, f530Var2, aVar2, i, 26);
        }
    }
}
