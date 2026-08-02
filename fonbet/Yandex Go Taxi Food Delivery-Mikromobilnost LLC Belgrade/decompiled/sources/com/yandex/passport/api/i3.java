package com.yandex.passport.api;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class i3 implements j3 {
    public final String a;
    public final String b;

    public i3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return jl40.l(this.a, i3Var.a) && jl40.l(this.b, i3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessUrl(url=");
        sb.append(this.a);
        sb.append(", purpose=");
        return b64.p(sb, this.b, ')');
    }
}
