package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.internal.entities.Filter;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class b0 {
    public final Filter a;

    public b0(Filter filter) {
        this.a = filter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && jl40.l(this.a, ((b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Params(filter=" + this.a + ')';
    }
}
