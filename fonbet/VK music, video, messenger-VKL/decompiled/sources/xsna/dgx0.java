package xsna;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.superapp.core.errors.WebViewException;

/* compiled from: WebBridgeWebViewClient.kt */
/* loaded from: classes6.dex */
public final class dgx0 extends dir0 {
    public final xc80 d;
    public final wpx0 e;
    public boolean f;

    public dgx0(xc80 xc80Var, wpx0 wpx0Var) {
        this.d = xc80Var;
        this.e = wpx0Var;
    }

    @Override // xsna.dir0, xsna.ggx0
    public final int a() {
        return 0;
    }

    @Override // xsna.dir0, android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        this.d.q();
    }

    @Override // xsna.dir0, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        boolean z = this.f;
        xc80 xc80Var = this.d;
        if (z && !xc80Var.i()) {
            this.f = false;
            xc80Var.x();
        }
        xc80Var.n();
    }

    @Override // xsna.dir0, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.d.B(new WebViewException(i, str));
    }

    @Override // xsna.dir0, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest == null || webResourceResponse == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String uri = url != null ? url.toString() : null;
        if (uri == null) {
            uri = "";
        }
        this.d.l(webResourceResponse.getStatusCode(), uri);
    }

    @Override // xsna.dir0, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.e.invoke();
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // xsna.dir0, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse;
        super.shouldOverrideUrlLoading(webView, str);
        if ((webView != null ? webView.getContext() : null) == null || str == null || drm0.N(str)) {
            return false;
        }
        try {
            parse = Uri.parse(str);
        } catch (ActivityNotFoundException | Exception unused) {
        }
        if (!parse.isOpaque()) {
            String queryParameter = parse.getQueryParameter("id");
            boolean z = epx.f(parse.getHost(), "play.google.com") && epx.f(parse.getPath(), "/store/apps/details");
            boolean f = epx.f(parse.getScheme(), "market");
            if ((z || f) && queryParameter != null && !drm0.N(queryParameter)) {
                Context applicationContext = webView.getContext().getApplicationContext();
                try {
                    applicationContext.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=".concat(queryParameter))).addFlags(268435456));
                } catch (ActivityNotFoundException unused2) {
                    applicationContext.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("http://play.google.com/store/apps/details?id=".concat(queryParameter))).addFlags(268435456));
                }
                return true;
            }
        }
        if (!this.d.j(str)) {
            return false;
        }
        return true;
    }
}
