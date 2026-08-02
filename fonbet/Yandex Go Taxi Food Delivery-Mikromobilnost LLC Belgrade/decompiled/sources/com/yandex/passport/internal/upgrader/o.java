package com.yandex.passport.internal.upgrader;

import com.yandex.passport.api.PassportAccountUpgrader$UpdateInterval;
import com.yandex.passport.common.core.Uid;

/* loaded from: classes2.dex */
public final class o {
    public final Uid a;
    public final PassportAccountUpgrader$UpdateInterval b;

    static {
        int i = Uid.$stable;
    }

    public o(Uid uid, PassportAccountUpgrader$UpdateInterval passportAccountUpgrader$UpdateInterval) {
        this.a = uid;
        this.b = passportAccountUpgrader$UpdateInterval;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a.equals(oVar.a) && this.b == oVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subscription(uid=" + this.a + ", updateInterval=" + this.b + ')';
    }
}
