package com.yandex.passport.data.network.token;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;

@gsq0
/* loaded from: classes15.dex */
public final class d0 implements com.yandex.passport.data.models.p {
    public static final c0 Companion = new c0();
    public final String a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ d0(int i, Long l, String str, String str2, String str3, String str4) {
        if (13 != (i & 13)) {
            qje.Z(i, 13, b0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        this.c = str2;
        this.d = str3;
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
    }

    @Override // com.yandex.passport.data.models.p
    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return jl40.l(this.a, d0Var.a) && jl40.l(this.b, d0Var.b) && jl40.l(this.c, d0Var.c) && jl40.l(this.d, d0Var.d) && jl40.l(this.e, d0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return this.e.hashCode() + unr0.b(unr0.b((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(accessToken=");
        sb.append(this.a);
        sb.append(", expiresIn=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", tokenType=");
        sb.append(this.d);
        sb.append(", scope=");
        return b64.p(sb, this.e, ')');
    }
}
