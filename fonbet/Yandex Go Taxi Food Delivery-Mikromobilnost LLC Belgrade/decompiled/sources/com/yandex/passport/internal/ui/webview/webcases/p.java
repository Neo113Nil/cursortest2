package com.yandex.passport.internal.ui.webview.webcases;

import android.net.Uri;
import android.webkit.CookieManager;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ui.webview.WebViewActivity;

/* loaded from: classes2.dex */
public final class p extends l {
    public final Environment a;
    public final com.yandex.passport.internal.network.client.c b;
    public final Uri c;
    public final Uri d;

    public p(o oVar) {
        Environment environment = oVar.c;
        com.yandex.passport.internal.network.client.c cVar = oVar.b;
        this.a = environment;
        this.b = cVar;
        Uri d = cVar.b(environment).d();
        this.c = d;
        this.d = d.buildUpon().appendPath("cancel").build();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri d() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String f() {
        com.yandex.passport.internal.network.client.e b = this.b.b(this.a);
        String uri = this.c.toString();
        String builder = Uri.parse(b.a()).buildUpon().appendEncodedPath("auth").appendQueryParameter("retpath", uri).appendQueryParameter("backpath", this.d.toString()).toString();
        CookieManager.getInstance().setCookie(builder, "mda=0");
        CookieManager.getInstance().flush();
        return builder;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final void i(WebViewActivity webViewActivity, Uri uri) {
        if (l.a(uri, this.d)) {
            webViewActivity.finish();
        } else if (l.a(uri, this.c)) {
            l.b(webViewActivity, this.a, uri);
        }
    }
}
