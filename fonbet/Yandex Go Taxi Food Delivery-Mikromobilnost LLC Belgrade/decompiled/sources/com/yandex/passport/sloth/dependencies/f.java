package com.yandex.passport.sloth.dependencies;

import defpackage.unr0;
import java.util.List;

/* loaded from: classes2.dex */
public final class f {
    public final List a;

    public f(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.a.equals(((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("SlothPerformConfiguration(binders="), this.a, ')');
    }
}
