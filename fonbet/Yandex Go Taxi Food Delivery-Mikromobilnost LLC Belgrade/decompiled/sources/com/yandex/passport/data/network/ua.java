package com.yandex.passport.data.network;

import com.yandex.passport.common.account.MasterToken;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class ua implements com.yandex.passport.data.network.core.q {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final MasterToken c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public ua(com.yandex.passport.data.models.g gVar, long j, MasterToken masterToken, String str, String str2, boolean z, boolean z2) {
        this.a = gVar;
        this.b = j;
        this.c = masterToken;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = z2;
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
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua)) {
            return false;
        }
        ua uaVar = (ua) obj;
        return this.a.equals(uaVar.a) && this.b == uaVar.b && jl40.l(this.c, uaVar.c) && jl40.l(this.d, uaVar.d) && jl40.l(this.e, uaVar.e) && this.f == uaVar.f && this.g == uaVar.g;
    }

    public final String f() {
        return this.d;
    }

    public final boolean g() {
        return this.f;
    }

    public final boolean h() {
        return this.g;
    }

    public final int hashCode() {
        int b = unr0.b((this.c.hashCode() + qv10.c(Integer.hashCode(this.a.a) * 31, 31, this.b)) * 31, 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.g) + unr0.e((((b + (str == null ? 0 : str.hashCode())) * 31) + 1618716602) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", masterToken=");
        sb.append(this.c);
        sb.append(", pushToken=");
        sb.append(this.d);
        sb.append(", pushPlatform=");
        sb.append(this.e);
        sb.append(", sdkVersion=7.55.1, pushesEnabledOnDevice=");
        sb.append(this.f);
        sb.append(", userIdLoggedIn=");
        return unr0.u(sb, this.g, ')');
    }
}
