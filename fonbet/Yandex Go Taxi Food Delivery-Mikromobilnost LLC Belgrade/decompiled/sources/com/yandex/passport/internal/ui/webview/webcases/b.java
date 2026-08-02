package com.yandex.passport.internal.ui.webview.webcases;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.ny61;

/* loaded from: classes2.dex */
public final class b extends l {
    public final Environment a;
    public final String b;
    public final Uri c;

    public b(o oVar) {
        Environment environment = oVar.c;
        Bundle bundle = oVar.d;
        this.a = environment;
        String string = bundle.getString("url", null);
        if (string == null || string.length() == 0) {
            ny61.r("Url should be specified in WebCaseData!");
            throw null;
        }
        this.b = string;
        Uri uri = (Uri) bundle.getParcelable("return_url");
        if (uri != null) {
            this.c = uri;
        } else {
            ny61.r("return_url is missing");
            throw null;
        }
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri d() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String f() {
        return this.b;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String g(Resources resources) {
        return "";
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final void i(WebViewActivity webViewActivity, Uri uri) {
        if (l.a(uri, this.c)) {
            l.b(webViewActivity, this.a, uri);
        }
    }
}
