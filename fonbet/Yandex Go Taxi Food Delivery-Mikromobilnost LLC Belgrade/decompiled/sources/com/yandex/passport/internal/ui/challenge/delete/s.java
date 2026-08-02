package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class s {
    public final Uid a;
    public final boolean b;

    static {
        int i = Uid.$stable;
    }

    public s(Uid uid, boolean z) {
        this.a = uid;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return jl40.l(this.a, sVar.a) && this.b == sVar.b;
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
