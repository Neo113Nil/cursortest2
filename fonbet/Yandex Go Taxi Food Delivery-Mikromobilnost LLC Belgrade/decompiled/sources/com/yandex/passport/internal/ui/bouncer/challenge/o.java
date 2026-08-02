package com.yandex.passport.internal.ui.bouncer.challenge;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class o {
    public final boolean a;

    public o(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.a == ((o) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("ChallengeResult(isSuccessful="), this.a, ')');
    }
}
