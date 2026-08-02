package xsna;

import android.os.Message;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.vk.log.L;
import com.vkontakte.android.fragments.WikiViewFragment;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;

/* compiled from: WikiViewFragment.kt */
/* loaded from: classes7.dex */
public final class npx0 extends bir0 {
    public final /* synthetic */ WikiViewFragment e;

    /* compiled from: WikiViewFragment.kt */
    public static final class a extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            xwk.d().e().a(webView.getContext(), str);
            webView.destroy();
            return true;
        }
    }

    public npx0(WikiViewFragment wikiViewFragment) {
        this.e = wikiViewFragment;
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(new a());
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        L.p("vk", go9.b("ALERT -> ", str2));
        return true;
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        WikiViewFragment wikiViewFragment = this.e;
        MaterialProgressBar materialProgressBar = wikiViewFragment.m0;
        if (materialProgressBar == null) {
            materialProgressBar = null;
        }
        materialProgressBar.setProgress(i * 100);
        MaterialProgressBar materialProgressBar2 = wikiViewFragment.m0;
        j6r0.c(i == 100 ? 8 : 0, materialProgressBar2 != null ? materialProgressBar2 : null);
        if (i <= 0 || wikiViewFragment.f0) {
            return;
        }
        wikiViewFragment.oo();
    }
}
