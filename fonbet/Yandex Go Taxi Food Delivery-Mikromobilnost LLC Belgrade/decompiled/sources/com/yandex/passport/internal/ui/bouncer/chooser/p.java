package com.yandex.passport.internal.ui.bouncer.chooser;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class p implements t {
    public final Throwable a;

    public p(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.a.equals(((p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("Error(value="), this.a, ')');
    }
}
