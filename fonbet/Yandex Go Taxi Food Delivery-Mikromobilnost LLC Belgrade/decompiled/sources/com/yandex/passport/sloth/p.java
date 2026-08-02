package com.yandex.passport.sloth;

import defpackage.jl40;
import defpackage.unr0;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class p implements u {
    public final String a;
    public final boolean b;
    public final boolean c;

    public p(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return jl40.l(this.a, pVar.a) && this.b == pVar.b && this.c == pVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenExternalUrl(url=");
        uw51.y(sb, this.a, ", isAuthUrlRequired=");
        sb.append(this.b);
        sb.append(", isWebViewClosed=");
        return unr0.u(sb, this.c, ')');
    }
}
