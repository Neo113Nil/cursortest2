package com.yandex.passport.data.network;

import com.yandex.passport.common.account.MasterToken;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;

/* loaded from: classes15.dex */
public final class u4 implements com.yandex.passport.data.network.core.q {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final MasterToken c;
    public final String d;
    public final String e;

    public u4(long j, MasterToken masterToken, com.yandex.passport.data.models.g gVar, String str, String str2) {
        this.a = gVar;
        this.b = j;
        this.c = masterToken;
        this.d = str;
        this.e = str2;
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
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return this.a.equals(u4Var.a) && this.b == u4Var.b && jl40.l(this.c, u4Var.c) && jl40.l(this.d, u4Var.d) && jl40.l(this.e, u4Var.e);
    }

    public final MasterToken f() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + qv10.c(Integer.hashCode(this.a.a) * 31, 31, this.b)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
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
        return b64.p(sb, this.e, ')');
    }
}
