package com.yandex.passport.internal.ui.bouncer.model;

import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class d1 {
    public final Uid a;
    public final String b;

    static {
        int i = Uid.$stable;
    }

    public d1(Uid uid, String str) {
        this.a = uid;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.a.equals(d1Var.a) && jl40.l(this.b, d1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BouncerMasterAccount(uid=");
        sb.append(this.a);
        sb.append(", phoneNumber=");
        return b64.p(sb, this.b, ')');
    }
}
