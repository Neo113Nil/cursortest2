package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class n0 implements q0 {
    public final Throwable a;

    public n0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && this.a.equals(((n0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("FailedWithException(throwable="), this.a, ')');
    }
}
