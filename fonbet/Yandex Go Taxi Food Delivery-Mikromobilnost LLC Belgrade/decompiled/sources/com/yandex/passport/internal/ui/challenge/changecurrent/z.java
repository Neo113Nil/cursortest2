package com.yandex.passport.internal.ui.challenge.changecurrent;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class z implements a0 {
    public final com.yandex.passport.internal.ui.challenge.webview.k a;

    public z(com.yandex.passport.internal.ui.challenge.webview.k kVar) {
        this.a = kVar;
    }

    public final com.yandex.passport.internal.ui.challenge.webview.k a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && jl40.l(this.a, ((z) obj).a);
    }

    public final int hashCode() {
        com.yandex.passport.internal.ui.challenge.webview.k kVar = this.a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public final String toString() {
        return "WebViewParams(webViewParams=" + this.a + ')';
    }
}
