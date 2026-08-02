package com.yandex.passport.common.ebs;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class c extends g {
    public final Throwable a;

    public c(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && jl40.l(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("Failed(throwable="), this.a, ')');
    }
}
