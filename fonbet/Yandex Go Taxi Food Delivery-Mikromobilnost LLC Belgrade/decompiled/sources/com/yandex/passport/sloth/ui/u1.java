package com.yandex.passport.sloth.ui;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class u1 implements y1 {
    public final com.yandex.passport.sloth.ui.webview.f a;

    public u1(com.yandex.passport.sloth.ui.webview.f fVar) {
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1) && jl40.l(this.a, ((u1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnWebViewError(error=" + this.a + ')';
    }
}
