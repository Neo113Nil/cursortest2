package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class w implements n0 {
    public final Uid a;

    static {
        int i = Uid.$stable;
    }

    public w(Uid uid) {
        this.a = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && jl40.l(this.a, ((w) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Relogin(uid=" + this.a + ", canGoBack=true)";
    }
}
