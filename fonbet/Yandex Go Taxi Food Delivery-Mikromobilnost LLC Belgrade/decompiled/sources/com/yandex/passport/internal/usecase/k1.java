package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class k1 {
    public final Uid a;
    public final String b;
    public final String c;
    public final String d;

    static {
        int i = Uid.$stable;
    }

    public k1(Uid uid, String str, String str2, String str3) {
        this.a = uid;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return jl40.l(this.a, k1Var.a) && jl40.l(this.b, k1Var.b) && this.c.equals(k1Var.c) && jl40.l(this.d, k1Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(uid=");
        sb.append(this.a);
        sb.append(", biometricSessionId=");
        sb.append(this.b);
        sb.append(", trackId=");
        sb.append(this.c);
        sb.append(", flowId=");
        return b64.p(sb, this.d, ')');
    }
}
