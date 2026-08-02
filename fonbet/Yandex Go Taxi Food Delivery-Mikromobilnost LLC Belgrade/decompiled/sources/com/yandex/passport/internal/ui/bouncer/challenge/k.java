package com.yandex.passport.internal.ui.bouncer.challenge;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class k implements l {
    public final com.yandex.passport.internal.ui.challenge.webview.k a;

    public k(com.yandex.passport.internal.ui.challenge.webview.k kVar) {
        this.a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && jl40.l(this.a, ((k) obj).a);
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
