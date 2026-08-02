package com.yandex.passport.internal.ui.challenge.logout;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class c0 implements d0 {
    public final com.yandex.passport.internal.ui.challenge.webview.k a;

    public c0(com.yandex.passport.internal.ui.challenge.webview.k kVar) {
        this.a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && jl40.l(this.a, ((c0) obj).a);
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
