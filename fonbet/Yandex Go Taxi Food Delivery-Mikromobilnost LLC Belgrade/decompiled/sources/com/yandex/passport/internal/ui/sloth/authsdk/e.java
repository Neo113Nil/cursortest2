package com.yandex.passport.internal.ui.sloth.authsdk;

import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class e implements g {
    public final Uid a;

    static {
        int i = Uid.$stable;
    }

    public e(Uid uid) {
        this.a = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && jl40.l(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return uw51.j(new StringBuilder("Relogin(selectedUid="), this.a, ')');
    }
}
