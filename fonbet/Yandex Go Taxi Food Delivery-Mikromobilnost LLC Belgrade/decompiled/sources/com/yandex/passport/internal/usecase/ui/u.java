package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes15.dex */
public final class u {
    public final String a;
    public final Uid b;

    static {
        int i = Uid.$stable;
    }

    public u(Uid uid, String str) {
        this.a = str;
        this.b = uid;
    }

    public final String a() {
        return this.a;
    }

    public final Uid b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return jl40.l(this.a, uVar.a) && jl40.l(this.b, uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(host=");
        sb.append(this.a);
        sb.append(", uid=");
        return uw51.j(sb, this.b, ')');
    }
}
