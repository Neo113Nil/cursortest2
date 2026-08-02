package xsna;

import android.content.Context;
import android.os.SystemClock;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.vk.common.links.LaunchContext;
import com.vk.log.L;
import com.vk.music.common.MusicPlaybackLaunchContext;

/* compiled from: ArticleWebView.kt */
/* loaded from: classes15.dex */
public final class dq3 extends rjx0 {
    public final /* synthetic */ com.vk.articles.a f;
    public final /* synthetic */ lpj g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq3(sjx0 sjx0Var, com.vk.articles.a aVar, lpj lpjVar) {
        super(sjx0Var);
        this.f = aVar;
        this.g = lpjVar;
    }

    public final boolean b(WebView webView, String str, boolean z) {
        L.p("ArticleWebView", "shouldIgnoreWebViewError() called with: webView = " + webView + ", failingUrl = " + str + ", isForMainFrame = " + z);
        com.vk.articles.a aVar = this.f;
        boolean z2 = (!epx.f(str, aVar.getLastRequestedUrl()) || webView == null) && (aVar.j || !z);
        L.e("ArticleWebView", zhy0.a("shouldIgnoreWebViewError() returned: ", z2));
        return z2;
    }

    @Override // xsna.dir0, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        L.p("ArticleWebView", "onPageFinished() called with: view = " + webView + ", url = " + str);
        com.vk.articles.a aVar = this.f;
        if (!epx.f(str, aVar.getLastRequestedUrl()) || webView == null) {
            return;
        }
        aVar.c();
    }

    @Override // xsna.dir0, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        StringBuilder sb = new StringBuilder("onReceivedError() called with: view = ");
        sb.append(webView);
        sb.append(", errorCode = ");
        sb.append(i);
        sb.append(", description = ");
        L.p("ArticleWebView", tdj.a(sb, str, ", failingUrl = ", str2));
        if (b(webView, str2, true)) {
            return;
        }
        this.f.a();
    }

    @Override // xsna.rjx0, xsna.dir0, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Object obj;
        L.p("ArticleWebView", "shouldOverrideUrlLoading() called with: view = " + webView + ", url = " + str);
        com.vk.articles.a aVar = this.f;
        zic zicVar = aVar.g;
        float abs = Math.abs(zicVar.f - zicVar.c);
        float f = (float) zicVar.a;
        boolean z = true;
        boolean z2 = abs <= f && Math.abs(zicVar.g - zicVar.d) <= f && Math.abs(zicVar.h - zicVar.e) <= ((long) zicVar.b) && Math.abs(SystemClock.elapsedRealtime() - zicVar.h) <= 500;
        boolean isAttachedToWindow = aVar.isAttachedToWindow();
        L.p("ArticleWebView", zy60.c("isValidAndActualClick=", " attachedToWindow=", z2, isAttachedToWindow));
        if (!z2 || !isAttachedToWindow) {
            obj = "ArticleWebView";
            aVar.setLastRequestedUrl(str);
            z = super.shouldOverrideUrlLoading(webView, str);
        } else if (str != null) {
            obj = "ArticleWebView";
            LaunchContext launchContext = new LaunchContext(false, false, false, MusicPlaybackLaunchContext.s.t(), null, null, null, aVar.getTrackCode(), str, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108471);
            maz e = xwk.d().e();
            Context activity$app_shared_armRelease = aVar.getActivity$app_shared_armRelease();
            if (activity$app_shared_armRelease == null) {
                activity$app_shared_armRelease = this.g;
            }
            maz.c(e, activity$app_shared_armRelease, str, launchContext, null, null, 24);
        } else {
            obj = "ArticleWebView";
        }
        boolean z3 = z;
        L.p(obj, zhy0.a("shouldOverrideUrlLoading() returned: ", z3));
        return z3;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        L.p("ArticleWebView", "onReceivedError() called with: view = " + webView + ", request = " + webResourceRequest + ", error = " + webResourceError);
        String valueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean isForMainFrame = webResourceRequest != null ? webResourceRequest.isForMainFrame() : false;
        if (gz80.a(23)) {
            StringBuilder a = t33.a("Article preloading error: ", valueOf, ": ");
            a.append(webResourceError != null ? webResourceError.getErrorCode() : 0);
            a.append(", ");
            a.append((Object) (webResourceError != null ? webResourceError.getDescription() : null));
            L.e("ArticleWebView", a.toString());
        }
        if (b(webView, valueOf, isForMainFrame)) {
            return;
        }
        this.f.a();
    }
}
