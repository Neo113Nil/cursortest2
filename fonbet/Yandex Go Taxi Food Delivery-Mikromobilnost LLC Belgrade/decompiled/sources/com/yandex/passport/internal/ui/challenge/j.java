package com.yandex.passport.internal.ui.challenge;

import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.core.Uid;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class j extends l {
    public final Uid c;
    public final PassportTheme d;

    static {
        int i = Uid.$stable;
    }

    public j(Uid uid, PassportTheme passportTheme) {
        super(uid, passportTheme);
        this.c = uid;
        this.d = passportTheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jl40.l(this.c, jVar.c) && this.d == jVar.d;
    }

    public final int hashCode() {
        Uid uid = this.c;
        return this.d.hashCode() + ((uid == null ? 0 : uid.hashCode()) * 31);
    }

    public final String toString() {
        return "NullableChallengeUid(uid=" + this.c + ", theme=" + this.d + ')';
    }
}
