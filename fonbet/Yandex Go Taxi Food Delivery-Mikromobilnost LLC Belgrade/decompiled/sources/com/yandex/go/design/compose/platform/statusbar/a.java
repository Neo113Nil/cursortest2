package com.yandex.go.design.compose.platform.statusbar;

import androidx.compose.runtime.f;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c3u0;
import defpackage.dhd;
import defpackage.did;
import defpackage.fid;
import defpackage.g8u0;
import defpackage.o430;
import defpackage.oz40;
import defpackage.scs0;
import defpackage.sls;
import defpackage.tls;
import defpackage.vxd;
import defpackage.wls;
import defpackage.zpn;

/* loaded from: classes.dex */
public abstract class a {
    public static final g8u0 a = new g8u0();
    public static final oz40 b = f.j(new c3u0(8));

    public static final void a(boolean z, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1680827393);
        int i2 = (btsVar.a(z) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new Object();
                btsVar.o0(Q);
            }
            dhd dhdVar = (dhd) ((sls) b.getValue()).invoke();
            Boolean valueOf = Boolean.valueOf(z);
            boolean e = btsVar.e(dhdVar) | btsVar.e(Q) | ((i2 & 14) == 4);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new StatusBarControllerKt$forceStatusBarColors$1$1(dhdVar, Q, z, null);
                btsVar.o0(Q2);
            }
            zpn.g(valueOf, Q, dhdVar, (wls) Q2, btsVar);
            boolean e2 = btsVar.e(dhdVar) | btsVar.e(Q);
            Object Q3 = btsVar.Q();
            if (e2 || Q3 == o430Var) {
                Q3 = new scs0(15, dhdVar, Q);
                btsVar.o0(Q3);
            }
            zpn.b(Q, dhdVar, (tls) Q3, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vxd(z, i, 9);
        }
    }
}
