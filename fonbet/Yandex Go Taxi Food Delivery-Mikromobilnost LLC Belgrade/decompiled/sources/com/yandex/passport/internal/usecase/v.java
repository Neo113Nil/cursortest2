package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class v extends com.yandex.passport.internal.ui.sloth.e {
    public final Uid a;

    static {
        int i = Uid.$stable;
    }

    public v(Uid uid) {
        this.a = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && jl40.l(this.a, ((v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Uid s() {
        return this.a;
    }

    public final String toString() {
        return uw51.j(new StringBuilder("AccountUid(uid="), this.a, ')');
    }
}
