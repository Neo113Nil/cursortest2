package com.yandex.passport.internal.ui.sloth.plusdevices;

import defpackage.oyr;

/* loaded from: classes2.dex */
public final class y implements a0 {
    public final int a;

    public y(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.a == ((y) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("SlothResult(resultCode="), this.a, ')');
    }
}
