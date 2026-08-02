package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class n0 {
    public final String a;
    public final Uid b;

    static {
        int i = Uid.$stable;
    }

    public n0(Uid uid, String str) {
        this.a = str;
        this.b = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return jl40.l(this.a, n0Var.a) && jl40.l(this.b, n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(url=");
        uw51.y(sb, this.a, ", uid=");
        return uw51.j(sb, this.b, ')');
    }
}
