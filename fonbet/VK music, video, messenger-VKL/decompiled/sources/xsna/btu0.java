package xsna;

import android.net.Uri;
import android.webkit.WebView;

/* compiled from: VkExternalAuthWebViewClient.kt */
/* loaded from: classes15.dex */
public final class btu0 extends cir0 {
    public final tsu0 c;
    public final usu0 d;
    public final Uri e;

    public btu0(tsu0 tsu0Var, ysu0 ysu0Var, Uri uri) {
        this.c = tsu0Var;
        this.d = ysu0Var;
        this.e = uri;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.c.b(str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            Uri uri = this.e;
            if (!epx.f(scheme, uri.getScheme()) || !epx.f(parse.getAuthority(), uri.getAuthority())) {
                return false;
            }
            this.d.b(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
