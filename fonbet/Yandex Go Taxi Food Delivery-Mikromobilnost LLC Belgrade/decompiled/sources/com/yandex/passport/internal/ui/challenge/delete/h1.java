package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class h1 implements k1 {
    public final Throwable a;

    public h1(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && this.a.equals(((h1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("FailedWithException(throwable="), this.a, ')');
    }
}
