package com.yandex.go.summary.ui.compose.common.layout;

import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.bts;
import defpackage.cdr;
import defpackage.cma1;
import defpackage.did;
import defpackage.etm;
import defpackage.f530;
import defpackage.fid;
import defpackage.id00;
import defpackage.nnm;
import defpackage.o430;
import defpackage.ohd;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sls;
import defpackage.wls;
import defpackage.yx40;
import defpackage.z910;
import defpackage.zpn;

/* loaded from: classes14.dex */
public abstract class b {
    public static final void a(androidx.compose.runtime.internal.a aVar, androidx.compose.runtime.internal.a aVar2, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1545769806);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.g(0);
                btsVar.o0(Q);
            }
            yx40 yx40Var = (yx40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = id00.a(0.0f);
                btsVar.o0(Q2);
            }
            androidx.compose.animation.core.a aVar3 = (androidx.compose.animation.core.a) Q2;
            boolean e = btsVar.e(aVar3);
            Object Q3 = btsVar.Q();
            if (e || Q3 == o430Var) {
                Q3 = new FirstHeightSecondDrawLayoutKt$FirstHeightSecondDrawLayout$1$1(yx40Var, aVar3, null);
                btsVar.o0(Q3);
            }
            zpn.f(yx40Var, aVar3, (wls) Q3, btsVar);
            boolean e2 = btsVar.e(aVar3);
            Object Q4 = btsVar.Q();
            if (e2 || Q4 == o430Var) {
                Q4 = new cdr(yx40Var, aVar3);
                btsVar.o0(Q4);
            }
            z910 z910Var = (z910) Q4;
            int i3 = i2 >> 3;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, f530Var);
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
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            aVar.invoke(btsVar, Integer.valueOf(i2 & 14));
            nnm.p(i3 & 14, aVar2, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(aVar, aVar2, f530Var, i, 12);
        }
    }
}
