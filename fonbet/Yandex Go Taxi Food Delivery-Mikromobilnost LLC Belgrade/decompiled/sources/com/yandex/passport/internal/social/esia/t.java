package com.yandex.passport.internal.social.esia;

import defpackage.unr0;

/* loaded from: classes15.dex */
public final class t implements x {
    public final Throwable a;

    public t(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.a.equals(((t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("Error(throwable="), this.a, ')');
    }
}
