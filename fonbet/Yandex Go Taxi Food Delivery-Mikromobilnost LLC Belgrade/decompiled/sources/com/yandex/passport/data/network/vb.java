package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;

@gsq0
/* loaded from: classes8.dex */
public final class vb {
    public static final ub Companion = new ub();
    public final String a;

    public /* synthetic */ vb(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, tb.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vb) && jl40.l(this.a, ((vb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Result(status="), this.a, ')');
    }
}
