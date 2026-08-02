package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;

@gsq0
/* loaded from: classes15.dex */
public final class g4 {
    public static final f4 Companion = new f4();
    public final String a;
    public final Long b;
    public final String c;
    public final long d;

    public /* synthetic */ g4(int i, long j, Long l, String str, String str2) {
        if (13 != (i & 13)) {
            qje.Z(i, 13, e4.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        this.c = str2;
        this.d = j;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return jl40.l(this.a, g4Var.a) && jl40.l(this.b, g4Var.b) && jl40.l(this.c, g4Var.c) && this.d == g4Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return Long.hashCode(this.d) + unr0.b((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(accessToken=");
        sb.append(this.a);
        sb.append(", expiresIn=");
        sb.append(this.b);
        sb.append(", tokenType=");
        sb.append(this.c);
        sb.append(", uid=");
        return b64.o(sb, this.d, ')');
    }
}
