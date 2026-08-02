package com.yandex.passport.data.network;

import com.yandex.passport.common.account.MasterToken;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;

/* loaded from: classes15.dex */
public final class t3 implements com.yandex.passport.data.network.core.q {
    public final MasterToken a;
    public final com.yandex.passport.data.models.g b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;

    public t3(long j, MasterToken masterToken, com.yandex.passport.data.models.g gVar, String str, String str2, String str3) {
        this.a = masterToken;
        this.b = gVar;
        this.c = j;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // com.yandex.passport.data.network.core.q
    public final String a() {
        return this.a.getValue();
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final com.yandex.passport.data.models.g e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj;
        return jl40.l(this.a, t3Var.a) && this.b.equals(t3Var.b) && this.c == t3Var.c && jl40.l(this.d, t3Var.d) && jl40.l(this.e, t3Var.e) && jl40.l(this.f, t3Var.f);
    }

    public final long f() {
        return this.c;
    }

    public final MasterToken g() {
        return this.a;
    }

    public final int hashCode() {
        int c = qv10.c(oyr.b(this.b.a, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(masterToken=");
        sb.append(this.a);
        sb.append(", environment=");
        sb.append(this.b);
        sb.append(", locationId=");
        sb.append(this.c);
        sb.append(", decryptedId=");
        sb.append(this.d);
        sb.append(", decryptedSecret=");
        sb.append(this.e);
        sb.append(", childUidString=");
        return b64.p(sb, this.f, ')');
    }
}
