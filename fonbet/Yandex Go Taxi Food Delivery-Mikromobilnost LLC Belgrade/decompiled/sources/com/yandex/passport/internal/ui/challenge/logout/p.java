package com.yandex.passport.internal.ui.challenge.logout;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class p {
    public final n a;
    public final Throwable b;
    public final Boolean c;
    public final com.yandex.passport.internal.ui.challenge.webview.k d;

    public p(n nVar, Throwable th, Boolean bool, com.yandex.passport.internal.ui.challenge.webview.k kVar) {
        this.a = nVar;
        this.b = th;
        this.c = bool;
        this.d = kVar;
    }

    public static p a(p pVar, n nVar, Throwable th, Boolean bool, com.yandex.passport.internal.ui.challenge.webview.k kVar, int i) {
        if ((i & 1) != 0) {
            nVar = pVar.a;
        }
        if ((i & 2) != 0) {
            th = pVar.b;
        }
        if ((i & 4) != 0) {
            bool = pVar.c;
        }
        if ((i & 8) != 0) {
            kVar = pVar.d;
        }
        pVar.getClass();
        return new p(nVar, th, bool, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return jl40.l(this.a, pVar.a) && jl40.l(this.b, pVar.b) && jl40.l(this.c, pVar.c) && jl40.l(this.d, pVar.d);
    }

    public final int hashCode() {
        n nVar = this.a;
        int hashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        Throwable th = this.b;
        int hashCode2 = (hashCode + (th == null ? 0 : th.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        com.yandex.passport.internal.ui.challenge.webview.k kVar = this.d;
        return hashCode3 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        return "State(challengeData=" + this.a + ", error=" + this.b + ", isChallengePassed=" + this.c + ", webViewParams=" + this.d + ')';
    }

    public p() {
        this(null, null, null, null);
    }
}
