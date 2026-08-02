package com.yandex.passport.sloth.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.agc;
import defpackage.aii0;
import defpackage.b3b1;
import defpackage.bts;
import defpackage.cvw;
import defpackage.dgc;
import defpackage.did;
import defpackage.fid;
import defpackage.i9a1;
import defpackage.ljs0;
import defpackage.lz40;
import defpackage.m4m0;
import defpackage.o430;
import defpackage.oz40;
import defpackage.pey;
import defpackage.q5z;
import defpackage.qke;
import defpackage.sls;
import defpackage.st41;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes2.dex */
public abstract class e2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [int] */
    public static final void a(final a aVar, final lz40 lz40Var, final com.yandex.passport.common.common.a aVar2, final tls tlsVar, final sls slsVar, final tls tlsVar2, final sls slsVar2, final sls slsVar3, final sls slsVar4, final sls slsVar5, final tls tlsVar3, final tls tlsVar4, boolean z, fid fidVar, final int i) {
        int i2;
        Object obj;
        final ?? r11;
        Object obj2;
        boolean z2;
        Object obj3;
        final boolean z3;
        com.yandex.passport.sloth.ui.dependencies.c cVar = aVar.a;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1472994075);
        int i3 = i | (btsVar.k(aVar) ? 4 : 2) | (btsVar.e(lz40Var) ? 32 : 16) | (btsVar.e(aVar2) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024) | (btsVar.e(slsVar) ? 16384 : 8192) | (btsVar.e(tlsVar2) ? 131072 : 65536) | (btsVar.e(slsVar2) ? 1048576 : 524288) | (btsVar.e(slsVar3) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | (btsVar.e(slsVar4) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB) | (btsVar.e(slsVar5) ? 536870912 : SelfTester_JCP.IMITA);
        int i4 = (((btsVar.e(tlsVar3) ? (char) 4 : (char) 2) | (btsVar.e(tlsVar4) ? HexString.CHAR_SPACE : (char) 16)) == true ? 1 : 0) | 384;
        if ((i3 & 306783379) == 306783378 && ((i4 == true ? 1 : 0) & 147) == 146 && btsVar.E()) {
            btsVar.Y();
            z3 = z;
        } else {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            Object[] objArr = new Object[0];
            btsVar.e0(434056140);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                i2 = i3;
                androidx.core.app.a1 a1Var = new androidx.core.app.a1(26);
                btsVar.o0(a1Var);
                obj = a1Var;
            } else {
                i2 = i3;
                obj = Q;
            }
            btsVar.t(false);
            Bundle bundle = (Bundle) cvw.V(objArr, (sls) obj, btsVar, 48);
            btsVar.e0(434057538);
            Object Q2 = btsVar.Q();
            Object obj4 = Q2;
            if (Q2 == o430Var) {
                oz40 j = androidx.compose.runtime.f.j(Boolean.FALSE);
                btsVar.o0(j);
                obj4 = j;
            }
            oz40 oz40Var = (oz40) obj4;
            btsVar.t(false);
            btsVar.e0(434061774);
            boolean k = btsVar.k(context);
            Object Q3 = btsVar.Q();
            Object obj5 = Q3;
            if (k || Q3 == o430Var) {
                WebView webView = new WebView(context);
                com.yandex.passport.sloth.data.c0 slothVariant = cVar.getSlothVariant();
                q5z.h(slothVariant);
                l slothComposeUIReporter = cVar.getSlothComposeUIReporter();
                q5z.h(slothComposeUIReporter);
                st41 webViewSslErrorHandler = cVar.getWebViewSslErrorHandler();
                q5z.h(webViewSslErrorHandler);
                b1 slothUiInteractor = cVar.getSlothUiInteractor();
                q5z.h(slothUiInteractor);
                f1 f1Var = new f1(slothUiInteractor);
                b1 slothUiInteractor2 = cVar.getSlothUiInteractor();
                q5z.h(slothUiInteractor2);
                SlothWebViewClient slothWebViewClient = new SlothWebViewClient(slothVariant, slothComposeUIReporter, webViewSslErrorHandler, f1Var, new j(slothUiInteractor2), tlsVar, slsVar, tlsVar2, slsVar2, slsVar3, slsVar4, slsVar5, tlsVar3, new e(3, oz40Var));
                String f = com.yandex.passport.common.util.a.f("PassportSDK/7.55.1.755015154");
                StringBuilder sb = new StringBuilder();
                com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) aVar2;
                sb.append(eVar.a());
                sb.append('/');
                sb.append(eVar.b());
                String f2 = com.yandex.passport.common.util.a.f(sb.toString());
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setAllowFileAccess(false);
                settings.setAllowContentAccess(false);
                settings.setDomStorageEnabled(true);
                settings.setUserAgentString(settings.getUserAgentString() + HexString.CHAR_SPACE + f + HexString.CHAR_SPACE + f2);
                webView.setClipToOutline(true);
                webView.setWebViewClient(slothWebViewClient);
                webView.setWebChromeClient(new WebChromeClient() { // from class: com.yandex.passport.sloth.ui.SlothWebScreenKt$SlothWebScreen$currentWebView$1$1$1$2
                });
                webView.addJavascriptInterface(new i(tlsVar4), "nativeAMAndroid");
                if (!bundle.isEmpty()) {
                    webView.restoreState(bundle);
                }
                oz40Var.setValue(Boolean.valueOf(webView.canGoBack()));
                CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
                btsVar.o0(webView);
                obj5 = webView;
            }
            final WebView webView2 = (WebView) obj5;
            btsVar.t(false);
            boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
            btsVar.e0(434135879);
            boolean e = btsVar.e(webView2);
            Object Q4 = btsVar.Q();
            if (e || Q4 == o430Var) {
                r11 = 1;
                e0 e0Var = new e0(true ? 1 : 0, webView2);
                btsVar.o0(e0Var);
                obj2 = e0Var;
            } else {
                r11 = 1;
                obj2 = Q4;
            }
            btsVar.t(false);
            b3b1.a(booleanValue, (sls) obj2, btsVar, 0, 0);
            btsVar.e0(434139697);
            boolean e2 = btsVar.e(lz40Var) | btsVar.e(webView2) | ((i2 & 14) != 4 ? false : r11);
            Object Q5 = btsVar.Q();
            Object obj6 = Q5;
            if (e2 || Q5 == o430Var) {
                SlothWebScreenKt$SlothWebScreen$2$1 slothWebScreenKt$SlothWebScreen$2$1 = new SlothWebScreenKt$SlothWebScreen$2$1(lz40Var, webView2, aVar, null);
                btsVar.o0(slothWebScreenKt$SlothWebScreen$2$1);
                obj6 = slothWebScreenKt$SlothWebScreen$2$1;
            }
            btsVar.t(false);
            zpn.e(btsVar, (wls) obj6, lz40Var);
            btsVar.e0(434181449);
            boolean e3 = btsVar.e(webView2);
            Object Q6 = btsVar.Q();
            if (e3 || Q6 == o430Var) {
                z2 = false;
                final boolean z4 = false ? 1 : 0;
                tls tlsVar5 = new tls() { // from class: com.yandex.passport.sloth.ui.b2
                    @Override // defpackage.tls
                    public final Object invoke(Object obj7) {
                        int i5 = z4;
                        WebView webView3 = webView2;
                        switch (i5) {
                            case 0:
                                FrameLayout frameLayout = new FrameLayout((Context) obj7);
                                if (webView3.getParent() != null) {
                                    ((ViewGroup) webView3.getParent()).removeView(webView3);
                                }
                                frameLayout.addView(webView3);
                                return frameLayout;
                            default:
                                return new com.yandex.passport.internal.ui.challenge.vpn.d(webView3, 2);
                        }
                    }
                };
                btsVar.o0(tlsVar5);
                obj3 = tlsVar5;
            } else {
                z2 = false;
                obj3 = Q6;
            }
            btsVar.t(z2);
            androidx.compose.ui.viewinterop.b.a((tls) obj3, i9a1.g(m4m0.b(ljs0.c, ((agc) btsVar.m(dgc.a)).n, qke.q)), null, btsVar, 0, 4);
            pey peyVar = (pey) btsVar.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            btsVar.e0(434201459);
            boolean e4 = btsVar.e(webView2) | btsVar.e(bundle) | btsVar.e(peyVar);
            Object Q7 = btsVar.Q();
            Object obj7 = Q7;
            if (e4 || Q7 == o430Var) {
                com.yandex.passport.internal.flags.presentation.v0 v0Var = new com.yandex.passport.internal.flags.presentation.v0(6, peyVar, webView2, bundle);
                btsVar.o0(v0Var);
                obj7 = v0Var;
            }
            btsVar.t(false);
            zpn.b(peyVar, webView2, (tls) obj7, btsVar);
            btsVar.e0(434213066);
            boolean e5 = btsVar.e(webView2);
            Object Q8 = btsVar.Q();
            Object obj8 = Q8;
            if (e5 || Q8 == o430Var) {
                tls tlsVar6 = new tls() { // from class: com.yandex.passport.sloth.ui.b2
                    @Override // defpackage.tls
                    public final Object invoke(Object obj72) {
                        int i5 = r11;
                        WebView webView3 = webView2;
                        switch (i5) {
                            case 0:
                                FrameLayout frameLayout = new FrameLayout((Context) obj72);
                                if (webView3.getParent() != null) {
                                    ((ViewGroup) webView3.getParent()).removeView(webView3);
                                }
                                frameLayout.addView(webView3);
                                return frameLayout;
                            default:
                                return new com.yandex.passport.internal.ui.challenge.vpn.d(webView3, 2);
                        }
                    }
                };
                btsVar.o0(tlsVar6);
                obj8 = tlsVar6;
            }
            btsVar.t(false);
            zpn.a(context, (tls) obj8, btsVar);
            z3 = r11;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(lz40Var, aVar2, tlsVar, slsVar, tlsVar2, slsVar2, slsVar3, slsVar4, slsVar5, tlsVar3, tlsVar4, z3, i) { // from class: com.yandex.passport.sloth.ui.c2
                public final /* synthetic */ sls A;
                public final /* synthetic */ sls B;
                public final /* synthetic */ sls C;
                public final /* synthetic */ tls D;
                public final /* synthetic */ tls E;
                public final /* synthetic */ boolean F;
                public final /* synthetic */ lz40 b;
                public final /* synthetic */ com.yandex.passport.common.common.a c;
                public final /* synthetic */ tls w;
                public final /* synthetic */ sls x;
                public final /* synthetic */ tls y;
                public final /* synthetic */ sls z;

                @Override // defpackage.wls
                public final Object invoke(Object obj9, Object obj10) {
                    ((Integer) obj10).getClass();
                    int O = vng.O(1);
                    e2.a(a.this, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (fid) obj9, O);
                    return zy11.a;
                }
            };
        }
    }
}
