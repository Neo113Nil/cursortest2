package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class e8 {
    public final com.yandex.passport.data.models.g a;
    public final String b;

    public e8(com.yandex.passport.data.models.g gVar, String str) {
        this.a = gVar;
        this.b = str;
    }

    public final com.yandex.passport.data.models.g a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) obj;
        return this.a.equals(e8Var.a) && jl40.l(this.b, e8Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", qrPath=");
        return b64.p(sb, this.b, ')');
    }
}
