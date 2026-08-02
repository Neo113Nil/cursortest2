package com.yandex.passport.internal.ui.challenge.logout;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class n {
    public final Uid a;
    public final LogoutBehaviour b;

    static {
        int i = Uid.$stable;
    }

    public n(Uid uid, LogoutBehaviour logoutBehaviour) {
        this.a = uid;
        this.b = logoutBehaviour;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return jl40.l(this.a, nVar.a) && this.b == nVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChallengeData(uid=" + this.a + ", logoutBehaviour=" + this.b + ')';
    }
}
