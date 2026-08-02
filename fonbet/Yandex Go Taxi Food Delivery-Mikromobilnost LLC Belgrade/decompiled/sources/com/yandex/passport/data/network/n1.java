package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class n1 implements com.yandex.passport.data.network.core.q {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public n1(com.yandex.passport.data.models.g gVar, long j, String str, String str2, String str3, String str4) {
        this.a = gVar;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    @Override // com.yandex.passport.data.network.core.q
    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.e;
    }

    public final com.yandex.passport.data.models.g c() {
        return this.a;
    }

    public final String d() {
        return this.f;
    }

    public final long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.a.equals(n1Var.a) && this.b == n1Var.b && jl40.l(this.c, n1Var.c) && jl40.l(this.d, n1Var.d) && jl40.l(this.e, n1Var.e) && this.f.equals(n1Var.f);
    }

    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.d;
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b(unr0.b(unr0.b(qv10.c(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", masterToken=");
        sb.append(this.c);
        sb.append(", userCode=");
        sb.append(this.d);
        sb.append(", clientId=");
        sb.append(this.e);
        sb.append(", language=");
        return b64.p(sb, this.f, ')');
    }
}
