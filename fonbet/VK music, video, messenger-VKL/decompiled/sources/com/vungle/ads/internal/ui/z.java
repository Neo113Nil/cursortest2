package com.vungle.ads.internal.ui;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.WebViewRenderingProcessGone;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.s1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Result;
import kotlinx.serialization.json.JsonObject;
import ru.ok.android.commons.http.Http;
import ru.ok.android.webrtc.signaling.api.EndpointParameters;
import xsna.alk;
import xsna.arm0;
import xsna.bpn0;
import xsna.brm0;
import xsna.c9y;
import xsna.drm0;
import xsna.epx;
import xsna.gao;
import xsna.j5g;
import xsna.nek;
import xsna.pn00;
import xsna.qo2;
import xsna.ro2;
import xsna.tj0;
import xsna.u12;
import xsna.v1v;
import xsna.y9y;
import xsna.zhy0;

/* loaded from: classes7.dex */
public final class z extends WebViewClient implements com.vungle.ads.internal.util.v {
    public final h0 a;
    public final i3 b;
    public final ExecutorService c;
    public final com.vungle.ads.internal.platform.f d;
    public final com.vungle.ads.internal.load.e e;
    public final Long f;
    public final Lazy g;
    public boolean h;
    public String i;
    public String j;
    public String k;
    public String l;
    public WebView m;
    public boolean n;
    public com.vungle.ads.internal.ui.view.o o;
    public com.vungle.ads.internal.ui.view.p p;
    public com.vungle.ads.internal.omsdk.f q;
    public Boolean r;
    public final s1 s;
    public final s1 t;
    public final m2 u;

    public /* synthetic */ z(h0 h0Var, i3 i3Var, ExecutorService executorService, com.vungle.ads.internal.platform.f fVar) {
        this(h0Var, i3Var, executorService, fVar, null, null);
    }

