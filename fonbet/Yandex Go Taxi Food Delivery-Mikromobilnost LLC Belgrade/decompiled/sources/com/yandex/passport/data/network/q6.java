package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class q6 implements com.yandex.passport.data.network.core.q {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final String c;
    public final String d;

    public q6(com.yandex.passport.data.models.g gVar, long j, String str, String str2) {
        this.a = gVar;
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    @Override // com.yandex.passport.data.network.core.q
    public final String a() {
        return this.c;
    }

    public final com.yandex.passport.data.models.g b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final long d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6)) {
            return false;
        }
        q6 q6Var = (q6) obj;
        return this.a.equals(q6Var.a) && this.b == q6Var.b && jl40.l(this.c, q6Var.c) && jl40.l(this.d, q6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(qv10.c(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", masterToken=");
        sb.append(this.c);
        sb.append(", host=");
        return b64.p(sb, this.d, ')');
    }
}
