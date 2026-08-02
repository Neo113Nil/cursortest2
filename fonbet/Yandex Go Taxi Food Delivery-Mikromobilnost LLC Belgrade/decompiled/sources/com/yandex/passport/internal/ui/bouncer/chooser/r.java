package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ui.bouncer.model.q2;

/* loaded from: classes2.dex */
public final class r implements t {
    public final q2 a;

    static {
        int i = Uid.$stable;
    }

    public r(q2 q2Var) {
        this.a = q2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.a.equals(((r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetCreateProfileData(value=" + this.a + ')';
    }
}
