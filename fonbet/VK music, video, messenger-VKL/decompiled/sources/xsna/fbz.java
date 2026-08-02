package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.common.links.LaunchContext;
import com.vk.device.store.AppStore;
import com.vk.log.L;
import com.vkontakte.android.R;

/* compiled from: LinkUtils.java */
/* loaded from: classes17.dex */
public final class fbz extends dir0 {
    public final /* synthetic */ Context d;
    public final /* synthetic */ ner0 e;
    public final /* synthetic */ LaunchContext f;

    public fbz(Context context, ner0 ner0Var, LaunchContext launchContext) {
        this.d = context;
        this.e = ner0Var;
        this.f = launchContext;
    }

    @Override // xsna.dir0, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        com.vk.common.links.b.k(this.d, webView, str, this.e, this.f);
    }

    @Override // xsna.dir0, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        L.l(go9.b("WebView error ", str));
        cvk.u(R.string.default_network_error, false);
        webView.destroy();
        u1u0.b(this.e);
        ((ViewGroup) d3r0.a(this.d).getWindow().getDecorView()).removeView(webView);
    }

    @Override // xsna.dir0, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        if ("http".equals(parse.getScheme()) || HttpRequest.DEFAULT_SCHEME.equals(parse.getScheme())) {
            AppStore.Companion.getClass();
            if (AppStore.a.a(parse) == null) {
                return false;
            }
        }
        com.vk.common.links.b.k(this.d, webView, str, this.e, this.f);
        return true;
    }
}
