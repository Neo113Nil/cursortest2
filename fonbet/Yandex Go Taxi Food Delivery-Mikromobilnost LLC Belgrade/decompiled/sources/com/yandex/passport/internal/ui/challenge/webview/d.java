package com.yandex.passport.internal.ui.challenge.webview;

import android.content.Context;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.app.a1;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.flags.presentation.q0;
import com.yandex.passport.internal.flags.presentation.s0;
import defpackage.agc;
import defpackage.aii0;
import defpackage.bts;
import defpackage.cvw;
import defpackage.dgc;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.i9a1;
import defpackage.ljs0;
import defpackage.lz40;
import defpackage.m4m0;
import defpackage.mfe0;
import defpackage.oz40;
import defpackage.qke;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public abstract class d {
    public static final void a(k kVar, c0 c0Var, com.yandex.passport.internal.ui.common.web.d dVar, lz40 lz40Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        Object obj;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2037271250);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(c0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(dVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(lz40Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && btsVar.E()) {
            btsVar.Y();
        } else {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            Object[] objArr = new Object[0];
            btsVar.e0(1622095232);
            Object Q = btsVar.Q();
            Object obj2 = did.a;
            if (Q == obj2) {
                Q = new a1(19);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            Bundle bundle = (Bundle) cvw.V(objArr, (sls) Q, btsVar, 48);
            Object[] objArr2 = {zy11.a};
            btsVar.e0(1622097320);
            Object Q2 = btsVar.Q();
            if (Q2 == obj2) {
                Q2 = new a1(20);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            oz40 oz40Var = (oz40) cvw.V(objArr2, (sls) Q2, btsVar, 48);
            btsVar.e0(1622099778);
            boolean k = btsVar.k(context);
            Object Q3 = btsVar.Q();
            if (k || Q3 == obj2) {
                WebView webView = new WebView(context);
                webView.setWebViewClient(new ChallengeWebClient(kVar, tlsVar, c0Var, dVar));
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setAllowFileAccess(false);
                settings.setAllowContentAccess(false);
                settings.setUserAgentString(settings.getUserAgentString() + HexString.CHAR_SPACE + com.yandex.passport.common.web.a.b);
                settings.setDomStorageEnabled(true);
                CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
                btsVar.o0(webView);
                obj = webView;
            } else {
                obj = Q3;
            }
            WebView webView2 = (WebView) obj;
            btsVar.t(false);
            btsVar.e0(1622129592);
            boolean e = btsVar.e(lz40Var) | btsVar.e(webView2);
            Object Q4 = btsVar.Q();
            if (e || Q4 == obj2) {
                Q4 = new ChallengeWebScreenKt$ChallengeWebScreen$1$1(lz40Var, webView2, null);
                btsVar.o0(Q4);
            }
            btsVar.t(false);
            zpn.e(btsVar, (wls) Q4, lz40Var);
            f530 g = i9a1.g(m4m0.b(ljs0.c, ((agc) btsVar.m(dgc.a)).n, qke.q));
            btsVar.e0(1622138267);
            boolean e2 = btsVar.e(webView2);
            Object Q5 = btsVar.Q();
            if (e2 || Q5 == obj2) {
                Q5 = new com.yandex.passport.internal.social.esia.k(webView2, 3);
                btsVar.o0(Q5);
            }
            tls tlsVar2 = (tls) Q5;
            btsVar.t(false);
            btsVar.e0(1622150218);
            boolean e3 = btsVar.e(webView2) | btsVar.e(bundle);
            int i3 = i2;
            Object Q6 = btsVar.Q();
            if (e3 || Q6 == obj2) {
                Q6 = new s0(18, webView2, bundle);
                btsVar.o0(Q6);
            }
            tls tlsVar3 = (tls) Q6;
            btsVar.t(false);
            btsVar.e0(1622156343);
            boolean k2 = btsVar.k(oz40Var) | btsVar.e(bundle) | ((i3 & 14) == 4) | btsVar.e(webView2);
            Object Q7 = btsVar.Q();
            if (k2 || Q7 == obj2) {
                Q7 = new q0(oz40Var, bundle, kVar, webView2);
                btsVar.o0(Q7);
            }
            btsVar.t(false);
            androidx.compose.ui.viewinterop.b.b(tlsVar2, g, null, tlsVar3, (tls) Q7, btsVar, 0, 4);
            btsVar.e0(1622190396);
            boolean e4 = btsVar.e(webView2);
            Object Q8 = btsVar.Q();
            if (e4 || Q8 == obj2) {
                Q8 = new com.yandex.passport.internal.social.esia.k(webView2, 4);
                btsVar.o0(Q8);
            }
            btsVar.t(false);
            zpn.a(context, (tls) Q8, btsVar);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mfe0(kVar, c0Var, dVar, lz40Var, tlsVar, i, 13);
        }
    }
}
