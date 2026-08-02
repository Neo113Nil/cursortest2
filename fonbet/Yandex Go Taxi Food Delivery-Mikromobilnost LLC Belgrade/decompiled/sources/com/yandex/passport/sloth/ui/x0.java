package com.yandex.passport.sloth.ui;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class x0 implements z0 {
    public final boolean a;

    public x0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && this.a == ((x0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("Fail(runInNative="), this.a, ')');
    }
}
