package com.yandex.passport.data.network;

import com.yandex.passport.common.account.MasterToken;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class m7 {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final String c;
    public final String d;
    public final MasterToken e;
    public final long f;

    public m7(com.yandex.passport.data.models.g gVar, long j, String str, String str2, MasterToken masterToken, long j2) {
        this.a = gVar;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = masterToken;
        this.f = j2;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final com.yandex.passport.data.models.g c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public final MasterToken e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7)) {
            return false;
        }
        m7 m7Var = (m7) obj;
        return this.a.equals(m7Var.a) && this.b == m7Var.b && jl40.l(this.c, m7Var.c) && jl40.l(this.d, m7Var.d) && jl40.l(this.e, m7Var.e) && this.f == m7Var.f;
    }

    public final long f() {
        return this.f;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(qv10.c(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        MasterToken masterToken = this.e;
        return Long.hashCode(this.f) + ((b + (masterToken == null ? 0 : masterToken.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", clientId=");
        sb.append(this.c);
        sb.append(", clientSecret=");
        sb.append(this.d);
        sb.append(", masterToken=");
        sb.append(this.e);
        sb.append(", uid=");
        return b64.o(sb, this.f, ')');
    }
}
