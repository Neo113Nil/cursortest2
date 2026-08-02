package com.yandex.passport.user_id.models;

import com.yandex.passport.api.t2;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class j implements k {
    public final t2 a;

    public j(t2 t2Var) {
        this.a = t2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && jl40.l(this.a, ((j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ProcessPassportAction(action=" + this.a + ')';
    }
}
