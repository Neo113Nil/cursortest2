package xsna;

import android.view.View;
import android.webkit.WebView;
import com.vkontakte.android.fragments.WebViewFragment;

/* compiled from: WebViewFragment.java */
/* loaded from: classes7.dex */
public final class six0 implements View.OnClickListener {
    public final /* synthetic */ WebView b;
    public final /* synthetic */ WebViewFragment c;

    public six0(WebViewFragment webViewFragment, WebView webView) {
        this.c = webViewFragment;
        this.b = webView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.b;
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            this.c.finish();
        }
    }
}
