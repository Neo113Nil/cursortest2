package com.yandex.passport.common.ui;

import defpackage.oyr;

/* loaded from: classes15.dex */
public final class a {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a == ((a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.e(')', this.a, "Colour(value=");
    }
}
