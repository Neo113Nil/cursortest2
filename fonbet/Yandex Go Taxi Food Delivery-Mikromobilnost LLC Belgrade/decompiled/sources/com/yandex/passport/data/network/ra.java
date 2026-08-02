package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class ra implements com.yandex.passport.data.network.core.q {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ra(com.yandex.passport.data.models.g gVar, String str, String str2, String str3, String str4) {
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // com.yandex.passport.data.network.core.q
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        return this.a.equals(raVar.a) && jl40.l(this.b, raVar.b) && jl40.l(this.c, raVar.c) && jl40.l(this.d, raVar.d) && jl40.l(this.e, raVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", masterToken=");
        sb.append(this.b);
        sb.append(", trackId=");
        sb.append(this.c);
        sb.append(", firstName=");
        sb.append(this.d);
        sb.append(", lastName=");
        return b64.p(sb, this.e, ')');
    }
}