    public static final void b(z zVar, WebView webView) {
        com.vungle.ads.internal.load.e eVar = zVar.e;
        if (eVar != null) {
            eVar.b();
        }
        zVar.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    public static final void c(z zVar, WebView webView) {
        com.vungle.ads.internal.load.e eVar = zVar.e;
        if (eVar != null) {
            eVar.a();
        }
        zVar.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", r.a);
        if (webView == null) {
            return;
        }
        this.m = webView;
        webView.setVisibility(0);
        a();
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new o(this.p));
        }
        com.vungle.ads.internal.omsdk.f fVar = this.q;
        if (fVar != null) {
            ((com.vungle.ads.internal.omsdk.e) fVar).a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String valueOf = String.valueOf(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
        String valueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z = false;
        boolean z2 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        boolean z3 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("VungleWebClient", "Http Error desc " + valueOf + ' ' + z2 + " for URL " + valueOf2);
        if ((valueOf2.length() > 0 ? this.a.b(valueOf2) : false) && z2) {
            z = true;
        }
        String a = v1v.a(' ', valueOf2, valueOf);
        com.vungle.ads.internal.ui.view.p pVar = this.p;
        if (pVar != null) {
            ((com.vungle.ads.internal.presenter.r) pVar).a(z, a);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.m = null;
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", new t(webView, renderProcessGoneDetail));
        com.vungle.ads.internal.ui.view.p pVar = this.p;
        if (pVar != null) {
            Boolean valueOf = renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null;
            com.vungle.ads.internal.presenter.r rVar = (com.vungle.ads.internal.presenter.r) pVar;
            boolean booleanValue = valueOf != null ? valueOf.booleanValue() : true;
            rVar.a(new WebViewRenderingProcessGone(zhy0.a("didCrash=", booleanValue)), booleanValue, null);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ad  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String scheme;
        Object pair;
        long j;
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url != null && (scheme = url.getScheme()) != null) {
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            if (lowerCase.equals("http") || lowerCase.equals(HttpRequest.DEFAULT_SCHEME)) {
                if (!this.a.B()) {
                    boolean z = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("VungleWebClient", w.a);
                    return null;
                }
                String uri = url.toString();
                com.vungle.ads.internal.model.b a = this.a.a(uri);
                String c = a != null ? a.c() : null;
                if (c != null && c.length() != 0) {
                    File file = new File(c);
                    if (file.exists()) {
                        long b = a.b();
                        if (b > 0) {
                            long length = file.length();
                            String str = webResourceRequest.getRequestHeaders().get(Command.HTTP_HEADER_RANGE);
                            this.s.a(str + " cached:" + length + ' ' + uri);
                            AnalyticsClient.a(AnalyticsClient.INSTANCE, this.s, this.a.q());
                            try {
                                if (str != null) {
                                    try {
                                    } catch (Throwable th) {
                                        pair = new Result.Failure(th);
                                    }
                                    if (brm0.B(str, "bytes=", false)) {
                                        List c0 = drm0.c0(drm0.U(str, "bytes="), new String[]{"-"}, 0, 6);
                                        String str2 = (String) j5g.b0(0, c0);
                                        Long n = str2 != null ? arm0.n(str2) : null;
                                        String str3 = (String) j5g.b0(1, c0);
                                        Long n2 = str3 != null ? arm0.n(str3) : null;
                                        if (n == null) {
                                            if (n2 == null) {
                                                n = 0L;
                                            } else {
                                                n = Long.valueOf(b - n2.longValue());
                                                n2 = null;
                                            }
                                        }
                                        pair = new Pair(n, n2);
                                        if (Result.a(pair) != null) {
                                            pair = new Pair(0L, null);
                                        }
                                        Pair pair2 = (Pair) pair;
                                        a.c(((Number) pair2.i()).longValue());
                                        a.a((Long) pair2.j());
                                        long longValue = ((Number) pair2.d()).longValue();
                                        Long l = (Long) pair2.g();
                                        j = length - longValue;
                                        boolean z2 = com.vungle.ads.internal.util.u.a;
                                        StringBuilder sb = new StringBuilder(">>request: ");
                                        sb.append(url);
                                        sb.append(" rangeStart=");
                                        sb.append(longValue);
                                        sb.append(" rangeEnd=");
                                        sb.append(l);
                                        sb.append(" cachedFileLength=");
                                        sb.append(length);
                                        tj0.d(sb, " availableBytes=", j, " contentLength=");
                                        sb.append(b);
                                        sb.append(' ');
                                        com.vungle.ads.internal.util.t.a(sb.toString());
                                        if (j <= 0) {
                                            com.vungle.ads.internal.util.t.a("VungleWebClient", new x(str));
                                            a.q();
                                            length = file.length();
                                        }
                                        long longValue2 = l == null ? l.longValue() : length - 1;
                                        long j2 = (longValue2 - longValue) + 1;
                                        FileInputStream fileInputStream = new FileInputStream(file);
                                        WebResourceResponse webResourceResponse = new WebResourceResponse(a.d(), C.UTF8_NAME, 206, "Partial Content", pn00.k(new Pair("Content-Type", a.d()), new Pair("Accept-Ranges", "bytes"), new Pair(Http.Header.CONTENT_LENGTH, String.valueOf(j2)), new Pair(Http.Header.CONTENT_RANGE, "bytes " + longValue + '-' + longValue2 + '/' + b)), new BufferedInputStream(fileInputStream, 1024));
                                        StringBuilder sb2 = new StringBuilder("<<Return:");
                                        sb2.append(webResourceResponse.getResponseHeaders());
                                        com.vungle.ads.internal.util.t.a(sb2.toString());
                                        return webResourceResponse;
                                    }
                                }
                                FileInputStream fileInputStream2 = new FileInputStream(file);
                                WebResourceResponse webResourceResponse2 = new WebResourceResponse(a.d(), C.UTF8_NAME, 206, "Partial Content", pn00.k(new Pair("Content-Type", a.d()), new Pair("Accept-Ranges", "bytes"), new Pair(Http.Header.CONTENT_LENGTH, String.valueOf(j2)), new Pair(Http.Header.CONTENT_RANGE, "bytes " + longValue + '-' + longValue2 + '/' + b)), new BufferedInputStream(fileInputStream2, 1024));
                                StringBuilder sb22 = new StringBuilder("<<Return:");
                                sb22.append(webResourceResponse2.getResponseHeaders());
                                com.vungle.ads.internal.util.t.a(sb22.toString());
                                return webResourceResponse2;
                            } catch (Throwable th2) {
                                Throwable a2 = Result.a(new Result.Failure(th2));
                                if (a2 != null) {
                                    boolean z3 = com.vungle.ads.internal.util.u.a;
                                    StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("Error serving local range video: ");
                                    a3.append(a2.getMessage());
                                    com.vungle.ads.internal.util.t.a("VungleWebClient", a3.toString(), a2);
                                    s1 s1Var = this.t;
                                    StringBuilder b2 = v1v.b(uri, ' ');
                                    b2.append(a2.getMessage());
                                    s1Var.a(b2.toString());
                                    AnalyticsClient.a(AnalyticsClient.INSTANCE, this.t, this.a.q());
                                }
                                return null;
                            }
                            pair = new Pair(0L, null);
                            if (Result.a(pair) != null) {
                            }
                            Pair pair22 = (Pair) pair;
                            a.c(((Number) pair22.i()).longValue());
                            a.a((Long) pair22.j());
                            long longValue3 = ((Number) pair22.d()).longValue();
                            Long l2 = (Long) pair22.g();
                            j = length - longValue3;
                            boolean z22 = com.vungle.ads.internal.util.u.a;
                            StringBuilder sb3 = new StringBuilder(">>request: ");
                            sb3.append(url);
                            sb3.append(" rangeStart=");
                            sb3.append(longValue3);
                            sb3.append(" rangeEnd=");
                            sb3.append(l2);
                            sb3.append(" cachedFileLength=");
                            sb3.append(length);
                            tj0.d(sb3, " availableBytes=", j, " contentLength=");
                            sb3.append(b);
                            sb3.append(' ');
                            com.vungle.ads.internal.util.t.a(sb3.toString());
                            if (j <= 0) {
                            }
                            if (l2 == null) {
                            }
                            long j22 = (longValue2 - longValue3) + 1;
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        try {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("VungleWebClient", "MRAID Command " + str);
        } catch (Throwable th) {
            if (th instanceof OutOfMemoryError) {
                new OutOfMemory(com.iab.omid.library.vungle.d.a("mraid:", str)).logErrorNoReturnValue$vungle_ads_release();
            }
        }
        if (str == null || str.length() == 0) {
            com.vungle.ads.internal.util.t.b("VungleWebClient", "Invalid URL ");
            return false;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme != null && scheme.length() != 0) {
            String scheme2 = parse.getScheme();
            if (!epx.f(scheme2, CampaignEx.JSON_KEY_MRAID)) {
                str2 = "VungleWebClient";
                if (!"http".equalsIgnoreCase(scheme2)) {
                    if (HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme2)) {
                    }
                    this.u.a("url: ".concat(str));
                    AnalyticsClient.a(AnalyticsClient.INSTANCE, this.u, this.a.q(), 4);
                    com.vungle.ads.internal.util.t.a(str2, new y(str));
                    return false;
                }
                com.vungle.ads.internal.util.t.a(str2, "Open URL".concat(str));
                com.vungle.ads.internal.ui.view.o oVar = this.o;
                if (oVar != null) {
                    y9y y9yVar = new y9y();
                    alk.u(y9yVar, "url", str);
                    ((com.vungle.ads.internal.presenter.r) oVar).a("openNonMraid", y9yVar.a());
                }
                return true;
            }
            str2 = "VungleWebClient";
            String host = parse.getHost();
            if (host != null) {
                int hashCode = host.hashCode();
                if (hashCode != -1943542072) {
                    if (hashCode == 88409791) {
                        if (host.equals("failToLoad")) {
                            this.c.execute(new qo2(13, this, webView));
                            return true;
                        }
                    } else if (hashCode == 119543762 && host.equals("readyToPlay")) {
                        this.c.execute(new nek(10, this, webView));
                        return true;
                    }
                } else if (host.equals("propertiesChangeCompleted")) {
                    if (!this.n) {
                        this.n = true;
                        this.c.execute(new ro2(9, this, webView));
                        return true;
                    }
                    return true;
                }
                com.vungle.ads.internal.ui.view.o oVar2 = this.o;
                if (oVar2 == null) {
                    a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
                    return true;
                }
                y9y y9yVar2 = new y9y();
                for (String str3 : parse.getQueryParameterNames()) {
                    alk.u(y9yVar2, str3, parse.getQueryParameter(str3));
                }
                this.c.execute(new gao(oVar2, host, y9yVar2.a(), this, webView, 1));
                return true;
            }
            this.u.a("url: ".concat(str));
            AnalyticsClient.a(AnalyticsClient.INSTANCE, this.u, this.a.q(), 4);
            com.vungle.ads.internal.util.t.a(str2, new y(str));
            return false;
        }
        return false;
    }

    public z(h0 h0Var, i3 i3Var, ExecutorService executorService, com.vungle.ads.internal.platform.f fVar, com.vungle.ads.internal.load.e eVar, Long l) {
        this.a = h0Var;
        this.b = i3Var;
        this.c = executorService;
        this.d = fVar;
        this.e = eVar;
        this.f = l;
        this.g = new bpn0(p.a);
        Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET;
        this.s = new s1(sDKMetricType);
        this.t = new s1(sDKMetricType);
        this.u = new m2(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL);
    }

    public final void a(int i) {
        ((com.vungle.ads.internal.util.j) this.g.getValue()).a(this.m, i, new q(this));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String valueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
        String valueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z = false;
        boolean z2 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        boolean z3 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("VungleWebClient", "Error desc " + valueOf + ' ' + z2 + " for URL " + valueOf2);
        if ((valueOf2.length() > 0 ? this.a.b(valueOf2) : false) && z2) {
            z = true;
        }
        String a = v1v.a(' ', valueOf2, valueOf);
        com.vungle.ads.internal.ui.view.p pVar = this.p;
        if (pVar != null) {
            ((com.vungle.ads.internal.presenter.r) pVar).a(z, a);
        }
    }

    public final void b(boolean z) {
        this.r = Boolean.valueOf(z);
        WebView webView = this.m;
        if (webView != null) {
            y9y y9yVar = new y9y();
            alk.t(y9yVar, X3.i.o, Boolean.valueOf(z));
            a(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + y9yVar.a() + ')');
        }
    }

    public final void a(boolean z, String str, String str2, String str3, String str4) {
        this.h = z;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
    }

    public final void a(com.vungle.ads.internal.ui.view.o oVar) {
        this.o = oVar;
    }

    public static final void a(z zVar, WebView webView) {
        zVar.a(webView, "window.vungle.mraidBridge.notifyReadyEvent(" + zVar.a.g() + ')');
    }

    public static final void a(com.vungle.ads.internal.ui.view.o oVar, String str, JsonObject jsonObject, z zVar, WebView webView) {
        if (((com.vungle.ads.internal.presenter.r) oVar).a(str, jsonObject)) {
            zVar.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
        }
    }

    public final void a() {
        this.c.execute(new u12(this, 19));
    }

    public final void a(String str, int i) {
        WebView webView = this.m;
        if (webView != null) {
            a(webView, "window.vungle.mraidBridgeExt.notifyBlackScreenResult(" + i + ')');
        }
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", "Returning black screen result: " + i + '%');
        if (i >= 0) {
            AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.BLACK_SCREEN_IS_DETECTED, i, this.a.q(), null, 8);
        } else {
            AnalyticsClient.INSTANCE.c(Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR, str, this.a.q());
        }
    }

    @Override // com.vungle.ads.internal.util.v
    public final void a(boolean z) {
        WebView webView = this.m;
        if (webView != null) {
            y9y y9yVar = new y9y();
            alk.t(y9yVar, "isSilent", Boolean.valueOf(z));
            a(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + y9yVar.a() + ')');
        }
    }

    public final void a(com.vungle.ads.internal.ui.view.p pVar) {
        this.p = pVar;
    }

    public final void a(com.vungle.ads.internal.omsdk.e eVar) {
        this.q = eVar;
    }

    public final void a(WebView webView, String str) {
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", new u(str));
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new v(this, webView, str));
    }

    public static final void a(boolean z, z zVar) {
        y9y y9yVar = new y9y();
        alk.u(y9yVar, "placementType", zVar.a.F());
        Boolean bool = zVar.r;
        if (bool != null) {
            alk.t(y9yVar, X3.i.o, bool);
        }
        alk.u(y9yVar, O6.F, "android");
        alk.u(y9yVar, EndpointParameters.Name.OS_VERSION, String.valueOf(Build.VERSION.SDK_INT));
        alk.t(y9yVar, "incentivized", Boolean.valueOf(zVar.b.j()));
        com.vungle.ads.internal.platform.f fVar = zVar.d;
        if (fVar != null) {
            alk.t(y9yVar, "isSilent", Boolean.valueOf(((com.vungle.ads.internal.platform.c) fVar).o()));
        }
        Long l = zVar.f;
        if (l != null) {
            y9yVar.b("timeLoaded", c9y.a(l));
        }
        if (zVar.h) {
            alk.t(y9yVar, "consentRequired", Boolean.TRUE);
            alk.u(y9yVar, "consentTitleText", zVar.i);
            alk.u(y9yVar, "consentBodyText", zVar.j);
            alk.u(y9yVar, "consentAcceptButtonText", zVar.k);
            alk.u(y9yVar, "consentDenyButtonText", zVar.l);
        } else {
            alk.t(y9yVar, "consentRequired", Boolean.FALSE);
        }
        alk.u(y9yVar, "sdkVersion", BuildConfig.VERSION_NAME);
        String str = "window.vungle.mraidBridge.notifyPropertiesChange(" + y9yVar.a() + ',' + z + ')';
        WebView webView = zVar.m;
        if (webView != null) {
            zVar.a(webView, str);
        }
    }
}
