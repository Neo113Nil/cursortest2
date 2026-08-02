package com.yandex.passport.internal.ui.challenge.vpn;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class j implements m {
    public final boolean a;

    public j(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.a == ((j) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("SetOpenSettings(value="), this.a, ')');
    }
}
