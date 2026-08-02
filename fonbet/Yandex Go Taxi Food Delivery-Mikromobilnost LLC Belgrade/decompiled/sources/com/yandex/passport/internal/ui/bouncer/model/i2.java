package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class i2 implements o2 {
    public final Uid a;
    public final boolean b;
    public final PassportTheme c;

    static {
        int i = Uid.$stable;
    }

    public i2(Uid uid, boolean z, PassportTheme passportTheme) {
        this.a = uid;
        this.b = z;
        this.c = passportTheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return jl40.l(this.a, i2Var.a) && this.b == i2Var.b && this.c == i2Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "OnChallengeResult(uid=" + this.a + ", result=" + this.b + ", theme=" + this.c + ')';
    }
}
