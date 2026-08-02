package com.yandex.passport.sloth;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class n implements u {
    public final boolean a;

    public n(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.a == ((n) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("BlockOnLoading(blockOnLoading="), this.a, ')');
    }
}
