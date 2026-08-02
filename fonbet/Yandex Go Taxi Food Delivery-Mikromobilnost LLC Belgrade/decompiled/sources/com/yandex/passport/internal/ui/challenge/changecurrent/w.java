package com.yandex.passport.internal.ui.challenge.changecurrent;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class w implements a0 {
    public final Throwable a;

    public w(Throwable th) {
        this.a = th;
    }

    public final Throwable a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.a.equals(((w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("Error(throwable="), this.a, ')');
    }
}
