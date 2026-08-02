package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class r implements u {
    public final Throwable a;

    public r(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && jl40.l(this.a, ((r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("SetError(error="), this.a, ')');
    }
}
