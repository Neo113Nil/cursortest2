package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.sloth.data.SlothParams;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class z1 implements c2 {
    public final SlothParams a;
    public final com.yandex.passport.sloth.ui.b1 b;

    public z1(SlothParams slothParams, com.yandex.passport.sloth.ui.b1 b1Var) {
        this.a = slothParams;
        this.b = b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return jl40.l(this.a, z1Var.a) && jl40.l(this.b, z1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Sloth(params=" + this.a + ", interactor=" + this.b + ')';
    }
}
