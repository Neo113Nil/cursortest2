package com.yandex.passport.api;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class v2 implements b3 {
    public final String a;
    public final String b;

    public v2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return jl40.l(this.a, v2Var.a) && jl40.l(this.b, v2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Command(requestId=");
        sb.append(this.a);
        sb.append(", command=");
        return b64.p(sb, this.b, ')');
    }
}
