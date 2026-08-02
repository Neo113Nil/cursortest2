package com.yandex.passport.data.network;

/* loaded from: classes8.dex */
public final class v2 {
    public final com.yandex.passport.data.models.g a;

    public v2(com.yandex.passport.data.models.g gVar) {
        this.a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2) && this.a.equals(((v2) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.a);
    }

    public final String toString() {
        return "Params(environment=" + this.a + ')';
    }
}
