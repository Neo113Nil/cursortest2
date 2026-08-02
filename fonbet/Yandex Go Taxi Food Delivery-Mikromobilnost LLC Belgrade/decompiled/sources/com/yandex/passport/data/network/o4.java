package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class o4 {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public o4(com.yandex.passport.data.models.g gVar, String str, String str2, String str3, String str4) {
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final com.yandex.passport.data.models.g e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj;
        return this.a.equals(o4Var.a) && this.b.equals(o4Var.b) && jl40.l(this.c, o4Var.c) && jl40.l(this.d, o4Var.d) && jl40.l(this.e, o4Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", cookies=");
        sb.append(this.b);
        sb.append(", cookieHost=");
        sb.append(this.c);
        sb.append(", clientId=");
        sb.append(this.d);
        sb.append(", clientSecret=");
        return b64.p(sb, this.e, ')');
    }
}
