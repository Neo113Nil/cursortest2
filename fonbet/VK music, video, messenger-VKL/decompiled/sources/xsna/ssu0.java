package xsna;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl;

/* compiled from: VkExternalAuthChromeClient.kt */
/* loaded from: classes15.dex */
public final class ssu0 extends bir0 {
    public final tsu0 e;
    public final n1w0 f;

    public ssu0(tsu0 tsu0Var, VkWebFileChooserImpl vkWebFileChooserImpl) {
        this.e = tsu0Var;
        this.f = vkWebFileChooserImpl;
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.e.a(i);
    }

    @Override // xsna.bir0, android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        this.f.b(valueCallback, fileChooserParams);
        return true;
    }
}
