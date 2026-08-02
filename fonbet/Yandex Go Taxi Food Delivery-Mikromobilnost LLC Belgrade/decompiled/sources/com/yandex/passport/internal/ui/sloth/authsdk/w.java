package com.yandex.passport.internal.ui.sloth.authsdk;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class w {
    public final g a;
    public final Throwable b;

    public w(g gVar, Throwable th) {
        this.a = gVar;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return jl40.l(this.a, wVar.a) && jl40.l(this.b, wVar.b);
    }

    public final int hashCode() {
        g gVar = this.a;
        int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        Throwable th = this.b;
        return hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(result=");
        sb.append(this.a);
        sb.append(", error=");
        return unr0.s(sb, this.b, ')');
    }

    public w() {
        this(null, null);
    }
}
