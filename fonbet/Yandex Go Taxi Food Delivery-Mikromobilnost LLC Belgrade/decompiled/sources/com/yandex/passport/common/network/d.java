package com.yandex.passport.common.network;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class d {
    public final String a;
    public final String b;
    public final String c;

    public d(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return jl40.l(this.a, dVar.a) && jl40.l(this.b, dVar.b) && jl40.l(this.c, dVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendErrorReportData(error=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", requestId=");
        return b64.p(sb, this.c, ')');
    }

    public /* synthetic */ d(String str, String str2) {
        this(str, null, str2);
    }
}
