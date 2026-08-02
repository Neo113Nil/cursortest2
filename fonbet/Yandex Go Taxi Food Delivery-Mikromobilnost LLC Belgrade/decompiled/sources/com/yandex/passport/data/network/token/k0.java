package com.yandex.passport.data.network.token;

import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class k0 {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final String d;

    public k0(com.yandex.passport.data.models.g gVar, String str, String str2, String str3) {
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.a.equals(k0Var.a) && jl40.l(this.b, k0Var.b) && jl40.l(this.c, k0Var.c) && jl40.l(this.d, k0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", socialTaskId=");
        sb.append(this.b);
        sb.append(", decryptedId=");
        sb.append(this.c);
        sb.append(", decryptedSecret=");
        return b64.p(sb, this.d, ')');
    }
}
