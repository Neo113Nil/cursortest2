package com.yandex.passport.common.network;

import com.yandex.passport.common.network.k0;
import defpackage.gsq0;
import defpackage.jl40;

@gsq0(with = n.class)
/* loaded from: classes8.dex */
public final class g<E extends k0> extends j {
    public static final f Companion = new f();
    public final k0 a;

    public g(k0 k0Var) {
        this.a = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && jl40.l(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(errorResponse=" + this.a + ')';
    }
}
