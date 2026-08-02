package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.qv10;
import defpackage.unr0;

@gsq0
/* loaded from: classes8.dex */
public final class i8 {
    public static final h8 Companion = new h8();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;

    public /* synthetic */ i8(int i, String str, String str2, String str3, String str4, String str5, long j, String str6) {
        if (95 != (i & 95)) {
            qje.Z(i, 95, g8.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        if ((i & 32) == 0) {
            this.f = 2147483647L;
        } else {
            this.f = j;
        }
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return jl40.l(this.a, i8Var.a) && jl40.l(this.b, i8Var.b) && jl40.l(this.c, i8Var.c) && jl40.l(this.d, i8Var.d) && jl40.l(this.e, i8Var.e) && this.f == i8Var.f && jl40.l(this.g, i8Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + qv10.c(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", trackId=");
        sb.append(this.c);
        sb.append(", csrfToken=");
        sb.append(this.d);
        sb.append(", userCode=");
        sb.append(this.e);
        sb.append(", expiresIn=");
        sb.append(this.f);
        sb.append(", verificationUrl=");
        return b64.p(sb, this.g, ')');
    }
}
