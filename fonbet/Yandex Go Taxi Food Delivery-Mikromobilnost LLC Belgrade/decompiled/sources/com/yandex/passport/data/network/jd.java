package com.yandex.passport.data.network;

import com.yandex.passport.common.account.MasterToken;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class jd implements com.yandex.passport.data.network.core.q {
    public final MasterToken a;
    public final com.yandex.passport.data.models.g b;
    public final long c;
    public final String d;
    public final String e;

    public jd(long j, MasterToken masterToken, com.yandex.passport.data.models.g gVar, String str, String str2) {
        this.a = masterToken;
        this.b = gVar;
        this.c = j;
        this.d = str;
        this.e = str2;
    }

    @Override // com.yandex.passport.data.network.core.q
    public final String a() {
        return this.a.getValue();
    }

    public final String b() {
        return this.e;
    }

    public final com.yandex.passport.data.models.g c() {
        return this.b;
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
        if (!(obj instanceof jd)) {
            return false;
        }
        jd jdVar = (jd) obj;
        return jl40.l(this.a, jdVar.a) && this.b.equals(jdVar.b) && this.c == jdVar.c && jl40.l(this.d, jdVar.d) && jl40.l(this.e, jdVar.e);
    }

    public final String f() {
        return this.d;
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(qv10.c(oyr.b(this.b.a, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(masterToken=");
        sb.append(this.a);
        sb.append(", environment=");
        sb.append(this.b);
        sb.append(", locationId=");
        sb.append(this.c);
        sb.append(", service=");
        sb.append(this.d);
        sb.append(", brand=");
        return b64.p(sb, this.e, ')');
    }
}
