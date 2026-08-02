package com.yandex.passport.internal.usecase;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class p0 {
    public final long a;
    public final String b;
    public final String c;

    public p0(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.a == p0Var.a && jl40.l(this.b, p0Var.b) && jl40.l(this.c, p0Var.c);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(uid=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", pushId=");
        return b64.p(sb, this.c, ')');
    }
}
