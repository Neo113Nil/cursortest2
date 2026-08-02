package com.yandex.passport.api;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class f {
    public final String a;

    public /* synthetic */ f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return jl40.l(this.a, ((f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.l(')', "KPassportToken(value=", this.a);
    }
}
