package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class m {
    public final Uid a;

    static {
        int i = Uid.$stable;
    }

    public m(Uid uid) {
        this.a = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && jl40.l(this.a, ((m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return uw51.j(new StringBuilder("Params(uid="), this.a, ')');
    }
}
