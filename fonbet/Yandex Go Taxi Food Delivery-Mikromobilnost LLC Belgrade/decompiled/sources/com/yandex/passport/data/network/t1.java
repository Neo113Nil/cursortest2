package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;

/* loaded from: classes15.dex */
public final class t1 implements com.yandex.passport.data.network.core.q {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final String c;

    public t1(com.yandex.passport.data.models.g gVar, long j, String str) {
        this.a = gVar;
        this.b = j;
        this.c = str;
    }

    @Override // com.yandex.passport.data.network.core.q
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return this.a.equals(t1Var.a) && this.b == t1Var.b && jl40.l(this.c, t1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qv10.c(Integer.hashCode(this.a.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", masterToken=");
        return b64.p(sb, this.c, ')');
    }
}
