package com.yandex.passport.internal.upgrader;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ui.account_upgrade.UpgraderExtras;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class b {
    public final UpgraderExtras a;

    static {
        int i = Uid.$stable;
    }

    public b(UpgraderExtras upgraderExtras) {
        this.a = upgraderExtras;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && jl40.l(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Params(upgraderExtras=" + this.a + ')';
    }
}
