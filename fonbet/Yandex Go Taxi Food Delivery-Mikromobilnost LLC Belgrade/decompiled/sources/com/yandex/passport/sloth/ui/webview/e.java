package com.yandex.passport.sloth.ui.webview;

import android.net.http.SslError;

/* loaded from: classes2.dex */
public final class e extends f {
    public final SslError a;

    public e(SslError sslError) {
        this.a = sslError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.a.equals(((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Ssl(error=" + this.a + ')';
    }
}
