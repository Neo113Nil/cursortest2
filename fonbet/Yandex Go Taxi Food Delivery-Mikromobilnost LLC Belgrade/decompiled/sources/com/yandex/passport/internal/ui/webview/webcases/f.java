package com.yandex.passport.internal.ui.webview.webcases;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.R;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ui.webview.WebViewActivity;

/* loaded from: classes2.dex */
public final class f extends l {
    public final Environment a;
    public final com.yandex.passport.internal.network.client.c b;
    public final Bundle c;
    public final Uri d;

    public f(o oVar) {
        Environment environment = oVar.c;
        com.yandex.passport.internal.network.client.c cVar = oVar.b;
        Bundle bundle = oVar.d;
        this.a = environment;
        this.b = cVar;
        this.c = bundle;
        Uri.Builder appendEncodedPath = Uri.parse(cVar.b(environment).a()).buildUpon().appendEncodedPath("profile");
        appendEncodedPath.appendQueryParameter("type", "am_challenge");
        this.d = Uri.parse(appendEncodedPath.toString());
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri d() {
        return this.d;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String f() {
        String str = (String) this.c.get("key-track-id");
        com.yandex.passport.internal.network.client.e b = this.b.b(this.a);
        if (str == null) {
            str = "";
        }
        return Uri.parse(b.a()).buildUpon().appendEncodedPath("auth").appendQueryParameter("track_id", str).appendQueryParameter("retpath", this.d.toString()).toString();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String g(Resources resources) {
        return resources.getString(R.string.passport_required_web_error_webview_title);
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final void i(WebViewActivity webViewActivity, Uri uri) {
        if (l.a(uri, this.d)) {
            l.b(webViewActivity, this.a, uri);
        }
    }
}
