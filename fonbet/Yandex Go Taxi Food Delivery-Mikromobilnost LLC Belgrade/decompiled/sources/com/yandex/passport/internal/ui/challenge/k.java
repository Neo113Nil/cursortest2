package com.yandex.passport.internal.ui.challenge;

import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.core.Uid;

/* loaded from: classes2.dex */
public final class k extends l {
    public final Uid c;
    public final PassportTheme d;

    static {
        int i = Uid.$stable;
    }

    public k(Uid uid, PassportTheme passportTheme) {
        super(uid, passportTheme);
        this.c = uid;
        this.d = passportTheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.c.equals(kVar.c) && this.d == kVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "RequiredChallengeUid(uid=" + this.c + ", theme=" + this.d + ')';
    }
}
