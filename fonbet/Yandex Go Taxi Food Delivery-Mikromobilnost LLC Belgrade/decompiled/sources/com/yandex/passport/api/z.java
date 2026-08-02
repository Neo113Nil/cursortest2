package com.yandex.passport.api;

/* loaded from: classes15.dex */
public final class z {
    public final com.yandex.passport.internal.entities.j a;

    public z(com.yandex.passport.internal.entities.j jVar) {
        this.a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.a.equals(((z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PassportAuthorizeQrResult(passportLoginResult=" + this.a + ')';
    }
}
