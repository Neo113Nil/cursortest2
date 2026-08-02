package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class f0 implements g0 {
    public final Throwable a;

    public f0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && this.a.equals(((f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("SetError(value="), this.a, ')');
    }
}
