package com.yandex.passport.sloth.ui;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class u0 {
    public final b1 a;

    public u0(b1 b1Var) {
        this.a = b1Var;
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
        return "SlothUiData(interactor=" + this.a + ')';
    }
}
