package com.yandex.passport.internal.ui.challenge.logout;

import com.yandex.passport.common.core.Uid;

/* loaded from: classes2.dex */
public final class z implements d0 {
    public final n a;

    static {
        int i = Uid.$stable;
    }

    public z(n nVar) {
        this.a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.a.equals(((z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChallengeData(challengeData=" + this.a + ')';
    }
}
