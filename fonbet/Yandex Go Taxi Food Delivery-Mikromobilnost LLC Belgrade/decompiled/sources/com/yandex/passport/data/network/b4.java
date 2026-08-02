package com.yandex.passport.data.network;

import com.yandex.passport.common.account.MasterToken;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class b4 implements com.yandex.passport.data.network.core.q {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final MasterToken c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public b4(com.yandex.passport.data.models.g gVar, long j, MasterToken masterToken, String str, String str2, String str3, String str4) {
        this.a = gVar;
        this.b = j;
        this.c = masterToken;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    @Override // com.yandex.passport.data.network.core.q
    public final String a() {
        return this.c.getValue();
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final com.yandex.passport.data.models.g d() {
        return this.a;
    }

    public final long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return this.a.equals(b4Var.a) && this.b == b4Var.b && jl40.l(this.c, b4Var.c) && jl40.l(this.d, b4Var.d) && jl40.l(this.e, b4Var.e) && jl40.l(this.f, b4Var.f) && jl40.l(this.g, b4Var.g);
    }

    public final MasterToken f() {
        return this.c;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b((this.c.hashCode() + qv10.c(Integer.hashCode(this.a.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", masterToken=");
        sb.append(this.c);
        sb.append(", clientId=");
        sb.append(this.d);
        sb.append(", clientSecret=");
        sb.append(this.e);
        sb.append(", applicationPackageName=");
        sb.append(this.f);
        sb.append(", applicationVersion=");
        return b64.p(sb, this.g, ')');
    }
}
