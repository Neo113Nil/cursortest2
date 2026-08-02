package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class z implements n0 {
    public final Uid a;
    public final LoginProperties b;

    public z(Uid uid, LoginProperties loginProperties) {
        this.a = uid;
        this.b = loginProperties;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.a.equals(zVar.a) && jl40.l(this.b, zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectAccountByUid(uid=" + this.a + ", loginProperties=" + this.b + ')';
    }
}
