package com.yandex.passport.internal.storage;

import com.yandex.passport.common.core.Uid;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;

@gsq0
/* loaded from: classes15.dex */
public final class l {
    public static final k Companion = new k();
    public final Uid a;
    public final long b;

    static {
        int i = Uid.$stable;
    }

    public /* synthetic */ l(int i, Uid uid, long j) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, j.a.getDescriptor());
            throw null;
        }
        this.a = uid;
        this.b = j;
    }

    public final long a() {
        return this.b;
    }

    public final Uid b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        return jl40.l(this.a, ((l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public l(Uid uid, long j) {
        this.a = uid;
        this.b = j;
    }
}
