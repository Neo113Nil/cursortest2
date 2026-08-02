package com.yandex.passport.internal.ui.router;

import com.yandex.passport.R;
import com.yandex.passport.internal.ui.router.GlobalRouterBackground;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.cma1;
import defpackage.f530;
import defpackage.fid;
import defpackage.hob1;
import defpackage.jl40;
import defpackage.k3r;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.mhe;
import defpackage.mt71;
import defpackage.ohd;
import defpackage.pa90;
import defpackage.pi6;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rfc;
import defpackage.sls;
import defpackage.unr0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.z910;

/* loaded from: classes2.dex */
public abstract class f {
    public static final void a(GlobalRouterBackground globalRouterBackground, fid fidVar, int i) {
        pa90 rfcVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-766802496);
        if ((((btsVar.k(globalRouterBackground) ? 4 : 2) | i) & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            k3r k3rVar = ljs0.c;
            if (globalRouterBackground instanceof GlobalRouterBackground.ColorTransparent) {
                btsVar.e0(-1129906261);
                btsVar.t(false);
                rfcVar = new rfc(ldc.l);
            } else if (globalRouterBackground instanceof GlobalRouterBackground.ImageResource) {
                btsVar.e0(-1129763351);
                rfcVar = mt71.m(((GlobalRouterBackground.ImageResource) globalRouterBackground).getValue(), 0, btsVar);
                btsVar.t(false);
            } else {
                if (!(globalRouterBackground instanceof GlobalRouterBackground.Roundabout)) {
                    throw unr0.y(102096418, btsVar, false);
                }
                btsVar.e0(-1129620441);
                rfcVar = new rfc(hob1.a(btsVar, R.color.passport_roundabout_background));
                btsVar.t(false);
            }
            f530 j0 = cma1.j0(k3rVar, rfcVar, null, mhe.g, 0.0f, null, 54);
            z910 d = pi6.d(x4c.b, false);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, j0);
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
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.internal.ui.bouncer.error.n(globalRouterBackground, i, 4);
        }
    }
}
