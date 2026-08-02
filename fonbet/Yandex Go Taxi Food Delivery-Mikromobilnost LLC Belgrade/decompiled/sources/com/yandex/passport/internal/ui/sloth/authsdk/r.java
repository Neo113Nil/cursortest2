package com.yandex.passport.internal.ui.sloth.authsdk;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class r implements t {
    public final Throwable a;

    public r(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.a.equals(((r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("SetError(error="), this.a, ')');
    }
}
