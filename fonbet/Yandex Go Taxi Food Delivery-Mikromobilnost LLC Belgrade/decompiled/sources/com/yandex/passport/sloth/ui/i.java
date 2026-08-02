package com.yandex.passport.sloth.ui;

import android.webkit.JavascriptInterface;
import defpackage.tls;

/* loaded from: classes2.dex */
public final class i {
    public final tls a;

    public i(tls tlsVar) {
        this.a = tlsVar;
    }

    @JavascriptInterface
    public final void send(String str) {
        if (str != null) {
            this.a.invoke(str);
        }
    }
}
