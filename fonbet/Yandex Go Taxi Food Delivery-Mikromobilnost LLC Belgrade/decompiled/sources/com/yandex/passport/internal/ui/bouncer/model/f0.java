package com.yandex.passport.internal.ui.bouncer.model;

/* loaded from: classes2.dex */
public final class f0 implements n0 {
    public final z1 a;

    public f0(z1 z1Var) {
        this.a = z1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && this.a.equals(((f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowSloth(sloth=" + this.a + ')';
    }
}
