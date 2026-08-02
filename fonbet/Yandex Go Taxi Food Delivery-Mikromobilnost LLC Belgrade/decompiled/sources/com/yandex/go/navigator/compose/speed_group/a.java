package com.yandex.go.navigator.compose.speed_group;

import defpackage.aii0;
import defpackage.bb1;
import defpackage.bts;
import defpackage.cs0;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.id00;
import defpackage.mq1;
import defpackage.o430;
import defpackage.pi6;
import defpackage.rzo;
import defpackage.tls;
import defpackage.tra1;
import defpackage.wls;
import defpackage.zpn;

/* loaded from: classes11.dex */
public abstract class a {
    public static final void a(f530 f530Var, boolean z, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1931883919);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = id00.a(0.0f);
                btsVar.o0(Q);
            }
            androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) Q;
            Boolean valueOf = Boolean.valueOf(z);
            boolean e = btsVar.e(aVar) | ((i2 & 14) == 4);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new AlarmLayerKt$AlarmLayer$1$1(aVar, null, z);
                btsVar.o0(Q2);
            }
            zpn.e(btsVar, (wls) Q2, valueOf);
            long d = rzo.d(872372055);
            f530 b = tra1.b(f530Var, ((Number) aVar.e()).floatValue());
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new cs0(d, i3);
                btsVar.o0(Q3);
            }
            pi6.a(bb1.g(b, (tls) Q3), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mq1(z, f530Var, i);
        }
    }
}
