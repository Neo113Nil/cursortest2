package com.yandex.passport.internal.ui.challenge.changecurrent;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ui.AppTheme;
import defpackage.jl40;

/* loaded from: classes8.dex */
public final class t {
    public final Uid a;
    public final AppTheme b;

    static {
        int i = Uid.$stable;
    }

    public t(Uid uid, AppTheme appTheme) {
        this.a = uid;
        this.b = appTheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return jl40.l(this.a, tVar.a) && this.b == tVar.b;
    }

    public final int hashCode() {
        Uid uid = this.a;
        return this.b.hashCode() + ((uid == null ? 0 : uid.hashCode()) * 31);
    }

    public final String toString() {
        return "Init(uid=" + this.a + ", theme=" + this.b + ')';
    }
}
