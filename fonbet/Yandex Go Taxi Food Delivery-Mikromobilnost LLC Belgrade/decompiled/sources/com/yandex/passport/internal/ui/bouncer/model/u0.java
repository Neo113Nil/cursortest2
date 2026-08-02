package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class u0 implements a1 {
    public final Uid a;

    static {
        int i = Uid.$stable;
    }

    public u0(Uid uid) {
        this.a = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && jl40.l(this.a, ((u0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return uw51.j(new StringBuilder("Relogin(uid="), this.a, ')');
    }
}
