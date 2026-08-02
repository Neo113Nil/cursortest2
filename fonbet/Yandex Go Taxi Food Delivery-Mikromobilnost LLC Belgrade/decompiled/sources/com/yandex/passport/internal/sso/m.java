package com.yandex.passport.internal.sso;

import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes15.dex */
public final class m {
    public final List a;

    public m(List list) {
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && jl40.l(this.a, ((m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("SsoGroup(applications="), this.a, ')');
    }
}
