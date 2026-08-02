package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.unr0;

/* loaded from: classes2.dex */
public final class g implements n0 {
    public final boolean a;

    public g(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.a == ((g) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("CheckConnection(hideCLoseButton="), this.a, ')');
    }
}
