package com.yandex.passport.internal.ui.challenge.logout;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class b0 implements d0 {
    public final boolean a;

    public b0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && this.a == ((b0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("IsChallengePassed(isChallengePassed="), this.a, ')');
    }
}
