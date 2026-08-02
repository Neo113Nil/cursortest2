package com.yandex.passport.internal.social.esia;

import android.webkit.WebView;
import defpackage.i1k;

/* loaded from: classes15.dex */
public final class l implements i1k {
    public final /* synthetic */ WebView a;

    public l(WebView webView) {
        this.a = webView;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        this.a.destroy();
    }
}
