package com.yandex.passport.internal.ui.sloth.authsdk;

/* loaded from: classes2.dex */
public final class s implements t {
    public final g a;

    public s(g gVar) {
        this.a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.a.equals(((s) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetResult(result=" + this.a + ')';
    }
}
