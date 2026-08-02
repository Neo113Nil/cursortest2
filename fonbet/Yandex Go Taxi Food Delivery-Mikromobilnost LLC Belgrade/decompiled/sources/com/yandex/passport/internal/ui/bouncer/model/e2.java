package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class e2 implements o2 {
    public final q2 a;

    static {
        int i = Uid.$stable;
    }

    public e2(q2 q2Var) {
        this.a = q2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2) && jl40.l(this.a, ((e2) obj).a);
    }

    public final int hashCode() {
        q2 q2Var = this.a;
        if (q2Var == null) {
            return 0;
        }
        return q2Var.hashCode();
    }

    public final String toString() {
        return "AddNewAccount(createProfileData=" + this.a + ')';
    }

    public e2() {
        this(null);
    }
}
