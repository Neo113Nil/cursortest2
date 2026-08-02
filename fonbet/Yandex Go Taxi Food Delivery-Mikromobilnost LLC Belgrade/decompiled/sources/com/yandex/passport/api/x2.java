package com.yandex.passport.api;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class x2 implements b3 {
    public final String a;
    public final String b;

    public x2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return jl40.l(this.a, x2Var.a) && jl40.l(this.b, x2Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinishWithItem(item=");
        sb.append(this.a);
        sb.append(", params=");
        return b64.p(sb, this.b, ')');
    }
}
