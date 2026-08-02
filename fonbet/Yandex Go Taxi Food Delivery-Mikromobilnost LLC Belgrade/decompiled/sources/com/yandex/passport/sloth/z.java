package com.yandex.passport.sloth;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class z implements i0 {
    public final Uid a;

    public z(Uid uid) {
        this.a = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && jl40.l(this.a, ((z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return uw51.j(new StringBuilder("DeleteAccountAuth(uid="), this.a, ')');
    }
}
