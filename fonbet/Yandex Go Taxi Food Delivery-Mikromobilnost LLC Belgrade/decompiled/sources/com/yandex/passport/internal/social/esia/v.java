package com.yandex.passport.internal.social.esia;

import defpackage.unr0;

/* loaded from: classes15.dex */
public final class v implements x {
    public final boolean a;

    public v(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.a == ((v) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("IsWaitingForEsiaCallback(isWaitingForEsiaCallback="), this.a, ')');
    }
}
