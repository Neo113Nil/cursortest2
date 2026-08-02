package com.yandex.passport.data.network;

import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class hb implements com.yandex.passport.data.network.core.q {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;

    public hb(com.yandex.passport.data.models.g gVar, String str, String str2, String str3, Long l) {
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = l;
    }

    @Override // com.yandex.passport.data.network.core.q
    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final com.yandex.passport.data.models.g d() {
        return this.a;
    }

    public final Long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return this.a.equals(hbVar.a) && jl40.l(this.b, hbVar.b) && jl40.l(this.c, hbVar.c) && jl40.l(this.d, hbVar.d) && jl40.l(this.e, hbVar.e);
    }

    public final String f() {
        return this.d;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        Long l = this.e;
        return b + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", clientId=");
        sb.append(this.b);
        sb.append(", clientSecret=");
        sb.append(this.c);
        sb.append(", masterTokenValue=");
        sb.append(this.d);
        sb.append(", locationId=");
        return qv10.q(sb, this.e, ')');
    }
}
