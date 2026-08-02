package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class l0 {
    public final o0 a;
    public final Throwable b;

    public l0(o0 o0Var, Throwable th) {
        this.a = o0Var;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return jl40.l(this.a, l0Var.a) && jl40.l(this.b, l0Var.b);
    }

    public final int hashCode() {
        o0 o0Var = this.a;
        int hashCode = (o0Var == null ? 0 : o0Var.hashCode()) * 31;
        Throwable th = this.b;
        return hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(bottomSheetParameters=");
        sb.append(this.a);
        sb.append(", error=");
        return unr0.s(sb, this.b, ')');
    }

    public l0() {
        this(null, null);
    }
}
