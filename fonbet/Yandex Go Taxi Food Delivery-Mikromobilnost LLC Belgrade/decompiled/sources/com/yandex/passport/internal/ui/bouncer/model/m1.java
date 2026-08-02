package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class m1 implements r1 {
    public final Throwable a;

    public m1(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1) && this.a.equals(((m1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("Exception(throwable="), this.a, ')');
    }
}
