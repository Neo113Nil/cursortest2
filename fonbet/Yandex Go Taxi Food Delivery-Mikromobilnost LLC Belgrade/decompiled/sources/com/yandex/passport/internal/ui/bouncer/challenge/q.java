package com.yandex.passport.internal.ui.bouncer.challenge;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class q {
    public final o a;
    public final com.yandex.passport.internal.ui.challenge.webview.k b;

    public q(o oVar, com.yandex.passport.internal.ui.challenge.webview.k kVar) {
        this.a = oVar;
        this.b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return jl40.l(this.a, qVar.a) && jl40.l(this.b, qVar.b);
    }

    public final int hashCode() {
        o oVar = this.a;
        int hashCode = (oVar == null ? 0 : Boolean.hashCode(oVar.a)) * 31;
        com.yandex.passport.internal.ui.challenge.webview.k kVar = this.b;
        return hashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        return "State(challengeResult=" + this.a + ", webViewParams=" + this.b + ')';
    }

    public q() {
        this(null, null);
    }
}
