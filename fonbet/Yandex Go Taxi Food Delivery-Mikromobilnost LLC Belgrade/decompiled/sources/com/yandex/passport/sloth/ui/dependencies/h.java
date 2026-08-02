package com.yandex.passport.sloth.ui.dependencies;

import defpackage.oyr;

/* loaded from: classes2.dex */
public final class h implements i {
    public final int a;

    public h(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.a == ((h) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("Custom(backgroundResId="), this.a, ')');
    }
}
