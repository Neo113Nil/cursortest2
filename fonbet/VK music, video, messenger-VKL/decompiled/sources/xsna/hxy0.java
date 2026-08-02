package xsna;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.id.captcha.web.VKCaptchaWebViewActivity;
import java.util.Locale;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;

/* compiled from: VKCaptchaWebViewClient.kt */
/* loaded from: classes2.dex */
public final class hxy0 extends WebViewClient {
    public final WebView a;
    public final sey0 b;
    public final ThreadPoolExecutor c;
    public final VKCaptchaWebViewActivity.h d;
    public final VKCaptchaWebViewActivity.i e;
    public final VKCaptchaWebViewActivity.j f;
    public final boolean g;
    public final String h;
    public final String i;
    public final Object j = msy.a(LazyThreadSafetyMode.NONE, new vwy0(this));

    public hxy0(WebView webView, sey0 sey0Var, ThreadPoolExecutor threadPoolExecutor, VKCaptchaWebViewActivity.h hVar, VKCaptchaWebViewActivity.i iVar, VKCaptchaWebViewActivity.j jVar, boolean z, String str, String str2) {
        this.a = webView;
        this.b = sey0Var;
        this.c = threadPoolExecutor;
        this.d = hVar;
        this.e = iVar;
        this.f = jVar;
        this.g = z;
        this.h = str;
        this.i = str2;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webView != null) {
            webView.loadUrl("file:///android_asset/index.html");
        }
        this.c.execute(new e0(11, this, webResourceError));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        this.c.execute(new lap(webResourceRequest, this, webResourceResponse, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (xsna.brm0.B(r4, xsna.drm0.k0(r0, "?", r0), false) != false) goto L24;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.webkit.WebViewClient
    @ozl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse;
        String host;
        qoy0 qoy0Var = (qoy0) this.j.getValue();
        Uri parse2 = Uri.parse(str);
        qoy0Var.getClass();
        boolean z = false;
        if (parse2 != null && qoy0Var.a) {
            String uri = parse2.toString();
            String str2 = qoy0Var.b;
        }
        if (parse2 != null && webView != null) {
            bpn0 bpn0Var = new bpn0(r8y0.i);
            String uri2 = parse2.toString();
            if ((!URLUtil.isHttpsUrl(uri2) || (host = (parse = Uri.parse(uri2)).getHost()) == null || host.length() == 0) ? false : ((Regex) bpn0Var.getValue()).f(String.valueOf(parse.getHost()).toLowerCase(Locale.getDefault()))) {
                try {
                    webView.getContext().startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setData(parse2));
                } catch (ActivityNotFoundException unused) {
                }
            }
        }
        z = true;
        if (!z) {
            if (str == null) {
                str = "";
            }
            this.a.loadUrl(str);
        }
        return true;
    }
}
