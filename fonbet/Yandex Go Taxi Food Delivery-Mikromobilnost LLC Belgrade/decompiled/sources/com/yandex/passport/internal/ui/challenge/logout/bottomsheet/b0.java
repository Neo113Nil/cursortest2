package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.pey;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.rx3;
import defpackage.sls;
import defpackage.tls;
import defpackage.tse;
import defpackage.w8f;
import defpackage.wls;
import defpackage.wwg;
import defpackage.yr31;
import defpackage.zpn;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public abstract class b0 {
    public static final void a(s sVar, boolean z, tls tlsVar, tls tlsVar2, sls slsVar, sls slsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1603810033);
        int i2 = i | (btsVar.k(sVar) ? 4 : 2) | (btsVar.a(z) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.e(tlsVar2) ? 2048 : 1024) | (btsVar.e(slsVar) ? 16384 : 8192) | (btsVar.e(slsVar2) ? 131072 : 65536);
        if ((74899 & i2) == 74898 && btsVar.E()) {
            btsVar.Y();
        } else {
            androidx.compose.material3.w f = androidx.compose.material3.p.f(6, 2, btsVar, null);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(Q);
            }
            tse tseVar = (tse) Q;
            k0 viewModelFactory = sVar.getViewModelFactory();
            rs31 a = f5z.a(btsVar);
            if (a == null) {
                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            yr31 G = ooc.G(qoi0.a(m0.class), a, null, viewModelFactory, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
            btsVar = btsVar;
            m0 m0Var = (m0) G;
            oz40 b = androidx.compose.runtime.f.b(m0Var.c, btsVar);
            btsVar.e0(2044357940);
            Object Q2 = btsVar.Q();
            if (Q2 == obj) {
                Q2 = androidx.compose.runtime.f.j(Boolean.FALSE);
                btsVar.o0(Q2);
            }
            oz40 oz40Var = (oz40) Q2;
            btsVar.t(false);
            kotlinx.coroutines.flow.b bVar = m0Var.w;
            btsVar.e0(2044360439);
            boolean z2 = (i2 & 7168) == 2048;
            Object Q3 = btsVar.Q();
            if (z2 || Q3 == obj) {
                Q3 = new LogoutBottomSheetComposeScreenKt$LogoutBottomSheetComposeScreen$1$1(tlsVar2, null);
                btsVar.o0(Q3);
            }
            btsVar.t(false);
            com.yandex.passport.common.ui.compose.d.a(bVar, (wls) Q3, btsVar, 0);
            Throwable th = ((l0) b.getValue()).b;
            btsVar.e0(2044366251);
            if (th != null) {
                btsVar.e0(-686815084);
                boolean e = btsVar.e(th) | ((i2 & 896) == 256);
                Object Q4 = btsVar.Q();
                if (e || Q4 == obj) {
                    Q4 = new LogoutBottomSheetComposeScreenKt$LogoutBottomSheetComposeScreen$2$1$1(tlsVar, th, null);
                    btsVar.o0(Q4);
                }
                btsVar.t(false);
                zpn.e(btsVar, (wls) Q4, th);
                btsVar.t(false);
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new u(sVar, z, tlsVar, tlsVar2, slsVar, slsVar2, i, 0);
                    return;
                }
                return;
            }
            btsVar.t(false);
            pey peyVar = (pey) btsVar.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            btsVar.e0(2044372821);
            boolean e2 = ((i2 & 112) == 32) | btsVar.e(peyVar);
            Object Q5 = btsVar.Q();
            if (e2 || Q5 == obj) {
                Q5 = new rx3(peyVar, z, oz40Var, 24);
                btsVar.o0(Q5);
            }
            btsVar.t(false);
            zpn.b(peyVar, f, (tls) Q5, btsVar);
            o0 o0Var = ((l0) b.getValue()).a;
            if (o0Var != null && ((Boolean) oz40Var.getValue()).booleanValue()) {
                btsVar.e0(2044393722);
                boolean z3 = (i2 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072;
                Object Q6 = btsVar.Q();
                if (z3 || Q6 == obj) {
                    Q6 = new p(1, slsVar2);
                    btsVar.o0(Q6);
                }
                btsVar.t(false);
                androidx.compose.runtime.internal.a S = wwg.S(1389187968, true, new y(o0Var, sVar, tseVar, f, slsVar2, tlsVar2, slsVar, oz40Var), btsVar);
                btsVar = btsVar;
                com.yandex.passport.internal.properties.u.e((sls) Q6, null, f, S, btsVar, HProv.ALG_TYPE_SECURECHANNEL);
            }
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new u(sVar, z, tlsVar, tlsVar2, slsVar, slsVar2, i, 1);
        }
    }
}
