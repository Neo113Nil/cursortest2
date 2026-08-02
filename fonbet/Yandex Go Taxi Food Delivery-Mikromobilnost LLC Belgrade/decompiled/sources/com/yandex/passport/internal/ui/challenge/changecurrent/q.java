package com.yandex.passport.internal.ui.challenge.changecurrent;

import defpackage.jl40;

/* loaded from: classes8.dex */
public final class q {
    public final o a;
    public final Throwable b;
    public final String c;
    public final Boolean d;
    public final com.yandex.passport.internal.ui.challenge.webview.k e;

    public q(o oVar, Throwable th, String str, Boolean bool, com.yandex.passport.internal.ui.challenge.webview.k kVar) {
        this.a = oVar;
        this.b = th;
        this.c = str;
        this.d = bool;
        this.e = kVar;
    }

    public static q a(q qVar, o oVar, Throwable th, String str, Boolean bool, com.yandex.passport.internal.ui.challenge.webview.k kVar, int i) {
        if ((i & 1) != 0) {
            oVar = qVar.a;
        }
        o oVar2 = oVar;
        if ((i & 2) != 0) {
            th = qVar.b;
        }
        Throwable th2 = th;
        if ((i & 4) != 0) {
            str = qVar.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            bool = qVar.d;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            kVar = qVar.e;
        }
        qVar.getClass();
        return new q(oVar2, th2, str2, bool2, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return jl40.l(this.a, qVar.a) && jl40.l(this.b, qVar.b) && jl40.l(this.c, qVar.c) && jl40.l(this.d, qVar.d) && jl40.l(this.e, qVar.e);
    }

    public final int hashCode() {
        o oVar = this.a;
        int hashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
        Throwable th = this.b;
        int hashCode2 = (hashCode + (th == null ? 0 : th.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        com.yandex.passport.internal.ui.challenge.webview.k kVar = this.e;
        return hashCode4 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        return "State(challengeData=" + this.a + ", error=" + this.b + ", webError=" + this.c + ", isChallengePassed=" + this.d + ", webViewParams=" + this.e + ')';
    }

    public /* synthetic */ q(int i) {
        this(null, null, null, null, null);
    }

    public q() {
        this(0);
    }
}
