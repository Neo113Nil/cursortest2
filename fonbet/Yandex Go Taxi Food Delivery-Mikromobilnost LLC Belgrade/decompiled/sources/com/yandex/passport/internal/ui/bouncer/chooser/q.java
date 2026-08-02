package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.common.core.Uid;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class q implements t {
    public final Uid a;

    static {
        int i = Uid.$stable;
    }

    public q(Uid uid) {
        this.a = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.a.equals(((q) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return uw51.j(new StringBuilder("SelectedMasterUid(value="), this.a, ')');
    }
}
