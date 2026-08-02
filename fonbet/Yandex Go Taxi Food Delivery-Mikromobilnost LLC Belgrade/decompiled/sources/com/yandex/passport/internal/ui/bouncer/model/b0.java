package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.common.core.Uid;

/* loaded from: classes2.dex */
public final class b0 implements n0 {
    public final t1 a;

    static {
        int i = Uid.$stable;
    }

    public b0(t1 t1Var) {
        this.a = t1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && this.a.equals(((b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowChallenge(challenge=" + this.a + ')';
    }
}
