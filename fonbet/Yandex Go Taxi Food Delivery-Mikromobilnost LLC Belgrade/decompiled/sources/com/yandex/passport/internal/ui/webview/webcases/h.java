package com.yandex.passport.internal.ui.webview.webcases;

import android.net.Uri;
import com.yandex.passport.internal.ui.webview.WebViewActivity;

/* loaded from: classes2.dex */
public final class h extends l {
    public String a;

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri d() {
        throw new IllegalStateException("returnUrl is not applicable for ShowAuthCodeWebCase");
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String f() {
        return this.a;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final void i(WebViewActivity webViewActivity, Uri uri) {
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final boolean j(WebViewActivity webViewActivity, Uri uri) {
        return false;
    }
}
