package com.yandex.passport.internal.ui.challenge.logout;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.tls;
import defpackage.w8f;
import defpackage.wls;
import defpackage.zpn;

/* loaded from: classes2.dex */
public abstract class m {
    public static final void a(k kVar, tls tlsVar, tls tlsVar2, tls tlsVar3, fid fidVar, int i) {
        tls tlsVar4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1398203472);
        int i2 = i | (btsVar.k(kVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(tlsVar2) ? 256 : 128) | (btsVar.e(tlsVar3) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
            tlsVar4 = tlsVar2;
        } else {
            o viewModelFactory = kVar.getViewModelFactory();
            rs31 a = f5z.a(btsVar);
            if (a == null) {
                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            r rVar = (r) ooc.G(qoi0.a(r.class), a, null, viewModelFactory, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
            oz40 b = androidx.compose.runtime.f.b(rVar.c, btsVar);
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            btsVar.e0(-1998020060);
            Boolean bool = ((p) b.getValue()).c;
            Object obj = did.a;
            if (bool != null) {
                Boolean bool2 = ((p) b.getValue()).c;
                btsVar.e0(-1998017369);
                boolean k = ((i2 & 112) == 32) | btsVar.k(b);
                Object Q = btsVar.Q();
                if (k || Q == obj) {
                    Q = new LogoutComposeScreenKt$LogoutComposeScreen$1$1(tlsVar, b, null);
                    btsVar.o0(Q);
                }
                btsVar.t(false);
                zpn.e(btsVar, (wls) Q, bool2);
            }
            btsVar.t(false);
            Throwable th = ((p) b.getValue()).b;
            if (th != null) {
                if (th instanceof Exception) {
                    tlsVar3.invoke(th);
                } else {
                    tlsVar3.invoke(new RuntimeException(th));
                }
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new l(kVar, tlsVar, tlsVar2, tlsVar3, i, 0);
                    return;
                }
                return;
            }
            tlsVar4 = tlsVar2;
            com.yandex.passport.internal.ui.challenge.webview.k kVar2 = ((p) b.getValue()).d;
            com.yandex.passport.internal.analytics.c0 eventReporter = kVar.getEventReporter();
            com.yandex.passport.internal.ui.common.web.d webUrlChecker = kVar.getWebUrlChecker();
            com.yandex.passport.common.ui.progress.g progressProperties = kVar.getProgressProperties();
            btsVar.e0(-1998000547);
            boolean z = (i2 & 896) == 256;
            Object Q2 = btsVar.Q();
            if (z || Q2 == obj) {
                Q2 = new com.yandex.passport.internal.flags.presentation.n(4, tlsVar4);
                btsVar.o0(Q2);
            }
            tls tlsVar5 = (tls) Q2;
            btsVar.t(false);
            btsVar.e0(-1997994541);
            boolean e = btsVar.e(rVar);
            Object Q3 = btsVar.Q();
            if (e || Q3 == obj) {
                Q3 = new com.yandex.passport.internal.ui.bouncer.challenge.e(1, rVar);
                btsVar.o0(Q3);
            }
            tls tlsVar6 = (tls) Q3;
            btsVar.t(false);
            btsVar.e0(-1997998290);
            boolean e2 = btsVar.e(context);
            Object Q4 = btsVar.Q();
            if (e2 || Q4 == obj) {
                Q4 = new com.yandex.passport.internal.ui.bouncer.challenge.d(context, 1);
                btsVar.o0(Q4);
            }
            btsVar.t(false);
            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
            com.yandex.passport.internal.util.p.a(kVar2, eventReporter, webUrlChecker, progressProperties, tlsVar5, tlsVar6, (tls) Q4, true, btsVar, 12582912, 0);
            btsVar = btsVar;
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new l(kVar, tlsVar, tlsVar4, tlsVar3, i, 1);
        }
    }

    public static final v b(PassportLogoutPropertiesImpl passportLogoutPropertiesImpl) {
        return new v(com.yandex.passport.internal.util.p.B(passportLogoutPropertiesImpl.getUid()), com.yandex.passport.internal.util.p.t(passportLogoutPropertiesImpl.getTheme()), passportLogoutPropertiesImpl.getSource(), passportLogoutPropertiesImpl.getCanLogoutOnDevice(), com.yandex.passport.api.mapper.b.a(passportLogoutPropertiesImpl.getProgressProperties()), passportLogoutPropertiesImpl.getHeaders());
    }
}
