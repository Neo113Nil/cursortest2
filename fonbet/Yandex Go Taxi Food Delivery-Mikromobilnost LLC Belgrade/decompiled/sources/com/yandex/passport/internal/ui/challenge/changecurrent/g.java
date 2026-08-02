package com.yandex.passport.internal.ui.challenge.changecurrent;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ui.AppTheme;
import defpackage.jl40;

/* loaded from: classes8.dex */
public final class g {
    public final Uid a;
    public final com.yandex.passport.common.ui.progress.g b;
    public final AppTheme c;

    static {
        com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
        int i = Uid.$stable;
    }

    public g(Uid uid, com.yandex.passport.common.ui.progress.g gVar, AppTheme appTheme) {
        this.a = uid;
        this.b = gVar;
        this.c = appTheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return jl40.l(this.a, gVar.a) && this.b.equals(gVar.b) && this.c == gVar.c;
    }

    public final int hashCode() {
        Uid uid = this.a;
        int hashCode = uid == null ? 0 : uid.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "SetCurrentAccountProperties(uid=" + this.a + ", progressProperties=" + this.b + ", theme=" + this.c + ')';
    }
}
