package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class y5 {
    public final com.yandex.passport.data.models.g a;

    public y5(com.yandex.passport.data.models.g gVar) {
        this.a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y5) && this.a.equals(((y5) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.a);
    }

    public final String toString() {
        return "Params(environment=" + this.a + ')';
    }
}
