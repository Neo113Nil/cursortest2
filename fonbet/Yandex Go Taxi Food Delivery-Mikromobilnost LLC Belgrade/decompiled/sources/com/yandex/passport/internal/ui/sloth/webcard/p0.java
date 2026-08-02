package com.yandex.passport.internal.ui.sloth.webcard;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class p0 implements q0 {
    public final Uid a;

    static {
        int i = Uid.$stable;
    }

    public p0(Uid uid) {
        this.a = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && jl40.l(this.a, ((p0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Relogin(" + this.a.getValue() + ')';
    }
}
