package com.yandex.passport.data.network.token;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.qv10;

@gsq0
/* loaded from: classes15.dex */
public final class f implements com.yandex.passport.data.models.p {
    public static final e Companion = new e();
    public final String a;
    public final long b;
    public final String c;
    public final String d;

    public /* synthetic */ f(int i, long j, String str, String str2, String str3) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, d.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = (i & 2) == 0 ? 0L : j;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    @Override // com.yandex.passport.data.models.p
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return jl40.l(this.a, fVar.a) && this.b == fVar.b && jl40.l(this.c, fVar.c) && jl40.l(this.d, fVar.d);
    }

    public final int hashCode() {
        int c = qv10.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(accessToken=");
        sb.append(this.a);
        sb.append(", expiresIn=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", tokenType=");
        return b64.p(sb, this.d, ')');
    }
}
