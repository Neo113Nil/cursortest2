package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class q2 {
    public final Uid a;

    static {
        int i = Uid.$stable;
    }

    public q2(Uid uid) {
        this.a = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2) && jl40.l(this.a, ((q2) obj).a);
    }

    public final int hashCode() {
        Uid uid = this.a;
        if (uid == null) {
            return 0;
        }
        return uid.hashCode();
    }

    public final String toString() {
        return uw51.j(new StringBuilder("CreateProfileData(uidForProfile="), this.a, ')');
    }

    public q2() {
        this(null);
    }
}
