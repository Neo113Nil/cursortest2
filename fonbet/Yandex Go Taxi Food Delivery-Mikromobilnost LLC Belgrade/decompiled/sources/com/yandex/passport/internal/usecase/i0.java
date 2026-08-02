package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class i0 {
    public final Uid a;
    public final String b;

    static {
        int i = Uid.$stable;
    }

    public i0(Uid uid, String str) {
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
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return jl40.l(this.a, i0Var.a) && jl40.l(this.b, i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(uid=");
        sb.append(this.a);
        sb.append(", host=");
        return b64.p(sb, this.b, ')');
    }
}
