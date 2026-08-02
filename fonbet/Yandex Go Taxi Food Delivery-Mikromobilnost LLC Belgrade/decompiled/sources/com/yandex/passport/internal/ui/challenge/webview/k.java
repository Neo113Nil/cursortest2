package com.yandex.passport.internal.ui.challenge.webview;

import defpackage.jl40;
import defpackage.unr0;
import defpackage.uw51;

/* loaded from: classes8.dex */
public final class k {
    public final String a;
    public final String b;
    public final boolean c;

    public k(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return jl40.l(this.a, kVar.a) && jl40.l(this.b, kVar.b) && this.c == kVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChallengeWebViewParams(startUrl=");
        uw51.y(sb, this.a, ", returnUrl=");
        uw51.y(sb, this.b, ", shouldClearCookies=false, shouldLockOrientation=");
        return unr0.u(sb, this.c, ')');
    }
}
