package com.yandex.passport.internal.ui.challenge;

/* loaded from: classes2.dex */
public final class s implements t {
    public final v a;

    public s(v vVar) {
        this.a = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.a == ((s) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Web(data=" + this.a + ')';
    }
}
