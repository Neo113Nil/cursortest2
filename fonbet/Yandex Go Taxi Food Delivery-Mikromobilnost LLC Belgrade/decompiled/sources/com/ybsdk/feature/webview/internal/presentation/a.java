package com.ybsdk.feature.webview.internal.presentation;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.aj51;
import defpackage.boh;
import defpackage.d6w;
import defpackage.eja1;
import defpackage.g8e;
import defpackage.gv41;
import defpackage.gw41;
import defpackage.jl40;
import defpackage.nl91;
import defpackage.oyr;
import defpackage.qj41;
import defpackage.ql60;
import defpackage.qnh;
import defpackage.rl60;
import defpackage.s421;
import defpackage.st41;
import defpackage.ti51;
import defpackage.tje;
import defpackage.ui51;
import defpackage.uuu;
import defpackage.vi51;
import defpackage.wi51;
import defpackage.xi51;
import defpackage.yi51;
import defpackage.yu50;
import defpackage.zch;
import defpackage.zgf;
import defpackage.zmf;
import java.io.IOException;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.domesticroots.webview.d;

/* loaded from: classes11.dex */
public final class a implements yi51 {
    public final d a;
    public final /* synthetic */ WebViewFragment b;

    public a(Context context, WebViewFragment webViewFragment) {
        this.b = webViewFragment;
        this.a = st41.a(context.getApplicationContext(), new rl60(context.getApplicationContext()), new ql60());
    }

