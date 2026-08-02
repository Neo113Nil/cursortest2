package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class t0 implements w0 {
    public final Uid a;
    public final boolean b;

    static {
        int i = Uid.$stable;
    }

    public t0(Uid uid, boolean z) {
        this.a = uid;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return jl40.l(this.a, t0Var.a) && this.b == t0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Relogin(uid=");
        sb.append(this.a);
        sb.append(", isPhonish=");
        return unr0.u(sb, this.b, ')');
    }
}
