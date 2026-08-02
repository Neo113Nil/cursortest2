package com.yandex.passport.data.network.token;

import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class m {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;

    public m(com.yandex.passport.data.models.g gVar, String str, String str2, String str3, long j, String str4, String str5) {
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = str4;
        this.g = str5;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final com.yandex.passport.data.models.g e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a.equals(mVar.a) && jl40.l(this.b, mVar.b) && this.c.equals(mVar.c) && jl40.l(this.d, mVar.d) && this.e == mVar.e && jl40.l(this.f, mVar.f) && jl40.l(this.g, mVar.g);
    }

    public final long f() {
        return this.e;
    }

    public final String g() {
        return this.d;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.g.hashCode() + unr0.b(qv10.c((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", cookieHost=");
        sb.append(this.b);
        sb.append(", cookies=");
        sb.append(this.c);
        sb.append(", trackId=");
        sb.append(this.d);
        sb.append(", locationId=");
        sb.append(this.e);
        sb.append(", clientId=");
        sb.append(this.f);
        sb.append(", clientSecret=");
        return b64.p(sb, this.g, ')');
    }
}
