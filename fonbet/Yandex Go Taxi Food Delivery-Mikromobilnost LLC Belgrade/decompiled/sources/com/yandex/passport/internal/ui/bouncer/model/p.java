package com.yandex.passport.internal.ui.bouncer.model;

/* loaded from: classes2.dex */
public final class p implements n0 {
    public final w1 a;

    public p(w1 w1Var) {
        this.a = w1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.a.equals(((p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Fallback(fallback=" + this.a + ')';
    }
}
