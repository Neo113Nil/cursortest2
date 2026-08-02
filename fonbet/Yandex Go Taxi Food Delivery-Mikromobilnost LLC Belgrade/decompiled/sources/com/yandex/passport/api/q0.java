package com.yandex.passport.api;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class q0 implements r0 {
    public final Throwable a;

    public q0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && jl40.l(this.a, ((q0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("FailedWithException(throwable="), this.a, ')');
    }
}
