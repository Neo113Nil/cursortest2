package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class r implements n0 {
    public final LoginProperties a;

    public r(LoginProperties loginProperties) {
        this.a = loginProperties;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && jl40.l(this.a, ((r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LoadAccounts(loginProperties=" + this.a + ')';
    }
}
