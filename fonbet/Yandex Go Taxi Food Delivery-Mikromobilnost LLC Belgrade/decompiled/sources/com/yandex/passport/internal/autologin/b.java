package com.yandex.passport.internal.autologin;

/* loaded from: classes2.dex */
public final class b extends c {
    public final com.yandex.passport.internal.entities.k c;

    public b(com.yandex.passport.internal.entities.k kVar) {
        super(kVar.a, kVar.f);
        this.c = kVar;
    }

    public final com.yandex.passport.internal.entities.k c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.c.equals(((b) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "MasterMember(memberAccount=" + this.c + ')';
    }
}
