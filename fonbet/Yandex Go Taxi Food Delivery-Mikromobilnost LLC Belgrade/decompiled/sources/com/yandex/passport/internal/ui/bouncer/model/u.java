package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.jl40;

/* loaded from: classes15.dex */
public final class u implements n0 {
    public final a1 a;

    public u(a1 a1Var) {
        this.a = a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && jl40.l(this.a, ((u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ProcessEvent(event=" + this.a + ')';
    }
}
