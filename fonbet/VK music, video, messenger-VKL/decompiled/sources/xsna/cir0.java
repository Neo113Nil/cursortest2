package xsna;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.MimeTypeMap;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import ru.ok.android.commons.http.Http;
import xsna.mgn0;
import xsna.ogx0;

/* compiled from: VKWebViewBaseClient.kt */
/* loaded from: classes6.dex */
public class cir0 extends WebViewClient {
    public final ogx0 b = new ogx0(new qdx0());

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        mgn0 mgn0Var = jgn0.a;
        if (mgn0Var == null) {
            mgn0Var = null;
        }
        mgn0.e eVar = mgn0Var.e.m;
        String url = sslError != null ? sslError.getUrl() : null;
        if (url == null) {
            url = "";
        }
        if (eVar == null || !eVar.a(url)) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            return;
        }
        xgx0 xgx0Var = xgx0.a;
        String concat = "onReceivedSslError: skip SSL for ".concat(url);
        xgx0Var.getClass();
        xgx0.a(concat);
        if (sslErrorHandler != null) {
            sslErrorHandler.proceed();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        jhx0 jhx0Var;
        boolean z;
        boolean z2;
        boolean z3;
        WebResourceResponse webResourceResponse;
        WebResourceResponse webResourceResponse2;
        ogx0 ogx0Var = this.b;
        if (webView == null) {
            return super.shouldInterceptRequest((WebView) null, webResourceRequest);
        }
        if (webResourceRequest == null) {
            return super.shouldInterceptRequest(webView, (WebResourceRequest) null);
        }
        if (!ogx0Var.c.get()) {
            afx0 afx0Var = e370.r;
            Uri url = webResourceRequest.getUrl();
            if (afx0Var != null && url != null) {
                o260 o260Var = d260.a;
                if (o260Var == null) {
                    o260Var = null;
                }
                if (o260Var.h().isEnabled()) {
                    o260 o260Var2 = d260.a;
                    if (o260Var2 == null) {
                        o260Var2 = null;
                    }
                    if (!drm0.N(o260Var2.h().getHost()) && afx0Var.e(webResourceRequest.getUrl())) {
                        o260 o260Var3 = d260.a;
                        if (o260Var3 == null) {
                            o260Var3 = null;
                        }
                        Uri b = o260Var3.h().b(url);
                        oae0 oae0Var = b != null ? new oae0(b, pn00.k(new Pair("Host", url.getHost()), new Pair("User-Agent", o260Var3.l.a()))) : null;
                        if (oae0Var != null) {
                            jhx0Var = new jhx0(oae0Var.a, oae0Var.a());
                            Uri url2 = webResourceRequest.getUrl();
                            khx0 khx0Var = new khx0(url2, webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders(), jhx0Var);
                            ogx0.b bVar = ogx0Var.b;
                            boolean z4 = true;
                            z = (jhx0Var == null || drm0.D(url2.toString(), "_VK_PROXY_REQUEST_", false)) ? false : true;
                            if (s200.s || s200.q) {
                                z2 = true;
                            } else {
                                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(url2.toString());
                                Set set = (Set) ogx0Var.d.b;
                                String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.getDefault());
                                int length = lowerCase.length() - 1;
                                int i = 0;
                                boolean z5 = false;
                                while (true) {
                                    if (i > length) {
                                        z2 = z4;
                                        break;
                                    }
                                    z2 = z4;
                                    boolean z6 = epx.g(lowerCase.charAt(!z5 ? i : length), 32) <= 0 ? z2 : false;
                                    if (z5) {
                                        if (!z6) {
                                            break;
                                        }
                                        length--;
                                    } else if (z6) {
                                        i++;
                                    } else {
                                        z4 = z2;
                                        z5 = z4;
                                    }
                                    z4 = z2;
                                }
                                if (set.contains(lowerCase.subSequence(i, length + 1).toString()) && khx0Var.b.equals("GET")) {
                                    z3 = z2;
                                    if (z) {
                                        if (z3) {
                                            try {
                                                okhttp3.u f = ogx0Var.c(webView.getContext(), khx0Var).f();
                                                if (bVar != null) {
                                                    String uri = url2.toString();
                                                    List<String> g = f.g.g(Http.Header.SET_COOKIE);
                                                    if (g != null) {
                                                        bVar.a.setCookie(uri, j5g.g0(g, ", ", null, null, 0, null, 62));
                                                    }
                                                }
                                                webResourceResponse2 = ogx0.a(f, false);
                                            } catch (Exception e) {
                                                xgx0.a.getClass();
                                                xgx0.d(e);
                                            }
                                        }
                                        webResourceResponse2 = null;
                                    } else {
                                        try {
                                            okhttp3.u f2 = ogx0Var.b(webView.getContext(), khx0Var).f();
                                            if (bVar != null) {
                                                String uri2 = url2.toString();
                                                List<String> g2 = f2.g.g(Http.Header.SET_COOKIE);
                                                if (g2 != null) {
                                                    bVar.a.setCookie(uri2, j5g.g0(g2, ", ", null, null, 0, null, 62));
                                                }
                                            }
                                            webResourceResponse = ogx0.a(f2, jhx0Var != null ? z2 : false);
                                        } catch (Exception e2) {
                                            xgx0.a.getClass();
                                            xgx0.d(e2);
                                            webResourceResponse = ogx0.e;
                                        }
                                        webResourceResponse2 = webResourceResponse;
                                    }
                                    return webResourceResponse2 == null ? super.shouldInterceptRequest(webView, webResourceRequest) : webResourceResponse2;
                                }
                            }
                            z3 = false;
                            if (z) {
                            }
                            if (webResourceResponse2 == null) {
                            }
                        }
                    }
                }
            }
        }
        jhx0Var = null;
        Uri url22 = webResourceRequest.getUrl();
        khx0 khx0Var2 = new khx0(url22, webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders(), jhx0Var);
        ogx0.b bVar2 = ogx0Var.b;
        boolean z42 = true;
        if (jhx0Var == null) {
        }
        if (s200.s) {
        }
        z2 = true;
        z3 = false;
        if (z) {
        }
        if (webResourceResponse2 == null) {
        }
    }
}
