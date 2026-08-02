package com.yandex.passport.internal.ui.sloth.plusdevices;

import defpackage.oyr;

/* loaded from: classes2.dex */
public final class d0 implements f0 {
    public final int a;

    public d0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && this.a == ((d0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("SetResultCode(resultCode="), this.a, ')');
    }
}
