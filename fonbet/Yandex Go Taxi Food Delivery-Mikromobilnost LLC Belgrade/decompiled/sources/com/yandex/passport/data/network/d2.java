package com.yandex.passport.data.network;

import defpackage.b64;

/* loaded from: classes8.dex */
public final class d2 {
    public final com.yandex.passport.data.models.g a;
    public final String b;

    public d2(com.yandex.passport.data.models.g gVar, String str) {
        this.a = gVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return this.a.equals(d2Var.a) && this.b.equals(d2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", deviceId=");
        return b64.p(sb, this.b, ')');
    }
}
