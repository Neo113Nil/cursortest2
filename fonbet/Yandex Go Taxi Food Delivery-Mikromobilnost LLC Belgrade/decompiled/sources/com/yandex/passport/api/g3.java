package com.yandex.passport.api;

import defpackage.unr0;

/* loaded from: classes15.dex */
public final class g3 implements j3 {
    public final Throwable a;

    public g3(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3) && this.a.equals(((g3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("FailedWithException(throwable="), this.a, ')');
    }
}
