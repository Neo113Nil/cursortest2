package com.yandex.passport.internal.ui.challenge;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class r implements t {
    public final boolean a;

    public r(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.a == ((r) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("Result(result="), this.a, ')');
    }
}
