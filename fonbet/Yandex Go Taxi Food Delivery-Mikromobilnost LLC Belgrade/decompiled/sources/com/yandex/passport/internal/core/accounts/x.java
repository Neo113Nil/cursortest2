package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.a0;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes15.dex */
public final class x extends a0 {
    public final Uid a;

    static {
        int i = Uid.$stable;
    }

    public x(Uid uid) {
        this.a = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && jl40.l(this.a, ((x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Uid m0() {
        return this.a;
    }

    public final String toString() {
        return uw51.j(new StringBuilder("AccountUid(uid="), this.a, ')');
    }
}
