package com.yandex.passport.data.network;

import com.yandex.passport.common.account.MasterToken;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;

/* loaded from: classes15.dex */
public final class v9 implements com.yandex.passport.data.network.core.q {
    public final MasterToken a;
    public final com.yandex.passport.data.models.g b;
    public final long c;
    public final String d;
    public final String e;

    public v9(long j, MasterToken masterToken, com.yandex.passport.data.models.g gVar, String str, String str2) {
        this.a = masterToken;
        this.b = gVar;
        this.c = j;
        this.d = str;
        this.e = str2;
    }

    @Override // com.yandex.passport.data.network.core.q
    public final String a() {
        return this.a.getValue();
    }

    public final String b() {
        return this.e;
    }

    public final com.yandex.passport.data.models.g c() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9)) {
            return false;
        }
        v9 v9Var = (v9) obj;
        return jl40.l(this.a, v9Var.a) && this.b.equals(v9Var.b) && this.c == v9Var.c && jl40.l(this.d, v9Var.d) && jl40.l(this.e, v9Var.e);
    }

    public final MasterToken f() {
        return this.a;
    }

    public final int hashCode() {
        int c = qv10.c(oyr.b(this.b.a, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(masterToken=");
        sb.append(this.a);
        sb.append(", environment=");
        sb.append(this.b);
        sb.append(", locationId=");
        sb.append(this.c);
        sb.append(", language=");
        sb.append(this.d);
        sb.append(", eTag=");
        return b64.p(sb, this.e, ')');
    }
}
