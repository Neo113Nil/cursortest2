package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ui.bouncer.model.d1;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class x implements z {
    public final d1 a;

    static {
        int i = Uid.$stable;
    }

    public x(d1 d1Var) {
        this.a = d1Var;
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

    public final String toString() {
        return "AccountPhoneNumber(masterAccount=" + this.a + ')';
    }
}
