package com.yandex.passport.internal.ui.challenge.vpn;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.aii0;
import defpackage.b3b1;
import defpackage.b64;
import defpackage.bgc;
import defpackage.bts;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.f5z;
import defpackage.fid;
import defpackage.g8e;
import defpackage.i9a1;
import defpackage.jl40;
import defpackage.k3r;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.m4m0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ohd;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.q7u;
import defpackage.qje;
import defpackage.qke;
import defpackage.qoi0;
import defpackage.r1b0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tls;
import defpackage.unr0;
import defpackage.w8f;
import defpackage.wls;
import defpackage.x4c;
import defpackage.yr31;
import defpackage.ywv;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zwv;
import defpackage.zy11;

/* loaded from: classes2.dex */
public abstract class f {
    public static final void a(String str, tls tlsVar, fid fidVar, int i) {
        oz40 oz40Var;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-498807866);
        int i2 = (btsVar2.k(str) ? 4 : 2) | i | (btsVar2.e(tlsVar) ? 32 : 16);
        if ((i2 & 19) == 18 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            btsVar2.e0(-1543620395);
            zwv zwvVar = new zwv();
            btsVar2.e0(1410873471);
            final int i3 = 1;
            final int i4 = 0;
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new com.yandex.passport.internal.ui.bouncer.chooser.f(str, 1);
                btsVar2.o0(Q);
            }
            btsVar2.t(false);
            zwvVar.a(qoi0.a(a0.class), (tls) Q);
            ywv b = zwvVar.b();
            btsVar2.t(false);
            rs31 a = f5z.a(btsVar2);
            if (a == null) {
                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            yr31 G = ooc.G(qoi0.a(a0.class), a, null, b, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar2);
            bts btsVar3 = btsVar2;
            final a0 a0Var = (a0) G;
            oz40 b2 = androidx.compose.runtime.f.b(a0Var.c, btsVar3);
            btsVar3.e0(-1543611048);
            Object Q2 = btsVar3.Q();
            if (Q2 == o430Var) {
                Q2 = new bgc(12);
                btsVar3.o0(Q2);
            }
            btsVar3.t(false);
            b3b1.a(false, (sls) Q2, btsVar3, 48, 1);
            r rVar = ((s) b2.getValue()).c;
            btsVar3.e0(-1543610242);
            if (rVar != null) {
                btsVar3.e0(1410883752);
                boolean e = ((i2 & 112) == 32) | btsVar3.e(rVar);
                Object Q3 = btsVar3.Q();
                if (e || Q3 == o430Var) {
                    Q3 = new VpnChallengeScreenKt$VpnChallengeScreen$2$1$1(tlsVar, rVar, null);
                    btsVar3.o0(Q3);
                }
                btsVar3.t(false);
                zpn.e(btsVar3, (wls) Q3, rVar);
            }
            Object k = g8e.k(-1543607307, btsVar3, false);
            if (k == o430Var) {
                k = new VpnJsBridge(new VpnChallengeScreenKt$VpnChallengeScreen$bridge$1$1(1, a0Var, a0.class, "onWish", "onWish(Lcom/yandex/passport/internal/ui/challenge/vpn/VpnChallengeViewModel$Wish;)V", 0));
                btsVar3.o0(k);
            }
            VpnJsBridge vpnJsBridge = (VpnJsBridge) k;
            btsVar3.t(false);
            final Context context = (Context) btsVar3.m(AndroidCompositionLocals_androidKt.b);
            final Activity activity = context instanceof Activity ? (Activity) context : null;
            btsVar3.e0(-1543598393);
            boolean k2 = btsVar3.k(context);
            Object Q4 = btsVar3.Q();
            Object obj = Q4;
            if (k2 || Q4 == o430Var) {
                WebView webView = new WebView(context);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                webView.getSettings().setSupportMultipleWindows(true);
                webView.addJavascriptInterface(vpnJsBridge, "nativeAMAndroid");
                webView.setWebChromeClient(new WebChromeClient() { // from class: com.yandex.passport.internal.ui.challenge.vpn.VpnChallengeScreenKt$VpnChallengeScreen$webView$1$1$1
                    @Override // android.webkit.WebChromeClient
                    public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
                        Object obj2 = resultMsg != null ? resultMsg.obj : null;
                        WebView.WebViewTransport webViewTransport = obj2 instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj2 : null;
                        if (webViewTransport == null) {
                            return false;
                        }
                        WebView webView2 = new WebView(context);
                        final a0 a0Var2 = a0Var;
                        final Activity activity2 = activity;
                        webView2.setWebViewClient(new WebViewClient() { // from class: com.yandex.passport.internal.ui.challenge.vpn.VpnChallengeScreenKt$VpnChallengeScreen$webView$1$1$1$onCreateWindow$popupWebView$1$1
                            @Override // android.webkit.WebViewClient
                            public boolean shouldOverrideUrlLoading(WebView view2, WebResourceRequest request) {
                                Uri url;
                                if (request == null || (url = request.getUrl()) == null) {
                                    return true;
                                }
                                a0 a0Var3 = a0.this;
                                Activity activity3 = activity2;
                                a0Var3.W(new w(url.toString()));
                                if (activity3 == null) {
                                    return true;
                                }
                                com.yandex.passport.internal.util.a.a(activity3, new Intent("android.intent.action.VIEW", url));
                                return true;
                            }
                        });
                        webViewTransport.setWebView(webView2);
                        resultMsg.sendToTarget();
                        return true;
                    }
                });
                webView.setWebViewClient(new VpnChallengeScreenKt$VpnChallengeScreen$webView$1$1$2(a0Var));
                btsVar3.o0(webView);
                obj = webView;
            }
            final WebView webView2 = (WebView) obj;
            btsVar3.t(false);
            btsVar3.e0(-1543480582);
            boolean e2 = btsVar3.e(webView2);
            Object Q5 = btsVar3.Q();
            if (e2 || Q5 == o430Var) {
                Q5 = new com.yandex.passport.internal.social.esia.k(webView2, 2);
                btsVar3.o0(Q5);
            }
            btsVar3.t(false);
            zpn.a(webView2, (tls) Q5, btsVar3);
            Boolean valueOf = Boolean.valueOf(((s) b2.getValue()).d);
            btsVar3.e0(-1543473770);
            boolean k3 = btsVar3.k(b2) | btsVar3.e(activity) | btsVar3.e(a0Var);
            Object Q6 = btsVar3.Q();
            if (k3 || Q6 == o430Var) {
                Q6 = new VpnChallengeScreenKt$VpnChallengeScreen$4$1(activity, a0Var, b2, null);
                btsVar3.o0(Q6);
            }
            btsVar3.t(false);
            zpn.e(btsVar3, (wls) Q6, valueOf);
            k3r k3rVar = ljs0.c;
            f530 b3 = m4m0.b(k3rVar, ldc.f, qke.q);
            z910 d = pi6.d(x4c.b, false);
            int S = cma1.S(btsVar3);
            r1b0 o = btsVar3.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar3, b3);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (btsVar3.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar3.i0();
            if (btsVar3.S) {
                btsVar3.n(slsVar);
            } else {
                btsVar3.r0();
            }
            qje.W(btsVar3, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar3, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar3, S, wlsVar);
            }
            qje.W(btsVar3, androidx.compose.ui.node.d.d, d2);
            final String str2 = ((s) b2.getValue()).b;
            btsVar3.e0(1411029914);
            if (str2 == null) {
                oz40Var = b2;
            } else {
                f530 g = i9a1.g(k3rVar);
                btsVar3.e0(-301083184);
                boolean e3 = btsVar3.e(webView2) | btsVar3.k(str2);
                Object Q7 = btsVar3.Q();
                if (e3 || Q7 == o430Var) {
                    Q7 = new tls() { // from class: com.yandex.passport.internal.ui.challenge.vpn.c
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            int i5 = i4;
                            String str3 = str2;
                            WebView webView3 = webView2;
                            switch (i5) {
                                case 0:
                                    FrameLayout frameLayout = new FrameLayout((Context) obj2);
                                    if (webView3.getParent() != null) {
                                        ((ViewGroup) webView3.getParent()).removeView(webView3);
                                    }
                                    frameLayout.addView(webView3);
                                    if (!jl40.l(webView3.getUrl(), str3)) {
                                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                            LogLevel logLevel = LogLevel.DEBUG;
                                            StringBuilder x = unr0.x("VpnChallengeScreen loadUrl url=", str3, " current=");
                                            x.append(webView3.getUrl());
                                            com.yandex.passport.common.logger.a.c(logLevel, null, x.toString(), 8);
                                        }
                                        webView3.loadUrl(str3);
                                    }
                                    return frameLayout;
                                default:
                                    if (!jl40.l(webView3.getUrl(), str3)) {
                                        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                            LogLevel logLevel2 = LogLevel.DEBUG;
                                            StringBuilder x2 = unr0.x("VpnChallengeScreen loadUrl url=", str3, " current=");
                                            x2.append(webView3.getUrl());
                                            com.yandex.passport.common.logger.a.c(logLevel2, null, x2.toString(), 8);
                                        }
                                        webView3.loadUrl(str3);
                                    }
                                    return zy11.a;
                            }
                        }
                    };
                    btsVar3.o0(Q7);
                }
                tls tlsVar2 = (tls) Q7;
                btsVar3.t(false);
                btsVar3.e0(-301066313);
                boolean e4 = btsVar3.e(webView2) | btsVar3.k(str2);
                Object Q8 = btsVar3.Q();
                if (e4 || Q8 == o430Var) {
                    Q8 = new tls() { // from class: com.yandex.passport.internal.ui.challenge.vpn.c
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            int i5 = i3;
                            String str3 = str2;
                            WebView webView3 = webView2;
                            switch (i5) {
                                case 0:
                                    FrameLayout frameLayout = new FrameLayout((Context) obj2);
                                    if (webView3.getParent() != null) {
                                        ((ViewGroup) webView3.getParent()).removeView(webView3);
                                    }
                                    frameLayout.addView(webView3);
                                    if (!jl40.l(webView3.getUrl(), str3)) {
                                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                            LogLevel logLevel = LogLevel.DEBUG;
                                            StringBuilder x = unr0.x("VpnChallengeScreen loadUrl url=", str3, " current=");
                                            x.append(webView3.getUrl());
                                            com.yandex.passport.common.logger.a.c(logLevel, null, x.toString(), 8);
                                        }
                                        webView3.loadUrl(str3);
                                    }
                                    return frameLayout;
                                default:
                                    if (!jl40.l(webView3.getUrl(), str3)) {
                                        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                            LogLevel logLevel2 = LogLevel.DEBUG;
                                            StringBuilder x2 = unr0.x("VpnChallengeScreen loadUrl url=", str3, " current=");
                                            x2.append(webView3.getUrl());
                                            com.yandex.passport.common.logger.a.c(logLevel2, null, x2.toString(), 8);
                                        }
                                        webView3.loadUrl(str3);
                                    }
                                    return zy11.a;
                            }
                        }
                    };
                    btsVar3.o0(Q8);
                }
                tls tlsVar3 = (tls) Q8;
                btsVar3.t(false);
                oz40Var = b2;
                androidx.compose.ui.viewinterop.b.a(tlsVar2, g, tlsVar3, btsVar3, 0, 0);
            }
            btsVar3.t(false);
            btsVar3.e0(1411060288);
            if (((s) oz40Var.getValue()).a) {
                com.yandex.passport.common.ui.progress.p.d(null, com.yandex.passport.common.ui.progress.g.e, false, btsVar3, 0, 5);
            }
            btsVar3.t(false);
            btsVar3.t(true);
            btsVar = btsVar3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.common.ui.compose.a(str, tlsVar, i, 13);
        }
    }
}
