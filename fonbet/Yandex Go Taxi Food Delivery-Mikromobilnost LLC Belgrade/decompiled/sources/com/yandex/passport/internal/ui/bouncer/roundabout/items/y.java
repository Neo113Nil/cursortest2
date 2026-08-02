package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import defpackage.unr0;
import java.util.List;

/* loaded from: classes2.dex */
public final class y {
    public final List a;

    public y(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.a.equals(((y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("CreateProfile(masters="), this.a, ')');
    }
}
