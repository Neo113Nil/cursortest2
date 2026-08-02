package com.yandex.messaging.ui.di;

import androidx.compose.runtime.f;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.e5z;
import defpackage.fid;
import defpackage.gxm;
import defpackage.hs31;
import defpackage.q1z;
import defpackage.rwi;
import defpackage.s0v;
import defpackage.sb2;
import defpackage.tls;
import defpackage.ut9;
import defpackage.vvf0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zls;

/* loaded from: classes11.dex */
public abstract class a {
    public static final void a(tls tlsVar, tls tlsVar2, zls zlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1804906407);
        if ((((btsVar.e(tlsVar) ? 4 : 2) | i | (btsVar.e(tlsVar2) ? 32 : 16)) & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.e0(1718980289);
            boolean e = btsVar.e(tlsVar) | btsVar.e(tlsVar2);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new InjectKt$Inject$dependencies$2$1(tlsVar, tlsVar2, null);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            rwi rwiVar = (rwi) f.k(btsVar, (wls) Q, null).getValue();
            if (rwiVar != null) {
                b(rwiVar.a, zlsVar, btsVar, 384);
            }
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm(tlsVar, tlsVar2, zlsVar, i, 18);
        }
    }

    public static final void b(hs31 hs31Var, zls zlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-624065674);
        if ((((btsVar.e(hs31Var) ? 4 : 2) | i | (btsVar.k(null) ? 32 : 16)) & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            sb2.c(new vvf0[]{e5z.a.a(hs31Var), q1z.a.a(null)}, wwg.S(-2105108810, true, new ut9(20, zlsVar, hs31Var), btsVar), btsVar, 56);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0v(hs31Var, zlsVar, i, 2);
        }
    }
}
