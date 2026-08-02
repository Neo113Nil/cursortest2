package com.yandex.passport.data.network;

import com.yandex.passport.common.account.MasterToken;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class t implements com.yandex.passport.data.network.core.q {
    public final MasterToken a;
    public final String b;
    public final String c;
    public final com.yandex.passport.data.models.g d;
    public final String e;

    public t(MasterToken masterToken, String str, String str2, com.yandex.passport.data.models.g gVar, String str3) {
        this.a = masterToken;
        this.b = str;
        this.c = str2;
        this.d = gVar;
        this.e = str3;
    }

    @Override // com.yandex.passport.data.network.core.q
    public final String a() {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return jl40.l(this.a, tVar.a) && jl40.l(this.b, tVar.b) && jl40.l(this.c, tVar.c) && this.d.equals(tVar.d) && jl40.l(this.e, tVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + oyr.b(this.d.a, unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(masterToken=");
        sb.append(this.a);
        sb.append(", flowId=");
        sb.append(this.b);
        sb.append(", serviceId=");
        sb.append(this.c);
        sb.append(", environment=");
        sb.append(this.d);
        sb.append(", biometricSessionId=");
        return b64.p(sb, this.e, ')');
    }
}
