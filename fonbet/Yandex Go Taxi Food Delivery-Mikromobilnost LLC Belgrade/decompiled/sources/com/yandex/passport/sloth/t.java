package com.yandex.passport.sloth;

/* loaded from: classes2.dex */
public final class t implements u {
    public final com.yandex.passport.internal.sloth.performers.usermenu.c a;

    public t(com.yandex.passport.internal.sloth.performers.usermenu.c cVar) {
        this.a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.a == ((t) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowPhoneNumber(callback=" + this.a + ')';
    }
}
