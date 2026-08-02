package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.jl40;
import defpackage.unr0;
import java.util.List;

/* loaded from: classes2.dex */
public final class v0 implements a1 {
    public final List a;

    public v0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && jl40.l(this.a, ((v0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("ReportToHostErrors(errors="), this.a, ')');
    }
}
