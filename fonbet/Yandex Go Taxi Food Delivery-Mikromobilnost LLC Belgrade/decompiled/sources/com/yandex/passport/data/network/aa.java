package com.yandex.passport.data.network;

import defpackage.jl40;
import defpackage.qv10;

/* loaded from: classes15.dex */
public final class aa {
    public final String a;
    public final String b;
    public final long c;
    public final GetUserInfoRequest$Response d;

    public aa(String str, String str2, long j, GetUserInfoRequest$Response getUserInfoRequest$Response) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = getUserInfoRequest$Response;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final GetUserInfoRequest$Response c() {
        return this.d;
    }

    public final long d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return this.a.equals(aaVar.a) && jl40.l(this.b, aaVar.b) && com.yandex.passport.common.time.a.e(this.c, aaVar.c) && jl40.l(this.d, aaVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + qv10.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "ResponseWrapper(body=" + this.a + ", eTag=" + this.b + ", retrievalTime=" + ((Object) com.yandex.passport.common.time.a.f(this.c)) + ", response=" + this.d + ')';
    }
}
