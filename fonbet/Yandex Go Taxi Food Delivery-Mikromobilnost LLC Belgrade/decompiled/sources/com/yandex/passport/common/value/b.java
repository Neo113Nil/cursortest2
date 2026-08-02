package com.yandex.passport.common.value;

import defpackage.unr0;

/* loaded from: classes8.dex */
public final class b {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.a.equals(((b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.l(')', "Uuid(value=", this.a);
    }
}
