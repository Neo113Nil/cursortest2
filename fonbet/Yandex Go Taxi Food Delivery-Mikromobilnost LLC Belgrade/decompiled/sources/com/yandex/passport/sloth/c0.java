package com.yandex.passport.sloth;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class c0 implements i0 {
    public final Uid a;

    public c0(Uid uid) {
        this.a = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && jl40.l(this.a, ((c0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return uw51.j(new StringBuilder("Relogin(uid="), this.a, ')');
    }
}
