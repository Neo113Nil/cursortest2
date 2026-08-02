package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class a1 {
    public final com.yandex.passport.data.models.g a;
    public final String b;

    public a1(com.yandex.passport.data.models.g gVar, String str) {
        this.a = gVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.a.equals(a1Var.a) && jl40.l(this.b, a1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        return b64.p(sb, this.b, ')');
    }
}
