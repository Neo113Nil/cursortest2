package com.yandex.passport.internal.flags.presentation;

import defpackage.jl40;

/* loaded from: classes15.dex */
public final class e0 implements n0 {
    public final c0 a;

    public e0(c0 c0Var) {
        this.a = c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && jl40.l(this.a, ((e0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CommandExecuted(command=" + this.a + ')';
    }
}
