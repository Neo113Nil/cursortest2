package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class e {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public e(com.yandex.passport.data.models.g gVar, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.f;
    }

    public final com.yandex.passport.data.models.g d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a.equals(eVar.a) && jl40.l(this.b, eVar.b) && jl40.l(this.c, eVar.c) && jl40.l(this.d, eVar.d) && jl40.l(this.e, eVar.e) && jl40.l(this.f, eVar.f) && jl40.l(this.g, eVar.g);
    }

    public final String f() {
        return this.g;
    }

    public final String g() {
        return this.b;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.g.hashCode() + unr0.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", password=");
        sb.append(this.c);
        sb.append(", avatarUrl=");
        sb.append(this.d);
        sb.append(", captchaAnswer=");
        sb.append(this.e);
        sb.append(", clientId=");
        sb.append(this.f);
        sb.append(", passwordSource=");
        return b64.p(sb, this.g, ')');
    }
}
