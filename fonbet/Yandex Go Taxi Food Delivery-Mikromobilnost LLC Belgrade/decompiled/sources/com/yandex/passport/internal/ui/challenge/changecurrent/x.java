package com.yandex.passport.internal.ui.challenge.changecurrent;

import defpackage.unr0;

/* loaded from: classes8.dex */
public final class x implements a0 {
    public final boolean a;

    public x(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.a == ((x) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("IsChallengePassed(isChallengePassed="), this.a, ')');
    }
}
