package com.yandex.passport.internal.flags.presentation;

import defpackage.jl40;

/* loaded from: classes15.dex */
public final class k0 implements n0 {
    public final v a;

    public k0(v vVar) {
        this.a = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && jl40.l(this.a, ((k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnExperimentClicked(item=" + this.a + ')';
    }
}
