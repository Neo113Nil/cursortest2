package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class l implements m {
    public final k1 a;

    public l(k1 k1Var) {
        this.a = k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && jl40.l(this.a, ((l) obj).a);
    }

    public final int hashCode() {
        k1 k1Var = this.a;
        if (k1Var == null) {
            return 0;
        }
        return k1Var.hashCode();
    }

    public final String toString() {
        return "SetResult(result=" + this.a + ')';
    }
}
