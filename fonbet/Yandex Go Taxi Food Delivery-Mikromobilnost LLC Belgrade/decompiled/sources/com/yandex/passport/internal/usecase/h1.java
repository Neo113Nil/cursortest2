package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes15.dex */
public final class h1 {
    public final int a;
    public final Uid b;
    public final String c;

    static {
        int i = Uid.$stable;
    }

    public h1(int i, Uid uid, String str) {
        this.a = i;
        this.b = uid;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.a == h1Var.a && jl40.l(this.b, h1Var.b) && jl40.l(this.c, h1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uw51.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(selectedPicture=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", trackId=");
        return b64.p(sb, this.c, ')');
    }
}
