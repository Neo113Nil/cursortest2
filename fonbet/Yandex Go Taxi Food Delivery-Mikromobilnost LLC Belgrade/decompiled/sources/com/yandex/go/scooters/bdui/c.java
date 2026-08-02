package com.yandex.go.scooters.bdui;

import com.yandex.go.scooters.bdui.api.ScootersBduiScreenType;
import com.yandex.go.scooters.bdui.view.ScootersComposeToDivkitCompatFrameLayout;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c8i0;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.o430;
import defpackage.pjr;
import defpackage.q0n0;
import defpackage.r0n0;
import defpackage.r2z0;
import defpackage.rzo;
import defpackage.tls;
import defpackage.vam0;
import defpackage.vnf0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.xhr;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public abstract class c {
    public static final void a(xhr xhrVar, pjr pjrVar, ScootersComposeToDivkitCompatFrameLayout scootersComposeToDivkitCompatFrameLayout, fid fidVar, int i) {
        int i2;
        xhr xhrVar2 = xhrVar;
        pjr pjrVar2 = pjrVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-70217377);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(xhrVar2) : btsVar.e(xhrVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(pjrVar2) : btsVar.e(pjrVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar.k(scootersComposeToDivkitCompatFrameLayout) : btsVar.e(scootersComposeToDivkitCompatFrameLayout) ? 256 : 128;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new r0n0();
                btsVar.o0(Q);
            }
            r0n0 r0n0Var = (r0n0) Q;
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            boolean z = (i4 == 32 || ((i3 & 64) != 0 && btsVar.e(pjrVar2))) | (i5 == 4 || ((i3 & 8) != 0 && btsVar.e(xhrVar2))) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && btsVar.e(scootersComposeToDivkitCompatFrameLayout)));
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                ScootersBduiScreenKt$DivKitLifecycle$1$1 scootersBduiScreenKt$DivKitLifecycle$1$1 = new ScootersBduiScreenKt$DivKitLifecycle$1$1(pjrVar2, xhrVar2, scootersComposeToDivkitCompatFrameLayout, r0n0Var, null);
                pjrVar2 = pjrVar2;
                xhrVar2 = xhrVar2;
                btsVar.o0(scootersBduiScreenKt$DivKitLifecycle$1$1);
                Q2 = scootersBduiScreenKt$DivKitLifecycle$1$1;
            }
            zy11 zy11Var = zy11.a;
            zpn.e(btsVar, (wls) Q2, zy11Var);
            boolean z2 = (i5 == 4 || ((i3 & 8) != 0 && btsVar.e(xhrVar2))) | (i4 == 32 || ((i3 & 64) != 0 && btsVar.e(pjrVar2)));
            Object Q3 = btsVar.Q();
            if (z2 || Q3 == o430Var) {
                Q3 = new vam0(12, xhrVar2, pjrVar2);
                btsVar.o0(Q3);
            }
            zpn.a(zy11Var, (tls) Q3, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(xhrVar2, pjrVar2, scootersComposeToDivkitCompatFrameLayout, i, 28);
        }
    }

    public static final void b(f530 f530Var, ScootersComposeToDivkitCompatFrameLayout scootersComposeToDivkitCompatFrameLayout, xhr xhrVar, pjr pjrVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1252759825);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(scootersComposeToDivkitCompatFrameLayout) : btsVar.e(scootersComposeToDivkitCompatFrameLayout) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar.k(xhrVar) : btsVar.e(xhrVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= (i & 4096) == 0 ? btsVar.k(pjrVar) : btsVar.e(pjrVar) ? 2048 : 1024;
        }
        boolean z = false;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && btsVar.e(scootersComposeToDivkitCompatFrameLayout))) {
                z = true;
            }
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new q0n0(scootersComposeToDivkitCompatFrameLayout, 1);
                btsVar.o0(Q);
            }
            tls tlsVar = (tls) Q;
            int i3 = i2 << 3;
            androidx.compose.ui.viewinterop.b.a(tlsVar, f530Var, null, btsVar, i3 & 112, 4);
            a(xhrVar, pjrVar, scootersComposeToDivkitCompatFrameLayout, btsVar, ((i2 >> 6) & HProv.PP_DELETE_SAVED_PASSWD) | (ScootersComposeToDivkitCompatFrameLayout.$stable << 6) | (i3 & 896));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0(f530Var, scootersComposeToDivkitCompatFrameLayout, xhrVar, pjrVar, i, 6);
        }
    }

    public static final void c(xhr xhrVar, pjr pjrVar, ScootersBduiScreenType scootersBduiScreenType, boolean z, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1092137593);
        int i2 = (btsVar.k(xhrVar) ? 4 : 2) | i | (btsVar.k(pjrVar) ? 32 : 16) | (btsVar.c(scootersBduiScreenType.ordinal()) ? 256 : 128) | (btsVar.a(z) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new a(scootersBduiScreenType, z, xhrVar, pjrVar), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(xhrVar, pjrVar, scootersBduiScreenType, z, i, 16);
        }
    }
}
