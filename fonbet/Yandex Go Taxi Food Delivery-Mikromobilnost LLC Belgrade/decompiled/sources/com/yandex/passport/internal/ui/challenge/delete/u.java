package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class u {
    public final r a;
    public final k1 b;

    public u(r rVar, k1 k1Var) {
        this.a = rVar;
        this.b = k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return jl40.l(this.a, uVar.a) && jl40.l(this.b, uVar.b);
    }

    public final int hashCode() {
        r rVar = this.a;
        int hashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
        k1 k1Var = this.b;
        return hashCode + (k1Var != null ? k1Var.hashCode() : 0);
    }

    public final String toString() {
        return "State(deleteMode=" + this.a + ", result=" + this.b + ')';
    }

    public u() {
        this(null, null);
    }
}
