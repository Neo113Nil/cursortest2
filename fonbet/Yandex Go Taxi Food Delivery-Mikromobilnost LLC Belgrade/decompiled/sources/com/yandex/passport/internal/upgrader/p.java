package com.yandex.passport.internal.upgrader;

import com.yandex.passport.api.PassportAccountUpgradeStatus;
import com.yandex.passport.common.core.Uid;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class p {
    public final Uid a;
    public final PassportAccountUpgradeStatus b;

    public p(Uid uid, PassportAccountUpgradeStatus passportAccountUpgradeStatus) {
        this.a = uid;
        this.b = passportAccountUpgradeStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return jl40.l(this.a, pVar.a) && this.b == pVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateData(uid=" + this.a + ", status=" + this.b + ')';
    }
}
