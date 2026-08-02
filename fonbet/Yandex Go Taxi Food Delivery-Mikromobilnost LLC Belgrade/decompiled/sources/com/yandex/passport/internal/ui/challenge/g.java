package com.yandex.passport.internal.ui.challenge;

/* loaded from: classes2.dex */
public final class g implements h {
    public final v a;

    public g(v vVar) {
        this.a = vVar;
    }

    public final v a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.a == ((g) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WebChallenge(webCase=" + this.a + ')';
    }
}
