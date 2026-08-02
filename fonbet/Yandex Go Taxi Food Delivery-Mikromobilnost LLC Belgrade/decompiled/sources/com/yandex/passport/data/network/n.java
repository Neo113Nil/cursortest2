package com.yandex.passport.data.network;

import com.yandex.passport.common.account.MasterToken;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.uw51;

/* loaded from: classes15.dex */
public final class n implements com.yandex.passport.data.network.core.q {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final MasterToken c;
    public final String d;
    public final String e;

    public n(long j, MasterToken masterToken, com.yandex.passport.data.models.g gVar, String str, String str2) {
        this.a = gVar;
        this.b = j;
        this.c = masterToken;
        this.d = str;
        this.e = str2;
    }

    @Override // com.yandex.passport.data.network.core.q
    public final String a() {
        return this.c.getValue();
    }

    public final com.yandex.passport.data.models.g b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public final MasterToken d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a.equals(nVar.a) && this.b == nVar.b && jl40.l(this.c, nVar.c) && jl40.l(this.d, nVar.d) && jl40.l(this.e, nVar.e);
    }

    public final String f() {
        return this.e;
    }

    public final int hashCode() {
        int b = unr0.b((this.c.hashCode() + qv10.c(Integer.hashCode(this.a.a) * 31, 31, this.b)) * 31, 31, this.d);
        String str = this.e;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", masterToken=");
        sb.append(this.c);
        sb.append(", returnUrl=");
        uw51.y(sb, this.d, ", yandexUidCookieValue=");
        return b64.p(sb, this.e, ')');
    }
}
