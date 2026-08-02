package com.yandex.passport.data.models;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;

@gsq0
/* loaded from: classes8.dex */
public final class o {
    public static final n Companion = new n();
    public final String a;

    public /* synthetic */ o(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, m.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && jl40.l(this.a, ((o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("StatusResult(status="), this.a, ')');
    }
}
