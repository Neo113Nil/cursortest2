package com.yandex.passport.internal.flags.presentation;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class w implements y0 {
    public final String a;

    public w(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && jl40.l(this.a, ((w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("ExperimentTitleItem(title="), this.a, ')');
    }
}
