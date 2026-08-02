package com.yandex.passport.data.network;

import com.yandex.passport.common.account.MasterToken;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class rb implements com.yandex.passport.data.network.core.q {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final MasterToken c;
    public final String d;
    public final String e;
    public final String f;

    public rb(long j, MasterToken masterToken, com.yandex.passport.data.models.g gVar, String str, String str2, String str3) {
        this.a = gVar;
        this.b = j;
        this.c = masterToken;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // com.yandex.passport.data.network.core.q
    public final String a() {
        return this.c.getValue();
    }

    public final com.yandex.passport.data.models.g b() {
        return this.a;
    }

    public final String c() {
        return this.e;
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
        if (!(obj instanceof rb)) {
            return false;
        }
        rb rbVar = (rb) obj;
        return this.a.equals(rbVar.a) && this.b == rbVar.b && jl40.l(this.c, rbVar.c) && jl40.l(this.d, rbVar.d) && jl40.l(this.e, rbVar.e) && this.f.equals(rbVar.f);
    }

    public final MasterToken f() {
        return this.c;
    }

    public final String g() {
        return this.d;
    }

    public final int hashCode() {
        int b = unr0.b((this.c.hashCode() + qv10.c(Integer.hashCode(this.a.a) * 31, 31, this.b)) * 31, 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", masterToken=");
        sb.append(this.c);
        sb.append(", trackId=");
        sb.append(this.d);
        sb.append(", extra=");
        sb.append(this.e);
        sb.append(", extraTag=");
        return b64.p(sb, this.f, ')');
    }
}
