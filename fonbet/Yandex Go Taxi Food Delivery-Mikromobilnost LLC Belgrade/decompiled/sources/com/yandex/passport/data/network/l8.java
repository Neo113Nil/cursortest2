package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class l8 {
    public final com.yandex.passport.data.models.g a;

    public l8(com.yandex.passport.data.models.g gVar) {
        this.a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l8) && this.a.equals(((l8) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.a);
    }

    public final String toString() {
        return "Params(environment=" + this.a + ')';
    }
}
