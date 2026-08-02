package com.yandex.passport.data.network;

import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class xb {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;

    public xb(com.yandex.passport.data.models.g gVar, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb)) {
            return false;
        }
        xb xbVar = (xb) obj;
        return this.a.equals(xbVar.a) && jl40.l(this.b, xbVar.b) && jl40.l(this.c, xbVar.c) && jl40.l(this.d, xbVar.d) && jl40.l(this.e, xbVar.e) && this.f.equals(xbVar.f) && jl40.l(this.g, xbVar.g) && this.h == xbVar.h;
    }

    public final int hashCode() {
        int b = unr0.b(Integer.hashCode(this.a.a) * 31, 31, this.b);
        String str = this.c;
        int b2 = unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return Boolean.hashCode(this.h) + unr0.b(unr0.b((b2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", phoneNumber=");
        sb.append(this.c);
        sb.append(", language=");
        sb.append(this.d);
        sb.append(", country=");
        sb.append(this.e);
        sb.append(", packageName=");
        sb.append(this.f);
        sb.append(", confirmMethod=");
        sb.append(this.g);
        sb.append(", authBySms=");
        return unr0.u(sb, this.h, ')');
    }
}
