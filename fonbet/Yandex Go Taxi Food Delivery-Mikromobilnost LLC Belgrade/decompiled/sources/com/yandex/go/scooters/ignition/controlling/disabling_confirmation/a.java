package com.yandex.go.scooters.ignition.controlling.disabling_confirmation;

import defpackage.aii0;
import defpackage.apn0;
import defpackage.bpn0;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.hpn0;
import defpackage.rzo;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes13.dex */
public abstract class a {
    public static final void a(hpn0 hpn0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1320630465);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(hpn0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new bpn0(i3, hpn0Var, tlsVar), btsVar), btsVar, 3456, 3);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ScootersIgnitionControllingDisablingConfirmationScreenKt$ScootersIgnitionControllingDisablingConfirmationScreen$2$1(tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(hpn0Var, tlsVar, i, i3);
        }
    }
}
