package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class t1 implements c2 {
    public final com.yandex.passport.internal.ui.challenge.v a;
    public final Uid b;
    public final PassportTheme c;

    static {
        int i = Uid.$stable;
    }

    public t1(com.yandex.passport.internal.ui.challenge.v vVar, Uid uid, PassportTheme passportTheme) {
        this.a = vVar;
        this.b = uid;
        this.c = passportTheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t1) {
            t1 t1Var = (t1) obj;
            if (this.a == t1Var.a && jl40.l(this.b, t1Var.b) && this.c == t1Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + uw51.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Challenge(webCase=" + this.a + ", uid=" + this.b + ", theme=" + this.c + ')';
    }
}
