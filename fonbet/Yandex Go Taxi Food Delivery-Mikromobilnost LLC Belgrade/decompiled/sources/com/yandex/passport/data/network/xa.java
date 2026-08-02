package com.yandex.passport.data.network;

import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class xa {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final Long d;

    public xa(com.yandex.passport.data.models.g gVar, String str, String str2, Long l) {
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = l;
    }

    public final com.yandex.passport.data.models.g a() {
        return this.a;
    }

    public final Long b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa)) {
            return false;
        }
        xa xaVar = (xa) obj;
        return this.a.equals(xaVar.a) && jl40.l(this.b, xaVar.b) && jl40.l(this.c, xaVar.c) && jl40.l(this.d, xaVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(Integer.hashCode(this.a.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.d;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", uidString=");
        sb.append(this.b);
        sb.append(", pushPlatform=");
        sb.append(this.c);
        sb.append(", locationId=");
        return qv10.q(sb, this.d, ')');
    }
}
