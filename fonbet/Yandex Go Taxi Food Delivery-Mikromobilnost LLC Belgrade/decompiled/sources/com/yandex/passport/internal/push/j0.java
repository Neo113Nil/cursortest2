package com.yandex.passport.internal.push;

import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class j0 {
    public final Uid a;
    public final String b;

    static {
        int i = Uid.$stable;
    }

    public j0(Uid uid, String str) {
        this.a = uid;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final Uid b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return jl40.l(this.a, j0Var.a) && jl40.l(this.b, j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushSubscription(uid=");
        sb.append(this.a);
        sb.append(", tokenHash=");
        return b64.p(sb, this.b, ')');
    }
}
