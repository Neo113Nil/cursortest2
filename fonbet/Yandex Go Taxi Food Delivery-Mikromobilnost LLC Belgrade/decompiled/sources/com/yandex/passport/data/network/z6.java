package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class z6 {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final boolean c;
    public final String d;

    public z6(com.yandex.passport.data.models.g gVar, String str, String str2, boolean z) {
        this.a = gVar;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final boolean a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final com.yandex.passport.data.models.g d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj;
        return this.a.equals(z6Var.a) && jl40.l(this.b, z6Var.b) && this.c == z6Var.c && jl40.l(this.d, z6Var.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a.a) * 31;
        String str = this.b;
        return this.d.hashCode() + unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", deviceName=");
        sb.append(this.b);
        sb.append(", clientBound=");
        sb.append(this.c);
        sb.append(", clientId=");
        return b64.p(sb, this.d, ')');
    }
}
