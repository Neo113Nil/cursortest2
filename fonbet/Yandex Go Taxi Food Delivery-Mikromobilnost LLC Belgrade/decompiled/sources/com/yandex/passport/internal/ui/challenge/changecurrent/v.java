package com.yandex.passport.internal.ui.challenge.changecurrent;

import com.yandex.passport.common.core.Uid;

/* loaded from: classes2.dex */
public final class v implements a0 {
    public final o a;

    static {
        int i = Uid.$stable;
    }

    public v(o oVar) {
        this.a = oVar;
    }

    public final o a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.a.equals(((v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChallengeData(challengeData=" + this.a + ')';
    }
}
