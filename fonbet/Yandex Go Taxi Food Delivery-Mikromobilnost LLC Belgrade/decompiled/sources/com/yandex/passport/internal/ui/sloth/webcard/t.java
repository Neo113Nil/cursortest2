package com.yandex.passport.internal.ui.sloth.webcard;

/* loaded from: classes2.dex */
public final class t implements u {
    public final q0 a;

    public t(q0 q0Var) {
        this.a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.a.equals(((t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetWebCardResult(webCardResult=" + this.a + ')';
    }
}
