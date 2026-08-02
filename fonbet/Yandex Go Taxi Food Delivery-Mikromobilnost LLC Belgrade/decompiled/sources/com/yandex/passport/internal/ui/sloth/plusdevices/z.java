package com.yandex.passport.internal.ui.sloth.plusdevices;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class z implements a0 {
    public final boolean a;

    public z(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.a == ((z) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("TryAddPlusDevice(isFirstRequest="), this.a, ')');
    }
}
