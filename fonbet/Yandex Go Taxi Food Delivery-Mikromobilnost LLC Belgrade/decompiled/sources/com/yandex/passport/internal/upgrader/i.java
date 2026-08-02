package com.yandex.passport.internal.upgrader;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class i {
    public final Uid a;
    public final UpgradeStatusRequestSource b;

    static {
        int i = Uid.$stable;
    }

    public i(Uid uid, UpgradeStatusRequestSource upgradeStatusRequestSource) {
        this.a = uid;
        this.b = upgradeStatusRequestSource;
    }

    public final UpgradeStatusRequestSource a() {
        return this.b;
    }

    public final Uid b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return jl40.l(this.a, iVar.a) && this.b == iVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Params(uid=" + this.a + ", source=" + this.b + ')';
    }
}
