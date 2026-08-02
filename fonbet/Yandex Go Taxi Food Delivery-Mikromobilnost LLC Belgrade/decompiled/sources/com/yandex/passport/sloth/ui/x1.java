package com.yandex.passport.sloth.ui;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class x1 implements y1 {
    public final z0 a;

    public x1(z0 z0Var) {
        this.a = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1) && jl40.l(this.a, ((x1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UiEvent(event=" + this.a + ')';
    }
}
