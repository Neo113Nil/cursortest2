package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.common.core.Uid;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class n2 implements o2 {
    public final Uid a;
    public final Uid b;

    static {
        int i = Uid.$stable;
    }

    public n2(Uid uid, Uid uid2) {
        this.a = uid;
        this.b = uid2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return this.a.equals(n2Var.a) && this.b.equals(n2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectMemberAccount(accountUid=");
        sb.append(this.a);
        sb.append(", masterUid=");
        return uw51.j(sb, this.b, ')');
    }
}
