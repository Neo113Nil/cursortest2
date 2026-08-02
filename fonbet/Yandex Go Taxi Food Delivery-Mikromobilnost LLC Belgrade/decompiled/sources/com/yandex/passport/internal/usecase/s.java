package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;

/* loaded from: classes15.dex */
public final class s {
    public final MasterToken a;
    public final Environment b;
    public final long c;
    public final String d;
    public final String e;

    static {
        com.yandex.passport.common.account.b bVar = MasterToken.Companion;
    }

    public s(MasterToken masterToken, Environment environment, long j, String str, String str2) {
        this.a = masterToken;
        this.b = environment;
        this.c = j;
        this.d = str;
        this.e = str2;
    }

    public final String a() {
        return this.e;
    }

    public final Environment b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final long d() {
        return this.c;
    }

    public final MasterToken e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return jl40.l(this.a, sVar.a) && this.b == sVar.b && this.c == sVar.c && jl40.l(this.d, sVar.d) && jl40.l(this.e, sVar.e);
    }

    public final int hashCode() {
        int c = qv10.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(masterToken=");
        sb.append(this.a);
        sb.append(", environment=");
        sb.append(this.b);
        sb.append(", locationId=");
        sb.append(this.c);
        sb.append(", language=");
        sb.append(this.d);
        sb.append(", eTag=");
        return b64.p(sb, this.e, ')');
    }
}
