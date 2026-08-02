package com.yandex.passport.common.ui.progress;

import defpackage.oyr;

/* loaded from: classes2.dex */
public final class d implements f {
    public final int a;

    public d(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.a == ((d) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("Custom(backgroundResId="), this.a, ')');
    }
}
