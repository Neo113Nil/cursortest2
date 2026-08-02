package com.yandex.passport.user_id.ui;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.c3;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.impl.UserIdProperties;
import com.yandex.passport.internal.analytics.a0;
import com.yandex.passport.internal.flags.presentation.n;
import com.yandex.passport.internal.flags.presentation.p;
import com.yandex.passport.internal.flags.presentation.s;
import com.yandex.passport.internal.flags.presentation.s0;
import com.yandex.passport.user_id.models.h;
import com.yandex.passport.user_id.u;
import com.yandex.passport.user_id.w;
import com.yandex.passport.user_id.webview.UserIdJsInterface;
import com.yandex.passport.user_id.webview.WebViewClient;
import defpackage.aii0;
import defpackage.b3b1;
import defpackage.bts;
import defpackage.cma1;
import defpackage.did;
import defpackage.ew0;
import defpackage.f530;
import defpackage.f5z;
import defpackage.fid;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.pey;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tls;
import defpackage.tpr;
import defpackage.w8f;
import defpackage.wls;
import defpackage.wwg;
import defpackage.yr31;
import defpackage.zpn;
import io.appmetrica.analytics.IReporterYandex;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public abstract class a {
    public static final void a(f530 f530Var, c3 c3Var, IReporterYandex iReporterYandex, com.yandex.passport.internal.methods.requester.e eVar, tls tlsVar, tpr tprVar, fid fidVar, int i) {
        int i2;
        int i3;
        boolean f0;
        boolean z;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-130100199);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(c3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(iReporterYandex) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= (i & 4096) == 0 ? btsVar2.k(eVar) : btsVar2.e(eVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.e(tprVar) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            btsVar2.a0();
            if ((i & 1) != 0 && !btsVar2.C()) {
                btsVar2.Y();
            }
            btsVar2.u();
            UserIdProperties.Companion.getClass();
            u uVar = new u(iReporterYandex, eVar, new UserIdProperties(c3Var.getTheme(), PassportEnvironmentImpl.from(c3Var.getEnvironment()), c3Var.getCustomWebParams(), c3Var.getShowLoading(), false, 16, null));
            rs31 a = f5z.a(btsVar2);
            if (a == null) {
                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            yr31 G = ooc.G(qoi0.a(w.class), a, null, uVar, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar2);
            bts btsVar3 = btsVar2;
            w wVar = (w) G;
            h hVar = (h) androidx.compose.runtime.f.a(wVar.c, com.yandex.passport.user_id.models.f.a, null, btsVar3, 48, 2).getValue();
            btsVar3.e0(479160087);
            Object Q = btsVar3.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = androidx.compose.runtime.f.j(Boolean.FALSE);
                btsVar3.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object k = g8e.k(479162070, btsVar3, false);
            if (k == o430Var) {
                i3 = i2;
                k = new WebViewClient(new p(3, oz40Var), new n(5, tlsVar));
                btsVar3.o0(k);
            } else {
                i3 = i2;
            }
            WebViewClient webViewClient = (WebViewClient) k;
            Object k2 = g8e.k(479167017, btsVar3, false);
            if (k2 == o430Var) {
                k2 = new UserIdJsInterface(new a0(23, wVar));
                btsVar3.o0(k2);
            }
            UserIdJsInterface userIdJsInterface = (UserIdJsInterface) k2;
            btsVar3.t(false);
            btsVar3.e0(-692937694);
            Context context = (Context) btsVar3.m(AndroidCompositionLocals_androidKt.b);
            pey peyVar = (pey) btsVar3.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            btsVar3.e0(553146629);
            Object Q2 = btsVar3.Q();
            Object obj = Q2;
            if (Q2 == o430Var) {
                WebView webView = new WebView(context);
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setAllowFileAccess(false);
                settings.setAllowContentAccess(false);
                settings.setDomStorageEnabled(true);
                settings.setUserAgentString(settings.getUserAgentString() + HexString.CHAR_SPACE + com.yandex.passport.common.web.a.b);
                webView.setWebViewClient(webViewClient);
                webView.setWebChromeClient(new WebChromeClient() { // from class: com.yandex.passport.user_id.ui.UserIdUiKt$rememberPreloadedWebView$webView$1$1$2
                });
                webView.addJavascriptInterface(userIdJsInterface, "nativeAMAndroid");
                btsVar3.o0(webView);
                obj = webView;
            }
            WebView webView2 = (WebView) obj;
            btsVar3.t(false);
            btsVar3.e0(553165546);
            boolean e = btsVar3.e(webView2) | btsVar3.e(peyVar);
            Object Q3 = btsVar3.Q();
            if (e || Q3 == o430Var) {
                Q3 = new s0(21, peyVar, webView2);
                btsVar3.o0(Q3);
            }
            btsVar3.t(false);
            zpn.b(peyVar, webView2, (tls) Q3, btsVar3);
            btsVar3.t(false);
            boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
            btsVar3.e0(479173301);
            boolean e2 = btsVar3.e(webView2);
            Object Q4 = btsVar3.Q();
            if (e2 || Q4 == o430Var) {
                Q4 = new com.yandex.passport.internal.ui.sloth.plusdevices.w(12, webView2);
                btsVar3.o0(Q4);
            }
            btsVar3.t(false);
            b3b1.a(booleanValue, (sls) Q4, btsVar3, 0, 0);
            kotlinx.coroutines.flow.b bVar = wVar.w;
            btsVar3.e0(479175841);
            boolean e3 = btsVar3.e(wVar) | btsVar3.e(webView2);
            int i4 = i3 & HProv.ALG_CLASS_ALL;
            boolean z2 = e3 | (i4 == 16384);
            Object Q5 = btsVar3.Q();
            if (z2 || Q5 == o430Var) {
                Q5 = new UserIdExternalUiKt$UserId$4$1(wVar, webView2, tlsVar, null);
                btsVar3.o0(Q5);
            }
            btsVar3.t(false);
            zpn.e(btsVar3, (wls) Q5, bVar);
            btsVar3.e0(479187200);
            boolean e4 = btsVar3.e(tprVar) | btsVar3.e(wVar);
            Object Q6 = btsVar3.Q();
            if (e4 || Q6 == o430Var) {
                Q6 = new UserIdExternalUiKt$UserId$5$1(tprVar, wVar, null);
                btsVar3.o0(Q6);
            }
            btsVar3.t(false);
            zpn.e(btsVar3, (wls) Q6, tprVar);
            btsVar3.e0(479191508);
            boolean e5 = btsVar3.e(hVar) | (i4 == 16384);
            Object Q7 = btsVar3.Q();
            if (e5 || Q7 == o430Var) {
                Q7 = new UserIdExternalUiKt$UserId$6$1(hVar, tlsVar, null);
                btsVar3.o0(Q7);
            }
            btsVar3.t(false);
            zpn.e(btsVar3, (wls) Q7, hVar);
            btsVar = btsVar3;
            if (c3Var.getShowUi()) {
                PassportTheme theme = c3Var.getTheme();
                btsVar3.e0(682078842);
                if (theme == PassportTheme.LIGHT) {
                    z = false;
                    f0 = false;
                } else if (theme == PassportTheme.DARK) {
                    z = false;
                    f0 = true;
                } else {
                    f0 = cma1.f0(btsVar3);
                    z = false;
                }
                btsVar3.t(z);
                com.yandex.passport.common.ui.compose.theme.e.a(f0, false, wwg.S(-1513116556, true, new s(hVar, c3Var, f530Var, webView2, 2), btsVar3), btsVar3, 384, 2);
                btsVar = btsVar3;
            }
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ew0(f530Var, c3Var, iReporterYandex, eVar, tlsVar, tprVar, i);
        }
    }
}
