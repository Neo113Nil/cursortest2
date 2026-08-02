package com.yandex.passport.data.models;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class e {
    public final String a;
    public final String b;

    public e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return jl40.l(this.a, eVar.a) && jl40.l(this.b, eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientTokenData(value=");
        sb.append(this.a);
        sb.append(", decryptedClientId=");
        return b64.p(sb, this.b, ')');
    }
}
