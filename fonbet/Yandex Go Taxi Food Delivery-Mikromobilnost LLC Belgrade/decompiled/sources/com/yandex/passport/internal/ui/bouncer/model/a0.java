package com.yandex.passport.internal.ui.bouncer.model;

/* loaded from: classes2.dex */
public final class a0 implements n0 {
    public final q1 a;

    public a0(q1 q1Var) {
        this.a = q1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.a.equals(((a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetCurrentAccount(successResult=" + this.a + ')';
    }
}
