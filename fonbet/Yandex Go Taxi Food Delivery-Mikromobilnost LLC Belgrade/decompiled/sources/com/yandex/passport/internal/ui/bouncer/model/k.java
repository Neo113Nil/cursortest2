package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.unr0;
import java.util.List;

/* loaded from: classes2.dex */
public final class k implements n0 {
    public final List a;

    public k(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.a.equals(((k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("CreateProfile(masterAccounts="), this.a, ')');
    }
}
