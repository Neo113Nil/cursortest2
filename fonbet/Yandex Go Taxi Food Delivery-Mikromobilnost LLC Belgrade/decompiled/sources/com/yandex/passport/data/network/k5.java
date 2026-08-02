package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;

@gsq0
/* loaded from: classes8.dex */
public final class k5 {
    public static final j5 Companion = new j5();
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ k5(long j, String str, String str2, String str3, String str4, int i) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, i5.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = str;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj;
        return this.a == k5Var.a && jl40.l(this.b, k5Var.b) && jl40.l(this.c, k5Var.c) && jl40.l(this.d, k5Var.d) && jl40.l(this.e, k5Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Location(id=");
        sb.append(this.a);
        sb.append(", mobileproxy=");
        sb.append(this.b);
        sb.append(", webam=");
        sb.append(this.c);
        sb.append(", webamYandex=");
        sb.append(this.d);
        sb.append(", webamIdYandex=");
        return b64.p(sb, this.e, ')');
    }
}
