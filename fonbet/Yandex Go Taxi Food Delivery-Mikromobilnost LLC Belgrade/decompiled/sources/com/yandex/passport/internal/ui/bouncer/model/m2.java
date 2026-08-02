package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class m2 implements o2 {
    public final Uid a;
    public final LoginProperties b;

    public m2(Uid uid, LoginProperties loginProperties) {
        this.a = uid;
        this.b = loginProperties;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return this.a.equals(m2Var.a) && jl40.l(this.b, m2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectAccountByUid(accountUid=" + this.a + ", loginProperties=" + this.b + ')';
    }
}
