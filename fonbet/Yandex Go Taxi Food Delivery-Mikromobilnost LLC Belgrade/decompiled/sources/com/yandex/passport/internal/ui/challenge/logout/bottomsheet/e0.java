package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

/* loaded from: classes2.dex */
public final class e0 implements g0 {
    public final o0 a;

    public e0(o0 o0Var) {
        this.a = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && this.a.equals(((e0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetBottomSheetParameters(value=" + this.a + ')';
    }
}
