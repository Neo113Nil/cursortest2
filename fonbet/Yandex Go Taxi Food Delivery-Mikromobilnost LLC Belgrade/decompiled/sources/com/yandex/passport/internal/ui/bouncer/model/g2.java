package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.unr0;
import java.util.List;

/* loaded from: classes2.dex */
public final class g2 implements o2 {
    public final List a;

    public g2(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2) && this.a.equals(((g2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("CreateNewProfile(masters="), this.a, ')');
    }
}
