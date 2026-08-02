package com.yandex.passport.api;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class h3 implements j3 {
    public final String a;
    public final String b;

    public h3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj;
        return jl40.l(this.a, h3Var.a) && jl40.l(this.b, h3Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessItem(item=");
        sb.append(this.a);
        sb.append(", params=");
        return b64.p(sb, this.b, ')');
    }
}
