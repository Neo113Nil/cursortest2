package com.yandex.passport.internal.ui.webview.webcases;

import android.content.res.Resources;
import android.net.Uri;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.ny61;

/* loaded from: classes2.dex */
public final class k extends l {
    public final String a;

    public k(o oVar) {
        String string = oVar.d.getString("url", null);
        if (string.length() != 0) {
            this.a = string;
        } else {
            ny61.r("Url should be specified in WebCaseData!");
            throw null;
        }
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri d() {
        throw new IllegalStateException("returnUrl is not applicable for ViewLegalWebCase");
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String f() {
        return this.a;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String g(Resources resources) {
        return "";
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final void i(WebViewActivity webViewActivity, Uri uri) {
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final boolean j(WebViewActivity webViewActivity, Uri uri) {
        return false;
    }
}
