package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class x0 {
    public final Uid a;
    public final String b;
    public final String c;
    public final String d;

    static {
        int i = Uid.$stable;
    }

    public x0(Uid uid, String str, String str2, String str3) {
        this.a = uid;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return jl40.l(this.a, x0Var.a) && jl40.l(this.b, x0Var.b) && jl40.l(this.c, x0Var.c) && this.d.equals(x0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(uid=");
        sb.append(this.a);
        sb.append(", biometricSessionId=");
        sb.append(this.b);
        sb.append(", trackId=");
        sb.append(this.c);
        sb.append(", installId=");
        return b64.p(sb, this.d, ')');
    }
}
