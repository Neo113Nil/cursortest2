package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class z implements d0 {
    public final Throwable a;

    public z(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.a.equals(((z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("ReloginFailed(th="), this.a, ')');
    }
}
