package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class n0 implements o0 {
    public final Throwable a;

    public n0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && jl40.l(this.a, ((n0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("ReloginFailed(th="), this.a, ')');
    }
}
