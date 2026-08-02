package com.yandex.passport.data.network;

import com.yandex.passport.common.account.MasterToken;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;

/* loaded from: classes15.dex */
public final class y7 implements com.yandex.passport.data.network.core.q {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final MasterToken c;
    public final String d;

    public y7(long j, MasterToken masterToken, com.yandex.passport.data.models.g gVar, String str) {
        this.a = gVar;
        this.b = j;
        this.c = masterToken;
        this.d = str;
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
        if (!(obj instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj;
        return this.a.equals(y7Var.a) && this.b == y7Var.b && jl40.l(this.c, y7Var.c) && jl40.l(this.d, y7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + qv10.c(Integer.hashCode(this.a.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", masterToken=");
        sb.append(this.c);
        sb.append(", trackId=");
        return b64.p(sb, this.d, ')');
    }
}