    public final void a(ti51 ti51Var, aj51 aj51Var) {
        gv41 viewModel;
        String url;
        Uri parse;
        String str = null;
        String url2 = ti51Var != null ? ((SslError) ((zch) ti51Var).a).getUrl() : null;
        String i = ti51Var != null ? oyr.i(((SslError) ((zch) ti51Var).a).getPrimaryError(), "primaryErrorCode=") : null;
        Boolean bool = Boolean.TRUE;
        nl91.g(url2, null, "Web view SSL error", null, null, i, null, bool, null, null, 1880);
        if (ti51Var != null) {
            SslError sslError = (SslError) ((zch) ti51Var).a;
            Uri parse2 = Uri.parse(sslError.getUrl());
            if (parse2 == null) {
                return;
            }
            String host = parse2.getHost();
            if (aj51Var != null && (url = ((boh) aj51Var).a.getUrl()) != null && (parse = Uri.parse(url)) != null) {
                str = parse.getHost();
            }
            if (jl40.l(host, str)) {
                viewModel = this.b.getViewModel();
                gv41.c0(viewModel, sslError.getUrl(), new Throwable("WebView: ssl error for url: " + sslError.getUrl() + " : " + sslError.getPrimaryError()), null, null, bool, null, null, 104);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    @Override // defpackage.yi51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(wi51 wi51Var, vi51 vi51Var) {
        Boolean bool;
        Throwable th;
        gv41 viewModel;
        Boolean bool2 = null;
        String valueOf = String.valueOf(wi51Var != null ? ((WebResourceRequest) ((zch) wi51Var).a).getUrl() : null);
        Integer valueOf2 = vi51Var != null ? Integer.valueOf(((qj41) ((qnh) vi51Var).a).b()) : null;
        String str = "errorMessage=" + ((Object) (vi51Var != null ? ((qj41) ((qnh) vi51Var).a).a() : null));
        Boolean valueOf3 = vi51Var != null ? Boolean.valueOf(((qnh) vi51Var).a()) : null;
        if (vi51Var != null) {
            bool = Boolean.valueOf(((qj41) ((qnh) vi51Var).a).b() == -11);
        } else {
            bool = null;
        }
        nl91.g(valueOf, valueOf2, "Non HTTP web view error", null, null, str, valueOf3, bool, null, null, 1816);
        if (wi51Var != null) {
            WebResourceRequest webResourceRequest = (WebResourceRequest) ((zch) wi51Var).a;
            if (webResourceRequest.isForMainFrame()) {
                if (vi51Var != null) {
                    qnh qnhVar = (qnh) vi51Var;
                    if (qnhVar.a()) {
                        th = new IOException(oyr.j(((qj41) qnhVar.a).b(), "Problems with internet connection (WebView ErrorCode = ", Extension.C_BRAKE));
                        Throwable th2 = th;
                        viewModel = this.b.getViewModel();
                        String uri = webResourceRequest.getUrl().toString();
                        Integer valueOf4 = vi51Var == null ? Integer.valueOf(((qj41) ((qnh) vi51Var).a).b()) : null;
                        Boolean valueOf5 = vi51Var == null ? Boolean.valueOf(((qnh) vi51Var).a()) : null;
                        if (vi51Var != null) {
                            bool2 = Boolean.valueOf(((qj41) ((qnh) vi51Var).a).b() == -11);
                        }
                        gv41.c0(viewModel, uri, th2, valueOf4, valueOf5, bool2, null, null, 96);
                    }
                }
                th = new Throwable("On receive error on loading page: " + webResourceRequest.getUrl() + " (WebView ErrorCode = " + (vi51Var != null ? Integer.valueOf(((qj41) ((qnh) vi51Var).a).b()) : null) + Extension.C_BRAKE);
                Throwable th22 = th;
                viewModel = this.b.getViewModel();
                String uri2 = webResourceRequest.getUrl().toString();
                if (vi51Var == null) {
                }
                if (vi51Var == null) {
                }
                if (vi51Var != null) {
                }
                gv41.c0(viewModel, uri2, th22, valueOf4, valueOf5, bool2, null, null, 96);
            }
        }
    }

    @Override // defpackage.yi51
    public final void d() {
        WebViewFragment webViewFragment = this.b;
        tje.N(eja1.s(webViewFragment), null, null, new WebViewFragment$webViewClient$1$doUpdateVisitedHistory$1(webViewFragment, null), 3);
    }

    @Override // defpackage.yi51
    public final void e(boh bohVar, String str) {
        AppAnalyticsReporter appAnalyticsReporter;
        String subscribeOnPostMessages;
        gv41 viewModel;
        WebViewFragment webViewFragment = this.b;
        appAnalyticsReporter = webViewFragment.reporter;
        gw41.d(appAnalyticsReporter.v0, "onPageStarted", str, null, null, 12);
        if (str != null) {
            viewModel = webViewFragment.getViewModel();
            viewModel.k0(str);
        }
        if (bohVar != null) {
            subscribeOnPostMessages = webViewFragment.subscribeOnPostMessages();
            bohVar.e(subscribeOnPostMessages);
        }
    }

    @Override // defpackage.yi51
    public final void f(boh bohVar, ui51 ui51Var, ti51 ti51Var) {
        if (ti51Var == null) {
            if (ui51Var != null) {
                ((zmf) ui51Var).a.cancel();
            }
            a(ti51Var, bohVar);
        } else {
            SslError sslError = (SslError) ((zch) ti51Var).a;
            this.a.b(new SslError(sslError.getPrimaryError(), sslError.getCertificate(), sslError.getUrl()), new s421(ti51Var, ui51Var, this, bohVar, 12));
        }
    }

    @Override // defpackage.yi51
    public final void g(boh bohVar, String str) {
        AppAnalyticsReporter appAnalyticsReporter;
        gv41 viewModel;
        WebViewFragment webViewFragment = this.b;
        appAnalyticsReporter = webViewFragment.reporter;
        gw41.d(appAnalyticsReporter.v0, "onPageCommitVisible", str, null, null, 12);
        webViewFragment.considerPullBarInset();
        String url = bohVar.a.getUrl();
        if (url != null) {
            viewModel = webViewFragment.getViewModel();
            viewModel.r0(url);
        }
    }

    @Override // defpackage.yi51
    public final void h(wi51 wi51Var, xi51 xi51Var) {
        Boolean bool;
        Boolean bool2;
        gv41 viewModel;
        Boolean bool3;
        Map<String, String> responseHeaders;
        Boolean bool4 = null;
        String valueOf = String.valueOf(wi51Var != null ? ((WebResourceRequest) ((zch) wi51Var).a).getUrl() : null);
        Integer valueOf2 = xi51Var != null ? Integer.valueOf(((WebResourceResponse) ((zgf) xi51Var).b).getStatusCode()) : null;
        String str = (xi51Var == null || (responseHeaders = ((WebResourceResponse) ((zgf) xi51Var).b).getResponseHeaders()) == null) ? null : responseHeaders.get(yu50.d);
        String o = g8e.o("reasonPhrase=", xi51Var != null ? ((WebResourceResponse) ((zgf) xi51Var).b).getReasonPhrase() : null);
        if (xi51Var != null) {
            d6w d6wVar = uuu.a;
            bool = Boolean.valueOf(((WebResourceResponse) ((zgf) xi51Var).b).getStatusCode() / 100 == 4);
        } else {
            bool = null;
        }
        if (xi51Var != null) {
            d6w d6wVar2 = uuu.a;
            bool2 = Boolean.valueOf(((WebResourceResponse) ((zgf) xi51Var).b).getStatusCode() / 100 == 5);
        } else {
            bool2 = null;
        }
        nl91.g(valueOf, valueOf2, "Web view HTTP-error", str, null, o, null, null, bool2, bool, 1232);
        if (wi51Var != null) {
            WebResourceRequest webResourceRequest = (WebResourceRequest) ((zch) wi51Var).a;
            if (webResourceRequest.isForMainFrame()) {
                viewModel = this.b.getViewModel();
                String uri = webResourceRequest.getUrl().toString();
                Throwable th = new Throwable("Web view HTTP-error: " + webResourceRequest.getUrl() + Extension.COLON_SPACE + (xi51Var != null ? Integer.valueOf(((WebResourceResponse) ((zgf) xi51Var).b).getStatusCode()) : null) + Extension.COLON_SPACE + (xi51Var != null ? ((WebResourceResponse) ((zgf) xi51Var).b).getReasonPhrase() : null));
                Integer valueOf3 = xi51Var != null ? Integer.valueOf(((WebResourceResponse) ((zgf) xi51Var).b).getStatusCode()) : null;
                if (xi51Var != null) {
                    d6w d6wVar3 = uuu.a;
                    bool3 = Boolean.valueOf(((WebResourceResponse) ((zgf) xi51Var).b).getStatusCode() / 100 == 4);
                } else {
                    bool3 = null;
                }
                if (xi51Var != null) {
                    d6w d6wVar4 = uuu.a;
                    bool4 = Boolean.valueOf(((WebResourceResponse) ((zgf) xi51Var).b).getStatusCode() / 100 == 5);
                }
                gv41.c0(viewModel, uri, th, valueOf3, null, null, bool4, bool3, 24);
            }
        }
    }

    @Override // defpackage.yi51
    public final boolean i(boh bohVar, wi51 wi51Var) {
        AppAnalyticsReporter appAnalyticsReporter;
        gv41 viewModel;
        String valueOf = String.valueOf(wi51Var != null ? ((WebResourceRequest) ((zch) wi51Var).a).getUrl() : null);
        WebViewFragment webViewFragment = this.b;
        appAnalyticsReporter = webViewFragment.reporter;
        gw41.d(appAnalyticsReporter.v0, "shouldOverrideUrlLoading", valueOf, wi51Var != null ? Boolean.valueOf(((WebResourceRequest) ((zch) wi51Var).a).isForMainFrame()) : null, null, 8);
        viewModel = webViewFragment.getViewModel();
        return viewModel.w0(webViewFragment.getActivity(), valueOf, bohVar.a.canGoBack());
    }

    @Override // defpackage.yi51
    public final void j(wi51 wi51Var) {
        AppAnalyticsReporter appAnalyticsReporter;
        if (wi51Var != null) {
            WebResourceRequest webResourceRequest = (WebResourceRequest) ((zch) wi51Var).a;
            if (webResourceRequest.isForMainFrame()) {
                WebViewFragment webViewFragment = this.b;
                appAnalyticsReporter = webViewFragment.reporter;
                gw41.d(appAnalyticsReporter.v0, "onInterceptRequest", webResourceRequest.getUrl().toString(), Boolean.TRUE, null, 8);
                tje.N(eja1.s(webViewFragment), null, null, new WebViewFragment$webViewClient$1$onInterceptRequest$1(webViewFragment, wi51Var, null), 3);
            }
        }
    }

    @Override // defpackage.yi51
    public final void onPageFinished(String str) {
        AppAnalyticsReporter appAnalyticsReporter;
        gv41 viewModel;
        WebViewFragment webViewFragment = this.b;
        appAnalyticsReporter = webViewFragment.reporter;
        gw41.d(appAnalyticsReporter.v0, "onPageFinished", str, null, null, 12);
        viewModel = webViewFragment.getViewModel();
        viewModel.q0(str == null ? "" : str);
    }
}
