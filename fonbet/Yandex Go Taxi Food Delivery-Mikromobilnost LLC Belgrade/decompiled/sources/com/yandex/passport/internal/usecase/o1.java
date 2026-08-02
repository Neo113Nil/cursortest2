package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class o1 {
    public final Uid a;
    public final String b;
    public final String c;
    public final String d;

    static {
        int i = Uid.$stable;
    }

    public o1(Uid uid, String str, String str2, String str3) {
        this.a = uid;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final Uid d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.a.equals(o1Var.a) && jl40.l(this.b, o1Var.b) && jl40.l(this.c, o1Var.c) && this.d.equals(o1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(uid=");
        sb.append(this.a);
        sb.append(", service=");
        sb.append(this.b);
        sb.append(", brand=");
        sb.append(this.c);
        sb.append(", from=");
        return b64.p(sb, this.d, ')');
    }
}
