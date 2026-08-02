package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class w {
    public final boolean a;

    public w(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.a == ((w) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("AddNew(canCreateProfile="), this.a, ')');
    }
}
