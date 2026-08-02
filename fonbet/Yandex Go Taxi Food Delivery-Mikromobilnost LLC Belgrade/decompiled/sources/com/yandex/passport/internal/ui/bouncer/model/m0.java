package com.yandex.passport.internal.ui.bouncer.model;

/* loaded from: classes2.dex */
public final class m0 implements n0 {
    public final a2 a;

    public m0(a2 a2Var) {
        this.a = a2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && this.a.equals(((m0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WaitConnection(waitConnection=" + this.a + ')';
    }
}
