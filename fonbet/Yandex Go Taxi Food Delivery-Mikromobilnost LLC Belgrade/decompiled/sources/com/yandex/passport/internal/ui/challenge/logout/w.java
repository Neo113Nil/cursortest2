package com.yandex.passport.internal.ui.challenge.logout;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ui.AppTheme;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class w {
    public final Uid a;
    public final AppTheme b;
    public final LogoutBehaviour c;

    static {
        int i = Uid.$stable;
    }

    public w(Uid uid, AppTheme appTheme, LogoutBehaviour logoutBehaviour) {
        this.a = uid;
        this.b = appTheme;
        this.c = logoutBehaviour;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return jl40.l(this.a, wVar.a) && this.b == wVar.b && this.c == wVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Init(uid=" + this.a + ", theme=" + this.b + ", logoutBehaviour=" + this.c + ')';
    }
}
