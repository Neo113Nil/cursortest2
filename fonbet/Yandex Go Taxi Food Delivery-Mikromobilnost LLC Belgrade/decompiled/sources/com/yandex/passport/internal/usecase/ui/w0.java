package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class w0 {
    public final Uid a;
    public final MasterToken b;
    public final String c;
    public final String d;
    public final String e;

    static {
        com.yandex.passport.common.account.b bVar = MasterToken.Companion;
        int i = Uid.$stable;
    }

    public w0(Uid uid, MasterToken masterToken, String str, String str2, String str3) {
        this.a = uid;
        this.b = masterToken;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return jl40.l(this.a, w0Var.a) && jl40.l(this.b, w0Var.b) && jl40.l(this.c, w0Var.c) && jl40.l(this.d, w0Var.d) && jl40.l(this.e, w0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(uid=");
        sb.append(this.a);
        sb.append(", masterToken=");
        sb.append(this.b);
        sb.append(", trackId=");
        sb.append(this.c);
        sb.append(", firstName=");
        sb.append(this.d);
        sb.append(", lastName=");
        return b64.p(sb, this.e, ')');
    }
}
