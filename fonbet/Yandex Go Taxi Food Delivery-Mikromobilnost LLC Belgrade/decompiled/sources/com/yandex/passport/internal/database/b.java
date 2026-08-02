package com.yandex.passport.internal.database;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;

    public b(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b) && jl40.l(this.c, bVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountSecurePayload(masterToken=");
        sb.append(this.a);
        sb.append(", userInfo=");
        sb.append(this.b);
        sb.append(", stash=");
        return b64.p(sb, this.c, ')');
    }
}
