package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class u0 implements w0 {
    public final com.yandex.passport.api.r0 a;

    public u0(com.yandex.passport.api.r0 r0Var) {
        this.a = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && jl40.l(this.a, ((u0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Result(result=" + this.a + ')';
    }
}
