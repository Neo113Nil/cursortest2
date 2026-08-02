package com.yandex.passport.data.network;

import defpackage.b64;

/* loaded from: classes15.dex */
public final class ab {
    public final com.yandex.passport.data.models.g a;
    public final String b;

    public ab(com.yandex.passport.data.models.g gVar, String str) {
        this.a = gVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return this.a.equals(abVar.a) && this.b.equals(abVar.b);
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
